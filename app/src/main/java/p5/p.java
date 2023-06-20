package p5;

/* compiled from: InstrumentedMemoryCache.java */
/* loaded from: classes.dex */
public class p<K, V> implements s<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final s<K, V> f35559a;

    /* renamed from: b  reason: collision with root package name */
    private final u f35560b;

    public p(s<K, V> sVar, u uVar) {
        this.f35559a = sVar;
        this.f35560b = uVar;
    }

    @Override // p5.s
    public void b(K k10) {
        this.f35559a.b(k10);
    }

    @Override // p5.s
    public int c(y3.l<K> lVar) {
        return this.f35559a.c(lVar);
    }

    @Override // p5.s
    public boolean d(y3.l<K> lVar) {
        return this.f35559a.d(lVar);
    }

    @Override // p5.s
    public c4.a<V> e(K k10, c4.a<V> aVar) {
        this.f35560b.c(k10);
        return this.f35559a.e(k10, aVar);
    }

    @Override // p5.s
    public c4.a<V> get(K k10) {
        c4.a<V> aVar = this.f35559a.get(k10);
        if (aVar == null) {
            this.f35560b.b(k10);
        } else {
            this.f35560b.a(k10);
        }
        return aVar;
    }
}
