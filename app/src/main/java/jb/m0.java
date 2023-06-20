package jb;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegularImmutableSet.java */
/* loaded from: classes3.dex */
public final class m0<E> extends u<E> {

    /* renamed from: h  reason: collision with root package name */
    private static final Object[] f33036h;

    /* renamed from: i  reason: collision with root package name */
    static final m0<Object> f33037i;

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f33038c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f33039d;

    /* renamed from: e  reason: collision with root package name */
    final transient Object[] f33040e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f33041f;

    /* renamed from: g  reason: collision with root package name */
    private final transient int f33042g;

    static {
        Object[] objArr = new Object[0];
        f33036h = objArr;
        f33037i = new m0<>(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f33038c = objArr;
        this.f33039d = i10;
        this.f33040e = objArr2;
        this.f33041f = i11;
        this.f33042g = i12;
    }

    @Override // jb.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f33040e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int c10 = p.c(obj);
        while (true) {
            int i10 = c10 & this.f33041f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c10 = i10 + 1;
        }
    }

    @Override // jb.q
    int f(Object[] objArr, int i10) {
        System.arraycopy(this.f33038c, 0, objArr, i10, this.f33042g);
        return i10 + this.f33042g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // jb.q
    public Object[] g() {
        return this.f33038c;
    }

    @Override // jb.q
    int h() {
        return this.f33042g;
    }

    @Override // jb.u, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f33039d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // jb.q
    public int i() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // jb.q
    public boolean j() {
        return false;
    }

    @Override // jb.u, jb.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public u0<E> iterator() {
        return e().iterator();
    }

    @Override // jb.u
    s<E> p() {
        return s.m(this.f33038c, this.f33042g);
    }

    @Override // jb.u
    boolean q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f33042g;
    }
}
