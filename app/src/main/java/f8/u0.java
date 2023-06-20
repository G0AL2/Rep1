package f8;

import android.content.Context;
import javax.inject.Provider;

/* compiled from: SchemaManager_Factory.java */
/* loaded from: classes2.dex */
public final class u0 implements z7.b<t0> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f30189a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<String> f30190b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<Integer> f30191c;

    public u0(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.f30189a = provider;
        this.f30190b = provider2;
        this.f30191c = provider3;
    }

    public static u0 a(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        return new u0(provider, provider2, provider3);
    }

    public static t0 c(Context context, String str, int i10) {
        return new t0(context, str, i10);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public t0 get() {
        return c(this.f30189a.get(), this.f30190b.get(), this.f30191c.get().intValue());
    }
}
