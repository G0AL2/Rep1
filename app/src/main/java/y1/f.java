package y1;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.d0;
import com.airbnb.lottie.i0;
import d2.s;
import java.util.List;
import z1.a;

/* compiled from: EllipseContent.java */
/* loaded from: classes.dex */
public class f implements m, a.b, k {

    /* renamed from: b  reason: collision with root package name */
    private final String f39015b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f39016c;

    /* renamed from: d  reason: collision with root package name */
    private final z1.a<?, PointF> f39017d;

    /* renamed from: e  reason: collision with root package name */
    private final z1.a<?, PointF> f39018e;

    /* renamed from: f  reason: collision with root package name */
    private final d2.b f39019f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f39021h;

    /* renamed from: a  reason: collision with root package name */
    private final Path f39014a = new Path();

    /* renamed from: g  reason: collision with root package name */
    private final b f39020g = new b();

    public f(d0 d0Var, e2.b bVar, d2.b bVar2) {
        this.f39015b = bVar2.b();
        this.f39016c = d0Var;
        z1.a<PointF, PointF> a10 = bVar2.d().a();
        this.f39017d = a10;
        z1.a<PointF, PointF> a11 = bVar2.c().a();
        this.f39018e = a11;
        this.f39019f = bVar2;
        bVar.i(a10);
        bVar.i(a11);
        a10.a(this);
        a11.a(this);
    }

    private void g() {
        this.f39021h = false;
        this.f39016c.invalidateSelf();
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
                    this.f39020g.a(uVar);
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
        if (t10 == i0.f5813k) {
            this.f39017d.n(cVar);
        } else if (t10 == i0.f5816n) {
            this.f39018e.n(cVar);
        }
    }

    @Override // y1.c
    public String getName() {
        return this.f39015b;
    }

    @Override // y1.m
    public Path getPath() {
        if (this.f39021h) {
            return this.f39014a;
        }
        this.f39014a.reset();
        if (this.f39019f.e()) {
            this.f39021h = true;
            return this.f39014a;
        }
        PointF h10 = this.f39017d.h();
        float f10 = h10.x / 2.0f;
        float f11 = h10.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.f39014a.reset();
        if (this.f39019f.f()) {
            float f14 = -f11;
            this.f39014a.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.f39014a.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.f39014a.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.f39014a.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.f39014a.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.f39014a.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.f39014a.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.f39014a.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.f39014a.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.f39014a.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF h11 = this.f39018e.h();
        this.f39014a.offset(h11.x, h11.y);
        this.f39014a.close();
        this.f39020g.b(this.f39014a);
        this.f39021h = true;
        return this.f39014a;
    }
}
