package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class c1<E> extends c<E> implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final c1<Object> f19846d;

    /* renamed from: b  reason: collision with root package name */
    public E[] f19847b;

    /* renamed from: c  reason: collision with root package name */
    public int f19848c;

    static {
        c1<Object> c1Var = new c1<>(new Object[0], 0);
        f19846d = c1Var;
        c1Var.f19843a = false;
    }

    public c1(E[] eArr, int i10) {
        this.f19847b = eArr;
        this.f19848c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        e();
        int i10 = this.f19848c;
        E[] eArr = this.f19847b;
        if (i10 == eArr.length) {
            this.f19847b = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f19847b;
        int i11 = this.f19848c;
        this.f19848c = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z.j
    public z.j b(int i10) {
        if (i10 >= this.f19848c) {
            return new c1(Arrays.copyOf(this.f19847b, i10), this.f19848c);
        }
        throw new IllegalArgumentException();
    }

    public final void c(int i10) {
        if (i10 < 0 || i10 >= this.f19848c) {
            throw new IndexOutOfBoundsException(d(i10));
        }
    }

    public final String d(int i10) {
        return "Index:" + i10 + ", Size:" + this.f19848c;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        c(i10);
        return this.f19847b[i10];
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public E remove(int i10) {
        int i11;
        e();
        c(i10);
        E[] eArr = this.f19847b;
        E e10 = eArr[i10];
        if (i10 < this.f19848c - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f19848c--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        e();
        c(i10);
        E[] eArr = this.f19847b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19848c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        e();
        if (i10 >= 0 && i10 <= (i11 = this.f19848c)) {
            E[] eArr = this.f19847b;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) new Object[((i11 * 3) / 2) + 1];
                System.arraycopy(eArr, 0, eArr2, 0, i10);
                System.arraycopy(this.f19847b, i10, eArr2, i10 + 1, this.f19848c - i10);
                this.f19847b = eArr2;
            }
            this.f19847b[i10] = e10;
            this.f19848c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(d(i10));
    }
}
