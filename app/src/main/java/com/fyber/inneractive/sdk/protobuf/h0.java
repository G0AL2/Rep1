package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.z;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class h0 extends c<Long> implements z.i, RandomAccess, z0 {

    /* renamed from: d  reason: collision with root package name */
    public static final h0 f19874d;

    /* renamed from: b  reason: collision with root package name */
    public long[] f19875b;

    /* renamed from: c  reason: collision with root package name */
    public int f19876c;

    static {
        h0 h0Var = new h0(new long[0], 0);
        f19874d = h0Var;
        h0Var.f19843a = false;
    }

    public h0() {
        this(new long[10], 0);
    }

    public void a(long j10) {
        e();
        int i10 = this.f19876c;
        long[] jArr = this.f19875b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f19875b = jArr2;
        }
        long[] jArr3 = this.f19875b;
        int i11 = this.f19876c;
        this.f19876c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        e();
        if (i10 >= 0 && i10 <= (i11 = this.f19876c)) {
            long[] jArr = this.f19875b;
            if (i11 < jArr.length) {
                System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
            } else {
                long[] jArr2 = new long[((i11 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i10);
                System.arraycopy(this.f19875b, i10, jArr2, i10 + 1, this.f19876c - i10);
                this.f19875b = jArr2;
            }
            this.f19875b[i10] = longValue;
            this.f19876c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(e(i10));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        e();
        Charset charset = z.f20078a;
        collection.getClass();
        if (!(collection instanceof h0)) {
            return super.addAll(collection);
        }
        h0 h0Var = (h0) collection;
        int i10 = h0Var.f19876c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f19876c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f19875b;
            if (i12 > jArr.length) {
                this.f19875b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(h0Var.f19875b, 0, this.f19875b, this.f19876c, h0Var.f19876c);
            this.f19876c = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void c(int i10) {
        if (i10 < 0 || i10 >= this.f19876c) {
            throw new IndexOutOfBoundsException(e(i10));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public long d(int i10) {
        c(i10);
        return this.f19875b[i10];
    }

    public final String e(int i10) {
        return "Index:" + i10 + ", Size:" + this.f19876c;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return super.equals(obj);
        }
        h0 h0Var = (h0) obj;
        if (this.f19876c != h0Var.f19876c) {
            return false;
        }
        long[] jArr = h0Var.f19875b;
        for (int i10 = 0; i10 < this.f19876c; i10++) {
            if (this.f19875b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z.j
    /* renamed from: f */
    public z.i b(int i10) {
        if (i10 >= this.f19876c) {
            return new h0(Arrays.copyOf(this.f19875b, i10), this.f19876c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        c(i10);
        return Long.valueOf(this.f19875b[i10]);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f19876c; i11++) {
            i10 = (i10 * 31) + z.a(this.f19875b[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i10 = this.f19876c;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f19875b[i11] == longValue) {
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
        long[] jArr = this.f19875b;
        long j10 = jArr[i10];
        if (i10 < this.f19876c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f19876c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        e();
        if (i11 >= i10) {
            long[] jArr = this.f19875b;
            System.arraycopy(jArr, i11, jArr, i10, this.f19876c - i11);
            this.f19876c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        e();
        c(i10);
        long[] jArr = this.f19875b;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19876c;
    }

    public h0(long[] jArr, int i10) {
        this.f19875b = jArr;
        this.f19876c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        a(((Long) obj).longValue());
        return true;
    }
}
