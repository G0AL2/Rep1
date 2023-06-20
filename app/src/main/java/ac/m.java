package ac;

import ac.a0;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
/* loaded from: classes3.dex */
final class m extends a0.e.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final b0<a0.e.d.a.b.AbstractC0018e> f460a;

    /* renamed from: b  reason: collision with root package name */
    private final a0.e.d.a.b.c f461b;

    /* renamed from: c  reason: collision with root package name */
    private final a0.a f462c;

    /* renamed from: d  reason: collision with root package name */
    private final a0.e.d.a.b.AbstractC0016d f463d;

    /* renamed from: e  reason: collision with root package name */
    private final b0<a0.e.d.a.b.AbstractC0012a> f464e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0014b {

        /* renamed from: a  reason: collision with root package name */
        private b0<a0.e.d.a.b.AbstractC0018e> f465a;

        /* renamed from: b  reason: collision with root package name */
        private a0.e.d.a.b.c f466b;

        /* renamed from: c  reason: collision with root package name */
        private a0.a f467c;

        /* renamed from: d  reason: collision with root package name */
        private a0.e.d.a.b.AbstractC0016d f468d;

        /* renamed from: e  reason: collision with root package name */
        private b0<a0.e.d.a.b.AbstractC0012a> f469e;

        @Override // ac.a0.e.d.a.b.AbstractC0014b
        public a0.e.d.a.b a() {
            String str = "";
            if (this.f468d == null) {
                str = " signal";
            }
            if (this.f469e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new m(this.f465a, this.f466b, this.f467c, this.f468d, this.f469e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.a0.e.d.a.b.AbstractC0014b
        public a0.e.d.a.b.AbstractC0014b b(a0.a aVar) {
            this.f467c = aVar;
            return this;
        }

        @Override // ac.a0.e.d.a.b.AbstractC0014b
        public a0.e.d.a.b.AbstractC0014b c(b0<a0.e.d.a.b.AbstractC0012a> b0Var) {
            Objects.requireNonNull(b0Var, "Null binaries");
            this.f469e = b0Var;
            return this;
        }

        @Override // ac.a0.e.d.a.b.AbstractC0014b
        public a0.e.d.a.b.AbstractC0014b d(a0.e.d.a.b.c cVar) {
            this.f466b = cVar;
            return this;
        }

        @Override // ac.a0.e.d.a.b.AbstractC0014b
        public a0.e.d.a.b.AbstractC0014b e(a0.e.d.a.b.AbstractC0016d abstractC0016d) {
            Objects.requireNonNull(abstractC0016d, "Null signal");
            this.f468d = abstractC0016d;
            return this;
        }

        @Override // ac.a0.e.d.a.b.AbstractC0014b
        public a0.e.d.a.b.AbstractC0014b f(b0<a0.e.d.a.b.AbstractC0018e> b0Var) {
            this.f465a = b0Var;
            return this;
        }
    }

    @Override // ac.a0.e.d.a.b
    public a0.a b() {
        return this.f462c;
    }

    @Override // ac.a0.e.d.a.b
    public b0<a0.e.d.a.b.AbstractC0012a> c() {
        return this.f464e;
    }

    @Override // ac.a0.e.d.a.b
    public a0.e.d.a.b.c d() {
        return this.f461b;
    }

    @Override // ac.a0.e.d.a.b
    public a0.e.d.a.b.AbstractC0016d e() {
        return this.f463d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b) {
            a0.e.d.a.b bVar = (a0.e.d.a.b) obj;
            b0<a0.e.d.a.b.AbstractC0018e> b0Var = this.f460a;
            if (b0Var != null ? b0Var.equals(bVar.f()) : bVar.f() == null) {
                a0.e.d.a.b.c cVar = this.f461b;
                if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                    a0.a aVar = this.f462c;
                    if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                        if (this.f463d.equals(bVar.e()) && this.f464e.equals(bVar.c())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // ac.a0.e.d.a.b
    public b0<a0.e.d.a.b.AbstractC0018e> f() {
        return this.f460a;
    }

    public int hashCode() {
        b0<a0.e.d.a.b.AbstractC0018e> b0Var = this.f460a;
        int hashCode = ((b0Var == null ? 0 : b0Var.hashCode()) ^ 1000003) * 1000003;
        a0.e.d.a.b.c cVar = this.f461b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        a0.a aVar = this.f462c;
        return ((((hashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f463d.hashCode()) * 1000003) ^ this.f464e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f460a + ", exception=" + this.f461b + ", appExitInfo=" + this.f462c + ", signal=" + this.f463d + ", binaries=" + this.f464e + "}";
    }

    private m(b0<a0.e.d.a.b.AbstractC0018e> b0Var, a0.e.d.a.b.c cVar, a0.a aVar, a0.e.d.a.b.AbstractC0016d abstractC0016d, b0<a0.e.d.a.b.AbstractC0012a> b0Var2) {
        this.f460a = b0Var;
        this.f461b = cVar;
        this.f462c = aVar;
        this.f463d = abstractC0016d;
        this.f464e = b0Var2;
    }
}
