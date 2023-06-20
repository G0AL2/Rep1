package y1;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.d0;
import com.airbnb.lottie.i0;
import d2.s;
import java.util.List;
import z1.a;

/* compiled from: RectangleContent.java */
/* loaded from: classes.dex */
public class o implements a.b, k, m {

    /* renamed from: c  reason: collision with root package name */
    private final String f39089c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f39090d;

    /* renamed from: e  reason: collision with root package name */
    private final d0 f39091e;

    /* renamed from: f  reason: collision with root package name */
    private final z1.a<?, PointF> f39092f;

    /* renamed from: g  reason: collision with root package name */
    private final z1.a<?, PointF> f39093g;

    /* renamed from: h  reason: collision with root package name */
    private final z1.a<?, Float> f39094h;

    /* renamed from: k  reason: collision with root package name */
    private boolean f39097k;

    /* renamed from: a  reason: collision with root package name */
    private final Path f39087a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final RectF f39088b = new RectF();

    /* renamed from: i  reason: collision with root package name */
    private final b f39095i = new b();

    /* renamed from: j  reason: collision with root package name */
    private z1.a<Float, Float> f39096j = null;

    public o(d0 d0Var, e2.b bVar, d2.k kVar) {
        this.f39089c = kVar.c();
        this.f39090d = kVar.f();
        this.f39091e = d0Var;
        z1.a<PointF, PointF> a10 = kVar.d().a();
        this.f39092f = a10;
        z1.a<PointF, PointF> a11 = kVar.e().a();
        this.f39093g = a11;
        z1.a<Float, Float> a12 = kVar.b().a();
        this.f39094h = a12;
        bVar.i(a10);
        bVar.i(a11);
        bVar.i(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    private void g() {
        this.f39097k = false;
        this.f39091e.invalidateSelf();
    }

    @Override // z1.a.b
    public void a() {
        g();
    }

    @Override // y1.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == s.a.SIMULTANEOUSLY) {
                    this.f39095i.a(uVar);
                    uVar.d(this);
                }
            }
            if (cVar instanceof q) {
                this.f39096j = ((q) cVar).g();
            }
        }
    }

    @Override // b2.f
    public void d(b2.e eVar, int i10, List<b2.e> list, b2.e eVar2) {
        i2.g.k(eVar, i10, list, eVar2, this);
    }

    @Override // b2.f
    public <T> void e(T t10, j2.c<T> cVar) {
        if (t10 == i0.f5814l) {
            this.f39093g.n(cVar);
        } else if (t10 == i0.f5816n) {
            this.f39092f.n(cVar);
        } else if (t10 == i0.f5815m) {
            this.f39094h.n(cVar);
        }
    }

    @Override // y1.c
    public String getName() {
        return this.f39089c;
    }

    @Override // y1.m
    public Path getPath() {
        z1.a<Float, Float> aVar;
        if (this.f39097k) {
            return this.f39087a;
        }
        this.f39087a.reset();
        if (this.f39090d) {
            this.f39097k = true;
            return this.f39087a;
        }
        PointF h10 = this.f39093g.h();
        float f10 = h10.x / 2.0f;
        float f11 = h10.y / 2.0f;
        z1.a<?, Float> aVar2 = this.f39094h;
        float p10 = aVar2 == null ? 0.0f : ((z1.d) aVar2).p();
        if (p10 == 0.0f && (aVar = this.f39096j) != null) {
            p10 = Math.min(aVar.h().floatValue(), Math.min(f10, f11));
        }
        float min = Math.min(f10, f11);
        if (p10 > min) {
            p10 = min;
        }
        PointF h11 = this.f39092f.h();
        this.f39087a.moveTo(h11.x + f10, (h11.y - f11) + p10);
        this.f39087a.lineTo(h11.x + f10, (h11.y + f11) - p10);
        int i10 = (p10 > 0.0f ? 1 : (p10 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            RectF rectF = this.f39088b;
            float f12 = h11.x;
            float f13 = p10 * 2.0f;
            float f14 = h11.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.f39087a.arcTo(this.f39088b, 0.0f, 90.0f, false);
        }
        this.f39087a.lineTo((h11.x - f10) + p10, h11.y + f11);
        if (i10 > 0) {
            RectF rectF2 = this.f39088b;
            float f15 = h11.x;
            float f16 = h11.y;
            float f17 = p10 * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.f39087a.arcTo(this.f39088b, 90.0f, 90.0f, false);
        }
        this.f39087a.lineTo(h11.x - f10, (h11.y - f11) + p10);
        if (i10 > 0) {
            RectF rectF3 = this.f39088b;
            float f18 = h11.x;
            float f19 = h11.y;
            float f20 = p10 * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.f39087a.arcTo(this.f39088b, 180.0f, 90.0f, false);
        }
        this.f39087a.lineTo((h11.x + f10) - p10, h11.y - f11);
        if (i10 > 0) {
            RectF rectF4 = this.f39088b;
            float f21 = h11.x;
            float f22 = p10 * 2.0f;
            float f23 = h11.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.f39087a.arcTo(this.f39088b, 270.0f, 90.0f, false);
        }
        this.f39087a.close();
        this.f39095i.b(this.f39087a);
        this.f39097k = true;
        return this.f39087a;
    }
}
