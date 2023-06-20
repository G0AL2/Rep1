package com.bytedance.sdk.openadsdk.core.e;

import org.json.JSONObject;

/* compiled from: AppInfo.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: f  reason: collision with root package name */
    private static int f12021f = 1;

    /* renamed from: g  reason: collision with root package name */
    private static int f12022g = 5;

    /* renamed from: a  reason: collision with root package name */
    private String f12023a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f12024b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f12025c = "";

    /* renamed from: d  reason: collision with root package name */
    private double f12026d = -1.0d;

    /* renamed from: e  reason: collision with root package name */
    private int f12027e = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f12028h;

    public String a() {
        return this.f12023a;
    }

    public String b() {
        return this.f12024b;
    }

    public String c() {
        return this.f12025c;
    }

    public double d() {
        return this.f12026d;
    }

    public int e() {
        return this.f12027e;
    }

    public int f() {
        return this.f12028h;
    }

    public JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", b());
            jSONObject.put("app_size", f());
            jSONObject.put("comment_num", e());
            jSONObject.put("download_url", a());
            jSONObject.put("package_name", c());
            jSONObject.put("score", d());
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.l.b(e10.toString());
        }
        return jSONObject;
    }

    public void a(String str) {
        this.f12023a = str;
    }

    public void b(String str) {
        this.f12024b = str;
    }

    public void c(String str) {
        this.f12025c = str;
    }

    public void a(double d10) {
        if (d10 >= f12021f && d10 <= f12022g) {
            this.f12026d = d10;
        } else {
            this.f12026d = -1.0d;
        }
    }

    public void b(int i10) {
        this.f12028h = i10;
    }

    public void a(int i10) {
        if (i10 <= 0) {
            this.f12027e = -1;
        } else {
            this.f12027e = i10;
        }
    }
}
