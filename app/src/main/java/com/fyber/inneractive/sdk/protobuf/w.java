package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.z;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class w extends c<Float> implements z.f, RandomAccess, z0 {

    /* renamed from: d  reason: collision with root package name */
    public static final w f20069d;

    /* renamed from: b  reason: collision with root package name */
    public float[] f20070b;

    /* renamed from: c  reason: collision with root package name */
    public int f20071c;

    static {
        w wVar = new w(new float[0], 0);
        f20069d = wVar;
        wVar.f19843a = false;
    }

    public w() {
        this(new float[10], 0);
    }

    public void a(float f10) {
        e();
        int i10 = this.f20071c;
        float[] fArr = this.f20070b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f20070b = fArr2;
        }
        float[] fArr3 = this.f20070b;
        int i11 = this.f20071c;
        this.f20071c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        e();
        if (i10 >= 0 && i10 <= (i11 = this.f20071c)) {
            float[] fArr = this.f20070b;
            if (i11 < fArr.length) {
                System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
            } else {
                float[] fArr2 = new float[((i11 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i10);
                System.arraycopy(this.f20070b, i10, fArr2, i10 + 1, this.f20071c - i10);
                this.f20070b = fArr2;
            }
            this.f20070b[i10] = floatValue;
            this.f20071c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(d(i10));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        e();
        Charset charset = z.f20078a;
        collection.getClass();
        if (!(collection instanceof w)) {
            return super.addAll(collection);
        }
        w wVar = (w) collection;
        int i10 = wVar.f20071c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f20071c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f20070b;
            if (i12 > fArr.length) {
                this.f20070b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(wVar.f20070b, 0, this.f20070b, this.f20071c, wVar.f20071c);
            this.f20071c = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void c(int i10) {
        if (i10 < 0 || i10 >= this.f20071c) {
            throw new IndexOutOfBoundsException(d(i10));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final String d(int i10) {
        return "Index:" + i10 + ", Size:" + this.f20071c;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z.j
    /* renamed from: e */
    public z.f b(int i10) {
        if (i10 >= this.f20071c) {
            return new w(Arrays.copyOf(this.f20070b, i10), this.f20071c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return super.equals(obj);
        }
        w wVar = (w) obj;
        if (this.f20071c != wVar.f20071c) {
            return false;
        }
        float[] fArr = wVar.f20070b;
        for (int i10 = 0; i10 < this.f20071c; i10++) {
            if (Float.floatToIntBits(this.f20070b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        c(i10);
        return Float.valueOf(this.f20070b[i10]);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f20071c; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f20070b[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i10 = this.f20071c;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f20070b[i11] == floatValue) {
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
        float[] fArr = this.f20070b;
        float f10 = fArr[i10];
        if (i10 < this.f20071c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f20071c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        e();
        if (i11 >= i10) {
            float[] fArr = this.f20070b;
            System.arraycopy(fArr, i11, fArr, i10, this.f20071c - i11);
            this.f20071c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        e();
        c(i10);
        float[] fArr = this.f20070b;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f20071c;
    }

    public w(float[] fArr, int i10) {
        this.f20070b = fArr;
        this.f20071c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        a(((Float) obj).floatValue());
        return true;
    }
}
