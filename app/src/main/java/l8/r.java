package l8;

import android.os.Handler;
import ea.n0;
import j8.p1;
import l8.r;

/* compiled from: AudioRendererEventListener.java */
/* loaded from: classes2.dex */
public interface r {

    /* compiled from: AudioRendererEventListener.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final Handler f33898a;

        /* renamed from: b */
        private final r f33899b;

        public a(Handler handler, r rVar) {
            this.f33898a = rVar != null ? (Handler) ea.a.e(handler) : null;
            this.f33899b = rVar;
        }

        public /* synthetic */ void A(int i10, long j10, long j11) {
            ((r) n0.j(this.f33899b)).u(i10, j10, j11);
        }

        public static /* synthetic */ void a(a aVar, boolean z10) {
            aVar.z(z10);
        }

        public static /* synthetic */ void b(a aVar, m8.e eVar) {
            aVar.v(eVar);
        }

        public static /* synthetic */ void c(a aVar, Exception exc) {
            aVar.r(exc);
        }

        public static /* synthetic */ void d(a aVar, Exception exc) {
            aVar.s(exc);
        }

        public static /* synthetic */ void f(a aVar, String str, long j10, long j11) {
            aVar.t(str, j10, j11);
        }

        public static /* synthetic */ void g(a aVar, String str) {
            aVar.u(str);
        }

        public static /* synthetic */ void h(a aVar, long j10) {
            aVar.y(j10);
        }

        public static /* synthetic */ void i(a aVar, int i10, long j10, long j11) {
            aVar.A(i10, j10, j11);
        }

        public static /* synthetic */ void j(a aVar, m8.e eVar) {
            aVar.w(eVar);
        }

        public /* synthetic */ void r(Exception exc) {
            ((r) n0.j(this.f33899b)).s(exc);
        }

        public /* synthetic */ void s(Exception exc) {
            ((r) n0.j(this.f33899b)).b(exc);
        }

        public /* synthetic */ void t(String str, long j10, long j11) {
            ((r) n0.j(this.f33899b)).onAudioDecoderInitialized(str, j10, j11);
        }

        public /* synthetic */ void u(String str) {
            ((r) n0.j(this.f33899b)).f(str);
        }

        public /* synthetic */ void v(m8.e eVar) {
            eVar.c();
            ((r) n0.j(this.f33899b)).t(eVar);
        }

        public /* synthetic */ void w(m8.e eVar) {
            ((r) n0.j(this.f33899b)).i(eVar);
        }

        public /* synthetic */ void x(p1 p1Var, m8.i iVar) {
            ((r) n0.j(this.f33899b)).r(p1Var);
            ((r) n0.j(this.f33899b)).e(p1Var, iVar);
        }

        public /* synthetic */ void y(long j10) {
            ((r) n0.j(this.f33899b)).l(j10);
        }

        public /* synthetic */ void z(boolean z10) {
            ((r) n0.j(this.f33899b)).a(z10);
        }

        public void B(final long j10) {
            Handler handler = this.f33898a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a.h(r.a.this, j10);
                    }
                });
            }
        }

        public void C(final boolean z10) {
            Handler handler = this.f33898a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a.a(r.a.this, z10);
                    }
                });
            }
        }

        public void D(final int i10, final long j10, final long j11) {
            Handler handler = this.f33898a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a.i(r.a.this, i10, j10, j11);
                    }
                });
            }
        }

        public void k(final Exception exc) {
            Handler handler = this.f33898a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a.c(r.a.this, exc);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Handler handler = this.f33898a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a.d(r.a.this, exc);
                    }
                });
            }
        }

        public void m(final String str, final long j10, final long j11) {
            Handler handler = this.f33898a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a.f(r.a.this, str, j10, j11);
                    }
                });
            }
        }

        public void n(final String str) {
            Handler handler = this.f33898a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a.g(r.a.this, str);
                    }
                });
            }
        }

        public void o(final m8.e eVar) {
            eVar.c();
            Handler handler = this.f33898a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a.b(r.a.this, eVar);
                    }
                });
            }
        }

        public void p(final m8.e eVar) {
            Handler handler = this.f33898a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a.j(r.a.this, eVar);
                    }
                });
            }
        }

        public void q(final p1 p1Var, final m8.i iVar) {
            Handler handler = this.f33898a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a.this.x(p1Var, iVar);
                    }
                });
            }
        }
    }

    void a(boolean z10);

    void b(Exception exc);

    void e(p1 p1Var, m8.i iVar);

    void f(String str);

    void i(m8.e eVar);

    void l(long j10);

    void onAudioDecoderInitialized(String str, long j10, long j11);

    @Deprecated
    void r(p1 p1Var);

    void s(Exception exc);

    void t(m8.e eVar);

    void u(int i10, long j10, long j11);
}
