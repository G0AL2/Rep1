package d8;

import android.content.Context;
import e8.v;
import javax.inject.Provider;

/* compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* loaded from: classes2.dex */
public final class i implements z7.b<v> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f29114a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<f8.d> f29115b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.c> f29116c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<h8.a> f29117d;

    public i(Provider<Context> provider, Provider<f8.d> provider2, Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.c> provider3, Provider<h8.a> provider4) {
        this.f29114a = provider;
        this.f29115b = provider2;
        this.f29116c = provider3;
        this.f29117d = provider4;
    }

    public static i a(Provider<Context> provider, Provider<f8.d> provider2, Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.c> provider3, Provider<h8.a> provider4) {
        return new i(provider, provider2, provider3, provider4);
    }

    public static v c(Context context, f8.d dVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar, h8.a aVar) {
        return (v) z7.d.c(h.a(context, dVar, cVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public v get() {
        return c(this.f29114a.get(), this.f29115b.get(), this.f29116c.get(), this.f29117d.get());
    }
}
