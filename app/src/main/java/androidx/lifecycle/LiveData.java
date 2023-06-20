package androidx.lifecycle;

import androidx.lifecycle.i;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k  reason: collision with root package name */
    static final Object f3323k = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Object f3324a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private l.b<x<? super T>, LiveData<T>.c> f3325b = new l.b<>();

    /* renamed from: c  reason: collision with root package name */
    int f3326c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3327d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f3328e;

    /* renamed from: f  reason: collision with root package name */
    volatile Object f3329f;

    /* renamed from: g  reason: collision with root package name */
    private int f3330g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3331h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3332i;

    /* renamed from: j  reason: collision with root package name */
    private final Runnable f3333j;

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends LiveData<T>.c implements m {

        /* renamed from: e  reason: collision with root package name */
        final p f3334e;

        LifecycleBoundObserver(p pVar, x<? super T> xVar) {
            super(xVar);
            this.f3334e = pVar;
        }

        @Override // androidx.lifecycle.m
        public void b(p pVar, i.b bVar) {
            i.c b10 = this.f3334e.getLifecycle().b();
            if (b10 == i.c.DESTROYED) {
                LiveData.this.n(this.f3337a);
                return;
            }
            i.c cVar = null;
            while (cVar != b10) {
                g(k());
                cVar = b10;
                b10 = this.f3334e.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        void i() {
            this.f3334e.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean j(p pVar) {
            return this.f3334e == pVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean k() {
            return this.f3334e.getLifecycle().b().a(i.c.STARTED);
        }
    }

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f3324a) {
                obj = LiveData.this.f3329f;
                LiveData.this.f3329f = LiveData.f3323k;
            }
            LiveData.this.o(obj);
        }
    }

    /* loaded from: classes.dex */
    private class b extends LiveData<T>.c {
        b(LiveData liveData, x<? super T> xVar) {
            super(xVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean k() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final x<? super T> f3337a;

        /* renamed from: b  reason: collision with root package name */
        boolean f3338b;

        /* renamed from: c  reason: collision with root package name */
        int f3339c = -1;

        c(x<? super T> xVar) {
            this.f3337a = xVar;
        }

        void g(boolean z10) {
            if (z10 == this.f3338b) {
                return;
            }
            this.f3338b = z10;
            LiveData.this.c(z10 ? 1 : -1);
            if (this.f3338b) {
                LiveData.this.e(this);
            }
        }

        void i() {
        }

        boolean j(p pVar) {
            return false;
        }

        abstract boolean k();
    }

    public LiveData() {
        Object obj = f3323k;
        this.f3329f = obj;
        this.f3333j = new a();
        this.f3328e = obj;
        this.f3330g = -1;
    }

    static void b(String str) {
        if (k.a.f().c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(LiveData<T>.c cVar) {
        if (cVar.f3338b) {
            if (!cVar.k()) {
                cVar.g(false);
                return;
            }
            int i10 = cVar.f3339c;
            int i11 = this.f3330g;
            if (i10 >= i11) {
                return;
            }
            cVar.f3339c = i11;
            cVar.f3337a.a((Object) this.f3328e);
        }
    }

    void c(int i10) {
        int i11 = this.f3326c;
        this.f3326c = i10 + i11;
        if (this.f3327d) {
            return;
        }
        this.f3327d = true;
        while (true) {
            try {
                int i12 = this.f3326c;
                if (i11 == i12) {
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    k();
                } else if (z11) {
                    l();
                }
                i11 = i12;
            } finally {
                this.f3327d = false;
            }
        }
    }

    void e(LiveData<T>.c cVar) {
        if (this.f3331h) {
            this.f3332i = true;
            return;
        }
        this.f3331h = true;
        do {
            this.f3332i = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                l.b<x<? super T>, LiveData<T>.c>.d g10 = this.f3325b.g();
                while (g10.hasNext()) {
                    d((c) g10.next().getValue());
                    if (this.f3332i) {
                        break;
                    }
                }
            }
        } while (this.f3332i);
        this.f3331h = false;
    }

    public T f() {
        T t10 = (T) this.f3328e;
        if (t10 != f3323k) {
            return t10;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f3330g;
    }

    public boolean h() {
        return this.f3326c > 0;
    }

    public void i(p pVar, x<? super T> xVar) {
        b("observe");
        if (pVar.getLifecycle().b() == i.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(pVar, xVar);
        LiveData<T>.c j10 = this.f3325b.j(xVar, lifecycleBoundObserver);
        if (j10 != null && !j10.j(pVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (j10 != null) {
            return;
        }
        pVar.getLifecycle().a(lifecycleBoundObserver);
    }

    public void j(x<? super T> xVar) {
        b("observeForever");
        b bVar = new b(this, xVar);
        LiveData<T>.c j10 = this.f3325b.j(xVar, bVar);
        if (j10 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (j10 != null) {
            return;
        }
        bVar.g(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m(T t10) {
        boolean z10;
        synchronized (this.f3324a) {
            z10 = this.f3329f == f3323k;
            this.f3329f = t10;
        }
        if (z10) {
            k.a.f().d(this.f3333j);
        }
    }

    public void n(x<? super T> xVar) {
        b("removeObserver");
        LiveData<T>.c k10 = this.f3325b.k(xVar);
        if (k10 == null) {
            return;
        }
        k10.i();
        k10.g(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o(T t10) {
        b("setValue");
        this.f3330g++;
        this.f3328e = t10;
        e(null);
    }
}
