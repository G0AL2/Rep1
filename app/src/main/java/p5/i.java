package p5;

/* compiled from: CountingMemoryCache.java */
/* loaded from: classes.dex */
public interface i<K, V> extends s<K, V>, b4.b {

    /* compiled from: CountingMemoryCache.java */
    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f35549a;

        /* renamed from: b  reason: collision with root package name */
        public final c4.a<V> f35550b;

        /* renamed from: c  reason: collision with root package name */
        public int f35551c = 0;

        /* renamed from: d  reason: collision with root package name */
        public boolean f35552d = false;

        /* renamed from: e  reason: collision with root package name */
        public final b<K> f35553e;

        private a(K k10, c4.a<V> aVar, b<K> bVar) {
            this.f35549a = (K) y3.k.g(k10);
            this.f35550b = (c4.a) y3.k.g(c4.a.q(aVar));
            this.f35553e = bVar;
        }

        public static <K, V> a<K, V> a(K k10, c4.a<V> aVar, b<K> bVar) {
            return new a<>(k10, aVar, bVar);
        }
    }

    /* compiled from: CountingMemoryCache.java */
    /* loaded from: classes.dex */
    public interface b<K> {
        void a(K k10, boolean z10);
    }
}
