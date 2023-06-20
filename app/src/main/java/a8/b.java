package a8;

/* compiled from: GlobalMetrics.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final e f90a;

    /* compiled from: GlobalMetrics.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private e f91a = null;

        a() {
        }

        public b a() {
            return new b(this.f91a);
        }

        public a b(e eVar) {
            this.f91a = eVar;
            return this;
        }
    }

    static {
        new a().a();
    }

    b(e eVar) {
        this.f90a = eVar;
    }

    public static a b() {
        return new a();
    }

    @oc.d(tag = 1)
    public e a() {
        return this.f90a;
    }
}
