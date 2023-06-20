package z8;

import j8.p1;
import z8.i0;

/* compiled from: Id3Reader.java */
/* loaded from: classes2.dex */
public final class r implements m {

    /* renamed from: b  reason: collision with root package name */
    private p8.a0 f40405b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f40406c;

    /* renamed from: e  reason: collision with root package name */
    private int f40408e;

    /* renamed from: f  reason: collision with root package name */
    private int f40409f;

    /* renamed from: a  reason: collision with root package name */
    private final ea.a0 f40404a = new ea.a0(10);

    /* renamed from: d  reason: collision with root package name */
    private long f40407d = -9223372036854775807L;

    @Override // z8.m
    public void b() {
        this.f40406c = false;
        this.f40407d = -9223372036854775807L;
    }

    @Override // z8.m
    public void c(ea.a0 a0Var) {
        ea.a.h(this.f40405b);
        if (this.f40406c) {
            int a10 = a0Var.a();
            int i10 = this.f40409f;
            if (i10 < 10) {
                int min = Math.min(a10, 10 - i10);
                System.arraycopy(a0Var.d(), a0Var.e(), this.f40404a.d(), this.f40409f, min);
                if (this.f40409f + min == 10) {
                    this.f40404a.P(0);
                    if (73 == this.f40404a.D() && 68 == this.f40404a.D() && 51 == this.f40404a.D()) {
                        this.f40404a.Q(3);
                        this.f40408e = this.f40404a.C() + 10;
                    } else {
                        ea.r.h("Id3Reader", "Discarding invalid ID3 tag");
                        this.f40406c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a10, this.f40408e - this.f40409f);
            this.f40405b.a(a0Var, min2);
            this.f40409f += min2;
        }
    }

    @Override // z8.m
    public void d() {
        int i10;
        ea.a.h(this.f40405b);
        if (this.f40406c && (i10 = this.f40408e) != 0 && this.f40409f == i10) {
            long j10 = this.f40407d;
            if (j10 != -9223372036854775807L) {
                this.f40405b.e(j10, 1, i10, 0, null);
            }
            this.f40406c = false;
        }
    }

    @Override // z8.m
    public void e(p8.k kVar, i0.d dVar) {
        dVar.a();
        p8.a0 f10 = kVar.f(dVar.c(), 5);
        this.f40405b = f10;
        f10.d(new p1.b().S(dVar.b()).e0("application/id3").E());
    }

    @Override // z8.m
    public void f(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f40406c = true;
        if (j10 != -9223372036854775807L) {
            this.f40407d = j10;
        }
        this.f40408e = 0;
        this.f40409f = 0;
    }
}
