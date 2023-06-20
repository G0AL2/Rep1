package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;

/* compiled from: LongSparseArray.java */
/* loaded from: classes.dex */
public class d<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private static final Object f1869e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private boolean f1870a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f1871b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f1872c;

    /* renamed from: d  reason: collision with root package name */
    private int f1873d;

    public d() {
        this(10);
    }

    private void e() {
        int i10 = this.f1873d;
        long[] jArr = this.f1871b;
        Object[] objArr = this.f1872c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f1869e) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f1870a = false;
        this.f1873d = i11;
    }

    public void a(long j10, E e10) {
        int i10 = this.f1873d;
        if (i10 != 0 && j10 <= this.f1871b[i10 - 1]) {
            k(j10, e10);
            return;
        }
        if (this.f1870a && i10 >= this.f1871b.length) {
            e();
        }
        int i11 = this.f1873d;
        if (i11 >= this.f1871b.length) {
            int f10 = c.f(i11 + 1);
            long[] jArr = new long[f10];
            Object[] objArr = new Object[f10];
            long[] jArr2 = this.f1871b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f1872c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1871b = jArr;
            this.f1872c = objArr;
        }
        this.f1871b[i11] = j10;
        this.f1872c[i11] = e10;
        this.f1873d = i11 + 1;
    }

    public void b() {
        int i10 = this.f1873d;
        Object[] objArr = this.f1872c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f1873d = 0;
        this.f1870a = false;
    }

    /* renamed from: c */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f1871b = (long[]) this.f1871b.clone();
            dVar.f1872c = (Object[]) this.f1872c.clone();
            return dVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean d(long j10) {
        return i(j10) >= 0;
    }

    public E f(long j10) {
        return g(j10, null);
    }

    public E g(long j10, E e10) {
        int b10 = c.b(this.f1871b, this.f1873d, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f1872c;
            if (objArr[b10] != f1869e) {
                return (E) objArr[b10];
            }
        }
        return e10;
    }

    public int i(long j10) {
        if (this.f1870a) {
            e();
        }
        return c.b(this.f1871b, this.f1873d, j10);
    }

    public long j(int i10) {
        if (this.f1870a) {
            e();
        }
        return this.f1871b[i10];
    }

    public void k(long j10, E e10) {
        int b10 = c.b(this.f1871b, this.f1873d, j10);
        if (b10 >= 0) {
            this.f1872c[b10] = e10;
            return;
        }
        int i10 = ~b10;
        int i11 = this.f1873d;
        if (i10 < i11) {
            Object[] objArr = this.f1872c;
            if (objArr[i10] == f1869e) {
                this.f1871b[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f1870a && i11 >= this.f1871b.length) {
            e();
            i10 = ~c.b(this.f1871b, this.f1873d, j10);
        }
        int i12 = this.f1873d;
        if (i12 >= this.f1871b.length) {
            int f10 = c.f(i12 + 1);
            long[] jArr = new long[f10];
            Object[] objArr2 = new Object[f10];
            long[] jArr2 = this.f1871b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1872c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1871b = jArr;
            this.f1872c = objArr2;
        }
        int i13 = this.f1873d;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f1871b;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f1872c;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f1873d - i10);
        }
        this.f1871b[i10] = j10;
        this.f1872c[i10] = e10;
        this.f1873d++;
    }

    public void m(long j10) {
        int b10 = c.b(this.f1871b, this.f1873d, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f1872c;
            Object obj = objArr[b10];
            Object obj2 = f1869e;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.f1870a = true;
            }
        }
    }

    public void n(int i10) {
        Object[] objArr = this.f1872c;
        Object obj = objArr[i10];
        Object obj2 = f1869e;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f1870a = true;
        }
    }

    public int o() {
        if (this.f1870a) {
            e();
        }
        return this.f1873d;
    }

    public E p(int i10) {
        if (this.f1870a) {
            e();
        }
        return (E) this.f1872c[i10];
    }

    public String toString() {
        if (o() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f1873d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f1873d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(j(i10));
            sb2.append('=');
            E p10 = p(i10);
            if (p10 != this) {
                sb2.append(p10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public d(int i10) {
        this.f1870a = false;
        if (i10 == 0) {
            this.f1871b = c.f1867b;
            this.f1872c = c.f1868c;
            return;
        }
        int f10 = c.f(i10);
        this.f1871b = new long[f10];
        this.f1872c = new Object[f10];
    }
}
