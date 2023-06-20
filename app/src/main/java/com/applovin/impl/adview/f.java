package com.applovin.impl.adview;

import android.annotation.TargetApi;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(29)
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.m f7045a;

    /* renamed from: b  reason: collision with root package name */
    private final WebViewRenderProcessClient f7046b = new WebViewRenderProcessClient() { // from class: com.applovin.impl.adview.f.1
        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof d) {
                com.applovin.impl.sdk.ad.e currentAd = ((d) webView).getCurrentAd();
                f.this.f7045a.ac().a(currentAd).a(com.applovin.impl.sdk.d.b.D).a();
                if (com.applovin.impl.sdk.v.a()) {
                    com.applovin.impl.sdk.v A = f.this.f7045a.A();
                    A.e("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(com.applovin.impl.sdk.m mVar) {
        this.f7045a = mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebViewRenderProcessClient a() {
        return this.f7046b;
    }
}
