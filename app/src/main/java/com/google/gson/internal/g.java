package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* compiled from: LinkedTreeMap.java */
/* loaded from: classes3.dex */
public final class g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    private static final Comparator<Comparable> f23859h = new a();

    /* renamed from: a  reason: collision with root package name */
    Comparator<? super K> f23860a;

    /* renamed from: b  reason: collision with root package name */
    e<K, V> f23861b;

    /* renamed from: c  reason: collision with root package name */
    int f23862c;

    /* renamed from: d  reason: collision with root package name */
    int f23863d;

    /* renamed from: e  reason: collision with root package name */
    final e<K, V> f23864e;

    /* renamed from: f  reason: collision with root package name */
    private g<K, V>.b f23865f;

    /* renamed from: g  reason: collision with root package name */
    private g<K, V>.c f23866g;

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes3.dex */
    static class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes3.dex */
    class b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap.java */
        /* loaded from: classes3.dex */
        class a extends g<K, V>.d<Map.Entry<K, V>> {
            a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: c */
            public Map.Entry<K, V> next() {
                return b();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && g.this.d((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> d10;
            if ((obj instanceof Map.Entry) && (d10 = g.this.d((Map.Entry) obj)) != null) {
                g.this.g(d10, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f23862c;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes3.dex */
    final class c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap.java */
        /* loaded from: classes3.dex */
        class a extends g<K, V>.d<K> {
            a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return b().f23878f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return g.this.h(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f23862c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes3.dex */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        e<K, V> f23869a;

        /* renamed from: b  reason: collision with root package name */
        e<K, V> f23870b = null;

        /* renamed from: c  reason: collision with root package name */
        int f23871c;

        d() {
            this.f23869a = g.this.f23864e.f23876d;
            this.f23871c = g.this.f23863d;
        }

        final e<K, V> b() {
            e<K, V> eVar = this.f23869a;
            g gVar = g.this;
            if (eVar != gVar.f23864e) {
                if (gVar.f23863d == this.f23871c) {
                    this.f23869a = eVar.f23876d;
                    this.f23870b = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f23869a != g.this.f23864e;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f23870b;
            if (eVar != null) {
                g.this.g(eVar, true);
                this.f23870b = null;
                this.f23871c = g.this.f23863d;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public g() {
        this(f23859h);
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void f(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f23874b;
            e<K, V> eVar3 = eVar.f23875c;
            int i10 = eVar2 != null ? eVar2.f23880h : 0;
            int i11 = eVar3 != null ? eVar3.f23880h : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f23874b;
                e<K, V> eVar5 = eVar3.f23875c;
                int i13 = (eVar4 != null ? eVar4.f23880h : 0) - (eVar5 != null ? eVar5.f23880h : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    k(eVar3);
                    j(eVar);
                } else {
                    j(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f23874b;
                e<K, V> eVar7 = eVar2.f23875c;
                int i14 = (eVar6 != null ? eVar6.f23880h : 0) - (eVar7 != null ? eVar7.f23880h : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    j(eVar2);
                    k(eVar);
                } else {
                    k(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f23880h = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f23880h = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f23873a;
        }
    }

    private void i(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f23873a;
        eVar.f23873a = null;
        if (eVar2 != null) {
            eVar2.f23873a = eVar3;
        }
        if (eVar3 != null) {
            if (eVar3.f23874b == eVar) {
                eVar3.f23874b = eVar2;
                return;
            } else {
                eVar3.f23875c = eVar2;
                return;
            }
        }
        this.f23861b = eVar2;
    }

    private void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f23874b;
        e<K, V> eVar3 = eVar.f23875c;
        e<K, V> eVar4 = eVar3.f23874b;
        e<K, V> eVar5 = eVar3.f23875c;
        eVar.f23875c = eVar4;
        if (eVar4 != null) {
            eVar4.f23873a = eVar;
        }
        i(eVar, eVar3);
        eVar3.f23874b = eVar;
        eVar.f23873a = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.f23880h : 0, eVar4 != null ? eVar4.f23880h : 0) + 1;
        eVar.f23880h = max;
        eVar3.f23880h = Math.max(max, eVar5 != null ? eVar5.f23880h : 0) + 1;
    }

    private void k(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f23874b;
        e<K, V> eVar3 = eVar.f23875c;
        e<K, V> eVar4 = eVar2.f23874b;
        e<K, V> eVar5 = eVar2.f23875c;
        eVar.f23874b = eVar5;
        if (eVar5 != null) {
            eVar5.f23873a = eVar;
        }
        i(eVar, eVar2);
        eVar2.f23875c = eVar;
        eVar.f23873a = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.f23880h : 0, eVar5 != null ? eVar5.f23880h : 0) + 1;
        eVar.f23880h = max;
        eVar2.f23880h = Math.max(max, eVar4 != null ? eVar4.f23880h : 0) + 1;
    }

    e<K, V> c(K k10, boolean z10) {
        int i10;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f23860a;
        e<K, V> eVar2 = this.f23861b;
        if (eVar2 != null) {
            Comparable comparable = comparator == f23859h ? (Comparable) k10 : null;
            while (true) {
                if (comparable != null) {
                    i10 = comparable.compareTo(eVar2.f23878f);
                } else {
                    i10 = comparator.compare(k10, (K) eVar2.f23878f);
                }
                if (i10 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i10 < 0 ? eVar2.f23874b : eVar2.f23875c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i10 = 0;
        }
        if (z10) {
            e<K, V> eVar4 = this.f23864e;
            if (eVar2 == null) {
                if (comparator == f23859h && !(k10 instanceof Comparable)) {
                    throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
                }
                eVar = new e<>(eVar2, k10, eVar4, eVar4.f23877e);
                this.f23861b = eVar;
            } else {
                eVar = new e<>(eVar2, k10, eVar4, eVar4.f23877e);
                if (i10 < 0) {
                    eVar2.f23874b = eVar;
                } else {
                    eVar2.f23875c = eVar;
                }
                f(eVar2, true);
            }
            this.f23862c++;
            this.f23863d++;
            return eVar;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f23861b = null;
        this.f23862c = 0;
        this.f23863d++;
        e<K, V> eVar = this.f23864e;
        eVar.f23877e = eVar;
        eVar.f23876d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return e(obj) != null;
    }

    e<K, V> d(Map.Entry<?, ?> entry) {
        e<K, V> e10 = e(entry.getKey());
        if (e10 != null && a(e10.f23879g, entry.getValue())) {
            return e10;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> e(Object obj) {
        if (obj != 0) {
            try {
                return c(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        g<K, V>.b bVar = this.f23865f;
        if (bVar != null) {
            return bVar;
        }
        g<K, V>.b bVar2 = new b();
        this.f23865f = bVar2;
        return bVar2;
    }

    void g(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.f23877e;
            eVar2.f23876d = eVar.f23876d;
            eVar.f23876d.f23877e = eVar2;
        }
        e<K, V> eVar3 = eVar.f23874b;
        e<K, V> eVar4 = eVar.f23875c;
        e<K, V> eVar5 = eVar.f23873a;
        int i11 = 0;
        if (eVar3 != null && eVar4 != null) {
            e<K, V> b10 = eVar3.f23880h > eVar4.f23880h ? eVar3.b() : eVar4.a();
            g(b10, false);
            e<K, V> eVar6 = eVar.f23874b;
            if (eVar6 != null) {
                i10 = eVar6.f23880h;
                b10.f23874b = eVar6;
                eVar6.f23873a = b10;
                eVar.f23874b = null;
            } else {
                i10 = 0;
            }
            e<K, V> eVar7 = eVar.f23875c;
            if (eVar7 != null) {
                i11 = eVar7.f23880h;
                b10.f23875c = eVar7;
                eVar7.f23873a = b10;
                eVar.f23875c = null;
            }
            b10.f23880h = Math.max(i10, i11) + 1;
            i(eVar, b10);
            return;
        }
        if (eVar3 != null) {
            i(eVar, eVar3);
            eVar.f23874b = null;
        } else if (eVar4 != null) {
            i(eVar, eVar4);
            eVar.f23875c = null;
        } else {
            i(eVar, null);
        }
        f(eVar5, false);
        this.f23862c--;
        this.f23863d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> e10 = e(obj);
        if (e10 != null) {
            return e10.f23879g;
        }
        return null;
    }

    e<K, V> h(Object obj) {
        e<K, V> e10 = e(obj);
        if (e10 != null) {
            g(e10, true);
        }
        return e10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        g<K, V>.c cVar = this.f23866g;
        if (cVar != null) {
            return cVar;
        }
        g<K, V>.c cVar2 = new c();
        this.f23866g = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        Objects.requireNonNull(k10, "key == null");
        e<K, V> c10 = c(k10, true);
        V v11 = c10.f23879g;
        c10.f23879g = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> h10 = h(obj);
        if (h10 != null) {
            return h10.f23879g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f23862c;
    }

    public g(Comparator<? super K> comparator) {
        this.f23862c = 0;
        this.f23863d = 0;
        this.f23864e = new e<>();
        this.f23860a = comparator == null ? f23859h : comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes3.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        e<K, V> f23873a;

        /* renamed from: b  reason: collision with root package name */
        e<K, V> f23874b;

        /* renamed from: c  reason: collision with root package name */
        e<K, V> f23875c;

        /* renamed from: d  reason: collision with root package name */
        e<K, V> f23876d;

        /* renamed from: e  reason: collision with root package name */
        e<K, V> f23877e;

        /* renamed from: f  reason: collision with root package name */
        final K f23878f;

        /* renamed from: g  reason: collision with root package name */
        V f23879g;

        /* renamed from: h  reason: collision with root package name */
        int f23880h;

        e() {
            this.f23878f = null;
            this.f23877e = this;
            this.f23876d = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f23874b; eVar2 != null; eVar2 = eVar2.f23874b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f23875c; eVar2 != null; eVar2 = eVar2.f23875c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f23878f;
                if (k10 == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k10.equals(entry.getKey())) {
                    return false;
                }
                V v10 = this.f23879g;
                if (v10 == null) {
                    if (entry.getValue() != null) {
                        return false;
                    }
                } else if (!v10.equals(entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f23878f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f23879g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f23878f;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f23879g;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f23879g;
            this.f23879g = v10;
            return v11;
        }

        public String toString() {
            return this.f23878f + "=" + this.f23879g;
        }

        e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f23873a = eVar;
            this.f23878f = k10;
            this.f23880h = 1;
            this.f23876d = eVar2;
            this.f23877e = eVar3;
            eVar3.f23876d = this;
            eVar2.f23877e = this;
        }
    }
}
