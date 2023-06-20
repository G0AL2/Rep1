package androidx.room;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: EntityInsertionAdapter.kt */
/* loaded from: classes.dex */
public abstract class i<T> extends t0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k0 k0Var) {
        super(k0Var);
        qe.k.f(k0Var, "database");
    }

    protected abstract void bind(z0.k kVar, T t10);

    public final void insert(T t10) {
        z0.k acquire = acquire();
        try {
            bind(acquire, t10);
            acquire.l0();
        } finally {
            release(acquire);
        }
    }

    public final long insertAndReturnId(T t10) {
        z0.k acquire = acquire();
        try {
            bind(acquire, t10);
            return acquire.l0();
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<? extends T> collection) {
        qe.k.f(collection, "entities");
        z0.k acquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            int i10 = 0;
            for (T t10 : collection) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    fe.p.o();
                }
                bind(acquire, t10);
                jArr[i10] = acquire.l0();
                i10 = i11;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<? extends T> collection) {
        qe.k.f(collection, "entities");
        z0.k acquire = acquire();
        Iterator<? extends T> it = collection.iterator();
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i10 = 0; i10 < size; i10++) {
                bind(acquire, it.next());
                lArr[i10] = Long.valueOf(acquire.l0());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(T[] tArr) {
        List c10;
        List<Long> a10;
        qe.k.f(tArr, "entities");
        z0.k acquire = acquire();
        try {
            c10 = fe.o.c();
            for (T t10 : tArr) {
                bind(acquire, t10);
                c10.add(Long.valueOf(acquire.l0()));
            }
            a10 = fe.o.a(c10);
            return a10;
        } finally {
            release(acquire);
        }
    }

    public final void insert(T[] tArr) {
        qe.k.f(tArr, "entities");
        z0.k acquire = acquire();
        try {
            for (T t10 : tArr) {
                bind(acquire, t10);
                acquire.l0();
            }
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(T[] tArr) {
        qe.k.f(tArr, "entities");
        z0.k acquire = acquire();
        try {
            long[] jArr = new long[tArr.length];
            int length = tArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = i11 + 1;
                bind(acquire, tArr[i10]);
                jArr[i11] = acquire.l0();
                i10++;
                i11 = i12;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long[] insertAndReturnIdsArrayBox(T[] tArr) {
        qe.k.f(tArr, "entities");
        z0.k acquire = acquire();
        Iterator a10 = qe.b.a(tArr);
        try {
            int length = tArr.length;
            Long[] lArr = new Long[length];
            for (int i10 = 0; i10 < length; i10++) {
                bind(acquire, a10.next());
                lArr[i10] = Long.valueOf(acquire.l0());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<? extends T> collection) {
        List c10;
        List<Long> a10;
        qe.k.f(collection, "entities");
        z0.k acquire = acquire();
        try {
            c10 = fe.o.c();
            for (T t10 : collection) {
                bind(acquire, t10);
                c10.add(Long.valueOf(acquire.l0()));
            }
            a10 = fe.o.a(c10);
            return a10;
        } finally {
            release(acquire);
        }
    }

    public final void insert(Iterable<? extends T> iterable) {
        qe.k.f(iterable, "entities");
        z0.k acquire = acquire();
        try {
            for (T t10 : iterable) {
                bind(acquire, t10);
                acquire.l0();
            }
        } finally {
            release(acquire);
        }
    }
}
