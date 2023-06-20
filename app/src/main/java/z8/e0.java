package z8;

import ea.n0;
import java.io.IOException;
import p8.a;

/* compiled from: TsBinarySearchSeeker.java */
/* loaded from: classes2.dex */
final class e0 extends p8.a {

    /* compiled from: TsBinarySearchSeeker.java */
    /* loaded from: classes2.dex */
    private static final class a implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final ea.j0 f40160a;

        /* renamed from: b  reason: collision with root package name */
        private final ea.a0 f40161b = new ea.a0();

        /* renamed from: c  reason: collision with root package name */
        private final int f40162c;

        /* renamed from: d  reason: collision with root package name */
        private final int f40163d;

        public a(int i10, ea.j0 j0Var, int i11) {
            this.f40162c = i10;
            this.f40160a = j0Var;
            this.f40163d = i11;
        }

        private a.e c(ea.a0 a0Var, long j10, long j11) {
            int a10;
            int a11;
            int f10 = a0Var.f();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (a0Var.a() >= 188 && (a11 = (a10 = j0.a(a0Var.d(), a0Var.e(), f10)) + 188) <= f10) {
                long c10 = j0.c(a0Var, a10, this.f40162c);
                if (c10 != -9223372036854775807L) {
                    long b10 = this.f40160a.b(c10);
                    if (b10 > j10) {
                        if (j14 == -9223372036854775807L) {
                            return a.e.d(b10, j11);
                        }
                        return a.e.e(j11 + j13);
                    } else if (100000 + b10 > j10) {
                        return a.e.e(j11 + a10);
                    } else {
                        j13 = a10;
                        j14 = b10;
                    }
                }
                a0Var.P(a11);
                j12 = a11;
            }
            if (j14 != -9223372036854775807L) {
                return a.e.f(j14, j11 + j12);
            }
            return a.e.f35607d;
        }

        @Override // p8.a.f
        public a.e a(p8.j jVar, long j10) throws IOException {
            long position = jVar.getPosition();
            int min = (int) Math.min(this.f40163d, jVar.b() - position);
            this.f40161b.L(min);
            jVar.p(this.f40161b.d(), 0, min);
            return c(this.f40161b, j10, position);
        }

        @Override // p8.a.f
        public void b() {
            this.f40161b.M(n0.f29714f);
        }
    }

    public e0(ea.j0 j0Var, long j10, long j11, int i10, int i11) {
        super(new a.b(), new a(i10, j0Var, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
