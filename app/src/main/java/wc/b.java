package wc;

import wc.f;

/* compiled from: AutoValue_TokenResult.java */
/* loaded from: classes3.dex */
final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f38552a;

    /* renamed from: b  reason: collision with root package name */
    private final long f38553b;

    /* renamed from: c  reason: collision with root package name */
    private final f.b f38554c;

    /* compiled from: AutoValue_TokenResult.java */
    /* renamed from: wc.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0532b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f38555a;

        /* renamed from: b  reason: collision with root package name */
        private Long f38556b;

        /* renamed from: c  reason: collision with root package name */
        private f.b f38557c;

        @Override // wc.f.a
        public f a() {
            String str = "";
            if (this.f38556b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f38555a, this.f38556b.longValue(), this.f38557c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // wc.f.a
        public f.a b(f.b bVar) {
            this.f38557c = bVar;
            return this;
        }

        @Override // wc.f.a
        public f.a c(String str) {
            this.f38555a = str;
            return this;
        }

        @Override // wc.f.a
        public f.a d(long j10) {
            this.f38556b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // wc.f
    public f.b b() {
        return this.f38554c;
    }

    @Override // wc.f
    public String c() {
        return this.f38552a;
    }

    @Override // wc.f
    public long d() {
        return this.f38553b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f38552a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.f38553b == fVar.d()) {
                    f.b bVar = this.f38554c;
                    if (bVar == null) {
                        if (fVar.b() == null) {
                            return true;
                        }
                    } else if (bVar.equals(fVar.b())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f38552a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f38553b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f38554c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f38552a + ", tokenExpirationTimestamp=" + this.f38553b + ", responseCode=" + this.f38554c + "}";
    }

    private b(String str, long j10, f.b bVar) {
        this.f38552a = str;
        this.f38553b = j10;
        this.f38554c = bVar;
    }
}
