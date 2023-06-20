package f8;

/* compiled from: EventStoreModule_DbNameFactory.java */
/* loaded from: classes2.dex */
public final class g implements z7.b<String> {

    /* compiled from: EventStoreModule_DbNameFactory.java */
    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final g f30125a = new g();
    }

    public static g a() {
        return a.f30125a;
    }

    public static String b() {
        return (String) z7.d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c */
    public String get() {
        return b();
    }
}
