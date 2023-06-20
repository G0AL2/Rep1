package com.bytedance.sdk.openadsdk.core.i;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* compiled from: AdSlotSetter.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f12311a;

    /* renamed from: v  reason: collision with root package name */
    public List<String> f12332v;

    /* renamed from: b  reason: collision with root package name */
    public int f12312b = 1;

    /* renamed from: c  reason: collision with root package name */
    public int f12313c = 1;

    /* renamed from: d  reason: collision with root package name */
    public int f12314d = 2;

    /* renamed from: e  reason: collision with root package name */
    public int f12315e = 1;

    /* renamed from: f  reason: collision with root package name */
    public int f12316f = 100;

    /* renamed from: g  reason: collision with root package name */
    public int f12317g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f12318h = 2;

    /* renamed from: i  reason: collision with root package name */
    public int f12319i = 1;

    /* renamed from: j  reason: collision with root package name */
    public int f12320j = 3;

    /* renamed from: k  reason: collision with root package name */
    public int f12321k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f12322l = 1;

    /* renamed from: m  reason: collision with root package name */
    public int f12323m = 1;

    /* renamed from: n  reason: collision with root package name */
    public int f12324n = 2;

    /* renamed from: o  reason: collision with root package name */
    public int f12325o = 1500;

    /* renamed from: p  reason: collision with root package name */
    public int f12326p = 2;

    /* renamed from: q  reason: collision with root package name */
    public int f12327q = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f12328r = 0;

    /* renamed from: s  reason: collision with root package name */
    public int f12329s = 5;

    /* renamed from: t  reason: collision with root package name */
    public boolean f12330t = false;

    /* renamed from: u  reason: collision with root package name */
    public int f12331u = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f12333w = 2;

    /* renamed from: x  reason: collision with root package name */
    public int f12334x = -1;

    /* renamed from: y  reason: collision with root package name */
    public int f12335y = 0;

    /* renamed from: z  reason: collision with root package name */
    public int f12336z = 0;
    public int A = 5;

    private a() {
    }

    public static a a() {
        return new a();
    }

    public a b(int i10) {
        this.f12328r = i10;
        return this;
    }

    public a c(int i10) {
        this.f12331u = i10;
        return this;
    }

    public a d(int i10) {
        this.f12327q = i10;
        return this;
    }

    public a e(int i10) {
        this.f12324n = i10;
        return this;
    }

    public a f(int i10) {
        this.f12325o = i10;
        return this;
    }

    public a g(int i10) {
        this.f12326p = i10;
        return this;
    }

    public a h(int i10) {
        this.f12322l = i10;
        return this;
    }

    public a i(int i10) {
        this.f12321k = i10;
        return this;
    }

    public a j(int i10) {
        this.f12320j = i10;
        return this;
    }

    public a k(int i10) {
        this.f12312b = i10;
        return this;
    }

    public a l(int i10) {
        this.f12313c = i10;
        return this;
    }

    public a m(int i10) {
        this.f12314d = i10;
        return this;
    }

    public a n(int i10) {
        this.f12315e = i10;
        return this;
    }

    public a o(int i10) {
        this.f12316f = i10;
        return this;
    }

    public a p(int i10) {
        this.f12317g = i10;
        return this;
    }

    public a q(int i10) {
        this.f12318h = i10;
        return this;
    }

    public a r(int i10) {
        this.f12319i = i10;
        return this;
    }

    public a s(int i10) {
        this.f12323m = i10;
        return this;
    }

    public a t(int i10) {
        this.f12333w = i10;
        return this;
    }

    public a u(int i10) {
        this.f12329s = i10;
        return this;
    }

    public a v(int i10) {
        this.f12335y = i10;
        return this;
    }

    public a w(int i10) {
        this.f12336z = i10;
        return this;
    }

    public a x(int i10) {
        this.A = i10;
        return this;
    }

    public a a(int i10) {
        this.f12334x = i10;
        return this;
    }

    public a a(String str) {
        this.f12311a = str;
        return this;
    }

    public a a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            this.f12332v = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    this.f12332v.add(jSONArray.get(i10).toString());
                } catch (Exception unused) {
                }
            }
        }
        return this;
    }

    public a a(boolean z10) {
        this.f12330t = z10;
        return this;
    }
}
