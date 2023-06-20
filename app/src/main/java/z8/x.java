package z8;

import com.inmobi.media.fq;
import ea.n0;
import java.io.IOException;
import p8.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PsBinarySearchSeeker.java */
/* loaded from: classes2.dex */
public final class x extends p8.a {

    /* compiled from: PsBinarySearchSeeker.java */
    /* loaded from: classes2.dex */
    private static final class b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final ea.j0 f40463a;

        /* renamed from: b  reason: collision with root package name */
        private final ea.a0 f40464b;

        private a.e c(ea.a0 a0Var, long j10, long j11) {
            int i10 = -1;
            long j12 = -9223372036854775807L;
            int i11 = -1;
            while (a0Var.a() >= 4) {
                if (x.k(a0Var.d(), a0Var.e()) != 442) {
                    a0Var.Q(1);
                } else {
                    a0Var.Q(4);
                    long l10 = y.l(a0Var);
                    if (l10 != -9223372036854775807L) {
                        long b10 = this.f40463a.b(l10);
                        if (b10 > j10) {
                            if (j12 == -9223372036854775807L) {
                                return a.e.d(b10, j11);
                            }
                            return a.e.e(j11 + i11);
                        } else if (100000 + b10 > j10) {
                            return a.e.e(j11 + a0Var.e());
                        } else {
                            i11 = a0Var.e();
                            j12 = b10;
                        }
                    }
                    d(a0Var);
                    i10 = a0Var.e();
                }
            }
            if (j12 != -9223372036854775807L) {
                return a.e.f(j12, j11 + i10);
            }
            return a.e.f35607d;
        }

        private static void d(ea.a0 a0Var) {
            int k10;
            int f10 = a0Var.f();
            if (a0Var.a() < 10) {
                a0Var.P(f10);
                return;
            }
            a0Var.Q(9);
            int D = a0Var.D() & 7;
            if (a0Var.a() < D) {
                a0Var.P(f10);
                return;
            }
            a0Var.Q(D);
            if (a0Var.a() >= 4) {
                if (x.k(a0Var.d(), a0Var.e()) == 443) {
                    a0Var.Q(4);
                    int J = a0Var.J();
                    if (a0Var.a() < J) {
                        a0Var.P(f10);
                        return;
                    }
                    a0Var.Q(J);
                }
                while (a0Var.a() >= 4 && (k10 = x.k(a0Var.d(), a0Var.e())) != 442 && k10 != 441 && (k10 >>> 8) == 1) {
                    a0Var.Q(4);
                    if (a0Var.a() < 2) {
                        a0Var.P(f10);
                        return;
                    }
                    a0Var.P(Math.min(a0Var.f(), a0Var.e() + a0Var.J()));
                }
                return;
            }
            a0Var.P(f10);
        }

        @Override // p8.a.f
        public a.e a(p8.j jVar, long j10) throws IOException {
            long position = jVar.getPosition();
            int min = (int) Math.min(20000L, jVar.b() - position);
            this.f40464b.L(min);
            jVar.p(this.f40464b.d(), 0, min);
            return c(this.f40464b, j10, position);
        }

        @Override // p8.a.f
        public void b() {
            this.f40464b.M(n0.f29714f);
        }

        private b(ea.j0 j0Var) {
            this.f40463a = j0Var;
            this.f40464b = new ea.a0();
        }
    }

    public x(ea.j0 j0Var, long j10, long j11) {
        super(new a.b(), new b(j0Var), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }
}
