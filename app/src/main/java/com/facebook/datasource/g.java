package com.facebook.datasource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import y3.j;
import y3.k;
import y3.n;

/* compiled from: IncreasingQualityDataSourceSupplier.java */
/* loaded from: classes.dex */
public class g<T> implements n<c<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final List<n<c<T>>> f14496a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f14497b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: IncreasingQualityDataSourceSupplier.java */
    /* loaded from: classes.dex */
    public class a extends com.facebook.datasource.a<T> {

        /* renamed from: i  reason: collision with root package name */
        private ArrayList<c<T>> f14498i;

        /* renamed from: j  reason: collision with root package name */
        private int f14499j;

        /* renamed from: k  reason: collision with root package name */
        private int f14500k;

        /* renamed from: l  reason: collision with root package name */
        private AtomicInteger f14501l;

        /* renamed from: m  reason: collision with root package name */
        private Throwable f14502m;

        /* renamed from: n  reason: collision with root package name */
        private Map<String, Object> f14503n;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IncreasingQualityDataSourceSupplier.java */
        /* renamed from: com.facebook.datasource.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0192a implements e<T> {

            /* renamed from: a  reason: collision with root package name */
            private int f14505a;

            public C0192a(int i10) {
                this.f14505a = i10;
            }

            @Override // com.facebook.datasource.e
            public void a(c<T> cVar) {
            }

            @Override // com.facebook.datasource.e
            public void b(c<T> cVar) {
                a.this.G(this.f14505a, cVar);
            }

            @Override // com.facebook.datasource.e
            public void c(c<T> cVar) {
                if (cVar.b()) {
                    a.this.H(this.f14505a, cVar);
                } else if (cVar.c()) {
                    a.this.G(this.f14505a, cVar);
                }
            }

            @Override // com.facebook.datasource.e
            public void d(c<T> cVar) {
                if (this.f14505a == 0) {
                    a.this.s(cVar.f());
                }
            }
        }

        public a() {
            if (g.this.f14497b) {
                return;
            }
            A();
        }

        private void A() {
            if (this.f14501l != null) {
                return;
            }
            synchronized (this) {
                if (this.f14501l == null) {
                    this.f14501l = new AtomicInteger(0);
                    int size = g.this.f14496a.size();
                    this.f14500k = size;
                    this.f14499j = size;
                    this.f14498i = new ArrayList<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        c<T> cVar = (c) ((n) g.this.f14496a.get(i10)).get();
                        this.f14498i.add(cVar);
                        cVar.e(new C0192a(i10), w3.a.a());
                        if (cVar.b()) {
                            break;
                        }
                    }
                }
            }
        }

        private synchronized c<T> B(int i10) {
            c<T> cVar;
            ArrayList<c<T>> arrayList = this.f14498i;
            cVar = null;
            if (arrayList != null && i10 < arrayList.size()) {
                cVar = this.f14498i.set(i10, null);
            }
            return cVar;
        }

        private synchronized c<T> C(int i10) {
            ArrayList<c<T>> arrayList;
            arrayList = this.f14498i;
            return (arrayList == null || i10 >= arrayList.size()) ? null : this.f14498i.get(i10);
        }

        private synchronized c<T> D() {
            return C(this.f14499j);
        }

        private void E() {
            Throwable th;
            if (this.f14501l.incrementAndGet() != this.f14500k || (th = this.f14502m) == null) {
                return;
            }
            q(th, this.f14503n);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0022 A[LOOP:0: B:17:0x0020->B:18:0x0022, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void F(int r3, com.facebook.datasource.c<T> r4, boolean r5) {
            /*
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.f14499j     // Catch: java.lang.Throwable -> L2f
                com.facebook.datasource.c r1 = r2.C(r3)     // Catch: java.lang.Throwable -> L2f
                if (r4 != r1) goto L2d
                int r4 = r2.f14499j     // Catch: java.lang.Throwable -> L2f
                if (r3 != r4) goto Le
                goto L2d
            Le:
                com.facebook.datasource.c r4 = r2.D()     // Catch: java.lang.Throwable -> L2f
                if (r4 == 0) goto L1d
                if (r5 == 0) goto L1b
                int r4 = r2.f14499j     // Catch: java.lang.Throwable -> L2f
                if (r3 >= r4) goto L1b
                goto L1d
            L1b:
                r3 = r0
                goto L1f
            L1d:
                r2.f14499j = r3     // Catch: java.lang.Throwable -> L2f
            L1f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            L20:
                if (r0 <= r3) goto L2c
                com.facebook.datasource.c r4 = r2.B(r0)
                r2.z(r4)
                int r0 = r0 + (-1)
                goto L20
            L2c:
                return
            L2d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
                return
            L2f:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.g.a.F(int, com.facebook.datasource.c, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G(int i10, c<T> cVar) {
            z(I(i10, cVar));
            if (i10 == 0) {
                this.f14502m = cVar.d();
                this.f14503n = cVar.getExtras();
            }
            E();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H(int i10, c<T> cVar) {
            F(i10, cVar, cVar.c());
            if (cVar == D()) {
                u(null, i10 == 0 && cVar.c(), cVar.getExtras());
            }
            E();
        }

        private synchronized c<T> I(int i10, c<T> cVar) {
            if (cVar == D()) {
                return null;
            }
            if (cVar == C(i10)) {
                return B(i10);
            }
            return cVar;
        }

        private void z(c<T> cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        public synchronized T a() {
            c<T> D;
            if (g.this.f14497b) {
                A();
            }
            D = D();
            return D != null ? D.a() : null;
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        public synchronized boolean b() {
            boolean z10;
            if (g.this.f14497b) {
                A();
            }
            c<T> D = D();
            if (D != null) {
                z10 = D.b();
            }
            return z10;
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        public boolean close() {
            if (g.this.f14497b) {
                A();
            }
            synchronized (this) {
                if (super.close()) {
                    ArrayList<c<T>> arrayList = this.f14498i;
                    this.f14498i = null;
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            z(arrayList.get(i10));
                        }
                        return true;
                    }
                    return true;
                }
                return false;
            }
        }
    }

    private g(List<n<c<T>>> list, boolean z10) {
        k.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f14496a = list;
        this.f14497b = z10;
    }

    public static <T> g<T> c(List<n<c<T>>> list, boolean z10) {
        return new g<>(list, z10);
    }

    @Override // y3.n
    /* renamed from: d */
    public c<T> get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return j.a(this.f14496a, ((g) obj).f14496a);
        }
        return false;
    }

    public int hashCode() {
        return this.f14496a.hashCode();
    }

    public String toString() {
        return j.c(this).b("list", this.f14496a).toString();
    }
}
