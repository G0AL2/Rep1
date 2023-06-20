package y1;

import android.graphics.Path;
import com.airbnb.lottie.d0;
import d2.s;
import java.util.ArrayList;
import java.util.List;
import z1.a;

/* compiled from: ShapeContent.java */
/* loaded from: classes.dex */
public class r implements m, a.b {

    /* renamed from: b  reason: collision with root package name */
    private final boolean f39112b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f39113c;

    /* renamed from: d  reason: collision with root package name */
    private final z1.m f39114d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f39115e;

    /* renamed from: a  reason: collision with root package name */
    private final Path f39111a = new Path();

    /* renamed from: f  reason: collision with root package name */
    private final b f39116f = new b();

    public r(d0 d0Var, e2.b bVar, d2.q qVar) {
        qVar.b();
        this.f39112b = qVar.d();
        this.f39113c = d0Var;
        z1.m a10 = qVar.c().a();
        this.f39114d = a10;
        bVar.i(a10);
        a10.a(this);
    }

    private void d() {
        this.f39115e = false;
        this.f39113c.invalidateSelf();
    }

    @Override // z1.a.b
    public void a() {
        d();
    }

    @Override // y1.c
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == s.a.SIMULTANEOUSLY) {
                    this.f39116f.a(uVar);
                    uVar.d(this);
                }
            }
            if (cVar instanceof s) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((s) cVar);
            }
        }
        this.f39114d.q(arrayList);
    }

    @Override // y1.m
    public Path getPath() {
        if (this.f39115e) {
            return this.f39111a;
        }
        this.f39111a.reset();
        if (this.f39112b) {
            this.f39115e = true;
            return this.f39111a;
        }
        Path h10 = this.f39114d.h();
        if (h10 == null) {
            return this.f39111a;
        }
        this.f39111a.set(h10);
        this.f39111a.setFillType(Path.FillType.EVEN_ODD);
        this.f39116f.b(this.f39111a);
        this.f39115e = true;
        return this.f39111a;
    }
}
