package com.bytedance.sdk.openadsdk.h.a;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.d.d.d;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.h.a.b;
import com.bytedance.sdk.openadsdk.utils.NetworkTools;
import com.bytedance.sdk.openadsdk.utils.u;
import org.json.JSONObject;

/* compiled from: LogStatsBase.java */
/* loaded from: classes.dex */
public class b<T extends b> implements a {

    /* renamed from: a  reason: collision with root package name */
    private String f13258a;

    /* renamed from: b  reason: collision with root package name */
    private String f13259b;

    /* renamed from: c  reason: collision with root package name */
    private String f13260c;

    /* renamed from: e  reason: collision with root package name */
    private String f13262e;

    /* renamed from: h  reason: collision with root package name */
    private String f13265h;

    /* renamed from: j  reason: collision with root package name */
    private String f13267j;

    /* renamed from: k  reason: collision with root package name */
    private String f13268k;

    /* renamed from: l  reason: collision with root package name */
    private String f13269l;

    /* renamed from: m  reason: collision with root package name */
    private String f13270m;

    /* renamed from: n  reason: collision with root package name */
    private String f13271n;

    /* renamed from: d  reason: collision with root package name */
    private String f13261d = d.d1657027613261dc("4/7-4+0");

    /* renamed from: f  reason: collision with root package name */
    private long f13263f = System.currentTimeMillis() / 1000;

    /* renamed from: g  reason: collision with root package name */
    private int f13264g = 0;

    /* renamed from: i  reason: collision with root package name */
    private int f13266i = 0;

    public static b<b> b() {
        return new b<>();
    }

    @Keep
    @JProtect
    private JSONObject q() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("or"), 1);
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("mnffh"), Build.MODEL);
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("vdlgkw"), Build.MANUFACTURER);
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("p`ahebcXfhgn"), u.d());
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("u`"), u.b());
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("g`kg"), s3.a.a().c());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private T r() {
        return this;
    }

    public T a(int i10) {
        this.f13264g = i10;
        return r();
    }

    public T a(long j10) {
        this.f13263f = j10;
        return r();
    }

    public T a(String str) {
        this.f13258a = str;
        return r();
    }

    @Override // com.bytedance.sdk.openadsdk.h.a.a
    @Keep
    @JProtect
    public JSONObject a() {
        String a1657027613264dc;
        String f10;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(c())) {
                jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("txrf"), c());
            }
            if (!TextUtils.isEmpty(e())) {
                jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("rhv"), e());
            }
            if (!TextUtils.isEmpty(f())) {
                jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("csgbplpbW`n"), f());
            }
            if (!TextUtils.isEmpty(g())) {
                jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("ae]p`nYqm{ybcc"), g());
            }
            if (TextUtils.isEmpty(h())) {
                a1657027613264dc = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("aqr\\r`ttafd");
                f10 = u.f();
            } else {
                a1657027613264dc = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("aqr\\r`ttafd");
                f10 = h();
            }
            jSONObject.put(a1657027613264dc, f10);
            if (i() > 0) {
                jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("thofwqgjx"), i());
            }
            if (j() > 0) {
                jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("aevzt`"), j());
            }
            if (!TextUtils.isEmpty(k())) {
                jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("rds\\ma"), k());
            }
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("esplvZehll"), l());
            if (!TextUtils.isEmpty(m())) {
                jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("esplvZkto"), m());
            }
            if (!TextUtils.isEmpty(n())) {
                jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("eyvqe"), n());
            }
            if (!TextUtils.isEmpty(o())) {
                jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("ilcdaZsud"), o());
            }
            if (!TextUtils.isEmpty(d())) {
                jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("ewgmpZc\u007f|{k"), d());
            }
            if (!TextUtils.isEmpty(p())) {
                jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("dtpbplii"), p());
            }
            if (!TextUtils.isEmpty(h.d().f())) {
                jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("aqrj`"), h.d().f());
            }
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("cnlm[q\u007fwm"), NetworkTools.b(m.a()));
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("ddtjg`Ynfoe"), q());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public T b(int i10) {
        this.f13266i = i10;
        return r();
    }

    public T b(String str) {
        this.f13270m = str;
        return r();
    }

    public T c(String str) {
        this.f13259b = str;
        return r();
    }

    public String c() {
        return this.f13258a;
    }

    public T d(String str) {
        this.f13260c = str;
        return r();
    }

    public String d() {
        return this.f13270m;
    }

    public T e(String str) {
        this.f13265h = str;
        return r();
    }

    public String e() {
        return this.f13259b;
    }

    public T f(String str) {
        this.f13267j = str;
        return r();
    }

    public String f() {
        return this.f13260c;
    }

    public T g(String str) {
        this.f13268k = str;
        return r();
    }

    public String g() {
        return this.f13261d;
    }

    public T h(String str) {
        this.f13271n = str;
        return r();
    }

    public String h() {
        return this.f13262e;
    }

    public long i() {
        long j10 = this.f13263f;
        while (true) {
            char c10 = '^';
            char c11 = 'K';
            while (true) {
                switch (c10) {
                    case '\\':
                        switch (c11) {
                            case 22:
                            case 23:
                                c10 = ']';
                                c11 = ']';
                        }
                        break;
                    case ']':
                        break;
                    case '^':
                        c10 = ']';
                        c11 = ']';
                    default:
                        c10 = ']';
                        c11 = ']';
                }
            }
            while (true) {
                switch (c11) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        break;
                    default:
                        c11 = '[';
                }
            }
        }
        return j10;
    }

    public int j() {
        int i10 = this.f13264g;
        while (true) {
            char c10 = '^';
            char c11 = 'K';
            while (true) {
                switch (c10) {
                    case '\\':
                        switch (c11) {
                            case 22:
                            case 23:
                                c10 = ']';
                                c11 = ']';
                        }
                        break;
                    case ']':
                        break;
                    case '^':
                        c10 = ']';
                        c11 = ']';
                    default:
                        c10 = ']';
                        c11 = ']';
                }
            }
            while (true) {
                switch (c11) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        break;
                    default:
                        c11 = '[';
                }
            }
        }
        return i10;
    }

    public String k() {
        return this.f13265h;
    }

    public int l() {
        int i10 = this.f13266i;
        while (true) {
            char c10 = '^';
            char c11 = 'K';
            while (true) {
                switch (c10) {
                    case '\\':
                        switch (c11) {
                            case 22:
                            case 23:
                                c10 = ']';
                                c11 = ']';
                        }
                        break;
                    case ']':
                        break;
                    case '^':
                        c10 = ']';
                        c11 = ']';
                    default:
                        c10 = ']';
                        c11 = ']';
                }
            }
            while (true) {
                switch (c11) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        break;
                    default:
                        c11 = '[';
                }
            }
        }
        return i10;
    }

    public String m() {
        return this.f13267j;
    }

    public String n() {
        return this.f13268k;
    }

    public String o() {
        return this.f13269l;
    }

    public String p() {
        return this.f13271n;
    }
}
