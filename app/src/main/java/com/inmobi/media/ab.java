package com.inmobi.media;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* compiled from: EmbeddedBrowserViewClient.java */
/* loaded from: classes3.dex */
public final class ab extends aa {
    private static void a(String str) {
        if (hs.a(Uri.parse(str))) {
            try {
                Thread.sleep(1000L);
            } catch (Exception unused) {
            }
        }
    }

    private static void b(y yVar) {
        ViewParent parent = yVar.getParent();
        if (parent instanceof u) {
            ((u) parent).a();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (Build.VERSION.SDK_INT >= 21) {
            String uri = webResourceRequest.getUrl().toString();
            if (webView != null) {
                return a(webView, uri);
            }
            return false;
        }
        return false;
    }

    private static void a(y yVar) {
        t userLeftApplicationListener;
        ViewParent parent = yVar.getParent();
        if (!(parent instanceof u) || (userLeftApplicationListener = ((u) parent).getUserLeftApplicationListener()) == null) {
            return;
        }
        userLeftApplicationListener.a_();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView == null || str == null) {
            return false;
        }
        return a(webView, str);
    }

    private boolean a(WebView webView, String str) {
        boolean z10 = true;
        if (this.f24447d.get()) {
            return true;
        }
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(parse.getScheme())) {
            return false;
        }
        hk.a();
        if (!hk.a(webView.getContext(), str)) {
            if (hs.a(parse)) {
                return false;
            }
            hl.a();
            if (!hl.a(webView.getContext(), str)) {
                a(str);
                z10 = false;
            }
        }
        if (z10) {
            a((View) webView);
            boolean z11 = webView instanceof y;
            if (z11) {
                a((y) webView);
            }
            if (!hs.a(str)) {
                if (webView.canGoBack()) {
                    webView.goBack();
                } else if (z11) {
                    b((y) webView);
                }
            }
        }
        return z10;
    }
}
