package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.z;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class n extends c<Double> implements z.b, RandomAccess, z0 {

    /* renamed from: d  reason: collision with root package name */
    public static final n f19957d;

    /* renamed from: b  reason: collision with root package name */
    public double[] f19958b;

    /* renamed from: c  reason: collision with root package name */
    public int f19959c;

    static {
        n nVar = new n(new double[0], 0);
        f19957d = nVar;
        nVar.f19843a = false;
    }

    public n() {
        this(new double[10], 0);
    }

    public void a(double d10) {
        e();
        int i10 = this.f19959c;
        double[] dArr = this.f19958b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f19958b = dArr2;
        }
        double[] dArr3 = this.f19958b;
        int i11 = this.f19959c;
        this.f19959c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        e();
        if (i10 >= 0 && i10 <= (i11 = this.f19959c)) {
            double[] dArr = this.f19958b;
            if (i11 < dArr.length) {
                System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
            } else {
                double[] dArr2 = new double[((i11 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i10);
                System.arraycopy(this.f19958b, i10, dArr2, i10 + 1, this.f19959c - i10);
                this.f19958b = dArr2;
            }
            this.f19958b[i10] = doubleValue;
            this.f19959c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(d(i10));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        e();
        Charset charset = z.f20078a;
        collection.getClass();
        if (!(collection instanceof n)) {
            return super.addAll(collection);
        }
        n nVar = (n) collection;
        int i10 = nVar.f19959c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f19959c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f19958b;
            if (i12 > dArr.length) {
                this.f19958b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(nVar.f19958b, 0, this.f19958b, this.f19959c, nVar.f19959c);
            this.f19959c = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void c(int i10) {
        if (i10 < 0 || i10 >= this.f19959c) {
            throw new IndexOutOfBoundsException(d(i10));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final String d(int i10) {
        return "Index:" + i10 + ", Size:" + this.f19959c;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z.j
    /* renamed from: e */
    public z.b b(int i10) {
        if (i10 >= this.f19959c) {
            return new n(Arrays.copyOf(this.f19958b, i10), this.f19959c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return super.equals(obj);
        }
        n nVar = (n) obj;
        if (this.f19959c != nVar.f19959c) {
            return false;
        }
        double[] dArr = nVar.f19958b;
        for (int i10 = 0; i10 < this.f19959c; i10++) {
            if (Double.doubleToLongBits(this.f19958b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        c(i10);
        return Double.valueOf(this.f19958b[i10]);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f19959c; i11++) {
            i10 = (i10 * 31) + z.a(Double.doubleToLongBits(this.f19958b[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int i10 = this.f19959c;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f19958b[i11] == doubleValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        int i11;
        e();
        c(i10);
        double[] dArr = this.f19958b;
        double d10 = dArr[i10];
        if (i10 < this.f19959c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f19959c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        e();
        if (i11 >= i10) {
            double[] dArr = this.f19958b;
            System.arraycopy(dArr, i11, dArr, i10, this.f19959c - i11);
            this.f19959c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        e();
        c(i10);
        double[] dArr = this.f19958b;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19959c;
    }

    public n(double[] dArr, int i10) {
        this.f19958b = dArr;
        this.f19959c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        a(((Double) obj).doubleValue());
        return true;
    }
}
