package a8;

/* compiled from: StorageMetrics.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final long f109a;

    /* renamed from: b  reason: collision with root package name */
    private final long f110b;

    /* compiled from: StorageMetrics.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f111a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f112b = 0;

        a() {
        }

        public e a() {
            return new e(this.f111a, this.f112b);
        }

        public a b(long j10) {
            this.f111a = j10;
            return this;
        }

        public a c(long j10) {
            this.f112b = j10;
            return this;
        }
    }

    static {
        new a().a();
    }

    e(long j10, long j11) {
        this.f109a = j10;
        this.f110b = j11;
    }

    public static a c() {
        return new a();
    }

    @oc.d(tag = 1)
    public long a() {
        return this.f109a;
    }

    @oc.d(tag = 2)
    public long b() {
        return this.f110b;
    }
}
