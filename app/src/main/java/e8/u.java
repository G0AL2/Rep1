package e8;

import java.util.concurrent.Executor;
import javax.inject.Provider;

/* compiled from: WorkInitializer_Factory.java */
/* loaded from: classes2.dex */
public final class u implements z7.b<t> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Executor> f29640a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<f8.d> f29641b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<v> f29642c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<g8.b> f29643d;

    public u(Provider<Executor> provider, Provider<f8.d> provider2, Provider<v> provider3, Provider<g8.b> provider4) {
        this.f29640a = provider;
        this.f29641b = provider2;
        this.f29642c = provider3;
        this.f29643d = provider4;
    }

    public static u a(Provider<Executor> provider, Provider<f8.d> provider2, Provider<v> provider3, Provider<g8.b> provider4) {
        return new u(provider, provider2, provider3, provider4);
    }

    public static t c(Executor executor, f8.d dVar, v vVar, g8.b bVar) {
        return new t(executor, dVar, vVar, bVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public t get() {
        return c(this.f29640a.get(), this.f29641b.get(), this.f29642c.get(), this.f29643d.get());
    }
}
