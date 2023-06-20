package com.facebook.react.views.text;

import android.text.Spannable;

/* compiled from: ReactTextUpdate.java */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final Spannable f16212a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16213b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f16214c;

    /* renamed from: d  reason: collision with root package name */
    private final float f16215d;

    /* renamed from: e  reason: collision with root package name */
    private final float f16216e;

    /* renamed from: f  reason: collision with root package name */
    private final float f16217f;

    /* renamed from: g  reason: collision with root package name */
    private final float f16218g;

    /* renamed from: h  reason: collision with root package name */
    private final int f16219h;

    /* renamed from: i  reason: collision with root package name */
    private final int f16220i;

    /* renamed from: j  reason: collision with root package name */
    private final int f16221j;

    /* renamed from: k  reason: collision with root package name */
    private final int f16222k;

    /* renamed from: l  reason: collision with root package name */
    private final int f16223l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f16224m;

    public n(Spannable spannable, int i10, boolean z10, float f10, float f11, float f12, float f13, int i11, int i12, int i13) {
        this(spannable, i10, z10, f10, f11, f12, f13, i11, i12, i13, -1, -1);
    }

    public static n a(Spannable spannable, int i10, int i11, int i12, int i13, boolean z10) {
        n nVar = new n(spannable, i10, false, i11, i12, i13);
        nVar.f16224m = z10;
        return nVar;
    }

    public boolean b() {
        return this.f16214c;
    }

    public int c() {
        return this.f16213b;
    }

    public int d() {
        return this.f16223l;
    }

    public float e() {
        return this.f16218g;
    }

    public float f() {
        return this.f16215d;
    }

    public float g() {
        return this.f16217f;
    }

    public float h() {
        return this.f16216e;
    }

    public int i() {
        return this.f16222k;
    }

    public int j() {
        return this.f16221j;
    }

    public Spannable k() {
        return this.f16212a;
    }

    public int l() {
        return this.f16219h;
    }

    public int m() {
        return this.f16220i;
    }

    public n(Spannable spannable, int i10, boolean z10, int i11, int i12, int i13) {
        this(spannable, i10, z10, -1.0f, -1.0f, -1.0f, -1.0f, i11, i12, i13, -1, -1);
    }

    public n(Spannable spannable, int i10, boolean z10, float f10, float f11, float f12, float f13, int i11, int i12, int i13, int i14, int i15) {
        this.f16212a = spannable;
        this.f16213b = i10;
        this.f16214c = z10;
        this.f16215d = f10;
        this.f16216e = f11;
        this.f16217f = f12;
        this.f16218g = f13;
        this.f16219h = i11;
        this.f16220i = i12;
        this.f16221j = i14;
        this.f16222k = i15;
        this.f16223l = i13;
    }
}
