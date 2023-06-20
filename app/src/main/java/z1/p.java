package z1;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.i0;
import java.util.Collections;
import z1.a;

/* compiled from: TransformKeyframeAnimation.java */
/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f39941a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private final Matrix f39942b;

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f39943c;

    /* renamed from: d  reason: collision with root package name */
    private final Matrix f39944d;

    /* renamed from: e  reason: collision with root package name */
    private final float[] f39945e;

    /* renamed from: f  reason: collision with root package name */
    private a<PointF, PointF> f39946f;

    /* renamed from: g  reason: collision with root package name */
    private a<?, PointF> f39947g;

    /* renamed from: h  reason: collision with root package name */
    private a<j2.d, j2.d> f39948h;

    /* renamed from: i  reason: collision with root package name */
    private a<Float, Float> f39949i;

    /* renamed from: j  reason: collision with root package name */
    private a<Integer, Integer> f39950j;

    /* renamed from: k  reason: collision with root package name */
    private d f39951k;

    /* renamed from: l  reason: collision with root package name */
    private d f39952l;

    /* renamed from: m  reason: collision with root package name */
    private a<?, Float> f39953m;

    /* renamed from: n  reason: collision with root package name */
    private a<?, Float> f39954n;

    public p(c2.l lVar) {
        this.f39946f = lVar.c() == null ? null : lVar.c().a();
        this.f39947g = lVar.f() == null ? null : lVar.f().a();
        this.f39948h = lVar.h() == null ? null : lVar.h().a();
        this.f39949i = lVar.g() == null ? null : lVar.g().a();
        d dVar = lVar.i() == null ? null : (d) lVar.i().a();
        this.f39951k = dVar;
        if (dVar != null) {
            this.f39942b = new Matrix();
            this.f39943c = new Matrix();
            this.f39944d = new Matrix();
            this.f39945e = new float[9];
        } else {
            this.f39942b = null;
            this.f39943c = null;
            this.f39944d = null;
            this.f39945e = null;
        }
        this.f39952l = lVar.j() == null ? null : (d) lVar.j().a();
        if (lVar.e() != null) {
            this.f39950j = lVar.e().a();
        }
        if (lVar.k() != null) {
            this.f39953m = lVar.k().a();
        } else {
            this.f39953m = null;
        }
        if (lVar.d() != null) {
            this.f39954n = lVar.d().a();
        } else {
            this.f39954n = null;
        }
    }

    private void d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f39945e[i10] = 0.0f;
        }
    }

    public void a(e2.b bVar) {
        bVar.i(this.f39950j);
        bVar.i(this.f39953m);
        bVar.i(this.f39954n);
        bVar.i(this.f39946f);
        bVar.i(this.f39947g);
        bVar.i(this.f39948h);
        bVar.i(this.f39949i);
        bVar.i(this.f39951k);
        bVar.i(this.f39952l);
    }

    public void b(a.b bVar) {
        a<Integer, Integer> aVar = this.f39950j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a<?, Float> aVar2 = this.f39953m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a<?, Float> aVar3 = this.f39954n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a<PointF, PointF> aVar4 = this.f39946f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a<?, PointF> aVar5 = this.f39947g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a<j2.d, j2.d> aVar6 = this.f39948h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a<Float, Float> aVar7 = this.f39949i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f39951k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f39952l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public <T> boolean c(T t10, j2.c<T> cVar) {
        if (t10 == i0.f5808f) {
            a<PointF, PointF> aVar = this.f39946f;
            if (aVar == null) {
                this.f39946f = new q(cVar, new PointF());
                return true;
            }
            aVar.n(cVar);
            return true;
        } else if (t10 == i0.f5809g) {
            a<?, PointF> aVar2 = this.f39947g;
            if (aVar2 == null) {
                this.f39947g = new q(cVar, new PointF());
                return true;
            }
            aVar2.n(cVar);
            return true;
        } else {
            if (t10 == i0.f5810h) {
                a<?, PointF> aVar3 = this.f39947g;
                if (aVar3 instanceof n) {
                    ((n) aVar3).r(cVar);
                    return true;
                }
            }
            if (t10 == i0.f5811i) {
                a<?, PointF> aVar4 = this.f39947g;
                if (aVar4 instanceof n) {
                    ((n) aVar4).s(cVar);
                    return true;
                }
            }
            if (t10 == i0.f5817o) {
                a<j2.d, j2.d> aVar5 = this.f39948h;
                if (aVar5 == null) {
                    this.f39948h = new q(cVar, new j2.d());
                    return true;
                }
                aVar5.n(cVar);
                return true;
            } else if (t10 == i0.f5818p) {
                a<Float, Float> aVar6 = this.f39949i;
                if (aVar6 == null) {
                    this.f39949i = new q(cVar, Float.valueOf(0.0f));
                    return true;
                }
                aVar6.n(cVar);
                return true;
            } else if (t10 == i0.f5805c) {
                a<Integer, Integer> aVar7 = this.f39950j;
                if (aVar7 == null) {
                    this.f39950j = new q(cVar, 100);
                    return true;
                }
                aVar7.n(cVar);
                return true;
            } else if (t10 == i0.C) {
                a<?, Float> aVar8 = this.f39953m;
                if (aVar8 == null) {
                    this.f39953m = new q(cVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar8.n(cVar);
                return true;
            } else if (t10 == i0.D) {
                a<?, Float> aVar9 = this.f39954n;
                if (aVar9 == null) {
                    this.f39954n = new q(cVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar9.n(cVar);
                return true;
            } else if (t10 == i0.f5819q) {
                if (this.f39951k == null) {
                    this.f39951k = new d(Collections.singletonList(new j2.a(Float.valueOf(0.0f))));
                }
                this.f39951k.n(cVar);
                return true;
            } else if (t10 == i0.f5820r) {
                if (this.f39952l == null) {
                    this.f39952l = new d(Collections.singletonList(new j2.a(Float.valueOf(0.0f))));
                }
                this.f39952l.n(cVar);
                return true;
            } else {
                return false;
            }
        }
    }

    public a<?, Float> e() {
        return this.f39954n;
    }

    public Matrix f() {
        float p10;
        PointF h10;
        this.f39941a.reset();
        a<?, PointF> aVar = this.f39947g;
        if (aVar != null && (h10 = aVar.h()) != null) {
            float f10 = h10.x;
            if (f10 != 0.0f || h10.y != 0.0f) {
                this.f39941a.preTranslate(f10, h10.y);
            }
        }
        a<Float, Float> aVar2 = this.f39949i;
        if (aVar2 != null) {
            if (aVar2 instanceof q) {
                p10 = aVar2.h().floatValue();
            } else {
                p10 = ((d) aVar2).p();
            }
            if (p10 != 0.0f) {
                this.f39941a.preRotate(p10);
            }
        }
        d dVar = this.f39951k;
        if (dVar != null) {
            d dVar2 = this.f39952l;
            float cos = dVar2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-dVar2.p()) + 90.0f));
            d dVar3 = this.f39952l;
            float sin = dVar3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-dVar3.p()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(dVar.p()));
            d();
            float[] fArr = this.f39945e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f11 = -sin;
            fArr[3] = f11;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f39942b.setValues(fArr);
            d();
            float[] fArr2 = this.f39945e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f39943c.setValues(fArr2);
            d();
            float[] fArr3 = this.f39945e;
            fArr3[0] = cos;
            fArr3[1] = f11;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f39944d.setValues(fArr3);
            this.f39943c.preConcat(this.f39942b);
            this.f39944d.preConcat(this.f39943c);
            this.f39941a.preConcat(this.f39944d);
        }
        a<j2.d, j2.d> aVar3 = this.f39948h;
        if (aVar3 != null) {
            j2.d h11 = aVar3.h();
            if (h11.b() != 1.0f || h11.c() != 1.0f) {
                this.f39941a.preScale(h11.b(), h11.c());
            }
        }
        a<PointF, PointF> aVar4 = this.f39946f;
        if (aVar4 != null) {
            PointF h12 = aVar4.h();
            float f12 = h12.x;
            if (f12 != 0.0f || h12.y != 0.0f) {
                this.f39941a.preTranslate(-f12, -h12.y);
            }
        }
        return this.f39941a;
    }

    public Matrix g(float f10) {
        a<?, PointF> aVar = this.f39947g;
        PointF h10 = aVar == null ? null : aVar.h();
        a<j2.d, j2.d> aVar2 = this.f39948h;
        j2.d h11 = aVar2 == null ? null : aVar2.h();
        this.f39941a.reset();
        if (h10 != null) {
            this.f39941a.preTranslate(h10.x * f10, h10.y * f10);
        }
        if (h11 != null) {
            double d10 = f10;
            this.f39941a.preScale((float) Math.pow(h11.b(), d10), (float) Math.pow(h11.c(), d10));
        }
        a<Float, Float> aVar3 = this.f39949i;
        if (aVar3 != null) {
            float floatValue = aVar3.h().floatValue();
            a<PointF, PointF> aVar4 = this.f39946f;
            PointF h12 = aVar4 != null ? aVar4.h() : null;
            this.f39941a.preRotate(floatValue * f10, h12 == null ? 0.0f : h12.x, h12 != null ? h12.y : 0.0f);
        }
        return this.f39941a;
    }

    public a<?, Integer> h() {
        return this.f39950j;
    }

    public a<?, Float> i() {
        return this.f39953m;
    }

    public void j(float f10) {
        a<Integer, Integer> aVar = this.f39950j;
        if (aVar != null) {
            aVar.m(f10);
        }
        a<?, Float> aVar2 = this.f39953m;
        if (aVar2 != null) {
            aVar2.m(f10);
        }
        a<?, Float> aVar3 = this.f39954n;
        if (aVar3 != null) {
            aVar3.m(f10);
        }
        a<PointF, PointF> aVar4 = this.f39946f;
        if (aVar4 != null) {
            aVar4.m(f10);
        }
        a<?, PointF> aVar5 = this.f39947g;
        if (aVar5 != null) {
            aVar5.m(f10);
        }
        a<j2.d, j2.d> aVar6 = this.f39948h;
        if (aVar6 != null) {
            aVar6.m(f10);
        }
        a<Float, Float> aVar7 = this.f39949i;
        if (aVar7 != null) {
            aVar7.m(f10);
        }
        d dVar = this.f39951k;
        if (dVar != null) {
            dVar.m(f10);
        }
        d dVar2 = this.f39952l;
        if (dVar2 != null) {
            dVar2.m(f10);
        }
    }
}
