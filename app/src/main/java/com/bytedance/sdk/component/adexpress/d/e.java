package com.bytedance.sdk.component.adexpress.d;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.a.z;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WebViewPool.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f9483d = new byte[0];

    /* renamed from: e  reason: collision with root package name */
    private static int f9484e = 10;

    /* renamed from: g  reason: collision with root package name */
    private static volatile e f9485g;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f9489f = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    private List<SSWebView> f9486a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private Map<Integer, c> f9487b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map<Integer, d> f9488c = new HashMap();

    private e() {
        com.bytedance.sdk.component.adexpress.a.a.c c10 = com.bytedance.sdk.component.adexpress.a.a.a.a().c();
        if (c10 != null) {
            f9484e = c10.j();
        }
    }

    public static e a() {
        if (f9485g == null) {
            synchronized (e.class) {
                if (f9485g == null) {
                    f9485g = new e();
                }
            }
        }
        return f9485g;
    }

    public SSWebView b() {
        SSWebView remove;
        if (d() > 0 && (remove = this.f9486a.remove(0)) != null) {
            l.b("WebViewPool", "get WebView from pool; current available count: " + d());
            return remove;
        }
        return null;
    }

    public boolean c(SSWebView sSWebView) {
        if (sSWebView == null) {
            return false;
        }
        l.b("WebViewPool", "WebView render fail and abandon");
        sSWebView.l();
        return true;
    }

    public int d() {
        return this.f9486a.size();
    }

    public int e() {
        return this.f9486a.size();
    }

    private void e(SSWebView sSWebView) {
        sSWebView.removeAllViews();
        sSWebView.c();
        sSWebView.setWebChromeClient(null);
        sSWebView.setWebViewClient(null);
        sSWebView.setDownloadListener(null);
        sSWebView.setJavaScriptEnabled(true);
        sSWebView.setAppCacheEnabled(false);
        sSWebView.setSupportZoom(false);
        sSWebView.setUseWideViewPort(true);
        sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
        sSWebView.setDomStorageEnabled(true);
        sSWebView.setBuiltInZoomControls(false);
        sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        sSWebView.setLoadWithOverviewMode(false);
        sSWebView.setUserAgentString("android_client");
        sSWebView.setDefaultTextEncodingName("UTF-8");
        sSWebView.setDefaultFontSize(16);
    }

    public void d(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        c cVar = this.f9487b.get(Integer.valueOf(sSWebView.hashCode()));
        if (cVar != null) {
            cVar.a(null);
        }
        sSWebView.b("SDK_INJECT_GLOBAL");
    }

    public void c() {
        for (SSWebView sSWebView : this.f9486a) {
            if (sSWebView != null) {
                sSWebView.l();
            }
        }
        this.f9486a.clear();
    }

    public void b(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        if (this.f9486a.size() >= f9484e) {
            l.b("WebViewPool", "WebView pool is full，destroy webview");
            sSWebView.l();
        } else if (this.f9486a.contains(sSWebView)) {
        } else {
            this.f9486a.add(sSWebView);
            l.b("WebViewPool", "recycle WebView，current available count: " + d());
        }
    }

    public void a(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        e(sSWebView);
        sSWebView.b("SDK_INJECT_GLOBAL");
        d(sSWebView);
        b(sSWebView);
    }

    @SuppressLint({"JavascriptInterface"})
    public void a(SSWebView sSWebView, b bVar) {
        if (sSWebView == null || bVar == null) {
            return;
        }
        c cVar = this.f9487b.get(Integer.valueOf(sSWebView.hashCode()));
        if (cVar != null) {
            cVar.a(bVar);
        } else {
            cVar = new c(bVar);
            this.f9487b.put(Integer.valueOf(sSWebView.hashCode()), cVar);
        }
        sSWebView.a(cVar, "SDK_INJECT_GLOBAL");
    }

    @SuppressLint({"JavascriptInterface"})
    public void a(WebView webView, z zVar, String str) {
        if (webView == null || zVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        d dVar = this.f9488c.get(Integer.valueOf(webView.hashCode()));
        if (dVar != null) {
            dVar.a(zVar);
        } else {
            dVar = new d(zVar);
            this.f9488c.put(Integer.valueOf(webView.hashCode()), dVar);
        }
        webView.addJavascriptInterface(dVar, str);
    }

    public void a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        d dVar = this.f9488c.get(Integer.valueOf(webView.hashCode()));
        if (dVar != null) {
            dVar.a(null);
        }
        webView.removeJavascriptInterface(str);
    }
}
