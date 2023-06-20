package w7;

import javax.inject.Provider;

/* compiled from: TransportRuntime_Factory.java */
/* loaded from: classes2.dex */
public final class v implements z7.b<t> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<h8.a> f38315a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<h8.a> f38316b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<d8.e> f38317c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<e8.p> f38318d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<e8.t> f38319e;

    public v(Provider<h8.a> provider, Provider<h8.a> provider2, Provider<d8.e> provider3, Provider<e8.p> provider4, Provider<e8.t> provider5) {
        this.f38315a = provider;
        this.f38316b = provider2;
        this.f38317c = provider3;
        this.f38318d = provider4;
        this.f38319e = provider5;
    }

    public static v a(Provider<h8.a> provider, Provider<h8.a> provider2, Provider<d8.e> provider3, Provider<e8.p> provider4, Provider<e8.t> provider5) {
        return new v(provider, provider2, provider3, provider4, provider5);
    }

    public static t c(h8.a aVar, h8.a aVar2, d8.e eVar, e8.p pVar, e8.t tVar) {
        return new t(aVar, aVar2, eVar, pVar, tVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public t get() {
        return c(this.f38315a.get(), this.f38316b.get(), this.f38317c.get(), this.f38318d.get(), this.f38319e.get());
    }
}
