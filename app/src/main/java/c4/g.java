package c4;

import c4.a;
import y3.k;

/* compiled from: RefCountCloseableReference.java */
/* loaded from: classes.dex */
public class g<T> extends a<T> {
    private g(i<T> iVar, a.c cVar, Throwable th) {
        super(iVar, cVar, th);
    }

    @Override // c4.a
    /* renamed from: d */
    public a<T> clone() {
        k.i(A());
        return new g(this.f5313b, this.f5314c, this.f5315d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(T t10, h<T> hVar, a.c cVar, Throwable th) {
        super(t10, hVar, cVar, th);
    }
}
