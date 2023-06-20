package z8;

import j8.p1;
import java.util.Collections;
import java.util.List;
import z8.i0;

/* compiled from: DvbSubtitleReader.java */
/* loaded from: classes2.dex */
public final class l implements m {

    /* renamed from: a  reason: collision with root package name */
    private final List<i0.a> f40274a;

    /* renamed from: b  reason: collision with root package name */
    private final p8.a0[] f40275b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f40276c;

    /* renamed from: d  reason: collision with root package name */
    private int f40277d;

    /* renamed from: e  reason: collision with root package name */
    private int f40278e;

    /* renamed from: f  reason: collision with root package name */
    private long f40279f = -9223372036854775807L;

    public l(List<i0.a> list) {
        this.f40274a = list;
        this.f40275b = new p8.a0[list.size()];
    }

    private boolean a(ea.a0 a0Var, int i10) {
        if (a0Var.a() == 0) {
            return false;
        }
        if (a0Var.D() != i10) {
            this.f40276c = false;
        }
        this.f40277d--;
        return this.f40276c;
    }

    @Override // z8.m
    public void b() {
        this.f40276c = false;
        this.f40279f = -9223372036854775807L;
    }

    @Override // z8.m
    public void c(ea.a0 a0Var) {
        p8.a0[] a0VarArr;
        if (this.f40276c) {
            if (this.f40277d != 2 || a(a0Var, 32)) {
                if (this.f40277d != 1 || a(a0Var, 0)) {
                    int e10 = a0Var.e();
                    int a10 = a0Var.a();
                    for (p8.a0 a0Var2 : this.f40275b) {
                        a0Var.P(e10);
                        a0Var2.a(a0Var, a10);
                    }
                    this.f40278e += a10;
                }
            }
        }
    }

    @Override // z8.m
    public void d() {
        if (this.f40276c) {
            if (this.f40279f != -9223372036854775807L) {
                for (p8.a0 a0Var : this.f40275b) {
                    a0Var.e(this.f40279f, 1, this.f40278e, 0, null);
                }
            }
            this.f40276c = false;
        }
    }

    @Override // z8.m
    public void e(p8.k kVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f40275b.length; i10++) {
            i0.a aVar = this.f40274a.get(i10);
            dVar.a();
            p8.a0 f10 = kVar.f(dVar.c(), 3);
            f10.d(new p1.b().S(dVar.b()).e0("application/dvbsubs").T(Collections.singletonList(aVar.f40249b)).V(aVar.f40248a).E());
            this.f40275b[i10] = f10;
        }
    }

    @Override // z8.m
    public void f(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f40276c = true;
        if (j10 != -9223372036854775807L) {
            this.f40279f = j10;
        }
        this.f40278e = 0;
        this.f40277d = 2;
    }
}
