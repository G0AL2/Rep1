package jb;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegularImmutableList.java */
/* loaded from: classes3.dex */
public class k0<E> extends s<E> {

    /* renamed from: e  reason: collision with root package name */
    static final s<Object> f33014e = new k0(new Object[0], 0);

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f33015c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f33016d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(Object[] objArr, int i10) {
        this.f33015c = objArr;
        this.f33016d = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // jb.s, jb.q
    public int f(Object[] objArr, int i10) {
        System.arraycopy(this.f33015c, 0, objArr, i10, this.f33016d);
        return i10 + this.f33016d;
    }

    @Override // jb.q
    Object[] g() {
        return this.f33015c;
    }

    @Override // java.util.List
    public E get(int i10) {
        ib.l.h(i10, this.f33016d);
        E e10 = (E) this.f33015c[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // jb.q
    int h() {
        return this.f33016d;
    }

    @Override // jb.q
    int i() {
        return 0;
    }

    @Override // jb.q
    boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f33016d;
    }
}
