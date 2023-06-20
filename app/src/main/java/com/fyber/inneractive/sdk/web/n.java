package com.fyber.inneractive.sdk.web;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class n extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f20436a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20437b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20438c;

    /* renamed from: d  reason: collision with root package name */
    public final int f20439d;

    /* renamed from: e  reason: collision with root package name */
    public b f20440e;

    public n(b bVar, boolean z10, int i10, int i11, int i12) {
        this.f20440e = bVar;
        this.f20436a = z10;
        this.f20437b = i10;
        this.f20438c = i11;
        this.f20439d = i12;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        IAlog.d("Resources to load: %s", str);
        int i10 = IAlog.f20222a;
        IAlog.a(1, null, "%s %s", "RESOURCES", str);
        b bVar = this.f20440e;
        if (bVar != null) {
            a aVar = (a) bVar;
            if (TextUtils.isEmpty(str) || !str.startsWith("http://") || com.fyber.inneractive.sdk.util.r.a()) {
                return;
            }
            IAlog.a("%s Found a portential unsecure resource url: %s", IAlog.a(aVar), str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        IAlog.d("onPageFinished - url: %s", str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        IAlog.d("onPageStarted - url: %s", str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        IAlog.d("%sError: code = %d text = %s WebView = %s", IAlog.a(this), Integer.valueOf(i10), str, webView);
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        IAlog.a("onWebViewRenderProcessGone called for web view! %s", webView);
        if (renderProcessGoneDetail != null) {
            renderProcessGoneDetail.didCrash();
        }
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(renderProcessGoneDetail != null && renderProcessGoneDetail.didCrash());
        IAlog.a("onWebViewRenderProcessGone detail: did crash = %s", objArr);
        a aVar = (a) this.f20440e;
        L l10 = aVar.f20370g;
        if (l10 != 0) {
            l10.a();
        }
        aVar.a(true);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        URL url;
        HttpURLConnection httpURLConnection;
        if (this.f20436a && Build.VERSION.SDK_INT >= 21 && webResourceRequest != null) {
            IAlog.d("shouldInterceptRequest, method = %s", webResourceRequest.getMethod());
            r rVar = r.f20447c;
            int i10 = this.f20437b;
            int i11 = this.f20438c;
            int i12 = this.f20439d;
            rVar.getClass();
            WebResourceResponse webResourceResponse = null;
            if (webResourceRequest.getUrl() != null && webResourceRequest.getUrl().getScheme() != null && webResourceRequest.getUrl().getScheme().startsWith("http") && TextUtils.equals(webResourceRequest.getMethod(), "GET")) {
                s sVar = rVar.f20448a.get(new t(webResourceRequest));
                if (sVar != null) {
                    webResourceResponse = sVar.b();
                } else {
                    try {
                        url = new URL(webResourceRequest.getUrl().toString());
                    } catch (MalformedURLException unused) {
                        url = null;
                    }
                    if (url != null) {
                        ByteBuffer b10 = com.fyber.inneractive.sdk.util.d.f20241b.b();
                        try {
                            httpURLConnection = (HttpURLConnection) url.openConnection();
                            try {
                                httpURLConnection.setRequestMethod(webResourceRequest.getMethod());
                                httpURLConnection.setInstanceFollowRedirects(false);
                                r.a(webResourceRequest, httpURLConnection);
                            } catch (Throwable unused2) {
                            }
                        } catch (Throwable unused3) {
                            httpURLConnection = null;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.setConnectTimeout(i10);
                            httpURLConnection.setReadTimeout(i11);
                            s sVar2 = null;
                            while (i12 > 0) {
                                try {
                                    sVar2 = r.a(httpURLConnection, b10);
                                } catch (SocketTimeoutException | UnknownHostException unused4) {
                                } catch (Throwable unused5) {
                                    i12 = 0;
                                }
                                if (sVar2 != null) {
                                    break;
                                }
                                i12--;
                            }
                            if (sVar2 != null) {
                                try {
                                    if (sVar2.a()) {
                                        rVar.f20448a.put(new t(webResourceRequest), sVar2);
                                    }
                                    webResourceResponse = sVar2.b();
                                    httpURLConnection.disconnect();
                                    com.fyber.inneractive.sdk.util.d.f20241b.f20242a.offer(b10);
                                } catch (Throwable unused6) {
                                }
                            }
                            httpURLConnection.disconnect();
                            com.fyber.inneractive.sdk.util.d.f20241b.f20242a.offer(b10);
                        }
                    }
                }
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
            IAlog.d("shouldInterceptRequest did not intercept %s", webResourceRequest.getUrl());
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        super.shouldOverrideUrlLoading(webView, str);
        b bVar = this.f20440e;
        return bVar != null && ((IAmraidWebViewController) bVar).a(webView, str);
    }
}
