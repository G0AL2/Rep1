package wc;

import wc.d;

/* compiled from: AutoValue_InstallationResponse.java */
/* loaded from: classes3.dex */
final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final String f38542a;

    /* renamed from: b  reason: collision with root package name */
    private final String f38543b;

    /* renamed from: c  reason: collision with root package name */
    private final String f38544c;

    /* renamed from: d  reason: collision with root package name */
    private final f f38545d;

    /* renamed from: e  reason: collision with root package name */
    private final d.b f38546e;

    /* compiled from: AutoValue_InstallationResponse.java */
    /* loaded from: classes3.dex */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f38547a;

        /* renamed from: b  reason: collision with root package name */
        private String f38548b;

        /* renamed from: c  reason: collision with root package name */
        private String f38549c;

        /* renamed from: d  reason: collision with root package name */
        private f f38550d;

        /* renamed from: e  reason: collision with root package name */
        private d.b f38551e;

        @Override // wc.d.a
        public d a() {
            return new a(this.f38547a, this.f38548b, this.f38549c, this.f38550d, this.f38551e);
        }

        @Override // wc.d.a
        public d.a b(f fVar) {
            this.f38550d = fVar;
            return this;
        }

        @Override // wc.d.a
        public d.a c(String str) {
            this.f38548b = str;
            return this;
        }

        @Override // wc.d.a
        public d.a d(String str) {
            this.f38549c = str;
            return this;
        }

        @Override // wc.d.a
        public d.a e(d.b bVar) {
            this.f38551e = bVar;
            return this;
        }

        @Override // wc.d.a
        public d.a f(String str) {
            this.f38547a = str;
            return this;
        }
    }

    @Override // wc.d
    public f b() {
        return this.f38545d;
    }

    @Override // wc.d
    public String c() {
        return this.f38543b;
    }

    @Override // wc.d
    public String d() {
        return this.f38544c;
    }

    @Override // wc.d
    public d.b e() {
        return this.f38546e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f38542a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.f38543b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f38544c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f38545d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f38546e;
                            if (bVar == null) {
                                if (dVar.e() == null) {
                                    return true;
                                }
                            } else if (bVar.equals(dVar.e())) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // wc.d
    public String f() {
        return this.f38542a;
    }

    public int hashCode() {
        String str = this.f38542a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f38543b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f38544c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f38545d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f38546e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f38542a + ", fid=" + this.f38543b + ", refreshToken=" + this.f38544c + ", authToken=" + this.f38545d + ", responseCode=" + this.f38546e + "}";
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f38542a = str;
        this.f38543b = str2;
        this.f38544c = str3;
        this.f38545d = fVar;
        this.f38546e = bVar;
    }
}
