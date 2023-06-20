package ac;

import ac.a0;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
/* loaded from: classes3.dex */
final class u extends a0.e.AbstractC0023e {

    /* renamed from: a  reason: collision with root package name */
    private final int f524a;

    /* renamed from: b  reason: collision with root package name */
    private final String f525b;

    /* renamed from: c  reason: collision with root package name */
    private final String f526c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f527d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.AbstractC0023e.a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f528a;

        /* renamed from: b  reason: collision with root package name */
        private String f529b;

        /* renamed from: c  reason: collision with root package name */
        private String f530c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f531d;

        @Override // ac.a0.e.AbstractC0023e.a
        public a0.e.AbstractC0023e a() {
            String str = "";
            if (this.f528a == null) {
                str = " platform";
            }
            if (this.f529b == null) {
                str = str + " version";
            }
            if (this.f530c == null) {
                str = str + " buildVersion";
            }
            if (this.f531d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new u(this.f528a.intValue(), this.f529b, this.f530c, this.f531d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.a0.e.AbstractC0023e.a
        public a0.e.AbstractC0023e.a b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f530c = str;
            return this;
        }

        @Override // ac.a0.e.AbstractC0023e.a
        public a0.e.AbstractC0023e.a c(boolean z10) {
            this.f531d = Boolean.valueOf(z10);
            return this;
        }

        @Override // ac.a0.e.AbstractC0023e.a
        public a0.e.AbstractC0023e.a d(int i10) {
            this.f528a = Integer.valueOf(i10);
            return this;
        }

        @Override // ac.a0.e.AbstractC0023e.a
        public a0.e.AbstractC0023e.a e(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f529b = str;
            return this;
        }
    }

    @Override // ac.a0.e.AbstractC0023e
    public String b() {
        return this.f526c;
    }

    @Override // ac.a0.e.AbstractC0023e
    public int c() {
        return this.f524a;
    }

    @Override // ac.a0.e.AbstractC0023e
    public String d() {
        return this.f525b;
    }

    @Override // ac.a0.e.AbstractC0023e
    public boolean e() {
        return this.f527d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.AbstractC0023e) {
            a0.e.AbstractC0023e abstractC0023e = (a0.e.AbstractC0023e) obj;
            return this.f524a == abstractC0023e.c() && this.f525b.equals(abstractC0023e.d()) && this.f526c.equals(abstractC0023e.b()) && this.f527d == abstractC0023e.e();
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f524a ^ 1000003) * 1000003) ^ this.f525b.hashCode()) * 1000003) ^ this.f526c.hashCode()) * 1000003) ^ (this.f527d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f524a + ", version=" + this.f525b + ", buildVersion=" + this.f526c + ", jailbroken=" + this.f527d + "}";
    }

    private u(int i10, String str, String str2, boolean z10) {
        this.f524a = i10;
        this.f525b = str;
        this.f526c = str2;
        this.f527d = z10;
    }
}
