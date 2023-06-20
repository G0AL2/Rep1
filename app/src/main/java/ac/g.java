package ac;

import ac.a0;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session.java */
/* loaded from: classes3.dex */
final class g extends a0.e {

    /* renamed from: a  reason: collision with root package name */
    private final String f385a;

    /* renamed from: b  reason: collision with root package name */
    private final String f386b;

    /* renamed from: c  reason: collision with root package name */
    private final long f387c;

    /* renamed from: d  reason: collision with root package name */
    private final Long f388d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f389e;

    /* renamed from: f  reason: collision with root package name */
    private final a0.e.a f390f;

    /* renamed from: g  reason: collision with root package name */
    private final a0.e.f f391g;

    /* renamed from: h  reason: collision with root package name */
    private final a0.e.AbstractC0023e f392h;

    /* renamed from: i  reason: collision with root package name */
    private final a0.e.c f393i;

    /* renamed from: j  reason: collision with root package name */
    private final b0<a0.e.d> f394j;

    /* renamed from: k  reason: collision with root package name */
    private final int f395k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session.java */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.b {

        /* renamed from: a  reason: collision with root package name */
        private String f396a;

        /* renamed from: b  reason: collision with root package name */
        private String f397b;

        /* renamed from: c  reason: collision with root package name */
        private Long f398c;

        /* renamed from: d  reason: collision with root package name */
        private Long f399d;

        /* renamed from: e  reason: collision with root package name */
        private Boolean f400e;

        /* renamed from: f  reason: collision with root package name */
        private a0.e.a f401f;

        /* renamed from: g  reason: collision with root package name */
        private a0.e.f f402g;

        /* renamed from: h  reason: collision with root package name */
        private a0.e.AbstractC0023e f403h;

        /* renamed from: i  reason: collision with root package name */
        private a0.e.c f404i;

        /* renamed from: j  reason: collision with root package name */
        private b0<a0.e.d> f405j;

        /* renamed from: k  reason: collision with root package name */
        private Integer f406k;

        @Override // ac.a0.e.b
        public a0.e a() {
            String str = "";
            if (this.f396a == null) {
                str = " generator";
            }
            if (this.f397b == null) {
                str = str + " identifier";
            }
            if (this.f398c == null) {
                str = str + " startedAt";
            }
            if (this.f400e == null) {
                str = str + " crashed";
            }
            if (this.f401f == null) {
                str = str + " app";
            }
            if (this.f406k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new g(this.f396a, this.f397b, this.f398c.longValue(), this.f399d, this.f400e.booleanValue(), this.f401f, this.f402g, this.f403h, this.f404i, this.f405j, this.f406k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.a0.e.b
        public a0.e.b b(a0.e.a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f401f = aVar;
            return this;
        }

        @Override // ac.a0.e.b
        public a0.e.b c(boolean z10) {
            this.f400e = Boolean.valueOf(z10);
            return this;
        }

        @Override // ac.a0.e.b
        public a0.e.b d(a0.e.c cVar) {
            this.f404i = cVar;
            return this;
        }

        @Override // ac.a0.e.b
        public a0.e.b e(Long l10) {
            this.f399d = l10;
            return this;
        }

        @Override // ac.a0.e.b
        public a0.e.b f(b0<a0.e.d> b0Var) {
            this.f405j = b0Var;
            return this;
        }

        @Override // ac.a0.e.b
        public a0.e.b g(String str) {
            Objects.requireNonNull(str, "Null generator");
            this.f396a = str;
            return this;
        }

        @Override // ac.a0.e.b
        public a0.e.b h(int i10) {
            this.f406k = Integer.valueOf(i10);
            return this;
        }

        @Override // ac.a0.e.b
        public a0.e.b i(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f397b = str;
            return this;
        }

        @Override // ac.a0.e.b
        public a0.e.b k(a0.e.AbstractC0023e abstractC0023e) {
            this.f403h = abstractC0023e;
            return this;
        }

        @Override // ac.a0.e.b
        public a0.e.b l(long j10) {
            this.f398c = Long.valueOf(j10);
            return this;
        }

        @Override // ac.a0.e.b
        public a0.e.b m(a0.e.f fVar) {
            this.f402g = fVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(a0.e eVar) {
            this.f396a = eVar.f();
            this.f397b = eVar.h();
            this.f398c = Long.valueOf(eVar.k());
            this.f399d = eVar.d();
            this.f400e = Boolean.valueOf(eVar.m());
            this.f401f = eVar.b();
            this.f402g = eVar.l();
            this.f403h = eVar.j();
            this.f404i = eVar.c();
            this.f405j = eVar.e();
            this.f406k = Integer.valueOf(eVar.g());
        }
    }

    @Override // ac.a0.e
    public a0.e.a b() {
        return this.f390f;
    }

    @Override // ac.a0.e
    public a0.e.c c() {
        return this.f393i;
    }

    @Override // ac.a0.e
    public Long d() {
        return this.f388d;
    }

    @Override // ac.a0.e
    public b0<a0.e.d> e() {
        return this.f394j;
    }

    public boolean equals(Object obj) {
        Long l10;
        a0.e.f fVar;
        a0.e.AbstractC0023e abstractC0023e;
        a0.e.c cVar;
        b0<a0.e.d> b0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e) {
            a0.e eVar = (a0.e) obj;
            return this.f385a.equals(eVar.f()) && this.f386b.equals(eVar.h()) && this.f387c == eVar.k() && ((l10 = this.f388d) != null ? l10.equals(eVar.d()) : eVar.d() == null) && this.f389e == eVar.m() && this.f390f.equals(eVar.b()) && ((fVar = this.f391g) != null ? fVar.equals(eVar.l()) : eVar.l() == null) && ((abstractC0023e = this.f392h) != null ? abstractC0023e.equals(eVar.j()) : eVar.j() == null) && ((cVar = this.f393i) != null ? cVar.equals(eVar.c()) : eVar.c() == null) && ((b0Var = this.f394j) != null ? b0Var.equals(eVar.e()) : eVar.e() == null) && this.f395k == eVar.g();
        }
        return false;
    }

    @Override // ac.a0.e
    public String f() {
        return this.f385a;
    }

    @Override // ac.a0.e
    public int g() {
        return this.f395k;
    }

    @Override // ac.a0.e
    public String h() {
        return this.f386b;
    }

    public int hashCode() {
        long j10 = this.f387c;
        int hashCode = (((((this.f385a.hashCode() ^ 1000003) * 1000003) ^ this.f386b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f388d;
        int hashCode2 = (((((hashCode ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f389e ? 1231 : 1237)) * 1000003) ^ this.f390f.hashCode()) * 1000003;
        a0.e.f fVar = this.f391g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        a0.e.AbstractC0023e abstractC0023e = this.f392h;
        int hashCode4 = (hashCode3 ^ (abstractC0023e == null ? 0 : abstractC0023e.hashCode())) * 1000003;
        a0.e.c cVar = this.f393i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        b0<a0.e.d> b0Var = this.f394j;
        return ((hashCode5 ^ (b0Var != null ? b0Var.hashCode() : 0)) * 1000003) ^ this.f395k;
    }

    @Override // ac.a0.e
    public a0.e.AbstractC0023e j() {
        return this.f392h;
    }

    @Override // ac.a0.e
    public long k() {
        return this.f387c;
    }

    @Override // ac.a0.e
    public a0.e.f l() {
        return this.f391g;
    }

    @Override // ac.a0.e
    public boolean m() {
        return this.f389e;
    }

    @Override // ac.a0.e
    public a0.e.b n() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f385a + ", identifier=" + this.f386b + ", startedAt=" + this.f387c + ", endedAt=" + this.f388d + ", crashed=" + this.f389e + ", app=" + this.f390f + ", user=" + this.f391g + ", os=" + this.f392h + ", device=" + this.f393i + ", events=" + this.f394j + ", generatorType=" + this.f395k + "}";
    }

    private g(String str, String str2, long j10, Long l10, boolean z10, a0.e.a aVar, a0.e.f fVar, a0.e.AbstractC0023e abstractC0023e, a0.e.c cVar, b0<a0.e.d> b0Var, int i10) {
        this.f385a = str;
        this.f386b = str2;
        this.f387c = j10;
        this.f388d = l10;
        this.f389e = z10;
        this.f390f = aVar;
        this.f391g = fVar;
        this.f392h = abstractC0023e;
        this.f393i = cVar;
        this.f394j = b0Var;
        this.f395k = i10;
    }
}
