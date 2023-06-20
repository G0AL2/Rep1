package com.bytedance.sdk.openadsdk.core.e;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.u;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.common.internal.ImagesContract;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MaterialMeta.java */
/* loaded from: classes.dex */
public class n {
    private long B;
    private int C;
    private int D;
    private l3.b E;
    private l3.b F;
    private boolean G;
    private int H;
    private Map<String, Object> I;
    private a J;
    private String K;
    private JSONObject L;
    private AdSlot S;
    private int T;
    private String V;
    private JSONObject Z;

    /* renamed from: ab  reason: collision with root package name */
    private int f12162ab;

    /* renamed from: ac  reason: collision with root package name */
    private String f12163ac;

    /* renamed from: ad  reason: collision with root package name */
    private String f12164ad;

    /* renamed from: ae  reason: collision with root package name */
    private i f12165ae;
    private String ah;
    private int ai;
    private int aj;
    private int ak;
    private int al;
    private int ap;
    private m aq;
    private p ar;
    private boolean as;
    private com.bytedance.sdk.openadsdk.core.j.a at;
    private boolean au;
    private String av;
    private JSONObject aw;
    private String ay;
    private d az;

    /* renamed from: b  reason: collision with root package name */
    private int f12167b;

    /* renamed from: c  reason: collision with root package name */
    private int f12168c;

    /* renamed from: d  reason: collision with root package name */
    private int f12169d;

    /* renamed from: e  reason: collision with root package name */
    private k f12170e;

    /* renamed from: f  reason: collision with root package name */
    private k f12171f;

    /* renamed from: g  reason: collision with root package name */
    private String f12172g;

    /* renamed from: i  reason: collision with root package name */
    private String f12174i;

    /* renamed from: m  reason: collision with root package name */
    private String f12178m;

    /* renamed from: n  reason: collision with root package name */
    private String f12179n;

    /* renamed from: o  reason: collision with root package name */
    private String f12180o;

    /* renamed from: q  reason: collision with root package name */
    private c f12182q;

    /* renamed from: r  reason: collision with root package name */
    private h f12183r;

    /* renamed from: s  reason: collision with root package name */
    private int f12184s;

    /* renamed from: t  reason: collision with root package name */
    private String f12185t;

    /* renamed from: u  reason: collision with root package name */
    private String f12186u;

    /* renamed from: v  reason: collision with root package name */
    private String f12187v;

    /* renamed from: a  reason: collision with root package name */
    public boolean f12160a = false;

    /* renamed from: h  reason: collision with root package name */
    private List<k> f12173h = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private List<String> f12175j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private List<String> f12176k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private List<String> f12177l = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    private String f12181p = "0";

    /* renamed from: w  reason: collision with root package name */
    private String f12188w = "";

    /* renamed from: x  reason: collision with root package name */
    private int f12189x = 0;

    /* renamed from: y  reason: collision with root package name */
    private int f12190y = 2;

    /* renamed from: z  reason: collision with root package name */
    private List<FilterWord> f12191z = new ArrayList();
    private int A = 0;
    private int M = 0;
    private int N = 1;
    private String O = "";
    private f P = new f();
    private int Q = AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
    private int R = 0;
    private int U = 1;
    private int W = 0;
    private int X = 0;
    private int Y = 0;

    /* renamed from: aa  reason: collision with root package name */
    private int f12161aa = 1;

    /* renamed from: af  reason: collision with root package name */
    private int f12166af = 1;
    private float ag = 100.0f;
    private int am = 2;
    private int an = 1;
    private int ao = 0;
    private int ax = 0;

    /* compiled from: MaterialMeta.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f12192a;

        /* renamed from: b  reason: collision with root package name */
        private String f12193b;

        /* renamed from: c  reason: collision with root package name */
        private String f12194c;

        /* renamed from: d  reason: collision with root package name */
        private String f12195d;

        /* renamed from: e  reason: collision with root package name */
        private String f12196e;

        /* renamed from: f  reason: collision with root package name */
        private String f12197f;

        /* renamed from: g  reason: collision with root package name */
        private String f12198g;

        public String a() {
            return this.f12197f;
        }

        public String b() {
            return this.f12192a;
        }

        public String c() {
            return this.f12193b;
        }

        public String d() {
            return this.f12194c;
        }

        public String e() {
            return this.f12195d;
        }

        public String f() {
            return this.f12196e;
        }

        public String g() {
            return this.f12198g;
        }

        public void a(String str) {
            this.f12197f = str;
        }

        public void b(String str) {
            this.f12192a = str;
        }

        public void c(String str) {
            this.f12193b = str;
        }

        public void d(String str) {
            this.f12194c = str;
        }

        public void e(String str) {
            this.f12195d = str;
        }

        public void f(String str) {
            this.f12196e = str;
        }

        public void g(String str) {
            this.f12198g = str;
        }
    }

    public static l3.c a(String str, n nVar) {
        u.a(nVar);
        nVar.A(0);
        nVar.B(0);
        return new l3.c(str, nVar.J(), nVar.aF(), nVar.aD(), nVar.aE());
    }

    public static boolean a(n nVar) {
        return (nVar == null || nVar.J() == null || nVar.J().l() == 0) ? false : true;
    }

    public static boolean a(n nVar, boolean z10, boolean z11, boolean z12) {
        l3.b bVar;
        if (a(nVar) || z12 || nVar == null || (bVar = nVar.E) == null || TextUtils.isEmpty(bVar.A())) {
            return false;
        }
        l3.b bVar2 = nVar.E;
        if (bVar2 == null || bVar2.a() != 1) {
            com.bytedance.sdk.component.utils.l.b("MaterialMeta", "can show end card follow js WebViewClient");
            return z10;
        }
        com.bytedance.sdk.component.utils.l.b("MaterialMeta", "can show end card follow js");
        return z11;
    }

    private JSONObject b(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    for (FilterWord filterWord2 : filterWord.getOptions()) {
                        jSONArray.put(b(filterWord2));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean b(n nVar) {
        l3.b bVar;
        return (nVar == null || (bVar = nVar.E) == null || bVar.a() != 1) ? false : true;
    }

    public static boolean c(n nVar) {
        if (nVar == null) {
            return false;
        }
        return nVar.aw() || nVar.ad() == 5 || nVar.ad() == 15 || nVar.ad() == 50;
    }

    public int A() {
        return this.f12161aa;
    }

    public void A(int i10) {
        this.ao = i10;
    }

    public int B() {
        return this.f12162ab;
    }

    public void B(int i10) {
        this.ap = i10;
    }

    public int C() {
        return this.D;
    }

    public void C(int i10) {
        this.ax = i10;
    }

    public String D() {
        return this.K;
    }

    public boolean E() {
        return C() == 100;
    }

    public int F() {
        return this.H;
    }

    public a G() {
        return this.J;
    }

    public com.bytedance.sdk.component.adexpress.a.c.c H() {
        if (G() == null) {
            return null;
        }
        String b10 = G().b();
        String d10 = G().d();
        String c10 = G().c();
        String e10 = G().e();
        String a10 = G().a();
        int f10 = u.f(this);
        com.bytedance.sdk.component.adexpress.a.c.c e11 = com.bytedance.sdk.component.adexpress.a.c.c.a().a(b10).b(c10).c(d10).d(e10).e(a10);
        return e11.f(f10 + "");
    }

    public int I() {
        i iVar = this.f12165ae;
        if (iVar == null) {
            return 0;
        }
        return iVar.a();
    }

    public l3.b J() {
        return this.E;
    }

    public String K() {
        return this.f12185t;
    }

    public int L() {
        return this.f12167b;
    }

    public k M() {
        return this.f12170e;
    }

    public k N() {
        return this.f12171f;
    }

    public String O() {
        return this.f12172g;
    }

    public List<k> P() {
        return this.f12173h;
    }

    public String Q() {
        return this.f12174i;
    }

    public List<String> R() {
        return this.f12175j;
    }

    public List<String> S() {
        return this.f12176k;
    }

    public List<String> T() {
        return this.f12177l;
    }

    public String U() {
        return this.f12178m;
    }

    public String V() {
        return this.f12179n;
    }

    public String W() {
        String str;
        if (TextUtils.isEmpty(this.f12180o)) {
            Context a10 = com.bytedance.sdk.openadsdk.core.m.a();
            int L = L();
            if (L != 2 && L != 3) {
                str = (L == 4 && a10 != null) ? "tt_video_download_apk" : "tt_video_mobile_go_detail";
                return this.f12180o;
            } else if (a10 == null) {
                return this.f12180o;
            }
            return t.a(a10, str);
        }
        return this.f12180o;
    }

    public String X() {
        return this.f12180o;
    }

    public String Y() {
        return this.f12181p;
    }

    public String Z() {
        return this.f12186u;
    }

    public m a() {
        return this.aq;
    }

    public void a(double d10) {
        this.an = (d10 == 2.0d || d10 == 1.0d) ? (int) d10 : 1;
    }

    public void a(float f10) {
        this.ag = f10;
    }

    public void a(int i10) {
        a(i10, -1);
    }

    public void a(int i10, int i11) {
        int i12;
        this.f12169d = i10;
        this.f12168c = i10;
        if (this.S == null) {
            this.f12168c = 0;
            return;
        }
        if (i11 <= 0) {
            i11 = u.e(this);
        }
        if (this.S.getNativeAdType() == 3 || this.S.getDurationSlotType() == 3 || i11 == 3) {
            i12 = 14;
        } else if (this.S.getNativeAdType() != 7 && this.S.getNativeAdType() != 8 && this.S.getDurationSlotType() != 7 && this.S.getDurationSlotType() != 8 && i11 != 7 && i11 != 8) {
            if (p.a(this)) {
                this.f12168c = 4;
                return;
            }
            if (this.f12169d == 4 && !p.a(this)) {
                this.f12168c = 0;
            }
            if (i10 >= 5) {
                this.f12168c = 0;
                return;
            } else if (this.f12169d == 2 && L() != 3) {
                this.f12168c = 0;
                return;
            } else if (i10 == 0 || (i10 == 1 && L() != 3)) {
                this.f12168c = 0;
                return;
            } else {
                return;
            }
        } else if (p.i(this)) {
            i12 = 12;
        } else if (!p.a(this)) {
            if (this.f12169d == 5 && !l.c(this)) {
                this.f12168c = 7;
            }
            if (this.f12169d == 6 && !l.b(this)) {
                this.f12168c = 7;
            }
            if (this.f12169d == 8 && C() != 100) {
                this.f12168c = 7;
            }
            if (i10 < 5) {
                this.f12168c = 7;
                return;
            }
            return;
        } else {
            i12 = 9;
        }
        this.f12168c = i12;
    }

    public void a(long j10) {
        this.B = j10;
    }

    public void a(AdSlot adSlot) {
        this.S = adSlot;
    }

    public void a(FilterWord filterWord) {
        this.f12191z.add(filterWord);
    }

    public void a(c cVar) {
        this.f12182q = cVar;
    }

    public void a(d dVar) {
        this.az = dVar;
    }

    public void a(f fVar) {
        this.P = fVar;
    }

    public void a(h hVar) {
        this.f12183r = hVar;
    }

    public void a(i iVar) {
        this.f12165ae = iVar;
    }

    public void a(k kVar) {
        this.f12170e = kVar;
    }

    public void a(m mVar) {
        this.aq = mVar;
    }

    public void a(a aVar) {
        this.J = aVar;
        com.bytedance.sdk.component.adexpress.a.c.c H = H();
        if (H != null) {
            com.bytedance.sdk.component.adexpress.a.b.a.a(H);
        }
    }

    public void a(p pVar) {
        this.ar = pVar;
    }

    public void a(com.bytedance.sdk.openadsdk.core.j.a aVar) {
        this.at = aVar;
    }

    public void a(String str) {
        this.f12188w = str;
    }

    public void a(Map<String, Object> map) {
        this.I = map;
    }

    public void a(l3.b bVar) {
        this.E = bVar;
    }

    public void a(JSONObject jSONObject) {
        this.Z = jSONObject;
    }

    public void a(boolean z10) {
        this.f12160a = z10;
    }

    public int aA() {
        JSONObject jSONObject = this.aw;
        if (jSONObject != null) {
            return jSONObject.optInt("easy_playable_skip_duration", 0);
        }
        return 0;
    }

    public JSONObject aB() {
        return this.aw;
    }

    public com.bytedance.sdk.component.widget.b.a aC() {
        com.bytedance.sdk.component.widget.b.a aVar = new com.bytedance.sdk.component.widget.b.a();
        aVar.a(this.H);
        aVar.b(this.f12181p);
        aVar.a(ac());
        return aVar;
    }

    public int aD() {
        return this.ao;
    }

    public int aE() {
        return this.ap;
    }

    public l3.b aF() {
        return this.F;
    }

    public boolean aG() {
        l3.b bVar = this.E;
        return bVar == null || bVar.H() != 1;
    }

    public JSONObject aH() {
        if (this.L == null) {
            try {
                if (!TextUtils.isEmpty(this.f12187v)) {
                    this.L = new JSONObject(this.f12187v);
                }
            } catch (JSONException unused) {
            }
        }
        return this.L;
    }

    public int aI() {
        return this.ax;
    }

    public String aJ() {
        return this.ay;
    }

    public c aa() {
        return this.f12182q;
    }

    public h ab() {
        return this.f12183r;
    }

    public String ac() {
        return this.f12187v;
    }

    public int ad() {
        return this.f12184s;
    }

    public List<FilterWord> ae() {
        return this.f12191z;
    }

    public String af() {
        return this.f12164ad;
    }

    public long ag() {
        return this.B;
    }

    public int ah() {
        return this.C;
    }

    public boolean ai() {
        return this.G;
    }

    public Map<String, Object> aj() {
        return this.I;
    }

    public JSONObject ak() {
        return this.Z;
    }

    public String al() {
        return this.V;
    }

    public int am() {
        if (this.f12166af != 2) {
            this.f12166af = 1;
        }
        return this.f12166af;
    }

    public float an() {
        if (this.ag <= 0.0f) {
            this.ag = 100.0f;
        }
        return (this.ag * 1000.0f) / 1000.0f;
    }

    public boolean ao() {
        if (this.f12173h.isEmpty()) {
            return false;
        }
        if (this.f12184s != 4 || this.f12173h.size() >= 3) {
            for (k kVar : this.f12173h) {
                if (!kVar.e()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean ap() {
        return !this.as && aq() == 1;
    }

    public int aq() {
        return this.A;
    }

    public JSONObject ar() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interaction_type", L());
            jSONObject.put("interaction_method", g());
            jSONObject.put("target_url", O());
            jSONObject.put("app_log_url", Z());
            jSONObject.put("gecko_id", af());
            jSONObject.put("extension", aB());
            jSONObject.put("ad_id", Y());
            jSONObject.put("source", K());
            jSONObject.put("screenshot", ai());
            jSONObject.put("dislike_control", aq());
            jSONObject.put("play_bar_show_time", z());
            jSONObject.put("play_bar_style", v());
            jSONObject.put("if_block_lp", m());
            jSONObject.put("cache_sort", A());
            jSONObject.put("if_sp_cache", B());
            jSONObject.put("render_control", l());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("cta", i());
            jSONObject2.put(InneractiveMediationNameConsts.OTHER, h());
            jSONObject.put("set_click_type", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("reward_name", j());
            jSONObject3.put("reward_amount", k());
            jSONObject.put("reward_data", jSONObject3);
            k M = M();
            if (M != null && !TextUtils.isEmpty(M.a())) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(ImagesContract.URL, M.a());
                jSONObject4.put("height", M.c());
                jSONObject4.put("width", M.b());
                jSONObject.put("icon", jSONObject4);
            }
            k N = N();
            if (N != null && !TextUtils.isEmpty(N.a())) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(ImagesContract.URL, N.a());
                jSONObject5.put("height", N.c());
                jSONObject5.put("width", N.b());
                jSONObject.put("cover_image", jSONObject5);
            }
            JSONObject ak = ak();
            if (ak != null) {
                jSONObject.put("session_params", ak);
            }
            f w10 = w();
            if (w10 != null) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("click_upper_content_area", w10.f12033a);
                jSONObject6.put("click_upper_non_content_area", w10.f12034b);
                jSONObject6.put("click_lower_content_area", w10.f12035c);
                jSONObject6.put("click_lower_non_content_area", w10.f12036d);
                jSONObject6.put("click_button_area", w10.f12037e);
                jSONObject6.put("click_video_area", w10.f12038f);
                jSONObject.put("click_area", jSONObject6);
            }
            AdSlot x10 = x();
            if (x10 != null) {
                jSONObject.put("adslot", x10.toJsonObj());
            }
            List<k> P = P();
            if (P != null) {
                JSONArray jSONArray = new JSONArray();
                for (k kVar : P) {
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put(ImagesContract.URL, kVar.a());
                    jSONObject7.put("height", kVar.c());
                    jSONObject7.put("width", kVar.b());
                    jSONObject7.put("image_preview", kVar.f());
                    jSONObject7.put("image_key", kVar.g());
                    jSONArray.put(jSONObject7);
                }
                jSONObject.put("image", jSONArray);
            }
            List<String> R = R();
            if (R != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (String str : R) {
                    jSONArray2.put(str);
                }
                jSONObject.put("show_url", jSONArray2);
            }
            List<String> S = S();
            if (S != null) {
                JSONArray jSONArray3 = new JSONArray();
                for (String str2 : S) {
                    jSONArray3.put(str2);
                }
                jSONObject.put("click_url", jSONArray3);
            }
            List<String> T = T();
            if (T != null) {
                JSONArray jSONArray4 = new JSONArray();
                for (String str3 : T) {
                    jSONArray4.put(str3);
                }
                jSONObject.put("play_start", jSONArray4);
            }
            jSONObject.put("phone_num", Q());
            jSONObject.put("title", U());
            jSONObject.put("description", V());
            jSONObject.put("ext", ac());
            jSONObject.put("image_mode", ad());
            jSONObject.put("cover_click_area", C());
            jSONObject.put("intercept_flag", y());
            jSONObject.put("button_text", W());
            jSONObject.put("ad_logo", u());
            jSONObject.put("video_adaptation", t());
            jSONObject.put("feed_video_opentype", p());
            jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, am());
            jSONObject.put("aspect_ratio", an());
            c aa2 = aa();
            if (aa2 != null) {
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put("app_name", aa2.b());
                jSONObject8.put("package_name", aa2.c());
                jSONObject8.put("download_url", aa2.a());
                jSONObject8.put("score", aa2.d());
                jSONObject8.put("comment_num", aa2.e());
                jSONObject8.put("app_size", aa2.f());
                jSONObject.put("app", jSONObject8);
            }
            h ab2 = ab();
            if (ab2 != null) {
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("deeplink_url", ab2.a());
                jSONObject9.put("fallback_url", ab2.b());
                jSONObject9.put("fallback_type", ab2.c());
                jSONObject.put("deep_link", jSONObject9);
            }
            List<FilterWord> ae2 = ae();
            if (ae2 != null) {
                JSONArray jSONArray5 = new JSONArray();
                for (FilterWord filterWord : ae2) {
                    JSONObject b10 = b(filterWord);
                    if (b10 != null) {
                        jSONArray5.put(b10);
                    }
                }
                jSONObject.put("filter_words", jSONArray5);
            }
            e().a(jSONObject);
            jSONObject.put("count_down", ah());
            jSONObject.put("expiration_time", ag());
            l3.b J = J();
            if (J != null) {
                jSONObject.put(DownloadResource.TYPE_VIDEO, J.G());
            }
            l3.b aF = aF();
            if (aF != null) {
                jSONObject.put("h265_video", aF.G());
            }
            JSONObject jSONObject10 = new JSONObject();
            jSONObject10.put("if_send_click", I());
            jSONObject.put("download_conf", jSONObject10);
            if (aj() != null) {
                JSONObject jSONObject11 = new JSONObject();
                Set<Map.Entry<String, Object>> entrySet = aj().entrySet();
                if (entrySet != null && !entrySet.isEmpty()) {
                    for (Map.Entry<String, Object> entry : entrySet) {
                        jSONObject11.put(entry.getKey(), entry.getValue());
                    }
                }
                jSONObject.put("media_ext", jSONObject11);
            }
            a G = G();
            if (G != null) {
                JSONObject jSONObject12 = new JSONObject();
                jSONObject12.put("id", G.b());
                jSONObject12.put("md5", G.c());
                jSONObject12.put(ImagesContract.URL, G.d());
                jSONObject12.put("data", G.e());
                jSONObject12.put("diff_data", G.f());
                jSONObject12.put(MediationMetaData.KEY_VERSION, G.a());
                jSONObject12.put("dynamic_creative", G.g());
                jSONObject.put("tpl_info", jSONObject12);
            }
            jSONObject.put("creative_extra", D());
            jSONObject.put("market_url", al());
            jSONObject.put("auction_price", s());
            jSONObject.put("ad_info", n());
            jSONObject.put("is_package_open", as());
            jSONObject.put("playable_duration_time", at());
            jSONObject.put("playable_endcard_close_time", au());
            jSONObject.put("endcard_close_time", av());
            JSONObject jSONObject13 = new JSONObject();
            jSONObject13.put("render_sequence", q());
            jSONObject13.put("backup_render_control", r());
            jSONObject.put("render", jSONObject13);
            if (this.aq == null) {
                m mVar = new m();
                this.aq = mVar;
                mVar.a("");
                this.aq.a(10L);
                this.aq.b(20L);
            }
            JSONObject jSONObject14 = new JSONObject();
            jSONObject14.put("onlylp_loading_maxtime", this.aq.a());
            jSONObject14.put("straight_lp_showtime", this.aq.b());
            jSONObject14.put("loading_text", this.aq.c());
            jSONObject.put("interaction_method_params", jSONObject14);
            JSONObject jSONObject15 = new JSONObject();
            jSONObject15.put("splash_clickarea", c());
            jSONObject15.put("splash_layout_id", d());
            jSONObject.put("splash_control", jSONObject15);
            if (this.au) {
                jSONObject.put("is_html", true);
                jSONObject.put("dsp_html", this.av);
            }
            if (this.as) {
                jSONObject.put("is_vast", true);
                jSONObject.put("vast_json", this.at.j());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public int as() {
        return this.ai;
    }

    public int at() {
        int i10 = this.aj;
        if (i10 > 0) {
            return i10;
        }
        return 20;
    }

    public int au() {
        return this.ak;
    }

    public int av() {
        return this.al;
    }

    public boolean aw() {
        return this.as;
    }

    public com.bytedance.sdk.openadsdk.core.j.a ax() {
        if (this.as) {
            return this.at;
        }
        return null;
    }

    public boolean ay() {
        return this.au;
    }

    public String az() {
        return this.av;
    }

    public d b() {
        return this.az;
    }

    public void b(double d10) {
        this.am = (d10 == 2.0d || d10 == 1.0d) ? (int) d10 : 2;
    }

    public void b(int i10) {
        this.f12168c = i10;
    }

    public void b(k kVar) {
        this.f12171f = kVar;
    }

    public void b(String str) {
        this.ah = str;
    }

    public void b(l3.b bVar) {
        this.F = bVar;
    }

    public void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f12167b = 4;
        this.f12181p = jSONObject.optString("id");
        this.f12185t = jSONObject.optString("source");
        c cVar = new c();
        this.f12182q = cVar;
        cVar.c(jSONObject.optString("pkg_name"));
        this.f12182q.b(jSONObject.optString("name"));
        this.f12182q.a(jSONObject.optString("download_url"));
    }

    public void b(boolean z10) {
        this.G = z10;
    }

    public int c() {
        d dVar = this.az;
        if (dVar == null) {
            return 2;
        }
        return dVar.a();
    }

    public void c(int i10) {
        this.f12189x = i10;
    }

    public void c(k kVar) {
        this.f12173h.add(kVar);
    }

    public void c(String str) {
        this.f12163ac = str;
    }

    public void c(JSONObject jSONObject) {
        this.aw = jSONObject;
    }

    public void c(boolean z10) {
        this.as = z10;
    }

    public int d() {
        d dVar = this.az;
        if (dVar == null) {
            return 1;
        }
        return dVar.b();
    }

    public void d(int i10) {
        this.f12190y = i10;
    }

    public void d(String str) {
        this.K = str;
    }

    public void d(boolean z10) {
        this.au = z10;
    }

    public p e() {
        return this.ar;
    }

    public void e(int i10) {
        this.W = i10;
    }

    public void e(String str) {
        this.f12185t = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f12181p.equals(nVar.f12181p) && this.f12187v.equals(nVar.f12187v);
    }

    public int f() {
        return this.f12168c;
    }

    public void f(int i10) {
        this.Y = i10;
    }

    public void f(String str) {
        this.f12172g = str;
    }

    public int g() {
        return this.f12169d;
    }

    public void g(int i10) {
        this.M = i10;
    }

    public void g(String str) {
        this.f12174i = str;
    }

    public int h() {
        return this.an;
    }

    public void h(int i10) {
        this.N = i10;
    }

    public void h(String str) {
        this.f12178m = str;
    }

    public int hashCode() {
        return (this.f12181p.hashCode() * 31) + this.f12187v.hashCode();
    }

    public int i() {
        return this.am;
    }

    public void i(int i10) {
        this.X = i10;
    }

    public void i(String str) {
        this.f12179n = str;
    }

    public String j() {
        return this.f12188w;
    }

    public void j(int i10) {
        this.U = i10;
    }

    public void j(String str) {
        this.f12180o = str;
    }

    public int k() {
        return this.f12189x;
    }

    public void k(int i10) {
        this.R = i10;
    }

    public void k(String str) {
        this.f12181p = str;
    }

    public int l() {
        int i10 = this.f12168c;
        if (i10 == 5 || i10 == 6) {
            return 1;
        }
        return this.f12190y;
    }

    public void l(int i10) {
        this.T = i10;
    }

    public void l(String str) {
        this.f12186u = str;
    }

    public int m() {
        return this.W;
    }

    public void m(int i10) {
        this.Q = i10;
    }

    public void m(String str) {
        this.f12187v = str;
    }

    public String n() {
        return this.ah;
    }

    public void n(int i10) {
        this.f12161aa = i10;
    }

    public void n(String str) {
        this.f12164ad = str;
    }

    public void o(int i10) {
        this.f12162ab = i10;
    }

    public void o(String str) {
        this.V = str;
    }

    public boolean o() {
        return this.W == 1;
    }

    public int p() {
        return this.Y;
    }

    public void p(int i10) {
        this.D = i10;
    }

    public void p(String str) {
        this.av = str;
    }

    public int q() {
        return this.M;
    }

    public void q(int i10) {
        this.H = i10;
    }

    public void q(String str) {
        this.ay = str;
    }

    public int r() {
        return this.N;
    }

    public void r(int i10) {
        this.f12167b = i10;
    }

    public String s() {
        return this.f12163ac;
    }

    public void s(int i10) {
        this.f12184s = i10;
    }

    public int t() {
        return this.X;
    }

    public void t(int i10) {
        this.C = i10;
    }

    public int u() {
        return this.U;
    }

    public void u(int i10) {
        this.f12166af = i10;
    }

    public int v() {
        if (aw()) {
            return 5;
        }
        if (an() != 100.0f || l() == 2) {
            return 0;
        }
        return this.R;
    }

    public void v(int i10) {
        this.A = i10;
    }

    public f w() {
        return this.P;
    }

    public void w(int i10) {
        this.ai = i10;
    }

    public AdSlot x() {
        return this.S;
    }

    public void x(int i10) {
        this.aj = i10;
    }

    public int y() {
        return this.T;
    }

    public void y(int i10) {
        this.ak = i10;
    }

    public int z() {
        return this.Q;
    }

    public void z(int i10) {
        this.al = i10;
    }
}
