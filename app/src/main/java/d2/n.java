package d2;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeData.java */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final List<b2.a> f29004a;

    /* renamed from: b  reason: collision with root package name */
    private PointF f29005b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f29006c;

    public n(PointF pointF, boolean z10, List<b2.a> list) {
        this.f29005b = pointF;
        this.f29006c = z10;
        this.f29004a = new ArrayList(list);
    }

    public List<b2.a> a() {
        return this.f29004a;
    }

    public PointF b() {
        return this.f29005b;
    }

    public void c(n nVar, n nVar2, float f10) {
        if (this.f29005b == null) {
            this.f29005b = new PointF();
        }
        this.f29006c = nVar.d() || nVar2.d();
        if (nVar.a().size() != nVar2.a().size()) {
            i2.d.c("Curves must have the same number of control points. Shape 1: " + nVar.a().size() + "\tShape 2: " + nVar2.a().size());
        }
        int min = Math.min(nVar.a().size(), nVar2.a().size());
        if (this.f29004a.size() < min) {
            for (int size = this.f29004a.size(); size < min; size++) {
                this.f29004a.add(new b2.a());
            }
        } else if (this.f29004a.size() > min) {
            for (int size2 = this.f29004a.size() - 1; size2 >= min; size2--) {
                List<b2.a> list = this.f29004a;
                list.remove(list.size() - 1);
            }
        }
        PointF b10 = nVar.b();
        PointF b11 = nVar2.b();
        f(i2.g.i(b10.x, b11.x, f10), i2.g.i(b10.y, b11.y, f10));
        for (int size3 = this.f29004a.size() - 1; size3 >= 0; size3--) {
            b2.a aVar = nVar.a().get(size3);
            b2.a aVar2 = nVar2.a().get(size3);
            PointF a10 = aVar.a();
            PointF b12 = aVar.b();
            PointF c10 = aVar.c();
            PointF a11 = aVar2.a();
            PointF b13 = aVar2.b();
            PointF c11 = aVar2.c();
            this.f29004a.get(size3).d(i2.g.i(a10.x, a11.x, f10), i2.g.i(a10.y, a11.y, f10));
            this.f29004a.get(size3).e(i2.g.i(b12.x, b13.x, f10), i2.g.i(b12.y, b13.y, f10));
            this.f29004a.get(size3).f(i2.g.i(c10.x, c11.x, f10), i2.g.i(c10.y, c11.y, f10));
        }
    }

    public boolean d() {
        return this.f29006c;
    }

    public void e(boolean z10) {
        this.f29006c = z10;
    }

    public void f(float f10, float f11) {
        if (this.f29005b == null) {
            this.f29005b = new PointF();
        }
        this.f29005b.set(f10, f11);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f29004a.size() + "closed=" + this.f29006c + '}';
    }

    public n() {
        this.f29004a = new ArrayList();
    }
}
