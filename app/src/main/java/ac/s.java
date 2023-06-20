package ac;

import ac.a0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
/* loaded from: classes3.dex */
final class s extends a0.e.d.c {

    /* renamed from: a  reason: collision with root package name */
    private final Double f510a;

    /* renamed from: b  reason: collision with root package name */
    private final int f511b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f512c;

    /* renamed from: d  reason: collision with root package name */
    private final int f513d;

    /* renamed from: e  reason: collision with root package name */
    private final long f514e;

    /* renamed from: f  reason: collision with root package name */
    private final long f515f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.d.c.a {

        /* renamed from: a  reason: collision with root package name */
        private Double f516a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f517b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f518c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f519d;

        /* renamed from: e  reason: collision with root package name */
        private Long f520e;

        /* renamed from: f  reason: collision with root package name */
        private Long f521f;

        @Override // ac.a0.e.d.c.a
        public a0.e.d.c a() {
            String str = "";
            if (this.f517b == null) {
                str = " batteryVelocity";
            }
            if (this.f518c == null) {
                str = str + " proximityOn";
            }
            if (this.f519d == null) {
                str = str + " orientation";
            }
            if (this.f520e == null) {
                str = str + " ramUsed";
            }
            if (this.f521f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new s(this.f516a, this.f517b.intValue(), this.f518c.booleanValue(), this.f519d.intValue(), this.f520e.longValue(), this.f521f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.a0.e.d.c.a
        public a0.e.d.c.a b(Double d10) {
            this.f516a = d10;
            return this;
        }

        @Override // ac.a0.e.d.c.a
        public a0.e.d.c.a c(int i10) {
            this.f517b = Integer.valueOf(i10);
            return this;
        }

        @Override // ac.a0.e.d.c.a
        public a0.e.d.c.a d(long j10) {
            this.f521f = Long.valueOf(j10);
            return this;
        }

        @Override // ac.a0.e.d.c.a
        public a0.e.d.c.a e(int i10) {
            this.f519d = Integer.valueOf(i10);
            return this;
        }

        @Override // ac.a0.e.d.c.a
        public a0.e.d.c.a f(boolean z10) {
            this.f518c = Boolean.valueOf(z10);
            return this;
        }

        @Override // ac.a0.e.d.c.a
        public a0.e.d.c.a g(long j10) {
            this.f520e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // ac.a0.e.d.c
    public Double b() {
        return this.f510a;
    }

    @Override // ac.a0.e.d.c
    public int c() {
        return this.f511b;
    }

    @Override // ac.a0.e.d.c
    public long d() {
        return this.f515f;
    }

    @Override // ac.a0.e.d.c
    public int e() {
        return this.f513d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.c) {
            a0.e.d.c cVar = (a0.e.d.c) obj;
            Double d10 = this.f510a;
            if (d10 != null ? d10.equals(cVar.b()) : cVar.b() == null) {
                if (this.f511b == cVar.c() && this.f512c == cVar.g() && this.f513d == cVar.e() && this.f514e == cVar.f() && this.f515f == cVar.d()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // ac.a0.e.d.c
    public long f() {
        return this.f514e;
    }

    @Override // ac.a0.e.d.c
    public boolean g() {
        return this.f512c;
    }

    public int hashCode() {
        Double d10 = this.f510a;
        int hashCode = ((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f511b) * 1000003;
        int i10 = this.f512c ? 1231 : 1237;
        long j10 = this.f514e;
        long j11 = this.f515f;
        return ((((((hashCode ^ i10) * 1000003) ^ this.f513d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f510a + ", batteryVelocity=" + this.f511b + ", proximityOn=" + this.f512c + ", orientation=" + this.f513d + ", ramUsed=" + this.f514e + ", diskUsed=" + this.f515f + "}";
    }

    private s(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f510a = d10;
        this.f511b = i10;
        this.f512c = z10;
        this.f513d = i11;
        this.f514e = j10;
        this.f515f = j11;
    }
}
