package g2;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import h2.c;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* compiled from: KeyframeParser.java */
/* loaded from: classes.dex */
class t {

    /* renamed from: b  reason: collision with root package name */
    private static androidx.collection.h<WeakReference<Interpolator>> f30516b;

    /* renamed from: a  reason: collision with root package name */
    private static final Interpolator f30515a = new LinearInterpolator();

    /* renamed from: c  reason: collision with root package name */
    static c.a f30517c = c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d  reason: collision with root package name */
    static c.a f30518d = c.a.a("x", "y");

    t() {
    }

    private static WeakReference<Interpolator> a(int i10) {
        WeakReference<Interpolator> e10;
        synchronized (t.class) {
            e10 = g().e(i10);
        }
        return e10;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = i2.g.b(pointF.x, -1.0f, 1.0f);
        pointF.y = i2.g.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = i2.g.b(pointF2.x, -1.0f, 1.0f);
        float b10 = i2.g.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b10;
        int i10 = i2.h.i(pointF.x, pointF.y, pointF2.x, b10);
        WeakReference<Interpolator> a10 = a(i10);
        Interpolator interpolator = a10 != null ? a10.get() : null;
        if (a10 == null || interpolator == null) {
            try {
                linearInterpolator = j0.b.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e10) {
                if ("The Path cannot loop back on itself.".equals(e10.getMessage())) {
                    linearInterpolator = j0.b.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            try {
                h(i10, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> j2.a<T> c(h2.c cVar, com.airbnb.lottie.h hVar, float f10, n0<T> n0Var, boolean z10, boolean z11) throws IOException {
        if (z10 && z11) {
            return e(hVar, cVar, f10, n0Var);
        }
        if (z10) {
            return d(hVar, cVar, f10, n0Var);
        }
        return f(cVar, f10, n0Var);
    }

    private static <T> j2.a<T> d(com.airbnb.lottie.h hVar, h2.c cVar, float f10, n0<T> n0Var) throws IOException {
        Interpolator interpolator;
        Interpolator interpolator2;
        T t10;
        cVar.d();
        PointF pointF = null;
        PointF pointF2 = null;
        T t11 = null;
        T t12 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z10 = false;
        float f11 = 0.0f;
        while (cVar.l()) {
            switch (cVar.T(f30517c)) {
                case 0:
                    f11 = (float) cVar.w();
                    break;
                case 1:
                    t12 = n0Var.a(cVar, f10);
                    break;
                case 2:
                    t11 = n0Var.a(cVar, f10);
                    break;
                case 3:
                    pointF = s.e(cVar, 1.0f);
                    break;
                case 4:
                    pointF2 = s.e(cVar, 1.0f);
                    break;
                case 5:
                    if (cVar.y() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                case 6:
                    pointF3 = s.e(cVar, f10);
                    break;
                case 7:
                    pointF4 = s.e(cVar, f10);
                    break;
                default:
                    cVar.Z();
                    break;
            }
        }
        cVar.h();
        if (z10) {
            interpolator2 = f30515a;
            t10 = t12;
        } else {
            if (pointF != null && pointF2 != null) {
                interpolator = b(pointF, pointF2);
            } else {
                interpolator = f30515a;
            }
            interpolator2 = interpolator;
            t10 = t11;
        }
        j2.a<T> aVar = new j2.a<>(hVar, t12, t10, interpolator2, f11, null);
        aVar.f32194o = pointF3;
        aVar.f32195p = pointF4;
        return aVar;
    }

    private static <T> j2.a<T> e(com.airbnb.lottie.h hVar, h2.c cVar, float f10, n0<T> n0Var) throws IOException {
        Interpolator interpolator;
        Interpolator b10;
        Interpolator b11;
        T t10;
        PointF pointF;
        j2.a<T> aVar;
        PointF pointF2;
        float f11;
        PointF pointF3;
        cVar.d();
        PointF pointF4 = null;
        boolean z10 = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        T t11 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f12 = 0.0f;
        PointF pointF11 = null;
        T t12 = null;
        while (cVar.l()) {
            switch (cVar.T(f30517c)) {
                case 0:
                    pointF2 = pointF4;
                    f12 = (float) cVar.w();
                    break;
                case 1:
                    pointF2 = pointF4;
                    t11 = n0Var.a(cVar, f10);
                    break;
                case 2:
                    pointF2 = pointF4;
                    t12 = n0Var.a(cVar, f10);
                    break;
                case 3:
                    pointF2 = pointF4;
                    f11 = f12;
                    PointF pointF12 = pointF11;
                    if (cVar.L() == c.b.BEGIN_OBJECT) {
                        cVar.d();
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        float f15 = 0.0f;
                        float f16 = 0.0f;
                        while (cVar.l()) {
                            int T = cVar.T(f30518d);
                            if (T == 0) {
                                c.b L = cVar.L();
                                c.b bVar = c.b.NUMBER;
                                if (L == bVar) {
                                    f15 = (float) cVar.w();
                                    f13 = f15;
                                } else {
                                    cVar.b();
                                    f13 = (float) cVar.w();
                                    f15 = cVar.L() == bVar ? (float) cVar.w() : f13;
                                    cVar.e();
                                }
                            } else if (T != 1) {
                                cVar.Z();
                            } else {
                                c.b L2 = cVar.L();
                                c.b bVar2 = c.b.NUMBER;
                                if (L2 == bVar2) {
                                    f16 = (float) cVar.w();
                                    f14 = f16;
                                } else {
                                    cVar.b();
                                    f14 = (float) cVar.w();
                                    f16 = cVar.L() == bVar2 ? (float) cVar.w() : f14;
                                    cVar.e();
                                }
                            }
                        }
                        PointF pointF13 = new PointF(f13, f14);
                        PointF pointF14 = new PointF(f15, f16);
                        cVar.h();
                        pointF8 = pointF14;
                        pointF7 = pointF13;
                        pointF11 = pointF12;
                        f12 = f11;
                        break;
                    } else {
                        pointF5 = s.e(cVar, f10);
                        f12 = f11;
                        pointF11 = pointF12;
                        break;
                    }
                case 4:
                    if (cVar.L() == c.b.BEGIN_OBJECT) {
                        cVar.d();
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        float f19 = 0.0f;
                        float f20 = 0.0f;
                        while (cVar.l()) {
                            PointF pointF15 = pointF11;
                            int T2 = cVar.T(f30518d);
                            if (T2 != 0) {
                                pointF3 = pointF4;
                                if (T2 != 1) {
                                    cVar.Z();
                                } else {
                                    c.b L3 = cVar.L();
                                    c.b bVar3 = c.b.NUMBER;
                                    if (L3 == bVar3) {
                                        f20 = (float) cVar.w();
                                        f12 = f12;
                                        f18 = f20;
                                    } else {
                                        float f21 = f12;
                                        cVar.b();
                                        float w10 = (float) cVar.w();
                                        float w11 = cVar.L() == bVar3 ? (float) cVar.w() : w10;
                                        cVar.e();
                                        f12 = f21;
                                        pointF11 = pointF15;
                                        pointF4 = pointF3;
                                        f20 = w11;
                                        f18 = w10;
                                    }
                                }
                            } else {
                                pointF3 = pointF4;
                                float f22 = f12;
                                c.b L4 = cVar.L();
                                c.b bVar4 = c.b.NUMBER;
                                if (L4 == bVar4) {
                                    f19 = (float) cVar.w();
                                    f12 = f22;
                                    f17 = f19;
                                } else {
                                    cVar.b();
                                    f17 = (float) cVar.w();
                                    f19 = cVar.L() == bVar4 ? (float) cVar.w() : f17;
                                    cVar.e();
                                    f12 = f22;
                                }
                            }
                            pointF11 = pointF15;
                            pointF4 = pointF3;
                        }
                        pointF2 = pointF4;
                        f11 = f12;
                        PointF pointF16 = new PointF(f17, f18);
                        PointF pointF17 = new PointF(f19, f20);
                        cVar.h();
                        pointF10 = pointF17;
                        pointF9 = pointF16;
                        f12 = f11;
                        break;
                    } else {
                        pointF2 = pointF4;
                        pointF6 = s.e(cVar, f10);
                        break;
                    }
                case 5:
                    if (cVar.y() == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                        continue;
                    }
                case 6:
                    pointF11 = s.e(cVar, f10);
                    continue;
                case 7:
                    pointF4 = s.e(cVar, f10);
                    continue;
                default:
                    pointF2 = pointF4;
                    cVar.Z();
                    break;
            }
            pointF4 = pointF2;
        }
        PointF pointF18 = pointF4;
        float f23 = f12;
        PointF pointF19 = pointF11;
        cVar.h();
        if (z10) {
            interpolator = f30515a;
            t10 = t11;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = b(pointF5, pointF6);
            } else if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                b10 = b(pointF7, pointF9);
                b11 = b(pointF8, pointF10);
                t10 = t12;
                interpolator = null;
                if (b10 == null && b11 != null) {
                    pointF = pointF19;
                    aVar = new j2.a<>(hVar, t11, t10, b10, b11, f23, null);
                } else {
                    pointF = pointF19;
                    aVar = new j2.a<>(hVar, t11, t10, interpolator, f23, null);
                }
                aVar.f32194o = pointF;
                aVar.f32195p = pointF18;
                return aVar;
            } else {
                interpolator = f30515a;
            }
            t10 = t12;
        }
        b10 = null;
        b11 = null;
        if (b10 == null) {
        }
        pointF = pointF19;
        aVar = new j2.a<>(hVar, t11, t10, interpolator, f23, null);
        aVar.f32194o = pointF;
        aVar.f32195p = pointF18;
        return aVar;
    }

    private static <T> j2.a<T> f(h2.c cVar, float f10, n0<T> n0Var) throws IOException {
        return new j2.a<>(n0Var.a(cVar, f10));
    }

    private static androidx.collection.h<WeakReference<Interpolator>> g() {
        if (f30516b == null) {
            f30516b = new androidx.collection.h<>();
        }
        return f30516b;
    }

    private static void h(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            f30516b.j(i10, weakReference);
        }
    }
}
