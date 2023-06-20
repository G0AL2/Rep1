package jb;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: ImmutableSet.java */
/* loaded from: classes3.dex */
public abstract class u<E> extends q<E> implements Set<E> {

    /* renamed from: b  reason: collision with root package name */
    private transient s<E> f33069b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(int i10) {
        int max = Math.max(i10, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        ib.l.e(max < 1073741824, "collection too large");
        return 1073741824;
    }

    private static <E> u<E> m(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 != 1) {
                int l10 = l(i10);
                Object[] objArr2 = new Object[l10];
                int i11 = l10 - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object a10 = h0.a(objArr[i14], i14);
                    int hashCode = a10.hashCode();
                    int b10 = p.b(hashCode);
                    while (true) {
                        int i15 = b10 & i11;
                        Object obj = objArr2[i15];
                        if (obj == null) {
                            objArr[i13] = a10;
                            objArr2[i15] = a10;
                            i12 += hashCode;
                            i13++;
                            break;
                        } else if (obj.equals(a10)) {
                            break;
                        } else {
                            b10++;
                        }
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    return new r0(obj2);
                } else if (l(i13) < l10 / 2) {
                    return m(i13, objArr);
                } else {
                    if (v(i13, objArr.length)) {
                        objArr = Arrays.copyOf(objArr, i13);
                    }
                    return new m0(objArr, i12, objArr2, i11, i13);
                }
            }
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return s(obj3);
        }
        return r();
    }

    public static <E> u<E> n(Collection<? extends E> collection) {
        if ((collection instanceof u) && !(collection instanceof SortedSet)) {
            u<E> uVar = (u) collection;
            if (!uVar.j()) {
                return uVar;
            }
        }
        Object[] array = collection.toArray();
        return m(array.length, array);
    }

    public static <E> u<E> o(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            if (length != 1) {
                return m(eArr.length, (Object[]) eArr.clone());
            }
            return s(eArr[0]);
        }
        return r();
    }

    public static <E> u<E> r() {
        return m0.f33037i;
    }

    public static <E> u<E> s(E e10) {
        return new r0(e10);
    }

    public static <E> u<E> t(E e10, E e11) {
        return m(2, e10, e11);
    }

    public static <E> u<E> u(E e10, E e11, E e12) {
        return m(3, e10, e11, e12);
    }

    private static boolean v(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    @Override // jb.q
    public s<E> e() {
        s<E> sVar = this.f33069b;
        if (sVar == null) {
            s<E> p10 = p();
            this.f33069b = p10;
            return p10;
        }
        return sVar;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof u) && q() && ((u) obj).q() && hashCode() != obj.hashCode()) {
            return false;
        }
        return q0.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return q0.d(this);
    }

    @Override // jb.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    s<E> p() {
        return s.l(toArray());
    }

    boolean q() {
        return false;
    }
}
