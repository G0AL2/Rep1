package r5;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.x;
import h4.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p5.i;
import p5.s;
import p5.t;
import p5.w;
import r5.k;
import z5.q;
import z5.r;

/* compiled from: ImagePipelineConfig.java */
/* loaded from: classes.dex */
public class i implements j {
    private static c I = new c(null);
    private final k A;
    private final boolean B;
    private final com.facebook.callercontext.a C;
    private final t5.a D;
    private final s<t3.d, w5.c> E;
    private final s<t3.d, b4.g> F;
    private final w3.f G;
    private final p5.a H;

    /* renamed from: a  reason: collision with root package name */
    private final y3.n<t> f36256a;

    /* renamed from: b  reason: collision with root package name */
    private final s.a f36257b;

    /* renamed from: c  reason: collision with root package name */
    private final i.b<t3.d> f36258c;

    /* renamed from: d  reason: collision with root package name */
    private final p5.f f36259d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f36260e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f36261f;

    /* renamed from: g  reason: collision with root package name */
    private final g f36262g;

    /* renamed from: h  reason: collision with root package name */
    private final y3.n<t> f36263h;

    /* renamed from: i  reason: collision with root package name */
    private final f f36264i;

    /* renamed from: j  reason: collision with root package name */
    private final p5.o f36265j;

    /* renamed from: k  reason: collision with root package name */
    private final u5.c f36266k;

    /* renamed from: l  reason: collision with root package name */
    private final d6.d f36267l;

    /* renamed from: m  reason: collision with root package name */
    private final Integer f36268m;

    /* renamed from: n  reason: collision with root package name */
    private final y3.n<Boolean> f36269n;

    /* renamed from: o  reason: collision with root package name */
    private final u3.c f36270o;

    /* renamed from: p  reason: collision with root package name */
    private final b4.c f36271p;

    /* renamed from: q  reason: collision with root package name */
    private final int f36272q;

    /* renamed from: r  reason: collision with root package name */
    private final k0 f36273r;

    /* renamed from: s  reason: collision with root package name */
    private final int f36274s;

    /* renamed from: t  reason: collision with root package name */
    private final r f36275t;

    /* renamed from: u  reason: collision with root package name */
    private final u5.e f36276u;

    /* renamed from: v  reason: collision with root package name */
    private final Set<y5.e> f36277v;

    /* renamed from: w  reason: collision with root package name */
    private final Set<y5.d> f36278w;

    /* renamed from: x  reason: collision with root package name */
    private final boolean f36279x;

    /* renamed from: y  reason: collision with root package name */
    private final u3.c f36280y;

    /* renamed from: z  reason: collision with root package name */
    private final u5.d f36281z;

    /* compiled from: ImagePipelineConfig.java */
    /* loaded from: classes.dex */
    class a implements y3.n<Boolean> {
        a(i iVar) {
        }

        @Override // y3.n
        /* renamed from: a */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    /* compiled from: ImagePipelineConfig.java */
    /* loaded from: classes.dex */
    public static class b {
        private u5.d A;
        private int B;
        private final k.b C;
        private boolean D;
        private com.facebook.callercontext.a E;
        private t5.a F;
        private s<t3.d, w5.c> G;
        private s<t3.d, b4.g> H;
        private w3.f I;
        private p5.a J;

        /* renamed from: a  reason: collision with root package name */
        private Bitmap.Config f36282a;

        /* renamed from: b  reason: collision with root package name */
        private y3.n<t> f36283b;

        /* renamed from: c  reason: collision with root package name */
        private i.b<t3.d> f36284c;

        /* renamed from: d  reason: collision with root package name */
        private s.a f36285d;

        /* renamed from: e  reason: collision with root package name */
        private p5.f f36286e;

        /* renamed from: f  reason: collision with root package name */
        private final Context f36287f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f36288g;

        /* renamed from: h  reason: collision with root package name */
        private y3.n<t> f36289h;

        /* renamed from: i  reason: collision with root package name */
        private f f36290i;

        /* renamed from: j  reason: collision with root package name */
        private p5.o f36291j;

        /* renamed from: k  reason: collision with root package name */
        private u5.c f36292k;

        /* renamed from: l  reason: collision with root package name */
        private d6.d f36293l;

        /* renamed from: m  reason: collision with root package name */
        private Integer f36294m;

        /* renamed from: n  reason: collision with root package name */
        private y3.n<Boolean> f36295n;

        /* renamed from: o  reason: collision with root package name */
        private u3.c f36296o;

        /* renamed from: p  reason: collision with root package name */
        private b4.c f36297p;

        /* renamed from: q  reason: collision with root package name */
        private Integer f36298q;

        /* renamed from: r  reason: collision with root package name */
        private k0 f36299r;

        /* renamed from: s  reason: collision with root package name */
        private o5.f f36300s;

        /* renamed from: t  reason: collision with root package name */
        private r f36301t;

        /* renamed from: u  reason: collision with root package name */
        private u5.e f36302u;

        /* renamed from: v  reason: collision with root package name */
        private Set<y5.e> f36303v;

        /* renamed from: w  reason: collision with root package name */
        private Set<y5.d> f36304w;

        /* renamed from: x  reason: collision with root package name */
        private boolean f36305x;

        /* renamed from: y  reason: collision with root package name */
        private u3.c f36306y;

        /* renamed from: z  reason: collision with root package name */
        private g f36307z;

        /* synthetic */ b(Context context, a aVar) {
            this(context);
        }

        public i K() {
            return new i(this, null);
        }

        public b L(boolean z10) {
            this.f36288g = z10;
            return this;
        }

        public b M(k0 k0Var) {
            this.f36299r = k0Var;
            return this;
        }

        public b N(Set<y5.e> set) {
            this.f36303v = set;
            return this;
        }

        private b(Context context) {
            this.f36288g = false;
            this.f36294m = null;
            this.f36298q = null;
            this.f36305x = true;
            this.B = -1;
            this.C = new k.b(this);
            this.D = true;
            this.F = new t5.b();
            this.f36287f = (Context) y3.k.g(context);
        }
    }

    /* compiled from: ImagePipelineConfig.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private boolean f36308a;

        /* synthetic */ c(a aVar) {
            this();
        }

        public boolean a() {
            return this.f36308a;
        }

        private c() {
            this.f36308a = false;
        }
    }

    /* synthetic */ i(b bVar, a aVar) {
        this(bVar);
    }

    public static c F() {
        return I;
    }

    private static u3.c G(Context context) {
        try {
            if (c6.b.d()) {
                c6.b.a("DiskCacheConfig.getDefaultMainDiskCacheConfig");
            }
            return u3.c.m(context).n();
        } finally {
            if (c6.b.d()) {
                c6.b.b();
            }
        }
    }

    private static d6.d H(b bVar) {
        if (bVar.f36293l == null || bVar.f36294m == null) {
            if (bVar.f36293l != null) {
                return bVar.f36293l;
            }
            return null;
        }
        throw new IllegalStateException("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
    }

    private static int I(b bVar, k kVar) {
        if (bVar.f36298q != null) {
            return bVar.f36298q.intValue();
        }
        if (kVar.g() != 2 || Build.VERSION.SDK_INT < 27) {
            if (kVar.g() == 1) {
                return 1;
            }
            kVar.g();
            return 0;
        }
        return 2;
    }

    public static b J(Context context) {
        return new b(context, null);
    }

    private static void K(h4.b bVar, k kVar, h4.a aVar) {
        h4.c.f31091b = bVar;
        b.a n10 = kVar.n();
        if (n10 != null) {
            bVar.b(n10);
        }
        if (aVar != null) {
            bVar.a(aVar);
        }
    }

    @Override // r5.j
    public p5.o A() {
        return this.f36265j;
    }

    @Override // r5.j
    public b4.c B() {
        return this.f36271p;
    }

    @Override // r5.j
    public com.facebook.callercontext.a C() {
        return this.C;
    }

    @Override // r5.j
    public k D() {
        return this.A;
    }

    @Override // r5.j
    public f E() {
        return this.f36264i;
    }

    @Override // r5.j
    public Set<y5.d> a() {
        return Collections.unmodifiableSet(this.f36278w);
    }

    @Override // r5.j
    public y3.n<Boolean> b() {
        return this.f36269n;
    }

    @Override // r5.j
    public k0 c() {
        return this.f36273r;
    }

    @Override // r5.j
    public s<t3.d, b4.g> d() {
        return this.F;
    }

    @Override // r5.j
    public u3.c e() {
        return this.f36270o;
    }

    @Override // r5.j
    public Set<y5.e> f() {
        return Collections.unmodifiableSet(this.f36277v);
    }

    @Override // r5.j
    public s.a g() {
        return this.f36257b;
    }

    @Override // r5.j
    public Context getContext() {
        return this.f36260e;
    }

    @Override // r5.j
    public u5.e h() {
        return this.f36276u;
    }

    @Override // r5.j
    public u3.c i() {
        return this.f36280y;
    }

    @Override // r5.j
    public i.b<t3.d> j() {
        return this.f36258c;
    }

    @Override // r5.j
    public boolean k() {
        return this.f36261f;
    }

    @Override // r5.j
    public w3.f l() {
        return this.G;
    }

    @Override // r5.j
    public Integer m() {
        return this.f36268m;
    }

    @Override // r5.j
    public d6.d n() {
        return this.f36267l;
    }

    @Override // r5.j
    public u5.d o() {
        return this.f36281z;
    }

    @Override // r5.j
    public boolean p() {
        return this.B;
    }

    @Override // r5.j
    public y3.n<t> q() {
        return this.f36256a;
    }

    @Override // r5.j
    public u5.c r() {
        return this.f36266k;
    }

    @Override // r5.j
    public y3.n<t> s() {
        return this.f36263h;
    }

    @Override // r5.j
    public r t() {
        return this.f36275t;
    }

    @Override // r5.j
    public int u() {
        return this.f36272q;
    }

    @Override // r5.j
    public g v() {
        return this.f36262g;
    }

    @Override // r5.j
    public t5.a w() {
        return this.D;
    }

    @Override // r5.j
    public p5.a x() {
        return this.H;
    }

    @Override // r5.j
    public p5.f y() {
        return this.f36259d;
    }

    @Override // r5.j
    public boolean z() {
        return this.f36279x;
    }

    private i(b bVar) {
        y3.n<t> nVar;
        p5.f fVar;
        p5.o oVar;
        b4.c cVar;
        r rVar;
        h4.b i10;
        if (c6.b.d()) {
            c6.b.a("ImagePipelineConfig()");
        }
        k s10 = bVar.C.s();
        this.A = s10;
        if (bVar.f36283b != null) {
            nVar = bVar.f36283b;
        } else {
            nVar = new p5.j((ActivityManager) y3.k.g(bVar.f36287f.getSystemService("activity")));
        }
        this.f36256a = nVar;
        this.f36257b = bVar.f36285d == null ? new p5.c() : bVar.f36285d;
        this.f36258c = bVar.f36284c;
        if (bVar.f36282a == null) {
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
        } else {
            Bitmap.Config unused = bVar.f36282a;
        }
        if (bVar.f36286e != null) {
            fVar = bVar.f36286e;
        } else {
            fVar = p5.k.f();
        }
        this.f36259d = fVar;
        this.f36260e = (Context) y3.k.g(bVar.f36287f);
        this.f36262g = bVar.f36307z == null ? new r5.c(new e()) : bVar.f36307z;
        this.f36261f = bVar.f36288g;
        this.f36263h = bVar.f36289h == null ? new p5.l() : bVar.f36289h;
        if (bVar.f36291j != null) {
            oVar = bVar.f36291j;
        } else {
            oVar = w.o();
        }
        this.f36265j = oVar;
        this.f36266k = bVar.f36292k;
        this.f36267l = H(bVar);
        this.f36268m = bVar.f36294m;
        this.f36269n = bVar.f36295n == null ? new a(this) : bVar.f36295n;
        u3.c G = bVar.f36296o == null ? G(bVar.f36287f) : bVar.f36296o;
        this.f36270o = G;
        if (bVar.f36297p != null) {
            cVar = bVar.f36297p;
        } else {
            cVar = b4.d.b();
        }
        this.f36271p = cVar;
        this.f36272q = I(bVar, s10);
        int i11 = bVar.B < 0 ? 30000 : bVar.B;
        this.f36274s = i11;
        if (c6.b.d()) {
            c6.b.a("ImagePipelineConfig->mNetworkFetcher");
        }
        this.f36273r = bVar.f36299r == null ? new x(i11) : bVar.f36299r;
        if (c6.b.d()) {
            c6.b.b();
        }
        o5.f unused2 = bVar.f36300s;
        if (bVar.f36301t != null) {
            rVar = bVar.f36301t;
        } else {
            rVar = new r(q.n().m());
        }
        this.f36275t = rVar;
        this.f36276u = bVar.f36302u == null ? new u5.g() : bVar.f36302u;
        this.f36277v = bVar.f36303v == null ? new HashSet<>() : bVar.f36303v;
        this.f36278w = bVar.f36304w == null ? new HashSet<>() : bVar.f36304w;
        this.f36279x = bVar.f36305x;
        this.f36280y = bVar.f36306y != null ? bVar.f36306y : G;
        u5.d unused3 = bVar.A;
        this.f36264i = bVar.f36290i == null ? new r5.b(rVar.e()) : bVar.f36290i;
        this.B = bVar.D;
        this.C = bVar.E;
        this.D = bVar.F;
        this.E = bVar.G;
        this.H = bVar.J == null ? new p5.g() : bVar.J;
        this.F = bVar.H;
        this.G = bVar.I;
        h4.b m10 = s10.m();
        if (m10 != null) {
            K(m10, s10, new o5.d(t()));
        } else if (s10.y() && h4.c.f31090a && (i10 = h4.c.i()) != null) {
            K(i10, s10, new o5.d(t()));
        }
        if (c6.b.d()) {
            c6.b.b();
        }
    }
}
