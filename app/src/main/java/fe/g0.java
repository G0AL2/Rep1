package fe;

import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapsJVM.kt */
/* loaded from: classes3.dex */
public class g0 extends f0 {
    public static <K, V> Map<K, V> b(Map<K, V> map) {
        qe.k.f(map, "builder");
        return ((ge.d) map).j();
    }

    public static <K, V> Map<K, V> c() {
        return new ge.d();
    }

    public static int d(int i10) {
        return i10 < 0 ? i10 : i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public static <K, V> Map<K, V> e(ee.m<? extends K, ? extends V> mVar) {
        qe.k.f(mVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(mVar.c(), mVar.d());
        qe.k.e(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> f(Map<? extends K, ? extends V> map) {
        qe.k.f(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        qe.k.e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
