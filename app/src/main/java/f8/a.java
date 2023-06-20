package f8;

import f8.e;

/* compiled from: AutoValue_EventStoreConfig.java */
/* loaded from: classes2.dex */
final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    private final long f30104b;

    /* renamed from: c  reason: collision with root package name */
    private final int f30105c;

    /* renamed from: d  reason: collision with root package name */
    private final int f30106d;

    /* renamed from: e  reason: collision with root package name */
    private final long f30107e;

    /* renamed from: f  reason: collision with root package name */
    private final int f30108f;

    /* compiled from: AutoValue_EventStoreConfig.java */
    /* loaded from: classes2.dex */
    static final class b extends e.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f30109a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f30110b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f30111c;

        /* renamed from: d  reason: collision with root package name */
        private Long f30112d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f30113e;

        @Override // f8.e.a
        e a() {
            String str = "";
            if (this.f30109a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f30110b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f30111c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f30112d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f30113e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f30109a.longValue(), this.f30110b.intValue(), this.f30111c.intValue(), this.f30112d.longValue(), this.f30113e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f8.e.a
        e.a b(int i10) {
            this.f30111c = Integer.valueOf(i10);
            return this;
        }

        @Override // f8.e.a
        e.a c(long j10) {
            this.f30112d = Long.valueOf(j10);
            return this;
        }

        @Override // f8.e.a
        e.a d(int i10) {
            this.f30110b = Integer.valueOf(i10);
            return this;
        }

        @Override // f8.e.a
        e.a e(int i10) {
            this.f30113e = Integer.valueOf(i10);
            return this;
        }

        @Override // f8.e.a
        e.a f(long j10) {
            this.f30109a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // f8.e
    int b() {
        return this.f30106d;
    }

    @Override // f8.e
    long c() {
        return this.f30107e;
    }

    @Override // f8.e
    int d() {
        return this.f30105c;
    }

    @Override // f8.e
    int e() {
        return this.f30108f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f30104b == eVar.f() && this.f30105c == eVar.d() && this.f30106d == eVar.b() && this.f30107e == eVar.c() && this.f30108f == eVar.e();
        }
        return false;
    }

    @Override // f8.e
    long f() {
        return this.f30104b;
    }

    public int hashCode() {
        long j10 = this.f30104b;
        long j11 = this.f30107e;
        return this.f30108f ^ ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f30105c) * 1000003) ^ this.f30106d) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f30104b + ", loadBatchSize=" + this.f30105c + ", criticalSectionEnterTimeoutMs=" + this.f30106d + ", eventCleanUpAge=" + this.f30107e + ", maxBlobByteSizePerRow=" + this.f30108f + "}";
    }

    private a(long j10, int i10, int i11, long j11, int i12) {
        this.f30104b = j10;
        this.f30105c = i10;
        this.f30106d = i11;
        this.f30107e = j11;
        this.f30108f = i12;
    }
}
