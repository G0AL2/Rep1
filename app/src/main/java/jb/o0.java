package jb;

import java.io.Serializable;

/* compiled from: ReverseOrdering.java */
/* loaded from: classes3.dex */
final class o0<T> extends i0<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final i0<? super T> f33044a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(i0<? super T> i0Var) {
        this.f33044a = (i0) ib.l.j(i0Var);
    }

    @Override // jb.i0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f33044a.compare(t11, t10);
    }

    @Override // jb.i0
    public <S extends T> i0<S> d() {
        return (i0<? super T>) this.f33044a;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0) {
            return this.f33044a.equals(((o0) obj).f33044a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f33044a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f33044a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 10);
        sb2.append(valueOf);
        sb2.append(".reverse()");
        return sb2.toString();
    }
}
