package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.z;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class y extends c<Integer> implements z.g, RandomAccess, z0 {

    /* renamed from: d  reason: collision with root package name */
    public static final y f20075d;

    /* renamed from: b  reason: collision with root package name */
    public int[] f20076b;

    /* renamed from: c  reason: collision with root package name */
    public int f20077c;

    static {
        y yVar = new y(new int[0], 0);
        f20075d = yVar;
        yVar.f19843a = false;
    }

    public y() {
        this(new int[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        e();
        if (i10 >= 0 && i10 <= (i11 = this.f20077c)) {
            int[] iArr = this.f20076b;
            if (i11 < iArr.length) {
                System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
            } else {
                int[] iArr2 = new int[((i11 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                System.arraycopy(this.f20076b, i10, iArr2, i10 + 1, this.f20077c - i10);
                this.f20076b = iArr2;
            }
            this.f20076b[i10] = intValue;
            this.f20077c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(f(i10));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        e();
        Charset charset = z.f20078a;
        collection.getClass();
        if (!(collection instanceof y)) {
            return super.addAll(collection);
        }
        y yVar = (y) collection;
        int i10 = yVar.f20077c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f20077c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f20076b;
            if (i12 > iArr.length) {
                this.f20076b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(yVar.f20076b, 0, this.f20076b, this.f20077c, yVar.f20077c);
            this.f20077c = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void c(int i10) {
        e();
        int i11 = this.f20077c;
        int[] iArr = this.f20076b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f20076b = iArr2;
        }
        int[] iArr3 = this.f20076b;
        int i12 = this.f20077c;
        this.f20077c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 >= this.f20077c) {
            throw new IndexOutOfBoundsException(f(i10));
        }
    }

    public int e(int i10) {
        d(i10);
        return this.f20076b[i10];
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return super.equals(obj);
        }
        y yVar = (y) obj;
        if (this.f20077c != yVar.f20077c) {
            return false;
        }
        int[] iArr = yVar.f20076b;
        for (int i10 = 0; i10 < this.f20077c; i10++) {
            if (this.f20076b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final String f(int i10) {
        return "Index:" + i10 + ", Size:" + this.f20077c;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z.j
    /* renamed from: g */
    public z.g b(int i10) {
        if (i10 >= this.f20077c) {
            return new y(Arrays.copyOf(this.f20076b, i10), this.f20077c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        d(i10);
        return Integer.valueOf(this.f20076b[i10]);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f20077c; i11++) {
            i10 = (i10 * 31) + this.f20076b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f20077c;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f20076b[i11] == intValue) {
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
        d(i10);
        int[] iArr = this.f20076b;
        int i12 = iArr[i10];
        if (i10 < this.f20077c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.f20077c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        e();
        if (i11 >= i10) {
            int[] iArr = this.f20076b;
            System.arraycopy(iArr, i11, iArr, i10, this.f20077c - i11);
            this.f20077c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        e();
        d(i10);
        int[] iArr = this.f20076b;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f20077c;
    }

    public y(int[] iArr, int i10) {
        this.f20076b = iArr;
        this.f20077c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        c(((Integer) obj).intValue());
        return true;
    }
}
