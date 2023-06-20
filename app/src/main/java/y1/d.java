package y1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.d0;
import java.util.ArrayList;
import java.util.List;
import z1.a;

/* compiled from: ContentGroup.java */
/* loaded from: classes.dex */
public class d implements e, m, a.b, b2.f {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f39003a;

    /* renamed from: b  reason: collision with root package name */
    private final RectF f39004b;

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f39005c;

    /* renamed from: d  reason: collision with root package name */
    private final Path f39006d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f39007e;

    /* renamed from: f  reason: collision with root package name */
    private final String f39008f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f39009g;

    /* renamed from: h  reason: collision with root package name */
    private final List<c> f39010h;

    /* renamed from: i  reason: collision with root package name */
    private final d0 f39011i;

    /* renamed from: j  reason: collision with root package name */
    private List<m> f39012j;

    /* renamed from: k  reason: collision with root package name */
    private z1.p f39013k;

    public d(d0 d0Var, e2.b bVar, d2.p pVar) {
        this(d0Var, bVar, pVar.c(), pVar.d(), g(d0Var, bVar, pVar.b()), i(pVar.b()));
    }

    private static List<c> g(d0 d0Var, e2.b bVar, List<d2.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            c a10 = list.get(i10).a(d0Var, bVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    static c2.l i(List<d2.c> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            d2.c cVar = list.get(i10);
            if (cVar instanceof c2.l) {
                return (c2.l) cVar;
            }
        }
        return null;
    }

    private boolean l() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f39010h.size(); i11++) {
            if ((this.f39010h.get(i11) instanceof e) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // z1.a.b
    public void a() {
        this.f39011i.invalidateSelf();
    }

    @Override // y1.c
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f39010h.size());
        arrayList.addAll(list);
        for (int size = this.f39010h.size() - 1; size >= 0; size--) {
            c cVar = this.f39010h.get(size);
            cVar.b(arrayList, this.f39010h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // b2.f
    public void d(b2.e eVar, int i10, List<b2.e> list, b2.e eVar2) {
        if (eVar.g(getName(), i10) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                int e10 = i10 + eVar.e(getName(), i10);
                for (int i11 = 0; i11 < this.f39010h.size(); i11++) {
                    c cVar = this.f39010h.get(i11);
                    if (cVar instanceof b2.f) {
                        ((b2.f) cVar).d(eVar, e10, list, eVar2);
                    }
                }
            }
        }
    }

    @Override // b2.f
    public <T> void e(T t10, j2.c<T> cVar) {
        z1.p pVar = this.f39013k;
        if (pVar != null) {
            pVar.c(t10, cVar);
        }
    }

    @Override // y1.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        this.f39005c.set(matrix);
        z1.p pVar = this.f39013k;
        if (pVar != null) {
            this.f39005c.preConcat(pVar.f());
        }
        this.f39007e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f39010h.size() - 1; size >= 0; size--) {
            c cVar = this.f39010h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).f(this.f39007e, this.f39005c, z10);
                rectF.union(this.f39007e);
            }
        }
    }

    @Override // y1.c
    public String getName() {
        return this.f39008f;
    }

    @Override // y1.m
    public Path getPath() {
        this.f39005c.reset();
        z1.p pVar = this.f39013k;
        if (pVar != null) {
            this.f39005c.set(pVar.f());
        }
        this.f39006d.reset();
        if (this.f39009g) {
            return this.f39006d;
        }
        for (int size = this.f39010h.size() - 1; size >= 0; size--) {
            c cVar = this.f39010h.get(size);
            if (cVar instanceof m) {
                this.f39006d.addPath(((m) cVar).getPath(), this.f39005c);
            }
        }
        return this.f39006d;
    }

    @Override // y1.e
    public void h(Canvas canvas, Matrix matrix, int i10) {
        if (this.f39009g) {
            return;
        }
        this.f39005c.set(matrix);
        z1.p pVar = this.f39013k;
        if (pVar != null) {
            this.f39005c.preConcat(pVar.f());
            i10 = (int) (((((this.f39013k.h() == null ? 100 : this.f39013k.h().h().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = this.f39011i.b0() && l() && i10 != 255;
        if (z10) {
            this.f39004b.set(0.0f, 0.0f, 0.0f, 0.0f);
            f(this.f39004b, this.f39005c, true);
            this.f39003a.setAlpha(i10);
            i2.h.m(canvas, this.f39004b, this.f39003a);
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.f39010h.size() - 1; size >= 0; size--) {
            c cVar = this.f39010h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).h(canvas, this.f39005c, i10);
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<m> j() {
        if (this.f39012j == null) {
            this.f39012j = new ArrayList();
            for (int i10 = 0; i10 < this.f39010h.size(); i10++) {
                c cVar = this.f39010h.get(i10);
                if (cVar instanceof m) {
                    this.f39012j.add((m) cVar);
                }
            }
        }
        return this.f39012j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Matrix k() {
        z1.p pVar = this.f39013k;
        if (pVar != null) {
            return pVar.f();
        }
        this.f39005c.reset();
        return this.f39005c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(d0 d0Var, e2.b bVar, String str, boolean z10, List<c> list, c2.l lVar) {
        this.f39003a = new x1.a();
        this.f39004b = new RectF();
        this.f39005c = new Matrix();
        this.f39006d = new Path();
        this.f39007e = new RectF();
        this.f39008f = str;
        this.f39011i = d0Var;
        this.f39009g = z10;
        this.f39010h = list;
        if (lVar != null) {
            z1.p b10 = lVar.b();
            this.f39013k = b10;
            b10.a(bVar);
            this.f39013k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).g(list.listIterator(list.size()));
        }
    }
}
