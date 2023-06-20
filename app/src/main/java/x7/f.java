package x7;

import android.content.Context;
import javax.inject.Provider;

/* compiled from: MetadataBackendRegistry_Factory.java */
/* loaded from: classes2.dex */
public final class f implements z7.b<e> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f38699a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<c> f38700b;

    public f(Provider<Context> provider, Provider<c> provider2) {
        this.f38699a = provider;
        this.f38700b = provider2;
    }

    public static f a(Provider<Context> provider, Provider<c> provider2) {
        return new f(provider, provider2);
    }

    public static e c(Context context, Object obj) {
        return new e(context, (c) obj);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public e get() {
        return c(this.f38699a.get(), this.f38700b.get());
    }
}
