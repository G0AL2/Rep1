package ac;

import ac.a0;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport.java */
/* loaded from: classes3.dex */
final class b extends a0 {

    /* renamed from: b  reason: collision with root package name */
    private final String f340b;

    /* renamed from: c  reason: collision with root package name */
    private final String f341c;

    /* renamed from: d  reason: collision with root package name */
    private final int f342d;

    /* renamed from: e  reason: collision with root package name */
    private final String f343e;

    /* renamed from: f  reason: collision with root package name */
    private final String f344f;

    /* renamed from: g  reason: collision with root package name */
    private final String f345g;

    /* renamed from: h  reason: collision with root package name */
    private final a0.e f346h;

    /* renamed from: i  reason: collision with root package name */
    private final a0.d f347i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport.java */
    /* renamed from: ac.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0024b extends a0.b {

        /* renamed from: a  reason: collision with root package name */
        private String f348a;

        /* renamed from: b  reason: collision with root package name */
        private String f349b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f350c;

        /* renamed from: d  reason: collision with root package name */
        private String f351d;

        /* renamed from: e  reason: collision with root package name */
        private String f352e;

        /* renamed from: f  reason: collision with root package name */
        private String f353f;

        /* renamed from: g  reason: collision with root package name */
        private a0.e f354g;

        /* renamed from: h  reason: collision with root package name */
        private a0.d f355h;

        @Override // ac.a0.b
        public a0 a() {
            String str = "";
            if (this.f348a == null) {
                str = " sdkVersion";
            }
            if (this.f349b == null) {
                str = str + " gmpAppId";
            }
            if (this.f350c == null) {
                str = str + " platform";
            }
            if (this.f351d == null) {
                str = str + " installationUuid";
            }
            if (this.f352e == null) {
                str = str + " buildVersion";
            }
            if (this.f353f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new b(this.f348a, this.f349b, this.f350c.intValue(), this.f351d, this.f352e, this.f353f, this.f354g, this.f355h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.a0.b
        public a0.b b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f352e = str;
            return this;
        }

        @Override // ac.a0.b
        public a0.b c(String str) {
            Objects.requireNonNull(str, "Null displayVersion");
            this.f353f = str;
            return this;
        }

        @Override // ac.a0.b
        public a0.b d(String str) {
            Objects.requireNonNull(str, "Null gmpAppId");
            this.f349b = str;
            return this;
        }

        @Override // ac.a0.b
        public a0.b e(String str) {
            Objects.requireNonNull(str, "Null installationUuid");
            this.f351d = str;
            return this;
        }

        @Override // ac.a0.b
        public a0.b f(a0.d dVar) {
            this.f355h = dVar;
            return this;
        }

        @Override // ac.a0.b
        public a0.b g(int i10) {
            this.f350c = Integer.valueOf(i10);
            return this;
        }

        @Override // ac.a0.b
        public a0.b h(String str) {
            Objects.requireNonNull(str, "Null sdkVersion");
            this.f348a = str;
            return this;
        }

        @Override // ac.a0.b
        public a0.b i(a0.e eVar) {
            this.f354g = eVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0024b() {
        }

        private C0024b(a0 a0Var) {
            this.f348a = a0Var.i();
            this.f349b = a0Var.e();
            this.f350c = Integer.valueOf(a0Var.h());
            this.f351d = a0Var.f();
            this.f352e = a0Var.c();
            this.f353f = a0Var.d();
            this.f354g = a0Var.j();
            this.f355h = a0Var.g();
        }
    }

    @Override // ac.a0
    public String c() {
        return this.f344f;
    }

    @Override // ac.a0
    public String d() {
        return this.f345g;
    }

    @Override // ac.a0
    public String e() {
        return this.f341c;
    }

    public boolean equals(Object obj) {
        a0.e eVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.f340b.equals(a0Var.i()) && this.f341c.equals(a0Var.e()) && this.f342d == a0Var.h() && this.f343e.equals(a0Var.f()) && this.f344f.equals(a0Var.c()) && this.f345g.equals(a0Var.d()) && ((eVar = this.f346h) != null ? eVar.equals(a0Var.j()) : a0Var.j() == null)) {
                a0.d dVar = this.f347i;
                if (dVar == null) {
                    if (a0Var.g() == null) {
                        return true;
                    }
                } else if (dVar.equals(a0Var.g())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // ac.a0
    public String f() {
        return this.f343e;
    }

    @Override // ac.a0
    public a0.d g() {
        return this.f347i;
    }

    @Override // ac.a0
    public int h() {
        return this.f342d;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f340b.hashCode() ^ 1000003) * 1000003) ^ this.f341c.hashCode()) * 1000003) ^ this.f342d) * 1000003) ^ this.f343e.hashCode()) * 1000003) ^ this.f344f.hashCode()) * 1000003) ^ this.f345g.hashCode()) * 1000003;
        a0.e eVar = this.f346h;
        int hashCode2 = (hashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        a0.d dVar = this.f347i;
        return hashCode2 ^ (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // ac.a0
    public String i() {
        return this.f340b;
    }

    @Override // ac.a0
    public a0.e j() {
        return this.f346h;
    }

    @Override // ac.a0
    protected a0.b k() {
        return new C0024b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f340b + ", gmpAppId=" + this.f341c + ", platform=" + this.f342d + ", installationUuid=" + this.f343e + ", buildVersion=" + this.f344f + ", displayVersion=" + this.f345g + ", session=" + this.f346h + ", ndkPayload=" + this.f347i + "}";
    }

    private b(String str, String str2, int i10, String str3, String str4, String str5, a0.e eVar, a0.d dVar) {
        this.f340b = str;
        this.f341c = str2;
        this.f342d = i10;
        this.f343e = str3;
        this.f344f = str4;
        this.f345g = str5;
        this.f346h = eVar;
        this.f347i = dVar;
    }
}
