package jb;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: ComparatorOrdering.java */
/* loaded from: classes3.dex */
final class l<T> extends i0<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final Comparator<T> f33017a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Comparator<T> comparator) {
        this.f33017a = (Comparator) ib.l.j(comparator);
    }

    @Override // jb.i0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f33017a.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            return this.f33017a.equals(((l) obj).f33017a);
        }
        return false;
    }

    public int hashCode() {
        return this.f33017a.hashCode();
    }

    public String toString() {
        return this.f33017a.toString();
    }
}
