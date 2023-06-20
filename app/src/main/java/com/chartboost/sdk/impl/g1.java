package com.chartboost.sdk.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.chartboost.sdk.Libraries.CBLogging;

/* loaded from: classes.dex */
public class g1 extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private final Context f14015a;

    /* renamed from: b  reason: collision with root package name */
    private final h1 f14016b;

    public g1(Context context, h1 h1Var) {
        this.f14015a = context;
        this.f14016b = h1Var;
    }

    private void a(String str) {
        h1 h1Var = this.f14016b;
        if (h1Var != null) {
            h1Var.a(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        h1 h1Var = this.f14016b;
        if (h1Var != null) {
            h1Var.c();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (Build.VERSION.SDK_INT >= 26) {
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage != null) {
                CBLogging.a("CustomWebViewClient", "WebView version: " + currentWebViewPackage.versionName);
                return;
            }
            Context context = this.f14015a;
            String str2 = "Device was not set up correctly.";
            if (context != null && i1.d(context).equalsIgnoreCase("watch")) {
                str2 = "No webview support.";
            }
            a(str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        a("Error loading " + str2 + ": " + str);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error loading ");
        sb2.append(webResourceRequest.getUrl().toString());
        sb2.append(": ");
        sb2.append(webResourceResponse == null ? "unknown error" : webResourceResponse.getReasonPhrase());
        CBLogging.a("CustomWebViewClient", sb2.toString());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        m1.d(new com.chartboost.sdk.Tracking.b("show_webview_ssl_error", sslError.toString(), "", ""));
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String str;
        if (renderProcessGoneDetail.didCrash()) {
            str = "Webview crashed: " + renderProcessGoneDetail.toString();
        } else {
            str = "Webview killed, likely due to low memory";
        }
        a(str);
        return true;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return false;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest.isForMainFrame()) {
            a("Error loading " + webResourceRequest.getUrl().toString() + ": " + ((Object) webResourceError.getDescription()));
        }
    }
}
