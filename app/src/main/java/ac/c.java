package ac;

import ac.a0;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
/* loaded from: classes3.dex */
final class c extends a0.a {

    /* renamed from: a  reason: collision with root package name */
    private final int f357a;

    /* renamed from: b  reason: collision with root package name */
    private final String f358b;

    /* renamed from: c  reason: collision with root package name */
    private final int f359c;

    /* renamed from: d  reason: collision with root package name */
    private final int f360d;

    /* renamed from: e  reason: collision with root package name */
    private final long f361e;

    /* renamed from: f  reason: collision with root package name */
    private final long f362f;

    /* renamed from: g  reason: collision with root package name */
    private final long f363g;

    /* renamed from: h  reason: collision with root package name */
    private final String f364h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
    /* loaded from: classes3.dex */
    public static final class b extends a0.a.AbstractC0009a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f365a;

        /* renamed from: b  reason: collision with root package name */
        private String f366b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f367c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f368d;

        /* renamed from: e  reason: collision with root package name */
        private Long f369e;

        /* renamed from: f  reason: collision with root package name */
        private Long f370f;

        /* renamed from: g  reason: collision with root package name */
        private Long f371g;

        /* renamed from: h  reason: collision with root package name */
        private String f372h;

        @Override // ac.a0.a.AbstractC0009a
        public a0.a a() {
            String str = "";
            if (this.f365a == null) {
                str = " pid";
            }
            if (this.f366b == null) {
                str = str + " processName";
            }
            if (this.f367c == null) {
                str = str + " reasonCode";
            }
            if (this.f368d == null) {
                str = str + " importance";
            }
            if (this.f369e == null) {
                str = str + " pss";
            }
            if (this.f370f == null) {
                str = str + " rss";
            }
            if (this.f371g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new c(this.f365a.intValue(), this.f366b, this.f367c.intValue(), this.f368d.intValue(), this.f369e.longValue(), this.f370f.longValue(), this.f371g.longValue(), this.f372h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.a0.a.AbstractC0009a
        public a0.a.AbstractC0009a b(int i10) {
            this.f368d = Integer.valueOf(i10);
            return this;
        }

        @Override // ac.a0.a.AbstractC0009a
        public a0.a.AbstractC0009a c(int i10) {
            this.f365a = Integer.valueOf(i10);
            return this;
        }

        @Override // ac.a0.a.AbstractC0009a
        public a0.a.AbstractC0009a d(String str) {
            Objects.requireNonNull(str, "Null processName");
            this.f366b = str;
            return this;
        }

        @Override // ac.a0.a.AbstractC0009a
        public a0.a.AbstractC0009a e(long j10) {
            this.f369e = Long.valueOf(j10);
            return this;
        }

        @Override // ac.a0.a.AbstractC0009a
        public a0.a.AbstractC0009a f(int i10) {
            this.f367c = Integer.valueOf(i10);
            return this;
        }

        @Override // ac.a0.a.AbstractC0009a
        public a0.a.AbstractC0009a g(long j10) {
            this.f370f = Long.valueOf(j10);
            return this;
        }

        @Override // ac.a0.a.AbstractC0009a
        public a0.a.AbstractC0009a h(long j10) {
            this.f371g = Long.valueOf(j10);
            return this;
        }

        @Override // ac.a0.a.AbstractC0009a
        public a0.a.AbstractC0009a i(String str) {
            this.f372h = str;
            return this;
        }
    }

    @Override // ac.a0.a
    public int b() {
        return this.f360d;
    }

    @Override // ac.a0.a
    public int c() {
        return this.f357a;
    }

    @Override // ac.a0.a
    public String d() {
        return this.f358b;
    }

    @Override // ac.a0.a
    public long e() {
        return this.f361e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.a) {
            a0.a aVar = (a0.a) obj;
            if (this.f357a == aVar.c() && this.f358b.equals(aVar.d()) && this.f359c == aVar.f() && this.f360d == aVar.b() && this.f361e == aVar.e() && this.f362f == aVar.g() && this.f363g == aVar.h()) {
                String str = this.f364h;
                if (str == null) {
                    if (aVar.i() == null) {
                        return true;
                    }
                } else if (str.equals(aVar.i())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // ac.a0.a
    public int f() {
        return this.f359c;
    }

    @Override // ac.a0.a
    public long g() {
        return this.f362f;
    }

    @Override // ac.a0.a
    public long h() {
        return this.f363g;
    }

    public int hashCode() {
        long j10 = this.f361e;
        long j11 = this.f362f;
        long j12 = this.f363g;
        int hashCode = (((((((((((((this.f357a ^ 1000003) * 1000003) ^ this.f358b.hashCode()) * 1000003) ^ this.f359c) * 1000003) ^ this.f360d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f364h;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // ac.a0.a
    public String i() {
        return this.f364h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f357a + ", processName=" + this.f358b + ", reasonCode=" + this.f359c + ", importance=" + this.f360d + ", pss=" + this.f361e + ", rss=" + this.f362f + ", timestamp=" + this.f363g + ", traceFile=" + this.f364h + "}";
    }

    private c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2) {
        this.f357a = i10;
        this.f358b = str;
        this.f359c = i11;
        this.f360d = i12;
        this.f361e = j10;
        this.f362f = j11;
        this.f363g = j12;
        this.f364h = str2;
    }
}
