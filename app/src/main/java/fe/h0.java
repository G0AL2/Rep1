package fe;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Maps.kt */
/* loaded from: classes3.dex */
public class h0 extends g0 {
    public static <K, V> Map<K, V> g() {
        a0 a0Var = a0.f30316a;
        qe.k.d(a0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return a0Var;
    }

    public static <K, V> V h(Map<K, ? extends V> map, K k10) {
        qe.k.f(map, "<this>");
        return (V) f0.a(map, k10);
    }

    public static <K, V> Map<K, V> i(Pair<? extends K, ? extends V>... pairArr) {
        qe.k.f(pairArr, "pairs");
        return pairArr.length > 0 ? q(pairArr, new LinkedHashMap(e0.d(pairArr.length))) : e0.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> j(Map<K, ? extends V> map) {
        qe.k.f(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : g0.f(map);
        }
        return e0.g();
    }

    public static <K, V> Map<K, V> k(Map<? extends K, ? extends V> map, ee.m<? extends K, ? extends V> mVar) {
        qe.k.f(map, "<this>");
        qe.k.f(mVar, "pair");
        if (map.isEmpty()) {
            return e0.e(mVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(mVar.c(), mVar.d());
        return linkedHashMap;
    }

    public static final <K, V> void l(Map<? super K, ? super V> map, Iterable<? extends ee.m<? extends K, ? extends V>> iterable) {
        qe.k.f(map, "<this>");
        qe.k.f(iterable, "pairs");
        for (ee.m<? extends K, ? extends V> mVar : iterable) {
            map.put((K) mVar.a(), (V) mVar.b());
        }
    }

    public static final <K, V> void m(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairArr) {
        qe.k.f(map, "<this>");
        qe.k.f(pairArr, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            map.put((Object) pair.a(), (Object) pair.b());
        }
    }

    public static <K, V> Map<K, V> n(Iterable<? extends ee.m<? extends K, ? extends V>> iterable) {
        qe.k.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return o(iterable, new LinkedHashMap(e0.d(collection.size())));
                }
                return e0.e(iterable instanceof List ? (ee.m<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
            }
            return e0.g();
        }
        return j(o(iterable, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M o(Iterable<? extends ee.m<? extends K, ? extends V>> iterable, M m10) {
        qe.k.f(iterable, "<this>");
        qe.k.f(m10, "destination");
        l(m10, iterable);
        return m10;
    }

    public static <K, V> Map<K, V> p(Map<? extends K, ? extends V> map) {
        qe.k.f(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return e0.r(map);
            }
            return g0.f(map);
        }
        return e0.g();
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M q(Pair<? extends K, ? extends V>[] pairArr, M m10) {
        qe.k.f(pairArr, "<this>");
        qe.k.f(m10, "destination");
        m(m10, pairArr);
        return m10;
    }

    public static <K, V> Map<K, V> r(Map<? extends K, ? extends V> map) {
        qe.k.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
