package z8;

import j8.p1;
import java.util.List;
import z8.i0;

/* compiled from: SeiReader.java */
/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<p1> f40155a;

    /* renamed from: b  reason: collision with root package name */
    private final p8.a0[] f40156b;

    public d0(List<p1> list) {
        this.f40155a = list;
        this.f40156b = new p8.a0[list.size()];
    }

    public void a(long j10, ea.a0 a0Var) {
        p8.c.a(j10, a0Var, this.f40156b);
    }

    public void b(p8.k kVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f40156b.length; i10++) {
            dVar.a();
            p8.a0 f10 = kVar.f(dVar.c(), 3);
            p1 p1Var = this.f40155a.get(i10);
            String str = p1Var.f32709l;
            boolean z10 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String valueOf = String.valueOf(str);
            ea.a.b(z10, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            String str2 = p1Var.f32698a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            f10.d(new p1.b().S(str2).e0(str).g0(p1Var.f32701d).V(p1Var.f32700c).F(p1Var.D).T(p1Var.f32711n).E());
            this.f40156b[i10] = f10;
        }
    }
}
