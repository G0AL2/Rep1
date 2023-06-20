package ac;

import ac.a0;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
/* loaded from: classes3.dex */
final class h extends a0.e.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f407a;

    /* renamed from: b  reason: collision with root package name */
    private final String f408b;

    /* renamed from: c  reason: collision with root package name */
    private final String f409c;

    /* renamed from: d  reason: collision with root package name */
    private final a0.e.a.b f410d;

    /* renamed from: e  reason: collision with root package name */
    private final String f411e;

    /* renamed from: f  reason: collision with root package name */
    private final String f412f;

    /* renamed from: g  reason: collision with root package name */
    private final String f413g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.a.AbstractC0010a {

        /* renamed from: a  reason: collision with root package name */
        private String f414a;

        /* renamed from: b  reason: collision with root package name */
        private String f415b;

        /* renamed from: c  reason: collision with root package name */
        private String f416c;

        /* renamed from: d  reason: collision with root package name */
        private a0.e.a.b f417d;

        /* renamed from: e  reason: collision with root package name */
        private String f418e;

        /* renamed from: f  reason: collision with root package name */
        private String f419f;

        /* renamed from: g  reason: collision with root package name */
        private String f420g;

        @Override // ac.a0.e.a.AbstractC0010a
        public a0.e.a a() {
            String str = "";
            if (this.f414a == null) {
                str = " identifier";
            }
            if (this.f415b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new h(this.f414a, this.f415b, this.f416c, this.f417d, this.f418e, this.f419f, this.f420g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.a0.e.a.AbstractC0010a
        public a0.e.a.AbstractC0010a b(String str) {
            this.f419f = str;
            return this;
        }

        @Override // ac.a0.e.a.AbstractC0010a
        public a0.e.a.AbstractC0010a c(String str) {
            this.f420g = str;
            return this;
        }

        @Override // ac.a0.e.a.AbstractC0010a
        public a0.e.a.AbstractC0010a d(String str) {
            this.f416c = str;
            return this;
        }

        @Override // ac.a0.e.a.AbstractC0010a
        public a0.e.a.AbstractC0010a e(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f414a = str;
            return this;
        }

        @Override // ac.a0.e.a.AbstractC0010a
        public a0.e.a.AbstractC0010a f(String str) {
            this.f418e = str;
            return this;
        }

        @Override // ac.a0.e.a.AbstractC0010a
        public a0.e.a.AbstractC0010a g(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f415b = str;
            return this;
        }
    }

    @Override // ac.a0.e.a
    public String b() {
        return this.f412f;
    }

    @Override // ac.a0.e.a
    public String c() {
        return this.f413g;
    }

    @Override // ac.a0.e.a
    public String d() {
        return this.f409c;
    }

    @Override // ac.a0.e.a
    public String e() {
        return this.f407a;
    }

    public boolean equals(Object obj) {
        String str;
        a0.e.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.a) {
            a0.e.a aVar = (a0.e.a) obj;
            if (this.f407a.equals(aVar.e()) && this.f408b.equals(aVar.h()) && ((str = this.f409c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f410d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f411e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f412f) != null ? str3.equals(aVar.b()) : aVar.b() == null)) {
                String str4 = this.f413g;
                if (str4 == null) {
                    if (aVar.c() == null) {
                        return true;
                    }
                } else if (str4.equals(aVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // ac.a0.e.a
    public String f() {
        return this.f411e;
    }

    @Override // ac.a0.e.a
    public a0.e.a.b g() {
        return this.f410d;
    }

    @Override // ac.a0.e.a
    public String h() {
        return this.f408b;
    }

    public int hashCode() {
        int hashCode = (((this.f407a.hashCode() ^ 1000003) * 1000003) ^ this.f408b.hashCode()) * 1000003;
        String str = this.f409c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        a0.e.a.b bVar = this.f410d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f411e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f412f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f413g;
        return hashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f407a + ", version=" + this.f408b + ", displayVersion=" + this.f409c + ", organization=" + this.f410d + ", installationUuid=" + this.f411e + ", developmentPlatform=" + this.f412f + ", developmentPlatformVersion=" + this.f413g + "}";
    }

    private h(String str, String str2, String str3, a0.e.a.b bVar, String str4, String str5, String str6) {
        this.f407a = str;
        this.f408b = str2;
        this.f409c = str3;
        this.f410d = bVar;
        this.f411e = str4;
        this.f412f = str5;
        this.f413g = str6;
    }
}
