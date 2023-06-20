package jb;

import java.util.Collection;
import java.util.Map;

/* compiled from: Multimap.java */
/* loaded from: classes3.dex */
public interface b0<K, V> {
    Collection<Map.Entry<K, V>> a();

    Map<K, Collection<V>> asMap();

    boolean b(Object obj, Object obj2);

    void clear();

    Collection<V> get(K k10);

    boolean put(K k10, V v10);

    boolean remove(Object obj, Object obj2);

    int size();

    Collection<V> values();
}
