package com.bytedance.sdk.component.adexpress.widget;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* compiled from: CubicBezierInterpolator.java */
/* loaded from: classes.dex */
public class a implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private int f9978a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final PointF f9979b;

    /* renamed from: c  reason: collision with root package name */
    private final PointF f9980c;

    /* renamed from: d  reason: collision with root package name */
    private float f9981d;

    public a(float f10, float f11, float f12, float f13) {
        PointF pointF = new PointF();
        this.f9979b = pointF;
        PointF pointF2 = new PointF();
        this.f9980c = pointF2;
        this.f9981d = 0.0f;
        pointF.x = f10;
        pointF.y = f11;
        pointF2.x = f12;
        pointF2.y = f13;
    }

    public static double a(double d10, double d11, double d12) {
        double d13 = 1.0d - d10;
        double d14 = d10 * d10;
        return (d13 * d13 * 3.0d * d10 * d11) + (d13 * 3.0d * d14 * d12) + (d14 * d10);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 < this.f9978a) {
            this.f9978a = 0;
        }
        int i10 = this.f9978a;
        float f11 = f10;
        while (true) {
            if (i10 >= 4096) {
                break;
            }
            f11 = i10 * 2.4414062E-4f;
            if (a(f11, this.f9979b.x, this.f9980c.x) >= f10) {
                this.f9978a = i10;
                break;
            }
            i10++;
        }
        return (float) a(f11, this.f9979b.y, this.f9980c.y);
    }
}
