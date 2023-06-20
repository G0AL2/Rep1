package h6;

import java.util.HashMap;
import java.util.Map;

/* compiled from: MapBuilder.java */
/* loaded from: classes.dex */
public class e {

    /* compiled from: MapBuilder.java */
    /* loaded from: classes.dex */
    public static final class b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private Map f31108a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f31109b;

        public Map<K, V> a() {
            if (this.f31109b) {
                this.f31109b = false;
                return this.f31108a;
            }
            throw new IllegalStateException("Underlying map has already been built");
        }

        public b<K, V> b(K k10, V v10) {
            if (this.f31109b) {
                this.f31108a.put(k10, v10);
                return this;
            }
            throw new IllegalStateException("Underlying map has already been built");
        }

        private b() {
            this.f31108a = e.b();
            this.f31109b = true;
        }
    }

    public static <K, V> b<K, V> a() {
        return new b<>();
    }

    public static <K, V> HashMap<K, V> b() {
        return new HashMap<>();
    }

    public static <K, V> Map<K, V> c() {
        return b();
    }

    public static <K, V> Map<K, V> d(K k10, V v10) {
        Map<K, V> c10 = c();
        c10.put(k10, v10);
        return c10;
    }

    public static <K, V> Map<K, V> e(K k10, V v10, K k11, V v11) {
        Map<K, V> c10 = c();
        c10.put(k10, v10);
        c10.put(k11, v11);
        return c10;
    }

    public static <K, V> Map<K, V> f(K k10, V v10, K k11, V v11, K k12, V v12) {
        Map<K, V> c10 = c();
        c10.put(k10, v10);
        c10.put(k11, v11);
        c10.put(k12, v12);
        return c10;
    }

    public static <K, V> Map<K, V> g(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        Map<K, V> c10 = c();
        c10.put(k10, v10);
        c10.put(k11, v11);
        c10.put(k12, v12);
        c10.put(k13, v13);
        return c10;
    }

    public static <K, V> Map<K, V> h(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        Map<K, V> c10 = c();
        c10.put(k10, v10);
        c10.put(k11, v11);
        c10.put(k12, v12);
        c10.put(k13, v13);
        c10.put(k14, v14);
        return c10;
    }

    public static <K, V> Map<K, V> i(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        Map<K, V> c10 = c();
        c10.put(k10, v10);
        c10.put(k11, v11);
        c10.put(k12, v12);
        c10.put(k13, v13);
        c10.put(k14, v14);
        c10.put(k15, v15);
        return c10;
    }
}
