package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.z;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class e0 extends c<String> implements f0, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    public final List<Object> f19861b;

    static {
        new e0(10).f19843a = false;
    }

    public e0(int i10) {
        this(new ArrayList(i10));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f0
    public f0 a() {
        return this.f19843a ? new p1(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        e();
        this.f19861b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(this.f19861b.size(), collection);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z.j
    public z.j b(int i10) {
        if (i10 >= this.f19861b.size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f19861b);
            return new e0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f0
    public List<?> c() {
        return Collections.unmodifiableList(this.f19861b);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        e();
        this.f19861b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        String str;
        Object obj = this.f19861b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            str = iVar.i();
            if (iVar.e()) {
                this.f19861b.set(i10, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, z.f20078a);
            if (s1.a(bArr)) {
                this.f19861b.set(i10, str);
            }
        }
        return str;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        e();
        Object remove = this.f19861b.remove(i10);
        ((AbstractList) this).modCount++;
        return a(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        e();
        return a(this.f19861b.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19861b.size();
    }

    public e0(ArrayList<Object> arrayList) {
        this.f19861b = arrayList;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f0
    public void a(i iVar) {
        e();
        this.f19861b.add(iVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        e();
        if (collection instanceof f0) {
            collection = ((f0) collection).c();
        }
        boolean addAll = this.f19861b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f0
    public Object a(int i10) {
        return this.f19861b.get(i10);
    }

    public static String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof i) {
            return ((i) obj).i();
        }
        return new String((byte[]) obj, z.f20078a);
    }
}
