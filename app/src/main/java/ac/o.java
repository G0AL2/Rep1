package ac;

import ac.a0;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
/* loaded from: classes3.dex */
final class o extends a0.e.d.a.b.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f478a;

    /* renamed from: b  reason: collision with root package name */
    private final String f479b;

    /* renamed from: c  reason: collision with root package name */
    private final b0<a0.e.d.a.b.AbstractC0018e.AbstractC0020b> f480c;

    /* renamed from: d  reason: collision with root package name */
    private final a0.e.d.a.b.c f481d;

    /* renamed from: e  reason: collision with root package name */
    private final int f482e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.d.a.b.c.AbstractC0015a {

        /* renamed from: a  reason: collision with root package name */
        private String f483a;

        /* renamed from: b  reason: collision with root package name */
        private String f484b;

        /* renamed from: c  reason: collision with root package name */
        private b0<a0.e.d.a.b.AbstractC0018e.AbstractC0020b> f485c;

        /* renamed from: d  reason: collision with root package name */
        private a0.e.d.a.b.c f486d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f487e;

        @Override // ac.a0.e.d.a.b.c.AbstractC0015a
        public a0.e.d.a.b.c a() {
            String str = "";
            if (this.f483a == null) {
                str = " type";
            }
            if (this.f485c == null) {
                str = str + " frames";
            }
            if (this.f487e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new o(this.f483a, this.f484b, this.f485c, this.f486d, this.f487e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.a0.e.d.a.b.c.AbstractC0015a
        public a0.e.d.a.b.c.AbstractC0015a b(a0.e.d.a.b.c cVar) {
            this.f486d = cVar;
            return this;
        }

        @Override // ac.a0.e.d.a.b.c.AbstractC0015a
        public a0.e.d.a.b.c.AbstractC0015a c(b0<a0.e.d.a.b.AbstractC0018e.AbstractC0020b> b0Var) {
            Objects.requireNonNull(b0Var, "Null frames");
            this.f485c = b0Var;
            return this;
        }

        @Override // ac.a0.e.d.a.b.c.AbstractC0015a
        public a0.e.d.a.b.c.AbstractC0015a d(int i10) {
            this.f487e = Integer.valueOf(i10);
            return this;
        }

        @Override // ac.a0.e.d.a.b.c.AbstractC0015a
        public a0.e.d.a.b.c.AbstractC0015a e(String str) {
            this.f484b = str;
            return this;
        }

        @Override // ac.a0.e.d.a.b.c.AbstractC0015a
        public a0.e.d.a.b.c.AbstractC0015a f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f483a = str;
            return this;
        }
    }

    @Override // ac.a0.e.d.a.b.c
    public a0.e.d.a.b.c b() {
        return this.f481d;
    }

    @Override // ac.a0.e.d.a.b.c
    public b0<a0.e.d.a.b.AbstractC0018e.AbstractC0020b> c() {
        return this.f480c;
    }

    @Override // ac.a0.e.d.a.b.c
    public int d() {
        return this.f482e;
    }

    @Override // ac.a0.e.d.a.b.c
    public String e() {
        return this.f479b;
    }

    public boolean equals(Object obj) {
        String str;
        a0.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.c) {
            a0.e.d.a.b.c cVar2 = (a0.e.d.a.b.c) obj;
            return this.f478a.equals(cVar2.f()) && ((str = this.f479b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f480c.equals(cVar2.c()) && ((cVar = this.f481d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f482e == cVar2.d();
        }
        return false;
    }

    @Override // ac.a0.e.d.a.b.c
    public String f() {
        return this.f478a;
    }

    public int hashCode() {
        int hashCode = (this.f478a.hashCode() ^ 1000003) * 1000003;
        String str = this.f479b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f480c.hashCode()) * 1000003;
        a0.e.d.a.b.c cVar = this.f481d;
        return ((hashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f482e;
    }

    public String toString() {
        return "Exception{type=" + this.f478a + ", reason=" + this.f479b + ", frames=" + this.f480c + ", causedBy=" + this.f481d + ", overflowCount=" + this.f482e + "}";
    }

    private o(String str, String str2, b0<a0.e.d.a.b.AbstractC0018e.AbstractC0020b> b0Var, a0.e.d.a.b.c cVar, int i10) {
        this.f478a = str;
        this.f479b = str2;
        this.f480c = b0Var;
        this.f481d = cVar;
        this.f482e = i10;
    }
}
