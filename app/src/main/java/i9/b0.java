package i9;

import android.os.Handler;
import i9.b0;
import i9.u;
import j8.p1;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MediaSourceEventListener.java */
/* loaded from: classes2.dex */
public interface b0 {

    /* compiled from: MediaSourceEventListener.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public final int f31560a;

        /* renamed from: b */
        public final u.b f31561b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C0406a> f31562c;

        /* renamed from: d */
        private final long f31563d;

        /* compiled from: MediaSourceEventListener.java */
        /* renamed from: i9.b0$a$a */
        /* loaded from: classes2.dex */
        public static final class C0406a {

            /* renamed from: a */
            public Handler f31564a;

            /* renamed from: b */
            public b0 f31565b;

            public C0406a(Handler handler, b0 b0Var) {
                this.f31564a = handler;
                this.f31565b = b0Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public static /* synthetic */ void b(a aVar, b0 b0Var, n nVar, q qVar, IOException iOException, boolean z10) {
            aVar.n(b0Var, nVar, qVar, iOException, z10);
        }

        public static /* synthetic */ void c(a aVar, b0 b0Var, n nVar, q qVar) {
            aVar.m(b0Var, nVar, qVar);
        }

        public static /* synthetic */ void d(a aVar, b0 b0Var, q qVar) {
            aVar.k(b0Var, qVar);
        }

        public static /* synthetic */ void e(a aVar, b0 b0Var, n nVar, q qVar) {
            aVar.o(b0Var, nVar, qVar);
        }

        public static /* synthetic */ void f(a aVar, b0 b0Var, n nVar, q qVar) {
            aVar.l(b0Var, nVar, qVar);
        }

        private long h(long j10) {
            long Z0 = ea.n0.Z0(j10);
            if (Z0 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f31563d + Z0;
        }

        public /* synthetic */ void k(b0 b0Var, q qVar) {
            b0Var.h(this.f31560a, this.f31561b, qVar);
        }

        public /* synthetic */ void l(b0 b0Var, n nVar, q qVar) {
            b0Var.F(this.f31560a, this.f31561b, nVar, qVar);
        }

        public /* synthetic */ void m(b0 b0Var, n nVar, q qVar) {
            b0Var.j0(this.f31560a, this.f31561b, nVar, qVar);
        }

        public /* synthetic */ void n(b0 b0Var, n nVar, q qVar, IOException iOException, boolean z10) {
            b0Var.b0(this.f31560a, this.f31561b, nVar, qVar, iOException, z10);
        }

        public /* synthetic */ void o(b0 b0Var, n nVar, q qVar) {
            b0Var.S(this.f31560a, this.f31561b, nVar, qVar);
        }

        public /* synthetic */ void p(b0 b0Var, u.b bVar, q qVar) {
            b0Var.a0(this.f31560a, bVar, qVar);
        }

        public void A(n nVar, int i10, int i11, p1 p1Var, int i12, Object obj, long j10, long j11) {
            B(nVar, new q(i10, i11, p1Var, i12, obj, h(j10), h(j11)));
        }

        public void B(final n nVar, final q qVar) {
            Iterator<C0406a> it = this.f31562c.iterator();
            while (it.hasNext()) {
                C0406a next = it.next();
                final b0 b0Var = next.f31565b;
                ea.n0.L0(next.f31564a, new Runnable() { // from class: i9.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.a.e(b0.a.this, b0Var, nVar, qVar);
                    }
                });
            }
        }

        public void C(b0 b0Var) {
            Iterator<C0406a> it = this.f31562c.iterator();
            while (it.hasNext()) {
                C0406a next = it.next();
                if (next.f31565b == b0Var) {
                    this.f31562c.remove(next);
                }
            }
        }

        public void D(int i10, long j10, long j11) {
            E(new q(1, i10, null, 3, null, h(j10), h(j11)));
        }

        public void E(final q qVar) {
            final u.b bVar = (u.b) ea.a.e(this.f31561b);
            Iterator<C0406a> it = this.f31562c.iterator();
            while (it.hasNext()) {
                C0406a next = it.next();
                final b0 b0Var = next.f31565b;
                ea.n0.L0(next.f31564a, new Runnable() { // from class: i9.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.a.this.p(b0Var, bVar, qVar);
                    }
                });
            }
        }

        public a F(int i10, u.b bVar, long j10) {
            return new a(this.f31562c, i10, bVar, j10);
        }

        public void g(Handler handler, b0 b0Var) {
            ea.a.e(handler);
            ea.a.e(b0Var);
            this.f31562c.add(new C0406a(handler, b0Var));
        }

        public void i(int i10, p1 p1Var, int i11, Object obj, long j10) {
            j(new q(1, i10, p1Var, i11, obj, h(j10), -9223372036854775807L));
        }

        public void j(final q qVar) {
            Iterator<C0406a> it = this.f31562c.iterator();
            while (it.hasNext()) {
                C0406a next = it.next();
                final b0 b0Var = next.f31565b;
                ea.n0.L0(next.f31564a, new Runnable() { // from class: i9.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.a.d(b0.a.this, b0Var, qVar);
                    }
                });
            }
        }

        public void q(n nVar, int i10) {
            r(nVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void r(n nVar, int i10, int i11, p1 p1Var, int i12, Object obj, long j10, long j11) {
            s(nVar, new q(i10, i11, p1Var, i12, obj, h(j10), h(j11)));
        }

        public void s(final n nVar, final q qVar) {
            Iterator<C0406a> it = this.f31562c.iterator();
            while (it.hasNext()) {
                C0406a next = it.next();
                final b0 b0Var = next.f31565b;
                ea.n0.L0(next.f31564a, new Runnable() { // from class: i9.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.a.f(b0.a.this, b0Var, nVar, qVar);
                    }
                });
            }
        }

        public void t(n nVar, int i10) {
            u(nVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void u(n nVar, int i10, int i11, p1 p1Var, int i12, Object obj, long j10, long j11) {
            v(nVar, new q(i10, i11, p1Var, i12, obj, h(j10), h(j11)));
        }

        public void v(final n nVar, final q qVar) {
            Iterator<C0406a> it = this.f31562c.iterator();
            while (it.hasNext()) {
                C0406a next = it.next();
                final b0 b0Var = next.f31565b;
                ea.n0.L0(next.f31564a, new Runnable() { // from class: i9.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.a.c(b0.a.this, b0Var, nVar, qVar);
                    }
                });
            }
        }

        public void w(n nVar, int i10, int i11, p1 p1Var, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            y(nVar, new q(i10, i11, p1Var, i12, obj, h(j10), h(j11)), iOException, z10);
        }

        public void x(n nVar, int i10, IOException iOException, boolean z10) {
            w(nVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        public void y(final n nVar, final q qVar, final IOException iOException, final boolean z10) {
            Iterator<C0406a> it = this.f31562c.iterator();
            while (it.hasNext()) {
                C0406a next = it.next();
                final b0 b0Var = next.f31565b;
                ea.n0.L0(next.f31564a, new Runnable() { // from class: i9.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.a.b(b0.a.this, b0Var, nVar, qVar, iOException, z10);
                    }
                });
            }
        }

        public void z(n nVar, int i10) {
            A(nVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        private a(CopyOnWriteArrayList<C0406a> copyOnWriteArrayList, int i10, u.b bVar, long j10) {
            this.f31562c = copyOnWriteArrayList;
            this.f31560a = i10;
            this.f31561b = bVar;
            this.f31563d = j10;
        }
    }

    void F(int i10, u.b bVar, n nVar, q qVar);

    void S(int i10, u.b bVar, n nVar, q qVar);

    void a0(int i10, u.b bVar, q qVar);

    void b0(int i10, u.b bVar, n nVar, q qVar, IOException iOException, boolean z10);

    void h(int i10, u.b bVar, q qVar);

    void j0(int i10, u.b bVar, n nVar, q qVar);
}
