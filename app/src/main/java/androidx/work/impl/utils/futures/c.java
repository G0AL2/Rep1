package androidx.work.impl.utils.futures;

/* compiled from: SettableFuture.java */
/* loaded from: classes.dex */
public final class c<V> extends a<V> {
    private c() {
    }

    public static <V> c<V> t() {
        return new c<>();
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean p(V v10) {
        return super.p(v10);
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean q(Throwable th) {
        return super.q(th);
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean r(com.google.common.util.concurrent.c<? extends V> cVar) {
        return super.r(cVar);
    }
}
