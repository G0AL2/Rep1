package z5;

/* compiled from: PoolConfig.java */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final s f40020a;

    /* renamed from: b  reason: collision with root package name */
    private final t f40021b;

    /* renamed from: c  reason: collision with root package name */
    private final s f40022c;

    /* renamed from: d  reason: collision with root package name */
    private final b4.c f40023d;

    /* renamed from: e  reason: collision with root package name */
    private final s f40024e;

    /* renamed from: f  reason: collision with root package name */
    private final t f40025f;

    /* renamed from: g  reason: collision with root package name */
    private final s f40026g;

    /* renamed from: h  reason: collision with root package name */
    private final t f40027h;

    /* renamed from: i  reason: collision with root package name */
    private final String f40028i;

    /* renamed from: j  reason: collision with root package name */
    private final int f40029j;

    /* renamed from: k  reason: collision with root package name */
    private final int f40030k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f40031l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f40032m;

    /* compiled from: PoolConfig.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private s f40033a;

        /* renamed from: b  reason: collision with root package name */
        private t f40034b;

        /* renamed from: c  reason: collision with root package name */
        private s f40035c;

        /* renamed from: d  reason: collision with root package name */
        private b4.c f40036d;

        /* renamed from: e  reason: collision with root package name */
        private s f40037e;

        /* renamed from: f  reason: collision with root package name */
        private t f40038f;

        /* renamed from: g  reason: collision with root package name */
        private s f40039g;

        /* renamed from: h  reason: collision with root package name */
        private t f40040h;

        /* renamed from: i  reason: collision with root package name */
        private String f40041i;

        /* renamed from: j  reason: collision with root package name */
        private int f40042j;

        /* renamed from: k  reason: collision with root package name */
        private int f40043k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f40044l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f40045m;

        public q m() {
            return new q(this);
        }

        private b() {
        }
    }

    public static b n() {
        return new b();
    }

    public int a() {
        return this.f40030k;
    }

    public int b() {
        return this.f40029j;
    }

    public s c() {
        return this.f40020a;
    }

    public t d() {
        return this.f40021b;
    }

    public String e() {
        return this.f40028i;
    }

    public s f() {
        return this.f40022c;
    }

    public s g() {
        return this.f40024e;
    }

    public t h() {
        return this.f40025f;
    }

    public b4.c i() {
        return this.f40023d;
    }

    public s j() {
        return this.f40026g;
    }

    public t k() {
        return this.f40027h;
    }

    public boolean l() {
        return this.f40032m;
    }

    public boolean m() {
        return this.f40031l;
    }

    private q(b bVar) {
        s sVar;
        t tVar;
        s sVar2;
        b4.c cVar;
        s sVar3;
        t tVar2;
        s sVar4;
        t tVar3;
        if (c6.b.d()) {
            c6.b.a("PoolConfig()");
        }
        if (bVar.f40033a != null) {
            sVar = bVar.f40033a;
        } else {
            sVar = f.a();
        }
        this.f40020a = sVar;
        if (bVar.f40034b != null) {
            tVar = bVar.f40034b;
        } else {
            tVar = o.h();
        }
        this.f40021b = tVar;
        if (bVar.f40035c != null) {
            sVar2 = bVar.f40035c;
        } else {
            sVar2 = h.b();
        }
        this.f40022c = sVar2;
        if (bVar.f40036d != null) {
            cVar = bVar.f40036d;
        } else {
            cVar = b4.d.b();
        }
        this.f40023d = cVar;
        if (bVar.f40037e != null) {
            sVar3 = bVar.f40037e;
        } else {
            sVar3 = i.a();
        }
        this.f40024e = sVar3;
        if (bVar.f40038f != null) {
            tVar2 = bVar.f40038f;
        } else {
            tVar2 = o.h();
        }
        this.f40025f = tVar2;
        if (bVar.f40039g != null) {
            sVar4 = bVar.f40039g;
        } else {
            sVar4 = g.a();
        }
        this.f40026g = sVar4;
        if (bVar.f40040h != null) {
            tVar3 = bVar.f40040h;
        } else {
            tVar3 = o.h();
        }
        this.f40027h = tVar3;
        this.f40028i = bVar.f40041i == null ? "legacy" : bVar.f40041i;
        this.f40029j = bVar.f40042j;
        this.f40030k = bVar.f40043k > 0 ? bVar.f40043k : 4194304;
        this.f40031l = bVar.f40044l;
        if (c6.b.d()) {
            c6.b.b();
        }
        this.f40032m = bVar.f40045m;
    }
}
