package we;

/* compiled from: CancellableContinuation.kt */
/* loaded from: classes3.dex */
public interface h<T> extends ie.d<T> {

    /* compiled from: CancellableContinuation.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static /* synthetic */ Object a(h hVar, Object obj, Object obj2, int i10, Object obj3) {
            if (obj3 == null) {
                if ((i10 & 2) != 0) {
                    obj2 = null;
                }
                return hVar.c(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    Object c(T t10, Object obj);

    void e(pe.l<? super Throwable, ee.u> lVar);

    void f(z zVar, T t10);

    void i(Object obj);
}
