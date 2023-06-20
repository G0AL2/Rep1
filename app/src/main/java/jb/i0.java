package jb;

import java.util.Comparator;

/* compiled from: Ordering.java */
/* loaded from: classes3.dex */
public abstract class i0<T> implements Comparator<T> {
    public static <T> i0<T> a(Comparator<T> comparator) {
        if (comparator instanceof i0) {
            return (i0) comparator;
        }
        return new l(comparator);
    }

    public static <C extends Comparable> i0<C> b() {
        return f0.f32986a;
    }

    public <F> i0<F> c(ib.f<F, ? extends T> fVar) {
        return new g(fVar, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t10, T t11);

    public <S extends T> i0<S> d() {
        return new o0(this);
    }
}
