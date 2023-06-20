package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.z;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class g extends c<Boolean> implements z.a, RandomAccess, z0 {

    /* renamed from: d  reason: collision with root package name */
    public static final g f19868d;

    /* renamed from: b  reason: collision with root package name */
    public boolean[] f19869b;

    /* renamed from: c  reason: collision with root package name */
    public int f19870c;

    static {
        g gVar = new g(new boolean[0], 0);
        f19868d = gVar;
        gVar.f19843a = false;
    }

    public g() {
        this(new boolean[10], 0);
    }

    public void a(boolean z10) {
        e();
        int i10 = this.f19870c;
        boolean[] zArr = this.f19869b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f19869b = zArr2;
        }
        boolean[] zArr3 = this.f19869b;
        int i11 = this.f19870c;
        this.f19870c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e();
        if (i10 >= 0 && i10 <= (i11 = this.f19870c)) {
            boolean[] zArr = this.f19869b;
            if (i11 < zArr.length) {
                System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
            } else {
                boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i10);
                System.arraycopy(this.f19869b, i10, zArr2, i10 + 1, this.f19870c - i10);
                this.f19869b = zArr2;
            }
            this.f19869b[i10] = booleanValue;
            this.f19870c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(d(i10));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        e();
        Charset charset = z.f20078a;
        collection.getClass();
        if (!(collection instanceof g)) {
            return super.addAll(collection);
        }
        g gVar = (g) collection;
        int i10 = gVar.f19870c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f19870c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f19869b;
            if (i12 > zArr.length) {
                this.f19869b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(gVar.f19869b, 0, this.f19869b, this.f19870c, gVar.f19870c);
            this.f19870c = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void c(int i10) {
        if (i10 < 0 || i10 >= this.f19870c) {
            throw new IndexOutOfBoundsException(d(i10));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final String d(int i10) {
        return "Index:" + i10 + ", Size:" + this.f19870c;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z.j
    /* renamed from: e */
    public z.a b(int i10) {
        if (i10 >= this.f19870c) {
            return new g(Arrays.copyOf(this.f19869b, i10), this.f19870c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return super.equals(obj);
        }
        g gVar = (g) obj;
        if (this.f19870c != gVar.f19870c) {
            return false;
        }
        boolean[] zArr = gVar.f19869b;
        for (int i10 = 0; i10 < this.f19870c; i10++) {
            if (this.f19869b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        c(i10);
        return Boolean.valueOf(this.f19869b[i10]);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f19870c; i11++) {
            i10 = (i10 * 31) + z.a(this.f19869b[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i10 = this.f19870c;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f19869b[i11] == booleanValue) {
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
        boolean[] zArr = this.f19869b;
        boolean z10 = zArr[i10];
        if (i10 < this.f19870c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f19870c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        e();
        if (i11 >= i10) {
            boolean[] zArr = this.f19869b;
            System.arraycopy(zArr, i11, zArr, i10, this.f19870c - i11);
            this.f19870c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e();
        c(i10);
        boolean[] zArr = this.f19869b;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19870c;
    }

    public g(boolean[] zArr, int i10) {
        this.f19869b = zArr;
        this.f19870c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        a(((Boolean) obj).booleanValue());
        return true;
    }
}
