package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.a.h;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class d extends h {

    /* renamed from: c  reason: collision with root package name */
    private static WebView f7028c;

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.v f7029a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.m f7030b;

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.sdk.d.d f7031d;

    /* renamed from: e  reason: collision with root package name */
    private com.applovin.impl.sdk.ad.e f7032e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7033f;

    public d(e eVar, com.applovin.impl.sdk.m mVar, Context context) {
        this(eVar, mVar, context, false);
    }

    d(e eVar, com.applovin.impl.sdk.m mVar, Context context, boolean z10) {
        super(context);
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f7030b = mVar;
        this.f7029a = mVar.A();
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(eVar);
        setWebChromeClient(new c(eVar != null ? eVar.a() : null, mVar));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (com.applovin.impl.sdk.utils.g.i() && ((Boolean) mVar.a(com.applovin.impl.sdk.c.b.eK)).booleanValue()) {
            setWebViewRenderProcessClient(new f(mVar).a());
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.d.1
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.d.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                if (com.applovin.impl.sdk.v.a()) {
                    d.this.f7029a.b("AdWebView", "Received a LongClick event.");
                    return true;
                }
                return true;
            }
        });
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }

    public static void a(final com.applovin.impl.sdk.network.i iVar, final com.applovin.impl.sdk.m mVar, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.d.3
            @Override // java.lang.Runnable
            public void run() {
                String a10 = com.applovin.impl.sdk.network.i.this.a();
                d.c();
                if (d.f7028c == null) {
                    appLovinPostbackListener.onPostbackFailure(a10, -1);
                    return;
                }
                if (com.applovin.impl.sdk.network.i.this.c() != null) {
                    a10 = StringUtils.appendQueryParameters(a10, com.applovin.impl.sdk.network.i.this.c(), ((Boolean) mVar.a(com.applovin.impl.sdk.c.b.f8217df)).booleanValue());
                }
                String str = "al_firePostback('" + a10 + "');";
                if (com.applovin.impl.sdk.utils.g.c()) {
                    d.f7028c.evaluateJavascript(str, null);
                } else {
                    d.f7028c.loadUrl("javascript:" + str);
                }
                appLovinPostbackListener.onPostbackSuccess(a10);
            }
        });
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.m mVar) {
        String a10 = a(str3, str);
        if (StringUtils.isValidString(a10)) {
            if (com.applovin.impl.sdk.v.a()) {
                com.applovin.impl.sdk.v vVar = this.f7029a;
                vVar.b("AdWebView", "Rendering webview for VAST ad with resourceContents : " + a10);
            }
            loadDataWithBaseURL(str2, a10, "text/html", null, "");
            return;
        }
        String a11 = a((String) mVar.a(com.applovin.impl.sdk.c.b.eg), str);
        if (StringUtils.isValidString(a11)) {
            if (com.applovin.impl.sdk.v.a()) {
                com.applovin.impl.sdk.v vVar2 = this.f7029a;
                vVar2.b("AdWebView", "Rendering webview for VAST ad with resourceContents : " + a11);
            }
            loadDataWithBaseURL(str2, a11, "text/html", null, "");
            return;
        }
        if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v vVar3 = this.f7029a;
            vVar3.b("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
        }
        loadUrl(str);
    }

    private void b(com.applovin.impl.sdk.ad.e eVar) {
        Boolean n10;
        Integer a10;
        loadUrl("about:blank");
        int az = this.f7032e.az();
        if (az >= 0) {
            setLayerType(az, null);
        }
        if (com.applovin.impl.sdk.utils.g.b()) {
            getSettings().setMediaPlaybackRequiresUserGesture(eVar.av());
        }
        if (com.applovin.impl.sdk.utils.g.c() && eVar.ax()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        v ay = eVar.ay();
        if (ay != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState b10 = ay.b();
            if (b10 != null) {
                settings.setPluginState(b10);
            }
            Boolean c10 = ay.c();
            if (c10 != null) {
                settings.setAllowFileAccess(c10.booleanValue());
            }
            Boolean d10 = ay.d();
            if (d10 != null) {
                settings.setLoadWithOverviewMode(d10.booleanValue());
            }
            Boolean e10 = ay.e();
            if (e10 != null) {
                settings.setUseWideViewPort(e10.booleanValue());
            }
            Boolean f10 = ay.f();
            if (f10 != null) {
                settings.setAllowContentAccess(f10.booleanValue());
            }
            Boolean g10 = ay.g();
            if (g10 != null) {
                settings.setBuiltInZoomControls(g10.booleanValue());
            }
            Boolean h10 = ay.h();
            if (h10 != null) {
                settings.setDisplayZoomControls(h10.booleanValue());
            }
            Boolean i10 = ay.i();
            if (i10 != null) {
                settings.setSaveFormData(i10.booleanValue());
            }
            Boolean j10 = ay.j();
            if (j10 != null) {
                settings.setGeolocationEnabled(j10.booleanValue());
            }
            Boolean k10 = ay.k();
            if (k10 != null) {
                settings.setNeedInitialFocus(k10.booleanValue());
            }
            Boolean l10 = ay.l();
            if (l10 != null) {
                settings.setAllowFileAccessFromFileURLs(l10.booleanValue());
            }
            Boolean m10 = ay.m();
            if (m10 != null) {
                settings.setAllowUniversalAccessFromFileURLs(m10.booleanValue());
            }
            if (com.applovin.impl.sdk.utils.g.d() && (a10 = ay.a()) != null) {
                settings.setMixedContentMode(a10.intValue());
            }
            if (!com.applovin.impl.sdk.utils.g.e() || (n10 = ay.n()) == null) {
                return;
            }
            settings.setOffscreenPreRaster(n10.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c() {
        if (f7028c != null) {
            return;
        }
        WebView tryToCreateWebView = Utils.tryToCreateWebView(com.applovin.impl.sdk.m.M(), "postbacks");
        f7028c = tryToCreateWebView;
        if (tryToCreateWebView == null) {
            return;
        }
        tryToCreateWebView.getSettings().setJavaScriptEnabled(true);
        f7028c.loadData("<html><head>\n<script type=\"text/javascript\">\n    window.al_firePostback = function(postback) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = postback;\n    }, 100);\n};\n</script></head>\n<body></body></html>", "text/html", "UTF-8");
        f7028c.setWebViewClient(new WebViewClient() { // from class: com.applovin.impl.adview.d.4
            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                if (webView == d.f7028c) {
                    d.f7028c.destroy();
                    WebView unused = d.f7028c = null;
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.d.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            d.c();
                        }
                    });
                    return true;
                }
                return true;
            }
        });
    }

    public void a(com.applovin.impl.sdk.ad.e eVar) {
        com.applovin.impl.sdk.v vVar;
        String str;
        com.applovin.impl.sdk.v vVar2;
        String str2;
        String str3;
        String aw;
        String str4;
        String str5;
        String str6;
        String aw2;
        com.applovin.impl.sdk.m mVar;
        if (this.f7033f) {
            if (com.applovin.impl.sdk.v.a()) {
                com.applovin.impl.sdk.v.i("AdWebView", "Ad can not be loaded in a destroyed webview");
                return;
            }
            return;
        }
        this.f7032e = eVar;
        try {
            b(eVar);
            if (Utils.isBML(eVar.getSize())) {
                setVisibility(0);
            }
            if (eVar instanceof com.applovin.impl.sdk.ad.a) {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) eVar;
                String b10 = aVar.b();
                if (aVar.isOpenMeasurementEnabled()) {
                    b10 = this.f7030b.al().a(b10);
                }
                loadDataWithBaseURL(eVar.aw(), b10, "text/html", null, "");
                if (!com.applovin.impl.sdk.v.a()) {
                    return;
                }
                vVar = this.f7029a;
                str = "AppLovinAd rendered";
            } else if (!(eVar instanceof com.applovin.impl.a.a)) {
                return;
            } else {
                com.applovin.impl.a.a aVar2 = (com.applovin.impl.a.a) eVar;
                com.applovin.impl.a.d aM = aVar2.aM();
                if (aM != null) {
                    com.applovin.impl.a.h b11 = aM.b();
                    Uri b12 = b11.b();
                    String uri = b12 != null ? b12.toString() : "";
                    String c10 = b11.c();
                    String aO = aVar2.aO();
                    if (!StringUtils.isValidString(uri) && !StringUtils.isValidString(c10)) {
                        if (com.applovin.impl.sdk.v.a()) {
                            vVar2 = this.f7029a;
                            str2 = "Unable to load companion ad. No resources provided.";
                            vVar2.e("AdWebView", str2);
                            return;
                        }
                        return;
                    }
                    if (b11.a() == h.a.STATIC) {
                        if (com.applovin.impl.sdk.v.a()) {
                            this.f7029a.b("AdWebView", "Rendering WebView for static VAST ad");
                        }
                        loadDataWithBaseURL(eVar.aw(), a((String) this.f7030b.a(com.applovin.impl.sdk.c.b.f8223ef), uri), "text/html", null, "");
                        return;
                    } else if (b11.a() == h.a.HTML) {
                        if (!StringUtils.isValidString(c10)) {
                            if (StringUtils.isValidString(uri)) {
                                if (com.applovin.impl.sdk.v.a()) {
                                    this.f7029a.b("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                aw2 = eVar.aw();
                                mVar = this.f7030b;
                                a(uri, aw2, aO, mVar);
                                return;
                            }
                            return;
                        }
                        String a10 = a(aO, c10);
                        str3 = StringUtils.isValidString(a10) ? a10 : c10;
                        if (com.applovin.impl.sdk.v.a()) {
                            com.applovin.impl.sdk.v vVar3 = this.f7029a;
                            vVar3.b("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str3);
                        }
                        aw = eVar.aw();
                        str4 = "text/html";
                        str5 = null;
                        str6 = "";
                        loadDataWithBaseURL(aw, str3, str4, str5, str6);
                        return;
                    } else if (b11.a() != h.a.IFRAME) {
                        if (com.applovin.impl.sdk.v.a()) {
                            vVar2 = this.f7029a;
                            str2 = "Failed to render VAST companion ad of invalid type";
                            vVar2.e("AdWebView", str2);
                            return;
                        }
                        return;
                    } else if (StringUtils.isValidString(uri)) {
                        if (com.applovin.impl.sdk.v.a()) {
                            this.f7029a.b("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                        }
                        aw2 = eVar.aw();
                        mVar = this.f7030b;
                        a(uri, aw2, aO, mVar);
                        return;
                    } else if (StringUtils.isValidString(c10)) {
                        String a11 = a(aO, c10);
                        str3 = StringUtils.isValidString(a11) ? a11 : c10;
                        if (com.applovin.impl.sdk.v.a()) {
                            com.applovin.impl.sdk.v vVar4 = this.f7029a;
                            vVar4.b("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str3);
                        }
                        aw = eVar.aw();
                        str4 = "text/html";
                        str5 = null;
                        str6 = "";
                        loadDataWithBaseURL(aw, str3, str4, str5, str6);
                        return;
                    } else {
                        return;
                    }
                } else if (!com.applovin.impl.sdk.v.a()) {
                    return;
                } else {
                    vVar = this.f7029a;
                    str = "No companion ad provided.";
                }
            }
            vVar.b("AdWebView", str);
        } catch (Throwable th) {
            String valueOf = eVar != null ? String.valueOf(eVar.getAdIdNumber()) : "null";
            throw new RuntimeException("Unable to render AppLovin ad (" + valueOf + ") - " + th);
        }
    }

    public void a(String str) {
        a(str, (Runnable) null);
    }

    public void a(String str, Runnable runnable) {
        try {
            if (com.applovin.impl.sdk.v.a()) {
                com.applovin.impl.sdk.v vVar = this.f7029a;
                vVar.b("AdWebView", "Forwarding \"" + str + "\" to ad template");
            }
            loadUrl(str);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.v.a()) {
                this.f7029a.b("AdWebView", "Unable to forward to template", th);
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f7033f = true;
        super.destroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.applovin.impl.sdk.ad.e getCurrentAd() {
        return this.f7032e;
    }

    public com.applovin.impl.sdk.d.d getStatsManagerHelper() {
        return this.f7031d;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
    }

    public void setStatsManagerHelper(com.applovin.impl.sdk.d.d dVar) {
        this.f7031d = dVar;
    }
}
