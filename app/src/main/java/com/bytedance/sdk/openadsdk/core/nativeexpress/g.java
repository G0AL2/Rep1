package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.c.c;
import com.bytedance.sdk.openadsdk.core.w;
import java.io.InputStream;
import java.util.Iterator;

/* compiled from: ExpressClient.java */
/* loaded from: classes.dex */
public class g extends com.bytedance.sdk.openadsdk.core.widget.a.d {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.e.n f12641a;

    public g(Context context, w wVar, com.bytedance.sdk.openadsdk.core.e.n nVar, com.bytedance.sdk.openadsdk.b.n nVar2) {
        super(context, wVar, nVar.Y(), nVar2, false);
        this.f12641a = nVar;
    }

    private WebResourceResponse a(WebView webView, String str) {
        com.bytedance.sdk.openadsdk.core.e.k kVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        c.a a10 = com.bytedance.sdk.component.adexpress.c.c.a(str);
        if (a10 != c.a.IMAGE) {
            Iterator<com.bytedance.sdk.openadsdk.core.e.k> it = this.f12641a.P().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.bytedance.sdk.openadsdk.core.e.k next = it.next();
                if (!TextUtils.isEmpty(next.a()) && !TextUtils.isEmpty(str)) {
                    String a11 = next.a();
                    if (a11.startsWith("https")) {
                        a11 = a11.replaceFirst("https", "http");
                    }
                    if ((str.startsWith("https") ? str.replaceFirst("https", "http") : str).equals(a11)) {
                        kVar = next;
                        break;
                    }
                }
            }
        }
        if (a10 != c.a.IMAGE && kVar == null) {
            return com.bytedance.sdk.component.adexpress.a.b.a.a(str, a10, "");
        }
        return a(str, com.bytedance.sdk.openadsdk.core.nativeexpress.a.a.a(this.f12641a, str));
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.f13118g = false;
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f13119h = false;
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
    @TargetApi(21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.l.c("ExpressClient", "shouldInterceptRequest error1", th);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            WebResourceResponse a10 = a(webView, str);
            a(currentTimeMillis, System.currentTimeMillis(), str, a10 != null ? 1 : 2);
            if (a10 != null) {
                return a10;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.l.c("ExpressClient", "shouldInterceptRequest error2", th);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    private WebResourceResponse a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream a10 = com.bytedance.sdk.openadsdk.d.a.a(str, str2);
            if (a10 != null) {
                return new WebResourceResponse(c.a.IMAGE.a(), "utf-8", a10);
            }
            return null;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.l.c("ExpressClient", "get image WebResourceResponse error", th);
            return null;
        }
    }

    private void a(long j10, long j11, String str, int i10) {
        com.bytedance.sdk.openadsdk.b.n nVar = this.f13117f;
        if (nVar == null || nVar.b() == null) {
            return;
        }
        c.a a10 = com.bytedance.sdk.component.adexpress.c.c.a(str);
        if (a10 == c.a.HTML) {
            this.f13117f.b().a(str, j10, j11, i10);
        } else if (a10 == c.a.JS) {
            this.f13117f.b().b(str, j10, j11, i10);
        }
    }
}
