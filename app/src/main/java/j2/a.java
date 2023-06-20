package j2;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.h;

/* compiled from: Keyframe.java */
/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final h f32180a;

    /* renamed from: b  reason: collision with root package name */
    public final T f32181b;

    /* renamed from: c  reason: collision with root package name */
    public T f32182c;

    /* renamed from: d  reason: collision with root package name */
    public final Interpolator f32183d;

    /* renamed from: e  reason: collision with root package name */
    public final Interpolator f32184e;

    /* renamed from: f  reason: collision with root package name */
    public final Interpolator f32185f;

    /* renamed from: g  reason: collision with root package name */
    public final float f32186g;

    /* renamed from: h  reason: collision with root package name */
    public Float f32187h;

    /* renamed from: i  reason: collision with root package name */
    private float f32188i;

    /* renamed from: j  reason: collision with root package name */
    private float f32189j;

    /* renamed from: k  reason: collision with root package name */
    private int f32190k;

    /* renamed from: l  reason: collision with root package name */
    private int f32191l;

    /* renamed from: m  reason: collision with root package name */
    private float f32192m;

    /* renamed from: n  reason: collision with root package name */
    private float f32193n;

    /* renamed from: o  reason: collision with root package name */
    public PointF f32194o;

    /* renamed from: p  reason: collision with root package name */
    public PointF f32195p;

    public a(h hVar, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.f32188i = -3987645.8f;
        this.f32189j = -3987645.8f;
        this.f32190k = 784923401;
        this.f32191l = 784923401;
        this.f32192m = Float.MIN_VALUE;
        this.f32193n = Float.MIN_VALUE;
        this.f32194o = null;
        this.f32195p = null;
        this.f32180a = hVar;
        this.f32181b = t10;
        this.f32182c = t11;
        this.f32183d = interpolator;
        this.f32184e = null;
        this.f32185f = null;
        this.f32186g = f10;
        this.f32187h = f11;
    }

    public boolean a(float f10) {
        return f10 >= e() && f10 < b();
    }

    public float b() {
        if (this.f32180a == null) {
            return 1.0f;
        }
        if (this.f32193n == Float.MIN_VALUE) {
            if (this.f32187h == null) {
                this.f32193n = 1.0f;
            } else {
                this.f32193n = e() + ((this.f32187h.floatValue() - this.f32186g) / this.f32180a.e());
            }
        }
        return this.f32193n;
    }

    public float c() {
        if (this.f32189j == -3987645.8f) {
            this.f32189j = ((Float) this.f32182c).floatValue();
        }
        return this.f32189j;
    }

    public int d() {
        if (this.f32191l == 784923401) {
            this.f32191l = ((Integer) this.f32182c).intValue();
        }
        return this.f32191l;
    }

    public float e() {
        h hVar = this.f32180a;
        if (hVar == null) {
            return 0.0f;
        }
        if (this.f32192m == Float.MIN_VALUE) {
            this.f32192m = (this.f32186g - hVar.p()) / this.f32180a.e();
        }
        return this.f32192m;
    }

    public float f() {
        if (this.f32188i == -3987645.8f) {
            this.f32188i = ((Float) this.f32181b).floatValue();
        }
        return this.f32188i;
    }

    public int g() {
        if (this.f32190k == 784923401) {
            this.f32190k = ((Integer) this.f32181b).intValue();
        }
        return this.f32190k;
    }

    public boolean h() {
        return this.f32183d == null && this.f32184e == null && this.f32185f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f32181b + ", endValue=" + this.f32182c + ", startFrame=" + this.f32186g + ", endFrame=" + this.f32187h + ", interpolator=" + this.f32183d + '}';
    }

    public a(h hVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.f32188i = -3987645.8f;
        this.f32189j = -3987645.8f;
        this.f32190k = 784923401;
        this.f32191l = 784923401;
        this.f32192m = Float.MIN_VALUE;
        this.f32193n = Float.MIN_VALUE;
        this.f32194o = null;
        this.f32195p = null;
        this.f32180a = hVar;
        this.f32181b = t10;
        this.f32182c = t11;
        this.f32183d = null;
        this.f32184e = interpolator;
        this.f32185f = interpolator2;
        this.f32186g = f10;
        this.f32187h = f11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(h hVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f32188i = -3987645.8f;
        this.f32189j = -3987645.8f;
        this.f32190k = 784923401;
        this.f32191l = 784923401;
        this.f32192m = Float.MIN_VALUE;
        this.f32193n = Float.MIN_VALUE;
        this.f32194o = null;
        this.f32195p = null;
        this.f32180a = hVar;
        this.f32181b = t10;
        this.f32182c = t11;
        this.f32183d = interpolator;
        this.f32184e = interpolator2;
        this.f32185f = interpolator3;
        this.f32186g = f10;
        this.f32187h = f11;
    }

    public a(T t10) {
        this.f32188i = -3987645.8f;
        this.f32189j = -3987645.8f;
        this.f32190k = 784923401;
        this.f32191l = 784923401;
        this.f32192m = Float.MIN_VALUE;
        this.f32193n = Float.MIN_VALUE;
        this.f32194o = null;
        this.f32195p = null;
        this.f32180a = null;
        this.f32181b = t10;
        this.f32182c = t10;
        this.f32183d = null;
        this.f32184e = null;
        this.f32185f = null;
        this.f32186g = Float.MIN_VALUE;
        this.f32187h = Float.valueOf(Float.MAX_VALUE);
    }
}
