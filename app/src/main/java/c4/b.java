package c4;

import c4.a;
import y3.k;

/* compiled from: DefaultCloseableReference.java */
/* loaded from: classes.dex */
public class b<T> extends a<T> {
    private b(i<T> iVar, a.c cVar, Throwable th) {
        super(iVar, cVar, th);
    }

    @Override // c4.a
    /* renamed from: d */
    public a<T> clone() {
        k.i(A());
        return new b(this.f5313b, this.f5314c, this.f5315d != null ? new Throwable(this.f5315d) : null);
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
                z3.a.I("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", objArr);
                this.f5314c.a(this.f5313b, this.f5315d);
                close();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(T t10, h<T> hVar, a.c cVar, Throwable th) {
        super(t10, hVar, cVar, th);
    }
}
