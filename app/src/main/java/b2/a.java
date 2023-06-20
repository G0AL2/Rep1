package b2;

import android.annotation.SuppressLint;
import android.graphics.PointF;

/* compiled from: CubicCurveData.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final PointF f4771a;

    /* renamed from: b  reason: collision with root package name */
    private final PointF f4772b;

    /* renamed from: c  reason: collision with root package name */
    private final PointF f4773c;

    public a() {
        this.f4771a = new PointF();
        this.f4772b = new PointF();
        this.f4773c = new PointF();
    }

    public PointF a() {
        return this.f4771a;
    }

    public PointF b() {
        return this.f4772b;
    }

    public PointF c() {
        return this.f4773c;
    }

    public void d(float f10, float f11) {
        this.f4771a.set(f10, f11);
    }

    public void e(float f10, float f11) {
        this.f4772b.set(f10, f11);
    }

    public void f(float f10, float f11) {
        this.f4773c.set(f10, f11);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f4773c.x), Float.valueOf(this.f4773c.y), Float.valueOf(this.f4771a.x), Float.valueOf(this.f4771a.y), Float.valueOf(this.f4772b.x), Float.valueOf(this.f4772b.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f4771a = pointF;
        this.f4772b = pointF2;
        this.f4773c = pointF3;
    }
}
