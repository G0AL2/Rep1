package ac;

import ac.a0;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
/* loaded from: classes3.dex */
final class n extends a0.e.d.a.b.AbstractC0012a {

    /* renamed from: a  reason: collision with root package name */
    private final long f470a;

    /* renamed from: b  reason: collision with root package name */
    private final long f471b;

    /* renamed from: c  reason: collision with root package name */
    private final String f472c;

    /* renamed from: d  reason: collision with root package name */
    private final String f473d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0012a.AbstractC0013a {

        /* renamed from: a  reason: collision with root package name */
        private Long f474a;

        /* renamed from: b  reason: collision with root package name */
        private Long f475b;

        /* renamed from: c  reason: collision with root package name */
        private String f476c;

        /* renamed from: d  reason: collision with root package name */
        private String f477d;

        @Override // ac.a0.e.d.a.b.AbstractC0012a.AbstractC0013a
        public a0.e.d.a.b.AbstractC0012a a() {
            String str = "";
            if (this.f474a == null) {
                str = " baseAddress";
            }
            if (this.f475b == null) {
                str = str + " size";
            }
            if (this.f476c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new n(this.f474a.longValue(), this.f475b.longValue(), this.f476c, this.f477d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.a0.e.d.a.b.AbstractC0012a.AbstractC0013a
        public a0.e.d.a.b.AbstractC0012a.AbstractC0013a b(long j10) {
            this.f474a = Long.valueOf(j10);
            return this;
        }

        @Override // ac.a0.e.d.a.b.AbstractC0012a.AbstractC0013a
        public a0.e.d.a.b.AbstractC0012a.AbstractC0013a c(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f476c = str;
            return this;
        }

        @Override // ac.a0.e.d.a.b.AbstractC0012a.AbstractC0013a
        public a0.e.d.a.b.AbstractC0012a.AbstractC0013a d(long j10) {
            this.f475b = Long.valueOf(j10);
            return this;
        }

        @Override // ac.a0.e.d.a.b.AbstractC0012a.AbstractC0013a
        public a0.e.d.a.b.AbstractC0012a.AbstractC0013a e(String str) {
            this.f477d = str;
            return this;
        }
    }

    @Override // ac.a0.e.d.a.b.AbstractC0012a
    public long b() {
        return this.f470a;
    }

    @Override // ac.a0.e.d.a.b.AbstractC0012a
    public String c() {
        return this.f472c;
    }

    @Override // ac.a0.e.d.a.b.AbstractC0012a
    public long d() {
        return this.f471b;
    }

    @Override // ac.a0.e.d.a.b.AbstractC0012a
    public String e() {
        return this.f473d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.AbstractC0012a) {
            a0.e.d.a.b.AbstractC0012a abstractC0012a = (a0.e.d.a.b.AbstractC0012a) obj;
            if (this.f470a == abstractC0012a.b() && this.f471b == abstractC0012a.d() && this.f472c.equals(abstractC0012a.c())) {
                String str = this.f473d;
                if (str == null) {
                    if (abstractC0012a.e() == null) {
                        return true;
                    }
                } else if (str.equals(abstractC0012a.e())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f470a;
        long j11 = this.f471b;
        int hashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f472c.hashCode()) * 1000003;
        String str = this.f473d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f470a + ", size=" + this.f471b + ", name=" + this.f472c + ", uuid=" + this.f473d + "}";
    }

    private n(long j10, long j11, String str, String str2) {
        this.f470a = j10;
        this.f471b = j11;
        this.f472c = str;
        this.f473d = str2;
    }
}
