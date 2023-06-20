package y3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ImmutableMap.java */
/* loaded from: classes.dex */
public class g<K, V> extends HashMap<K, V> {
    private g(Map<? extends K, ? extends V> map) {
        super(map);
    }

    public static <K, V> g<K, V> a(Map<? extends K, ? extends V> map) {
        return new g<>(map);
    }

    public static <K, V> Map<K, V> of(K k10, V v10) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(k10, v10);
        return Collections.unmodifiableMap(hashMap);
    }

    public static <K, V> Map<K, V> of(K k10, V v10, K k11, V v11) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(k10, v10);
        hashMap.put(k11, v11);
        return Collections.unmodifiableMap(hashMap);
    }
}
