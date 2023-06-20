package jb;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: AbstractListMultimap.java */
/* loaded from: classes3.dex */
abstract class c<K, V> extends d<K, V> implements x<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    public c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // jb.d, jb.b0
    /* renamed from: A */
    public List<V> get(K k10) {
        return (List) super.get(k10);
    }

    @Override // jb.f, jb.b0
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // jb.f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // jb.d, jb.b0
    public boolean put(K k10, V v10) {
        return super.put(k10, v10);
    }

    @Override // jb.d
    <E> Collection<E> x(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // jb.d
    Collection<V> y(K k10, Collection<V> collection) {
        return z(k10, (List) collection, null);
    }
}
