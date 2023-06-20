package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class p1 extends AbstractList<String> implements f0, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final f0 f19969a;

    /* loaded from: classes2.dex */
    public class a implements ListIterator<String> {

        /* renamed from: a  reason: collision with root package name */
        public ListIterator<String> f19970a;

        public a(p1 p1Var, int i10) {
            this.f19970a = p1Var.f19969a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f19970a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f19970a.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f19970a.next();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f19970a.nextIndex();
        }

        @Override // java.util.ListIterator
        public String previous() {
            return this.f19970a.previous();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f19970a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Iterator<String> {

        /* renamed from: a  reason: collision with root package name */
        public Iterator<String> f19971a;

        public b(p1 p1Var) {
            this.f19971a = p1Var.f19969a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19971a.hasNext();
        }

        @Override // java.util.Iterator
        public String next() {
            return this.f19971a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public p1(f0 f0Var) {
        this.f19969a = f0Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f0
    public f0 a() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f0
    public List<?> c() {
        return this.f19969a.c();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        return (String) this.f19969a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19969a.size();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f0
    public Object a(int i10) {
        return this.f19969a.a(i10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f0
    public void a(i iVar) {
        throw new UnsupportedOperationException();
    }
}
