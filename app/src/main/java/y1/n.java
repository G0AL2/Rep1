package y1;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.d0;
import com.airbnb.lottie.i0;
import d2.j;
import d2.s;
import java.util.List;
import z1.a;

/* compiled from: PolystarContent.java */
/* loaded from: classes.dex */
public class n implements m, a.b, k {

    /* renamed from: b  reason: collision with root package name */
    private final String f39072b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f39073c;

    /* renamed from: d  reason: collision with root package name */
    private final j.a f39074d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f39075e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f39076f;

    /* renamed from: g  reason: collision with root package name */
    private final z1.a<?, Float> f39077g;

    /* renamed from: h  reason: collision with root package name */
    private final z1.a<?, PointF> f39078h;

    /* renamed from: i  reason: collision with root package name */
    private final z1.a<?, Float> f39079i;

    /* renamed from: j  reason: collision with root package name */
    private final z1.a<?, Float> f39080j;

    /* renamed from: k  reason: collision with root package name */
    private final z1.a<?, Float> f39081k;

    /* renamed from: l  reason: collision with root package name */
    private final z1.a<?, Float> f39082l;

    /* renamed from: m  reason: collision with root package name */
    private final z1.a<?, Float> f39083m;

    /* renamed from: o  reason: collision with root package name */
    private boolean f39085o;

    /* renamed from: a  reason: collision with root package name */
    private final Path f39071a = new Path();

    /* renamed from: n  reason: collision with root package name */
    private final b f39084n = new b();

    /* compiled from: PolystarContent.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f39086a;

        static {
            int[] iArr = new int[j.a.values().length];
            f39086a = iArr;
            try {
                iArr[j.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39086a[j.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(d0 d0Var, e2.b bVar, d2.j jVar) {
        this.f39073c = d0Var;
        this.f39072b = jVar.d();
        j.a j10 = jVar.j();
        this.f39074d = j10;
        this.f39075e = jVar.k();
        this.f39076f = jVar.l();
        z1.a<Float, Float> a10 = jVar.g().a();
        this.f39077g = a10;
        z1.a<PointF, PointF> a11 = jVar.h().a();
        this.f39078h = a11;
        z1.a<Float, Float> a12 = jVar.i().a();
        this.f39079i = a12;
        z1.a<Float, Float> a13 = jVar.e().a();
        this.f39081k = a13;
        z1.a<Float, Float> a14 = jVar.f().a();
        this.f39083m = a14;
        j.a aVar = j.a.STAR;
        if (j10 == aVar) {
            this.f39080j = jVar.b().a();
            this.f39082l = jVar.c().a();
        } else {
            this.f39080j = null;
            this.f39082l = null;
        }
        bVar.i(a10);
        bVar.i(a11);
        bVar.i(a12);
        bVar.i(a13);
        bVar.i(a14);
        if (j10 == aVar) {
            bVar.i(this.f39080j);
            bVar.i(this.f39082l);
        }
        a10.a(this);
        a11.a(this);
        a12.a(this);
        a13.a(this);
        a14.a(this);
        if (j10 == aVar) {
            this.f39080j.a(this);
            this.f39082l.a(this);
        }
    }

    private void g() {
        z1.a<?, Float> aVar;
        double d10;
        double d11;
        double d12;
        int i10;
        int floor = (int) Math.floor(this.f39077g.h().floatValue());
        double radians = Math.toRadians((this.f39079i == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d13 = floor;
        float floatValue = this.f39083m.h().floatValue() / 100.0f;
        float floatValue2 = this.f39081k.h().floatValue();
        double d14 = floatValue2;
        float cos = (float) (Math.cos(radians) * d14);
        float sin = (float) (Math.sin(radians) * d14);
        this.f39071a.moveTo(cos, sin);
        double d15 = (float) (6.283185307179586d / d13);
        double d16 = radians + d15;
        double ceil = Math.ceil(d13);
        int i11 = 0;
        while (i11 < ceil) {
            float cos2 = (float) (Math.cos(d16) * d14);
            double d17 = ceil;
            float sin2 = (float) (d14 * Math.sin(d16));
            if (floatValue != 0.0f) {
                d11 = d14;
                i10 = i11;
                d10 = d16;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                d12 = d15;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f10 = floatValue2 * floatValue * 0.25f;
                this.f39071a.cubicTo(cos - (cos3 * f10), sin - (((float) Math.sin(atan2)) * f10), cos2 + (((float) Math.cos(atan22)) * f10), sin2 + (f10 * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                d10 = d16;
                d11 = d14;
                d12 = d15;
                i10 = i11;
                this.f39071a.lineTo(cos2, sin2);
            }
            d16 = d10 + d12;
            i11 = i10 + 1;
            sin = sin2;
            cos = cos2;
            ceil = d17;
            d14 = d11;
            d15 = d12;
        }
        PointF h10 = this.f39078h.h();
        this.f39071a.offset(h10.x, h10.y);
        this.f39071a.close();
    }

    private void i() {
        z1.a<?, Float> aVar;
        double d10;
        int i10;
        double d11;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        double d12;
        float f16;
        float f17;
        float f18;
        float floatValue = this.f39077g.h().floatValue();
        double radians = Math.toRadians((this.f39079i == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d13 = floatValue;
        float f19 = (float) (6.283185307179586d / d13);
        if (this.f39076f) {
            f19 *= -1.0f;
        }
        float f20 = f19 / 2.0f;
        float f21 = floatValue - ((int) floatValue);
        int i11 = (f21 > 0.0f ? 1 : (f21 == 0.0f ? 0 : -1));
        if (i11 != 0) {
            radians += (1.0f - f21) * f20;
        }
        float floatValue2 = this.f39081k.h().floatValue();
        float floatValue3 = this.f39080j.h().floatValue();
        z1.a<?, Float> aVar2 = this.f39082l;
        float floatValue4 = aVar2 != null ? aVar2.h().floatValue() / 100.0f : 0.0f;
        z1.a<?, Float> aVar3 = this.f39083m;
        float floatValue5 = aVar3 != null ? aVar3.h().floatValue() / 100.0f : 0.0f;
        if (i11 != 0) {
            f12 = ((floatValue2 - floatValue3) * f21) + floatValue3;
            i10 = i11;
            double d14 = f12;
            d10 = d13;
            f10 = (float) (d14 * Math.cos(radians));
            f11 = (float) (d14 * Math.sin(radians));
            this.f39071a.moveTo(f10, f11);
            d11 = radians + ((f19 * f21) / 2.0f);
        } else {
            d10 = d13;
            i10 = i11;
            double d15 = floatValue2;
            float cos = (float) (Math.cos(radians) * d15);
            float sin = (float) (d15 * Math.sin(radians));
            this.f39071a.moveTo(cos, sin);
            d11 = radians + f20;
            f10 = cos;
            f11 = sin;
            f12 = 0.0f;
        }
        double ceil = Math.ceil(d10) * 2.0d;
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            double d16 = i12;
            if (d16 < ceil) {
                float f22 = z10 ? floatValue2 : floatValue3;
                int i13 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
                if (i13 == 0 || d16 != ceil - 2.0d) {
                    f13 = f19;
                    f14 = f20;
                } else {
                    f13 = f19;
                    f14 = (f19 * f21) / 2.0f;
                }
                if (i13 == 0 || d16 != ceil - 1.0d) {
                    f15 = f20;
                    d12 = d16;
                    f16 = f22;
                } else {
                    f15 = f20;
                    d12 = d16;
                    f16 = f12;
                }
                double d17 = f16;
                double d18 = ceil;
                float cos2 = (float) (d17 * Math.cos(d11));
                float sin2 = (float) (d17 * Math.sin(d11));
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    this.f39071a.lineTo(cos2, sin2);
                    f17 = floatValue4;
                    f18 = f12;
                } else {
                    f17 = floatValue4;
                    f18 = f12;
                    double atan2 = (float) (Math.atan2(f11, f10) - 1.5707963267948966d);
                    float cos3 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f23 = z10 ? f17 : floatValue5;
                    float f24 = z10 ? floatValue5 : f17;
                    float f25 = (z10 ? floatValue3 : floatValue2) * f23 * 0.47829f;
                    float f26 = cos3 * f25;
                    float f27 = f25 * sin3;
                    float f28 = (z10 ? floatValue2 : floatValue3) * f24 * 0.47829f;
                    float f29 = cos4 * f28;
                    float f30 = f28 * sin4;
                    if (i10 != 0) {
                        if (i12 == 0) {
                            f26 *= f21;
                            f27 *= f21;
                        } else if (d12 == d18 - 1.0d) {
                            f29 *= f21;
                            f30 *= f21;
                        }
                    }
                    this.f39071a.cubicTo(f10 - f26, f11 - f27, cos2 + f29, sin2 + f30, cos2, sin2);
                }
                d11 += f14;
                z10 = !z10;
                i12++;
                f10 = cos2;
                f11 = sin2;
                floatValue4 = f17;
                f12 = f18;
                f20 = f15;
                f19 = f13;
                ceil = d18;
            } else {
                PointF h10 = this.f39078h.h();
                this.f39071a.offset(h10.x, h10.y);
                this.f39071a.close();
                return;
            }
        }
    }

    private void j() {
        this.f39085o = false;
        this.f39073c.invalidateSelf();
    }

    @Override // z1.a.b
    public void a() {
        j();
    }

    @Override // y1.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == s.a.SIMULTANEOUSLY) {
                    this.f39084n.a(uVar);
                    uVar.d(this);
                }
            }
        }
    }

    @Override // b2.f
    public void d(b2.e eVar, int i10, List<b2.e> list, b2.e eVar2) {
        i2.g.k(eVar, i10, list, eVar2, this);
    }

    @Override // b2.f
    public <T> void e(T t10, j2.c<T> cVar) {
        z1.a<?, Float> aVar;
        z1.a<?, Float> aVar2;
        if (t10 == i0.f5825w) {
            this.f39077g.n(cVar);
        } else if (t10 == i0.f5826x) {
            this.f39079i.n(cVar);
        } else if (t10 == i0.f5816n) {
            this.f39078h.n(cVar);
        } else if (t10 == i0.f5827y && (aVar2 = this.f39080j) != null) {
            aVar2.n(cVar);
        } else if (t10 == i0.f5828z) {
            this.f39081k.n(cVar);
        } else if (t10 == i0.A && (aVar = this.f39082l) != null) {
            aVar.n(cVar);
        } else if (t10 == i0.B) {
            this.f39083m.n(cVar);
        }
    }

    @Override // y1.c
    public String getName() {
        return this.f39072b;
    }

    @Override // y1.m
    public Path getPath() {
        if (this.f39085o) {
            return this.f39071a;
        }
        this.f39071a.reset();
        if (this.f39075e) {
            this.f39085o = true;
            return this.f39071a;
        }
        int i10 = a.f39086a[this.f39074d.ordinal()];
        if (i10 == 1) {
            i();
        } else if (i10 == 2) {
            g();
        }
        this.f39071a.close();
        this.f39084n.b(this.f39071a);
        this.f39085o = true;
        return this.f39071a;
    }
}
