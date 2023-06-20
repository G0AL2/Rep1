package x7;

import android.content.Context;
import javax.inject.Provider;

/* compiled from: CreationContextFactory_Factory.java */
/* loaded from: classes2.dex */
public final class d implements z7.b<c> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f38691a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<h8.a> f38692b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<h8.a> f38693c;

    public d(Provider<Context> provider, Provider<h8.a> provider2, Provider<h8.a> provider3) {
        this.f38691a = provider;
        this.f38692b = provider2;
        this.f38693c = provider3;
    }

    public static d a(Provider<Context> provider, Provider<h8.a> provider2, Provider<h8.a> provider3) {
        return new d(provider, provider2, provider3);
    }

    public static c c(Context context, h8.a aVar, h8.a aVar2) {
        return new c(context, aVar, aVar2);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public c get() {
        return c(this.f38691a.get(), this.f38692b.get(), this.f38693c.get());
    }
}
