package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.z;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class c<E> extends AbstractList<E> implements z.j<E> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f19843a = true;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        e();
        return super.add(e10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        e();
        return super.addAll(collection);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z.j
    public final void b() {
        this.f19843a = false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        e();
        super.clear();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z.j
    public boolean d() {
        return this.f19843a;
    }

    public void e() {
        if (!this.f19843a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (!(obj instanceof RandomAccess)) {
                return super.equals(obj);
            }
            List list = (List) obj;
            int size = size();
            if (size != list.size()) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (!get(i10).equals(list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract E remove(int i10);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        e();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        e();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        e();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        e();
        return super.addAll(i10, collection);
    }
}
