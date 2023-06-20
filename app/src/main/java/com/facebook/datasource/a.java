package com.facebook.datasource;

import android.util.Pair;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* compiled from: AbstractDataSource.java */
/* loaded from: classes.dex */
public abstract class a<T> implements com.facebook.datasource.c<T> {

    /* renamed from: h  reason: collision with root package name */
    private static volatile c f14467h;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f14468a;

    /* renamed from: d  reason: collision with root package name */
    private T f14471d = null;

    /* renamed from: e  reason: collision with root package name */
    private Throwable f14472e = null;

    /* renamed from: f  reason: collision with root package name */
    private float f14473f = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14470c = false;

    /* renamed from: b  reason: collision with root package name */
    private d f14469b = d.IN_PROGRESS;

    /* renamed from: g  reason: collision with root package name */
    private final ConcurrentLinkedQueue<Pair<e<T>, Executor>> f14474g = new ConcurrentLinkedQueue<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractDataSource.java */
    /* renamed from: com.facebook.datasource.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0190a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f14475a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f14476b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f14477c;

        RunnableC0190a(boolean z10, e eVar, boolean z11) {
            this.f14475a = z10;
            this.f14476b = eVar;
            this.f14477c = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f14475a) {
                this.f14476b.b(a.this);
            } else if (this.f14477c) {
                this.f14476b.a(a.this);
            } else {
                this.f14476b.c(a.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractDataSource.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f14479a;

        b(e eVar) {
            this.f14479a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14479a.d(a.this);
        }
    }

    /* compiled from: AbstractDataSource.java */
    /* loaded from: classes.dex */
    public interface c {
        Runnable a(Runnable runnable, String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractDataSource.java */
    /* loaded from: classes.dex */
    public enum d {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    public static c i() {
        return f14467h;
    }

    private void m() {
        boolean j10 = j();
        boolean w10 = w();
        Iterator<Pair<e<T>, Executor>> it = this.f14474g.iterator();
        while (it.hasNext()) {
            Pair<e<T>, Executor> next = it.next();
            l((e) next.first, (Executor) next.second, j10, w10);
        }
    }

    private synchronized boolean r(Throwable th, Map<String, Object> map) {
        if (!this.f14470c && this.f14469b == d.IN_PROGRESS) {
            this.f14469b = d.FAILURE;
            this.f14472e = th;
            this.f14468a = map;
            return true;
        }
        return false;
    }

    private synchronized boolean t(float f10) {
        if (!this.f14470c && this.f14469b == d.IN_PROGRESS) {
            if (f10 < this.f14473f) {
                return false;
            }
            this.f14473f = f10;
            return true;
        }
        return false;
    }

    private boolean v(T t10, boolean z10) {
        T t11;
        T t12 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.f14470c && this.f14469b == d.IN_PROGRESS) {
                            if (z10) {
                                this.f14469b = d.SUCCESS;
                                this.f14473f = 1.0f;
                            }
                            T t13 = this.f14471d;
                            if (t13 != t10) {
                                try {
                                    this.f14471d = t10;
                                    t11 = t13;
                                } catch (Throwable th) {
                                    th = th;
                                    t12 = t13;
                                    throw th;
                                }
                            } else {
                                t11 = null;
                            }
                            return true;
                        }
                        if (t10 != null) {
                            h(t10);
                        }
                        return false;
                    } catch (Throwable th2) {
                        t12 = t10;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } finally {
            if (t12 != null) {
                h(t12);
            }
        }
    }

    private synchronized boolean w() {
        boolean z10;
        if (k()) {
            z10 = c() ? false : true;
        }
        return z10;
    }

    @Override // com.facebook.datasource.c
    public synchronized T a() {
        return this.f14471d;
    }

    @Override // com.facebook.datasource.c
    public synchronized boolean b() {
        return this.f14471d != null;
    }

    @Override // com.facebook.datasource.c
    public synchronized boolean c() {
        return this.f14469b != d.IN_PROGRESS;
    }

    @Override // com.facebook.datasource.c
    public boolean close() {
        synchronized (this) {
            if (this.f14470c) {
                return false;
            }
            this.f14470c = true;
            T t10 = this.f14471d;
            this.f14471d = null;
            if (t10 != null) {
                h(t10);
            }
            if (!c()) {
                m();
            }
            synchronized (this) {
                this.f14474g.clear();
            }
            return true;
        }
    }

    @Override // com.facebook.datasource.c
    public synchronized Throwable d() {
        return this.f14472e;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.datasource.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(com.facebook.datasource.e<T> r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            y3.k.g(r3)
            y3.k.g(r4)
            monitor-enter(r2)
            boolean r0 = r2.f14470c     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto Ld
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            return
        Ld:
            com.facebook.datasource.a$d r0 = r2.f14469b     // Catch: java.lang.Throwable -> L41
            com.facebook.datasource.a$d r1 = com.facebook.datasource.a.d.IN_PROGRESS     // Catch: java.lang.Throwable -> L41
            if (r0 != r1) goto L1c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.datasource.e<T>, java.util.concurrent.Executor>> r0 = r2.f14474g     // Catch: java.lang.Throwable -> L41
            android.util.Pair r1 = android.util.Pair.create(r3, r4)     // Catch: java.lang.Throwable -> L41
            r0.add(r1)     // Catch: java.lang.Throwable -> L41
        L1c:
            boolean r0 = r2.b()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L31
            boolean r0 = r2.c()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L31
            boolean r0 = r2.w()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L2f
            goto L31
        L2f:
            r0 = 0
            goto L32
        L31:
            r0 = 1
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L40
            boolean r0 = r2.j()
            boolean r1 = r2.w()
            r2.l(r3, r4, r0, r1)
        L40:
            return
        L41:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.a.e(com.facebook.datasource.e, java.util.concurrent.Executor):void");
    }

    @Override // com.facebook.datasource.c
    public synchronized float f() {
        return this.f14473f;
    }

    @Override // com.facebook.datasource.c
    public boolean g() {
        return false;
    }

    @Override // com.facebook.datasource.c
    public Map<String, Object> getExtras() {
        return this.f14468a;
    }

    protected void h(T t10) {
    }

    public synchronized boolean j() {
        return this.f14469b == d.FAILURE;
    }

    public synchronized boolean k() {
        return this.f14470c;
    }

    protected void l(e<T> eVar, Executor executor, boolean z10, boolean z11) {
        Runnable runnableC0190a = new RunnableC0190a(z10, eVar, z11);
        c i10 = i();
        if (i10 != null) {
            runnableC0190a = i10.a(runnableC0190a, "AbstractDataSource_notifyDataSubscriber");
        }
        executor.execute(runnableC0190a);
    }

    protected void n() {
        Iterator<Pair<e<T>, Executor>> it = this.f14474g.iterator();
        while (it.hasNext()) {
            Pair<e<T>, Executor> next = it.next();
            ((Executor) next.second).execute(new b((e) next.first));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o(Map<String, Object> map) {
        this.f14468a = map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p(Throwable th) {
        return q(th, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q(Throwable th, Map<String, Object> map) {
        boolean r10 = r(th, map);
        if (r10) {
            m();
        }
        return r10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean s(float f10) {
        boolean t10 = t(f10);
        if (t10) {
            n();
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean u(T t10, boolean z10, Map<String, Object> map) {
        o(map);
        boolean v10 = v(t10, z10);
        if (v10) {
            m();
        }
        return v10;
    }
}
