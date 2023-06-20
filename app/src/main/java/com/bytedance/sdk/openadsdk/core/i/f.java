package com.bytedance.sdk.openadsdk.core.i;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.i;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.u;
import com.chartboost.sdk.Privacy.model.COPPA;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.api.Api;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTSdkSettings.java */
/* loaded from: classes.dex */
public class f implements b {

    /* renamed from: c  reason: collision with root package name */
    public static String f12351c;

    /* renamed from: d  reason: collision with root package name */
    public static String f12352d;

    /* renamed from: e  reason: collision with root package name */
    public static String f12353e;

    /* renamed from: f  reason: collision with root package name */
    static ArrayList<String> f12354f;
    private String M;
    private String N;
    private String O;
    private int Q;
    private String R;
    private String T;
    private int U;
    private int V;

    /* renamed from: i  reason: collision with root package name */
    private String f12367i;

    /* renamed from: j  reason: collision with root package name */
    private String f12368j;

    /* renamed from: l  reason: collision with root package name */
    private String f12370l;

    /* renamed from: s  reason: collision with root package name */
    private String f12373s;

    /* renamed from: v  reason: collision with root package name */
    private String f12376v;

    /* renamed from: w  reason: collision with root package name */
    private String f12377w;

    /* renamed from: x  reason: collision with root package name */
    private String f12378x;

    /* renamed from: y  reason: collision with root package name */
    private String f12379y;

    /* renamed from: n  reason: collision with root package name */
    private static final String f12355n = u.m();

    /* renamed from: p  reason: collision with root package name */
    private static final String f12356p = null;

    /* renamed from: q  reason: collision with root package name */
    private static final String f12357q = null;

    /* renamed from: r  reason: collision with root package name */
    private static final String f12358r = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f12349a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f12350b = "IABTCF_TCString";

    /* renamed from: g  reason: collision with root package name */
    private int f12365g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: h  reason: collision with root package name */
    private Map<String, a> f12366h = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private Set<String> f12369k = new HashSet();

    /* renamed from: m  reason: collision with root package name */
    private Set<String> f12371m = Collections.synchronizedSet(new HashSet());

    /* renamed from: o  reason: collision with root package name */
    private Set<String> f12372o = Collections.synchronizedSet(new HashSet());

    /* renamed from: t  reason: collision with root package name */
    private int f12374t = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: u  reason: collision with root package name */
    private int f12375u = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: z  reason: collision with root package name */
    private int f12380z = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private int A = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private int B = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private long C = 0;
    private Set<String> D = Collections.synchronizedSet(new HashSet());
    private Set<String> E = Collections.synchronizedSet(new HashSet());
    private int F = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private int G = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private long H = 2147483647L;
    private int I = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private int J = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private int K = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private int L = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private int P = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private int S = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private String W = null;
    private String X = null;
    private boolean Y = false;
    private String Z = "";

    /* renamed from: aa  reason: collision with root package name */
    private int f12359aa = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: ab  reason: collision with root package name */
    private int f12360ab = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: ac  reason: collision with root package name */
    private int f12361ac = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: ad  reason: collision with root package name */
    private int f12362ad = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: ae  reason: collision with root package name */
    private int f12363ae = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: af  reason: collision with root package name */
    private int f12364af = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private int ag = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private int ah = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private final Set<String> ai = Collections.synchronizedSet(new HashSet());
    private volatile boolean aj = false;
    private int al = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private float am = 2.1474836E9f;
    private int an = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private int ao = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private int ap = 30;
    private final com.bytedance.sdk.component.utils.u ak = com.bytedance.sdk.component.utils.u.a("tt_sdk_settings", m.a());

    static {
        try {
            f12351c = t.a(m.a(), "tt_txt_skip");
            f12352d = t.a(m.a(), "tt_feedback_submit_text");
            f12353e = t.a(m.a(), "tt_feedback_thank_text") + "\n" + t.a(m.a(), "tt_feedback_experience_text");
            f12354f = new ArrayList<>(Arrays.asList("ja", "en", "ko", "zh", "th", "vi", "id", "ru", "ar", "fr", "de", "it", "es", "hi", "pt", "zh-Hant"));
        } catch (Throwable unused) {
        }
    }

    private void J() {
        this.f12377w = null;
        this.f12376v = null;
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "ab_test_version");
            com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "ab_test_param");
            return;
        }
        this.ak.c("ab_test_version");
        this.ak.c("ab_test_param");
    }

    private int a(boolean z10) {
        return z10 ? 20 : 5;
    }

    private static a b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("code_id");
        int optInt = jSONObject.optInt("auto_play", 1);
        int optInt2 = jSONObject.optInt("voice_control", 1);
        int optInt3 = jSONObject.optInt("rv_preload", 2);
        int optInt4 = jSONObject.optInt("nv_preload", 1);
        int optInt5 = jSONObject.optInt("proportion_watching", 100);
        int optInt6 = jSONObject.optInt("skip_time_displayed", 0);
        int optInt7 = jSONObject.optInt("video_skip_result", 2);
        int optInt8 = jSONObject.optInt("reg_creative_control", 1);
        int optInt9 = jSONObject.optInt("play_bar_show_time", 3);
        int optInt10 = jSONObject.optInt("rv_skip_time", -1);
        int optInt11 = jSONObject.optInt("voice_control", 2);
        int optInt12 = jSONObject.optInt("if_show_win", 1);
        int optInt13 = jSONObject.optInt("sp_preload", 2);
        int optInt14 = jSONObject.optInt("stop_time", 1500);
        int optInt15 = jSONObject.optInt("native_playable_delay", 2);
        int optInt16 = jSONObject.optInt("time_out_control", -1);
        int optInt17 = jSONObject.optInt("playable_close_time", -1);
        int optInt18 = jSONObject.optInt("playable_reward_type", 0);
        int optInt19 = jSONObject.optInt("reward_is_callback", 0);
        int optInt20 = jSONObject.optInt("iv_skip_time", 5);
        JSONArray optJSONArray = jSONObject.optJSONArray("parent_tpl_ids");
        int optInt21 = jSONObject.optInt("slot_type", 2);
        boolean optBoolean = jSONObject.optBoolean("close_on_click", false);
        int optInt22 = jSONObject.optInt("allow_system_back", 0);
        int optInt23 = jSONObject.optInt("splash_skip_time", 0);
        int optInt24 = jSONObject.optInt("splash_image_count_down_time", 5);
        if (!k(optInt2)) {
            optInt2 = 1;
        }
        return a.a().a(optString).k(optInt).l(optInt2).m(optInt3).n(optInt4).o(optInt5).p(optInt6).q(optInt7).r(optInt8).j(optInt9).i(optInt10).h(!k(optInt11) ? 1 : optInt11).s(optInt12).e(optInt13).f(optInt14).g(optInt15).d(optInt16).b(optInt18).c(optInt19).a(optInt17).t(optInt21).u(optInt20).a(optJSONArray).a(optBoolean).v(optInt22).w(optInt23).x(optInt24);
    }

    private void c(JSONObject jSONObject) {
        String b10;
        if (jSONObject == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            b10 = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "dyn_draw_engine_url", f12355n);
        } else {
            b10 = this.ak.b("dyn_draw_engine_url", f12355n);
        }
        this.W = jSONObject.optString("dyn_draw_engine_url", f12355n);
        l.e("TemplateManager", "settinng---TTDynamic.init().....oldDynDrawEngineUrl=" + b10);
        l.e("TemplateManager", "settinng---TTDynamic.init().....newmDynDrawEngineUrl=" + this.W);
        if (TextUtils.isEmpty(b10) || TextUtils.isEmpty(this.W) || this.W.equals(b10)) {
            return;
        }
        l.b("TemplateManager", "Reinitialize the template TTDynamic.init().....");
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        com.bytedance.sdk.component.adexpress.a.b.b.a().g();
        com.bytedance.sdk.component.adexpress.a.b.b.a().b(false);
        com.bytedance.sdk.component.adexpress.a.b.a.b();
        com.bytedance.sdk.component.adexpress.a.b.b.a().b();
    }

    private void d(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("is_gdpr_user", -1);
        this.S = optInt;
        if (optInt == -1 || optInt == 1 || optInt == 0) {
            return;
        }
        this.S = -1;
    }

    private int e(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("splash_load_type", 1);
        this.f12380z = optInt;
        if (optInt == 0 || optInt == 1 || optInt == 2 || optInt == 3) {
            return optInt;
        }
        return 1;
    }

    private int f(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("splash_check_type", 1);
        this.A = optInt;
        if (optInt == 0 || optInt == 1) {
            return optInt;
        }
        return 1;
    }

    private static boolean k(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public int A() {
        if (this.f12362ad == Integer.MAX_VALUE) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.f12362ad = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "privacy_personalized_ad", (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
            } else {
                this.f12362ad = this.ak.b("privacy_personalized_ad", Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
        }
        int i10 = this.f12362ad;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int o10 = u.o();
        if (o10 == 1 || o10 == 2) {
            return 2;
        }
        return o10 != 3 ? 0 : 1;
    }

    public boolean B() {
        if (this.f12363ae == Integer.MAX_VALUE) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.f12363ae = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "privacy_sladar_enable", (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
            } else {
                this.f12363ae = this.ak.b("privacy_sladar_enable", Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
        }
        return this.f12363ae == 1;
    }

    public boolean C() {
        if (this.ag == Integer.MAX_VALUE) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.ag = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "privacy_sec_enable", (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
            } else {
                this.ag = this.ak.b("privacy_sec_enable", Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
        }
        if ("VA".equalsIgnoreCase(w()) || u.o() == 3) {
            return false;
        }
        int i10 = this.ag;
        if (i10 == 1) {
            return true;
        }
        if (i10 == 0) {
            return false;
        }
        int o10 = u.o();
        return o10 == 1 || o10 == 2 || o10 == 3;
    }

    public boolean D() {
        if (this.ah == Integer.MAX_VALUE) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.ah = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "privacy_debug_unlock", (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
            } else {
                this.ah = this.ak.b("privacy_debug_unlock", Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
        }
        return this.ah != 0;
    }

    public boolean E() {
        return this.aj;
    }

    public boolean F() {
        if (this.am == 2.1474836E9f) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.am = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "global_rate", 1.0f);
            } else {
                this.am = this.ak.b("global_rate", 1.0f);
            }
        }
        return this.am == 1.0f;
    }

    public boolean G() {
        if (this.al == Integer.MAX_VALUE) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.al = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "read_video_from_cache", 1);
            } else {
                this.al = this.ak.b("read_video_from_cache", 1);
            }
        }
        return this.al == 1;
    }

    public int H() {
        if (this.L == Integer.MAX_VALUE) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.L = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "webview_cache_count", 20);
            } else {
                this.L = this.ak.b("webview_cache_count", 20);
            }
        }
        int i10 = this.L;
        if (i10 < 0) {
            return 20;
        }
        return i10;
    }

    public int I() {
        return this.ap;
    }

    @Override // com.bytedance.sdk.openadsdk.core.i.b
    public synchronized void a() {
        this.aj = true;
        int i10 = 0;
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            this.f12373s = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "xpath", "");
            this.H = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "duration", 10000L);
            this.I = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "max", 50);
            this.f12374t = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "download_config_dl_network", 1);
            this.f12375u = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "download_config_dl_size", 30);
            this.J = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "vbtt", 5);
            this.K = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "fetch_template", 3600);
            this.f12370l = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "template_ids", (String) null);
            this.f12376v = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "ab_test_version", (String) null);
            this.f12377w = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "ab_test_param", (String) null);
            this.f12378x = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "pyload_h5", (String) null);
            this.f12379y = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "playableLoadH5Url", (String) null);
            this.f12380z = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "splash_load_type", 1);
            this.A = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "splash_check_type", 1);
            this.F = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "if_both_open", 0);
            this.G = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "support_tnc", 1);
            this.Z = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "force_language", "");
            this.f12359aa = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "fetch_tpl_timeout_ctrl", (int) AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
            this.an = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "disable_rotate_banner_on_dislike", (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f12360ab = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "max_tpl_cnts", 100);
            this.f12367i = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "tpl_infos", (String) null);
            this.f12368j = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "insert_js_config", (String) null);
            this.B = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "app_list_control", 0);
            this.C = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "hit_app_list_time", 0L);
            this.M = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "ads_url", f12357q);
            this.N = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "app_log_url", f12356p);
            this.O = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "apm_url", "");
            this.P = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", COPPA.COPPA_STANDARD, -99);
            this.Q = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "ccpa", -1);
            h.d().d(this.P);
            this.R = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "policy_url", f12358r);
            this.T = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "consent_url", "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html");
            this.V = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "ivrv_downward", 0);
            this.S = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "isGdprUser", -1);
            this.W = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "dyn_draw_engine_url", f12355n);
            this.X = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "dc", (String) null);
            this.f12361ac = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "privacy_ad_enable", (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f12362ad = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "privacy_personalized_ad", (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f12363ae = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "privacy_sladar_enable", (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f12364af = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "privacy_app_log_enable", (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.ag = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "privacy_sec_enable", (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.ah = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "privacy_debug_unlock", (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
            String b10 = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "privacy_fields_allowed", (String) null);
            this.L = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "webview_cache_count", 20);
            Set<String> set = this.f12372o;
            if (set != null) {
                set.clear();
            }
            Set<String> b11 = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "gecko_hosts", (Set<String>) null);
            this.f12372o = b11;
            this.f12372o = a(b11);
            this.am = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "global_rate", 1.0f);
            this.f12365g = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "sp_key_if_sp_cache", 0);
            this.ao = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "landingpage_new_style", (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
            if (!TextUtils.isEmpty(b10)) {
                try {
                    JSONArray jSONArray = new JSONArray(b10);
                    int length = jSONArray.length();
                    this.ai.clear();
                    for (int i11 = 0; i11 < length; i11++) {
                        this.ai.add(jSONArray.getString(i11));
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
            this.D.clear();
            Set<String> b12 = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "hit_app_list_data", (Set<String>) null);
            if (b12 != null && !b12.isEmpty()) {
                for (String str : b12) {
                    this.D.add(str);
                }
            }
            this.E.clear();
            Set<String> b13 = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "scheme_list_data", (Set<String>) null);
            if (b13 != null && !b13.isEmpty()) {
                for (String str2 : b13) {
                    this.E.add(str2);
                }
            }
            String b14 = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "ad_slot_conf", (String) null);
            if (!TextUtils.isEmpty(b14)) {
                try {
                    JSONArray jSONArray2 = new JSONArray(b14);
                    int length2 = jSONArray2.length();
                    if (length2 > 0) {
                        this.f12366h.clear();
                        while (i10 < length2) {
                            a b15 = b(jSONArray2.optJSONObject(i10));
                            if (b15 != null) {
                                this.f12366h.put(b15.f12311a, b15);
                            }
                            i10++;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            this.al = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "read_video_from_cache", 1);
            this.ap = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "blank_detect_rate", 30);
            return;
        }
        this.f12373s = this.ak.b("xpath", "");
        this.H = this.ak.b("duration", 10000L);
        this.I = this.ak.b("max", 50);
        this.f12374t = this.ak.b("download_config_dl_network", 1);
        this.f12375u = this.ak.b("download_config_dl_size", 30);
        this.K = this.ak.b("fetch_template", 3600);
        this.f12376v = this.ak.a("ab_test_version");
        this.f12377w = this.ak.a("ab_test_param");
        this.J = this.ak.b("vbtt", 5);
        this.f12370l = this.ak.b("template_ids", (String) null);
        this.f12378x = this.ak.b("pyload_h5", (String) null);
        this.f12379y = this.ak.b("playableLoadH5Url", (String) null);
        this.f12380z = this.ak.b("splash_load_type", 1);
        this.A = this.ak.b("splash_check_type", 1);
        this.F = this.ak.b("if_both_open", 0);
        this.G = this.ak.b("support_tnc", 1);
        this.f12367i = this.ak.b("tpl_infos", (String) null);
        this.f12368j = this.ak.b("insert_js_config", (String) null);
        this.B = this.ak.b("app_list_control", 0);
        this.Z = this.ak.b("force_language", "");
        this.f12359aa = this.ak.b("fetch_tpl_timeout_ctrl", AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
        this.an = this.ak.b("disable_rotate_banner_on_dislike", Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f12360ab = this.ak.b("max_tpl_cnts", 100);
        this.C = this.ak.b("hit_app_list_time", 0L);
        this.M = this.ak.a("ads_url");
        this.N = this.ak.a("app_log_url");
        this.O = this.ak.a("apm_url");
        this.P = this.ak.b(COPPA.COPPA_STANDARD, -99);
        this.Q = this.ak.b("ccpa", -1);
        h.d().d(this.P);
        this.R = this.ak.b("policy_url", f12358r);
        this.T = this.ak.b("consent_url", "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html");
        this.V = this.ak.b("ivrv_downward", 0);
        this.W = this.ak.b("dyn_draw_engine_url", f12355n);
        this.X = this.ak.a("dc");
        this.S = this.ak.b("isGdprUser", -1);
        this.f12361ac = this.ak.b("privacy_ad_enable", Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f12362ad = this.ak.b("privacy_personalized_ad", Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f12363ae = this.ak.b("privacy_sladar_enable", Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f12364af = this.ak.b("privacy_app_log_enable", Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.ag = this.ak.b("privacy_sec_enable", Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.ah = this.ak.b("privacy_debug_unlock", Api.BaseClientBuilder.API_PRIORITY_OTHER);
        Set<String> set2 = this.f12372o;
        if (set2 != null) {
            set2.clear();
        }
        Set<String> b16 = this.ak.b("gecko_hosts", (Set<String>) null);
        this.f12372o = b16;
        this.f12372o = a(b16);
        this.am = this.ak.b("global_rate", 1.0f);
        this.f12365g = this.ak.b("sp_key_if_sp_cache", 0);
        this.ao = this.ak.b("landingpage_new_style", Api.BaseClientBuilder.API_PRIORITY_OTHER);
        String b17 = this.ak.b("privacy_fields_allowed", (String) null);
        if (!TextUtils.isEmpty(b17)) {
            try {
                JSONArray jSONArray3 = new JSONArray(b17);
                int length3 = jSONArray3.length();
                this.ai.clear();
                for (int i12 = 0; i12 < length3; i12++) {
                    this.ai.add(jSONArray3.getString(i12));
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
        this.D.clear();
        Set<String> b18 = this.ak.b("hit_app_list_data", (Set<String>) null);
        if (b18 != null && !b18.isEmpty()) {
            for (String str3 : b18) {
                this.D.add(str3);
            }
        }
        this.E.clear();
        Set<String> b19 = this.ak.b("scheme_list_data", (Set<String>) null);
        if (b19 != null && !b19.isEmpty()) {
            for (String str4 : b19) {
                this.E.add(str4);
            }
        }
        String b20 = this.ak.b("ad_slot_conf", (String) null);
        if (!TextUtils.isEmpty(b20)) {
            try {
                JSONArray jSONArray4 = new JSONArray(b20);
                int length4 = jSONArray4.length();
                if (length4 > 0) {
                    this.f12366h.clear();
                    while (i10 < length4) {
                        a b21 = b(jSONArray4.optJSONObject(i10));
                        if (b21 != null) {
                            this.f12366h.put(b21.f12311a, b21);
                        }
                        i10++;
                    }
                }
            } catch (Exception unused2) {
            }
        }
        this.al = this.ak.b("read_video_from_cache", 1);
        this.L = this.ak.b("webview_cache_count", 20);
        this.ap = this.ak.b("blank_detect_rate", 30);
        return;
    }

    public boolean g() {
        if (this.ao == Integer.MAX_VALUE) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.ao = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "landingpage_new_style", -1);
            } else {
                this.ao = this.ak.b("landingpage_new_style");
            }
        }
        return this.ao == 1;
    }

    public long h() {
        if (this.H == 2147483647L) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.H = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "duration", 10000L);
            } else {
                this.H = this.ak.b("duration", 10000L);
            }
        }
        return this.H;
    }

    public int i() {
        if (this.I == Integer.MAX_VALUE) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.I = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "max", 50);
            } else {
                this.I = this.ak.b("max", 50);
            }
        }
        return this.I;
    }

    public String j() {
        if (TextUtils.isEmpty(this.f12378x)) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.f12378x = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "pyload_h5", (String) null);
            } else {
                this.f12378x = this.ak.b("pyload_h5", (String) null);
            }
        }
        return this.f12378x;
    }

    public c k() {
        if (TextUtils.isEmpty(this.f12368j)) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.f12368j = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "insert_js_config", (String) null);
            } else {
                this.f12368j = this.ak.b("insert_js_config", (String) null);
            }
        }
        return new c(this.f12368j);
    }

    public String l() {
        if (TextUtils.isEmpty(this.f12379y)) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.f12379y = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "playableLoadH5Url", (String) null);
            } else {
                this.f12379y = this.ak.b("playableLoadH5Url", (String) null);
            }
        }
        return this.f12379y;
    }

    public int m() {
        if (this.f12359aa == Integer.MAX_VALUE) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.f12359aa = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "fetch_tpl_timeout_ctrl", (int) AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
            } else {
                this.f12359aa = this.ak.b("fetch_tpl_timeout_ctrl", AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
            }
        }
        if (this.f12359aa <= 0) {
            this.f12359aa = AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS;
        }
        return this.f12359aa;
    }

    public int n() {
        if (this.an == Integer.MAX_VALUE) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.an = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "disable_rotate_banner_on_dislike", (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
            } else {
                this.an = this.ak.b("disable_rotate_banner_on_dislike", Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
        }
        return this.an;
    }

    public boolean o() {
        return this.Y;
    }

    public String p() {
        if (TextUtils.isEmpty(this.M)) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.M = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "ads_url", f12357q);
            } else {
                this.M = this.ak.b("ads_url", f12357q);
            }
            if (TextUtils.isEmpty(this.M)) {
                this.M = f12357q;
            }
        }
        return this.M;
    }

    public String q() {
        if (TextUtils.isEmpty(this.N)) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.N = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "app_log_url", f12356p);
            } else {
                this.N = this.ak.a("app_log_url");
            }
            if (TextUtils.isEmpty(this.N)) {
                this.N = f12356p;
            }
        }
        return this.N;
    }

    public String r() {
        if (TextUtils.isEmpty(this.O)) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.O = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "apm_url", "");
            } else {
                this.O = this.ak.b("apm_url", "");
            }
        }
        return this.O;
    }

    public String s() {
        if (TextUtils.isEmpty(this.R)) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.R = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "policy_url", f12358r);
            } else {
                this.R = this.ak.b("policy_url", f12358r);
            }
        }
        return this.R;
    }

    public String t() {
        if (TextUtils.isEmpty(this.T)) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.T = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "consent_url", "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html");
            } else {
                this.T = this.ak.b("consent_url", "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html");
            }
        }
        return this.T;
    }

    public int u() {
        if (this.V == 0) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.V = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "ivrv_downward", 0);
            } else {
                this.V = this.ak.b("ivrv_downward", 0);
            }
        }
        return this.V;
    }

    public String v() {
        if (TextUtils.isEmpty(this.W)) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.W = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "dyn_draw_engine_url", f12355n);
            } else {
                this.W = this.ak.b("dyn_draw_engine_url", f12355n);
            }
        }
        return this.W;
    }

    public String w() {
        if (TextUtils.isEmpty(this.X)) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.X = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "dc", (String) null);
            } else {
                this.X = this.ak.a("dc");
            }
        }
        return this.X;
    }

    public int x() {
        if (this.S == Integer.MAX_VALUE) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.S = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "isGdprUser", -1);
            } else {
                this.S = this.ak.b("isGdprUser", -1);
            }
        }
        return this.S;
    }

    public int y() {
        if (this.J == Integer.MAX_VALUE) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.J = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "vbtt", 5);
            } else {
                this.J = this.ak.b("vbtt", 5);
            }
        }
        return this.J;
    }

    public boolean z() {
        if (this.f12361ac == Integer.MAX_VALUE) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.f12361ac = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "privacy_ad_enable", (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
            } else {
                this.f12361ac = this.ak.b("privacy_ad_enable", Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
        }
        int i10 = this.f12361ac;
        if (i10 == 1) {
            return true;
        }
        if (i10 == 0) {
            return false;
        }
        int o10 = u.o();
        return o10 == 1 || o10 == 2 || o10 == 3;
    }

    public String e() {
        if (this.f12376v == null) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.f12376v = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "ab_test_version", (String) null);
            } else {
                this.f12376v = this.ak.a("ab_test_version");
            }
        }
        return this.f12376v;
    }

    public String f() {
        if (this.f12377w == null) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.f12377w = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "ab_test_param", (String) null);
            } else {
                this.f12377w = this.ak.a("ab_test_param");
            }
        }
        return this.f12377w;
    }

    public void o(String str) {
        this.f12369k.add(str);
    }

    public boolean d() {
        if (this.G == Integer.MAX_VALUE) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.G = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "support_tnc", 1);
            } else {
                this.G = this.ak.b("support_tnc", 1);
            }
        }
        return this.G == 1;
    }

    public JSONArray g(String str) {
        try {
            Set<String> b10 = com.bytedance.sdk.component.adexpress.a.b.a.b(str);
            if (b10 != null && b10.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (String str2 : b10) {
                    com.bytedance.sdk.component.adexpress.a.c.b a10 = com.bytedance.sdk.component.adexpress.a.b.a.a(str2);
                    if (a10 != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", a10.b());
                        jSONObject.put("md5", a10.c());
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public boolean h(String str) {
        try {
            a n10 = m.h().n(String.valueOf(str));
            if (n10 != null) {
                return n10.f12332v != null;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean i(String str) {
        try {
            a n10 = m.h().n(String.valueOf(str));
            if (n10 != null) {
                return n10.f12333w == 8;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public int j(String str) {
        return n(String.valueOf(str)).f12318h;
    }

    public int k(String str) {
        return n(str).f12320j;
    }

    public boolean l(String str) {
        return n(String.valueOf(str)).f12331u == 0;
    }

    public a n(String str) {
        a aVar = this.f12366h.get(str);
        return aVar == null ? q(str) : aVar;
    }

    public int e(String str) {
        if (str == null) {
            return 1500;
        }
        return m.h().n(str).f12325o;
    }

    public int f(String str) {
        return m.h().n(String.valueOf(str)).f12321k;
    }

    private a q(String str) {
        return a.a().a(str).k(1).l(!this.f12369k.contains(str) ? 1 : 0).m(2).n(1).o(100).p(0).r(1).j(3).i(-1).h(1).s(1).d(-1).a(-1).t(2).u(5).a((JSONArray) null).a(false).v(0).w(0).x(5);
    }

    public boolean d(String str) {
        return str == null || m.h().n(str).f12323m == 1;
    }

    public int h(int i10) {
        return n(String.valueOf(i10)).f12335y;
    }

    public int i(int i10) {
        return n(String.valueOf(i10)).f12336z;
    }

    public int j(int i10) {
        return n(String.valueOf(i10)).A;
    }

    public boolean m(String str) {
        return str != null && m.h().n(str).f12324n == 1;
    }

    public boolean p(String str) {
        if (this.ai.size() == 0) {
            int o10 = u.o();
            if (o10 != 1) {
                if (o10 != 2) {
                    if (o10 != 3) {
                        return false;
                    }
                    return "mcc".equals(str) || "mnc".equals(str);
                } else if (!"mcc".equals(str) && !"mnc".equals(str)) {
                    return false;
                }
            }
            return true;
        }
        return this.ai.contains(str);
    }

    public int e(int i10) {
        return n(String.valueOf(i10)).f12329s;
    }

    public int f(int i10) {
        return n(String.valueOf(i10)).f12321k;
    }

    public int d(int i10) {
        return n(String.valueOf(i10)).f12319i;
    }

    public boolean c() {
        if (this.F == Integer.MAX_VALUE) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.F = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "if_both_open", 0);
            } else {
                this.F = this.ak.b("if_both_open", 0);
            }
        }
        return this.F == 1;
    }

    public boolean g(int i10) {
        return n(String.valueOf(i10)).f12330t;
    }

    public boolean c(String str) {
        return n(String.valueOf(str)).f12317g == 1;
    }

    public int c(int i10) {
        return n(String.valueOf(i10)).f12312b;
    }

    public int b() {
        if (this.f12360ab == Integer.MAX_VALUE) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                this.f12360ab = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "max_tpl_cnts", 100);
            } else {
                this.f12360ab = this.ak.b("max_tpl_cnts", 100);
            }
        }
        return this.f12360ab;
    }

    public boolean b(String str) {
        int i10 = m.h().n(String.valueOf(str)).f12315e;
        if (i10 != 1) {
            return i10 == 2 && o.c(m.a()) != 0;
        }
        return o.d(m.a());
    }

    public boolean b(int i10) {
        return i10 == 0 || m.h().n(String.valueOf(i10)).f12322l == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.i.b
    public void a(JSONObject jSONObject) {
        String str;
        this.ao = jSONObject.optInt("lp_new_style", Api.BaseClientBuilder.API_PRIORITY_OTHER);
        int optInt = jSONObject.optInt("blank_detect_rate", 30);
        this.ap = optInt;
        if (optInt < 0 || optInt > 100) {
            this.ap = 30;
        }
        this.f12373s = jSONObject.optString("xpath");
        JSONObject optJSONObject = jSONObject.optJSONObject("feq_policy");
        if (optJSONObject != null) {
            this.H = optJSONObject.optLong("duration") * 1000;
            this.I = optJSONObject.optInt("max");
        }
        this.J = jSONObject.optInt("vbtt", 5);
        this.K = jSONObject.optInt("fetch_tpl_interval", 3600);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("abtest");
        if (optJSONObject2 != null) {
            this.f12376v = optJSONObject2.optString(MediationMetaData.KEY_VERSION);
            this.f12377w = optJSONObject2.optString("param");
        } else {
            J();
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("log_rate_conf");
        if (optJSONObject3 != null) {
            this.am = (float) optJSONObject3.optDouble("global_rate", 1.0d);
        }
        this.f12378x = jSONObject.optString("pyload_h5");
        this.f12379y = jSONObject.optString("pure_pyload_h5");
        this.M = jSONObject.optString("ads_url");
        this.N = jSONObject.optString("app_log_url");
        this.O = jSONObject.optString("apm_url");
        this.P = jSONObject.optInt(COPPA.COPPA_STANDARD, -99);
        this.Q = jSONObject.optInt("ccpa", -1);
        h.d().d(this.P);
        this.R = jSONObject.optString("privacy_url", f12358r);
        this.T = jSONObject.optString("consent_url", "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html");
        this.U = jSONObject.optInt("network_module", 1);
        this.V = jSONObject.optInt("ivrv_downward", 0);
        this.X = jSONObject.optString("dc");
        c(jSONObject);
        d(jSONObject);
        this.f12380z = e(jSONObject);
        l.e("splashLoad", "setting-》mSplashLoadType=" + this.f12380z);
        this.A = f(jSONObject);
        l.e("splashLoad", "setting-》mSplashCheckType=" + this.A);
        this.F = jSONObject.optInt("if_both_open", 0);
        this.G = jSONObject.optInt("support_tnc", 1);
        this.f12368j = jSONObject.optString("insert_js_config", "");
        this.B = jSONObject.optInt("al", 0);
        this.f12360ab = jSONObject.optInt("max_tpl_cnts", 100);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("app_common_config");
        if (optJSONObject4 != null) {
            this.Z = optJSONObject4.optString("force_language");
            this.f12359aa = optJSONObject4.optInt("fetch_tpl_timeout_ctrl", AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
            this.an = optJSONObject4.optInt("disable_rotate_banner_on_dislike", Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f12365g = optJSONObject4.optInt("if_sp_cache", 0);
            this.L = optJSONObject4.optInt("webview_cache_count", 20);
            try {
                this.f12372o.clear();
                JSONArray optJSONArray = optJSONObject4.optJSONArray("gecko_hosts");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        this.f12372o.add(optJSONArray.getString(i10));
                    }
                }
                this.f12372o = a(this.f12372o);
            } catch (Throwable th) {
                l.b("GeckoLog: settings json error " + th);
            }
        }
        this.C = System.currentTimeMillis();
        this.D.clear();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("spam_app_list");
        if (optJSONArray2 != null) {
            int length = optJSONArray2.length();
            for (int i11 = 0; i11 < length; i11++) {
                String optString = optJSONArray2.optString(i11);
                if (!TextUtils.isEmpty(optString)) {
                    this.D.add(optString);
                }
            }
        }
        this.E.clear();
        JSONArray optJSONArray3 = jSONObject.optJSONArray("scheme_check_list");
        if (optJSONArray3 != null) {
            int length2 = optJSONArray3.length();
            for (int i12 = 0; i12 < length2; i12++) {
                String optString2 = optJSONArray3.optString(i12);
                if (!TextUtils.isEmpty(optString2)) {
                    this.E.add(optString2);
                }
            }
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("download_config");
        if (optJSONObject5 != null) {
            this.f12374t = optJSONObject5.optInt("dl_network", 1);
            this.f12375u = optJSONObject5.optInt("dl_size", 30);
        }
        this.al = jSONObject.optInt("read_video_from_cache", 1);
        JSONArray optJSONArray4 = jSONObject.optJSONArray("ad_slot_conf_list");
        if (optJSONArray4 != null) {
            str = optJSONArray4.toString();
            int length3 = optJSONArray4.length();
            if (length3 > 0) {
                this.f12366h.clear();
                for (int i13 = 0; i13 < length3; i13++) {
                    a b10 = b(optJSONArray4.optJSONObject(i13));
                    if (b10 != null) {
                        this.f12366h.put(b10.f12311a, b10);
                    }
                }
            }
        } else {
            str = null;
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("privacy");
        if (optJSONObject6 != null) {
            this.f12361ac = optJSONObject6.optInt("ad_enable", Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f12362ad = optJSONObject6.optInt("personalized_ad", Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f12363ae = optJSONObject6.optInt("sladar_enable", Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f12364af = optJSONObject6.optInt("app_log_enable", Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.ag = optJSONObject6.optInt("sec_enable", Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.ah = optJSONObject6.optInt("debug_unlock", Api.BaseClientBuilder.API_PRIORITY_OTHER);
            String optString3 = optJSONObject6.optString("fields_allowed", "");
            if (!TextUtils.isEmpty(optString3)) {
                try {
                    JSONArray jSONArray = new JSONArray(optString3);
                    int length4 = jSONArray.length();
                    this.ai.clear();
                    for (int i14 = 0; i14 < length4; i14++) {
                        this.ai.add(jSONArray.getString(i14));
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            } else {
                this.ai.clear();
            }
        } else {
            this.f12361ac = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f12362ad = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f12363ae = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f12364af = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.ag = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.ah = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.ai.clear();
        }
        a(str, (String) null);
        a(Boolean.TRUE);
        this.Y = true;
    }

    public int a(String str) {
        if (str == null) {
            return 0;
        }
        return m.h().n(str).f12328r;
    }

    private void a(String str, String str2) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "xpath", this.f12373s);
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "duration", Long.valueOf(this.H));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "max", Integer.valueOf(this.I));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "download_config_dl_network", Integer.valueOf(this.f12374t));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "download_config_dl_size", Integer.valueOf(this.f12375u));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "vbtt", Integer.valueOf(this.J));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "fetch_template", Integer.valueOf(this.K));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "splash_load_type", Integer.valueOf(this.f12380z));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "splash_check_type", Integer.valueOf(this.A));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "if_both_open", Integer.valueOf(this.F));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "support_tnc", Integer.valueOf(this.G));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "insert_js_config", this.f12368j);
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "pyload_h5", this.f12378x);
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "playableLoadH5Url", this.f12379y);
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "app_list_control", Integer.valueOf(this.B));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "max_tpl_cnts", Integer.valueOf(this.f12360ab));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "fetch_tpl_timeout_ctrl", Integer.valueOf(this.f12359aa));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "disable_rotate_banner_on_dislike", Integer.valueOf(this.an));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "hit_app_list_time", Long.valueOf(this.C));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "hit_app_list_data", this.D);
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "scheme_list_data", this.E);
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "ads_url", this.M);
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "app_log_url", this.N);
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "apm_url", this.O);
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", COPPA.COPPA_STANDARD, Integer.valueOf(this.P));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "ccpa", Integer.valueOf(this.Q));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "policy_url", this.R);
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "consent_url", this.T);
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "ivrv_downward", Integer.valueOf(this.V));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "dyn_draw_engine_url", this.W);
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "dc", this.X);
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "isGdprUser", Integer.valueOf(this.S));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "sp_key_if_sp_cache", Integer.valueOf(this.f12365g));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "landingpage_new_style", Integer.valueOf(this.ao));
            if (!TextUtils.isEmpty(this.Z) && f12354f.contains(this.Z)) {
                com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "force_language", this.Z);
            }
            String str3 = this.f12376v;
            if (str3 != null) {
                com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "ab_test_version", str3);
            }
            String str4 = this.f12377w;
            if (str4 != null) {
                com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "ab_test_param", str4);
            }
            if (!TextUtils.isEmpty(str)) {
                com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "ad_slot_conf", str);
            }
            if (!TextUtils.isEmpty(this.f12370l)) {
                com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "template_ids", this.f12370l);
            }
            if (!TextUtils.isEmpty(this.f12367i)) {
                com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "tpl_infos", this.f12367i);
            }
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "privacy_ad_enable", Integer.valueOf(this.f12361ac));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "privacy_personalized_ad", Integer.valueOf(this.f12362ad));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "privacy_sladar_enable", Integer.valueOf(this.f12363ae));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "privacy_app_log_enable", Integer.valueOf(this.f12364af));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "privacy_sec_enable", Integer.valueOf(this.ag));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "privacy_debug_unlock", Integer.valueOf(this.ah));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "gecko_hosts", this.f12372o);
            if (this.ai.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (String str5 : this.ai) {
                    jSONArray.put(str5);
                }
                com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "privacy_fields_allowed", jSONArray.toString());
            } else {
                com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "privacy_fields_allowed", "");
            }
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "read_video_from_cache", Integer.valueOf(this.al));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "global_rate", Float.valueOf(this.am));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "webview_cache_count", Integer.valueOf(this.L));
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sdk_settings", "blank_detect_rate", Integer.valueOf(this.ap));
            return;
        }
        this.ak.a("xpath", this.f12373s);
        this.ak.a("duration", this.H);
        this.ak.a("max", this.I);
        this.ak.a("download_config_dl_network", this.f12374t);
        this.ak.a("download_config_dl_size", this.f12375u);
        this.ak.a("fetch_template", this.K);
        this.ak.a("pyload_h5", this.f12378x);
        this.ak.a("insert_js_config", this.f12368j);
        this.ak.a("playableLoadH5Url", this.f12379y);
        this.ak.a("splash_load_type", this.f12380z);
        this.ak.a("splash_check_type", this.A);
        this.ak.a("if_both_open", this.F);
        this.ak.a("support_tnc", this.G);
        this.ak.a("app_list_control", this.B);
        this.ak.a("max_tpl_cnts", this.f12360ab);
        this.ak.a("fetch_tpl_timeout_ctrl", this.f12359aa);
        this.ak.a("disable_rotate_banner_on_dislike", this.an);
        this.ak.a("hit_app_list_time", this.C);
        this.ak.a("hit_app_list_data", this.D);
        this.ak.a("scheme_list_data", this.E);
        this.ak.a("ads_url", this.M);
        this.ak.a("app_log_url", this.N);
        this.ak.a("apm_url", this.O);
        this.ak.a(COPPA.COPPA_STANDARD, this.P);
        this.ak.a("ccpa", this.Q);
        this.ak.a("policy_url", this.R);
        this.ak.a("consent_url", this.T);
        this.ak.a("ivrv_downward", this.V);
        this.ak.a("dyn_draw_engine_url", this.W);
        this.ak.a("dc", this.X);
        this.ak.a("isGdprUser", this.S);
        this.ak.a("sp_key_if_sp_cache", this.f12365g);
        this.ak.a("landingpage_new_style", this.ao);
        if (!TextUtils.isEmpty(this.Z) && f12354f.contains(this.Z)) {
            this.ak.a("force_language", this.Z);
        }
        String str6 = this.f12376v;
        if (str6 != null) {
            this.ak.a("ab_test_version", str6);
        }
        String str7 = this.f12377w;
        if (str7 != null) {
            this.ak.a("ab_test_param", str7);
        }
        this.ak.a("vbtt", this.J);
        if (!TextUtils.isEmpty(str)) {
            this.ak.a("ad_slot_conf", str);
        }
        if (!TextUtils.isEmpty(this.f12370l)) {
            this.ak.a("template_ids", this.f12370l);
        }
        if (!TextUtils.isEmpty(this.f12367i)) {
            this.ak.a("tpl_infos", this.f12367i);
        }
        this.ak.a("privacy_ad_enable", this.f12361ac);
        this.ak.a("privacy_personalized_ad", this.f12362ad);
        this.ak.a("privacy_sladar_enable", this.f12363ae);
        this.ak.a("privacy_app_log_enable", this.f12364af);
        this.ak.a("privacy_sec_enable", this.ag);
        this.ak.a("privacy_debug_unlock", this.ah);
        this.ak.a("gecko_hosts", this.f12372o);
        if (this.ai.size() > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str8 : this.ai) {
                jSONArray2.put(str8);
            }
            this.ak.a("privacy_fields_allowed", jSONArray2.toString());
        } else {
            this.ak.a("privacy_fields_allowed", "");
        }
        this.ak.a("read_video_from_cache", this.al);
        this.ak.a("global_rate", this.am);
        this.ak.a("webview_cache_count", this.L);
        this.ak.a("blank_detect_rate", this.ap);
    }

    public void a(Boolean bool) {
        if (Build.VERSION.SDK_INT >= 17) {
            if (bool.booleanValue() && (TextUtils.isEmpty(this.Z) || !f12354f.contains(this.Z))) {
                if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                    this.Z = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_sdk_settings", "force_language", "");
                } else {
                    this.Z = this.ak.b("force_language", "");
                }
            }
            if (TextUtils.isEmpty(this.Z)) {
                return;
            }
            if (this.Z.equals("zh-Hant")) {
                i.a(m.a(), "zh", "tw");
            } else {
                i.a(m.a(), this.Z, null);
            }
            try {
                f12351c = t.a(m.a(), "tt_txt_skip");
                f12352d = t.a(m.a(), "tt_feedback_submit_text");
                f12353e = t.a(m.a(), "tt_feedback_thank_text") + "\n" + t.a(m.a(), "tt_feedback_experience_text");
            } catch (Throwable unused) {
            }
        }
    }

    public boolean a(int i10) {
        return n(String.valueOf(i10)).f12313c == 1;
    }

    public int a(String str, boolean z10) {
        if (str == null) {
            return a(z10);
        }
        int i10 = m.h().n(str).f12334x;
        return i10 != -1 ? i10 : a(z10);
    }

    public Set<String> a(Set<String> set) {
        try {
            if (set == null) {
                return new HashSet();
            }
            HashSet hashSet = new HashSet();
            for (String str : set) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            return hashSet;
        } catch (Throwable unused) {
            return new HashSet();
        }
    }
}
