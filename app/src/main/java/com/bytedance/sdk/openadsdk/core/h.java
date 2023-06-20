package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.core.bannerexpress.a;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GlobalInfo.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public static TTAdSdk.InitCallback f12274a;

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f12275b = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.h.1
        {
            add("8025677");
            add("5001121");
        }
    };

    /* renamed from: u  reason: collision with root package name */
    private static final h f12276u = new h();

    /* renamed from: c  reason: collision with root package name */
    private String f12277c;

    /* renamed from: d  reason: collision with root package name */
    private String f12278d;

    /* renamed from: e  reason: collision with root package name */
    private int f12279e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12280f;

    /* renamed from: g  reason: collision with root package name */
    private String f12281g;

    /* renamed from: h  reason: collision with root package name */
    private String f12282h;

    /* renamed from: i  reason: collision with root package name */
    private AtomicBoolean f12283i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    private int f12284j = 0;

    /* renamed from: k  reason: collision with root package name */
    private boolean f12285k = true;

    /* renamed from: l  reason: collision with root package name */
    private final Set<Integer> f12286l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f12287m;

    /* renamed from: n  reason: collision with root package name */
    private Bitmap f12288n;

    /* renamed from: o  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.utils.a f12289o;

    /* renamed from: p  reason: collision with root package name */
    private String[] f12290p;

    /* renamed from: q  reason: collision with root package name */
    private int f12291q;

    /* renamed from: r  reason: collision with root package name */
    private int f12292r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f12293s;

    /* renamed from: t  reason: collision with root package name */
    private String f12294t;

    /* renamed from: v  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.video.b.c f12295v;

    /* renamed from: w  reason: collision with root package name */
    private volatile ConcurrentHashMap<String, a.InterfaceC0169a> f12296w;

    private h() {
        Set<Integer> synchronizedSet = Collections.synchronizedSet(new HashSet());
        this.f12286l = synchronizedSet;
        this.f12287m = false;
        this.f12288n = null;
        this.f12289o = new com.bytedance.sdk.openadsdk.utils.a();
        this.f12291q = 0;
        this.f12292r = 0;
        this.f12293s = false;
        this.f12296w = null;
        try {
            o3.a.a(m.a());
            synchronizedSet.add(4);
            Context a10 = m.a();
            if (a10 instanceof Application) {
                ((Application) a10).registerActivityLifecycleCallbacks(this.f12289o);
            } else if (a10 != null && a10.getApplicationContext() != null) {
                ((Application) a10.getApplicationContext()).registerActivityLifecycleCallbacks(this.f12289o);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(TTAdSdk.InitCallback initCallback) {
        f12274a = initCallback;
    }

    public static h d() {
        return f12276u;
    }

    public boolean b() {
        return this.f12293s;
    }

    public com.bytedance.sdk.openadsdk.utils.a c() {
        return this.f12289o;
    }

    public boolean e() {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "sdk_activate_init", true);
        }
        return com.bytedance.sdk.component.utils.u.a((String) null, m.a()).b("sdk_activate_init", true);
    }

    public String f() {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.b("sp_global_info", "app_id", (String) null);
        }
        return this.f12277c;
    }

    public String g() {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.b("sp_global_info", "name", (String) null);
        }
        return this.f12278d;
    }

    public int h() {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "icon_id", 0);
        }
        return this.f12279e;
    }

    public int i() {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "sdk_coppa", -1);
        }
        int b10 = com.bytedance.sdk.component.utils.u.a((String) null, m.a()).b("sdk_coppa", -1);
        this.f12291q = b10;
        return b10;
    }

    public int j() {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "tt_gdpr", -1);
        }
        return com.bytedance.sdk.component.utils.u.a((String) null, m.a()).b("tt_gdpr", -1);
    }

    public int k() {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            this.f12292r = com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "global_coppa", -99);
        } else {
            this.f12292r = com.bytedance.sdk.component.utils.u.a((String) null, m.a()).b("global_coppa", -99);
        }
        if (this.f12292r == -99) {
            this.f12292r = i();
        }
        return this.f12292r;
    }

    public boolean l() {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "is_paid", false);
        }
        return this.f12280f;
    }

    public String m() {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.b("sp_global_info", "keywords", (String) null);
        }
        return this.f12281g;
    }

    public String n() {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.b("sp_global_info", "extra_data", (String) null);
        }
        return this.f12282h;
    }

    public int o() {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "title_bar_theme", 0);
        }
        return this.f12284j;
    }

    public com.bytedance.sdk.openadsdk.core.video.b.c p() {
        if (this.f12295v == null) {
            this.f12295v = new com.bytedance.sdk.openadsdk.core.video.b.c(10, 8);
        }
        return this.f12295v;
    }

    public boolean q() {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "is_use_texture", false);
        }
        return this.f12287m;
    }

    public Bitmap r() {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            return com.bytedance.sdk.component.utils.d.a(com.bytedance.sdk.openadsdk.multipro.d.a.b("sp_global_info", "pause_icon", (String) null));
        }
        return this.f12288n;
    }

    public boolean s() {
        return f12275b.contains(this.f12277c);
    }

    public boolean t() {
        return "com.union_test.internationad".equals(com.bytedance.sdk.openadsdk.utils.u.d());
    }

    public String u() {
        if (!TextUtils.isEmpty(this.f12294t)) {
            return this.f12294t;
        }
        String a10 = com.bytedance.sdk.openadsdk.utils.f.a();
        this.f12294t = a10;
        if (!TextUtils.isEmpty(a10)) {
            return this.f12294t;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        com.bytedance.sdk.openadsdk.utils.f.a(valueOf);
        this.f12294t = valueOf;
        return valueOf;
    }

    public int v() {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "global_ccpa", -1);
        }
        return com.bytedance.sdk.component.utils.u.a((String) null, m.a()).b("global_ccpa", -1);
    }

    public void w() {
        if (this.f12296w == null || this.f12296w.size() != 0) {
            return;
        }
        this.f12296w = null;
    }

    public boolean a() {
        return this.f12289o.a();
    }

    public void b(boolean z10) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "sdk_activate_init", Boolean.valueOf(z10));
        }
        com.bytedance.sdk.component.utils.u.a((String) null, m.a()).a("sdk_activate_init", z10);
    }

    public void c(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == -1) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "tt_gdpr", Integer.valueOf(i10));
            } else {
                com.bytedance.sdk.component.utils.u.a((String) null, m.a()).a("tt_gdpr", i10);
            }
        }
    }

    public void d(int i10) {
        if (i10 != 0 && i10 != 1) {
            i10 = -99;
        }
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "global_coppa", Integer.valueOf(i10));
        } else {
            com.bytedance.sdk.component.utils.u.a((String) null, m.a()).a("global_coppa", i10);
        }
        this.f12292r = i10;
    }

    public void a(boolean z10) {
        this.f12293s = z10;
    }

    private static void g(String str) {
        TTAdSdk.InitCallback initCallback;
        if (TextUtils.isEmpty(str) && (initCallback = f12274a) != null) {
            initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.l.e("GlobalInfo", "appid cannot be empty");
    }

    private static void h(String str) {
        TTAdSdk.InitCallback initCallback;
        if (TextUtils.isEmpty(str) && (initCallback = f12274a) != null) {
            initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, "name cannot be empty");
        }
        com.bytedance.sdk.component.utils.l.e("GlobalInfo", "name cannot be empty");
    }

    private static void i(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        TTAdSdk.InitCallback initCallback = f12274a;
        if (initCallback != null) {
            initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, "keyword is super long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.l.e("GlobalInfo", "keyword is super long, the longest is 1000");
    }

    private static void j(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        TTAdSdk.InitCallback initCallback = f12274a;
        if (initCallback != null) {
            initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.l.e("GlobalInfo", "Data is very long, the longest is 1000");
    }

    public void a(String str) {
        g(str);
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "app_id", str);
        }
        this.f12277c = str;
    }

    public void e(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "title_bar_theme", Integer.valueOf(i10));
        }
        this.f12284j = i10;
    }

    public void f(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == -1) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "global_ccpa", Integer.valueOf(i10));
            } else {
                com.bytedance.sdk.component.utils.u.a((String) null, m.a()).a("global_ccpa", i10);
            }
        }
    }

    public void b(String str) {
        h(str);
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "name", str);
        }
        this.f12278d = str;
    }

    public void c(boolean z10) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "is_paid", Boolean.valueOf(z10));
        }
        this.f12280f = z10;
    }

    public void d(String str) {
        j(str);
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "extra_data", str);
        }
        this.f12282h = str;
    }

    private static JSONObject k(String str) {
        String b10;
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            b10 = com.bytedance.sdk.openadsdk.multipro.d.a.b("sp_global_info", str, (String) null);
        } else {
            b10 = com.bytedance.sdk.component.utils.u.a((String) null, m.a()).b(str, (String) null);
        }
        if (TextUtils.isEmpty(b10)) {
            return null;
        }
        try {
            return new JSONObject(b10);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public void e(boolean z10) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "is_use_texture", Boolean.valueOf(z10));
        }
        this.f12287m = z10;
    }

    public void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            TTDislikeListView.a(6, str);
        } else if (this.f12296w != null) {
            this.f12296w.remove(str);
        }
    }

    public void a(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "icon_id", Integer.valueOf(i10));
        }
        this.f12279e = i10;
    }

    public void c(String str) {
        i(str);
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "keywords", str);
        }
        this.f12281g = str;
    }

    public void b(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == -1) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "sdk_coppa", Integer.valueOf(i10));
            } else {
                com.bytedance.sdk.component.utils.u.a((String) null, m.a()).a("sdk_coppa", i10);
            }
            this.f12291q = i10;
        }
    }

    public void d(boolean z10) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "allow_show_notify", Boolean.valueOf(z10));
        }
        this.f12285k = z10;
    }

    public a.InterfaceC0169a e(String str) {
        if (this.f12296w == null || str == null) {
            return null;
        }
        return this.f12296w.get(str);
    }

    public void a(String[] strArr) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c() && strArr != null && strArr.length > 0) {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    int i11 = i10 + 1;
                    if (i10 > 0) {
                        sb2.append(",");
                    }
                    sb2.append(str);
                    i10 = i11;
                }
            }
            String sb3 = sb2.toString();
            if (!TextUtils.isEmpty(sb3)) {
                com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "need_clear_task_reset", sb3);
            }
        }
        this.f12290p = strArr;
    }

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str2);
            jSONObject.put("time", System.currentTimeMillis());
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", str, jSONObject.toString());
            } else {
                com.bytedance.sdk.component.utils.u.a((String) null, m.a()).a(str, jSONObject.toString());
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static String a(String str, long j10) {
        JSONObject k10;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            k10 = k(str);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        if (k10 == null) {
            return null;
        }
        if (System.currentTimeMillis() - k10.getLong("time") <= j10) {
            return k10.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        }
        return null;
    }

    public void a(String str, a.InterfaceC0169a interfaceC0169a) {
        if (TextUtils.isEmpty(str) || interfaceC0169a == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            TTDislikeListView.a(6, str, interfaceC0169a);
            return;
        }
        if (this.f12296w == null) {
            synchronized (h.class) {
                if (this.f12296w == null) {
                    this.f12296w = new ConcurrentHashMap<>();
                }
            }
        }
        this.f12296w.put(str, interfaceC0169a);
    }
}
