package z8;

import ea.n0;
import z8.i0;

/* compiled from: SectionReader.java */
/* loaded from: classes2.dex */
public final class c0 implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f40148a;

    /* renamed from: b  reason: collision with root package name */
    private final ea.a0 f40149b = new ea.a0(32);

    /* renamed from: c  reason: collision with root package name */
    private int f40150c;

    /* renamed from: d  reason: collision with root package name */
    private int f40151d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f40152e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f40153f;

    public c0(b0 b0Var) {
        this.f40148a = b0Var;
    }

    @Override // z8.i0
    public void a(ea.j0 j0Var, p8.k kVar, i0.d dVar) {
        this.f40148a.a(j0Var, kVar, dVar);
        this.f40153f = true;
    }

    @Override // z8.i0
    public void b() {
        this.f40153f = true;
    }

    @Override // z8.i0
    public void c(ea.a0 a0Var, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int e10 = z10 ? a0Var.e() + a0Var.D() : -1;
        if (this.f40153f) {
            if (!z10) {
                return;
            }
            this.f40153f = false;
            a0Var.P(e10);
            this.f40151d = 0;
        }
        while (a0Var.a() > 0) {
            int i11 = this.f40151d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int D = a0Var.D();
                    a0Var.P(a0Var.e() - 1);
                    if (D == 255) {
                        this.f40153f = true;
                        return;
                    }
                }
                int min = Math.min(a0Var.a(), 3 - this.f40151d);
                a0Var.j(this.f40149b.d(), this.f40151d, min);
                int i12 = this.f40151d + min;
                this.f40151d = i12;
                if (i12 == 3) {
                    this.f40149b.P(0);
                    this.f40149b.O(3);
                    this.f40149b.Q(1);
                    int D2 = this.f40149b.D();
                    int D3 = this.f40149b.D();
                    this.f40152e = (D2 & 128) != 0;
                    this.f40150c = (((D2 & 15) << 8) | D3) + 3;
                    int b10 = this.f40149b.b();
                    int i13 = this.f40150c;
                    if (b10 < i13) {
                        this.f40149b.c(Math.min(4098, Math.max(i13, this.f40149b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(a0Var.a(), this.f40150c - this.f40151d);
                a0Var.j(this.f40149b.d(), this.f40151d, min2);
                int i14 = this.f40151d + min2;
                this.f40151d = i14;
                int i15 = this.f40150c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f40152e) {
                        if (n0.t(this.f40149b.d(), 0, this.f40150c, -1) != 0) {
                            this.f40153f = true;
                            return;
                        }
                        this.f40149b.O(this.f40150c - 4);
                    } else {
                        this.f40149b.O(i15);
                    }
                    this.f40149b.P(0);
                    this.f40148a.c(this.f40149b);
                    this.f40151d = 0;
                }
            }
        }
    }
}
