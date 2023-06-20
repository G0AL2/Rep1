package z8;

import j8.p1;
import java.util.List;
import z8.i0;

/* compiled from: UserDataReader.java */
/* loaded from: classes2.dex */
final class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<p1> f40272a;

    /* renamed from: b  reason: collision with root package name */
    private final p8.a0[] f40273b;

    public k0(List<p1> list) {
        this.f40272a = list;
        this.f40273b = new p8.a0[list.size()];
    }

    public void a(long j10, ea.a0 a0Var) {
        if (a0Var.a() < 9) {
            return;
        }
        int n10 = a0Var.n();
        int n11 = a0Var.n();
        int D = a0Var.D();
        if (n10 == 434 && n11 == 1195456820 && D == 3) {
            p8.c.b(j10, a0Var, this.f40273b);
        }
    }

    public void b(p8.k kVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f40273b.length; i10++) {
            dVar.a();
            p8.a0 f10 = kVar.f(dVar.c(), 3);
            p1 p1Var = this.f40272a.get(i10);
            String str = p1Var.f32709l;
            boolean z10 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String valueOf = String.valueOf(str);
            ea.a.b(z10, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            f10.d(new p1.b().S(dVar.b()).e0(str).g0(p1Var.f32701d).V(p1Var.f32700c).F(p1Var.D).T(p1Var.f32711n).E());
            this.f40273b[i10] = f10;
        }
    }
}
