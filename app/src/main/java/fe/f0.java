package fe;

import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapWithDefault.kt */
/* loaded from: classes3.dex */
public class f0 {
    public static final <K, V> V a(Map<K, ? extends V> map, K k10) {
        qe.k.f(map, "<this>");
        if (map instanceof d0) {
            return (V) ((d0) map).b(k10);
        }
        V v10 = map.get(k10);
        if (v10 != null || map.containsKey(k10)) {
            return v10;
        }
        throw new NoSuchElementException("Key " + k10 + " is missing in the map.");
    }
}
