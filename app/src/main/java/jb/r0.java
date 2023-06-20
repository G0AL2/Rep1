package jb;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SingletonImmutableSet.java */
/* loaded from: classes3.dex */
public final class r0<E> extends u<E> {

    /* renamed from: c  reason: collision with root package name */
    final transient E f33055c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(E e10) {
        this.f33055c = (E) ib.l.j(e10);
    }

    @Override // jb.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f33055c.equals(obj);
    }

    @Override // jb.u, jb.q
    public s<E> e() {
        return s.u(this.f33055c);
    }

    @Override // jb.q
    int f(Object[] objArr, int i10) {
        objArr[i10] = this.f33055c;
        return i10 + 1;
    }

    @Override // jb.u, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f33055c.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // jb.q
    public boolean j() {
        return false;
    }

    @Override // jb.u, jb.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public u0<E> iterator() {
        return w.q(this.f33055c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.f33055c.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }
}
