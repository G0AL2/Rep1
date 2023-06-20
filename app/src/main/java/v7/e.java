package v7;

import v7.k;

/* compiled from: AutoValue_ClientInfo.java */
/* loaded from: classes2.dex */
final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    private final k.b f37877a;

    /* renamed from: b  reason: collision with root package name */
    private final v7.a f37878b;

    /* compiled from: AutoValue_ClientInfo.java */
    /* loaded from: classes2.dex */
    static final class b extends k.a {

        /* renamed from: a  reason: collision with root package name */
        private k.b f37879a;

        /* renamed from: b  reason: collision with root package name */
        private v7.a f37880b;

        @Override // v7.k.a
        public k a() {
            return new e(this.f37879a, this.f37880b);
        }

        @Override // v7.k.a
        public k.a b(v7.a aVar) {
            this.f37880b = aVar;
            return this;
        }

        @Override // v7.k.a
        public k.a c(k.b bVar) {
            this.f37879a = bVar;
            return this;
        }
    }

    @Override // v7.k
    public v7.a b() {
        return this.f37878b;
    }

    @Override // v7.k
    public k.b c() {
        return this.f37877a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            k.b bVar = this.f37877a;
            if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
                v7.a aVar = this.f37878b;
                if (aVar == null) {
                    if (kVar.b() == null) {
                        return true;
                    }
                } else if (aVar.equals(kVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f37877a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        v7.a aVar = this.f37878b;
        return hashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f37877a + ", androidClientInfo=" + this.f37878b + "}";
    }

    private e(k.b bVar, v7.a aVar) {
        this.f37877a = bVar;
        this.f37878b = aVar;
    }
}
