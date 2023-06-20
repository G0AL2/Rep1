package com.bytedance.sdk.openadsdk.core;

import android.webkit.WebView;

/* compiled from: SSWebSettings.java */
/* loaded from: classes.dex */
public class q {
    public static void a(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.l.b(th.toString());
        }
    }
}
