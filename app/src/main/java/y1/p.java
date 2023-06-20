package y1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.d0;
import com.airbnb.lottie.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import z1.a;

/* compiled from: RepeaterContent.java */
/* loaded from: classes.dex */
public class p implements e, m, j, a.b, k {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f39098a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private final Path f39099b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final d0 f39100c;

    /* renamed from: d  reason: collision with root package name */
    private final e2.b f39101d;

    /* renamed from: e  reason: collision with root package name */
    private final String f39102e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f39103f;

    /* renamed from: g  reason: collision with root package name */
    private final z1.a<Float, Float> f39104g;

    /* renamed from: h  reason: collision with root package name */
    private final z1.a<Float, Float> f39105h;

    /* renamed from: i  reason: collision with root package name */
    private final z1.p f39106i;

    /* renamed from: j  reason: collision with root package name */
    private d f39107j;

    public p(d0 d0Var, e2.b bVar, d2.l lVar) {
        this.f39100c = d0Var;
        this.f39101d = bVar;
        this.f39102e = lVar.c();
        this.f39103f = lVar.f();
        z1.a<Float, Float> a10 = lVar.b().a();
        this.f39104g = a10;
        bVar.i(a10);
        a10.a(this);
        z1.a<Float, Float> a11 = lVar.d().a();
        this.f39105h = a11;
        bVar.i(a11);
        a11.a(this);
        z1.p b10 = lVar.e().b();
        this.f39106i = b10;
        b10.a(bVar);
        b10.b(this);
    }

    @Override // z1.a.b
    public void a() {
        this.f39100c.invalidateSelf();
    }

    @Override // y1.c
    public void b(List<c> list, List<c> list2) {
        this.f39107j.b(list, list2);
    }

    @Override // b2.f
    public void d(b2.e eVar, int i10, List<b2.e> list, b2.e eVar2) {
        i2.g.k(eVar, i10, list, eVar2, this);
    }

    @Override // b2.f
    public <T> void e(T t10, j2.c<T> cVar) {
        if (this.f39106i.c(t10, cVar)) {
            return;
        }
        if (t10 == i0.f5823u) {
            this.f39104g.n(cVar);
        } else if (t10 == i0.f5824v) {
            this.f39105h.n(cVar);
        }
    }

    @Override // y1.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        this.f39107j.f(rectF, matrix, z10);
    }

    @Override // y1.j
    public void g(ListIterator<c> listIterator) {
        if (this.f39107j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f39107j = new d(this.f39100c, this.f39101d, "Repeater", this.f39103f, arrayList, null);
    }

    @Override // y1.c
    public String getName() {
        return this.f39102e;
    }

    @Override // y1.m
    public Path getPath() {
        Path path = this.f39107j.getPath();
        this.f39099b.reset();
        float floatValue = this.f39104g.h().floatValue();
        float floatValue2 = this.f39105h.h().floatValue();
        for (int i10 = ((int) floatValue) - 1; i10 >= 0; i10--) {
            this.f39098a.set(this.f39106i.g(i10 + floatValue2));
            this.f39099b.addPath(path, this.f39098a);
        }
        return this.f39099b;
    }

    @Override // y1.e
    public void h(Canvas canvas, Matrix matrix, int i10) {
        float floatValue = this.f39104g.h().floatValue();
        float floatValue2 = this.f39105h.h().floatValue();
        float floatValue3 = this.f39106i.i().h().floatValue() / 100.0f;
        float floatValue4 = this.f39106i.e().h().floatValue() / 100.0f;
        for (int i11 = ((int) floatValue) - 1; i11 >= 0; i11--) {
            this.f39098a.set(matrix);
            float f10 = i11;
            this.f39098a.preConcat(this.f39106i.g(f10 + floatValue2));
            this.f39107j.h(canvas, this.f39098a, (int) (i10 * i2.g.i(floatValue3, floatValue4, f10 / floatValue)));
        }
    }
}
