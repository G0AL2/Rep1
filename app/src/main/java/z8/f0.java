package z8;

import ea.n0;
import java.io.IOException;

/* compiled from: TsDurationReader.java */
/* loaded from: classes2.dex */
final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f40177a;

    /* renamed from: d  reason: collision with root package name */
    private boolean f40180d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f40181e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f40182f;

    /* renamed from: b  reason: collision with root package name */
    private final ea.j0 f40178b = new ea.j0(0);

    /* renamed from: g  reason: collision with root package name */
    private long f40183g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f40184h = -9223372036854775807L;

    /* renamed from: i  reason: collision with root package name */
    private long f40185i = -9223372036854775807L;

    /* renamed from: c  reason: collision with root package name */
    private final ea.a0 f40179c = new ea.a0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(int i10) {
        this.f40177a = i10;
    }

    private int a(p8.j jVar) {
        this.f40179c.M(n0.f29714f);
        this.f40180d = true;
        jVar.f();
        return 0;
    }

    private int f(p8.j jVar, p8.w wVar, int i10) throws IOException {
        int min = (int) Math.min(this.f40177a, jVar.b());
        long j10 = 0;
        if (jVar.getPosition() != j10) {
            wVar.f35701a = j10;
            return 1;
        }
        this.f40179c.L(min);
        jVar.f();
        jVar.p(this.f40179c.d(), 0, min);
        this.f40183g = g(this.f40179c, i10);
        this.f40181e = true;
        return 0;
    }

    private long g(ea.a0 a0Var, int i10) {
        int f10 = a0Var.f();
        for (int e10 = a0Var.e(); e10 < f10; e10++) {
            if (a0Var.d()[e10] == 71) {
                long c10 = j0.c(a0Var, e10, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(p8.j jVar, p8.w wVar, int i10) throws IOException {
        long b10 = jVar.b();
        int min = (int) Math.min(this.f40177a, b10);
        long j10 = b10 - min;
        if (jVar.getPosition() != j10) {
            wVar.f35701a = j10;
            return 1;
        }
        this.f40179c.L(min);
        jVar.f();
        jVar.p(this.f40179c.d(), 0, min);
        this.f40184h = i(this.f40179c, i10);
        this.f40182f = true;
        return 0;
    }

    private long i(ea.a0 a0Var, int i10) {
        int e10 = a0Var.e();
        int f10 = a0Var.f();
        for (int i11 = f10 - 188; i11 >= e10; i11--) {
            if (j0.b(a0Var.d(), e10, f10, i11)) {
                long c10 = j0.c(a0Var, i11, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f40185i;
    }

    public ea.j0 c() {
        return this.f40178b;
    }

    public boolean d() {
        return this.f40180d;
    }

    public int e(p8.j jVar, p8.w wVar, int i10) throws IOException {
        if (i10 <= 0) {
            return a(jVar);
        }
        if (!this.f40182f) {
            return h(jVar, wVar, i10);
        }
        if (this.f40184h == -9223372036854775807L) {
            return a(jVar);
        }
        if (!this.f40181e) {
            return f(jVar, wVar, i10);
        }
        long j10 = this.f40183g;
        if (j10 == -9223372036854775807L) {
            return a(jVar);
        }
        long b10 = this.f40178b.b(this.f40184h) - this.f40178b.b(j10);
        this.f40185i = b10;
        if (b10 < 0) {
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("Invalid duration: ");
            sb2.append(b10);
            sb2.append(". Using TIME_UNSET instead.");
            ea.r.h("TsDurationReader", sb2.toString());
            this.f40185i = -9223372036854775807L;
        }
        return a(jVar);
    }
}
