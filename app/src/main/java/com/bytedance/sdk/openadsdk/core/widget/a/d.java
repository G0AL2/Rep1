package com.bytedance.sdk.openadsdk.core.widget.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.b.n;
import com.bytedance.sdk.openadsdk.core.w;
import com.bytedance.sdk.openadsdk.utils.i;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTWebViewClient.java */
/* loaded from: classes.dex */
public class d extends SSWebView.a {

    /* renamed from: i  reason: collision with root package name */
    private static final HashSet<String> f13111i;

    /* renamed from: a  reason: collision with root package name */
    private boolean f13112a;

    /* renamed from: c  reason: collision with root package name */
    protected final w f13114c;

    /* renamed from: d  reason: collision with root package name */
    protected final Context f13115d;

    /* renamed from: e  reason: collision with root package name */
    protected final String f13116e;

    /* renamed from: f  reason: collision with root package name */
    protected n f13117f;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f13118g = true;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f13119h = true;

    /* renamed from: b  reason: collision with root package name */
    private AtomicBoolean f13113b = new AtomicBoolean(false);

    static {
        HashSet<String> hashSet = new HashSet<>();
        f13111i = hashSet;
        hashSet.add("png");
        hashSet.add("ico");
        hashSet.add("jpg");
        hashSet.add("gif");
        hashSet.add("svg");
        hashSet.add("jpeg");
    }

    public d(Context context, w wVar, String str, n nVar, boolean z10) {
        this.f13112a = false;
        this.f13115d = context;
        this.f13114c = wVar;
        this.f13116e = str;
        this.f13117f = nVar;
        this.f13112a = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String b(String str) {
        int lastIndexOf;
        String substring;
        if (str == null || (lastIndexOf = str.lastIndexOf(46)) < 0 || lastIndexOf == str.length() - 1 || (substring = str.substring(lastIndexOf)) == null || !f13111i.contains(substring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/" + substring;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if ("play.google.com".equals(parse.getHost())) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                intent.setPackage("com.android.vending");
                this.f13115d.startActivity(intent);
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (l.a()) {
            l.a("WebChromeClient", "onPageFinished " + str);
        }
        n nVar = this.f13117f;
        if (nVar != null) {
            nVar.a(webView, str, this.f13112a);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        n nVar = this.f13117f;
        if (nVar != null) {
            nVar.a(webView, str, bitmap);
        }
        if (this.f13119h) {
            b.a(this.f13115d).a(Build.VERSION.SDK_INT >= 19).b(webView.getSettings().getBuiltInZoomControls()).a(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        n nVar = this.f13117f;
        if (nVar != null) {
            nVar.a(webView, i10, str, str2, b(str2));
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.f13117f == null || webResourceResponse == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String uri = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        this.f13117f.a(webView, webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), uri, requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "");
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.f13117f != null) {
            int i10 = 0;
            String str = "SslError: unknown";
            String str2 = null;
            if (sslError != null) {
                try {
                    i10 = sslError.getPrimaryError();
                    str = "SslError: " + String.valueOf(sslError);
                    str2 = sslError.getUrl();
                } catch (Throwable unused2) {
                }
            }
            String str3 = str2;
            this.f13117f.a(webView, i10, str, str3, b(str3));
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        n nVar = this.f13117f;
        if (nVar != null) {
            nVar.a(webView, webResourceRequest);
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse;
        l.b("WebChromeClient", "shouldOverrideUrlLoading " + str);
        try {
            parse = Uri.parse(str);
        } catch (Throwable th) {
            l.b("WebChromeClient", "shouldOverrideUrlLoading", th);
            w wVar = this.f13114c;
            if (wVar != null && wVar.d()) {
                return true;
            }
        }
        if ("bytedance".equals(parse.getScheme().toLowerCase())) {
            i.a(parse, this.f13114c);
            return true;
        } else if (a(str)) {
            return true;
        } else {
            if (!o.a(str)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                intent.addFlags(268435456);
                this.f13115d.startActivity(intent);
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.f13117f == null || webResourceError == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String uri = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        this.f13117f.a(webView, webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), uri, requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "");
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }
}
