package ac;

import ac.a0;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
/* loaded from: classes3.dex */
final class j extends a0.e.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f422a;

    /* renamed from: b  reason: collision with root package name */
    private final String f423b;

    /* renamed from: c  reason: collision with root package name */
    private final int f424c;

    /* renamed from: d  reason: collision with root package name */
    private final long f425d;

    /* renamed from: e  reason: collision with root package name */
    private final long f426e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f427f;

    /* renamed from: g  reason: collision with root package name */
    private final int f428g;

    /* renamed from: h  reason: collision with root package name */
    private final String f429h;

    /* renamed from: i  reason: collision with root package name */
    private final String f430i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.c.a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f431a;

        /* renamed from: b  reason: collision with root package name */
        private String f432b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f433c;

        /* renamed from: d  reason: collision with root package name */
        private Long f434d;

        /* renamed from: e  reason: collision with root package name */
        private Long f435e;

        /* renamed from: f  reason: collision with root package name */
        private Boolean f436f;

        /* renamed from: g  reason: collision with root package name */
        private Integer f437g;

        /* renamed from: h  reason: collision with root package name */
        private String f438h;

        /* renamed from: i  reason: collision with root package name */
        private String f439i;

        @Override // ac.a0.e.c.a
        public a0.e.c a() {
            String str = "";
            if (this.f431a == null) {
                str = " arch";
            }
            if (this.f432b == null) {
                str = str + " model";
            }
            if (this.f433c == null) {
                str = str + " cores";
            }
            if (this.f434d == null) {
                str = str + " ram";
            }
            if (this.f435e == null) {
                str = str + " diskSpace";
            }
            if (this.f436f == null) {
                str = str + " simulator";
            }
            if (this.f437g == null) {
                str = str + " state";
            }
            if (this.f438h == null) {
                str = str + " manufacturer";
            }
            if (this.f439i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new j(this.f431a.intValue(), this.f432b, this.f433c.intValue(), this.f434d.longValue(), this.f435e.longValue(), this.f436f.booleanValue(), this.f437g.intValue(), this.f438h, this.f439i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.a0.e.c.a
        public a0.e.c.a b(int i10) {
            this.f431a = Integer.valueOf(i10);
            return this;
        }

        @Override // ac.a0.e.c.a
        public a0.e.c.a c(int i10) {
            this.f433c = Integer.valueOf(i10);
            return this;
        }

        @Override // ac.a0.e.c.a
        public a0.e.c.a d(long j10) {
            this.f435e = Long.valueOf(j10);
            return this;
        }

        @Override // ac.a0.e.c.a
        public a0.e.c.a e(String str) {
            Objects.requireNonNull(str, "Null manufacturer");
            this.f438h = str;
            return this;
        }

        @Override // ac.a0.e.c.a
        public a0.e.c.a f(String str) {
            Objects.requireNonNull(str, "Null model");
            this.f432b = str;
            return this;
        }

        @Override // ac.a0.e.c.a
        public a0.e.c.a g(String str) {
            Objects.requireNonNull(str, "Null modelClass");
            this.f439i = str;
            return this;
        }

        @Override // ac.a0.e.c.a
        public a0.e.c.a h(long j10) {
            this.f434d = Long.valueOf(j10);
            return this;
        }

        @Override // ac.a0.e.c.a
        public a0.e.c.a i(boolean z10) {
            this.f436f = Boolean.valueOf(z10);
            return this;
        }

        @Override // ac.a0.e.c.a
        public a0.e.c.a j(int i10) {
            this.f437g = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // ac.a0.e.c
    public int b() {
        return this.f422a;
    }

    @Override // ac.a0.e.c
    public int c() {
        return this.f424c;
    }

    @Override // ac.a0.e.c
    public long d() {
        return this.f426e;
    }

    @Override // ac.a0.e.c
    public String e() {
        return this.f429h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.c) {
            a0.e.c cVar = (a0.e.c) obj;
            return this.f422a == cVar.b() && this.f423b.equals(cVar.f()) && this.f424c == cVar.c() && this.f425d == cVar.h() && this.f426e == cVar.d() && this.f427f == cVar.j() && this.f428g == cVar.i() && this.f429h.equals(cVar.e()) && this.f430i.equals(cVar.g());
        }
        return false;
    }

    @Override // ac.a0.e.c
    public String f() {
        return this.f423b;
    }

    @Override // ac.a0.e.c
    public String g() {
        return this.f430i;
    }

    @Override // ac.a0.e.c
    public long h() {
        return this.f425d;
    }

    public int hashCode() {
        long j10 = this.f425d;
        long j11 = this.f426e;
        return ((((((((((((((((this.f422a ^ 1000003) * 1000003) ^ this.f423b.hashCode()) * 1000003) ^ this.f424c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f427f ? 1231 : 1237)) * 1000003) ^ this.f428g) * 1000003) ^ this.f429h.hashCode()) * 1000003) ^ this.f430i.hashCode();
    }

    @Override // ac.a0.e.c
    public int i() {
        return this.f428g;
    }

    @Override // ac.a0.e.c
    public boolean j() {
        return this.f427f;
    }

    public String toString() {
        return "Device{arch=" + this.f422a + ", model=" + this.f423b + ", cores=" + this.f424c + ", ram=" + this.f425d + ", diskSpace=" + this.f426e + ", simulator=" + this.f427f + ", state=" + this.f428g + ", manufacturer=" + this.f429h + ", modelClass=" + this.f430i + "}";
    }

    private j(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f422a = i10;
        this.f423b = str;
        this.f424c = i11;
        this.f425d = j10;
        this.f426e = j11;
        this.f427f = z10;
        this.f428g = i12;
        this.f429h = str2;
        this.f430i = str3;
    }
}
