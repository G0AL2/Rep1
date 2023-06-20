package com.airbnb.lottie;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: LottieComposition.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    private Map<String, List<e2.e>> f5788c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, e0> f5789d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, b2.c> f5790e;

    /* renamed from: f  reason: collision with root package name */
    private List<b2.h> f5791f;

    /* renamed from: g  reason: collision with root package name */
    private androidx.collection.h<b2.d> f5792g;

    /* renamed from: h  reason: collision with root package name */
    private androidx.collection.d<e2.e> f5793h;

    /* renamed from: i  reason: collision with root package name */
    private List<e2.e> f5794i;

    /* renamed from: j  reason: collision with root package name */
    private Rect f5795j;

    /* renamed from: k  reason: collision with root package name */
    private float f5796k;

    /* renamed from: l  reason: collision with root package name */
    private float f5797l;

    /* renamed from: m  reason: collision with root package name */
    private float f5798m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f5799n;

    /* renamed from: a  reason: collision with root package name */
    private final m0 f5786a = new m0();

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<String> f5787b = new HashSet<>();

    /* renamed from: o  reason: collision with root package name */
    private int f5800o = 0;

    public void a(String str) {
        i2.d.c(str);
        this.f5787b.add(str);
    }

    public Rect b() {
        return this.f5795j;
    }

    public androidx.collection.h<b2.d> c() {
        return this.f5792g;
    }

    public float d() {
        return (e() / this.f5798m) * 1000.0f;
    }

    public float e() {
        return this.f5797l - this.f5796k;
    }

    public float f() {
        return this.f5797l;
    }

    public Map<String, b2.c> g() {
        return this.f5790e;
    }

    public float h(float f10) {
        return i2.g.i(this.f5796k, this.f5797l, f10);
    }

    public float i() {
        return this.f5798m;
    }

    public Map<String, e0> j() {
        return this.f5789d;
    }

    public List<e2.e> k() {
        return this.f5794i;
    }

    public b2.h l(String str) {
        int size = this.f5791f.size();
        for (int i10 = 0; i10 < size; i10++) {
            b2.h hVar = this.f5791f.get(i10);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public int m() {
        return this.f5800o;
    }

    public m0 n() {
        return this.f5786a;
    }

    public List<e2.e> o(String str) {
        return this.f5788c.get(str);
    }

    public float p() {
        return this.f5796k;
    }

    public boolean q() {
        return this.f5799n;
    }

    public void r(int i10) {
        this.f5800o += i10;
    }

    public void s(Rect rect, float f10, float f11, float f12, List<e2.e> list, androidx.collection.d<e2.e> dVar, Map<String, List<e2.e>> map, Map<String, e0> map2, androidx.collection.h<b2.d> hVar, Map<String, b2.c> map3, List<b2.h> list2) {
        this.f5795j = rect;
        this.f5796k = f10;
        this.f5797l = f11;
        this.f5798m = f12;
        this.f5794i = list;
        this.f5793h = dVar;
        this.f5788c = map;
        this.f5789d = map2;
        this.f5792g = hVar;
        this.f5790e = map3;
        this.f5791f = list2;
    }

    public e2.e t(long j10) {
        return this.f5793h.f(j10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        for (e2.e eVar : this.f5794i) {
            sb2.append(eVar.y("\t"));
        }
        return sb2.toString();
    }

    public void u(boolean z10) {
        this.f5799n = z10;
    }

    public void v(boolean z10) {
        this.f5786a.b(z10);
    }
}
