package v7;

import java.util.List;
import v7.m;

/* compiled from: AutoValue_LogRequest.java */
/* loaded from: classes2.dex */
final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    private final long f37895a;

    /* renamed from: b  reason: collision with root package name */
    private final long f37896b;

    /* renamed from: c  reason: collision with root package name */
    private final k f37897c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f37898d;

    /* renamed from: e  reason: collision with root package name */
    private final String f37899e;

    /* renamed from: f  reason: collision with root package name */
    private final List<l> f37900f;

    /* renamed from: g  reason: collision with root package name */
    private final p f37901g;

    /* compiled from: AutoValue_LogRequest.java */
    /* loaded from: classes2.dex */
    static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f37902a;

        /* renamed from: b  reason: collision with root package name */
        private Long f37903b;

        /* renamed from: c  reason: collision with root package name */
        private k f37904c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f37905d;

        /* renamed from: e  reason: collision with root package name */
        private String f37906e;

        /* renamed from: f  reason: collision with root package name */
        private List<l> f37907f;

        /* renamed from: g  reason: collision with root package name */
        private p f37908g;

        @Override // v7.m.a
        public m a() {
            String str = "";
            if (this.f37902a == null) {
                str = " requestTimeMs";
            }
            if (this.f37903b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f37902a.longValue(), this.f37903b.longValue(), this.f37904c, this.f37905d, this.f37906e, this.f37907f, this.f37908g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // v7.m.a
        public m.a b(k kVar) {
            this.f37904c = kVar;
            return this;
        }

        @Override // v7.m.a
        public m.a c(List<l> list) {
            this.f37907f = list;
            return this;
        }

        @Override // v7.m.a
        m.a d(Integer num) {
            this.f37905d = num;
            return this;
        }

        @Override // v7.m.a
        m.a e(String str) {
            this.f37906e = str;
            return this;
        }

        @Override // v7.m.a
        public m.a f(p pVar) {
            this.f37908g = pVar;
            return this;
        }

        @Override // v7.m.a
        public m.a g(long j10) {
            this.f37902a = Long.valueOf(j10);
            return this;
        }

        @Override // v7.m.a
        public m.a h(long j10) {
            this.f37903b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // v7.m
    public k b() {
        return this.f37897c;
    }

    @Override // v7.m
    public List<l> c() {
        return this.f37900f;
    }

    @Override // v7.m
    public Integer d() {
        return this.f37898d;
    }

    @Override // v7.m
    public String e() {
        return this.f37899e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f37895a == mVar.g() && this.f37896b == mVar.h() && ((kVar = this.f37897c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f37898d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f37899e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f37900f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
                p pVar = this.f37901g;
                if (pVar == null) {
                    if (mVar.f() == null) {
                        return true;
                    }
                } else if (pVar.equals(mVar.f())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // v7.m
    public p f() {
        return this.f37901g;
    }

    @Override // v7.m
    public long g() {
        return this.f37895a;
    }

    @Override // v7.m
    public long h() {
        return this.f37896b;
    }

    public int hashCode() {
        long j10 = this.f37895a;
        long j11 = this.f37896b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f37897c;
        int hashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f37898d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f37899e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f37900f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f37901g;
        return hashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f37895a + ", requestUptimeMs=" + this.f37896b + ", clientInfo=" + this.f37897c + ", logSource=" + this.f37898d + ", logSourceName=" + this.f37899e + ", logEvents=" + this.f37900f + ", qosTier=" + this.f37901g + "}";
    }

    private g(long j10, long j11, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.f37895a = j10;
        this.f37896b = j11;
        this.f37897c = kVar;
        this.f37898d = num;
        this.f37899e = str;
        this.f37900f = list;
        this.f37901g = pVar;
    }
}
