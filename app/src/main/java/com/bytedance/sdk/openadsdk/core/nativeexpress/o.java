package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.b.u;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.w;
import com.bytedance.sdk.openadsdk.utils.s;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WebViewRender.java */
/* loaded from: classes.dex */
public class o extends com.bytedance.sdk.component.adexpress.d.a {

    /* renamed from: e  reason: collision with root package name */
    com.bytedance.sdk.openadsdk.utils.a f12666e;

    /* renamed from: f  reason: collision with root package name */
    private Context f12667f;

    /* renamed from: g  reason: collision with root package name */
    private String f12668g;

    /* renamed from: h  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.e.n f12669h;

    /* renamed from: i  reason: collision with root package name */
    private JSONObject f12670i;

    /* renamed from: j  reason: collision with root package name */
    private u f12671j;

    /* renamed from: k  reason: collision with root package name */
    private String f12672k;

    /* renamed from: l  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.b.n f12673l;

    /* renamed from: m  reason: collision with root package name */
    private final Map<String, r3.c> f12674m;

    /* renamed from: n  reason: collision with root package name */
    private w f12675n;

    /* renamed from: o  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.b.f f12676o;

    /* renamed from: p  reason: collision with root package name */
    private n.a f12677p;

    /* renamed from: q  reason: collision with root package name */
    private final Runnable f12678q;

    /* renamed from: r  reason: collision with root package name */
    private final Runnable f12679r;

    /* renamed from: s  reason: collision with root package name */
    private int f12680s;

    public o(Context context, com.bytedance.sdk.component.adexpress.b.l lVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, u uVar, com.bytedance.sdk.openadsdk.core.e.n nVar) {
        super(context, lVar, themeStatusBroadcastReceiver);
        this.f12674m = Collections.synchronizedMap(new HashMap());
        this.f12678q = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.o.1
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.d.a) o.this).f9465d.get()) {
                    return;
                }
                if (o.this.f12669h != null && o.this.f12669h.G() != null) {
                    o oVar = o.this;
                    ((com.bytedance.sdk.component.adexpress.d.a) oVar).f9464c = com.bytedance.sdk.component.adexpress.a.b.a.c(oVar.f12669h.G().b());
                }
                com.bytedance.sdk.openadsdk.core.k.d().post(o.this.f12679r);
            }
        };
        this.f12679r = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.o.2
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.d.a) o.this).f9465d.get() || o.this.f12676o == null) {
                    return;
                }
                o oVar = o.this;
                o.super.a(oVar.f12676o);
            }
        };
        this.f12680s = 8;
        SSWebView sSWebView = this.f9462a;
        if (sSWebView == null || sSWebView.getWebView() == null) {
            return;
        }
        this.f12667f = context;
        this.f12668g = lVar.b();
        this.f12669h = nVar;
        this.f12671j = uVar;
        this.f12670i = lVar.a();
        String e10 = com.bytedance.sdk.component.adexpress.a.b.a.e();
        this.f12672k = e10;
        a(s.b(e10));
        themeStatusBroadcastReceiver.a(this);
        n();
        m();
        o();
    }

    @Override // com.bytedance.sdk.component.adexpress.d.a
    public void f() {
        if (a() == null) {
            return;
        }
        try {
            a().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.d.a
    public void g() {
        w wVar = this.f12675n;
        if (wVar == null) {
            return;
        }
        wVar.a("expressWebviewRecycle", (JSONObject) null);
    }

    @Override // com.bytedance.sdk.component.adexpress.d.a
    public void j() {
        super.j();
        if (this.f12675n == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expressShow", true);
            this.f12675n.a("expressShow", jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.d.a
    protected void k() {
        com.bytedance.sdk.openadsdk.utils.a c10 = com.bytedance.sdk.openadsdk.core.h.d().c();
        this.f12666e = c10;
        if (c10 != null) {
            c10.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.adexpress.d.a
    public void l() {
        super.l();
        com.bytedance.sdk.openadsdk.utils.a aVar = this.f12666e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void m() {
        SSWebView sSWebView = this.f9462a;
        if (sSWebView == null || sSWebView.getWebView() == null) {
            return;
        }
        w wVar = new w(this.f12667f);
        this.f12675n = wVar;
        wVar.b(this.f9462a).a(this.f12669h).d(this.f12669h.Y()).e(this.f12669h.ac()).b(com.bytedance.sdk.openadsdk.utils.u.a(this.f12668g)).f(com.bytedance.sdk.openadsdk.utils.u.i(this.f12669h)).a(this).a(this.f12670i).a(this.f9462a).a(this.f12671j);
    }

    public void n() {
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.f12669h;
        if (nVar == null || nVar.G() == null) {
            return;
        }
        this.f12677p = this.f12669h.G();
    }

    public void o() {
        SSWebView sSWebView = this.f9462a;
        if (sSWebView == null || sSWebView.getWebView() == null) {
            return;
        }
        this.f9462a.setBackgroundColor(0);
        this.f9462a.setBackgroundResource(17170445);
        a(this.f9462a);
        if (a() != null) {
            this.f12673l = new com.bytedance.sdk.openadsdk.b.n(this.f12667f, this.f12669h, a().getWebView()).a(false);
        }
        this.f12673l.a(this.f12671j);
        this.f9462a.setWebViewClient(new g(this.f12667f, this.f12675n, this.f12669h, this.f12673l));
        this.f9462a.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.a.c(this.f12675n, this.f12673l));
        if (Build.VERSION.SDK_INT >= 17) {
            com.bytedance.sdk.component.adexpress.d.e.a().a(this.f9462a, this.f12675n);
        }
    }

    public w p() {
        return this.f12675n;
    }

    private void b(boolean z10) {
        if (this.f12675n == null || this.f9462a == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adVisible", z10);
            this.f12675n.a("expressAdShow", jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.d.a
    public void d() {
        if (this.f9465d.get()) {
            return;
        }
        w wVar = this.f12675n;
        if (wVar != null) {
            wVar.b();
            this.f12675n = null;
        }
        super.d();
        com.bytedance.sdk.openadsdk.core.k.d().removeCallbacks(this.f12679r);
        this.f12674m.clear();
    }

    @Override // com.bytedance.sdk.component.adexpress.d.a, com.bytedance.sdk.component.adexpress.b.d
    public void a(com.bytedance.sdk.component.adexpress.b.f fVar) {
        this.f12676o = fVar;
        com.bytedance.sdk.component.f.e.a().execute(this.f12678q);
    }

    private void a(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.a.b.a(this.f12667f).a(false).a(sSWebView.getWebView());
            sSWebView.setVerticalScrollBarEnabled(false);
            sSWebView.setHorizontalScrollBarEnabled(false);
            sSWebView.a(true);
            sSWebView.j();
            sSWebView.setUserAgentString(com.bytedance.sdk.openadsdk.utils.i.a(sSWebView.getWebView(), (int) BuildConfig.VERSION_CODE));
            if (Build.VERSION.SDK_INT >= 21) {
                sSWebView.setMixedContentMode(0);
            }
            sSWebView.setJavaScriptEnabled(true);
            sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
            sSWebView.setDomStorageEnabled(true);
            sSWebView.setDatabaseEnabled(true);
            sSWebView.setAppCacheEnabled(true);
            sSWebView.setAllowFileAccess(false);
            sSWebView.setSupportZoom(true);
            sSWebView.setBuiltInZoomControls(true);
            sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            sSWebView.setUseWideViewPort(true);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.l.e("WebViewRender", e10.toString());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.a
    public void b(int i10) {
        if (this.f12675n == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i10);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        this.f12675n.a("themeChange", jSONObject);
    }

    public static boolean b(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.d.a
    public SSWebView a() {
        return this.f9462a;
    }

    @Override // com.bytedance.sdk.component.adexpress.d.a
    public void a(int i10) {
        if (i10 == this.f12680s) {
            return;
        }
        this.f12680s = i10;
        b(i10 == 0);
    }
}
