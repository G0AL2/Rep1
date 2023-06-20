package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.a0;
import we.i0;

/* compiled from: ThreadSafeHeap.common.kt */
/* loaded from: classes3.dex */
public class z<T extends a0 & Comparable<? super T>> {
    private volatile int _size = 0;

    /* renamed from: a  reason: collision with root package name */
    private T[] f33543a;

    static {
        AtomicIntegerFieldUpdater.newUpdater(z.class, "_size");
    }

    private final T[] f() {
        T[] tArr = this.f33543a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new a0[4];
            this.f33543a = tArr2;
            return tArr2;
        } else if (c() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, c() * 2);
            qe.k.b(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((a0[]) copyOf);
            this.f33543a = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    private final void j(int i10) {
        this._size = i10;
    }

    private final void k(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 >= c()) {
                return;
            }
            T[] tArr = this.f33543a;
            if (tArr == null) {
                qe.k.o();
            }
            int i12 = i11 + 1;
            if (i12 < c()) {
                T t10 = tArr[i12];
                if (t10 == null) {
                    qe.k.o();
                }
                Comparable comparable = (Comparable) t10;
                T t11 = tArr[i11];
                if (t11 == null) {
                    qe.k.o();
                }
                if (comparable.compareTo(t11) < 0) {
                    i11 = i12;
                }
            }
            T t12 = tArr[i10];
            if (t12 == null) {
                qe.k.o();
            }
            Comparable comparable2 = (Comparable) t12;
            T t13 = tArr[i11];
            if (t13 == null) {
                qe.k.o();
            }
            if (comparable2.compareTo(t13) <= 0) {
                return;
            }
            m(i10, i11);
            i10 = i11;
        }
    }

    private final void l(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f33543a;
            if (tArr == null) {
                qe.k.o();
            }
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            if (t10 == null) {
                qe.k.o();
            }
            Comparable comparable = (Comparable) t10;
            T t11 = tArr[i10];
            if (t11 == null) {
                qe.k.o();
            }
            if (comparable.compareTo(t11) <= 0) {
                return;
            }
            m(i10, i11);
            i10 = i11;
        }
    }

    private final void m(int i10, int i11) {
        T[] tArr = this.f33543a;
        if (tArr == null) {
            qe.k.o();
        }
        T t10 = tArr[i11];
        if (t10 == null) {
            qe.k.o();
        }
        T t11 = tArr[i10];
        if (t11 == null) {
            qe.k.o();
        }
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.h(i10);
        t11.h(i11);
    }

    public final void a(T t10) {
        qe.k.g(t10, "node");
        if (i0.a()) {
            if (!(t10.g() == null)) {
                throw new AssertionError();
            }
        }
        t10.a(this);
        T[] f10 = f();
        int c10 = c();
        j(c10 + 1);
        f10[c10] = t10;
        t10.h(c10);
        l(c10);
    }

    public final T b() {
        T[] tArr = this.f33543a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return this._size;
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T b10;
        synchronized (this) {
            b10 = b();
        }
        return b10;
    }

    public final boolean g(T t10) {
        boolean z10;
        qe.k.g(t10, "node");
        synchronized (this) {
            z10 = true;
            if (t10.g() == null) {
                z10 = false;
            } else {
                int i10 = t10.i();
                if (i0.a()) {
                    if (!(i10 >= 0)) {
                        throw new AssertionError();
                    }
                }
                h(i10);
            }
        }
        return z10;
    }

    public final T h(int i10) {
        if (i0.a()) {
            if (!(c() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f33543a;
        if (tArr == null) {
            qe.k.o();
        }
        j(c() - 1);
        if (i10 < c()) {
            m(i10, c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                if (t10 == null) {
                    qe.k.o();
                }
                Comparable comparable = (Comparable) t10;
                T t11 = tArr[i11];
                if (t11 == null) {
                    qe.k.o();
                }
                if (comparable.compareTo(t11) < 0) {
                    m(i10, i11);
                    l(i11);
                }
            }
            k(i10);
        }
        T t12 = tArr[c()];
        if (t12 == null) {
            qe.k.o();
        }
        if (i0.a()) {
            if (!(t12.g() == this)) {
                throw new AssertionError();
            }
        }
        t12.a(null);
        t12.h(-1);
        tArr[c()] = null;
        return t12;
    }

    public final T i() {
        T h10;
        synchronized (this) {
            h10 = c() > 0 ? h(0) : null;
        }
        return h10;
    }
}
