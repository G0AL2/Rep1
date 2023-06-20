package com.unity3d.services.ads.token;

import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.device.TokenType;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class TokenStorage {
    private static int _accessCounter = 0;
    private static String _initToken = null;
    private static final Object _lock = new Object();
    private static boolean _peekMode = false;
    private static ConcurrentLinkedQueue<String> _queue;

    public static void appendTokens(JSONArray jSONArray) throws JSONException {
        boolean z10;
        synchronized (_lock) {
            if (_queue == null) {
                _queue = new ConcurrentLinkedQueue<>();
                _accessCounter = 0;
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                _queue.add(jSONArray.getString(i10));
            }
            z10 = _queue.isEmpty() ? false : true;
        }
        if (z10) {
            triggerTokenAvailable(Boolean.FALSE);
            AsyncTokenStorage.getInstance().onTokenAvailable(TokenType.TOKEN_REMOTE);
        }
    }

    public static void createTokens(JSONArray jSONArray) throws JSONException {
        boolean z10;
        synchronized (_lock) {
            _queue = new ConcurrentLinkedQueue<>();
            _accessCounter = 0;
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                _queue.add(jSONArray.getString(i10));
            }
            z10 = _queue.isEmpty() ? false : true;
        }
        if (z10) {
            triggerTokenAvailable(Boolean.FALSE);
            AsyncTokenStorage.getInstance().onTokenAvailable(TokenType.TOKEN_REMOTE);
        }
    }

    public static void deleteTokens() {
        synchronized (_lock) {
            _queue = null;
            _accessCounter = 0;
        }
    }

    public static String getToken() {
        synchronized (_lock) {
            ConcurrentLinkedQueue<String> concurrentLinkedQueue = _queue;
            if (concurrentLinkedQueue == null) {
                return _initToken;
            } else if (concurrentLinkedQueue.isEmpty()) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.QUEUE_EMPTY, new Object[0]);
                return null;
            } else if (_peekMode) {
                WebViewApp currentApp = WebViewApp.getCurrentApp();
                WebViewEventCategory webViewEventCategory = WebViewEventCategory.TOKEN;
                TokenEvent tokenEvent = TokenEvent.TOKEN_ACCESS;
                int i10 = _accessCounter;
                _accessCounter = i10 + 1;
                currentApp.sendEvent(webViewEventCategory, tokenEvent, Integer.valueOf(i10));
                return _queue.peek();
            } else {
                WebViewApp currentApp2 = WebViewApp.getCurrentApp();
                WebViewEventCategory webViewEventCategory2 = WebViewEventCategory.TOKEN;
                TokenEvent tokenEvent2 = TokenEvent.TOKEN_ACCESS;
                int i11 = _accessCounter;
                _accessCounter = i11 + 1;
                currentApp2.sendEvent(webViewEventCategory2, tokenEvent2, Integer.valueOf(i11));
                return _queue.poll();
            }
        }
    }

    public static void setInitToken(String str) {
        boolean z10;
        synchronized (_lock) {
            _initToken = str;
            z10 = str != null;
        }
        if (z10) {
            AsyncTokenStorage.getInstance().onTokenAvailable(TokenType.TOKEN_REMOTE);
            triggerTokenAvailable(Boolean.TRUE);
        }
    }

    public static void setPeekMode(boolean z10) {
        synchronized (_lock) {
            _peekMode = z10;
        }
    }

    private static void triggerTokenAvailable(Boolean bool) {
        InitializeEventsMetricSender.getInstance().sdkTokenDidBecomeAvailableWithConfig(bool.booleanValue());
    }
}
