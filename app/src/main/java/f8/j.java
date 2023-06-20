package f8;

/* compiled from: EventStoreModule_StoreConfigFactory.java */
/* loaded from: classes2.dex */
public final class j implements z7.b<e> {

    /* compiled from: EventStoreModule_StoreConfigFactory.java */
    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final j f30132a = new j();
    }

    public static j a() {
        return a.f30132a;
    }

    public static e c() {
        return (e) z7.d.c(f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public e get() {
        return c();
    }
}
