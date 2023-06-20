package ac;

import ac.a0;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
/* loaded from: classes3.dex */
final class p extends a0.e.d.a.b.AbstractC0016d {

    /* renamed from: a  reason: collision with root package name */
    private final String f488a;

    /* renamed from: b  reason: collision with root package name */
    private final String f489b;

    /* renamed from: c  reason: collision with root package name */
    private final long f490c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0016d.AbstractC0017a {

        /* renamed from: a  reason: collision with root package name */
        private String f491a;

        /* renamed from: b  reason: collision with root package name */
        private String f492b;

        /* renamed from: c  reason: collision with root package name */
        private Long f493c;

        @Override // ac.a0.e.d.a.b.AbstractC0016d.AbstractC0017a
        public a0.e.d.a.b.AbstractC0016d a() {
            String str = "";
            if (this.f491a == null) {
                str = " name";
            }
            if (this.f492b == null) {
                str = str + " code";
            }
            if (this.f493c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new p(this.f491a, this.f492b, this.f493c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.a0.e.d.a.b.AbstractC0016d.AbstractC0017a
        public a0.e.d.a.b.AbstractC0016d.AbstractC0017a b(long j10) {
            this.f493c = Long.valueOf(j10);
            return this;
        }

        @Override // ac.a0.e.d.a.b.AbstractC0016d.AbstractC0017a
        public a0.e.d.a.b.AbstractC0016d.AbstractC0017a c(String str) {
            Objects.requireNonNull(str, "Null code");
            this.f492b = str;
            return this;
        }

        @Override // ac.a0.e.d.a.b.AbstractC0016d.AbstractC0017a
        public a0.e.d.a.b.AbstractC0016d.AbstractC0017a d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f491a = str;
            return this;
        }
    }

    @Override // ac.a0.e.d.a.b.AbstractC0016d
    public long b() {
        return this.f490c;
    }

    @Override // ac.a0.e.d.a.b.AbstractC0016d
    public String c() {
        return this.f489b;
    }

    @Override // ac.a0.e.d.a.b.AbstractC0016d
    public String d() {
        return this.f488a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.AbstractC0016d) {
            a0.e.d.a.b.AbstractC0016d abstractC0016d = (a0.e.d.a.b.AbstractC0016d) obj;
            return this.f488a.equals(abstractC0016d.d()) && this.f489b.equals(abstractC0016d.c()) && this.f490c == abstractC0016d.b();
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f490c;
        return ((((this.f488a.hashCode() ^ 1000003) * 1000003) ^ this.f489b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f488a + ", code=" + this.f489b + ", address=" + this.f490c + "}";
    }

    private p(String str, String str2, long j10) {
        this.f488a = str;
        this.f489b = str2;
        this.f490c = j10;
    }
}
