package com.unity3d.services.ads.token;

import android.os.Handler;
import android.os.Looper;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.device.TokenType;
import com.unity3d.services.core.device.reader.DeviceInfoReaderBuilder;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.InitializationStatusReader;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.TSIMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class AsyncTokenStorage {
    private static AsyncTokenStorage _instance;
    private final Handler _handler;
    private INativeTokenGenerator _nativeTokenGenerator;
    private final List<TokenListenerState> _tokenListeners = new LinkedList();
    private boolean _tokenAvailable = false;
    private boolean _configurationWasSet = false;
    private Configuration _configuration = new Configuration();
    private final InitializationStatusReader _initStatusReader = new InitializationStatusReader();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.unity3d.services.ads.token.AsyncTokenStorage$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$device$TokenType;

        static {
            int[] iArr = new int[TokenType.values().length];
            $SwitchMap$com$unity3d$services$core$device$TokenType = iArr;
            try {
                iArr[TokenType.TOKEN_NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$device$TokenType[TokenType.TOKEN_REMOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class TokenListenerState {
        public boolean invoked;
        public IUnityAdsTokenListener listener;
        public Runnable runnable;

        TokenListenerState() {
        }
    }

    public AsyncTokenStorage(INativeTokenGenerator iNativeTokenGenerator, Handler handler) {
        this._handler = handler;
        this._nativeTokenGenerator = iNativeTokenGenerator;
    }

    private synchronized TokenListenerState addTimeoutHandler(IUnityAdsTokenListener iUnityAdsTokenListener) {
        final TokenListenerState tokenListenerState;
        tokenListenerState = new TokenListenerState();
        tokenListenerState.listener = iUnityAdsTokenListener;
        tokenListenerState.runnable = new Runnable() { // from class: com.unity3d.services.ads.token.AsyncTokenStorage.1
            @Override // java.lang.Runnable
            public void run() {
                AsyncTokenStorage.this.notifyTokenReady(tokenListenerState, null, TokenType.TOKEN_NATIVE);
            }
        };
        this._tokenListeners.add(tokenListenerState);
        this._handler.postDelayed(tokenListenerState.runnable, this._configuration.getTokenTimeout());
        return tokenListenerState;
    }

    public static AsyncTokenStorage getInstance() {
        if (_instance == null) {
            _instance = new AsyncTokenStorage(null, new Handler(Looper.getMainLooper()));
        }
        return _instance;
    }

    private Map<String, String> getMetricTags() {
        Map<String, String> metricTags = this._configuration.getMetricTags();
        metricTags.put("state", this._initStatusReader.getInitializationStateString(SdkProperties.getCurrentInitializationState()));
        return metricTags;
    }

    private void handleTokenInvocation(final TokenListenerState tokenListenerState) {
        if (tokenListenerState.invoked) {
            return;
        }
        tokenListenerState.invoked = true;
        if (!this._tokenAvailable && this._configuration.getExperiments().isNativeTokenEnabled()) {
            this._nativeTokenGenerator.generateToken(new INativeTokenGeneratorListener() { // from class: com.unity3d.services.ads.token.AsyncTokenStorage.2
                @Override // com.unity3d.services.ads.token.INativeTokenGeneratorListener
                public void onReady(final String str) {
                    AsyncTokenStorage.this._handler.post(new Runnable() { // from class: com.unity3d.services.ads.token.AsyncTokenStorage.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            AsyncTokenStorage.this.notifyTokenReady(tokenListenerState, str, TokenType.TOKEN_NATIVE);
                        }
                    });
                }
            });
            return;
        }
        String token = TokenStorage.getToken();
        if (token == null) {
            return;
        }
        notifyTokenReady(tokenListenerState, token, TokenType.TOKEN_REMOTE);
    }

    private boolean isValidConfig(Configuration configuration) {
        return (configuration == null || configuration.getExperiments() == null) ? false : true;
    }

    private synchronized void notifyListenersTokenReady(TokenType tokenType) {
        String token;
        while (!this._tokenListeners.isEmpty() && (token = TokenStorage.getToken()) != null) {
            notifyTokenReady(this._tokenListeners.get(0), token, tokenType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifyTokenReady(TokenListenerState tokenListenerState, String str, TokenType tokenType) {
        if (this._tokenListeners.remove(tokenListenerState)) {
            tokenListenerState.listener.onUnityAdsTokenReady(str);
            try {
                this._handler.removeCallbacks(tokenListenerState.runnable);
            } catch (Exception e10) {
                DeviceLog.exception("Failed to remove callback from a handler", e10);
            }
        }
        sendTokenMetrics(str, tokenType);
    }

    private void sendNativeTokenMetrics(String str) {
        if (str == null) {
            SDKMetrics.getInstance().sendMetric(TSIMetric.newNativeGeneratedTokenNull(getMetricTags()));
        } else {
            SDKMetrics.getInstance().sendMetric(TSIMetric.newNativeGeneratedTokenAvailable(getMetricTags()));
        }
    }

    private void sendRemoteTokenMetrics(String str) {
        if (str == null) {
            SDKMetrics.getInstance().sendMetric(TSIMetric.newAsyncTokenNull(getMetricTags()));
        }
    }

    private void sendTokenMetrics(String str, TokenType tokenType) {
        int i10 = AnonymousClass3.$SwitchMap$com$unity3d$services$core$device$TokenType[tokenType.ordinal()];
        if (i10 == 1) {
            sendNativeTokenMetrics(str);
        } else if (i10 != 2) {
            DeviceLog.error("Unknown token type passed to sendTokenMetrics");
        } else {
            sendRemoteTokenMetrics(str);
        }
    }

    public synchronized void getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        if (SdkProperties.getCurrentInitializationState() == SdkProperties.InitializationState.INITIALIZED_FAILED) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(null);
            sendTokenMetrics(null, TokenType.TOKEN_REMOTE);
        } else if (SdkProperties.getCurrentInitializationState() == SdkProperties.InitializationState.NOT_INITIALIZED) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(null);
            sendTokenMetrics(null, TokenType.TOKEN_REMOTE);
        } else {
            TokenListenerState addTimeoutHandler = addTimeoutHandler(iUnityAdsTokenListener);
            if (this._configurationWasSet) {
                handleTokenInvocation(addTimeoutHandler);
            }
        }
    }

    public synchronized void onTokenAvailable(TokenType tokenType) {
        this._tokenAvailable = true;
        if (this._configurationWasSet) {
            notifyListenersTokenReady(tokenType);
        }
    }

    public synchronized void setConfiguration(Configuration configuration) {
        this._configuration = configuration;
        boolean isValidConfig = isValidConfig(configuration);
        this._configurationWasSet = isValidConfig;
        if (isValidConfig) {
            if (this._nativeTokenGenerator == null) {
                this._nativeTokenGenerator = new NativeTokenGenerator(Executors.newSingleThreadExecutor(), new DeviceInfoReaderBuilder(new ConfigurationReader()).build());
            }
            Iterator it = new ArrayList(this._tokenListeners).iterator();
            while (it.hasNext()) {
                handleTokenInvocation((TokenListenerState) it.next());
            }
        }
    }
}
