package h8;

/* compiled from: TimeModule_EventClockFactory.java */
/* loaded from: classes2.dex */
public final class c implements z7.b<h8.a> {

    /* compiled from: TimeModule_EventClockFactory.java */
    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final c f31124a = new c();
    }

    public static c a() {
        return a.f31124a;
    }

    public static h8.a b() {
        return (h8.a) z7.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c */
    public h8.a get() {
        return b();
    }
}
