package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.video.d;
import ea.n0;
import fa.v;
import j8.p1;
import m8.e;
import m8.i;

/* compiled from: VideoRendererEventListener.java */
/* loaded from: classes2.dex */
public interface d {

    /* compiled from: VideoRendererEventListener.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final Handler f21843a;

        /* renamed from: b */
        private final d f21844b;

        public a(Handler handler, d dVar) {
            this.f21843a = dVar != null ? (Handler) ea.a.e(handler) : null;
            this.f21844b = dVar;
        }

        public static /* synthetic */ void a(a aVar, e eVar) {
            aVar.s(eVar);
        }

        public static /* synthetic */ void b(a aVar, String str) {
            aVar.r(str);
        }

        public static /* synthetic */ void c(a aVar, Exception exc) {
            aVar.y(exc);
        }

        public static /* synthetic */ void d(a aVar, e eVar) {
            aVar.u(eVar);
        }

        public static /* synthetic */ void e(a aVar, Object obj, long j10) {
            aVar.w(obj, j10);
        }

        public static /* synthetic */ void f(a aVar, int i10, long j10) {
            aVar.t(i10, j10);
        }

        public static /* synthetic */ void g(a aVar, String str, long j10, long j11) {
            aVar.q(str, j10, j11);
        }

        public static /* synthetic */ void h(a aVar, v vVar) {
            aVar.z(vVar);
        }

        public static /* synthetic */ void j(a aVar, long j10, int i10) {
            aVar.x(j10, i10);
        }

        public /* synthetic */ void q(String str, long j10, long j11) {
            ((d) n0.j(this.f21844b)).onVideoDecoderInitialized(str, j10, j11);
        }

        public /* synthetic */ void r(String str) {
            ((d) n0.j(this.f21844b)).c(str);
        }

        public /* synthetic */ void s(e eVar) {
            eVar.c();
            ((d) n0.j(this.f21844b)).o(eVar);
        }

        public /* synthetic */ void t(int i10, long j10) {
            ((d) n0.j(this.f21844b)).onDroppedFrames(i10, j10);
        }

        public /* synthetic */ void u(e eVar) {
            ((d) n0.j(this.f21844b)).p(eVar);
        }

        public /* synthetic */ void v(p1 p1Var, i iVar) {
            ((d) n0.j(this.f21844b)).w(p1Var);
            ((d) n0.j(this.f21844b)).m(p1Var, iVar);
        }

        public /* synthetic */ void w(Object obj, long j10) {
            ((d) n0.j(this.f21844b)).q(obj, j10);
        }

        public /* synthetic */ void x(long j10, int i10) {
            ((d) n0.j(this.f21844b)).v(j10, i10);
        }

        public /* synthetic */ void y(Exception exc) {
            ((d) n0.j(this.f21844b)).n(exc);
        }

        public /* synthetic */ void z(v vVar) {
            ((d) n0.j(this.f21844b)).j(vVar);
        }

        public void A(final Object obj) {
            if (this.f21843a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f21843a.post(new Runnable() { // from class: fa.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a.e(d.a.this, obj, elapsedRealtime);
                    }
                });
            }
        }

        public void B(final long j10, final int i10) {
            Handler handler = this.f21843a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: fa.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a.j(d.a.this, j10, i10);
                    }
                });
            }
        }

        public void C(final Exception exc) {
            Handler handler = this.f21843a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: fa.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a.c(d.a.this, exc);
                    }
                });
            }
        }

        public void D(final v vVar) {
            Handler handler = this.f21843a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: fa.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a.h(d.a.this, vVar);
                    }
                });
            }
        }

        public void k(final String str, final long j10, final long j11) {
            Handler handler = this.f21843a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: fa.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a.g(d.a.this, str, j10, j11);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f21843a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: fa.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a.b(d.a.this, str);
                    }
                });
            }
        }

        public void m(final e eVar) {
            eVar.c();
            Handler handler = this.f21843a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: fa.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a.a(d.a.this, eVar);
                    }
                });
            }
        }

        public void n(final int i10, final long j10) {
            Handler handler = this.f21843a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: fa.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a.f(d.a.this, i10, j10);
                    }
                });
            }
        }

        public void o(final e eVar) {
            Handler handler = this.f21843a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: fa.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a.d(d.a.this, eVar);
                    }
                });
            }
        }

        public void p(final p1 p1Var, final i iVar) {
            Handler handler = this.f21843a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: fa.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a.this.v(p1Var, iVar);
                    }
                });
            }
        }
    }

    void c(String str);

    void j(v vVar);

    void m(p1 p1Var, i iVar);

    void n(Exception exc);

    void o(e eVar);

    void onDroppedFrames(int i10, long j10);

    void onVideoDecoderInitialized(String str, long j10, long j11);

    void p(e eVar);

    void q(Object obj, long j10);

    void v(long j10, int i10);

    @Deprecated
    void w(p1 p1Var);
}
