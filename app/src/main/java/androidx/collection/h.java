package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;

/* compiled from: SparseArrayCompat.java */
/* loaded from: classes.dex */
public class h<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private static final Object f1896e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private boolean f1897a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f1898b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f1899c;

    /* renamed from: d  reason: collision with root package name */
    private int f1900d;

    public h() {
        this(10);
    }

    private void d() {
        int i10 = this.f1900d;
        int[] iArr = this.f1898b;
        Object[] objArr = this.f1899c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f1896e) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f1897a = false;
        this.f1900d = i11;
    }

    public void a(int i10, E e10) {
        int i11 = this.f1900d;
        if (i11 != 0 && i10 <= this.f1898b[i11 - 1]) {
            j(i10, e10);
            return;
        }
        if (this.f1897a && i11 >= this.f1898b.length) {
            d();
        }
        int i12 = this.f1900d;
        if (i12 >= this.f1898b.length) {
            int e11 = c.e(i12 + 1);
            int[] iArr = new int[e11];
            Object[] objArr = new Object[e11];
            int[] iArr2 = this.f1898b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f1899c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1898b = iArr;
            this.f1899c = objArr;
        }
        this.f1898b[i12] = i10;
        this.f1899c[i12] = e10;
        this.f1900d = i12 + 1;
    }

    public void b() {
        int i10 = this.f1900d;
        Object[] objArr = this.f1899c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f1900d = 0;
        this.f1897a = false;
    }

    /* renamed from: c */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f1898b = (int[]) this.f1898b.clone();
            hVar.f1899c = (Object[]) this.f1899c.clone();
            return hVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public E e(int i10) {
        return f(i10, null);
    }

    public E f(int i10, E e10) {
        int a10 = c.a(this.f1898b, this.f1900d, i10);
        if (a10 >= 0) {
            Object[] objArr = this.f1899c;
            if (objArr[a10] != f1896e) {
                return (E) objArr[a10];
            }
        }
        return e10;
    }

    public int g(E e10) {
        if (this.f1897a) {
            d();
        }
        for (int i10 = 0; i10 < this.f1900d; i10++) {
            if (this.f1899c[i10] == e10) {
                return i10;
            }
        }
        return -1;
    }

    public int i(int i10) {
        if (this.f1897a) {
            d();
        }
        return this.f1898b[i10];
    }

    public void j(int i10, E e10) {
        int a10 = c.a(this.f1898b, this.f1900d, i10);
        if (a10 >= 0) {
            this.f1899c[a10] = e10;
            return;
        }
        int i11 = ~a10;
        int i12 = this.f1900d;
        if (i11 < i12) {
            Object[] objArr = this.f1899c;
            if (objArr[i11] == f1896e) {
                this.f1898b[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f1897a && i12 >= this.f1898b.length) {
            d();
            i11 = ~c.a(this.f1898b, this.f1900d, i10);
        }
        int i13 = this.f1900d;
        if (i13 >= this.f1898b.length) {
            int e11 = c.e(i13 + 1);
            int[] iArr = new int[e11];
            Object[] objArr2 = new Object[e11];
            int[] iArr2 = this.f1898b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1899c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1898b = iArr;
            this.f1899c = objArr2;
        }
        int i14 = this.f1900d;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f1898b;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f1899c;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f1900d - i11);
        }
        this.f1898b[i11] = i10;
        this.f1899c[i11] = e10;
        this.f1900d++;
    }

    public int k() {
        if (this.f1897a) {
            d();
        }
        return this.f1900d;
    }

    public E m(int i10) {
        if (this.f1897a) {
            d();
        }
        return (E) this.f1899c[i10];
    }

    public String toString() {
        if (k() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f1900d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f1900d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(i(i10));
            sb2.append('=');
            E m10 = m(i10);
            if (m10 != this) {
                sb2.append(m10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public h(int i10) {
        this.f1897a = false;
        if (i10 == 0) {
            this.f1898b = c.f1866a;
            this.f1899c = c.f1868c;
            return;
        }
        int e10 = c.e(i10);
        this.f1898b = new int[e10];
        this.f1899c = new Object[e10];
    }
}
