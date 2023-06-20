package ac;

import ac.a0;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
/* loaded from: classes3.dex */
final class r extends a0.e.d.a.b.AbstractC0018e.AbstractC0020b {

    /* renamed from: a  reason: collision with root package name */
    private final long f500a;

    /* renamed from: b  reason: collision with root package name */
    private final String f501b;

    /* renamed from: c  reason: collision with root package name */
    private final String f502c;

    /* renamed from: d  reason: collision with root package name */
    private final long f503d;

    /* renamed from: e  reason: collision with root package name */
    private final int f504e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0018e.AbstractC0020b.AbstractC0021a {

        /* renamed from: a  reason: collision with root package name */
        private Long f505a;

        /* renamed from: b  reason: collision with root package name */
        private String f506b;

        /* renamed from: c  reason: collision with root package name */
        private String f507c;

        /* renamed from: d  reason: collision with root package name */
        private Long f508d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f509e;

        @Override // ac.a0.e.d.a.b.AbstractC0018e.AbstractC0020b.AbstractC0021a
        public a0.e.d.a.b.AbstractC0018e.AbstractC0020b a() {
            String str = "";
            if (this.f505a == null) {
                str = " pc";
            }
            if (this.f506b == null) {
                str = str + " symbol";
            }
            if (this.f508d == null) {
                str = str + " offset";
            }
            if (this.f509e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new r(this.f505a.longValue(), this.f506b, this.f507c, this.f508d.longValue(), this.f509e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.a0.e.d.a.b.AbstractC0018e.AbstractC0020b.AbstractC0021a
        public a0.e.d.a.b.AbstractC0018e.AbstractC0020b.AbstractC0021a b(String str) {
            this.f507c = str;
            return this;
        }

        @Override // ac.a0.e.d.a.b.AbstractC0018e.AbstractC0020b.AbstractC0021a
        public a0.e.d.a.b.AbstractC0018e.AbstractC0020b.AbstractC0021a c(int i10) {
            this.f509e = Integer.valueOf(i10);
            return this;
        }

        @Override // ac.a0.e.d.a.b.AbstractC0018e.AbstractC0020b.AbstractC0021a
        public a0.e.d.a.b.AbstractC0018e.AbstractC0020b.AbstractC0021a d(long j10) {
            this.f508d = Long.valueOf(j10);
            return this;
        }

        @Override // ac.a0.e.d.a.b.AbstractC0018e.AbstractC0020b.AbstractC0021a
        public a0.e.d.a.b.AbstractC0018e.AbstractC0020b.AbstractC0021a e(long j10) {
            this.f505a = Long.valueOf(j10);
            return this;
        }

        @Override // ac.a0.e.d.a.b.AbstractC0018e.AbstractC0020b.AbstractC0021a
        public a0.e.d.a.b.AbstractC0018e.AbstractC0020b.AbstractC0021a f(String str) {
            Objects.requireNonNull(str, "Null symbol");
            this.f506b = str;
            return this;
        }
    }

    @Override // ac.a0.e.d.a.b.AbstractC0018e.AbstractC0020b
    public String b() {
        return this.f502c;
    }

    @Override // ac.a0.e.d.a.b.AbstractC0018e.AbstractC0020b
    public int c() {
        return this.f504e;
    }

    @Override // ac.a0.e.d.a.b.AbstractC0018e.AbstractC0020b
    public long d() {
        return this.f503d;
    }

    @Override // ac.a0.e.d.a.b.AbstractC0018e.AbstractC0020b
    public long e() {
        return this.f500a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.AbstractC0018e.AbstractC0020b) {
            a0.e.d.a.b.AbstractC0018e.AbstractC0020b abstractC0020b = (a0.e.d.a.b.AbstractC0018e.AbstractC0020b) obj;
            return this.f500a == abstractC0020b.e() && this.f501b.equals(abstractC0020b.f()) && ((str = this.f502c) != null ? str.equals(abstractC0020b.b()) : abstractC0020b.b() == null) && this.f503d == abstractC0020b.d() && this.f504e == abstractC0020b.c();
        }
        return false;
    }

    @Override // ac.a0.e.d.a.b.AbstractC0018e.AbstractC0020b
    public String f() {
        return this.f501b;
    }

    public int hashCode() {
        long j10 = this.f500a;
        int hashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f501b.hashCode()) * 1000003;
        String str = this.f502c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j11 = this.f503d;
        return this.f504e ^ ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f500a + ", symbol=" + this.f501b + ", file=" + this.f502c + ", offset=" + this.f503d + ", importance=" + this.f504e + "}";
    }

    private r(long j10, String str, String str2, long j11, int i10) {
        this.f500a = j10;
        this.f501b = str;
        this.f502c = str2;
        this.f503d = j11;
        this.f504e = i10;
    }
}
