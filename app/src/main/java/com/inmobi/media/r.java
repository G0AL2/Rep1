package com.inmobi.media;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.chartboost.sdk.CBLocation;
import com.google.android.gms.common.internal.ImagesContract;
import com.inmobi.media.gs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RenderViewClient.java */
/* loaded from: classes3.dex */
public final class r extends aa {

    /* renamed from: e  reason: collision with root package name */
    private static final String f26001e = r.class.getSimpleName();

    /* renamed from: f  reason: collision with root package name */
    private List<String> f26003f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f26004g = false;

    /* renamed from: a  reason: collision with root package name */
    short f26002a = -1;

    /* renamed from: h  reason: collision with root package name */
    private AtomicBoolean f26005h = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f26003f.clear();
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        q qVar;
        String url;
        if (str.matches("(.*)phpserver/db(.*)")) {
            Intent intent = new Intent(gs.a.NETWORK_REQUEST_RESPONSE.toString());
            intent.putExtra(ImagesContract.URL, str);
            gs.a(intent);
        }
        if (!(webView instanceof q) || (url = (qVar = (q) webView).getUrl()) == null || !str.contains("/mraid.js") || "about:blank".equals(url) || url.startsWith("file:")) {
            return;
        }
        if (!this.f26003f.contains(url)) {
            this.f26003f.add(url);
        }
        if (this.f26004g) {
            return;
        }
        this.f26004g = true;
        qVar.d(qVar.getMraidJsString());
    }

    @Override // com.inmobi.media.aa, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (webView instanceof q) {
            q qVar = (q) webView;
            if (this.f26003f.contains(str) && !this.f26004g) {
                this.f26004g = true;
                qVar.d(qVar.getMraidJsString());
            }
            if ("Loading".equals(qVar.getViewState())) {
                qVar.getListener().e(qVar);
                qVar.d("window.imaiview.broadcastEvent('ready');");
                qVar.d("window.mraidview.broadcastEvent('ready');");
                if (qVar.getImpressionType() == 2) {
                    qVar.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    qVar.layout(0, 0, qVar.getMeasuredWidth(), qVar.getMeasuredHeight());
                    qVar.setDrawingCacheEnabled(true);
                    qVar.buildDrawingCache();
                }
                qVar.setAndUpdateViewState(qVar.getOriginalRenderView() == null ? CBLocation.LOCATION_DEFAULT : "Expanded");
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (webView instanceof q) {
            q qVar = (q) webView;
            this.f26004g = false;
            if (qVar.getMarkupType().equals("htmlUrl")) {
                qVar.d(qVar.getMraidJsString());
                this.f26004g = true;
            }
            qVar.setAndUpdateViewState("Loading");
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a(webView, webResourceRequest.getUrl().toString());
        }
        return false;
    }

    private boolean a(WebView webView, String str) {
        if (webView instanceof q) {
            if (this.f26005h.get()) {
                return true;
            }
            q qVar = (q) webView;
            if (qVar.f25959i) {
                webView.loadUrl(str);
                return true;
            } else if (!qVar.i() && !qVar.f25953c && !"about:blank".equals(str)) {
                qVar.c("redirect");
                return true;
            } else {
                qVar.getPlacementType();
                if (1 == qVar.getPlacementType()) {
                    if (qVar.f25953c && hs.a(str)) {
                        return false;
                    }
                    return a(qVar, str);
                }
                return a(qVar, str);
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str);
    }

    private boolean a(q qVar, String str) {
        if (!qVar.f25953c) {
            qVar.l();
        }
        boolean a10 = qVar.getLandingPageHandler().a(null, null, str);
        if (qVar.f25953c && a10) {
            a((View) qVar);
            if (!hs.a(str)) {
                if (qVar.canGoBack()) {
                    qVar.goBack();
                } else {
                    Activity fullScreenActivity = qVar.getFullScreenActivity();
                    if (fullScreenActivity != null) {
                        fullScreenActivity.finish();
                    }
                }
            }
        }
        return a10;
    }
}
