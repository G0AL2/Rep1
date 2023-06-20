package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* compiled from: ThrottlingProducer.java */
/* loaded from: classes.dex */
public class b1<T> implements o0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final o0<T> f14908a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14909b;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f14912e;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentLinkedQueue<Pair<l<T>, p0>> f14911d = new ConcurrentLinkedQueue<>();

    /* renamed from: c  reason: collision with root package name */
    private int f14910c = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ThrottlingProducer.java */
    /* loaded from: classes.dex */
    public class b extends p<T, T> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ThrottlingProducer.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Pair f14914a;

            a(Pair pair) {
                this.f14914a = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                b1 b1Var = b1.this;
                Pair pair = this.f14914a;
                b1Var.f((l) pair.first, (p0) pair.second);
            }
        }

        private void q() {
            Pair pair;
            synchronized (b1.this) {
                pair = (Pair) b1.this.f14911d.poll();
                if (pair == null) {
                    b1.d(b1.this);
                }
            }
            if (pair != null) {
                b1.this.f14912e.execute(new a(pair));
            }
        }

        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        protected void g() {
            p().a();
            q();
        }

        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        protected void h(Throwable th) {
            p().b(th);
            q();
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void i(T t10, int i10) {
            p().c(t10, i10);
            if (com.facebook.imagepipeline.producers.b.e(i10)) {
                q();
            }
        }

        private b(l<T> lVar) {
            super(lVar);
        }
    }

    public b1(int i10, Executor executor, o0<T> o0Var) {
        this.f14909b = i10;
        this.f14912e = (Executor) y3.k.g(executor);
        this.f14908a = (o0) y3.k.g(o0Var);
    }

    static /* synthetic */ int d(b1 b1Var) {
        int i10 = b1Var.f14910c;
        b1Var.f14910c = i10 - 1;
        return i10;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<T> lVar, p0 p0Var) {
        boolean z10;
        p0Var.h().d(p0Var, "ThrottlingProducer");
        synchronized (this) {
            int i10 = this.f14910c;
            z10 = true;
            if (i10 >= this.f14909b) {
                this.f14911d.add(Pair.create(lVar, p0Var));
            } else {
                this.f14910c = i10 + 1;
                z10 = false;
            }
        }
        if (z10) {
            return;
        }
        f(lVar, p0Var);
    }

    void f(l<T> lVar, p0 p0Var) {
        p0Var.h().j(p0Var, "ThrottlingProducer", null);
        this.f14908a.b(new b(lVar), p0Var);
    }
}
