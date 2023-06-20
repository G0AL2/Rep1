package com.facebook.datasource;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import y3.n;

/* compiled from: DataSources.java */
/* loaded from: classes.dex */
public class d {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: DataSources.java */
    /* loaded from: classes.dex */
    static class a<T> implements n<com.facebook.datasource.c<T>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Throwable f14485a;

        a(Throwable th) {
            this.f14485a = th;
        }

        @Override // y3.n
        /* renamed from: a */
        public com.facebook.datasource.c<T> get() {
            return d.b(this.f14485a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: DataSources.java */
    /* loaded from: classes.dex */
    static class b<T> implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0191d f14486a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f14487b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C0191d f14488c;

        b(C0191d c0191d, CountDownLatch countDownLatch, C0191d c0191d2) {
            this.f14486a = c0191d;
            this.f14487b = countDownLatch;
            this.f14488c = c0191d2;
        }

        @Override // com.facebook.datasource.e
        public void a(com.facebook.datasource.c<T> cVar) {
            this.f14487b.countDown();
        }

        @Override // com.facebook.datasource.e
        public void b(com.facebook.datasource.c<T> cVar) {
            try {
                this.f14488c.f14489a = (T) cVar.d();
            } finally {
                this.f14487b.countDown();
            }
        }

        @Override // com.facebook.datasource.e
        public void c(com.facebook.datasource.c<T> cVar) {
            if (cVar.c()) {
                try {
                    this.f14486a.f14489a = cVar.a();
                } finally {
                    this.f14487b.countDown();
                }
            }
        }

        @Override // com.facebook.datasource.e
        public void d(com.facebook.datasource.c<T> cVar) {
        }
    }

    /* compiled from: DataSources.java */
    /* loaded from: classes.dex */
    static class c implements Executor {
        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static <T> n<com.facebook.datasource.c<T>> a(Throwable th) {
        return new a(th);
    }

    public static <T> com.facebook.datasource.c<T> b(Throwable th) {
        h x10 = h.x();
        x10.p(th);
        return x10;
    }

    public static <T> T c(com.facebook.datasource.c<T> cVar) throws Throwable {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C0191d c0191d = new C0191d(null);
        C0191d c0191d2 = new C0191d(null);
        cVar.e(new b(c0191d, countDownLatch, c0191d2), new c());
        countDownLatch.await();
        T t10 = c0191d2.f14489a;
        if (t10 == null) {
            return c0191d.f14489a;
        }
        throw ((Throwable) t10);
    }

    /* compiled from: DataSources.java */
    /* renamed from: com.facebook.datasource.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0191d<T> {

        /* renamed from: a  reason: collision with root package name */
        public T f14489a;

        private C0191d() {
            this.f14489a = null;
        }

        /* synthetic */ C0191d(a aVar) {
            this();
        }
    }
}
