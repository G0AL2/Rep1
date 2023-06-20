package z8;

import ea.n0;
import j8.p1;
import z8.i0;

/* compiled from: PassthroughSectionPayloadReader.java */
/* loaded from: classes2.dex */
public final class v implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private p1 f40448a;

    /* renamed from: b  reason: collision with root package name */
    private ea.j0 f40449b;

    /* renamed from: c  reason: collision with root package name */
    private p8.a0 f40450c;

    public v(String str) {
        this.f40448a = new p1.b().e0(str).E();
    }

    private void b() {
        ea.a.h(this.f40449b);
        n0.j(this.f40450c);
    }

    @Override // z8.b0
    public void a(ea.j0 j0Var, p8.k kVar, i0.d dVar) {
        this.f40449b = j0Var;
        dVar.a();
        p8.a0 f10 = kVar.f(dVar.c(), 5);
        this.f40450c = f10;
        f10.d(this.f40448a);
    }

    @Override // z8.b0
    public void c(ea.a0 a0Var) {
        b();
        long d10 = this.f40449b.d();
        long e10 = this.f40449b.e();
        if (d10 == -9223372036854775807L || e10 == -9223372036854775807L) {
            return;
        }
        p1 p1Var = this.f40448a;
        if (e10 != p1Var.f32713p) {
            p1 E = p1Var.b().i0(e10).E();
            this.f40448a = E;
            this.f40450c.d(E);
        }
        int a10 = a0Var.a();
        this.f40450c.a(a0Var, a10);
        this.f40450c.e(d10, 1, a10, 0, null);
    }
}
