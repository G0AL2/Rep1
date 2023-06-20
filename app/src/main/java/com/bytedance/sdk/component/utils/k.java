package com.bytedance.sdk.component.utils;

import android.annotation.TargetApi;
import android.os.Build;
import android.webkit.WebView;

/* compiled from: LoadUrlUtils.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final a f10457a;

    /* compiled from: LoadUrlUtils.java */
    /* loaded from: classes.dex */
    private static class a {
        private a() {
        }

        public void a(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: LoadUrlUtils.java */
    @TargetApi(19)
    /* loaded from: classes.dex */
    private static class b extends a {
        private b() {
            super();
        }

        @Override // com.bytedance.sdk.component.utils.k.a
        public void a(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            boolean z10 = false;
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    z10 = true;
                } catch (Throwable th) {
                    boolean z11 = th instanceof IllegalStateException;
                }
            }
            if (z10) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f10457a = new b();
        } else {
            f10457a = new a();
        }
    }

    public static void a(WebView webView, String str) {
        f10457a.a(webView, str);
    }
}
