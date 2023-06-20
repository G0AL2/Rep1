package com.unity3d.services.core.configuration;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.api.DownloadLatestWebViewStatus;
import com.unity3d.services.core.api.Lifecycle;
import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.connectivity.IConnectivityListener;
import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.WebRequest;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.TSIMetric;
import com.unity3d.services.core.webview.WebViewApp;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class InitializeThread extends Thread {
    private static InitializeThread _thread;
    private InitializeState _state;
    private boolean _stopThread = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static abstract class InitializeState {
        private InitializeState() {
        }

        public abstract InitializeState execute();
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateCheckForCachedWebViewUpdate extends InitializeState {
        private Configuration _configuration;

        public InitializeStateCheckForCachedWebViewUpdate(Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            try {
                byte[] loadCachedFileToByteArray = InitializeThread.loadCachedFileToByteArray(new File(SdkProperties.getLocalWebViewFile()));
                if (Utilities.Sha256(loadCachedFileToByteArray).equals(this._configuration.getWebViewHash())) {
                    return new InitializeStateUpdateCache(this._configuration, new String(loadCachedFileToByteArray, "UTF-8"));
                }
            } catch (Exception unused) {
            }
            return new InitializeStateDownloadWebView(this._configuration);
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateCheckForUpdatedWebView extends InitializeState {
        private Configuration _configuration;
        private Configuration _localWebViewConfiguration;
        private byte[] _localWebViewData;

        public InitializeStateCheckForUpdatedWebView(Configuration configuration, byte[] bArr, Configuration configuration2) {
            super();
            this._configuration = configuration;
            this._localWebViewData = bArr;
            this._localWebViewConfiguration = configuration2;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            try {
                String Sha256 = Utilities.Sha256(this._localWebViewData);
                if (!Sha256.equals(this._configuration.getWebViewHash())) {
                    SdkProperties.setLatestConfiguration(this._configuration);
                }
                if (!TextUtils.isEmpty(Sha256)) {
                    Configuration configuration = this._localWebViewConfiguration;
                    if (configuration != null && configuration.getWebViewHash() != null && this._localWebViewConfiguration.getWebViewHash().equals(Sha256) && SdkProperties.getVersionName().equals(this._localWebViewConfiguration.getSdkVersion())) {
                        return new InitializeStateCreate(this._localWebViewConfiguration, new String(this._localWebViewData, "UTF-8"));
                    }
                    Configuration configuration2 = this._configuration;
                    if (configuration2 != null && configuration2.getWebViewHash().equals(Sha256)) {
                        return new InitializeStateCreate(this._configuration, new String(this._localWebViewData, "UTF-8"));
                    }
                }
            } catch (Exception unused) {
            }
            return new InitializeStateCleanCache(this._configuration, new InitializeStateLoadWeb(this._configuration));
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateCleanCache extends InitializeState {
        private Configuration _configuration;
        private InitializeState _nextState;

        public InitializeStateCleanCache(Configuration configuration, InitializeState initializeState) {
            super();
            this._configuration = configuration;
            this._nextState = initializeState;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            try {
                File file = new File(SdkProperties.getLocalConfigurationFilepath());
                File file2 = new File(SdkProperties.getLocalWebViewFile());
                file.delete();
                file2.delete();
            } catch (Exception e10) {
                DeviceLog.error("Failure trying to clean cache: " + e10.getMessage());
            }
            return this._nextState;
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateCleanCacheIgnoreError extends InitializeStateCleanCache {
        public InitializeStateCleanCacheIgnoreError(Configuration configuration, InitializeState initializeState) {
            super(configuration, initializeState);
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeStateCleanCache, com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            try {
                InitializeState execute = super.execute();
                if (execute instanceof InitializeStateError) {
                    return null;
                }
                return execute;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateComplete extends InitializeState {
        private Configuration _configuration;

        public InitializeStateComplete(Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            for (String str : this._configuration.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration = this._configuration.getModuleConfiguration(str);
                if (moduleConfiguration != null) {
                    moduleConfiguration.initCompleteState(this._configuration);
                }
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateConfig extends InitializeState {
        private Configuration _configuration;
        private Configuration _localConfig;
        private int _maxRetries;
        private InitializeState _nextState;
        private int _retries;
        private long _retryDelay;
        private double _scalingFactor;

        public InitializeStateConfig(Configuration configuration) {
            super();
            this._configuration = new Configuration(SdkProperties.getConfigUrl(), configuration.getExperiments());
            this._retries = 0;
            this._retryDelay = configuration.getRetryDelay();
            this._maxRetries = configuration.getMaxRetries();
            this._scalingFactor = configuration.getRetryScalingFactor();
            this._localConfig = configuration;
            this._nextState = null;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            DeviceLog.info("Unity Ads init: load configuration from " + SdkProperties.getConfigUrl());
            if (this._configuration.getExperiments() != null && this._configuration.getExperiments().isTwoStageInitializationEnabled()) {
                return executeWithLoader();
            }
            return executeLegacy(this._configuration);
        }

        public InitializeState executeLegacy(Configuration configuration) {
            try {
                configuration.makeRequest();
                if (configuration.getDelayWebViewUpdate()) {
                    return new InitializeStateLoadCacheConfigAndWebView(configuration, this._localConfig);
                }
                return new InitializeStateLoadCache(configuration);
            } catch (Exception e10) {
                if (this._retries < this._maxRetries) {
                    long j10 = (long) (this._retryDelay * this._scalingFactor);
                    this._retryDelay = j10;
                    this._retries++;
                    return new InitializeStateRetry(this, j10);
                }
                return new InitializeStateNetworkError("network config request", e10, this, this._localConfig);
            }
        }

        public InitializeState executeWithLoader() {
            ConfigurationLoader configurationLoader = new ConfigurationLoader(this._configuration);
            final Configuration configuration = new Configuration(SdkProperties.getConfigUrl(), new Experiments());
            try {
                configurationLoader.loadConfiguration(new IConfigurationLoaderListener() { // from class: com.unity3d.services.core.configuration.InitializeThread.InitializeStateConfig.1
                    @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                    public void onError(String str) {
                        SDKMetrics.getInstance().sendMetric(TSIMetric.newEmergencySwitchOff(InitializeStateConfig.this._configuration.getMetricTags()));
                        InitializeStateConfig initializeStateConfig = InitializeStateConfig.this;
                        initializeStateConfig._nextState = initializeStateConfig.executeLegacy(configuration);
                    }

                    @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                    public void onSuccess(Configuration configuration2) {
                        InitializeStateConfig.this._configuration = configuration2;
                        if (InitializeStateConfig.this._configuration.getDelayWebViewUpdate()) {
                            InitializeStateConfig initializeStateConfig = InitializeStateConfig.this;
                            initializeStateConfig._nextState = new InitializeStateLoadCacheConfigAndWebView(initializeStateConfig._configuration, InitializeStateConfig.this._localConfig);
                        }
                        TokenStorage.setInitToken(InitializeStateConfig.this._configuration.getUnifiedAuctionToken());
                        InitializeStateConfig.this._configuration.saveToDisk();
                        InitializeStateConfig initializeStateConfig2 = InitializeStateConfig.this;
                        initializeStateConfig2._nextState = new InitializeStateLoadCache(initializeStateConfig2._configuration);
                    }
                });
                return this._nextState;
            } catch (Exception e10) {
                int i10 = this._retries;
                if (i10 < this._maxRetries) {
                    long j10 = (long) (this._retryDelay * this._scalingFactor);
                    this._retryDelay = j10;
                    this._retries = i10 + 1;
                    return new InitializeStateRetry(this, j10);
                }
                return new InitializeStateNetworkError("network config request", e10, this, this._configuration);
            }
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateCreate extends InitializeState {
        public static final String InitializeStateCreateStateName = "create webapp";
        private Configuration _configuration;
        private String _webViewData;

        public InitializeStateCreate(Configuration configuration, String str) {
            super();
            this._configuration = configuration;
            this._webViewData = str;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            DeviceLog.debug("Unity Ads init: creating webapp");
            Configuration configuration = this._configuration;
            configuration.setWebViewData(this._webViewData);
            try {
                if (WebViewApp.create(configuration)) {
                    return new InitializeStateComplete(this._configuration);
                }
                String webAppFailureMessage = WebViewApp.getCurrentApp().getWebAppFailureMessage() != null ? WebViewApp.getCurrentApp().getWebAppFailureMessage() : "Unity Ads WebApp creation failed";
                DeviceLog.error(webAppFailureMessage);
                return new InitializeStateError(InitializeStateCreateStateName, new Exception(webAppFailureMessage), this._configuration);
            } catch (IllegalThreadStateException e10) {
                DeviceLog.exception("Illegal Thread", e10);
                return new InitializeStateError(InitializeStateCreateStateName, e10, this._configuration);
            }
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }

        public String getWebData() {
            return this._webViewData;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateDownloadWebView extends InitializeState {
        private Configuration _configuration;
        private int _retries;
        private long _retryDelay;

        public InitializeStateDownloadWebView(Configuration configuration) {
            super();
            this._configuration = configuration;
            this._retries = 0;
            this._retryDelay = configuration.getRetryDelay();
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            DeviceLog.info("Unity Ads init: downloading webapp from " + this._configuration.getWebViewUrl());
            try {
                try {
                    String makeRequest = new WebRequest(this._configuration.getWebViewUrl(), "GET", null).makeRequest();
                    String webViewHash = this._configuration.getWebViewHash();
                    if (makeRequest == null || webViewHash == null || !Utilities.Sha256(makeRequest).equals(webViewHash)) {
                        return null;
                    }
                    return new InitializeStateUpdateCache(this._configuration, makeRequest);
                } catch (Exception unused) {
                    if (this._retries < this._configuration.getMaxRetries()) {
                        long retryScalingFactor = (long) (this._retryDelay * this._configuration.getRetryScalingFactor());
                        this._retryDelay = retryScalingFactor;
                        this._retries++;
                        return new InitializeStateRetry(this, retryScalingFactor);
                    }
                    return null;
                }
            } catch (Exception e10) {
                DeviceLog.exception("Malformed URL", e10);
                return null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateError extends InitializeState {
        protected Configuration _configuration;
        Exception _exception;
        String _state;

        public InitializeStateError(String str, Exception exc, Configuration configuration) {
            super();
            this._state = str;
            this._exception = exc;
            this._configuration = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            DeviceLog.error("Unity Ads init: halting init in " + this._state + ": " + this._exception.getMessage());
            for (String str : this._configuration.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration = this._configuration.getModuleConfiguration(str);
                if (moduleConfiguration != null) {
                    moduleConfiguration.initErrorState(this._configuration, this._state, this._exception.getMessage());
                }
            }
            SDKMetrics.getInstance().sendEvent("native_initialization_failed", new HashMap<String, String>() { // from class: com.unity3d.services.core.configuration.InitializeThread.InitializeStateError.1
                {
                    put("stt", InitializeStateError.this._state.replaceAll(" ", "_"));
                }
            });
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateForceReset extends InitializeStateReset {
        public InitializeStateForceReset() {
            super(new Configuration());
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeStateReset, com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            SdkProperties.setInitializeState(SdkProperties.InitializationState.NOT_INITIALIZED);
            super.execute();
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateInitModules extends InitializeState {
        public static final String InitializeStateInitModuleStateName = "init modules";
        private Configuration _configuration;

        public InitializeStateInitModules(Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            for (String str : this._configuration.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration = this._configuration.getModuleConfiguration(str);
                if (moduleConfiguration != null && !moduleConfiguration.initModuleState(this._configuration)) {
                    return new InitializeStateError(InitializeStateInitModuleStateName, new Exception("Unity Ads config server resolves to loopback address (due to ad blocker?)"), this._configuration);
                }
            }
            return new InitializeStateConfig(this._configuration);
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateLoadCache extends InitializeState {
        private Configuration _configuration;

        public InitializeStateLoadCache(Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            DeviceLog.debug("Unity Ads init: check if webapp can be loaded from local cache");
            try {
                byte[] readFileBytes = Utilities.readFileBytes(new File(SdkProperties.getLocalWebViewFile()));
                String Sha256 = Utilities.Sha256(readFileBytes);
                if (Sha256 != null && Sha256.equals(this._configuration.getWebViewHash())) {
                    try {
                        String str = new String(readFileBytes, "UTF-8");
                        DeviceLog.info("Unity Ads init: webapp loaded from local cache");
                        return new InitializeStateCreate(this._configuration, str);
                    } catch (Exception e10) {
                        return new InitializeStateError("load cache", e10, this._configuration);
                    }
                }
                return new InitializeStateLoadWeb(this._configuration);
            } catch (Exception e11) {
                DeviceLog.debug("Unity Ads init: webapp not found in local cache: " + e11.getMessage());
                return new InitializeStateLoadWeb(this._configuration);
            }
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateLoadCacheConfigAndWebView extends InitializeState {
        private Configuration _configuration;
        private Configuration _localConfig;

        public InitializeStateLoadCacheConfigAndWebView(Configuration configuration, Configuration configuration2) {
            super();
            this._configuration = configuration;
            this._localConfig = configuration2;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            try {
                return new InitializeStateCheckForUpdatedWebView(this._configuration, InitializeThread.loadCachedFileToByteArray(new File(SdkProperties.getLocalWebViewFile())), this._localConfig);
            } catch (Exception unused) {
                return new InitializeStateCleanCache(this._configuration, new InitializeStateLoadWeb(this._configuration));
            }
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateLoadConfigFile extends InitializeState {
        private Configuration _configuration;

        public InitializeStateLoadConfigFile(Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            DeviceLog.debug("Unity Ads init: Loading Config File Parameters");
            File file = new File(SdkProperties.getLocalConfigurationFilepath());
            try {
                if (!file.exists()) {
                    return new InitializeStateReset(this._configuration);
                }
                try {
                    Configuration configuration = new Configuration(new JSONObject(new String(Utilities.readFileBytes(file))));
                    this._configuration = configuration;
                    return new InitializeStateReset(configuration);
                } catch (Exception unused) {
                    DeviceLog.debug("Unity Ads init: Using default configuration parameters");
                    return new InitializeStateReset(this._configuration);
                }
            } catch (Throwable unused2) {
                return new InitializeStateReset(this._configuration);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateLoadWeb extends InitializeState {
        private Configuration _configuration;
        private int _maxRetries;
        private int _retries;
        private long _retryDelay;
        private double _scalingFactor;

        public InitializeStateLoadWeb(Configuration configuration) {
            super();
            this._configuration = configuration;
            this._retries = 0;
            this._retryDelay = configuration.getRetryDelay();
            this._maxRetries = configuration.getMaxRetries();
            this._scalingFactor = configuration.getRetryScalingFactor();
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            DeviceLog.info("Unity Ads init: loading webapp from " + this._configuration.getWebViewUrl());
            try {
                try {
                    String makeRequest = new WebRequest(this._configuration.getWebViewUrl(), "GET", null).makeRequest();
                    String webViewHash = this._configuration.getWebViewHash();
                    if (webViewHash != null && !Utilities.Sha256(makeRequest).equals(webViewHash)) {
                        return new InitializeStateError("invalid hash", new Exception("Invalid webViewHash"), this._configuration);
                    }
                    if (webViewHash != null) {
                        Utilities.writeFile(new File(SdkProperties.getLocalWebViewFile()), makeRequest);
                    }
                    return new InitializeStateCreate(this._configuration, makeRequest);
                } catch (Exception e10) {
                    if (this._retries < this._maxRetries) {
                        long j10 = (long) (this._retryDelay * this._scalingFactor);
                        this._retryDelay = j10;
                        this._retries++;
                        return new InitializeStateRetry(this, j10);
                    }
                    return new InitializeStateNetworkError("network webview request", e10, this, this._configuration);
                }
            } catch (MalformedURLException e11) {
                DeviceLog.exception("Malformed URL", e11);
                return new InitializeStateError("malformed webview request", e11, this._configuration);
            }
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateNetworkError extends InitializeStateError implements IConnectivityListener {
        private static long _lastConnectedEventTimeMs;
        private static int _receivedConnectedEvents;
        private ConditionVariable _conditionVariable;
        private int _connectedEventThreshold;
        private InitializeState _erroredState;
        private int _maximumConnectedEvents;
        private long _networkErrorTimeout;
        private String _state;

        public InitializeStateNetworkError(String str, Exception exc, InitializeState initializeState, Configuration configuration) {
            super(str, exc, configuration);
            this._state = str;
            _receivedConnectedEvents = 0;
            _lastConnectedEventTimeMs = 0L;
            this._erroredState = initializeState;
            this._networkErrorTimeout = configuration.getNetworkErrorTimeout();
            this._maximumConnectedEvents = configuration.getMaximumConnectedEvents();
            this._connectedEventThreshold = configuration.getConnectedEventThreshold();
        }

        private boolean shouldHandleConnectedEvent() {
            return System.currentTimeMillis() - _lastConnectedEventTimeMs >= ((long) this._connectedEventThreshold) && _receivedConnectedEvents <= this._maximumConnectedEvents;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeStateError, com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            DeviceLog.error("Unity Ads init: network error, waiting for connection events");
            this._conditionVariable = new ConditionVariable();
            ConnectivityMonitor.addListener(this);
            if (this._conditionVariable.block(this._networkErrorTimeout)) {
                ConnectivityMonitor.removeListener(this);
                return this._erroredState;
            }
            ConnectivityMonitor.removeListener(this);
            return new InitializeStateError(this._state, new Exception("No connected events within the timeout!"), this._configuration);
        }

        @Override // com.unity3d.services.core.connectivity.IConnectivityListener
        public void onConnected() {
            _receivedConnectedEvents++;
            DeviceLog.debug("Unity Ads init got connected event");
            if (shouldHandleConnectedEvent()) {
                this._conditionVariable.open();
            }
            if (_receivedConnectedEvents > this._maximumConnectedEvents) {
                ConnectivityMonitor.removeListener(this);
            }
            _lastConnectedEventTimeMs = System.currentTimeMillis();
        }

        @Override // com.unity3d.services.core.connectivity.IConnectivityListener
        public void onDisconnected() {
            DeviceLog.debug("Unity Ads init got disconnected event");
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateReset extends InitializeState {
        private Configuration _configuration;
        private int _resetWebAppTimeout;

        public InitializeStateReset(Configuration configuration) {
            super();
            this._configuration = configuration;
            this._resetWebAppTimeout = configuration.getResetWebappTimeout();
        }

        @TargetApi(14)
        private void unregisterLifecycleCallbacks() {
            if (Lifecycle.getLifecycleListener() != null) {
                if (ClientProperties.getApplication() != null) {
                    ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(Lifecycle.getLifecycleListener());
                }
                Lifecycle.setLifecycleListener(null);
            }
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            boolean z10;
            DeviceLog.debug("Unity Ads init: starting init");
            final ConditionVariable conditionVariable = new ConditionVariable();
            final WebViewApp currentApp = WebViewApp.getCurrentApp();
            if (currentApp != null) {
                currentApp.resetWebViewAppInitialization();
                if (currentApp.getWebView() != null) {
                    Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.configuration.InitializeThread.InitializeStateReset.1
                        @Override // java.lang.Runnable
                        public void run() {
                            currentApp.getWebView().destroy();
                            currentApp.setWebView(null);
                            conditionVariable.open();
                        }
                    });
                    z10 = conditionVariable.block(this._resetWebAppTimeout);
                } else {
                    z10 = true;
                }
                if (!z10) {
                    return new InitializeStateError("reset webapp", new Exception("Reset failed on opening ConditionVariable"), this._configuration);
                }
            }
            if (Build.VERSION.SDK_INT > 13) {
                unregisterLifecycleCallbacks();
            }
            SdkProperties.setCacheDirectory(null);
            if (SdkProperties.getCacheDirectory() == null) {
                return new InitializeStateError("reset webapp", new Exception("Cache directory is NULL"), this._configuration);
            }
            SdkProperties.setInitialized(false);
            for (String str : this._configuration.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration = this._configuration.getModuleConfiguration(str);
                if (moduleConfiguration != null) {
                    moduleConfiguration.resetState(this._configuration);
                }
            }
            return new InitializeStateInitModules(this._configuration);
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateRetry extends InitializeState {
        long _delay;
        InitializeState _state;

        public InitializeStateRetry(InitializeState initializeState, long j10) {
            super();
            this._state = initializeState;
            this._delay = j10;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            DeviceLog.debug("Unity Ads init: retrying in " + this._delay + " milliseconds");
            try {
                Thread.sleep(this._delay);
            } catch (Exception e10) {
                DeviceLog.exception("Init retry interrupted", e10);
            }
            return this._state;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateUpdateCache extends InitializeState {
        private Configuration _configuration;
        private String _webViewData;

        public InitializeStateUpdateCache(Configuration configuration, String str) {
            super();
            this._configuration = configuration;
            this._webViewData = str;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            if (this._configuration != null && this._webViewData != null) {
                try {
                    Utilities.writeFile(new File(SdkProperties.getLocalWebViewFile()), this._webViewData);
                    Utilities.writeFile(new File(SdkProperties.getLocalConfigurationFilepath()), this._configuration.getJSONString());
                } catch (Exception unused) {
                    return new InitializeStateCleanCacheIgnoreError(this._configuration, null);
                }
            }
            return null;
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    private InitializeThread(InitializeState initializeState) {
        this._state = initializeState;
    }

    public static synchronized DownloadLatestWebViewStatus downloadLatestWebView() {
        synchronized (InitializeThread.class) {
            if (_thread != null) {
                return DownloadLatestWebViewStatus.INIT_QUEUE_NOT_EMPTY;
            } else if (SdkProperties.getLatestConfiguration() == null) {
                return DownloadLatestWebViewStatus.MISSING_LATEST_CONFIG;
            } else {
                InitializeThread initializeThread = new InitializeThread(new InitializeStateCheckForCachedWebViewUpdate(SdkProperties.getLatestConfiguration()));
                _thread = initializeThread;
                initializeThread.setName("UnityAdsDownloadThread");
                _thread.start();
                return DownloadLatestWebViewStatus.BACKGROUND_DOWNLOAD_STARTED;
            }
        }
    }

    public static synchronized void initialize(Configuration configuration) {
        synchronized (InitializeThread.class) {
            if (_thread == null) {
                InitializeEventsMetricSender.getInstance().didInitStart();
                CachedLifecycle.register();
                InitializeThread initializeThread = new InitializeThread(new InitializeStateLoadConfigFile(configuration));
                _thread = initializeThread;
                initializeThread.setName("UnityAdsInitializeThread");
                _thread.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] loadCachedFileToByteArray(File file) throws IOException {
        if (file != null && file.exists()) {
            try {
                return Utilities.readFileBytes(file);
            } catch (IOException unused) {
                throw new IOException("could not read from file");
            }
        }
        throw new IOException("file not found");
    }

    public static synchronized void reset() {
        synchronized (InitializeThread.class) {
            if (_thread == null) {
                InitializeThread initializeThread = new InitializeThread(new InitializeStateForceReset());
                _thread = initializeThread;
                initializeThread.setName("UnityAdsResetThread");
                _thread.start();
            }
        }
    }

    public void quit() {
        this._stopThread = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            try {
                InitializeState initializeState = this._state;
                if (initializeState == null || this._stopThread) {
                    break;
                }
                try {
                    this._state = initializeState.execute();
                } catch (Exception e10) {
                    DeviceLog.exception("Unity Ads SDK encountered an error during initialization, cancel initialization", e10);
                    Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.configuration.InitializeThread.1
                        @Override // java.lang.Runnable
                        public void run() {
                            SdkProperties.notifyInitializationFailed(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK encountered an error during initialization, cancel initialization");
                        }
                    });
                    this._state = new InitializeStateForceReset();
                } catch (OutOfMemoryError e11) {
                    DeviceLog.exception("Unity Ads SDK failed to initialize due to application doesn't have enough memory to initialize Unity Ads SDK", new Exception(e11));
                    Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.configuration.InitializeThread.2
                        @Override // java.lang.Runnable
                        public void run() {
                            SdkProperties.notifyInitializationFailed(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to application doesn't have enough memory to initialize Unity Ads SDK");
                        }
                    });
                    this._state = new InitializeStateForceReset();
                }
            } catch (OutOfMemoryError unused) {
            }
        }
        _thread = null;
    }
}
