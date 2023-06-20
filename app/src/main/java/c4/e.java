package c4;

import c4.a;

/* compiled from: NoOpCloseableReference.java */
/* loaded from: classes.dex */
public class e<T> extends a<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e(T t10, h<T> hVar, a.c cVar, Throwable th) {
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
}
