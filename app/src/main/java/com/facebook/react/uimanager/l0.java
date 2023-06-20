package com.facebook.react.uimanager;

/* compiled from: Spacing.java */
/* loaded from: classes.dex */
public class l0 {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f15877e = {1, 2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a  reason: collision with root package name */
    private final float[] f15878a;

    /* renamed from: b  reason: collision with root package name */
    private int f15879b;

    /* renamed from: c  reason: collision with root package name */
    private final float f15880c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f15881d;

    public l0() {
        this(0.0f);
    }

    private static float[] c() {
        return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
    }

    public float a(int i10) {
        float f10 = (i10 == 4 || i10 == 5) ? Float.NaN : this.f15880c;
        int i11 = this.f15879b;
        if (i11 == 0) {
            return f10;
        }
        int[] iArr = f15877e;
        if ((iArr[i10] & i11) != 0) {
            return this.f15878a[i10];
        }
        if (this.f15881d) {
            char c10 = (i10 == 1 || i10 == 3) ? (char) 7 : (char) 6;
            if ((iArr[c10] & i11) != 0) {
                return this.f15878a[c10];
            }
            if ((i11 & iArr[8]) != 0) {
                return this.f15878a[8];
            }
        }
        return f10;
    }

    public float b(int i10) {
        return this.f15878a[i10];
    }

    public boolean d(int i10, float f10) {
        boolean z10 = false;
        if (e.a(this.f15878a[i10], f10)) {
            return false;
        }
        this.f15878a[i10] = f10;
        if (com.facebook.yoga.g.a(f10)) {
            this.f15879b = (~f15877e[i10]) & this.f15879b;
        } else {
            this.f15879b = f15877e[i10] | this.f15879b;
        }
        int i11 = this.f15879b;
        int[] iArr = f15877e;
        this.f15881d = ((iArr[8] & i11) == 0 && (iArr[7] & i11) == 0 && (i11 & iArr[6]) == 0) ? true : true;
        return true;
    }

    public l0(float f10) {
        this.f15879b = 0;
        this.f15880c = f10;
        this.f15878a = c();
    }
}
