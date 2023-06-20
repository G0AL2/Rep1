package com.facebook.datasource;

import java.util.List;
import y3.j;
import y3.k;
import y3.n;

/* compiled from: FirstAvailableDataSourceSupplier.java */
/* loaded from: classes.dex */
public class f<T> implements n<c<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final List<n<c<T>>> f14490a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FirstAvailableDataSourceSupplier.java */
    /* loaded from: classes.dex */
    public class b extends com.facebook.datasource.a<T> {

        /* renamed from: i  reason: collision with root package name */
        private int f14491i = 0;

        /* renamed from: j  reason: collision with root package name */
        private c<T> f14492j = null;

        /* renamed from: k  reason: collision with root package name */
        private c<T> f14493k = null;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: FirstAvailableDataSourceSupplier.java */
        /* loaded from: classes.dex */
        public class a implements e<T> {
            private a() {
            }

            @Override // com.facebook.datasource.e
            public void a(c<T> cVar) {
            }

            @Override // com.facebook.datasource.e
            public void b(c<T> cVar) {
                b.this.E(cVar);
            }

            @Override // com.facebook.datasource.e
            public void c(c<T> cVar) {
                if (cVar.b()) {
                    b.this.F(cVar);
                } else if (cVar.c()) {
                    b.this.E(cVar);
                }
            }

            @Override // com.facebook.datasource.e
            public void d(c<T> cVar) {
                b.this.s(Math.max(b.this.f(), cVar.f()));
            }
        }

        public b() {
            if (H()) {
                return;
            }
            p(new RuntimeException("No data source supplier or supplier returned null."));
        }

        private void A(c<T> cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        private synchronized c<T> B() {
            return this.f14493k;
        }

        private synchronized n<c<T>> C() {
            if (k() || this.f14491i >= f.this.f14490a.size()) {
                return null;
            }
            List list = f.this.f14490a;
            int i10 = this.f14491i;
            this.f14491i = i10 + 1;
            return (n) list.get(i10);
        }

        private void D(c<T> cVar, boolean z10) {
            c<T> cVar2;
            synchronized (this) {
                if (cVar == this.f14492j && cVar != (cVar2 = this.f14493k)) {
                    if (cVar2 != null && !z10) {
                        cVar2 = null;
                        A(cVar2);
                    }
                    this.f14493k = cVar;
                    A(cVar2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E(c<T> cVar) {
            if (z(cVar)) {
                if (cVar != B()) {
                    A(cVar);
                }
                if (H()) {
                    return;
                }
                q(cVar.d(), cVar.getExtras());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F(c<T> cVar) {
            D(cVar, cVar.c());
            if (cVar == B()) {
                u(null, cVar.c(), cVar.getExtras());
            }
        }

        private synchronized boolean G(c<T> cVar) {
            if (k()) {
                return false;
            }
            this.f14492j = cVar;
            return true;
        }

        private boolean H() {
            n<c<T>> C = C();
            c<T> cVar = C != null ? C.get() : null;
            if (G(cVar) && cVar != null) {
                cVar.e(new a(), w3.a.a());
                return true;
            }
            A(cVar);
            return false;
        }

        private synchronized boolean z(c<T> cVar) {
            if (!k() && cVar == this.f14492j) {
                this.f14492j = null;
                return true;
            }
            return false;
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        public synchronized T a() {
            c<T> B;
            B = B();
            return B != null ? B.a() : null;
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        public synchronized boolean b() {
            boolean z10;
            c<T> B = B();
            if (B != null) {
                z10 = B.b();
            }
            return z10;
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        public boolean close() {
            synchronized (this) {
                if (super.close()) {
                    c<T> cVar = this.f14492j;
                    this.f14492j = null;
                    c<T> cVar2 = this.f14493k;
                    this.f14493k = null;
                    A(cVar2);
                    A(cVar);
                    return true;
                }
                return false;
            }
        }
    }

    private f(List<n<c<T>>> list) {
        k.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f14490a = list;
    }

    public static <T> f<T> b(List<n<c<T>>> list) {
        return new f<>(list);
    }

    @Override // y3.n
    /* renamed from: c */
    public c<T> get() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return j.a(this.f14490a, ((f) obj).f14490a);
        }
        return false;
    }

    public int hashCode() {
        return this.f14490a.hashCode();
    }

    public String toString() {
        return j.c(this).b("list", this.f14490a).toString();
    }
}
