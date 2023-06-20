package com.bytedance.sdk.openadsdk.j;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* compiled from: PlayableWebSettings.java */
/* loaded from: classes.dex */
public class h {
    private static void a(WebSettings webSettings) {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                webSettings.setMediaPlaybackRequiresUserGesture(false);
            }
        } catch (Throwable th) {
            f.a("WebViewSettings", "allowMediaPlayWithoutUserGesture error", th);
        }
    }

    private static void b(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            f.a("WebViewSettings", "removeJavascriptInterfacesSafe error", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.webkit.WebView r7) {
        /*
            java.lang.String r0 = "WebViewSettings"
            b(r7)
            android.webkit.WebSettings r1 = r7.getSettings()
            a(r1)
            if (r1 != 0) goto Lf
            return
        Lf:
            r2 = 1
            r1.setJavaScriptEnabled(r2)     // Catch: java.lang.Throwable -> L14
            goto L1a
        L14:
            r3 = move-exception
            java.lang.String r4 = "setJavaScriptEnabled error"
            com.bytedance.sdk.openadsdk.j.f.a(r0, r4, r3)
        L1a:
            r3 = 0
            r1.setSupportZoom(r3)     // Catch: java.lang.Throwable -> L1f
            goto L25
        L1f:
            r4 = move-exception
            java.lang.String r5 = "setSupportZoom error"
            com.bytedance.sdk.openadsdk.j.f.a(r0, r5, r4)
        L25:
            r1.setLoadWithOverviewMode(r2)
            r1.setUseWideViewPort(r2)
            r1.setDomStorageEnabled(r2)
            r1.setAllowFileAccess(r3)
            r1.setBlockNetworkImage(r3)
            r1.setDisplayZoomControls(r3)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 16
            if (r4 < r5) goto L43
            r1.setAllowFileAccessFromFileURLs(r3)
            r1.setAllowUniversalAccessFromFileURLs(r3)
        L43:
            r1.setSavePassword(r3)
            r1 = 28
            if (r4 < r1) goto L4b
            goto L4c
        L4b:
            r2 = 0
        L4c:
            r1 = 11
            r6 = 0
            if (r4 < r1) goto L59
            if (r2 != 0) goto L59
            r7.setLayerType(r3, r6)     // Catch: java.lang.Throwable -> L57
            goto L67
        L57:
            r1 = move-exception
            goto L62
        L59:
            if (r4 < r5) goto L67
            if (r2 == 0) goto L67
            r1 = 2
            r7.setLayerType(r1, r6)     // Catch: java.lang.Throwable -> L57
            goto L67
        L62:
            java.lang.String r2 = "setLayerType error"
            com.bytedance.sdk.openadsdk.j.f.a(r0, r2, r1)
        L67:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L74
            android.webkit.WebSettings r7 = r7.getSettings()
            r7.setMixedContentMode(r3)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.j.h.a(android.webkit.WebView):void");
    }
}
