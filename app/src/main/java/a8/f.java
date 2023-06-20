package a8;

/* compiled from: TimeWindow.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final long f113a;

    /* renamed from: b  reason: collision with root package name */
    private final long f114b;

    /* compiled from: TimeWindow.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f115a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f116b = 0;

        a() {
        }

        public f a() {
            return new f(this.f115a, this.f116b);
        }

        public a b(long j10) {
            this.f116b = j10;
            return this;
        }

        public a c(long j10) {
            this.f115a = j10;
            return this;
        }
    }

    static {
        new a().a();
    }

    f(long j10, long j11) {
        this.f113a = j10;
        this.f114b = j11;
    }

    public static a c() {
        return new a();
    }

    @oc.d(tag = 2)
    public long a() {
        return this.f114b;
    }

    @oc.d(tag = 1)
    public long b() {
        return this.f113a;
    }
}
