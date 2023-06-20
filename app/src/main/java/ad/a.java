package ad;

/* compiled from: MessagingClientEvent.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final long f555a;

    /* renamed from: b  reason: collision with root package name */
    private final String f556b;

    /* renamed from: c  reason: collision with root package name */
    private final String f557c;

    /* renamed from: d  reason: collision with root package name */
    private final c f558d;

    /* renamed from: e  reason: collision with root package name */
    private final d f559e;

    /* renamed from: f  reason: collision with root package name */
    private final String f560f;

    /* renamed from: g  reason: collision with root package name */
    private final String f561g;

    /* renamed from: h  reason: collision with root package name */
    private final int f562h;

    /* renamed from: i  reason: collision with root package name */
    private final int f563i;

    /* renamed from: j  reason: collision with root package name */
    private final String f564j;

    /* renamed from: k  reason: collision with root package name */
    private final long f565k;

    /* renamed from: l  reason: collision with root package name */
    private final b f566l;

    /* renamed from: m  reason: collision with root package name */
    private final String f567m;

    /* renamed from: n  reason: collision with root package name */
    private final long f568n;

    /* renamed from: o  reason: collision with root package name */
    private final String f569o;

    /* compiled from: MessagingClientEvent.java */
    /* renamed from: ad.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0025a {

        /* renamed from: a  reason: collision with root package name */
        private long f570a = 0;

        /* renamed from: b  reason: collision with root package name */
        private String f571b = "";

        /* renamed from: c  reason: collision with root package name */
        private String f572c = "";

        /* renamed from: d  reason: collision with root package name */
        private c f573d = c.UNKNOWN;

        /* renamed from: e  reason: collision with root package name */
        private d f574e = d.UNKNOWN_OS;

        /* renamed from: f  reason: collision with root package name */
        private String f575f = "";

        /* renamed from: g  reason: collision with root package name */
        private String f576g = "";

        /* renamed from: h  reason: collision with root package name */
        private int f577h = 0;

        /* renamed from: i  reason: collision with root package name */
        private int f578i = 0;

        /* renamed from: j  reason: collision with root package name */
        private String f579j = "";

        /* renamed from: k  reason: collision with root package name */
        private long f580k = 0;

        /* renamed from: l  reason: collision with root package name */
        private b f581l = b.UNKNOWN_EVENT;

        /* renamed from: m  reason: collision with root package name */
        private String f582m = "";

        /* renamed from: n  reason: collision with root package name */
        private long f583n = 0;

        /* renamed from: o  reason: collision with root package name */
        private String f584o = "";

        C0025a() {
        }

        public a a() {
            return new a(this.f570a, this.f571b, this.f572c, this.f573d, this.f574e, this.f575f, this.f576g, this.f577h, this.f578i, this.f579j, this.f580k, this.f581l, this.f582m, this.f583n, this.f584o);
        }

        public C0025a b(String str) {
            this.f582m = str;
            return this;
        }

        public C0025a c(String str) {
            this.f576g = str;
            return this;
        }

        public C0025a d(String str) {
            this.f584o = str;
            return this;
        }

        public C0025a e(b bVar) {
            this.f581l = bVar;
            return this;
        }

        public C0025a f(String str) {
            this.f572c = str;
            return this;
        }

        public C0025a g(String str) {
            this.f571b = str;
            return this;
        }

        public C0025a h(c cVar) {
            this.f573d = cVar;
            return this;
        }

        public C0025a i(String str) {
            this.f575f = str;
            return this;
        }

        public C0025a j(long j10) {
            this.f570a = j10;
            return this;
        }

        public C0025a k(d dVar) {
            this.f574e = dVar;
            return this;
        }

        public C0025a l(String str) {
            this.f579j = str;
            return this;
        }

        public C0025a m(int i10) {
            this.f578i = i10;
            return this;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* loaded from: classes3.dex */
    public enum b implements oc.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f589a;

        b(int i10) {
            this.f589a = i10;
        }

        @Override // oc.c
        public int f() {
            return this.f589a;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* loaded from: classes3.dex */
    public enum c implements oc.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f595a;

        c(int i10) {
            this.f595a = i10;
        }

        @Override // oc.c
        public int f() {
            return this.f595a;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* loaded from: classes3.dex */
    public enum d implements oc.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f601a;

        d(int i10) {
            this.f601a = i10;
        }

        @Override // oc.c
        public int f() {
            return this.f601a;
        }
    }

    static {
        new C0025a().a();
    }

    a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f555a = j10;
        this.f556b = str;
        this.f557c = str2;
        this.f558d = cVar;
        this.f559e = dVar;
        this.f560f = str3;
        this.f561g = str4;
        this.f562h = i10;
        this.f563i = i11;
        this.f564j = str5;
        this.f565k = j11;
        this.f566l = bVar;
        this.f567m = str6;
        this.f568n = j12;
        this.f569o = str7;
    }

    public static C0025a p() {
        return new C0025a();
    }

    @oc.d(tag = 13)
    public String a() {
        return this.f567m;
    }

    @oc.d(tag = 11)
    public long b() {
        return this.f565k;
    }

    @oc.d(tag = 14)
    public long c() {
        return this.f568n;
    }

    @oc.d(tag = 7)
    public String d() {
        return this.f561g;
    }

    @oc.d(tag = 15)
    public String e() {
        return this.f569o;
    }

    @oc.d(tag = 12)
    public b f() {
        return this.f566l;
    }

    @oc.d(tag = 3)
    public String g() {
        return this.f557c;
    }

    @oc.d(tag = 2)
    public String h() {
        return this.f556b;
    }

    @oc.d(tag = 4)
    public c i() {
        return this.f558d;
    }

    @oc.d(tag = 6)
    public String j() {
        return this.f560f;
    }

    @oc.d(tag = 8)
    public int k() {
        return this.f562h;
    }

    @oc.d(tag = 1)
    public long l() {
        return this.f555a;
    }

    @oc.d(tag = 5)
    public d m() {
        return this.f559e;
    }

    @oc.d(tag = 10)
    public String n() {
        return this.f564j;
    }

    @oc.d(tag = 9)
    public int o() {
        return this.f563i;
    }
}
