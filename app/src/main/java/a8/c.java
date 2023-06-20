package a8;

/* compiled from: LogEventDropped.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final long f92a;

    /* renamed from: b  reason: collision with root package name */
    private final b f93b;

    /* compiled from: LogEventDropped.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f94a = 0;

        /* renamed from: b  reason: collision with root package name */
        private b f95b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f94a, this.f95b);
        }

        public a b(long j10) {
            this.f94a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f95b = bVar;
            return this;
        }
    }

    /* compiled from: LogEventDropped.java */
    /* loaded from: classes2.dex */
    public enum b implements oc.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f104a;

        b(int i10) {
            this.f104a = i10;
        }

        @Override // oc.c
        public int f() {
            return this.f104a;
        }
    }

    static {
        new a().a();
    }

    c(long j10, b bVar) {
        this.f92a = j10;
        this.f93b = bVar;
    }

    public static a c() {
        return new a();
    }

    @oc.d(tag = 1)
    public long a() {
        return this.f92a;
    }

    @oc.d(tag = 3)
    public b b() {
        return this.f93b;
    }
}
