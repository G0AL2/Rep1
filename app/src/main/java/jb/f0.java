package jb;

import java.io.Serializable;

/* compiled from: NaturalOrdering.java */
/* loaded from: classes3.dex */
final class f0 extends i0<Comparable<?>> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final f0 f32986a = new f0();

    private f0() {
    }

    @Override // jb.i0
    public <S extends Comparable<?>> i0<S> d() {
        return n0.f33043a;
    }

    @Override // jb.i0, java.util.Comparator
    /* renamed from: e */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        ib.l.j(comparable);
        ib.l.j(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
