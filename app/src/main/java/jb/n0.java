package jb;

import java.io.Serializable;

/* compiled from: ReverseNaturalOrdering.java */
/* loaded from: classes3.dex */
final class n0 extends i0<Comparable<?>> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final n0 f33043a = new n0();

    private n0() {
    }

    @Override // jb.i0
    public <S extends Comparable<?>> i0<S> d() {
        return i0.b();
    }

    @Override // jb.i0, java.util.Comparator
    /* renamed from: e */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        ib.l.j(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
