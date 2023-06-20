package com.bytedance.sdk.openadsdk.component.reward.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.DownloadListener;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.a.r;
import com.bytedance.sdk.component.adexpress.c.c;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.b.n;
import com.bytedance.sdk.openadsdk.b.u;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.w;
import com.bytedance.sdk.openadsdk.g.h;
import com.bytedance.sdk.openadsdk.j.f;
import com.bytedance.sdk.openadsdk.utils.i;
import com.bytedance.sdk.openadsdk.utils.j;
import com.bytedance.sdk.openadsdk.utils.v;
import com.inmobi.media.au;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardFullWebViewManager.java */
/* loaded from: classes.dex */
public class f {
    private static final f.a I = new f.a() { // from class: com.bytedance.sdk.openadsdk.component.reward.a.f.6
        @Override // com.bytedance.sdk.openadsdk.j.f.a
        public void a(String str, String str2) {
            l.b(str, str2);
        }

        @Override // com.bytedance.sdk.openadsdk.j.f.a
        public void a(String str, String str2, Throwable th) {
            l.c(str, str2, th);
        }
    };
    private float A;
    private long B;
    private com.bytedance.sdk.openadsdk.common.c G;
    private boolean H;

    /* renamed from: a  reason: collision with root package name */
    w f11477a;

    /* renamed from: b  reason: collision with root package name */
    w f11478b;

    /* renamed from: d  reason: collision with root package name */
    protected String f11480d;

    /* renamed from: e  reason: collision with root package name */
    n f11481e;

    /* renamed from: i  reason: collision with root package name */
    protected u f11485i;

    /* renamed from: l  reason: collision with root package name */
    private Activity f11488l;

    /* renamed from: m  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.e.n f11489m;

    /* renamed from: n  reason: collision with root package name */
    private String f11490n;

    /* renamed from: o  reason: collision with root package name */
    private int f11491o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f11492p;

    /* renamed from: q  reason: collision with root package name */
    private int f11493q;

    /* renamed from: r  reason: collision with root package name */
    private int f11494r;

    /* renamed from: s  reason: collision with root package name */
    private SSWebView f11495s;

    /* renamed from: t  reason: collision with root package name */
    private SSWebView f11496t;

    /* renamed from: w  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.j.g f11499w;

    /* renamed from: x  reason: collision with root package name */
    private View f11500x;

    /* renamed from: y  reason: collision with root package name */
    private View f11501y;

    /* renamed from: z  reason: collision with root package name */
    private float f11502z;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f11479c = true;

    /* renamed from: u  reason: collision with root package name */
    private boolean f11497u = false;

    /* renamed from: f  reason: collision with root package name */
    AtomicBoolean f11482f = new AtomicBoolean(true);

    /* renamed from: g  reason: collision with root package name */
    int f11483g = 0;

    /* renamed from: h  reason: collision with root package name */
    String f11484h = "";

    /* renamed from: j  reason: collision with root package name */
    boolean f11486j = false;
    private SparseArray<c.a> C = new SparseArray<>();
    private boolean D = true;
    private float E = -1.0f;
    private float F = -1.0f;

    /* renamed from: k  reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.g.a f11487k = new com.bytedance.sdk.openadsdk.g.a() { // from class: com.bytedance.sdk.openadsdk.component.reward.a.f.4
        @Override // com.bytedance.sdk.openadsdk.g.a
        public int a() {
            int measuredHeight = f.this.f11495s != null ? f.this.f11495s.getMeasuredHeight() : -1;
            l.c("TTAndroidObject", "mWebView>>>>height=" + measuredHeight);
            return measuredHeight <= 0 ? v.d(m.a()) : measuredHeight;
        }

        @Override // com.bytedance.sdk.openadsdk.g.a
        public int b() {
            int measuredWidth = f.this.f11495s != null ? f.this.f11495s.getMeasuredWidth() : -1;
            l.c("TTAndroidObject", "mWebView>>>>width=" + measuredWidth);
            return measuredWidth <= 0 ? v.c(m.a()) : measuredWidth;
        }
    };

    /* renamed from: v  reason: collision with root package name */
    private boolean f11498v = false;

    /* compiled from: RewardFullWebViewManager.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(WebView webView, int i10);

        void a(WebView webView, String str);

        void a(WebView webView, String str, Bitmap bitmap);
    }

    public f(Activity activity) {
        this.f11488l = activity;
    }

    private u A() {
        return new u(p.a(this.f11489m) ? 3 : 2, this.f11492p ? "rewarded_video" : "fullscreen_interstitial_ad", this.f11489m);
    }

    private boolean z() {
        String str = this.f11480d;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    public void q() {
    }

    public void s() {
        u uVar = this.f11485i;
        if (uVar != null) {
            uVar.h();
        }
    }

    public void t() {
        n nVar = this.f11481e;
        if (nVar != null) {
            nVar.a(System.currentTimeMillis());
        }
    }

    public boolean u() {
        return this.f11486j;
    }

    public void v() {
        u uVar = this.f11485i;
        if (uVar != null) {
            uVar.c();
            this.f11485i.d();
        }
    }

    public void w() {
        u uVar = this.f11485i;
        if (uVar != null) {
            uVar.k();
        }
    }

    public boolean x() {
        w wVar = this.f11477a;
        if (wVar == null) {
            return false;
        }
        return wVar.j();
    }

    public boolean y() {
        SSWebView sSWebView = this.f11495s;
        return sSWebView == null || sSWebView.getWebView() == null;
    }

    public w e() {
        return this.f11477a;
    }

    public w f() {
        return this.f11478b;
    }

    public n g() {
        return this.f11481e;
    }

    public void h() {
        this.f11480d = p.d(this.f11489m);
        float an = this.f11489m.an();
        if (!TextUtils.isEmpty(this.f11480d)) {
            if (this.f11491o == 1) {
                if (this.f11480d.contains("?")) {
                    this.f11480d += "&orientation=portrait";
                } else {
                    this.f11480d += "?orientation=portrait";
                }
            }
            if (this.f11480d.contains("?")) {
                this.f11480d += "&height=" + this.f11494r + "&width=" + this.f11493q + "&aspect_ratio=" + an;
            } else {
                this.f11480d += "?height=" + this.f11494r + "&width=" + this.f11493q + "&aspect_ratio=" + an;
            }
        }
        if (p.a(this.f11489m)) {
            return;
        }
        this.f11480d = com.bytedance.sdk.openadsdk.utils.b.a(this.f11480d);
    }

    public void i() {
        SSWebView sSWebView;
        n nVar = this.f11481e;
        if (nVar != null && (sSWebView = this.f11495s) != null) {
            nVar.a(sSWebView);
        }
        this.f11495s = null;
        u uVar = this.f11485i;
        if (uVar != null) {
            uVar.a(true);
            this.f11485i.m();
        }
        w wVar = this.f11477a;
        if (wVar != null) {
            wVar.n();
        }
        n nVar2 = this.f11481e;
        if (nVar2 != null) {
            nVar2.f();
        }
        com.bytedance.sdk.openadsdk.j.g gVar = this.f11499w;
        if (gVar != null) {
            gVar.v();
        }
        this.f11488l = null;
    }

    public boolean j() {
        return this.f11482f.get();
    }

    public void k() {
        u uVar = this.f11485i;
        if (uVar != null) {
            uVar.j();
        }
        n nVar = this.f11481e;
        if (nVar != null) {
            nVar.e();
        }
    }

    public void l() {
        SSWebView sSWebView = this.f11495s;
        if (sSWebView != null) {
            sSWebView.k();
        }
        w wVar = this.f11477a;
        if (wVar != null) {
            wVar.m();
            this.f11477a.b(false);
            c(false);
            a(true, false);
        }
        com.bytedance.sdk.openadsdk.j.g gVar = this.f11499w;
        if (gVar != null) {
            gVar.q();
            this.f11499w.b(false);
        }
    }

    public void m() {
        SSWebView sSWebView = this.f11495s;
        if (sSWebView != null) {
            sSWebView.i();
        }
        w wVar = this.f11477a;
        if (wVar != null) {
            wVar.l();
            SSWebView sSWebView2 = this.f11495s;
            if (sSWebView2 != null) {
                if (sSWebView2.getVisibility() == 0) {
                    this.f11477a.b(true);
                    c(true);
                    a(false, true);
                } else {
                    this.f11477a.b(false);
                    c(false);
                    a(true, false);
                }
            }
        }
        n nVar = this.f11481e;
        if (nVar != null) {
            nVar.d();
        }
        com.bytedance.sdk.openadsdk.j.g gVar = this.f11499w;
        if (gVar != null) {
            gVar.r();
            if (v.d(this.f11495s)) {
                this.f11499w.b(true);
            }
        }
    }

    public int n() {
        return this.f11483g;
    }

    public String o() {
        return this.f11484h;
    }

    public String p() {
        return this.f11480d;
    }

    public void r() {
        u uVar = this.f11485i;
        if (uVar != null) {
            uVar.i();
        }
    }

    public SSWebView c() {
        return this.f11495s;
    }

    public SSWebView d() {
        return this.f11496t;
    }

    public void b() {
        if (!TextUtils.isEmpty(this.f11480d) && this.f11480d.contains("play.google.com/store")) {
            this.f11486j = true;
            return;
        }
        SSWebView sSWebView = this.f11495s;
        if (sSWebView == null || !this.f11479c) {
            return;
        }
        j.a(sSWebView, this.f11480d + "&is_pre_render=1");
    }

    public void c(boolean z10) {
        try {
            com.bytedance.sdk.openadsdk.j.g gVar = this.f11499w;
            if (gVar != null) {
                gVar.b(z10);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z10 ? 1 : 0);
            this.f11477a.a("viewableChange", jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void d(boolean z10) {
        Activity activity;
        if (this.f11477a == null || (activity = this.f11488l) == null || activity.isFinishing()) {
            return;
        }
        com.bytedance.sdk.openadsdk.j.g gVar = this.f11499w;
        if (gVar != null) {
            gVar.a(z10);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z10);
            this.f11477a.a("volumeChange", jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(com.bytedance.sdk.openadsdk.core.e.n nVar, String str, int i10, boolean z10) {
        if (this.f11498v) {
            return;
        }
        this.f11498v = true;
        this.f11489m = nVar;
        this.f11490n = str;
        this.f11491o = i10;
        this.f11492p = z10;
        a();
    }

    public void b(int i10, int i11) {
        this.f11493q = i10;
        this.f11494r = i11;
    }

    public void b(boolean z10) {
        Activity activity;
        if (this.f11477a == null || (activity = this.f11488l) == null || activity.isFinishing()) {
            return;
        }
        try {
            this.f11477a.b(z10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    void a() {
        com.bytedance.sdk.openadsdk.common.c cVar;
        this.f11500x = this.f11488l.findViewById(16908290);
        boolean d10 = com.bytedance.sdk.openadsdk.core.e.l.d(this.f11489m);
        this.H = d10;
        if (d10 && (cVar = this.G) != null) {
            this.f11495s = cVar.d();
        } else {
            Activity activity = this.f11488l;
            SSWebView sSWebView = (SSWebView) activity.findViewById(t.e(activity, "tt_reward_browser_webview"));
            this.f11495s = sSWebView;
            if (sSWebView != null && !com.bytedance.sdk.openadsdk.core.e.n.a(this.f11489m)) {
                this.f11495s.a();
            } else {
                v.a((View) this.f11495s, 8);
            }
        }
        Activity activity2 = this.f11488l;
        SSWebView sSWebView2 = (SSWebView) activity2.findViewById(t.e(activity2, "tt_browser_webview_loading"));
        this.f11496t = sSWebView2;
        if (sSWebView2 != null && !com.bytedance.sdk.openadsdk.core.e.n.a(this.f11489m)) {
            this.f11496t.a();
        } else {
            v.a((View) this.f11496t, 8);
        }
        SSWebView sSWebView3 = this.f11495s;
        if (sSWebView3 != null) {
            sSWebView3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.a.f.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (f.this.f11495s == null || f.this.f11495s.getViewTreeObserver() == null) {
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 16) {
                        f.this.f11495s.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        f.this.f11495s.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                    int measuredWidth = f.this.f11495s.getMeasuredWidth();
                    int measuredHeight = f.this.f11495s.getMeasuredHeight();
                    if (f.this.f11495s.getVisibility() == 0) {
                        f.this.a(measuredWidth, measuredHeight);
                    }
                }
            });
        }
        SSWebView sSWebView4 = this.f11496t;
        if (sSWebView4 != null) {
            sSWebView4.setLandingPage(true);
            this.f11496t.setTag(p.a(this.f11489m) ? this.f11490n : "landingpage_endcard");
            this.f11496t.setWebViewClient(new SSWebView.a());
            com.bytedance.sdk.openadsdk.core.e.n nVar = this.f11489m;
            if (nVar != null) {
                this.f11496t.setMaterialMeta(nVar.aC());
            }
        }
    }

    public void a(Boolean bool, String str, boolean z10, com.bytedance.sdk.openadsdk.g.e eVar, String str2) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("rit_scene", str);
        }
        if (p.a(this.f11489m)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 2);
        }
        this.f11485i = A();
        w wVar = new w(this.f11488l);
        this.f11477a = wVar;
        w a10 = wVar.b(this.f11495s).a(this.f11489m).d(this.f11489m.Y()).e(this.f11489m.ac()).b(bool.booleanValue() ? 7 : 5).a(this.f11487k).f(com.bytedance.sdk.openadsdk.utils.u.i(this.f11489m)).a(this.f11495s);
        if (z()) {
            str2 = "landingpage_endcard";
        }
        a10.c(str2).a(hashMap).a(this.f11485i);
        w wVar2 = new w(this.f11488l);
        this.f11478b = wVar2;
        wVar2.b(this.f11496t).a(this.f11489m).d(this.f11489m.Y()).e(this.f11489m.ac()).b(bool.booleanValue() ? 7 : 5).a(this.f11496t).f(com.bytedance.sdk.openadsdk.utils.u.i(this.f11489m)).a(this.f11485i);
        if (p.a(this.f11489m)) {
            a(eVar, z10);
        }
        this.f11477a.a(new h() { // from class: com.bytedance.sdk.openadsdk.component.reward.a.f.5
            @Override // com.bytedance.sdk.openadsdk.g.h
            public void a() {
                SSWebView sSWebView = f.this.f11495s;
                if (sSWebView == null) {
                    l.b("RewardFullWebViewManage", "webView has destroy when onPauseWebView");
                    return;
                }
                sSWebView.k();
                l.b("RewardFullWebViewManage", "js make webView onPause OK");
            }

            @Override // com.bytedance.sdk.openadsdk.g.h
            public void b() {
                SSWebView sSWebView = f.this.f11495s;
                if (sSWebView == null) {
                    l.b("RewardFullWebViewManage", "webView has destroy when onPauseWebViewTimers");
                    return;
                }
                sSWebView.n();
                l.b("RewardFullWebViewManage", "js make webView pauseTimers OK");
            }
        });
    }

    public void a(final com.bytedance.sdk.openadsdk.g.e eVar, boolean z10) {
        com.bytedance.sdk.component.f.g gVar;
        r a10;
        com.bytedance.sdk.openadsdk.j.g a11;
        if (com.bytedance.sdk.openadsdk.core.h.d().s()) {
            com.bytedance.sdk.openadsdk.j.f.a(I);
        }
        com.bytedance.sdk.openadsdk.j.a aVar = new com.bytedance.sdk.openadsdk.j.a() { // from class: com.bytedance.sdk.openadsdk.component.reward.a.f.7
            @Override // com.bytedance.sdk.openadsdk.j.a
            public com.bytedance.sdk.openadsdk.j.d a() {
                String f10 = com.bytedance.sdk.openadsdk.common.a.f();
                f10.hashCode();
                char c10 = 65535;
                switch (f10.hashCode()) {
                    case 1653:
                        if (f10.equals("2g")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 1684:
                        if (f10.equals("3g")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 1715:
                        if (f10.equals("4g")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1746:
                        if (f10.equals("5g")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 3649301:
                        if (f10.equals("wifi")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return com.bytedance.sdk.openadsdk.j.d.TYPE_2G;
                    case 1:
                        return com.bytedance.sdk.openadsdk.j.d.TYPE_3G;
                    case 2:
                        return com.bytedance.sdk.openadsdk.j.d.TYPE_4G;
                    case 3:
                        return com.bytedance.sdk.openadsdk.j.d.TYPE_5G;
                    case 4:
                        return com.bytedance.sdk.openadsdk.j.d.TYPE_WIFI;
                    default:
                        return com.bytedance.sdk.openadsdk.j.d.TYPE_UNKNOWN;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.j.a
            public void a(JSONObject jSONObject) {
            }

            @Override // com.bytedance.sdk.openadsdk.j.a
            public void b() {
                f.this.f11477a.d(true);
                com.bytedance.sdk.openadsdk.g.e eVar2 = eVar;
                if (eVar2 != null) {
                    eVar2.a();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.j.a
            public void b(JSONObject jSONObject) {
            }

            @Override // com.bytedance.sdk.openadsdk.j.a
            public void c(JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.b.e.b(m.a(), f.this.f11489m, f.this.f11490n, "playable_track", jSONObject);
            }
        };
        com.bytedance.sdk.openadsdk.j.c cVar = new com.bytedance.sdk.openadsdk.j.c() { // from class: com.bytedance.sdk.openadsdk.component.reward.a.f.8
            @Override // com.bytedance.sdk.openadsdk.j.c
            public void a(String str, JSONObject jSONObject) {
                f.this.f11477a.a(str, jSONObject);
            }
        };
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", this.f11489m.Y());
            jSONObject.put("log_extra", this.f11489m.ac());
            a11 = com.bytedance.sdk.openadsdk.j.g.a(m.a(), this.f11495s.getWebView(), cVar, aVar).f(this.f11480d).e(com.bytedance.sdk.openadsdk.common.a.a(m.a())).a(com.bytedance.sdk.openadsdk.common.a.a()).a(jSONObject).a("sdkEdition", com.bytedance.sdk.openadsdk.common.a.c()).b(com.bytedance.sdk.openadsdk.common.a.e()).d(com.bytedance.sdk.openadsdk.common.a.d()).c(false).a(z10);
            this.f11499w = a11;
        } catch (Throwable unused) {
            if (this.f11499w == null) {
                gVar = new com.bytedance.sdk.component.f.g("PlayablePlugin_init") { // from class: com.bytedance.sdk.openadsdk.component.reward.a.f.9
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("PlayablePlugin_is_null", true);
                            com.bytedance.sdk.openadsdk.h.b.a().a("PlayablePlugin_init", jSONObject2);
                        } catch (Exception unused2) {
                        }
                    }
                };
            }
        }
        if (a11 == null) {
            gVar = new com.bytedance.sdk.component.f.g("PlayablePlugin_init") { // from class: com.bytedance.sdk.openadsdk.component.reward.a.f.9
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("PlayablePlugin_is_null", true);
                        com.bytedance.sdk.openadsdk.h.b.a().a("PlayablePlugin_init", jSONObject2);
                    } catch (Exception unused2) {
                    }
                }
            };
            com.bytedance.sdk.component.f.e.a(gVar, 5);
        }
        if (this.f11499w != null && !TextUtils.isEmpty(p.b(this.f11489m))) {
            this.f11499w.c(p.b(this.f11489m));
        }
        com.bytedance.sdk.openadsdk.j.g gVar2 = this.f11499w;
        if (gVar2 != null) {
            Set<String> j10 = gVar2.j();
            final WeakReference weakReference = new WeakReference(this.f11499w);
            for (String str : j10) {
                if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (a10 = this.f11477a.a()) != null) {
                    a10.a(str, new com.bytedance.sdk.component.a.e<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.component.reward.a.f.10
                        @Override // com.bytedance.sdk.component.a.e
                        public JSONObject a(JSONObject jSONObject2, com.bytedance.sdk.component.a.f fVar) throws Exception {
                            try {
                                com.bytedance.sdk.openadsdk.j.g gVar3 = (com.bytedance.sdk.openadsdk.j.g) weakReference.get();
                                if (gVar3 == null) {
                                    return null;
                                }
                                return gVar3.c(a(), jSONObject2);
                            } catch (Throwable unused2) {
                                return null;
                            }
                        }
                    });
                }
            }
        }
    }

    public void a(int i10, int i11) {
        Activity activity;
        if (this.f11477a == null || (activity = this.f11488l) == null || activity.isFinishing()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", i10);
            jSONObject.put("height", i11);
            this.f11477a.a("resize", jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(boolean z10) {
        this.f11479c = z10;
    }

    public void a(int i10) {
        com.bytedance.sdk.openadsdk.core.e.n nVar;
        v.a((View) this.f11495s, i10);
        SSWebView sSWebView = this.f11495s;
        if (sSWebView != null) {
            v.a((View) sSWebView.getWebView(), i10);
        }
        if (this.f11495s == null || (nVar = this.f11489m) == null) {
            return;
        }
        if (nVar.E() || p.a(this.f11489m)) {
            this.f11495s.setLandingPage(true);
            this.f11495s.setTag(p.a(this.f11489m) ? this.f11490n : "landingpage_endcard");
            com.bytedance.sdk.openadsdk.core.e.n nVar2 = this.f11489m;
            if (nVar2 != null) {
                this.f11495s.setMaterialMeta(nVar2.aC());
            }
        }
    }

    public void a(com.bytedance.sdk.openadsdk.common.c cVar) {
        this.G = cVar;
    }

    public void a(float f10) {
        v.a(this.f11495s, f10);
    }

    public void a(String str, final a aVar) {
        SSWebView sSWebView;
        SSWebView sSWebView2 = this.f11495s;
        if (sSWebView2 != null && sSWebView2.getWebView() != null) {
            n a10 = new n(this.f11488l, this.f11489m, this.f11495s.getWebView()).a(true);
            this.f11481e = a10;
            a10.a(true);
            n nVar = this.f11481e;
            if (z()) {
                str = "landingpage_endcard";
            }
            nVar.a(str);
            this.f11495s.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.a.d(m.a(), this.f11477a, this.f11489m.Y(), this.f11481e, this.f11489m.E() || p.a(this.f11489m)) { // from class: com.bytedance.sdk.openadsdk.component.reward.a.f.11
                @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str2) {
                    super.onPageFinished(webView, str2);
                    u uVar = f.this.f11485i;
                    if (uVar != null) {
                        uVar.f();
                    }
                    if (f.this.f11499w != null) {
                        f.this.f11499w.h(str2);
                    }
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(webView, str2);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                    super.onPageStarted(webView, str2, bitmap);
                    u uVar = f.this.f11485i;
                    if (uVar != null) {
                        uVar.e();
                    }
                    if (f.this.f11499w != null) {
                        f.this.f11499w.g(str2);
                    }
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(webView, str2, bitmap);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i10, String str2, String str3) {
                    Log.i("RewardFullWebViewManage", "onReceivedError: description=" + str2 + "  url =" + str3);
                    if (f.this.a(str3)) {
                        return;
                    }
                    f.this.f11482f.set(false);
                    f fVar = f.this;
                    fVar.f11483g = i10;
                    fVar.f11484h = str2;
                    try {
                        if (fVar.f11499w != null) {
                            f.this.f11499w.a(i10, str2, str3);
                        }
                    } catch (Throwable unused) {
                    }
                    if (f.this.f11485i != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (Build.VERSION.SDK_INT >= 23) {
                                jSONObject.put(Analytics.Param.CODE, i10);
                                jSONObject.put("msg", str2);
                            }
                            f.this.f11485i.a(jSONObject);
                        } catch (JSONException unused2) {
                        }
                    }
                    super.onReceivedError(webView, i10, str2, str3);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
                @TargetApi(21)
                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    try {
                        if (f.this.f11499w != null) {
                            f.this.f11499w.a(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                        }
                    } catch (Throwable unused) {
                    }
                    if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                        Log.i("RewardFullWebViewManage", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest != null && !TextUtils.isEmpty(f.this.f11480d) && f.this.f11480d.equals(String.valueOf(webResourceRequest.getUrl()))) {
                        f.this.f11482f.set(false);
                        if (webResourceResponse != null) {
                            f.this.f11483g = webResourceResponse.getStatusCode();
                            f.this.f11484h = "onReceivedHttpError";
                        }
                    }
                    if (f.this.f11485i != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (Build.VERSION.SDK_INT >= 21 && webResourceResponse != null) {
                                jSONObject.put(Analytics.Param.CODE, webResourceResponse.getStatusCode());
                                jSONObject.put("msg", webResourceResponse.getReasonPhrase());
                            }
                            f.this.f11485i.a(jSONObject);
                        } catch (JSONException unused2) {
                        }
                    }
                    if (webResourceRequest != null) {
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                    if (p.a(f.this.f11489m)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        WebResourceResponse a11 = com.bytedance.sdk.openadsdk.core.video.b.a.a().a(f.this.f11489m.J().B(), f.this.f11489m.J().A(), str2);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (f.this.f11485i != null) {
                            c.a a12 = com.bytedance.sdk.component.adexpress.c.c.a(str2);
                            int i10 = a11 != null ? 1 : 2;
                            if (a12 == c.a.HTML) {
                                f.this.f11485i.a(str2, currentTimeMillis, currentTimeMillis2, i10);
                            } else if (a12 == c.a.JS) {
                                f.this.f11485i.b(str2, currentTimeMillis, currentTimeMillis2, i10);
                            }
                        }
                        return a11;
                    }
                    return super.shouldInterceptRequest(webView, str2);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
                @TargetApi(21)
                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    try {
                        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                    } catch (Throwable th) {
                        l.c("RewardFullWebViewManage", "shouldInterceptRequest error1", th);
                        return super.shouldInterceptRequest(webView, webResourceRequest);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
                @TargetApi(23)
                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    if (webResourceError != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                        Log.i("RewardFullWebViewManage", "onReceivedError WebResourceError : description=" + ((Object) webResourceError.getDescription()) + "  url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest == null || webResourceRequest.getUrl() == null || !f.this.a(webResourceRequest.getUrl().toString())) {
                        f.this.f11482f.set(false);
                        if (f.this.f11485i != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (Build.VERSION.SDK_INT >= 23 && webResourceError != null) {
                                    jSONObject.put(Analytics.Param.CODE, webResourceError.getErrorCode());
                                    jSONObject.put("msg", webResourceError.getDescription());
                                }
                                f.this.f11485i.a(jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                        if (webResourceError != null) {
                            f.this.f11483g = webResourceError.getErrorCode();
                            f.this.f11484h = String.valueOf(webResourceError.getDescription());
                        }
                        if (webResourceRequest == null) {
                            return;
                        }
                        super.onReceivedError(webView, webResourceRequest, webResourceError);
                    }
                }
            });
            if (this.f11489m.E() && (sSWebView = this.f11495s) != null && sSWebView.getWebView() != null) {
                this.f11495s.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.a.f.2
                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        int i10;
                        try {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                f.this.C = new SparseArray();
                                f.this.f11502z = motionEvent.getRawX();
                                f.this.A = motionEvent.getRawY();
                                f.this.B = System.currentTimeMillis();
                                try {
                                    long longValue = ((Long) f.this.f11495s.getWebView().getTag(t.e(m.a(), "tt_id_click_begin"))).longValue();
                                    if (longValue > 0 && longValue < f.this.B) {
                                        f.this.B = longValue;
                                        f.this.f11495s.setTag(t.e(m.a(), "tt_id_click_begin"), -1);
                                    }
                                } catch (Exception unused) {
                                }
                                f.this.E = -1.0f;
                                f.this.F = -1.0f;
                                i10 = 0;
                            } else if (actionMasked == 1) {
                                i10 = 3;
                            } else if (actionMasked != 2) {
                                i10 = actionMasked != 3 ? -1 : 4;
                            } else {
                                float rawX = motionEvent.getRawX();
                                float rawY = motionEvent.getRawY();
                                if (Math.abs(rawX - f.this.f11502z) >= m.f12516a || Math.abs(rawY - f.this.A) >= m.f12516a) {
                                    f.this.D = false;
                                }
                                f.this.E += Math.abs(motionEvent.getX() - f.this.f11502z);
                                f.this.F += Math.abs(motionEvent.getY() - f.this.A);
                                int i11 = (System.currentTimeMillis() - f.this.B <= 200 || (f.this.E <= 8.0f && f.this.F <= 8.0f)) ? 2 : 1;
                                if (f.this.H) {
                                    if (rawY - f.this.A > 8.0f) {
                                        f.this.G.a();
                                    }
                                    if (rawY - f.this.A < -8.0f) {
                                        f.this.G.b();
                                    }
                                }
                                i10 = i11;
                            }
                            f.this.C.put(motionEvent.getActionMasked(), new c.a(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
                            if (motionEvent.getAction() == 1 && view.getVisibility() == 0 && Float.valueOf(view.getAlpha()).intValue() == 1 && !f.this.f11497u) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("down_x", f.this.f11502z);
                                jSONObject.put("down_y", f.this.A);
                                jSONObject.put("down_time", f.this.B);
                                jSONObject.put("up_x", motionEvent.getRawX());
                                jSONObject.put("up_y", motionEvent.getRawY());
                                long currentTimeMillis = System.currentTimeMillis();
                                try {
                                    long longValue2 = ((Long) f.this.f11495s.getWebView().getTag(t.e(m.a(), "tt_id_click_end"))).longValue();
                                    if (longValue2 > 0 && longValue2 < currentTimeMillis) {
                                        try {
                                            f.this.f11495s.setTag(t.e(m.a(), "tt_id_click_end"), -1);
                                        } catch (Exception unused2) {
                                        }
                                        currentTimeMillis = longValue2;
                                    }
                                } catch (Exception unused3) {
                                }
                                jSONObject.put("up_time", currentTimeMillis);
                                int[] iArr = new int[2];
                                if (f.this.H) {
                                    f fVar = f.this;
                                    fVar.f11501y = fVar.f11488l.findViewById(t.e(m.a(), "tt_title_bar_feedback"));
                                } else {
                                    f fVar2 = f.this;
                                    fVar2.f11501y = fVar2.f11488l.findViewById(t.e(m.a(), "tt_top_dislike"));
                                }
                                if (f.this.f11501y != null) {
                                    f.this.f11501y.getLocationOnScreen(iArr);
                                    jSONObject.put("button_x", iArr[0]);
                                    jSONObject.put("button_y", iArr[1]);
                                    jSONObject.put("button_width", f.this.f11501y.getWidth());
                                    jSONObject.put("button_height", f.this.f11501y.getHeight());
                                }
                                if (f.this.f11500x != null) {
                                    int[] iArr2 = new int[2];
                                    f.this.f11500x.getLocationOnScreen(iArr2);
                                    jSONObject.put("ad_x", iArr2[0]);
                                    jSONObject.put("ad_y", iArr2[1]);
                                    jSONObject.put("width", f.this.f11500x.getWidth());
                                    jSONObject.put("height", f.this.f11500x.getHeight());
                                }
                                jSONObject.put("toolType", motionEvent.getToolType(0));
                                jSONObject.put("deviceId", motionEvent.getDeviceId());
                                jSONObject.put("source", motionEvent.getSource());
                                jSONObject.put("ft", com.bytedance.sdk.openadsdk.core.e.g.a(f.this.C, com.bytedance.sdk.openadsdk.core.h.d().b() ? 1 : 2));
                                jSONObject.put("user_behavior_type", f.this.D ? 1 : 2);
                                jSONObject.put("click_scence", 2);
                                if (f.this.f11492p) {
                                    com.bytedance.sdk.openadsdk.b.e.a(f.this.f11488l, f.this.f11489m, "rewarded_video", au.CLICK_BEACON, jSONObject);
                                } else {
                                    com.bytedance.sdk.openadsdk.b.e.a(f.this.f11488l, f.this.f11489m, "fullscreen_interstitial_ad", au.CLICK_BEACON, jSONObject);
                                }
                                f.this.f11497u = true;
                            }
                        } catch (Throwable th) {
                            Log.e("RewardFullWebViewManage", "TouchRecordTool onTouch error", th);
                        }
                        return false;
                    }
                });
            }
            this.f11495s.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.a.c(this.f11477a, this.f11481e) { // from class: com.bytedance.sdk.openadsdk.component.reward.a.f.3
                @Override // com.bytedance.sdk.openadsdk.core.widget.a.c, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i10) {
                    super.onProgressChanged(webView, i10);
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(webView, i10);
                    }
                }
            });
            a(this.f11495s);
            if (Build.VERSION.SDK_INT >= 24) {
                this.f11495s.setLayerType(1, null);
            }
            this.f11495s.setBackgroundColor(-1);
            this.f11495s.setDisplayZoomControls(false);
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.f11489m;
        return nVar != null && nVar.E() && str.endsWith(".mp4");
    }

    public void a(DownloadListener downloadListener) {
        SSWebView sSWebView = this.f11495s;
        if (sSWebView == null || downloadListener == null) {
            return;
        }
        sSWebView.setDownloadListener(downloadListener);
    }

    public void a(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.a.b.a(this.f11488l).a(false).b(false).a(sSWebView.getWebView());
        sSWebView.setUserAgentString(i.a(sSWebView.getWebView(), (int) BuildConfig.VERSION_CODE));
        if (Build.VERSION.SDK_INT >= 21) {
            sSWebView.setMixedContentMode(0);
        }
    }

    public void a(boolean z10, boolean z11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z10);
            jSONObject.put("endcard_show", z11);
            this.f11477a.a("endcard_control_event", jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(boolean z10, int i10, String str) {
        u uVar = this.f11485i;
        if (uVar == null) {
            return;
        }
        if (z10) {
            uVar.b();
        } else {
            uVar.a(i10, str);
        }
    }
}
