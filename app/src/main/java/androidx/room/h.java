package androidx.room;

/* compiled from: EntityDeletionOrUpdateAdapter.kt */
/* loaded from: classes.dex */
public abstract class h<T> extends t0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k0 k0Var) {
        super(k0Var);
        qe.k.f(k0Var, "database");
    }

    protected abstract void bind(z0.k kVar, T t10);

    @Override // androidx.room.t0
    protected abstract String createQuery();

    public final int handle(T t10) {
        z0.k acquire = acquire();
        try {
            bind(acquire, t10);
            return acquire.v();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Iterable<? extends T> iterable) {
        qe.k.f(iterable, "entities");
        z0.k acquire = acquire();
        int i10 = 0;
        try {
            for (T t10 : iterable) {
                bind(acquire, t10);
                i10 += acquire.v();
            }
            return i10;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(T[] tArr) {
        qe.k.f(tArr, "entities");
        z0.k acquire = acquire();
        try {
            int i10 = 0;
            for (T t10 : tArr) {
                bind(acquire, t10);
                i10 += acquire.v();
            }
            return i10;
        } finally {
            release(acquire);
        }
    }
}
