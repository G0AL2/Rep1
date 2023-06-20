package v7;

import java.util.Arrays;
import v7.l;

/* compiled from: AutoValue_LogEvent.java */
/* loaded from: classes2.dex */
final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    private final long f37881a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f37882b;

    /* renamed from: c  reason: collision with root package name */
    private final long f37883c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f37884d;

    /* renamed from: e  reason: collision with root package name */
    private final String f37885e;

    /* renamed from: f  reason: collision with root package name */
    private final long f37886f;

    /* renamed from: g  reason: collision with root package name */
    private final o f37887g;

    /* compiled from: AutoValue_LogEvent.java */
    /* loaded from: classes2.dex */
    static final class b extends l.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f37888a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f37889b;

        /* renamed from: c  reason: collision with root package name */
        private Long f37890c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f37891d;

        /* renamed from: e  reason: collision with root package name */
        private String f37892e;

        /* renamed from: f  reason: collision with root package name */
        private Long f37893f;

        /* renamed from: g  reason: collision with root package name */
        private o f37894g;

        @Override // v7.l.a
        public l a() {
            String str = "";
            if (this.f37888a == null) {
                str = " eventTimeMs";
            }
            if (this.f37890c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f37893f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f37888a.longValue(), this.f37889b, this.f37890c.longValue(), this.f37891d, this.f37892e, this.f37893f.longValue(), this.f37894g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // v7.l.a
        public l.a b(Integer num) {
            this.f37889b = num;
            return this;
        }

        @Override // v7.l.a
        public l.a c(long j10) {
            this.f37888a = Long.valueOf(j10);
            return this;
        }

        @Override // v7.l.a
        public l.a d(long j10) {
            this.f37890c = Long.valueOf(j10);
            return this;
        }

        @Override // v7.l.a
        public l.a e(o oVar) {
            this.f37894g = oVar;
            return this;
        }

        @Override // v7.l.a
        l.a f(byte[] bArr) {
            this.f37891d = bArr;
            return this;
        }

        @Override // v7.l.a
        l.a g(String str) {
            this.f37892e = str;
            return this;
        }

        @Override // v7.l.a
        public l.a h(long j10) {
            this.f37893f = Long.valueOf(j10);
            return this;
        }
    }

    @Override // v7.l
    public Integer b() {
        return this.f37882b;
    }

    @Override // v7.l
    public long c() {
        return this.f37881a;
    }

    @Override // v7.l
    public long d() {
        return this.f37883c;
    }

    @Override // v7.l
    public o e() {
        return this.f37887g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f37881a == lVar.c() && ((num = this.f37882b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f37883c == lVar.d()) {
                if (Arrays.equals(this.f37884d, lVar instanceof f ? ((f) lVar).f37884d : lVar.f()) && ((str = this.f37885e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f37886f == lVar.h()) {
                    o oVar = this.f37887g;
                    if (oVar == null) {
                        if (lVar.e() == null) {
                            return true;
                        }
                    } else if (oVar.equals(lVar.e())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // v7.l
    public byte[] f() {
        return this.f37884d;
    }

    @Override // v7.l
    public String g() {
        return this.f37885e;
    }

    @Override // v7.l
    public long h() {
        return this.f37886f;
    }

    public int hashCode() {
        long j10 = this.f37881a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f37882b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f37883c;
        int hashCode2 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f37884d)) * 1000003;
        String str = this.f37885e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f37886f;
        int i11 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f37887g;
        return i11 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f37881a + ", eventCode=" + this.f37882b + ", eventUptimeMs=" + this.f37883c + ", sourceExtension=" + Arrays.toString(this.f37884d) + ", sourceExtensionJsonProto3=" + this.f37885e + ", timezoneOffsetSeconds=" + this.f37886f + ", networkConnectionInfo=" + this.f37887g + "}";
    }

    private f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f37881a = j10;
        this.f37882b = num;
        this.f37883c = j11;
        this.f37884d = bArr;
        this.f37885e = str;
        this.f37886f = j12;
        this.f37887g = oVar;
    }
}
