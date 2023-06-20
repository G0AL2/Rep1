package jb;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jb.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractMultimap.java */
/* loaded from: classes3.dex */
public abstract class f<K, V> implements b0<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private transient Collection<Map.Entry<K, V>> f32980a;

    /* renamed from: b  reason: collision with root package name */
    private transient Set<K> f32981b;

    /* renamed from: c  reason: collision with root package name */
    private transient Collection<V> f32982c;

    /* renamed from: d  reason: collision with root package name */
    private transient Map<K, Collection<V>> f32983d;

    /* compiled from: AbstractMultimap.java */
    /* loaded from: classes3.dex */
    class a extends d0.b<K, V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        @Override // jb.d0.b
        b0<K, V> e() {
            return f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return f.this.h();
        }
    }

    /* compiled from: AbstractMultimap.java */
    /* loaded from: classes3.dex */
    class b extends AbstractCollection<V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return f.this.c(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return f.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return f.this.size();
        }
    }

    @Override // jb.b0
    public Collection<Map.Entry<K, V>> a() {
        Collection<Map.Entry<K, V>> collection = this.f32980a;
        if (collection == null) {
            Collection<Map.Entry<K, V>> e10 = e();
            this.f32980a = e10;
            return e10;
        }
        return collection;
    }

    @Override // jb.b0
    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.f32983d;
        if (map == null) {
            Map<K, Collection<V>> d10 = d();
            this.f32983d = d10;
            return d10;
        }
        return map;
    }

    @Override // jb.b0
    public boolean b(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean c(Object obj) {
        for (Collection<V> collection : asMap().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Map<K, Collection<V>> d();

    abstract Collection<Map.Entry<K, V>> e();

    public boolean equals(Object obj) {
        return d0.a(this, obj);
    }

    abstract Set<K> f();

    abstract Collection<V> g();

    abstract Iterator<Map.Entry<K, V>> h();

    public int hashCode() {
        return asMap().hashCode();
    }

    public Set<K> i() {
        Set<K> set = this.f32981b;
        if (set == null) {
            Set<K> f10 = f();
            this.f32981b = f10;
            return f10;
        }
        return set;
    }

    abstract Iterator<V> j();

    @Override // jb.b0
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return asMap().toString();
    }

    @Override // jb.b0
    public Collection<V> values() {
        Collection<V> collection = this.f32982c;
        if (collection == null) {
            Collection<V> g10 = g();
            this.f32982c = g10;
            return g10;
        }
        return collection;
    }
}
