package w7;

import java.util.Objects;
import w7.n;

/* compiled from: AutoValue_SendRequest.java */
/* loaded from: classes2.dex */
final class c extends n {

    /* renamed from: a  reason: collision with root package name */
    private final o f38265a;

    /* renamed from: b  reason: collision with root package name */
    private final String f38266b;

    /* renamed from: c  reason: collision with root package name */
    private final u7.c<?> f38267c;

    /* renamed from: d  reason: collision with root package name */
    private final u7.e<?, byte[]> f38268d;

    /* renamed from: e  reason: collision with root package name */
    private final u7.b f38269e;

    /* compiled from: AutoValue_SendRequest.java */
    /* loaded from: classes2.dex */
    static final class b extends n.a {

        /* renamed from: a  reason: collision with root package name */
        private o f38270a;

        /* renamed from: b  reason: collision with root package name */
        private String f38271b;

        /* renamed from: c  reason: collision with root package name */
        private u7.c<?> f38272c;

        /* renamed from: d  reason: collision with root package name */
        private u7.e<?, byte[]> f38273d;

        /* renamed from: e  reason: collision with root package name */
        private u7.b f38274e;

        @Override // w7.n.a
        public n a() {
            String str = "";
            if (this.f38270a == null) {
                str = " transportContext";
            }
            if (this.f38271b == null) {
                str = str + " transportName";
            }
            if (this.f38272c == null) {
                str = str + " event";
            }
            if (this.f38273d == null) {
                str = str + " transformer";
            }
            if (this.f38274e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f38270a, this.f38271b, this.f38272c, this.f38273d, this.f38274e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // w7.n.a
        n.a b(u7.b bVar) {
            Objects.requireNonNull(bVar, "Null encoding");
            this.f38274e = bVar;
            return this;
        }

        @Override // w7.n.a
        n.a c(u7.c<?> cVar) {
            Objects.requireNonNull(cVar, "Null event");
            this.f38272c = cVar;
            return this;
        }

        @Override // w7.n.a
        n.a d(u7.e<?, byte[]> eVar) {
            Objects.requireNonNull(eVar, "Null transformer");
            this.f38273d = eVar;
            return this;
        }

        @Override // w7.n.a
        public n.a e(o oVar) {
            Objects.requireNonNull(oVar, "Null transportContext");
            this.f38270a = oVar;
            return this;
        }

        @Override // w7.n.a
        public n.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f38271b = str;
            return this;
        }
    }

    @Override // w7.n
    public u7.b b() {
        return this.f38269e;
    }

    @Override // w7.n
    u7.c<?> c() {
        return this.f38267c;
    }

    @Override // w7.n
    u7.e<?, byte[]> e() {
        return this.f38268d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.f38265a.equals(nVar.f()) && this.f38266b.equals(nVar.g()) && this.f38267c.equals(nVar.c()) && this.f38268d.equals(nVar.e()) && this.f38269e.equals(nVar.b());
        }
        return false;
    }

    @Override // w7.n
    public o f() {
        return this.f38265a;
    }

    @Override // w7.n
    public String g() {
        return this.f38266b;
    }

    public int hashCode() {
        return ((((((((this.f38265a.hashCode() ^ 1000003) * 1000003) ^ this.f38266b.hashCode()) * 1000003) ^ this.f38267c.hashCode()) * 1000003) ^ this.f38268d.hashCode()) * 1000003) ^ this.f38269e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f38265a + ", transportName=" + this.f38266b + ", event=" + this.f38267c + ", transformer=" + this.f38268d + ", encoding=" + this.f38269e + "}";
    }

    private c(o oVar, String str, u7.c<?> cVar, u7.e<?, byte[]> eVar, u7.b bVar) {
        this.f38265a = oVar;
        this.f38266b = str;
        this.f38267c = cVar;
        this.f38268d = eVar;
        this.f38269e = bVar;
    }
}
