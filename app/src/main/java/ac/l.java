package ac;

import ac.a0;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
/* loaded from: classes3.dex */
final class l extends a0.e.d.a {

    /* renamed from: a  reason: collision with root package name */
    private final a0.e.d.a.b f450a;

    /* renamed from: b  reason: collision with root package name */
    private final b0<a0.c> f451b;

    /* renamed from: c  reason: collision with root package name */
    private final b0<a0.c> f452c;

    /* renamed from: d  reason: collision with root package name */
    private final Boolean f453d;

    /* renamed from: e  reason: collision with root package name */
    private final int f454e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.d.a.AbstractC0011a {

        /* renamed from: a  reason: collision with root package name */
        private a0.e.d.a.b f455a;

        /* renamed from: b  reason: collision with root package name */
        private b0<a0.c> f456b;

        /* renamed from: c  reason: collision with root package name */
        private b0<a0.c> f457c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f458d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f459e;

        @Override // ac.a0.e.d.a.AbstractC0011a
        public a0.e.d.a a() {
            String str = "";
            if (this.f455a == null) {
                str = " execution";
            }
            if (this.f459e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new l(this.f455a, this.f456b, this.f457c, this.f458d, this.f459e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.a0.e.d.a.AbstractC0011a
        public a0.e.d.a.AbstractC0011a b(Boolean bool) {
            this.f458d = bool;
            return this;
        }

        @Override // ac.a0.e.d.a.AbstractC0011a
        public a0.e.d.a.AbstractC0011a c(b0<a0.c> b0Var) {
            this.f456b = b0Var;
            return this;
        }

        @Override // ac.a0.e.d.a.AbstractC0011a
        public a0.e.d.a.AbstractC0011a d(a0.e.d.a.b bVar) {
            Objects.requireNonNull(bVar, "Null execution");
            this.f455a = bVar;
            return this;
        }

        @Override // ac.a0.e.d.a.AbstractC0011a
        public a0.e.d.a.AbstractC0011a e(b0<a0.c> b0Var) {
            this.f457c = b0Var;
            return this;
        }

        @Override // ac.a0.e.d.a.AbstractC0011a
        public a0.e.d.a.AbstractC0011a f(int i10) {
            this.f459e = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(a0.e.d.a aVar) {
            this.f455a = aVar.d();
            this.f456b = aVar.c();
            this.f457c = aVar.e();
            this.f458d = aVar.b();
            this.f459e = Integer.valueOf(aVar.f());
        }
    }

    @Override // ac.a0.e.d.a
    public Boolean b() {
        return this.f453d;
    }

    @Override // ac.a0.e.d.a
    public b0<a0.c> c() {
        return this.f451b;
    }

    @Override // ac.a0.e.d.a
    public a0.e.d.a.b d() {
        return this.f450a;
    }

    @Override // ac.a0.e.d.a
    public b0<a0.c> e() {
        return this.f452c;
    }

    public boolean equals(Object obj) {
        b0<a0.c> b0Var;
        b0<a0.c> b0Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a) {
            a0.e.d.a aVar = (a0.e.d.a) obj;
            return this.f450a.equals(aVar.d()) && ((b0Var = this.f451b) != null ? b0Var.equals(aVar.c()) : aVar.c() == null) && ((b0Var2 = this.f452c) != null ? b0Var2.equals(aVar.e()) : aVar.e() == null) && ((bool = this.f453d) != null ? bool.equals(aVar.b()) : aVar.b() == null) && this.f454e == aVar.f();
        }
        return false;
    }

    @Override // ac.a0.e.d.a
    public int f() {
        return this.f454e;
    }

    @Override // ac.a0.e.d.a
    public a0.e.d.a.AbstractC0011a g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode = (this.f450a.hashCode() ^ 1000003) * 1000003;
        b0<a0.c> b0Var = this.f451b;
        int hashCode2 = (hashCode ^ (b0Var == null ? 0 : b0Var.hashCode())) * 1000003;
        b0<a0.c> b0Var2 = this.f452c;
        int hashCode3 = (hashCode2 ^ (b0Var2 == null ? 0 : b0Var2.hashCode())) * 1000003;
        Boolean bool = this.f453d;
        return ((hashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.f454e;
    }

    public String toString() {
        return "Application{execution=" + this.f450a + ", customAttributes=" + this.f451b + ", internalKeys=" + this.f452c + ", background=" + this.f453d + ", uiOrientation=" + this.f454e + "}";
    }

    private l(a0.e.d.a.b bVar, b0<a0.c> b0Var, b0<a0.c> b0Var2, Boolean bool, int i10) {
        this.f450a = bVar;
        this.f451b = b0Var;
        this.f452c = b0Var2;
        this.f453d = bool;
        this.f454e = i10;
    }
}
