package com.google.android.exoplayer2.drm;

import android.os.Handler;
import com.google.android.exoplayer2.drm.k;
import ea.n0;
import i9.u;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: DrmSessionEventListener.java */
/* loaded from: classes2.dex */
public interface k {

    /* compiled from: DrmSessionEventListener.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public final int f21112a;

        /* renamed from: b */
        public final u.b f21113b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C0287a> f21114c;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DrmSessionEventListener.java */
        /* renamed from: com.google.android.exoplayer2.drm.k$a$a */
        /* loaded from: classes2.dex */
        public static final class C0287a {

            /* renamed from: a */
            public Handler f21115a;

            /* renamed from: b */
            public k f21116b;

            public C0287a(Handler handler, k kVar) {
                this.f21115a = handler;
                this.f21116b = kVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public static /* synthetic */ void a(a aVar, k kVar) {
            aVar.s(kVar);
        }

        public static /* synthetic */ void b(a aVar, k kVar) {
            aVar.o(kVar);
        }

        public static /* synthetic */ void c(a aVar, k kVar) {
            aVar.n(kVar);
        }

        public static /* synthetic */ void d(a aVar, k kVar) {
            aVar.p(kVar);
        }

        public static /* synthetic */ void e(a aVar, k kVar, Exception exc) {
            aVar.r(kVar, exc);
        }

        public static /* synthetic */ void f(a aVar, k kVar, int i10) {
            aVar.q(kVar, i10);
        }

        public /* synthetic */ void n(k kVar) {
            kVar.G(this.f21112a, this.f21113b);
        }

        public /* synthetic */ void o(k kVar) {
            kVar.R(this.f21112a, this.f21113b);
        }

        public /* synthetic */ void p(k kVar) {
            kVar.f0(this.f21112a, this.f21113b);
        }

        public /* synthetic */ void q(k kVar, int i10) {
            kVar.L(this.f21112a, this.f21113b);
            kVar.Q(this.f21112a, this.f21113b, i10);
        }

        public /* synthetic */ void r(k kVar, Exception exc) {
            kVar.M(this.f21112a, this.f21113b, exc);
        }

        public /* synthetic */ void s(k kVar) {
            kVar.i0(this.f21112a, this.f21113b);
        }

        public void g(Handler handler, k kVar) {
            ea.a.e(handler);
            ea.a.e(kVar);
            this.f21114c.add(new C0287a(handler, kVar));
        }

        public void h() {
            Iterator<C0287a> it = this.f21114c.iterator();
            while (it.hasNext()) {
                C0287a next = it.next();
                final k kVar = next.f21116b;
                n0.L0(next.f21115a, new Runnable() { // from class: n8.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.a.c(k.a.this, kVar);
                    }
                });
            }
        }

        public void i() {
            Iterator<C0287a> it = this.f21114c.iterator();
            while (it.hasNext()) {
                C0287a next = it.next();
                final k kVar = next.f21116b;
                n0.L0(next.f21115a, new Runnable() { // from class: n8.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.a.b(k.a.this, kVar);
                    }
                });
            }
        }

        public void j() {
            Iterator<C0287a> it = this.f21114c.iterator();
            while (it.hasNext()) {
                C0287a next = it.next();
                final k kVar = next.f21116b;
                n0.L0(next.f21115a, new Runnable() { // from class: n8.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.a.d(k.a.this, kVar);
                    }
                });
            }
        }

        public void k(final int i10) {
            Iterator<C0287a> it = this.f21114c.iterator();
            while (it.hasNext()) {
                C0287a next = it.next();
                final k kVar = next.f21116b;
                n0.L0(next.f21115a, new Runnable() { // from class: n8.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.a.f(k.a.this, kVar, i10);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Iterator<C0287a> it = this.f21114c.iterator();
            while (it.hasNext()) {
                C0287a next = it.next();
                final k kVar = next.f21116b;
                n0.L0(next.f21115a, new Runnable() { // from class: n8.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.a.e(k.a.this, kVar, exc);
                    }
                });
            }
        }

        public void m() {
            Iterator<C0287a> it = this.f21114c.iterator();
            while (it.hasNext()) {
                C0287a next = it.next();
                final k kVar = next.f21116b;
                n0.L0(next.f21115a, new Runnable() { // from class: n8.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.a.a(k.a.this, kVar);
                    }
                });
            }
        }

        public void t(k kVar) {
            Iterator<C0287a> it = this.f21114c.iterator();
            while (it.hasNext()) {
                C0287a next = it.next();
                if (next.f21116b == kVar) {
                    this.f21114c.remove(next);
                }
            }
        }

        public a u(int i10, u.b bVar) {
            return new a(this.f21114c, i10, bVar);
        }

        private a(CopyOnWriteArrayList<C0287a> copyOnWriteArrayList, int i10, u.b bVar) {
            this.f21114c = copyOnWriteArrayList;
            this.f21112a = i10;
            this.f21113b = bVar;
        }
    }

    void G(int i10, u.b bVar);

    @Deprecated
    void L(int i10, u.b bVar);

    void M(int i10, u.b bVar, Exception exc);

    void Q(int i10, u.b bVar, int i11);

    void R(int i10, u.b bVar);

    void f0(int i10, u.b bVar);

    void i0(int i10, u.b bVar);
}
