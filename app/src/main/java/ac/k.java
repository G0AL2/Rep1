package ac;

import ac.a0;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
/* loaded from: classes3.dex */
final class k extends a0.e.d {

    /* renamed from: a  reason: collision with root package name */
    private final long f440a;

    /* renamed from: b  reason: collision with root package name */
    private final String f441b;

    /* renamed from: c  reason: collision with root package name */
    private final a0.e.d.a f442c;

    /* renamed from: d  reason: collision with root package name */
    private final a0.e.d.c f443d;

    /* renamed from: e  reason: collision with root package name */
    private final a0.e.d.AbstractC0022d f444e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.d.b {

        /* renamed from: a  reason: collision with root package name */
        private Long f445a;

        /* renamed from: b  reason: collision with root package name */
        private String f446b;

        /* renamed from: c  reason: collision with root package name */
        private a0.e.d.a f447c;

        /* renamed from: d  reason: collision with root package name */
        private a0.e.d.c f448d;

        /* renamed from: e  reason: collision with root package name */
        private a0.e.d.AbstractC0022d f449e;

        @Override // ac.a0.e.d.b
        public a0.e.d a() {
            String str = "";
            if (this.f445a == null) {
                str = " timestamp";
            }
            if (this.f446b == null) {
                str = str + " type";
            }
            if (this.f447c == null) {
                str = str + " app";
            }
            if (this.f448d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new k(this.f445a.longValue(), this.f446b, this.f447c, this.f448d, this.f449e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.a0.e.d.b
        public a0.e.d.b b(a0.e.d.a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f447c = aVar;
            return this;
        }

        @Override // ac.a0.e.d.b
        public a0.e.d.b c(a0.e.d.c cVar) {
            Objects.requireNonNull(cVar, "Null device");
            this.f448d = cVar;
            return this;
        }

        @Override // ac.a0.e.d.b
        public a0.e.d.b d(a0.e.d.AbstractC0022d abstractC0022d) {
            this.f449e = abstractC0022d;
            return this;
        }

        @Override // ac.a0.e.d.b
        public a0.e.d.b e(long j10) {
            this.f445a = Long.valueOf(j10);
            return this;
        }

        @Override // ac.a0.e.d.b
        public a0.e.d.b f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f446b = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(a0.e.d dVar) {
            this.f445a = Long.valueOf(dVar.e());
            this.f446b = dVar.f();
            this.f447c = dVar.b();
            this.f448d = dVar.c();
            this.f449e = dVar.d();
        }
    }

    @Override // ac.a0.e.d
    public a0.e.d.a b() {
        return this.f442c;
    }

    @Override // ac.a0.e.d
    public a0.e.d.c c() {
        return this.f443d;
    }

    @Override // ac.a0.e.d
    public a0.e.d.AbstractC0022d d() {
        return this.f444e;
    }

    @Override // ac.a0.e.d
    public long e() {
        return this.f440a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d) {
            a0.e.d dVar = (a0.e.d) obj;
            if (this.f440a == dVar.e() && this.f441b.equals(dVar.f()) && this.f442c.equals(dVar.b()) && this.f443d.equals(dVar.c())) {
                a0.e.d.AbstractC0022d abstractC0022d = this.f444e;
                if (abstractC0022d == null) {
                    if (dVar.d() == null) {
                        return true;
                    }
                } else if (abstractC0022d.equals(dVar.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // ac.a0.e.d
    public String f() {
        return this.f441b;
    }

    @Override // ac.a0.e.d
    public a0.e.d.b g() {
        return new b(this);
    }

    public int hashCode() {
        long j10 = this.f440a;
        int hashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f441b.hashCode()) * 1000003) ^ this.f442c.hashCode()) * 1000003) ^ this.f443d.hashCode()) * 1000003;
        a0.e.d.AbstractC0022d abstractC0022d = this.f444e;
        return (abstractC0022d == null ? 0 : abstractC0022d.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "Event{timestamp=" + this.f440a + ", type=" + this.f441b + ", app=" + this.f442c + ", device=" + this.f443d + ", log=" + this.f444e + "}";
    }

    private k(long j10, String str, a0.e.d.a aVar, a0.e.d.c cVar, a0.e.d.AbstractC0022d abstractC0022d) {
        this.f440a = j10;
        this.f441b = str;
        this.f442c = aVar;
        this.f443d = cVar;
        this.f444e = abstractC0022d;
    }
}
