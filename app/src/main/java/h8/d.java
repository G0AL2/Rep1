package h8;

/* compiled from: TimeModule_UptimeClockFactory.java */
/* loaded from: classes2.dex */
public final class d implements z7.b<h8.a> {

    /* compiled from: TimeModule_UptimeClockFactory.java */
    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final d f31125a = new d();
    }

    public static d a() {
        return a.f31125a;
    }

    public static h8.a c() {
        return (h8.a) z7.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public h8.a get() {
        return c();
    }
}
