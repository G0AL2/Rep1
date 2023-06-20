package d8;

import e8.v;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* compiled from: DefaultScheduler_Factory.java */
/* loaded from: classes2.dex */
public final class d implements z7.b<c> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Executor> f29108a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<x7.b> f29109b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<v> f29110c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<f8.d> f29111d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<g8.b> f29112e;

    public d(Provider<Executor> provider, Provider<x7.b> provider2, Provider<v> provider3, Provider<f8.d> provider4, Provider<g8.b> provider5) {
        this.f29108a = provider;
        this.f29109b = provider2;
        this.f29110c = provider3;
        this.f29111d = provider4;
        this.f29112e = provider5;
    }

    public static d a(Provider<Executor> provider, Provider<x7.b> provider2, Provider<v> provider3, Provider<f8.d> provider4, Provider<g8.b> provider5) {
        return new d(provider, provider2, provider3, provider4, provider5);
    }

    public static c c(Executor executor, x7.b bVar, v vVar, f8.d dVar, g8.b bVar2) {
        return new c(executor, bVar, vVar, dVar, bVar2);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public c get() {
        return c(this.f29108a.get(), this.f29109b.get(), this.f29110c.get(), this.f29111d.get(), this.f29112e.get());
    }
}
