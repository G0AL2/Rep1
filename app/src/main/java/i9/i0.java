package i9;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import da.d0;
import da.e0;
import da.p;
import i9.b0;
import i9.m;
import i9.n0;
import i9.r;
import j8.b3;
import j8.j2;
import j8.p1;
import j8.q1;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p8.x;

/* compiled from: ProgressiveMediaPeriod.java */
/* loaded from: classes2.dex */
public final class i0 implements r, p8.k, e0.b<a>, e0.f, n0.d {
    private static final Map<String, String> M = K();
    private static final p1 N = new p1.b().S("icy").e0("application/x-icy").E();
    private boolean A;
    private boolean C;
    private boolean D;
    private int E;
    private long G;
    private boolean I;
    private int J;
    private boolean K;
    private boolean L;

    /* renamed from: a */
    private final Uri f31625a;

    /* renamed from: b */
    private final da.l f31626b;

    /* renamed from: c */
    private final com.google.android.exoplayer2.drm.l f31627c;

    /* renamed from: d */
    private final da.d0 f31628d;

    /* renamed from: e */
    private final b0.a f31629e;

    /* renamed from: f */
    private final k.a f31630f;

    /* renamed from: g */
    private final b f31631g;

    /* renamed from: h */
    private final da.b f31632h;

    /* renamed from: i */
    private final String f31633i;

    /* renamed from: j */
    private final long f31634j;

    /* renamed from: l */
    private final e0 f31636l;

    /* renamed from: q */
    private r.a f31641q;

    /* renamed from: r */
    private IcyHeaders f31642r;

    /* renamed from: u */
    private boolean f31645u;

    /* renamed from: v */
    private boolean f31646v;

    /* renamed from: w */
    private boolean f31647w;

    /* renamed from: x */
    private e f31648x;

    /* renamed from: y */
    private p8.x f31649y;

    /* renamed from: k */
    private final da.e0 f31635k = new da.e0("ProgressiveMediaPeriod");

    /* renamed from: m */
    private final ea.f f31637m = new ea.f();

    /* renamed from: n */
    private final Runnable f31638n = new Runnable() { // from class: i9.f0
        @Override // java.lang.Runnable
        public final void run() {
            i0.v(i0.this);
        }
    };

    /* renamed from: o */
    private final Runnable f31639o = new Runnable() { // from class: i9.g0
        @Override // java.lang.Runnable
        public final void run() {
            i0.x(i0.this);
        }
    };

    /* renamed from: p */
    private final Handler f31640p = ea.n0.w();

    /* renamed from: t */
    private d[] f31644t = new d[0];

    /* renamed from: s */
    private n0[] f31643s = new n0[0];
    private long H = -9223372036854775807L;
    private long F = -1;

    /* renamed from: z */
    private long f31650z = -9223372036854775807L;
    private int B = 1;

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes2.dex */
    public final class a implements e0.e, m.a {

        /* renamed from: b */
        private final Uri f31652b;

        /* renamed from: c */
        private final da.l0 f31653c;

        /* renamed from: d */
        private final e0 f31654d;

        /* renamed from: e */
        private final p8.k f31655e;

        /* renamed from: f */
        private final ea.f f31656f;

        /* renamed from: h */
        private volatile boolean f31658h;

        /* renamed from: j */
        private long f31660j;

        /* renamed from: m */
        private p8.a0 f31663m;

        /* renamed from: n */
        private boolean f31664n;

        /* renamed from: g */
        private final p8.w f31657g = new p8.w();

        /* renamed from: i */
        private boolean f31659i = true;

        /* renamed from: l */
        private long f31662l = -1;

        /* renamed from: a */
        private final long f31651a = n.a();

        /* renamed from: k */
        private da.p f31661k = i(0);

        public a(Uri uri, da.l lVar, e0 e0Var, p8.k kVar, ea.f fVar) {
            i0.this = r1;
            this.f31652b = uri;
            this.f31653c = new da.l0(lVar);
            this.f31654d = e0Var;
            this.f31655e = kVar;
            this.f31656f = fVar;
        }

        private da.p i(long j10) {
            return new p.b().i(this.f31652b).h(j10).f(i0.this.f31633i).b(6).e(i0.M).a();
        }

        public void j(long j10, long j11) {
            this.f31657g.f35701a = j10;
            this.f31660j = j11;
            this.f31659i = true;
            this.f31664n = false;
        }

        @Override // i9.m.a
        public void a(ea.a0 a0Var) {
            long max = !this.f31664n ? this.f31660j : Math.max(i0.this.M(), this.f31660j);
            int a10 = a0Var.a();
            p8.a0 a0Var2 = (p8.a0) ea.a.e(this.f31663m);
            a0Var2.a(a0Var, a10);
            a0Var2.e(max, 1, a10, 0, null);
            this.f31664n = true;
        }

        @Override // da.e0.e
        public void b() {
            this.f31658h = true;
        }

        @Override // da.e0.e
        public void load() throws IOException {
            int i10 = 0;
            while (i10 == 0 && !this.f31658h) {
                try {
                    long j10 = this.f31657g.f35701a;
                    da.p i11 = i(j10);
                    this.f31661k = i11;
                    long g10 = this.f31653c.g(i11);
                    this.f31662l = g10;
                    if (g10 != -1) {
                        this.f31662l = g10 + j10;
                    }
                    i0.this.f31642r = IcyHeaders.c(this.f31653c.e());
                    da.i iVar = this.f31653c;
                    if (i0.this.f31642r != null && i0.this.f31642r.f21171f != -1) {
                        iVar = new m(this.f31653c, i0.this.f31642r.f21171f, this);
                        p8.a0 N = i0.this.N();
                        this.f31663m = N;
                        N.d(i0.N);
                    }
                    long j11 = j10;
                    this.f31654d.c(iVar, this.f31652b, this.f31653c.e(), j10, this.f31662l, this.f31655e);
                    if (i0.this.f31642r != null) {
                        this.f31654d.b();
                    }
                    if (this.f31659i) {
                        this.f31654d.a(j11, this.f31660j);
                        this.f31659i = false;
                    }
                    while (true) {
                        long j12 = j11;
                        while (i10 == 0 && !this.f31658h) {
                            try {
                                this.f31656f.a();
                                i10 = this.f31654d.e(this.f31657g);
                                j11 = this.f31654d.d();
                                if (j11 > i0.this.f31634j + j12) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f31656f.c();
                        i0.this.f31640p.post(i0.this.f31639o);
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else if (this.f31654d.d() != -1) {
                        this.f31657g.f35701a = this.f31654d.d();
                    }
                    da.o.a(this.f31653c);
                } catch (Throwable th) {
                    if (i10 != 1 && this.f31654d.d() != -1) {
                        this.f31657g.f35701a = this.f31654d.d();
                    }
                    da.o.a(this.f31653c);
                    throw th;
                }
            }
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes2.dex */
    public interface b {
        void l(long j10, boolean z10, boolean z11);
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes2.dex */
    private final class c implements o0 {

        /* renamed from: a */
        private final int f31666a;

        public c(int i10) {
            i0.this = r1;
            this.f31666a = i10;
        }

        @Override // i9.o0
        public void a() throws IOException {
            i0.this.W(this.f31666a);
        }

        @Override // i9.o0
        public int f(q1 q1Var, m8.g gVar, int i10) {
            return i0.this.b0(this.f31666a, q1Var, gVar, i10);
        }

        @Override // i9.o0
        public boolean isReady() {
            return i0.this.P(this.f31666a);
        }

        @Override // i9.o0
        public int n(long j10) {
            return i0.this.f0(this.f31666a, j10);
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a */
        public final int f31668a;

        /* renamed from: b */
        public final boolean f31669b;

        public d(int i10, boolean z10) {
            this.f31668a = i10;
            this.f31669b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f31668a == dVar.f31668a && this.f31669b == dVar.f31669b;
        }

        public int hashCode() {
            return (this.f31668a * 31) + (this.f31669b ? 1 : 0);
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: a */
        public final y0 f31670a;

        /* renamed from: b */
        public final boolean[] f31671b;

        /* renamed from: c */
        public final boolean[] f31672c;

        /* renamed from: d */
        public final boolean[] f31673d;

        public e(y0 y0Var, boolean[] zArr) {
            this.f31670a = y0Var;
            this.f31671b = zArr;
            int i10 = y0Var.f31863a;
            this.f31672c = new boolean[i10];
            this.f31673d = new boolean[i10];
        }
    }

    public i0(Uri uri, da.l lVar, e0 e0Var, com.google.android.exoplayer2.drm.l lVar2, k.a aVar, da.d0 d0Var, b0.a aVar2, b bVar, da.b bVar2, String str, int i10) {
        this.f31625a = uri;
        this.f31626b = lVar;
        this.f31627c = lVar2;
        this.f31630f = aVar;
        this.f31628d = d0Var;
        this.f31629e = aVar2;
        this.f31631g = bVar;
        this.f31632h = bVar2;
        this.f31633i = str;
        this.f31634j = i10;
        this.f31636l = e0Var;
    }

    private void H() {
        ea.a.f(this.f31646v);
        ea.a.e(this.f31648x);
        ea.a.e(this.f31649y);
    }

    private boolean I(a aVar, int i10) {
        p8.x xVar;
        if (this.F == -1 && ((xVar = this.f31649y) == null || xVar.i() == -9223372036854775807L)) {
            if (this.f31646v && !h0()) {
                this.I = true;
                return false;
            }
            this.D = this.f31646v;
            this.G = 0L;
            this.J = 0;
            for (n0 n0Var : this.f31643s) {
                n0Var.V();
            }
            aVar.j(0L, 0L);
            return true;
        }
        this.J = i10;
        return true;
    }

    private void J(a aVar) {
        if (this.F == -1) {
            this.F = aVar.f31662l;
        }
    }

    private static Map<String, String> K() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    private int L() {
        int i10 = 0;
        for (n0 n0Var : this.f31643s) {
            i10 += n0Var.G();
        }
        return i10;
    }

    public long M() {
        long j10 = Long.MIN_VALUE;
        for (n0 n0Var : this.f31643s) {
            j10 = Math.max(j10, n0Var.z());
        }
        return j10;
    }

    private boolean O() {
        return this.H != -9223372036854775807L;
    }

    public /* synthetic */ void Q() {
        if (this.L) {
            return;
        }
        ((r.a) ea.a.e(this.f31641q)).m(this);
    }

    public void S() {
        Metadata c10;
        if (this.L || this.f31646v || !this.f31645u || this.f31649y == null) {
            return;
        }
        for (n0 n0Var : this.f31643s) {
            if (n0Var.F() == null) {
                return;
            }
        }
        this.f31637m.c();
        int length = this.f31643s.length;
        w0[] w0VarArr = new w0[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            p1 p1Var = (p1) ea.a.e(this.f31643s[i10].F());
            String str = p1Var.f32709l;
            boolean p10 = ea.v.p(str);
            boolean z10 = p10 || ea.v.t(str);
            zArr[i10] = z10;
            this.f31647w = z10 | this.f31647w;
            IcyHeaders icyHeaders = this.f31642r;
            if (icyHeaders != null) {
                if (p10 || this.f31644t[i10].f31669b) {
                    Metadata metadata = p1Var.f32707j;
                    if (metadata == null) {
                        c10 = new Metadata(icyHeaders);
                    } else {
                        c10 = metadata.c(icyHeaders);
                    }
                    p1Var = p1Var.b().X(c10).E();
                }
                if (p10 && p1Var.f32703f == -1 && p1Var.f32704g == -1 && icyHeaders.f21166a != -1) {
                    p1Var = p1Var.b().G(icyHeaders.f21166a).E();
                }
            }
            w0VarArr[i10] = new w0(Integer.toString(i10), p1Var.c(this.f31627c.b(p1Var)));
        }
        this.f31648x = new e(new y0(w0VarArr), zArr);
        this.f31646v = true;
        ((r.a) ea.a.e(this.f31641q)).f(this);
    }

    private void T(int i10) {
        H();
        e eVar = this.f31648x;
        boolean[] zArr = eVar.f31673d;
        if (zArr[i10]) {
            return;
        }
        p1 c10 = eVar.f31670a.b(i10).c(0);
        this.f31629e.i(ea.v.l(c10.f32709l), c10, 0, null, this.G);
        zArr[i10] = true;
    }

    private void U(int i10) {
        H();
        boolean[] zArr = this.f31648x.f31671b;
        if (this.I && zArr[i10]) {
            if (this.f31643s[i10].K(false)) {
                return;
            }
            this.H = 0L;
            this.I = false;
            this.D = true;
            this.G = 0L;
            this.J = 0;
            for (n0 n0Var : this.f31643s) {
                n0Var.V();
            }
            ((r.a) ea.a.e(this.f31641q)).m(this);
        }
    }

    private p8.a0 a0(d dVar) {
        int length = this.f31643s.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.f31644t[i10])) {
                return this.f31643s[i10];
            }
        }
        n0 k10 = n0.k(this.f31632h, this.f31627c, this.f31630f);
        k10.d0(this);
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f31644t, i11);
        dVarArr[length] = dVar;
        this.f31644t = (d[]) ea.n0.k(dVarArr);
        n0[] n0VarArr = (n0[]) Arrays.copyOf(this.f31643s, i11);
        n0VarArr[length] = k10;
        this.f31643s = (n0[]) ea.n0.k(n0VarArr);
        return k10;
    }

    private boolean d0(boolean[] zArr, long j10) {
        int length = this.f31643s.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f31643s[i10].Z(j10, false) && (zArr[i10] || !this.f31647w)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e0 */
    public void R(p8.x xVar) {
        this.f31649y = this.f31642r == null ? xVar : new x.b(-9223372036854775807L);
        this.f31650z = xVar.i();
        boolean z10 = this.F == -1 && xVar.i() == -9223372036854775807L;
        this.A = z10;
        this.B = z10 ? 7 : 1;
        this.f31631g.l(this.f31650z, xVar.f(), this.A);
        if (this.f31646v) {
            return;
        }
        S();
    }

    private void g0() {
        a aVar = new a(this.f31625a, this.f31626b, this.f31636l, this, this.f31637m);
        if (this.f31646v) {
            ea.a.f(O());
            long j10 = this.f31650z;
            if (j10 == -9223372036854775807L || this.H <= j10) {
                aVar.j(((p8.x) ea.a.e(this.f31649y)).d(this.H).f35702a.f35708b, this.H);
                for (n0 n0Var : this.f31643s) {
                    n0Var.b0(this.H);
                }
                this.H = -9223372036854775807L;
            } else {
                this.K = true;
                this.H = -9223372036854775807L;
                return;
            }
        }
        this.J = L();
        this.f31629e.A(new n(aVar.f31651a, aVar.f31661k, this.f31635k.n(aVar, this, this.f31628d.c(this.B))), 1, -1, null, 0, null, aVar.f31660j, this.f31650z);
    }

    private boolean h0() {
        return this.D || O();
    }

    public static /* synthetic */ void v(i0 i0Var) {
        i0Var.S();
    }

    public static /* synthetic */ void w(i0 i0Var, p8.x xVar) {
        i0Var.R(xVar);
    }

    public static /* synthetic */ void x(i0 i0Var) {
        i0Var.Q();
    }

    p8.a0 N() {
        return a0(new d(0, true));
    }

    boolean P(int i10) {
        return !h0() && this.f31643s[i10].K(this.K);
    }

    void V() throws IOException {
        this.f31635k.k(this.f31628d.c(this.B));
    }

    void W(int i10) throws IOException {
        this.f31643s[i10].N();
        V();
    }

    @Override // da.e0.b
    /* renamed from: X */
    public void j(a aVar, long j10, long j11, boolean z10) {
        da.l0 l0Var = aVar.f31653c;
        n nVar = new n(aVar.f31651a, aVar.f31661k, l0Var.r(), l0Var.s(), j10, j11, l0Var.q());
        this.f31628d.d(aVar.f31651a);
        this.f31629e.r(nVar, 1, -1, null, 0, null, aVar.f31660j, this.f31650z);
        if (z10) {
            return;
        }
        J(aVar);
        for (n0 n0Var : this.f31643s) {
            n0Var.V();
        }
        if (this.E > 0) {
            ((r.a) ea.a.e(this.f31641q)).m(this);
        }
    }

    @Override // da.e0.b
    /* renamed from: Y */
    public void m(a aVar, long j10, long j11) {
        p8.x xVar;
        if (this.f31650z == -9223372036854775807L && (xVar = this.f31649y) != null) {
            boolean f10 = xVar.f();
            long M2 = M();
            long j12 = M2 == Long.MIN_VALUE ? 0L : M2 + 10000;
            this.f31650z = j12;
            this.f31631g.l(j12, f10, this.A);
        }
        da.l0 l0Var = aVar.f31653c;
        n nVar = new n(aVar.f31651a, aVar.f31661k, l0Var.r(), l0Var.s(), j10, j11, l0Var.q());
        this.f31628d.d(aVar.f31651a);
        this.f31629e.u(nVar, 1, -1, null, 0, null, aVar.f31660j, this.f31650z);
        J(aVar);
        this.K = true;
        ((r.a) ea.a.e(this.f31641q)).m(this);
    }

    @Override // da.e0.b
    /* renamed from: Z */
    public e0.c s(a aVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        a aVar2;
        e0.c cVar;
        J(aVar);
        da.l0 l0Var = aVar.f31653c;
        n nVar = new n(aVar.f31651a, aVar.f31661k, l0Var.r(), l0Var.s(), j10, j11, l0Var.q());
        long b10 = this.f31628d.b(new d0.c(nVar, new q(1, -1, null, 0, null, ea.n0.Z0(aVar.f31660j), ea.n0.Z0(this.f31650z)), iOException, i10));
        if (b10 == -9223372036854775807L) {
            cVar = da.e0.f29145f;
        } else {
            int L = L();
            if (L > this.J) {
                aVar2 = aVar;
                z10 = true;
            } else {
                z10 = false;
                aVar2 = aVar;
            }
            if (I(aVar2, L)) {
                cVar = da.e0.h(z10, b10);
            } else {
                cVar = da.e0.f29144e;
            }
        }
        boolean z11 = !cVar.c();
        this.f31629e.w(nVar, 1, -1, null, 0, null, aVar.f31660j, this.f31650z, iOException, z11);
        if (z11) {
            this.f31628d.d(aVar.f31651a);
        }
        return cVar;
    }

    @Override // i9.n0.d
    public void a(p1 p1Var) {
        this.f31640p.post(this.f31638n);
    }

    @Override // i9.r, i9.p0
    public long b() {
        if (this.E == 0) {
            return Long.MIN_VALUE;
        }
        return g();
    }

    int b0(int i10, q1 q1Var, m8.g gVar, int i11) {
        if (h0()) {
            return -3;
        }
        T(i10);
        int S = this.f31643s[i10].S(q1Var, gVar, i11, this.K);
        if (S == -3) {
            U(i10);
        }
        return S;
    }

    @Override // i9.r, i9.p0
    public boolean c() {
        return this.f31635k.j() && this.f31637m.d();
    }

    public void c0() {
        if (this.f31646v) {
            for (n0 n0Var : this.f31643s) {
                n0Var.R();
            }
        }
        this.f31635k.m(this);
        this.f31640p.removeCallbacksAndMessages(null);
        this.f31641q = null;
        this.L = true;
    }

    @Override // i9.r, i9.p0
    public boolean d(long j10) {
        if (this.K || this.f31635k.i() || this.I) {
            return false;
        }
        if (this.f31646v && this.E == 0) {
            return false;
        }
        boolean e10 = this.f31637m.e();
        if (this.f31635k.j()) {
            return e10;
        }
        g0();
        return true;
    }

    @Override // i9.r
    public long e(long j10, b3 b3Var) {
        H();
        if (this.f31649y.f()) {
            x.a d10 = this.f31649y.d(j10);
            return b3Var.a(j10, d10.f35702a.f35707a, d10.f35703b.f35707a);
        }
        return 0L;
    }

    @Override // p8.k
    public p8.a0 f(int i10, int i11) {
        return a0(new d(i10, false));
    }

    int f0(int i10, long j10) {
        if (h0()) {
            return 0;
        }
        T(i10);
        n0 n0Var = this.f31643s[i10];
        int E = n0Var.E(j10, this.K);
        n0Var.e0(E);
        if (E == 0) {
            U(i10);
        }
        return E;
    }

    @Override // i9.r, i9.p0
    public long g() {
        long j10;
        H();
        boolean[] zArr = this.f31648x.f31671b;
        if (this.K) {
            return Long.MIN_VALUE;
        }
        if (O()) {
            return this.H;
        }
        if (this.f31647w) {
            int length = this.f31643s.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (zArr[i10] && !this.f31643s[i10].J()) {
                    j10 = Math.min(j10, this.f31643s[i10].z());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = M();
        }
        return j10 == Long.MIN_VALUE ? this.G : j10;
    }

    @Override // i9.r, i9.p0
    public void h(long j10) {
    }

    @Override // i9.r
    public void i(r.a aVar, long j10) {
        this.f31641q = aVar;
        this.f31637m.e();
        g0();
    }

    @Override // i9.r
    public long k(long j10) {
        H();
        boolean[] zArr = this.f31648x.f31671b;
        if (!this.f31649y.f()) {
            j10 = 0;
        }
        int i10 = 0;
        this.D = false;
        this.G = j10;
        if (O()) {
            this.H = j10;
            return j10;
        } else if (this.B == 7 || !d0(zArr, j10)) {
            this.I = false;
            this.H = j10;
            this.K = false;
            if (this.f31635k.j()) {
                n0[] n0VarArr = this.f31643s;
                int length = n0VarArr.length;
                while (i10 < length) {
                    n0VarArr[i10].r();
                    i10++;
                }
                this.f31635k.f();
            } else {
                this.f31635k.g();
                n0[] n0VarArr2 = this.f31643s;
                int length2 = n0VarArr2.length;
                while (i10 < length2) {
                    n0VarArr2[i10].V();
                    i10++;
                }
            }
            return j10;
        } else {
            return j10;
        }
    }

    @Override // i9.r
    public long l() {
        if (this.D) {
            if (this.K || L() > this.J) {
                this.D = false;
                return this.G;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // p8.k
    public void n(final p8.x xVar) {
        this.f31640p.post(new Runnable() { // from class: i9.h0
            @Override // java.lang.Runnable
            public final void run() {
                i0.w(i0.this, xVar);
            }
        });
    }

    @Override // da.e0.f
    public void o() {
        for (n0 n0Var : this.f31643s) {
            n0Var.T();
        }
        this.f31636l.release();
    }

    @Override // i9.r
    public long p(ba.q[] qVarArr, boolean[] zArr, o0[] o0VarArr, boolean[] zArr2, long j10) {
        H();
        e eVar = this.f31648x;
        y0 y0Var = eVar.f31670a;
        boolean[] zArr3 = eVar.f31672c;
        int i10 = this.E;
        int i11 = 0;
        for (int i12 = 0; i12 < qVarArr.length; i12++) {
            if (o0VarArr[i12] != null && (qVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((c) o0VarArr[i12]).f31666a;
                ea.a.f(zArr3[i13]);
                this.E--;
                zArr3[i13] = false;
                o0VarArr[i12] = null;
            }
        }
        boolean z10 = !this.C ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < qVarArr.length; i14++) {
            if (o0VarArr[i14] == null && qVarArr[i14] != null) {
                ba.q qVar = qVarArr[i14];
                ea.a.f(qVar.length() == 1);
                ea.a.f(qVar.e(0) == 0);
                int c10 = y0Var.c(qVar.k());
                ea.a.f(!zArr3[c10]);
                this.E++;
                zArr3[c10] = true;
                o0VarArr[i14] = new c(c10);
                zArr2[i14] = true;
                if (!z10) {
                    n0 n0Var = this.f31643s[c10];
                    z10 = (n0Var.Z(j10, true) || n0Var.C() == 0) ? false : true;
                }
            }
        }
        if (this.E == 0) {
            this.I = false;
            this.D = false;
            if (this.f31635k.j()) {
                n0[] n0VarArr = this.f31643s;
                int length = n0VarArr.length;
                while (i11 < length) {
                    n0VarArr[i11].r();
                    i11++;
                }
                this.f31635k.f();
            } else {
                n0[] n0VarArr2 = this.f31643s;
                int length2 = n0VarArr2.length;
                while (i11 < length2) {
                    n0VarArr2[i11].V();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = k(j10);
            while (i11 < o0VarArr.length) {
                if (o0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.C = true;
        return j10;
    }

    @Override // i9.r
    public void q() throws IOException {
        V();
        if (this.K && !this.f31646v) {
            throw j2.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // p8.k
    public void r() {
        this.f31645u = true;
        this.f31640p.post(this.f31638n);
    }

    @Override // i9.r
    public y0 t() {
        H();
        return this.f31648x.f31670a;
    }

    @Override // i9.r
    public void u(long j10, boolean z10) {
        H();
        if (O()) {
            return;
        }
        boolean[] zArr = this.f31648x.f31672c;
        int length = this.f31643s.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f31643s[i10].q(j10, z10, zArr[i10]);
        }
    }
}
