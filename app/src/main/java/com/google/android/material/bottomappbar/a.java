package com.google.android.material.bottomappbar;

import xa.f;
import xa.m;

/* compiled from: BottomAppBarTopEdgeTreatment.java */
/* loaded from: classes2.dex */
public class a extends f implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private float f22100a;

    /* renamed from: b  reason: collision with root package name */
    private float f22101b;

    /* renamed from: c  reason: collision with root package name */
    private float f22102c;

    /* renamed from: d  reason: collision with root package name */
    private float f22103d;

    /* renamed from: e  reason: collision with root package name */
    private float f22104e;

    @Override // xa.f
    public void a(float f10, float f11, float f12, m mVar) {
        float f13 = this.f22102c;
        if (f13 == 0.0f) {
            mVar.l(f10, 0.0f);
            return;
        }
        float f14 = ((this.f22101b * 2.0f) + f13) / 2.0f;
        float f15 = f12 * this.f22100a;
        float f16 = f11 + this.f22104e;
        float f17 = (this.f22103d * f12) + ((1.0f - f12) * f14);
        if (f17 / f14 >= 1.0f) {
            mVar.l(f10, 0.0f);
            return;
        }
        float f18 = f14 + f15;
        float f19 = f17 + f15;
        float sqrt = (float) Math.sqrt((f18 * f18) - (f19 * f19));
        float f20 = f16 - sqrt;
        float f21 = f16 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f19));
        float f22 = 90.0f - degrees;
        mVar.l(f20, 0.0f);
        float f23 = f15 * 2.0f;
        mVar.a(f20 - f15, 0.0f, f20 + f15, f23, 270.0f, degrees);
        mVar.a(f16 - f14, (-f14) - f17, f16 + f14, f14 - f17, 180.0f - f22, (f22 * 2.0f) - 180.0f);
        mVar.a(f21 - f15, 0.0f, f21 + f15, f23, 270.0f - degrees, degrees);
        mVar.l(f10, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b() {
        return this.f22103d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.f22101b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        return this.f22100a;
    }

    public float e() {
        return this.f22102c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(float f10) {
        this.f22103d = f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(float f10) {
        this.f22101b = f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(float f10) {
        this.f22100a = f10;
    }

    public void j(float f10) {
        this.f22102c = f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(float f10) {
        this.f22104e = f10;
    }
}
