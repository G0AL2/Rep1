package com.bytedance.sdk.openadsdk.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.utils.v;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LandingPageLog.java */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f11119a = {10, 30, 50, 75, 100};

    /* renamed from: c  reason: collision with root package name */
    private long f11121c;

    /* renamed from: h  reason: collision with root package name */
    private String f11126h;

    /* renamed from: i  reason: collision with root package name */
    private String f11127i;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.e.n f11129k;

    /* renamed from: v  reason: collision with root package name */
    private WebView f11140v;

    /* renamed from: y  reason: collision with root package name */
    private u f11143y;

    /* renamed from: b  reason: collision with root package name */
    private int f11120b = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f11122d = 1;

    /* renamed from: e  reason: collision with root package name */
    private AtomicBoolean f11123e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private AtomicBoolean f11124f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    private int f11125g = -1;

    /* renamed from: l  reason: collision with root package name */
    private String f11130l = "landingpage";

    /* renamed from: m  reason: collision with root package name */
    private long f11131m = 0;

    /* renamed from: n  reason: collision with root package name */
    private long f11132n = 0;

    /* renamed from: o  reason: collision with root package name */
    private long f11133o = 0;

    /* renamed from: p  reason: collision with root package name */
    private long f11134p = 0;

    /* renamed from: q  reason: collision with root package name */
    private long f11135q = 0;

    /* renamed from: r  reason: collision with root package name */
    private long f11136r = 0;

    /* renamed from: s  reason: collision with root package name */
    private boolean f11137s = false;

    /* renamed from: t  reason: collision with root package name */
    private boolean f11138t = false;

    /* renamed from: u  reason: collision with root package name */
    private AtomicInteger f11139u = new AtomicInteger(0);

    /* renamed from: w  reason: collision with root package name */
    private boolean f11141w = false;

    /* renamed from: x  reason: collision with root package name */
    private String f11142x = "";

    /* renamed from: z  reason: collision with root package name */
    private boolean f11144z = false;

    /* renamed from: j  reason: collision with root package name */
    private final Context f11128j = com.bytedance.sdk.openadsdk.core.m.a();

    /* compiled from: LandingPageLog.java */
    /* loaded from: classes.dex */
    private class a {
        private a() {
        }

        @JavascriptInterface
        public String getUrl() {
            return n.this.f11142x;
        }

        @JavascriptInterface
        public void readPercent(String str) {
            int i10 = 0;
            try {
                int intValue = Float.valueOf(str).intValue();
                if (intValue > 100) {
                    i10 = 100;
                } else if (intValue >= 0) {
                    i10 = intValue;
                }
            } catch (Throwable unused) {
            }
            n.this.f11139u.set(i10);
        }
    }

    public n(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, WebView webView) {
        this.f11121c = -1L;
        this.f11129k = nVar;
        this.f11140v = webView;
        if (webView == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            webView.addJavascriptInterface(new a(), "JS_LANDING_PAGE_LOG_OBJ");
        }
        if (nVar == null || nVar.aH() == null) {
            return;
        }
        this.f11121c = nVar.aH().optLong("page_id", -1L);
    }

    public void d() {
        com.bytedance.sdk.component.utils.l.b("LandingPageLog", "onResume");
        if (this.f11136r == 0) {
            this.f11136r = System.currentTimeMillis();
        }
        this.f11131m = System.currentTimeMillis();
    }

    public void e() {
        com.bytedance.sdk.component.utils.l.b("LandingPageLog", "onStop");
        if ("landingpage".equals(this.f11130l) || "landingpage_endcard".equals(this.f11130l) || "landingpage_split_screen".equals(this.f11130l) || "landingpage_direct".equals(this.f11130l)) {
            if (this.f11122d == 2) {
                if (this.f11133o > 0 || !c()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    this.f11132n = currentTimeMillis;
                    long max = currentTimeMillis - Math.max(this.f11131m, this.f11133o);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("load_status", this.f11122d);
                        jSONObject.put("max_scroll_percent", this.f11139u.get());
                        jSONObject.putOpt("render_type", "h5");
                        jSONObject.putOpt("render_type_2", 0);
                    } catch (JSONException unused) {
                    }
                    a("stay_page", jSONObject, Math.min(max, (long) TTAdConstant.AD_MAX_EVENT_TIME));
                }
            }
        }
    }

    public void f() {
        com.bytedance.sdk.component.utils.l.b("LandingPageLog", "onDestroy");
        this.f11140v = null;
        if (this.f11124f.compareAndSet(false, true)) {
            e.a(this.f11128j, this.f11129k, this.f11130l, System.currentTimeMillis() - this.f11136r);
        }
    }

    public u b() {
        return this.f11143y;
    }

    public boolean c() {
        return this.f11144z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        return "javascript:" + str;
    }

    public com.bytedance.sdk.openadsdk.core.e.n a() {
        return this.f11129k;
    }

    public void a(long j10) {
        this.f11133o = j10;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f11130l = str;
    }

    public void a(u uVar) {
        this.f11143y = uVar;
    }

    public n a(boolean z10) {
        this.f11141w = z10;
        return this;
    }

    public void a(WebView webView, int i10) {
        if (webView == null) {
            return;
        }
        com.bytedance.sdk.component.utils.l.b("LandingPageLog", "onWebProgress: " + i10);
        if (this.f11134p == 0 && i10 > 0) {
            this.f11134p = System.currentTimeMillis();
        } else if (this.f11135q == 0 && i10 == 100) {
            this.f11135q = System.currentTimeMillis();
        }
        if (this.f11120b == f11119a.length) {
            return;
        }
        if (!"landingpage".equals(this.f11130l) && !"landingpage_endcard".equals(this.f11130l) && !"landingpage_split_screen".equals(this.f11130l) && !"landingpage_direct".equals(this.f11130l)) {
            return;
        }
        int i11 = this.f11120b;
        while (true) {
            int[] iArr = f11119a;
            if (i11 >= iArr.length || i10 < iArr[this.f11120b]) {
                return;
            }
            int i12 = i11 + 1;
            this.f11120b = i12;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ImagesContract.URL, webView.getUrl());
                long j10 = this.f11121c;
                if (j10 != -1) {
                    jSONObject.put("page_id", j10);
                }
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
                jSONObject.put("pct", iArr[i11]);
            } catch (Exception unused) {
            }
            a("progress_load_finish", jSONObject);
            i11 = i12;
        }
    }

    public void a(WebView webView, String str, Bitmap bitmap) {
        com.bytedance.sdk.component.utils.l.b("LandingPageLog", "onWebStarted: " + String.valueOf(str));
        u uVar = this.f11143y;
        if (uVar != null) {
            uVar.e();
        }
        if (this.f11123e.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (Exception unused) {
            }
            a("load_start", jSONObject);
        }
    }

    public void a(WebView webView, String str, boolean z10) {
        com.bytedance.sdk.component.utils.l.b("LandingPageLog", "onWebFinished: " + String.valueOf(str));
        u uVar = this.f11143y;
        if (uVar != null) {
            uVar.f();
        }
        if (webView != null && !this.f11137s && this.f11141w) {
            this.f11137s = true;
            com.bytedance.sdk.component.utils.k.a(webView, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
        }
        if (this.f11124f.compareAndSet(false, true)) {
            if (this.f11122d != 3) {
                this.f11122d = 2;
            }
            this.f11131m = System.currentTimeMillis();
            if (this.f11122d == 2) {
                long j10 = this.f11135q - this.f11134p;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", this.f11125g);
                    jSONObject.put("error_msg", this.f11126h);
                    jSONObject.put("error_url", this.f11127i);
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                } catch (Exception unused) {
                }
                try {
                    com.bytedance.sdk.openadsdk.core.i.c k10 = com.bytedance.sdk.openadsdk.core.m.h().k();
                    if (z10 && !TextUtils.isEmpty(k10.f12337a) && k10.f12338b) {
                        String str2 = k10.f12337a;
                        com.bytedance.sdk.component.e.b.b c10 = com.bytedance.sdk.openadsdk.i.d.a().b().c();
                        c10.a(str2);
                        HashMap hashMap = new HashMap();
                        hashMap.put("content-type", "application/json; charset=utf-8");
                        c10.d(hashMap);
                        c10.a(new com.bytedance.sdk.component.e.a.a() { // from class: com.bytedance.sdk.openadsdk.b.n.1
                            @Override // com.bytedance.sdk.component.e.a.a
                            public void a(com.bytedance.sdk.component.e.b.c cVar, com.bytedance.sdk.component.e.b bVar) {
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    jSONObject2.putOpt("cid", n.this.a().Y());
                                    jSONObject2.putOpt("ad_id", n.this.a().Y());
                                    jSONObject2.put("log_extra", n.this.a().ac());
                                    String replace = bVar.d().replace("\"/** adInfo **/\"", jSONObject2.toString());
                                    if (TextUtils.isEmpty(replace)) {
                                        return;
                                    }
                                    final String b10 = n.this.b(replace);
                                    if (TextUtils.isEmpty(b10) || n.this.f11140v == null) {
                                        return;
                                    }
                                    com.bytedance.sdk.openadsdk.core.k.d().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.n.1.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            com.bytedance.sdk.component.utils.k.a(n.this.f11140v, b10);
                                        }
                                    });
                                } catch (Exception e10) {
                                    com.bytedance.sdk.component.utils.l.c("LandingPageLog", "TTWebViewClient : onPageFinished", e10);
                                }
                            }

                            @Override // com.bytedance.sdk.component.e.a.a
                            public void a(com.bytedance.sdk.component.e.b.c cVar, IOException iOException) {
                                com.bytedance.sdk.component.utils.l.b("send landing page js error", iOException.toString());
                            }
                        });
                    }
                } catch (Throwable unused2) {
                }
                a("load_finish", jSONObject, Math.min(j10, (long) TTAdConstant.AD_MAX_EVENT_TIME));
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("error_code", this.f11125g);
                jSONObject2.put("error_msg", this.f11126h);
                jSONObject2.put("error_url", this.f11127i);
                jSONObject2.putOpt("render_type", "h5");
                jSONObject2.putOpt("render_type_2", 0);
            } catch (Exception unused3) {
            }
            a("load_fail", jSONObject2);
        }
    }

    public void a(WebView webView, int i10, String str, String str2, String str3) {
        com.bytedance.sdk.component.utils.l.b("LandingPageLog", "onWebError: " + i10 + ", " + String.valueOf(str) + ", " + String.valueOf(str2));
        u uVar = this.f11143y;
        if (uVar != null) {
            uVar.g();
        }
        if (!(str3 != null && str3.startsWith("image")) && this.f11122d != 2) {
            this.f11122d = 3;
        }
        this.f11125g = i10;
        this.f11126h = str;
        this.f11127i = str2;
    }

    public void a(SSWebView sSWebView) {
        int I;
        Bitmap a10;
        com.bytedance.sdk.openadsdk.core.e.n nVar;
        if ((!"landingpage".equals(this.f11130l) && !"landingpage_endcard".equals(this.f11130l) && !"landingpage_split_screen".equals(this.f11130l) && !"landingpage_direct".equals(this.f11130l)) || (I = com.bytedance.sdk.openadsdk.core.m.h().I()) == 0 || new Random().nextInt(100) + 1 > I || sSWebView == null || sSWebView.getWebView() == null || sSWebView.getVisibility() != 0 || (a10 = v.a(sSWebView)) == null || (nVar = this.f11129k) == null) {
            return;
        }
        v.a(nVar, this.f11130l, "landing_page_blank", a10, sSWebView.getUrl(), this.f11121c);
    }

    public void a(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null) {
            TextUtils.isEmpty(webResourceRequest.getUrl().toString());
        }
    }

    private void a(String str, JSONObject jSONObject) {
        a(str, jSONObject, -1L);
    }

    private void a(String str, JSONObject jSONObject, long j10) {
        if (!this.f11141w || this.f11129k == null || TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObject2 = null;
        if (jSONObject != null) {
            try {
                int i10 = 1;
                jSONObject.put("is_playable", com.bytedance.sdk.openadsdk.core.e.p.a(this.f11129k) ? 1 : 0);
                if (!com.bytedance.sdk.openadsdk.core.video.b.a.a().a(this.f11129k)) {
                    i10 = 0;
                }
                jSONObject.put("usecache", i10);
            } catch (JSONException unused) {
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("ad_extra_data", jSONObject.toString());
                    if (j10 > 0) {
                        jSONObject3.put("duration", j10);
                    }
                } catch (JSONException unused2) {
                }
                jSONObject2 = jSONObject3;
            } catch (JSONException unused3) {
            }
        }
        com.bytedance.sdk.component.utils.l.b("LandingPageLog", "sendEvent: " + String.valueOf(this.f11130l) + ", " + String.valueOf(str) + ", ext=" + String.valueOf(jSONObject2));
        e.c(this.f11128j, this.f11129k, this.f11130l, str, jSONObject2);
    }
}
