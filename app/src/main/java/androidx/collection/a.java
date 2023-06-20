package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ArrayMap.java */
/* loaded from: classes.dex */
public class a<K, V> extends g<K, V> implements Map<K, V> {

    /* renamed from: h  reason: collision with root package name */
    f<K, V> f1853h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArrayMap.java */
    /* renamed from: androidx.collection.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0042a extends f<K, V> {
        C0042a() {
        }

        @Override // androidx.collection.f
        protected void a() {
            a.this.clear();
        }

        @Override // androidx.collection.f
        protected Object b(int i10, int i11) {
            return a.this.f1894b[(i10 << 1) + i11];
        }

        @Override // androidx.collection.f
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // androidx.collection.f
        protected int d() {
            return a.this.f1895c;
        }

        @Override // androidx.collection.f
        protected int e(Object obj) {
            return a.this.g(obj);
        }

        @Override // androidx.collection.f
        protected int f(Object obj) {
            return a.this.i(obj);
        }

        @Override // androidx.collection.f
        protected void g(K k10, V v10) {
            a.this.put(k10, v10);
        }

        @Override // androidx.collection.f
        protected void h(int i10) {
            a.this.l(i10);
        }

        @Override // androidx.collection.f
        protected V i(int i10, V v10) {
            return a.this.m(i10, v10);
        }
    }

    public a() {
    }

    private f<K, V> o() {
        if (this.f1853h == null) {
            this.f1853h = new C0042a();
        }
        return this.f1853h;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return o().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return o().m();
    }

    public boolean p(Collection<?> collection) {
        return f.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        d(this.f1895c + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return o().n();
    }

    public a(int i10) {
        super(i10);
    }

    public a(g gVar) {
        super(gVar);
    }
}
