package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap.java */
/* loaded from: classes.dex */
public class g<K, V> {

    /* renamed from: d  reason: collision with root package name */
    static Object[] f1889d;

    /* renamed from: e  reason: collision with root package name */
    static int f1890e;

    /* renamed from: f  reason: collision with root package name */
    static Object[] f1891f;

    /* renamed from: g  reason: collision with root package name */
    static int f1892g;

    /* renamed from: a  reason: collision with root package name */
    int[] f1893a;

    /* renamed from: b  reason: collision with root package name */
    Object[] f1894b;

    /* renamed from: c  reason: collision with root package name */
    int f1895c;

    public g() {
        this.f1893a = c.f1866a;
        this.f1894b = c.f1868c;
        this.f1895c = 0;
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (g.class) {
                Object[] objArr = f1891f;
                if (objArr != null) {
                    this.f1894b = objArr;
                    f1891f = (Object[]) objArr[0];
                    this.f1893a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1892g--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (g.class) {
                Object[] objArr2 = f1889d;
                if (objArr2 != null) {
                    this.f1894b = objArr2;
                    f1889d = (Object[]) objArr2[0];
                    this.f1893a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1890e--;
                    return;
                }
            }
        }
        this.f1893a = new int[i10];
        this.f1894b = new Object[i10 << 1];
    }

    private static int c(int[] iArr, int i10, int i11) {
        try {
            return c.a(iArr, i10, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void e(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                if (f1892g < 10) {
                    objArr[0] = f1891f;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f1891f = objArr;
                    f1892g++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (g.class) {
                if (f1890e < 10) {
                    objArr[0] = f1889d;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f1889d = objArr;
                    f1890e++;
                }
            }
        }
    }

    public void clear() {
        int i10 = this.f1895c;
        if (i10 > 0) {
            int[] iArr = this.f1893a;
            Object[] objArr = this.f1894b;
            this.f1893a = c.f1866a;
            this.f1894b = c.f1868c;
            this.f1895c = 0;
            e(iArr, objArr, i10);
        }
        if (this.f1895c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public void d(int i10) {
        int i11 = this.f1895c;
        int[] iArr = this.f1893a;
        if (iArr.length < i10) {
            Object[] objArr = this.f1894b;
            a(i10);
            if (this.f1895c > 0) {
                System.arraycopy(iArr, 0, this.f1893a, 0, i11);
                System.arraycopy(objArr, 0, this.f1894b, 0, i11 << 1);
            }
            e(iArr, objArr, i11);
        }
        if (this.f1895c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f1895c; i10++) {
                try {
                    K j10 = j(i10);
                    V n10 = n(i10);
                    Object obj2 = gVar.get(j10);
                    if (n10 == null) {
                        if (obj2 != null || !gVar.containsKey(j10)) {
                            return false;
                        }
                    } else if (!n10.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f1895c; i11++) {
                try {
                    K j11 = j(i11);
                    V n11 = n(i11);
                    Object obj3 = map.get(j11);
                    if (n11 == null) {
                        if (obj3 != null || !map.containsKey(j11)) {
                            return false;
                        }
                    } else if (!n11.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    int f(Object obj, int i10) {
        int i11 = this.f1895c;
        if (i11 == 0) {
            return -1;
        }
        int c10 = c(this.f1893a, i11, i10);
        if (c10 >= 0 && !obj.equals(this.f1894b[c10 << 1])) {
            int i12 = c10 + 1;
            while (i12 < i11 && this.f1893a[i12] == i10) {
                if (obj.equals(this.f1894b[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = c10 - 1; i13 >= 0 && this.f1893a[i13] == i10; i13--) {
                if (obj.equals(this.f1894b[i13 << 1])) {
                    return i13;
                }
            }
            return ~i12;
        }
        return c10;
    }

    public int g(Object obj) {
        return obj == null ? h() : f(obj, obj.hashCode());
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v10) {
        int g10 = g(obj);
        return g10 >= 0 ? (V) this.f1894b[(g10 << 1) + 1] : v10;
    }

    int h() {
        int i10 = this.f1895c;
        if (i10 == 0) {
            return -1;
        }
        int c10 = c(this.f1893a, i10, 0);
        if (c10 >= 0 && this.f1894b[c10 << 1] != null) {
            int i11 = c10 + 1;
            while (i11 < i10 && this.f1893a[i11] == 0) {
                if (this.f1894b[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = c10 - 1; i12 >= 0 && this.f1893a[i12] == 0; i12--) {
                if (this.f1894b[i12 << 1] == null) {
                    return i12;
                }
            }
            return ~i11;
        }
        return c10;
    }

    public int hashCode() {
        int[] iArr = this.f1893a;
        Object[] objArr = this.f1894b;
        int i10 = this.f1895c;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i(Object obj) {
        int i10 = this.f1895c * 2;
        Object[] objArr = this.f1894b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f1895c <= 0;
    }

    public K j(int i10) {
        return (K) this.f1894b[i10 << 1];
    }

    public void k(g<? extends K, ? extends V> gVar) {
        int i10 = gVar.f1895c;
        d(this.f1895c + i10);
        if (this.f1895c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(gVar.j(i11), gVar.n(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(gVar.f1893a, 0, this.f1893a, 0, i10);
            System.arraycopy(gVar.f1894b, 0, this.f1894b, 0, i10 << 1);
            this.f1895c = i10;
        }
    }

    public V l(int i10) {
        Object[] objArr = this.f1894b;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f1895c;
        int i13 = 0;
        if (i12 <= 1) {
            e(this.f1893a, objArr, i12);
            this.f1893a = c.f1866a;
            this.f1894b = c.f1868c;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f1893a;
            if (iArr.length > 8 && i12 < iArr.length / 3) {
                a(i12 > 8 ? i12 + (i12 >> 1) : 8);
                if (i12 != this.f1895c) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f1893a, 0, i10);
                    System.arraycopy(objArr, 0, this.f1894b, 0, i11);
                }
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    int i16 = i14 - i10;
                    System.arraycopy(iArr, i15, this.f1893a, i10, i16);
                    System.arraycopy(objArr, i15 << 1, this.f1894b, i11, i16 << 1);
                }
            } else {
                if (i10 < i14) {
                    int i17 = i10 + 1;
                    int i18 = i14 - i10;
                    System.arraycopy(iArr, i17, iArr, i10, i18);
                    Object[] objArr2 = this.f1894b;
                    System.arraycopy(objArr2, i17 << 1, objArr2, i11, i18 << 1);
                }
                Object[] objArr3 = this.f1894b;
                int i19 = i14 << 1;
                objArr3[i19] = null;
                objArr3[i19 + 1] = null;
            }
            i13 = i14;
        }
        if (i12 == this.f1895c) {
            this.f1895c = i13;
            return v10;
        }
        throw new ConcurrentModificationException();
    }

    public V m(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f1894b;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    public V n(int i10) {
        return (V) this.f1894b[(i10 << 1) + 1];
    }

    public V put(K k10, V v10) {
        int i10;
        int f10;
        int i11 = this.f1895c;
        if (k10 == null) {
            f10 = h();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            f10 = f(k10, hashCode);
        }
        if (f10 >= 0) {
            int i12 = (f10 << 1) + 1;
            Object[] objArr = this.f1894b;
            V v11 = (V) objArr[i12];
            objArr[i12] = v10;
            return v11;
        }
        int i13 = ~f10;
        int[] iArr = this.f1893a;
        if (i11 >= iArr.length) {
            int i14 = 4;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 >= 4) {
                i14 = 8;
            }
            Object[] objArr2 = this.f1894b;
            a(i14);
            if (i11 == this.f1895c) {
                int[] iArr2 = this.f1893a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f1894b, 0, objArr2.length);
                }
                e(iArr, objArr2, i11);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i11) {
            int[] iArr3 = this.f1893a;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f1894b;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f1895c - i13) << 1);
        }
        int i16 = this.f1895c;
        if (i11 == i16) {
            int[] iArr4 = this.f1893a;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f1894b;
                int i17 = i13 << 1;
                objArr4[i17] = k10;
                objArr4[i17 + 1] = v10;
                this.f1895c = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    public V remove(Object obj) {
        int g10 = g(obj);
        if (g10 >= 0) {
            return l(g10);
        }
        return null;
    }

    public V replace(K k10, V v10) {
        int g10 = g(k10);
        if (g10 >= 0) {
            return m(g10, v10);
        }
        return null;
    }

    public int size() {
        return this.f1895c;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f1895c * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f1895c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            K j10 = j(i10);
            if (j10 != this) {
                sb2.append(j10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V n10 = n(i10);
            if (n10 != this) {
                sb2.append(n10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int g10 = g(obj);
        if (g10 >= 0) {
            V n10 = n(g10);
            if (obj2 == n10 || (obj2 != null && obj2.equals(n10))) {
                l(g10);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean replace(K k10, V v10, V v11) {
        int g10 = g(k10);
        if (g10 >= 0) {
            V n10 = n(g10);
            if (n10 == v10 || (v10 != null && v10.equals(n10))) {
                m(g10, v11);
                return true;
            }
            return false;
        }
        return false;
    }

    public g(int i10) {
        if (i10 == 0) {
            this.f1893a = c.f1866a;
            this.f1894b = c.f1868c;
        } else {
            a(i10);
        }
        this.f1895c = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(g<K, V> gVar) {
        this();
        if (gVar != 0) {
            k(gVar);
        }
    }
}
