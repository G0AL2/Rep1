package w7;

import java.util.Map;
import java.util.Objects;
import w7.i;

/* compiled from: AutoValue_EventInternal.java */
/* loaded from: classes2.dex */
final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    private final String f38253a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f38254b;

    /* renamed from: c  reason: collision with root package name */
    private final h f38255c;

    /* renamed from: d  reason: collision with root package name */
    private final long f38256d;

    /* renamed from: e  reason: collision with root package name */
    private final long f38257e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f38258f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_EventInternal.java */
    /* renamed from: w7.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0528b extends i.a {

        /* renamed from: a  reason: collision with root package name */
        private String f38259a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f38260b;

        /* renamed from: c  reason: collision with root package name */
        private h f38261c;

        /* renamed from: d  reason: collision with root package name */
        private Long f38262d;

        /* renamed from: e  reason: collision with root package name */
        private Long f38263e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f38264f;

        @Override // w7.i.a
        public i d() {
            String str = "";
            if (this.f38259a == null) {
                str = " transportName";
            }
            if (this.f38261c == null) {
                str = str + " encodedPayload";
            }
            if (this.f38262d == null) {
                str = str + " eventMillis";
            }
            if (this.f38263e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f38264f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f38259a, this.f38260b, this.f38261c, this.f38262d.longValue(), this.f38263e.longValue(), this.f38264f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // w7.i.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f38264f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // w7.i.a
        public i.a f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f38264f = map;
            return this;
        }

        @Override // w7.i.a
        public i.a g(Integer num) {
            this.f38260b = num;
            return this;
        }

        @Override // w7.i.a
        public i.a h(h hVar) {
            Objects.requireNonNull(hVar, "Null encodedPayload");
            this.f38261c = hVar;
            return this;
        }

        @Override // w7.i.a
        public i.a i(long j10) {
            this.f38262d = Long.valueOf(j10);
            return this;
        }

        @Override // w7.i.a
        public i.a j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f38259a = str;
            return this;
        }

        @Override // w7.i.a
        public i.a k(long j10) {
            this.f38263e = Long.valueOf(j10);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w7.i
    public Map<String, String> c() {
        return this.f38258f;
    }

    @Override // w7.i
    public Integer d() {
        return this.f38254b;
    }

    @Override // w7.i
    public h e() {
        return this.f38255c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return this.f38253a.equals(iVar.j()) && ((num = this.f38254b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f38255c.equals(iVar.e()) && this.f38256d == iVar.f() && this.f38257e == iVar.k() && this.f38258f.equals(iVar.c());
        }
        return false;
    }

    @Override // w7.i
    public long f() {
        return this.f38256d;
    }

    public int hashCode() {
        int hashCode = (this.f38253a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f38254b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j10 = this.f38256d;
        long j11 = this.f38257e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f38255c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f38258f.hashCode();
    }

    @Override // w7.i
    public String j() {
        return this.f38253a;
    }

    @Override // w7.i
    public long k() {
        return this.f38257e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f38253a + ", code=" + this.f38254b + ", encodedPayload=" + this.f38255c + ", eventMillis=" + this.f38256d + ", uptimeMillis=" + this.f38257e + ", autoMetadata=" + this.f38258f + "}";
    }

    private b(String str, Integer num, h hVar, long j10, long j11, Map<String, String> map) {
        this.f38253a = str;
        this.f38254b = num;
        this.f38255c = hVar;
        this.f38256d = j10;
        this.f38257e = j11;
        this.f38258f = map;
    }
}
