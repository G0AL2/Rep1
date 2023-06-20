package c4;

import c4.a;

/* compiled from: FinalizerCloseableReference.java */
/* loaded from: classes.dex */
public class c<T> extends a<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c(T t10, h<T> hVar, a.c cVar, Throwable th) {
        super(t10, hVar, cVar, th);
    }

    @Override // c4.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // c4.a
    /* renamed from: d */
    public a<T> clone() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.a
    public void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f5312a) {
                    return;
                }
                T f10 = this.f5313b.f();
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(System.identityHashCode(this));
                objArr[1] = Integer.valueOf(System.identityHashCode(this.f5313b));
                objArr[2] = f10 == null ? null : f10.getClass().getName();
                z3.a.I("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", objArr);
                this.f5313b.d();
            }
        } finally {
            super.finalize();
        }
    }
}
