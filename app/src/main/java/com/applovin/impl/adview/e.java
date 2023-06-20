package com.applovin.impl.adview;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinWebViewActivity;

/* loaded from: classes.dex */
public class e extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.m f7040a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.v f7041b;

    /* renamed from: c  reason: collision with root package name */
    private final b f7042c;

    public e(b bVar, com.applovin.impl.sdk.m mVar) {
        this.f7040a = mVar;
        this.f7041b = mVar.A();
        this.f7042c = bVar;
    }

    private void a(PointF pointF) {
        this.f7042c.a(pointF);
    }

    private void a(Uri uri, d dVar) {
        com.applovin.impl.sdk.v vVar;
        String str;
        final String queryParameter = uri.getQueryParameter("n");
        if (StringUtils.isValidString(queryParameter)) {
            String queryParameter2 = uri.getQueryParameter("load_type");
            if ("external".equalsIgnoreCase(queryParameter2)) {
                if (com.applovin.impl.sdk.v.a()) {
                    com.applovin.impl.sdk.v vVar2 = this.f7041b;
                    vVar2.b("AdWebView", "Loading new page externally: " + queryParameter);
                }
                Utils.openUri(dVar.getContext(), Uri.parse(queryParameter), this.f7040a);
                com.applovin.impl.sdk.utils.j.c(this.f7042c.g(), this.f7042c.p(), this.f7042c.r());
                return;
            } else if ("internal".equalsIgnoreCase(queryParameter2)) {
                if (com.applovin.impl.sdk.v.a()) {
                    com.applovin.impl.sdk.v vVar3 = this.f7041b;
                    vVar3.b("AdWebView", "Loading new page in WebView: " + queryParameter);
                }
                dVar.loadUrl(queryParameter);
                String queryParameter3 = uri.getQueryParameter("bg_color");
                if (StringUtils.isValidString(queryParameter3)) {
                    dVar.setBackgroundColor(Color.parseColor(queryParameter3));
                    return;
                }
                return;
            } else if ("in_app".equalsIgnoreCase(queryParameter2)) {
                if (com.applovin.impl.sdk.v.a()) {
                    com.applovin.impl.sdk.v vVar4 = this.f7041b;
                    vVar4.b("AdWebView", "Loading new page in slide-up webview: " + queryParameter);
                }
                this.f7040a.af().a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.adview.e.1
                    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            ((AppLovinWebViewActivity) activity).loadUrl(queryParameter, null);
                            com.applovin.impl.sdk.utils.j.a(e.this.f7042c.g(), e.this.f7042c.p(), e.this.f7042c.r());
                        }
                    }

                    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            com.applovin.impl.sdk.utils.j.b(e.this.f7042c.g(), e.this.f7042c.p(), e.this.f7042c.r());
                            e.this.f7040a.af().b(this);
                        }
                    }
                });
                Intent intent = new Intent(this.f7040a.L(), AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f7040a.z());
                intent.setFlags(268435456);
                this.f7040a.L().startActivity(intent);
                return;
            } else if (!com.applovin.impl.sdk.v.a()) {
                return;
            } else {
                vVar = this.f7041b;
                str = "Could not find load type in original uri";
            }
        } else if (!com.applovin.impl.sdk.v.a()) {
            return;
        } else {
            vVar = this.f7041b;
            str = "Could not find url to load from query in original uri";
        }
        vVar.e("AdWebView", str);
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.e eVar) {
        String queryParameter = uri.getQueryParameter("n");
        if (URLUtil.isValidUrl(queryParameter)) {
            String appendQueryParameter = StringUtils.appendQueryParameter(queryParameter, "clcode", eVar.getClCode());
            this.f7040a.U().a(com.applovin.impl.sdk.network.h.o().c(appendQueryParameter).a(false).c(Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).a());
        } else if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v vVar = this.f7041b;
            vVar.e("AdWebView", "Could not find postback url to fire from query in original uri: " + uri);
        }
    }

    private void a(com.applovin.impl.a.a aVar, d dVar) {
        com.applovin.impl.a.d aM = aVar.aM();
        if (aM != null) {
            com.applovin.impl.a.l.a(aM.c(), this.f7042c.q());
            a(dVar, aM.a());
        }
    }

    private void a(d dVar, Uri uri) {
        com.applovin.impl.sdk.ad.e currentAd = dVar.getCurrentAd();
        AppLovinAdView r10 = this.f7042c.r();
        if (r10 != null && currentAd != null) {
            com.applovin.impl.sdk.d.d statsManagerHelper = dVar.getStatsManagerHelper();
            if (statsManagerHelper != null) {
                statsManagerHelper.b();
            }
            if (currentAd instanceof com.applovin.impl.a.a) {
                ((com.applovin.impl.a.a) currentAd).o().o();
            }
            this.f7042c.a(currentAd, r10, uri, dVar.getAndClearLastClickLocation());
        } else if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v vVar = this.f7041b;
            vVar.e("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void b() {
        this.f7042c.l();
    }

    private void c() {
        this.f7042c.k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b a() {
        return this.f7042c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0252, code lost:
        if (r6.aN() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0152, code lost:
        if (r6.aN() != false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean a(android.webkit.WebView r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.e.a(android.webkit.WebView, java.lang.String, boolean):boolean");
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v vVar = this.f7041b;
            vVar.c("AdWebView", "Loaded resource: " + str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        b bVar = this.f7042c;
        if (bVar != null) {
            bVar.a(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        b bVar = this.f7042c;
        if (bVar != null) {
            com.applovin.impl.sdk.ad.e p10 = bVar.p();
            String str3 = "Received error with error code: " + i10 + " with description \\'" + str + "\\' for URL: " + str2;
            if (p10 != null) {
                this.f7040a.ac().a(p10).a(com.applovin.impl.sdk.d.b.f8298z, str3).a();
            }
            if (com.applovin.impl.sdk.v.a()) {
                this.f7041b.e("AdWebView", str3 + " for ad: " + p10);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        b bVar = this.f7042c;
        if (bVar != null) {
            com.applovin.impl.sdk.ad.e p10 = bVar.p();
            this.f7040a.ac().a(p10).a(com.applovin.impl.sdk.d.b.A).a();
            if (com.applovin.impl.sdk.v.a()) {
                com.applovin.impl.sdk.v vVar = this.f7041b;
                vVar.e("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + p10);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        b bVar = this.f7042c;
        if (bVar != null) {
            com.applovin.impl.sdk.ad.e p10 = bVar.p();
            String str = "Received SSL error: " + sslError;
            this.f7040a.ac().a(p10).a(com.applovin.impl.sdk.d.b.C, str).a();
            if (com.applovin.impl.sdk.v.a()) {
                this.f7041b.e("AdWebView", str + " for ad: " + p10);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (this.f7042c == null) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v.i("AdWebView", "Render process gone for ad: " + this.f7042c.p() + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        }
        com.applovin.impl.sdk.ad.e p10 = this.f7042c.p();
        if (p10 != null) {
            this.f7040a.ac().a(p10).a(com.applovin.impl.sdk.d.b.B).a();
        }
        if (((Boolean) this.f7040a.a(com.applovin.impl.sdk.c.b.eF)).booleanValue()) {
            if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f7040a.a(com.applovin.impl.sdk.c.b.eH)).booleanValue()) {
                String valueOf = p10 != null ? String.valueOf(p10.getAdIdNumber()) : "null";
                throw new RuntimeException("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: " + valueOf);
            } else if (webView == null || !webView.equals(this.f7042c.s())) {
                return true;
            } else {
                this.f7042c.f();
                AppLovinAdSize b10 = this.f7042c.b();
                if (Utils.isBML(b10)) {
                    this.f7042c.a(b10);
                    this.f7042c.e();
                    return true;
                }
                return true;
            }
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean hasGesture = ((Boolean) this.f7040a.a(com.applovin.impl.sdk.c.b.bE)).booleanValue() ? webResourceRequest.hasGesture() : true;
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return a(webView, url.toString(), hasGesture);
        }
        if (com.applovin.impl.sdk.v.a()) {
            this.f7041b.e("AdWebView", "No url found for request");
            return false;
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str, true);
    }
}
