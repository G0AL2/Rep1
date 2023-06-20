package d8;

import javax.inject.Provider;

/* compiled from: SchedulingConfigModule_ConfigFactory.java */
/* loaded from: classes2.dex */
public final class g implements z7.b<com.google.android.datatransport.runtime.scheduling.jobscheduling.c> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<h8.a> f29113a;

    public g(Provider<h8.a> provider) {
        this.f29113a = provider;
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.c a(h8.a aVar) {
        return (com.google.android.datatransport.runtime.scheduling.jobscheduling.c) z7.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(Provider<h8.a> provider) {
        return new g(provider);
    }

    @Override // javax.inject.Provider
    /* renamed from: c */
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.c get() {
        return a(this.f29113a.get());
    }
}
