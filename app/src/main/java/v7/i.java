package v7;

import v7.o;

/* compiled from: AutoValue_NetworkConnectionInfo.java */
/* loaded from: classes2.dex */
final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    private final o.c f37910a;

    /* renamed from: b  reason: collision with root package name */
    private final o.b f37911b;

    /* compiled from: AutoValue_NetworkConnectionInfo.java */
    /* loaded from: classes2.dex */
    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private o.c f37912a;

        /* renamed from: b  reason: collision with root package name */
        private o.b f37913b;

        @Override // v7.o.a
        public o a() {
            return new i(this.f37912a, this.f37913b);
        }

        @Override // v7.o.a
        public o.a b(o.b bVar) {
            this.f37913b = bVar;
            return this;
        }

        @Override // v7.o.a
        public o.a c(o.c cVar) {
            this.f37912a = cVar;
            return this;
        }
    }

    @Override // v7.o
    public o.b b() {
        return this.f37911b;
    }

    @Override // v7.o
    public o.c c() {
        return this.f37910a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.c cVar = this.f37910a;
            if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
                o.b bVar = this.f37911b;
                if (bVar == null) {
                    if (oVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(oVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f37910a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f37911b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f37910a + ", mobileSubtype=" + this.f37911b + "}";
    }

    private i(o.c cVar, o.b bVar) {
        this.f37910a = cVar;
        this.f37911b = bVar;
    }
}
