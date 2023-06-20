package jb;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import jb.a0;
import jb.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractMapBasedMultimap.java */
/* loaded from: classes3.dex */
public abstract class d<K, V> extends jb.f<K, V> implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    private transient Map<K, Collection<V>> f32947e;

    /* renamed from: f  reason: collision with root package name */
    private transient int f32948f;

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes3.dex */
    class a extends d<K, V>.AbstractC0417d<V> {
        a(d dVar) {
            super();
        }

        @Override // jb.d.AbstractC0417d
        V a(K k10, V v10) {
            return v10;
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes3.dex */
    class b extends d<K, V>.AbstractC0417d<Map.Entry<K, V>> {
        b(d dVar) {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // jb.d.AbstractC0417d
        /* renamed from: b */
        public Map.Entry<K, V> a(K k10, V v10) {
            return a0.d(k10, v10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes3.dex */
    public class c extends a0.f<K, Collection<V>> {

        /* renamed from: c  reason: collision with root package name */
        final transient Map<K, Collection<V>> f32949c;

        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: classes3.dex */
        class a extends a0.c<K, Collection<V>> {
            a() {
            }

            @Override // jb.a0.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return jb.i.c(c.this.f32949c.entrySet(), obj);
            }

            @Override // jb.a0.c
            Map<K, Collection<V>> e() {
                return c.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (contains(obj)) {
                    Map.Entry entry = (Map.Entry) obj;
                    Objects.requireNonNull(entry);
                    d.this.w(entry.getKey());
                    return true;
                }
                return false;
            }
        }

        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: classes3.dex */
        class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a  reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f32952a;

            /* renamed from: b  reason: collision with root package name */
            Collection<V> f32953b;

            b() {
                this.f32952a = c.this.f32949c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f32952a.next();
                this.f32953b = next.getValue();
                return c.this.f(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f32952a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                ib.l.p(this.f32953b != null, "no calls to next() since the last call to remove()");
                this.f32952a.remove();
                d.p(d.this, this.f32953b.size());
                this.f32953b.clear();
                this.f32953b = null;
            }
        }

        c(Map<K, Collection<V>> map) {
            this.f32949c = map;
        }

        @Override // jb.a0.f
        protected Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f32949c == d.this.f32947e) {
                d.this.clear();
            } else {
                w.d(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return a0.f(this.f32949c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) a0.g(this.f32949c, obj);
            if (collection == null) {
                return null;
            }
            return d.this.y(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: e */
        public Collection<V> remove(Object obj) {
            Collection<V> remove = this.f32949c.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> r10 = d.this.r();
            r10.addAll(remove);
            d.p(d.this, remove.size());
            remove.clear();
            return r10;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f32949c.equals(obj);
        }

        Map.Entry<K, Collection<V>> f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return a0.d(key, d.this.y(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f32949c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return d.this.i();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f32949c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f32949c.toString();
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: jb.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private abstract class AbstractC0417d<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f32955a;

        /* renamed from: b  reason: collision with root package name */
        K f32956b = null;

        /* renamed from: c  reason: collision with root package name */
        Collection<V> f32957c = null;

        /* renamed from: d  reason: collision with root package name */
        Iterator<V> f32958d = w.g();

        AbstractC0417d() {
            this.f32955a = (Iterator<Map.Entry<K, V>>) d.this.f32947e.entrySet().iterator();
        }

        abstract T a(K k10, V v10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f32955a.hasNext() || this.f32958d.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f32958d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f32955a.next();
                this.f32956b = next.getKey();
                Collection<V> value = next.getValue();
                this.f32957c = value;
                this.f32958d = value.iterator();
            }
            return a(g0.a(this.f32956b), this.f32958d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f32958d.remove();
            Collection<V> collection = this.f32957c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f32955a.remove();
            }
            d.n(d.this);
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes3.dex */
    private class e extends a0.d<K, Collection<V>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: classes3.dex */
        public class a implements Iterator<K> {

            /* renamed from: a  reason: collision with root package name */
            Map.Entry<K, Collection<V>> f32961a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Iterator f32962b;

            a(Iterator it) {
                this.f32962b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f32962b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f32962b.next();
                this.f32961a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                ib.l.p(this.f32961a != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f32961a.getValue();
                this.f32962b.remove();
                d.p(d.this, value.size());
                value.clear();
                this.f32961a = null;
            }
        }

        e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            w.d(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return e().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || e().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return e().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(e().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i10;
            Collection<V> remove = e().remove(obj);
            if (remove != null) {
                i10 = remove.size();
                remove.clear();
                d.p(d.this, i10);
            } else {
                i10 = 0;
            }
            return i10 > 0;
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes3.dex */
    class f extends d<K, V>.i implements NavigableMap<K, Collection<V>> {
        f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> ceilingEntry = i().ceilingEntry(k10);
            if (ceilingEntry == null) {
                return null;
            }
            return f(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return i().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(i().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = i().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return f(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> floorEntry = i().floorEntry(k10);
            if (floorEntry == null) {
                return null;
            }
            return f(floorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return i().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> higherEntry = i().higherEntry(k10);
            if (higherEntry == null) {
                return null;
            }
            return f(higherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return i().higherKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // jb.d.i
        /* renamed from: j */
        public NavigableSet<K> g() {
            return new g(i());
        }

        @Override // jb.d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: k */
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // jb.d.i, jb.d.c, java.util.AbstractMap, java.util.Map
        /* renamed from: l */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = i().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return f(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> lowerEntry = i().lowerEntry(k10);
            if (lowerEntry == null) {
                return null;
            }
            return f(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return i().lowerKey(k10);
        }

        Map.Entry<K, Collection<V>> m(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (it.hasNext()) {
                Map.Entry<K, Collection<V>> next = it.next();
                Collection<V> r10 = d.this.r();
                r10.addAll(next.getValue());
                it.remove();
                return a0.d(next.getKey(), d.this.x(r10));
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // jb.d.i
        /* renamed from: n */
        public NavigableMap<K, Collection<V>> i() {
            return (NavigableMap) super.i();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        @Override // jb.d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: o */
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // jb.d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: p */
        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return m(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new f(i().headMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new f(i().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new f(i().tailMap(k10, z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes3.dex */
    public class g extends d<K, V>.j implements NavigableSet<K> {
        g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k10) {
            return f().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(f().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(K k10) {
            return f().floorKey(k10);
        }

        @Override // jb.d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: g */
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // jb.d.j
        /* renamed from: h */
        public NavigableMap<K, Collection<V>> f() {
            return (NavigableMap) super.f();
        }

        @Override // java.util.NavigableSet
        public K higher(K k10) {
            return f().higherKey(k10);
        }

        @Override // jb.d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: i */
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // jb.d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: j */
        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        @Override // java.util.NavigableSet
        public K lower(K k10) {
            return f().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) w.n(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) w.n(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new g(f().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new g(f().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new g(f().tailMap(k10, z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes3.dex */
    public class h extends d<K, V>.l implements RandomAccess {
        h(d dVar, K k10, List<V> list, d<K, V>.k kVar) {
            super(k10, list, kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes3.dex */
    public class i extends d<K, V>.c implements SortedMap<K, Collection<V>> {

        /* renamed from: e  reason: collision with root package name */
        SortedSet<K> f32966e;

        i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return i().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return i().firstKey();
        }

        SortedSet<K> g() {
            return new j(i());
        }

        @Override // jb.d.c, java.util.AbstractMap, java.util.Map
        /* renamed from: h */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f32966e;
            if (sortedSet == null) {
                SortedSet<K> g10 = g();
                this.f32966e = g10;
                return g10;
            }
            return sortedSet;
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new i(i().headMap(k10));
        }

        SortedMap<K, Collection<V>> i() {
            return (SortedMap) this.f32949c;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return i().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new i(i().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new i(i().tailMap(k10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes3.dex */
    public class j extends d<K, V>.e implements SortedSet<K> {
        j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return f().comparator();
        }

        SortedMap<K, Collection<V>> f() {
            return (SortedMap) super.e();
        }

        @Override // java.util.SortedSet
        public K first() {
            return f().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new j(f().headMap(k10));
        }

        @Override // java.util.SortedSet
        public K last() {
            return f().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new j(f().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new j(f().tailMap(k10));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Map<K, Collection<V>> map) {
        ib.l.d(map.isEmpty());
        this.f32947e = map;
    }

    static /* synthetic */ int m(d dVar) {
        int i10 = dVar.f32948f;
        dVar.f32948f = i10 + 1;
        return i10;
    }

    static /* synthetic */ int n(d dVar) {
        int i10 = dVar.f32948f;
        dVar.f32948f = i10 - 1;
        return i10;
    }

    static /* synthetic */ int o(d dVar, int i10) {
        int i11 = dVar.f32948f + i10;
        dVar.f32948f = i11;
        return i11;
    }

    static /* synthetic */ int p(d dVar, int i10) {
        int i11 = dVar.f32948f - i10;
        dVar.f32948f = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> v(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(Object obj) {
        Collection collection = (Collection) a0.h(this.f32947e, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f32948f -= size;
        }
    }

    @Override // jb.f, jb.b0
    public Collection<Map.Entry<K, V>> a() {
        return super.a();
    }

    @Override // jb.b0
    public void clear() {
        for (Collection<V> collection : this.f32947e.values()) {
            collection.clear();
        }
        this.f32947e.clear();
        this.f32948f = 0;
    }

    @Override // jb.f
    Collection<Map.Entry<K, V>> e() {
        return new f.a();
    }

    @Override // jb.f
    Collection<V> g() {
        return new f.b();
    }

    @Override // jb.b0
    public Collection<V> get(K k10) {
        Collection<V> collection = this.f32947e.get(k10);
        if (collection == null) {
            collection = s(k10);
        }
        return y(k10, collection);
    }

    @Override // jb.f
    Iterator<Map.Entry<K, V>> h() {
        return new b(this);
    }

    @Override // jb.f
    Iterator<V> j() {
        return new a(this);
    }

    @Override // jb.b0
    public boolean put(K k10, V v10) {
        Collection<V> collection = this.f32947e.get(k10);
        if (collection == null) {
            Collection<V> s10 = s(k10);
            if (s10.add(v10)) {
                this.f32948f++;
                this.f32947e.put(k10, s10);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(v10)) {
            this.f32948f++;
            return true;
        } else {
            return false;
        }
    }

    abstract Collection<V> r();

    Collection<V> s(K k10) {
        return r();
    }

    @Override // jb.b0
    public int size() {
        return this.f32948f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<K, Collection<V>> t() {
        Map<K, Collection<V>> map = this.f32947e;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap) this.f32947e);
        }
        if (map instanceof SortedMap) {
            return new i((SortedMap) this.f32947e);
        }
        return new c(this.f32947e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<K> u() {
        Map<K, Collection<V>> map = this.f32947e;
        if (map instanceof NavigableMap) {
            return new g((NavigableMap) this.f32947e);
        }
        if (map instanceof SortedMap) {
            return new j((SortedMap) this.f32947e);
        }
        return new e(this.f32947e);
    }

    @Override // jb.f, jb.b0
    public Collection<V> values() {
        return super.values();
    }

    abstract <E> Collection<E> x(Collection<E> collection);

    abstract Collection<V> y(K k10, Collection<V> collection);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<V> z(K k10, List<V> list, d<K, V>.k kVar) {
        if (list instanceof RandomAccess) {
            return new h(this, k10, list, kVar);
        }
        return new l(k10, list, kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes3.dex */
    public class k extends AbstractCollection<V> {

        /* renamed from: a  reason: collision with root package name */
        final K f32969a;

        /* renamed from: b  reason: collision with root package name */
        Collection<V> f32970b;

        /* renamed from: c  reason: collision with root package name */
        final d<K, V>.k f32971c;

        /* renamed from: d  reason: collision with root package name */
        final Collection<V> f32972d;

        k(K k10, Collection<V> collection, d<K, V>.k kVar) {
            this.f32969a = k10;
            this.f32970b = collection;
            this.f32971c = kVar;
            this.f32972d = kVar == null ? null : kVar.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v10) {
            i();
            boolean isEmpty = this.f32970b.isEmpty();
            boolean add = this.f32970b.add(v10);
            if (add) {
                d.m(d.this);
                if (isEmpty) {
                    e();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f32970b.addAll(collection);
            if (addAll) {
                d.o(d.this, this.f32970b.size() - size);
                if (size == 0) {
                    e();
                }
            }
            return addAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f32970b.clear();
            d.p(d.this, size);
            j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            i();
            return this.f32970b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            i();
            return this.f32970b.containsAll(collection);
        }

        void e() {
            d<K, V>.k kVar = this.f32971c;
            if (kVar == null) {
                d.this.f32947e.put(this.f32969a, this.f32970b);
            } else {
                kVar.e();
            }
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            i();
            return this.f32970b.equals(obj);
        }

        d<K, V>.k f() {
            return this.f32971c;
        }

        Collection<V> g() {
            return this.f32970b;
        }

        K h() {
            return this.f32969a;
        }

        @Override // java.util.Collection
        public int hashCode() {
            i();
            return this.f32970b.hashCode();
        }

        void i() {
            Collection<V> collection;
            d<K, V>.k kVar = this.f32971c;
            if (kVar != null) {
                kVar.i();
                if (this.f32971c.g() != this.f32972d) {
                    throw new ConcurrentModificationException();
                }
            } else if (!this.f32970b.isEmpty() || (collection = (Collection) d.this.f32947e.get(this.f32969a)) == null) {
            } else {
                this.f32970b = collection;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            i();
            return new a();
        }

        void j() {
            d<K, V>.k kVar = this.f32971c;
            if (kVar != null) {
                kVar.j();
            } else if (this.f32970b.isEmpty()) {
                d.this.f32947e.remove(this.f32969a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            i();
            boolean remove = this.f32970b.remove(obj);
            if (remove) {
                d.n(d.this);
                j();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f32970b.removeAll(collection);
            if (removeAll) {
                d.o(d.this, this.f32970b.size() - size);
                j();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            ib.l.j(collection);
            int size = size();
            boolean retainAll = this.f32970b.retainAll(collection);
            if (retainAll) {
                d.o(d.this, this.f32970b.size() - size);
                j();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            i();
            return this.f32970b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            i();
            return this.f32970b.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: classes3.dex */
        public class a implements Iterator<V> {

            /* renamed from: a  reason: collision with root package name */
            final Iterator<V> f32974a;

            /* renamed from: b  reason: collision with root package name */
            final Collection<V> f32975b;

            a() {
                Collection<V> collection = k.this.f32970b;
                this.f32975b = collection;
                this.f32974a = d.v(collection);
            }

            Iterator<V> b() {
                c();
                return this.f32974a;
            }

            void c() {
                k.this.i();
                if (k.this.f32970b != this.f32975b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                c();
                return this.f32974a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                c();
                return this.f32974a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f32974a.remove();
                d.n(d.this);
                k.this.j();
            }

            a(Iterator<V> it) {
                this.f32975b = k.this.f32970b;
                this.f32974a = it;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes3.dex */
    public class l extends d<K, V>.k implements List<V> {

        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: classes3.dex */
        private class a extends d<K, V>.k.a implements ListIterator<V> {
            a() {
                super();
            }

            private ListIterator<V> d() {
                return (ListIterator) b();
            }

            @Override // java.util.ListIterator
            public void add(V v10) {
                boolean isEmpty = l.this.isEmpty();
                d().add(v10);
                d.m(d.this);
                if (isEmpty) {
                    l.this.e();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return d().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return d().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return d().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return d().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v10) {
                d().set(v10);
            }

            public a(int i10) {
                super(l.this.k().listIterator(i10));
            }
        }

        l(K k10, List<V> list, d<K, V>.k kVar) {
            super(k10, list, kVar);
        }

        @Override // java.util.List
        public void add(int i10, V v10) {
            i();
            boolean isEmpty = g().isEmpty();
            k().add(i10, v10);
            d.m(d.this);
            if (isEmpty) {
                e();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = k().addAll(i10, collection);
            if (addAll) {
                d.o(d.this, g().size() - size);
                if (size == 0) {
                    e();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public V get(int i10) {
            i();
            return k().get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            i();
            return k().indexOf(obj);
        }

        List<V> k() {
            return (List) g();
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            i();
            return k().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            i();
            return new a();
        }

        @Override // java.util.List
        public V remove(int i10) {
            i();
            V remove = k().remove(i10);
            d.n(d.this);
            j();
            return remove;
        }

        @Override // java.util.List
        public V set(int i10, V v10) {
            i();
            return k().set(i10, v10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            i();
            return d.this.z(h(), k().subList(i10, i11), f() == null ? this : f());
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            i();
            return new a(i10);
        }
    }
}
