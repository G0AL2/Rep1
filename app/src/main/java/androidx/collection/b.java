package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ArraySet.java */
/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f1855e = new int[0];

    /* renamed from: f  reason: collision with root package name */
    private static final Object[] f1856f = new Object[0];

    /* renamed from: g  reason: collision with root package name */
    private static Object[] f1857g;

    /* renamed from: h  reason: collision with root package name */
    private static int f1858h;

    /* renamed from: i  reason: collision with root package name */
    private static Object[] f1859i;

    /* renamed from: j  reason: collision with root package name */
    private static int f1860j;

    /* renamed from: a  reason: collision with root package name */
    private int[] f1861a;

    /* renamed from: b  reason: collision with root package name */
    Object[] f1862b;

    /* renamed from: c  reason: collision with root package name */
    int f1863c;

    /* renamed from: d  reason: collision with root package name */
    private f<E, E> f1864d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArraySet.java */
    /* loaded from: classes.dex */
    public class a extends f<E, E> {
        a() {
        }

        @Override // androidx.collection.f
        protected void a() {
            b.this.clear();
        }

        @Override // androidx.collection.f
        protected Object b(int i10, int i11) {
            return b.this.f1862b[i10];
        }

        @Override // androidx.collection.f
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // androidx.collection.f
        protected int d() {
            return b.this.f1863c;
        }

        @Override // androidx.collection.f
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // androidx.collection.f
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // androidx.collection.f
        protected void g(E e10, E e11) {
            b.this.add(e10);
        }

        @Override // androidx.collection.f
        protected void h(int i10) {
            b.this.i(i10);
        }

        @Override // androidx.collection.f
        protected E i(int i10, E e10) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    private void c(int i10) {
        if (i10 == 8) {
            synchronized (b.class) {
                Object[] objArr = f1859i;
                if (objArr != null) {
                    this.f1862b = objArr;
                    f1859i = (Object[]) objArr[0];
                    this.f1861a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1860j--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f1857g;
                if (objArr2 != null) {
                    this.f1862b = objArr2;
                    f1857g = (Object[]) objArr2[0];
                    this.f1861a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1858h--;
                    return;
                }
            }
        }
        this.f1861a = new int[i10];
        this.f1862b = new Object[i10];
    }

    private static void e(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f1860j < 10) {
                    objArr[0] = f1859i;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f1859i = objArr;
                    f1860j++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (f1858h < 10) {
                    objArr[0] = f1857g;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f1857g = objArr;
                    f1858h++;
                }
            }
        }
    }

    private f<E, E> f() {
        if (this.f1864d == null) {
            this.f1864d = new a();
        }
        return this.f1864d;
    }

    private int g(Object obj, int i10) {
        int i11 = this.f1863c;
        if (i11 == 0) {
            return -1;
        }
        int a10 = c.a(this.f1861a, i11, i10);
        if (a10 >= 0 && !obj.equals(this.f1862b[a10])) {
            int i12 = a10 + 1;
            while (i12 < i11 && this.f1861a[i12] == i10) {
                if (obj.equals(this.f1862b[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = a10 - 1; i13 >= 0 && this.f1861a[i13] == i10; i13--) {
                if (obj.equals(this.f1862b[i13])) {
                    return i13;
                }
            }
            return ~i12;
        }
        return a10;
    }

    private int h() {
        int i10 = this.f1863c;
        if (i10 == 0) {
            return -1;
        }
        int a10 = c.a(this.f1861a, i10, 0);
        if (a10 >= 0 && this.f1862b[a10] != null) {
            int i11 = a10 + 1;
            while (i11 < i10 && this.f1861a[i11] == 0) {
                if (this.f1862b[i11] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = a10 - 1; i12 >= 0 && this.f1861a[i12] == 0; i12--) {
                if (this.f1862b[i12] == null) {
                    return i12;
                }
            }
            return ~i11;
        }
        return a10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int g10;
        if (e10 == null) {
            g10 = h();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            g10 = g(e10, hashCode);
        }
        if (g10 >= 0) {
            return false;
        }
        int i11 = ~g10;
        int i12 = this.f1863c;
        int[] iArr = this.f1861a;
        if (i12 >= iArr.length) {
            int i13 = 4;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i13 = 8;
            }
            Object[] objArr = this.f1862b;
            c(i13);
            int[] iArr2 = this.f1861a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1862b, 0, objArr.length);
            }
            e(iArr, objArr, this.f1863c);
        }
        int i14 = this.f1863c;
        if (i11 < i14) {
            int[] iArr3 = this.f1861a;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f1862b;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f1863c - i11);
        }
        this.f1861a[i11] = i10;
        this.f1862b[i11] = e10;
        this.f1863c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        d(this.f1863c + collection.size());
        boolean z10 = false;
        for (E e10 : collection) {
            z10 |= add(e10);
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f1863c;
        if (i10 != 0) {
            e(this.f1861a, this.f1862b, i10);
            this.f1861a = f1855e;
            this.f1862b = f1856f;
            this.f1863c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public void d(int i10) {
        int[] iArr = this.f1861a;
        if (iArr.length < i10) {
            Object[] objArr = this.f1862b;
            c(i10);
            int i11 = this.f1863c;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f1861a, 0, i11);
                System.arraycopy(objArr, 0, this.f1862b, 0, this.f1863c);
            }
            e(iArr, objArr, this.f1863c);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f1863c; i10++) {
                try {
                    if (!set.contains(j(i10))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f1861a;
        int i10 = this.f1863c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public E i(int i10) {
        Object[] objArr = this.f1862b;
        E e10 = (E) objArr[i10];
        int i11 = this.f1863c;
        if (i11 <= 1) {
            e(this.f1861a, objArr, i11);
            this.f1861a = f1855e;
            this.f1862b = f1856f;
            this.f1863c = 0;
        } else {
            int[] iArr = this.f1861a;
            if (iArr.length > 8 && i11 < iArr.length / 3) {
                c(i11 > 8 ? i11 + (i11 >> 1) : 8);
                this.f1863c--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f1861a, 0, i10);
                    System.arraycopy(objArr, 0, this.f1862b, 0, i10);
                }
                int i12 = this.f1863c;
                if (i10 < i12) {
                    int i13 = i10 + 1;
                    System.arraycopy(iArr, i13, this.f1861a, i10, i12 - i10);
                    System.arraycopy(objArr, i13, this.f1862b, i10, this.f1863c - i10);
                }
            } else {
                int i14 = i11 - 1;
                this.f1863c = i14;
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    System.arraycopy(iArr, i15, iArr, i10, i14 - i10);
                    Object[] objArr2 = this.f1862b;
                    System.arraycopy(objArr2, i15, objArr2, i10, this.f1863c - i10);
                }
                this.f1862b[this.f1863c] = null;
            }
        }
        return e10;
    }

    public int indexOf(Object obj) {
        return obj == null ? h() : g(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f1863c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return f().m().iterator();
    }

    public E j(int i10) {
        return (E) this.f1862b[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            i(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f1863c - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f1862b[i10])) {
                i(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f1863c;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f1863c;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f1862b, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f1863c * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f1863c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E j10 = j(i10);
            if (j10 != this) {
                sb2.append(j10);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public b(int i10) {
        if (i10 == 0) {
            this.f1861a = f1855e;
            this.f1862b = f1856f;
        } else {
            c(i10);
        }
        this.f1863c = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1863c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1863c));
        }
        System.arraycopy(this.f1862b, 0, tArr, 0, this.f1863c);
        int length = tArr.length;
        int i10 = this.f1863c;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
