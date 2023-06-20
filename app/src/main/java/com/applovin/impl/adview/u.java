package com.applovin.impl.adview;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class u extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.v f7122a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<a> f7123b;

    /* loaded from: classes.dex */
    public interface a {
        void a(t tVar);

        void b(t tVar);

        void c(t tVar);
    }

    public u(com.applovin.impl.sdk.m mVar) {
        this.f7122a = mVar.A();
    }

    private void a(WebView webView, String str) {
        if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v vVar = this.f7122a;
            vVar.c("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        }
        if (str == null || !(webView instanceof t)) {
            return;
        }
        t tVar = (t) webView;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String path = parse.getPath();
        a aVar = this.f7123b.get();
        if ("applovin".equalsIgnoreCase(scheme) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(host) && aVar != null) {
            if ("/track_click".equals(path)) {
                aVar.a(tVar);
            } else if ("/close_ad".equals(path)) {
                aVar.b(tVar);
            } else if ("/skip_ad".equals(path)) {
                aVar.c(tVar);
            } else if (com.applovin.impl.sdk.v.a()) {
                com.applovin.impl.sdk.v vVar2 = this.f7122a;
                vVar2.d("WebViewButtonClient", "Unknown URL: " + str);
                com.applovin.impl.sdk.v vVar3 = this.f7122a;
                vVar3.d("WebViewButtonClient", "Path: " + path);
            }
        }
    }

    public void a(WeakReference<a> weakReference) {
        this.f7123b = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a(webView, str);
        return true;
    }
}
