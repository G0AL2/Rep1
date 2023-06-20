package com.unity3d.services.core.webview;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class WebView extends android.webkit.WebView {
    private static Method _evaluateJavascript;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class JavaScriptInvocation implements Runnable {
        private String _jsString;
        private android.webkit.WebView _webView;

        public JavaScriptInvocation(String str, android.webkit.WebView webView) {
            this._jsString = null;
            this._webView = null;
            this._jsString = str;
            this._webView = webView;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this._jsString;
            if (str != null) {
                try {
                    if (Build.VERSION.SDK_INT >= 19) {
                        WebView._evaluateJavascript.invoke(this._webView, this._jsString, null);
                    } else {
                        WebView.this.loadUrl(str);
                    }
                    return;
                } catch (Exception e10) {
                    DeviceLog.exception("Error while processing JavaScriptString", e10);
                    return;
                }
            }
            DeviceLog.error("Could not process JavaScript, the string is NULL");
        }
    }

    public WebView(Context context) {
        super(context);
        WebSettings settings = getSettings();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
        }
        settings.setAllowFileAccess(true);
        if (i10 >= 19) {
            try {
                _evaluateJavascript = android.webkit.WebView.class.getMethod("evaluateJavascript", String.class, ValueCallback.class);
            } catch (NoSuchMethodException e10) {
                DeviceLog.exception("Method evaluateJavascript not found", e10);
                _evaluateJavascript = null;
            }
        }
        settings.setAppCacheEnabled(false);
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 11) {
            settings.setDisplayZoomControls(false);
        }
        settings.setDomStorageEnabled(false);
        if (i11 >= 11) {
            settings.setEnableSmoothTransition(false);
        }
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        settings.setLightTouchEnabled(false);
        settings.setLoadWithOverviewMode(false);
        settings.setLoadsImagesAutomatically(true);
        if (i11 >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        if (i11 >= 21) {
            settings.setMixedContentMode(1);
        }
        settings.setNeedInitialFocus(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        ViewUtilities.setBackground(this, new ColorDrawable(0));
        setBackgroundResource(0);
        addJavascriptInterface(new WebViewBridgeInterface(), "webviewbridge");
    }

    public void invokeJavascript(String str) {
        Utilities.runOnUiThread(new JavaScriptInvocation(str, this));
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        DeviceLog.debug("Loading url: " + str);
        super.loadUrl(str);
    }
}
