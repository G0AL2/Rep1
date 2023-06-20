package f8;

import javax.inject.Provider;

/* compiled from: SQLiteEventStore_Factory.java */
/* loaded from: classes2.dex */
public final class n0 implements z7.b<m0> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<h8.a> f30158a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<h8.a> f30159b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<e> f30160c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<t0> f30161d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<String> f30162e;

    public n0(Provider<h8.a> provider, Provider<h8.a> provider2, Provider<e> provider3, Provider<t0> provider4, Provider<String> provider5) {
        this.f30158a = provider;
        this.f30159b = provider2;
        this.f30160c = provider3;
        this.f30161d = provider4;
        this.f30162e = provider5;
    }

    public static n0 a(Provider<h8.a> provider, Provider<h8.a> provider2, Provider<e> provider3, Provider<t0> provider4, Provider<String> provider5) {
        return new n0(provider, provider2, provider3, provider4, provider5);
    }

    public static m0 c(h8.a aVar, h8.a aVar2, Object obj, Object obj2, y7.a<String> aVar3) {
        return new m0(aVar, aVar2, (e) obj, (t0) obj2, aVar3);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public m0 get() {
        return c(this.f30158a.get(), this.f30159b.get(), this.f30160c.get(), this.f30161d.get(), z7.a.a(this.f30162e));
    }
}
