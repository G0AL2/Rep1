package com.inmobi.media;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: BaseWebViewClient.java */
/* loaded from: classes3.dex */
public class aa extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private boolean f24444a;

    /* renamed from: b  reason: collision with root package name */
    public int f24445b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f24446c = false;

    /* renamed from: d  reason: collision with root package name */
    AtomicBoolean f24447d = new AtomicBoolean(false);

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (this.f24446c) {
            this.f24446c = false;
            if (webView != null) {
                webView.clearHistory();
            }
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(22)
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webResourceError.getErrorCode();
        Objects.toString(webResourceError.getDescription());
        Objects.toString(webResourceRequest.getUrl());
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (Build.VERSION.SDK_INT < 26 || !(webView instanceof q)) {
            return false;
        }
        hu.a((byte) 1, "BaseWebViewClient", "WebView crash detected, destroying ad");
        webView.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (Build.VERSION.SDK_INT < 21) {
            a(webView);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(View view) {
        this.f24447d.set(true);
        view.postDelayed(new Runnable() { // from class: com.inmobi.media.aa.1
            @Override // java.lang.Runnable
            public final void run() {
                aa.this.f24447d.set(false);
            }
        }, 1000L);
    }

    private void a(WebView webView) {
        int i10 = this.f24445b;
        if (-1 != i10) {
            if (i10 > 0) {
                this.f24445b = i10 - 1;
            } else if (this.f24444a) {
            } else {
                new Handler(Looper.getMainLooper()).post(new p(webView));
                this.f24444a = true;
                if (webView instanceof q) {
                    ((q) webView).g();
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        a(webView);
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}
