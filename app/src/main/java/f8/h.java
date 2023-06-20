package f8;

import android.content.Context;
import javax.inject.Provider;

/* compiled from: EventStoreModule_PackageNameFactory.java */
/* loaded from: classes2.dex */
public final class h implements z7.b<String> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f30127a;

    public h(Provider<Context> provider) {
        this.f30127a = provider;
    }

    public static h a(Provider<Context> provider) {
        return new h(provider);
    }

    public static String c(Context context) {
        return (String) z7.d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public String get() {
        return c(this.f30127a.get());
    }
}
