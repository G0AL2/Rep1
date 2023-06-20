package jb;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ForwardingMap.java */
/* loaded from: classes3.dex */
public abstract class n<K, V> extends o implements Map<K, V> {
    protected abstract Map<K, V> c();

    @Override // java.util.Map
    public void clear() {
        c().clear();
    }

    public boolean containsKey(Object obj) {
        return c().containsKey(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean d(Object obj) {
        return a0.b(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean e(Object obj) {
        return a0.c(this, obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return c().entrySet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int f() {
        return q0.d(entrySet());
    }

    public V get(Object obj) {
        return c().get(obj);
    }

    public boolean isEmpty() {
        return c().isEmpty();
    }

    public Set<K> keySet() {
        return c().keySet();
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        return c().put(k10, v10);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c().putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return c().remove(obj);
    }

    public int size() {
        return c().size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return c().values();
    }
}
