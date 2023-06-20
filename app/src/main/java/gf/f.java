package gf;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import ee.u;
import gf.h;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import qe.r;
import qe.s;

/* compiled from: Http2Connection.kt */
/* loaded from: classes3.dex */
public final class f implements Closeable {
    private static final m C;
    public static final c D = new c(null);
    private final e A;
    private final Set<Integer> B;

    /* renamed from: a */
    private final boolean f30910a;

    /* renamed from: b */
    private final d f30911b;

    /* renamed from: c */
    private final Map<Integer, gf.i> f30912c;

    /* renamed from: d */
    private final String f30913d;

    /* renamed from: e */
    private int f30914e;

    /* renamed from: f */
    private int f30915f;

    /* renamed from: g */
    private boolean f30916g;

    /* renamed from: h */
    private final cf.e f30917h;

    /* renamed from: i */
    private final cf.d f30918i;

    /* renamed from: j */
    private final cf.d f30919j;

    /* renamed from: k */
    private final cf.d f30920k;

    /* renamed from: l */
    private final gf.l f30921l;

    /* renamed from: m */
    private long f30922m;

    /* renamed from: n */
    private long f30923n;

    /* renamed from: o */
    private long f30924o;

    /* renamed from: p */
    private long f30925p;

    /* renamed from: q */
    private long f30926q;

    /* renamed from: r */
    private long f30927r;

    /* renamed from: s */
    private final m f30928s;

    /* renamed from: t */
    private m f30929t;

    /* renamed from: u */
    private long f30930u;

    /* renamed from: v */
    private long f30931v;

    /* renamed from: w */
    private long f30932w;

    /* renamed from: x */
    private long f30933x;

    /* renamed from: y */
    private final Socket f30934y;

    /* renamed from: z */
    private final gf.j f30935z;

    /* compiled from: TaskQueue.kt */
    /* loaded from: classes3.dex */
    public static final class a extends cf.a {

        /* renamed from: e */
        final /* synthetic */ f f30936e;

        /* renamed from: f */
        final /* synthetic */ long f30937f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, f fVar, long j10) {
            super(str2, false, 2, null);
            this.f30936e = fVar;
            this.f30937f = j10;
        }

        @Override // cf.a
        public long f() {
            boolean z10;
            synchronized (this.f30936e) {
                if (this.f30936e.f30923n < this.f30936e.f30922m) {
                    z10 = true;
                } else {
                    this.f30936e.f30922m++;
                    z10 = false;
                }
            }
            if (z10) {
                this.f30936e.h0(null);
                return -1L;
            }
            this.f30936e.s1(false, 1, 0);
            return this.f30937f;
        }
    }

    /* compiled from: Http2Connection.kt */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        public Socket f30938a;

        /* renamed from: b */
        public String f30939b;

        /* renamed from: c */
        public mf.h f30940c;

        /* renamed from: d */
        public mf.g f30941d;

        /* renamed from: e */
        private d f30942e;

        /* renamed from: f */
        private gf.l f30943f;

        /* renamed from: g */
        private int f30944g;

        /* renamed from: h */
        private boolean f30945h;

        /* renamed from: i */
        private final cf.e f30946i;

        public b(boolean z10, cf.e eVar) {
            qe.k.f(eVar, "taskRunner");
            this.f30945h = z10;
            this.f30946i = eVar;
            this.f30942e = d.f30947a;
            this.f30943f = gf.l.f31044a;
        }

        public final f a() {
            return new f(this);
        }

        public final boolean b() {
            return this.f30945h;
        }

        public final String c() {
            String str = this.f30939b;
            if (str == null) {
                qe.k.s("connectionName");
            }
            return str;
        }

        public final d d() {
            return this.f30942e;
        }

        public final int e() {
            return this.f30944g;
        }

        public final gf.l f() {
            return this.f30943f;
        }

        public final mf.g g() {
            mf.g gVar = this.f30941d;
            if (gVar == null) {
                qe.k.s("sink");
            }
            return gVar;
        }

        public final Socket h() {
            Socket socket = this.f30938a;
            if (socket == null) {
                qe.k.s("socket");
            }
            return socket;
        }

        public final mf.h i() {
            mf.h hVar = this.f30940c;
            if (hVar == null) {
                qe.k.s("source");
            }
            return hVar;
        }

        public final cf.e j() {
            return this.f30946i;
        }

        public final b k(d dVar) {
            qe.k.f(dVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f30942e = dVar;
            return this;
        }

        public final b l(int i10) {
            this.f30944g = i10;
            return this;
        }

        public final b m(Socket socket, String str, mf.h hVar, mf.g gVar) throws IOException {
            String str2;
            qe.k.f(socket, "socket");
            qe.k.f(str, "peerName");
            qe.k.f(hVar, "source");
            qe.k.f(gVar, "sink");
            this.f30938a = socket;
            if (this.f30945h) {
                str2 = ze.c.f40526h + ' ' + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            this.f30939b = str2;
            this.f30940c = hVar;
            this.f30941d = gVar;
            return this;
        }
    }

    /* compiled from: Http2Connection.kt */
    /* loaded from: classes3.dex */
    public static final class c {
        private c() {
        }

        public final m a() {
            return f.C;
        }

        public /* synthetic */ c(qe.g gVar) {
            this();
        }
    }

    /* compiled from: Http2Connection.kt */
    /* loaded from: classes3.dex */
    public static abstract class d {

        /* renamed from: a */
        public static final d f30947a;

        /* compiled from: Http2Connection.kt */
        /* loaded from: classes3.dex */
        public static final class a extends d {
            a() {
            }

            @Override // gf.f.d
            public void b(gf.i iVar) throws IOException {
                qe.k.f(iVar, "stream");
                iVar.d(gf.b.REFUSED_STREAM, null);
            }
        }

        /* compiled from: Http2Connection.kt */
        /* loaded from: classes3.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(qe.g gVar) {
                this();
            }
        }

        static {
            new b(null);
            f30947a = new a();
        }

        public void a(f fVar, m mVar) {
            qe.k.f(fVar, "connection");
            qe.k.f(mVar, "settings");
        }

        public abstract void b(gf.i iVar) throws IOException;
    }

    /* compiled from: Http2Connection.kt */
    /* loaded from: classes3.dex */
    public final class e implements h.c, pe.a<u> {

        /* renamed from: a */
        private final gf.h f30948a;

        /* renamed from: b */
        final /* synthetic */ f f30949b;

        /* compiled from: TaskQueue.kt */
        /* loaded from: classes3.dex */
        public static final class a extends cf.a {

            /* renamed from: e */
            final /* synthetic */ e f30950e;

            /* renamed from: f */
            final /* synthetic */ s f30951f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z10, String str2, boolean z11, e eVar, s sVar, boolean z12, m mVar, r rVar, s sVar2) {
                super(str2, z11);
                this.f30950e = eVar;
                this.f30951f = sVar;
            }

            @Override // cf.a
            public long f() {
                this.f30950e.f30949b.s0().a(this.f30950e.f30949b, (m) this.f30951f.f36110a);
                return -1L;
            }
        }

        /* compiled from: TaskQueue.kt */
        /* loaded from: classes3.dex */
        public static final class b extends cf.a {

            /* renamed from: e */
            final /* synthetic */ gf.i f30952e;

            /* renamed from: f */
            final /* synthetic */ e f30953f;

            /* renamed from: g */
            final /* synthetic */ List f30954g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z10, String str2, boolean z11, gf.i iVar, e eVar, gf.i iVar2, int i10, List list, boolean z12) {
                super(str2, z11);
                this.f30952e = iVar;
                this.f30953f = eVar;
                this.f30954g = list;
            }

            @Override // cf.a
            public long f() {
                try {
                    this.f30953f.f30949b.s0().b(this.f30952e);
                    return -1L;
                } catch (IOException e10) {
                    okhttp3.internal.platform.h g10 = okhttp3.internal.platform.h.f35277c.g();
                    g10.k("Http2Connection.Listener failure for " + this.f30953f.f30949b.q0(), 4, e10);
                    try {
                        this.f30952e.d(gf.b.PROTOCOL_ERROR, e10);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* compiled from: TaskQueue.kt */
        /* loaded from: classes3.dex */
        public static final class c extends cf.a {

            /* renamed from: e */
            final /* synthetic */ e f30955e;

            /* renamed from: f */
            final /* synthetic */ int f30956f;

            /* renamed from: g */
            final /* synthetic */ int f30957g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z10, String str2, boolean z11, e eVar, int i10, int i11) {
                super(str2, z11);
                this.f30955e = eVar;
                this.f30956f = i10;
                this.f30957g = i11;
            }

            @Override // cf.a
            public long f() {
                this.f30955e.f30949b.s1(true, this.f30956f, this.f30957g);
                return -1L;
            }
        }

        /* compiled from: TaskQueue.kt */
        /* loaded from: classes3.dex */
        public static final class d extends cf.a {

            /* renamed from: e */
            final /* synthetic */ e f30958e;

            /* renamed from: f */
            final /* synthetic */ boolean f30959f;

            /* renamed from: g */
            final /* synthetic */ m f30960g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, boolean z10, String str2, boolean z11, e eVar, boolean z12, m mVar) {
                super(str2, z11);
                this.f30958e = eVar;
                this.f30959f = z12;
                this.f30960g = mVar;
            }

            @Override // cf.a
            public long f() {
                this.f30958e.m(this.f30959f, this.f30960g);
                return -1L;
            }
        }

        public e(f fVar, gf.h hVar) {
            qe.k.f(hVar, "reader");
            this.f30949b = fVar;
            this.f30948a = hVar;
        }

        @Override // gf.h.c
        public void a(boolean z10, int i10, int i11, List<gf.c> list) {
            qe.k.f(list, "headerBlock");
            if (this.f30949b.d1(i10)) {
                this.f30949b.Z0(i10, list, z10);
                return;
            }
            synchronized (this.f30949b) {
                gf.i H0 = this.f30949b.H0(i10);
                if (H0 == null) {
                    if (this.f30949b.f30916g) {
                        return;
                    }
                    if (i10 <= this.f30949b.r0()) {
                        return;
                    }
                    if (i10 % 2 == this.f30949b.z0() % 2) {
                        return;
                    }
                    gf.i iVar = new gf.i(i10, this.f30949b, false, z10, ze.c.M(list));
                    this.f30949b.k1(i10);
                    this.f30949b.K0().put(Integer.valueOf(i10), iVar);
                    String str = this.f30949b.q0() + '[' + i10 + "] onStream";
                    this.f30949b.f30917h.i().i(new b(str, true, str, true, iVar, this, H0, i10, list, z10), 0L);
                    return;
                }
                u uVar = u.f29813a;
                H0.x(ze.c.M(list), z10);
            }
        }

        @Override // gf.h.c
        public void c(int i10, long j10) {
            if (i10 == 0) {
                synchronized (this.f30949b) {
                    f fVar = this.f30949b;
                    fVar.f30933x = fVar.N0() + j10;
                    f fVar2 = this.f30949b;
                    if (fVar2 != null) {
                        fVar2.notifyAll();
                        u uVar = u.f29813a;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                return;
            }
            gf.i H0 = this.f30949b.H0(i10);
            if (H0 != null) {
                synchronized (H0) {
                    H0.a(j10);
                    u uVar2 = u.f29813a;
                }
            }
        }

        @Override // gf.h.c
        public void d(int i10, int i11, List<gf.c> list) {
            qe.k.f(list, "requestHeaders");
            this.f30949b.b1(i11, list);
        }

        @Override // gf.h.c
        public void e() {
        }

        @Override // gf.h.c
        public void f(boolean z10, m mVar) {
            qe.k.f(mVar, "settings");
            String str = this.f30949b.q0() + " applyAndAckSettings";
            this.f30949b.f30918i.i(new d(str, true, str, true, this, z10, mVar), 0L);
        }

        @Override // gf.h.c
        public void g(boolean z10, int i10, mf.h hVar, int i11) throws IOException {
            qe.k.f(hVar, "source");
            if (this.f30949b.d1(i10)) {
                this.f30949b.Y0(i10, hVar, i11, z10);
                return;
            }
            gf.i H0 = this.f30949b.H0(i10);
            if (H0 == null) {
                this.f30949b.u1(i10, gf.b.PROTOCOL_ERROR);
                long j10 = i11;
                this.f30949b.p1(j10);
                hVar.O0(j10);
                return;
            }
            H0.w(hVar, i11);
            if (z10) {
                H0.x(ze.c.f40520b, true);
            }
        }

        @Override // gf.h.c
        public void i(int i10, gf.b bVar, mf.i iVar) {
            int i11;
            gf.i[] iVarArr;
            qe.k.f(bVar, IronSourceConstants.EVENTS_ERROR_CODE);
            qe.k.f(iVar, "debugData");
            iVar.A();
            synchronized (this.f30949b) {
                Object[] array = this.f30949b.K0().values().toArray(new gf.i[0]);
                if (array != null) {
                    iVarArr = (gf.i[]) array;
                    this.f30949b.f30916g = true;
                    u uVar = u.f29813a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (gf.i iVar2 : iVarArr) {
                if (iVar2.j() > i10 && iVar2.t()) {
                    iVar2.y(gf.b.REFUSED_STREAM);
                    this.f30949b.i1(iVar2.j());
                }
            }
        }

        @Override // pe.a
        public /* bridge */ /* synthetic */ u invoke() {
            n();
            return u.f29813a;
        }

        @Override // gf.h.c
        public void j(boolean z10, int i10, int i11) {
            if (z10) {
                synchronized (this.f30949b) {
                    if (i10 == 1) {
                        this.f30949b.f30923n++;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            this.f30949b.f30926q++;
                            f fVar = this.f30949b;
                            if (fVar == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                            fVar.notifyAll();
                        }
                        u uVar = u.f29813a;
                    } else {
                        this.f30949b.f30925p++;
                    }
                }
                return;
            }
            String str = this.f30949b.q0() + " ping";
            this.f30949b.f30918i.i(new c(str, true, str, true, this, i10, i11), 0L);
        }

        @Override // gf.h.c
        public void k(int i10, int i11, int i12, boolean z10) {
        }

        @Override // gf.h.c
        public void l(int i10, gf.b bVar) {
            qe.k.f(bVar, IronSourceConstants.EVENTS_ERROR_CODE);
            if (this.f30949b.d1(i10)) {
                this.f30949b.c1(i10, bVar);
                return;
            }
            gf.i i12 = this.f30949b.i1(i10);
            if (i12 != null) {
                i12.y(bVar);
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(15:6|7|(1:9)(1:54)|10|(2:15|(10:17|18|19|20|21|22|23|24|25|26)(2:51|52))|53|18|19|20|21|22|23|24|25|26) */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x00d8, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x00d9, code lost:
            r21.f30949b.h0(r0);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m(boolean r22, gf.m r23) {
            /*
                Method dump skipped, instructions count: 269
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: gf.f.e.m(boolean, gf.m):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [gf.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, gf.h] */
        public void n() {
            gf.b bVar;
            gf.b bVar2;
            gf.b bVar3 = gf.b.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f30948a.d(this);
                    while (this.f30948a.b(false, this)) {
                    }
                    bVar2 = gf.b.NO_ERROR;
                } catch (IOException e11) {
                    e10 = e11;
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar3;
                    this.f30949b.g0(bVar, bVar3, e10);
                    ze.c.j(this.f30948a);
                    throw th;
                }
                try {
                    this.f30949b.g0(bVar2, gf.b.CANCEL, null);
                    bVar = bVar2;
                } catch (IOException e12) {
                    e10 = e12;
                    gf.b bVar4 = gf.b.PROTOCOL_ERROR;
                    f fVar = this.f30949b;
                    fVar.g0(bVar4, bVar4, e10);
                    bVar = fVar;
                    bVar3 = this.f30948a;
                    ze.c.j(bVar3);
                }
                bVar3 = this.f30948a;
                ze.c.j(bVar3);
            } catch (Throwable th2) {
                th = th2;
                this.f30949b.g0(bVar, bVar3, e10);
                ze.c.j(this.f30948a);
                throw th;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    /* renamed from: gf.f$f */
    /* loaded from: classes3.dex */
    public static final class C0396f extends cf.a {

        /* renamed from: e */
        final /* synthetic */ f f30961e;

        /* renamed from: f */
        final /* synthetic */ int f30962f;

        /* renamed from: g */
        final /* synthetic */ mf.f f30963g;

        /* renamed from: h */
        final /* synthetic */ int f30964h;

        /* renamed from: i */
        final /* synthetic */ boolean f30965i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0396f(String str, boolean z10, String str2, boolean z11, f fVar, int i10, mf.f fVar2, int i11, boolean z12) {
            super(str2, z11);
            this.f30961e = fVar;
            this.f30962f = i10;
            this.f30963g = fVar2;
            this.f30964h = i11;
            this.f30965i = z12;
        }

        @Override // cf.a
        public long f() {
            try {
                boolean b10 = this.f30961e.f30921l.b(this.f30962f, this.f30963g, this.f30964h, this.f30965i);
                if (b10) {
                    this.f30961e.Q0().A(this.f30962f, gf.b.CANCEL);
                }
                if (b10 || this.f30965i) {
                    synchronized (this.f30961e) {
                        this.f30961e.B.remove(Integer.valueOf(this.f30962f));
                    }
                    return -1L;
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    /* loaded from: classes3.dex */
    public static final class g extends cf.a {

        /* renamed from: e */
        final /* synthetic */ f f30966e;

        /* renamed from: f */
        final /* synthetic */ int f30967f;

        /* renamed from: g */
        final /* synthetic */ List f30968g;

        /* renamed from: h */
        final /* synthetic */ boolean f30969h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z10, String str2, boolean z11, f fVar, int i10, List list, boolean z12) {
            super(str2, z11);
            this.f30966e = fVar;
            this.f30967f = i10;
            this.f30968g = list;
            this.f30969h = z12;
        }

        @Override // cf.a
        public long f() {
            boolean d10 = this.f30966e.f30921l.d(this.f30967f, this.f30968g, this.f30969h);
            if (d10) {
                try {
                    this.f30966e.Q0().A(this.f30967f, gf.b.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (d10 || this.f30969h) {
                synchronized (this.f30966e) {
                    this.f30966e.B.remove(Integer.valueOf(this.f30967f));
                }
                return -1L;
            }
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    /* loaded from: classes3.dex */
    public static final class h extends cf.a {

        /* renamed from: e */
        final /* synthetic */ f f30970e;

        /* renamed from: f */
        final /* synthetic */ int f30971f;

        /* renamed from: g */
        final /* synthetic */ List f30972g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, String str2, boolean z11, f fVar, int i10, List list) {
            super(str2, z11);
            this.f30970e = fVar;
            this.f30971f = i10;
            this.f30972g = list;
        }

        @Override // cf.a
        public long f() {
            if (this.f30970e.f30921l.c(this.f30971f, this.f30972g)) {
                try {
                    this.f30970e.Q0().A(this.f30971f, gf.b.CANCEL);
                    synchronized (this.f30970e) {
                        this.f30970e.B.remove(Integer.valueOf(this.f30971f));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    /* loaded from: classes3.dex */
    public static final class i extends cf.a {

        /* renamed from: e */
        final /* synthetic */ f f30973e;

        /* renamed from: f */
        final /* synthetic */ int f30974f;

        /* renamed from: g */
        final /* synthetic */ gf.b f30975g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z10, String str2, boolean z11, f fVar, int i10, gf.b bVar) {
            super(str2, z11);
            this.f30973e = fVar;
            this.f30974f = i10;
            this.f30975g = bVar;
        }

        @Override // cf.a
        public long f() {
            this.f30973e.f30921l.a(this.f30974f, this.f30975g);
            synchronized (this.f30973e) {
                this.f30973e.B.remove(Integer.valueOf(this.f30974f));
                u uVar = u.f29813a;
            }
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    /* loaded from: classes3.dex */
    public static final class j extends cf.a {

        /* renamed from: e */
        final /* synthetic */ f f30976e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, boolean z10, String str2, boolean z11, f fVar) {
            super(str2, z11);
            this.f30976e = fVar;
        }

        @Override // cf.a
        public long f() {
            this.f30976e.s1(false, 2, 0);
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    /* loaded from: classes3.dex */
    public static final class k extends cf.a {

        /* renamed from: e */
        final /* synthetic */ f f30977e;

        /* renamed from: f */
        final /* synthetic */ int f30978f;

        /* renamed from: g */
        final /* synthetic */ gf.b f30979g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z10, String str2, boolean z11, f fVar, int i10, gf.b bVar) {
            super(str2, z11);
            this.f30977e = fVar;
            this.f30978f = i10;
            this.f30979g = bVar;
        }

        @Override // cf.a
        public long f() {
            try {
                this.f30977e.t1(this.f30978f, this.f30979g);
                return -1L;
            } catch (IOException e10) {
                this.f30977e.h0(e10);
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    /* loaded from: classes3.dex */
    public static final class l extends cf.a {

        /* renamed from: e */
        final /* synthetic */ f f30980e;

        /* renamed from: f */
        final /* synthetic */ int f30981f;

        /* renamed from: g */
        final /* synthetic */ long f30982g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z10, String str2, boolean z11, f fVar, int i10, long j10) {
            super(str2, z11);
            this.f30980e = fVar;
            this.f30981f = i10;
            this.f30982g = j10;
        }

        @Override // cf.a
        public long f() {
            try {
                this.f30980e.Q0().L(this.f30981f, this.f30982g);
                return -1L;
            } catch (IOException e10) {
                this.f30980e.h0(e10);
                return -1L;
            }
        }
    }

    static {
        m mVar = new m();
        mVar.h(7, 65535);
        mVar.h(5, 16384);
        C = mVar;
    }

    public f(b bVar) {
        m mVar;
        qe.k.f(bVar, "builder");
        boolean b10 = bVar.b();
        this.f30910a = b10;
        this.f30911b = bVar.d();
        this.f30912c = new LinkedHashMap();
        String c10 = bVar.c();
        this.f30913d = c10;
        this.f30915f = bVar.b() ? 3 : 2;
        cf.e j10 = bVar.j();
        this.f30917h = j10;
        cf.d i10 = j10.i();
        this.f30918i = i10;
        this.f30919j = j10.i();
        this.f30920k = j10.i();
        this.f30921l = bVar.f();
        m mVar2 = new m();
        if (bVar.b()) {
            mVar2.h(7, 16777216);
        }
        u uVar = u.f29813a;
        this.f30928s = mVar2;
        this.f30929t = C;
        this.f30933x = mVar.c();
        this.f30934y = bVar.h();
        this.f30935z = new gf.j(bVar.g(), b10);
        this.A = new e(this, new gf.h(bVar.i(), b10));
        this.B = new LinkedHashSet();
        if (bVar.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(bVar.e());
            String str = c10 + " ping";
            i10.i(new a(str, str, this, nanos), nanos);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0048 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:48:0x0006, B:67:0x0053, B:69:0x0056, B:70:0x005c, B:72:0x0061, B:77:0x006f, B:78:0x007a, B:49:0x0007, B:51:0x000e, B:52:0x0013, B:54:0x0017, B:56:0x002a, B:58:0x0032, B:63:0x0042, B:65:0x0048, B:66:0x0051, B:79:0x007b, B:80:0x0080), top: B:87:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final gf.i U0(int r11, java.util.List<gf.c> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            gf.j r7 = r10.f30935z
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L84
            int r0 = r10.f30915f     // Catch: java.lang.Throwable -> L81
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L13
            gf.b r0 = gf.b.REFUSED_STREAM     // Catch: java.lang.Throwable -> L81
            r10.m1(r0)     // Catch: java.lang.Throwable -> L81
        L13:
            boolean r0 = r10.f30916g     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L7b
            int r8 = r10.f30915f     // Catch: java.lang.Throwable -> L81
            int r0 = r8 + 2
            r10.f30915f = r0     // Catch: java.lang.Throwable -> L81
            gf.i r9 = new gf.i     // Catch: java.lang.Throwable -> L81
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L81
            r0 = 1
            if (r13 == 0) goto L41
            long r1 = r10.f30932w     // Catch: java.lang.Throwable -> L81
            long r3 = r10.f30933x     // Catch: java.lang.Throwable -> L81
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L41
            long r1 = r9.r()     // Catch: java.lang.Throwable -> L81
            long r3 = r9.q()     // Catch: java.lang.Throwable -> L81
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L3f
            goto L41
        L3f:
            r13 = 0
            goto L42
        L41:
            r13 = 1
        L42:
            boolean r1 = r9.u()     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L51
            java.util.Map<java.lang.Integer, gf.i> r1 = r10.f30912c     // Catch: java.lang.Throwable -> L81
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L81
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L81
        L51:
            ee.u r1 = ee.u.f29813a     // Catch: java.lang.Throwable -> L81
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 != 0) goto L5c
            gf.j r11 = r10.f30935z     // Catch: java.lang.Throwable -> L84
            r11.q(r6, r8, r12)     // Catch: java.lang.Throwable -> L84
            goto L66
        L5c:
            boolean r1 = r10.f30910a     // Catch: java.lang.Throwable -> L84
            r0 = r0 ^ r1
            if (r0 == 0) goto L6f
            gf.j r0 = r10.f30935z     // Catch: java.lang.Throwable -> L84
            r0.z(r11, r8, r12)     // Catch: java.lang.Throwable -> L84
        L66:
            monitor-exit(r7)
            if (r13 == 0) goto L6e
            gf.j r11 = r10.f30935z
            r11.flush()
        L6e:
            return r9
        L6f:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L84
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L84
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L84
            throw r12     // Catch: java.lang.Throwable -> L84
        L7b:
            gf.a r11 = new gf.a     // Catch: java.lang.Throwable -> L81
            r11.<init>()     // Catch: java.lang.Throwable -> L81
            throw r11     // Catch: java.lang.Throwable -> L81
        L81:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L84
            throw r11     // Catch: java.lang.Throwable -> L84
        L84:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.f.U0(int, java.util.List, boolean):gf.i");
    }

    public final void h0(IOException iOException) {
        gf.b bVar = gf.b.PROTOCOL_ERROR;
        g0(bVar, bVar, iOException);
    }

    public static /* synthetic */ void o1(f fVar, boolean z10, cf.e eVar, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            eVar = cf.e.f5513h;
        }
        fVar.n1(z10, eVar);
    }

    public final m C0() {
        return this.f30928s;
    }

    public final m E0() {
        return this.f30929t;
    }

    public final synchronized gf.i H0(int i10) {
        return this.f30912c.get(Integer.valueOf(i10));
    }

    public final Map<Integer, gf.i> K0() {
        return this.f30912c;
    }

    public final long N0() {
        return this.f30933x;
    }

    public final gf.j Q0() {
        return this.f30935z;
    }

    public final synchronized boolean T0(long j10) {
        if (this.f30916g) {
            return false;
        }
        if (this.f30925p < this.f30924o) {
            if (j10 >= this.f30927r) {
                return false;
            }
        }
        return true;
    }

    public final gf.i X0(List<gf.c> list, boolean z10) throws IOException {
        qe.k.f(list, "requestHeaders");
        return U0(0, list, z10);
    }

    public final void Y0(int i10, mf.h hVar, int i11, boolean z10) throws IOException {
        qe.k.f(hVar, "source");
        mf.f fVar = new mf.f();
        long j10 = i11;
        hVar.j0(j10);
        hVar.e0(fVar, j10);
        String str = this.f30913d + '[' + i10 + "] onData";
        this.f30919j.i(new C0396f(str, true, str, true, this, i10, fVar, i11, z10), 0L);
    }

    public final void Z0(int i10, List<gf.c> list, boolean z10) {
        qe.k.f(list, "requestHeaders");
        String str = this.f30913d + '[' + i10 + "] onHeaders";
        this.f30919j.i(new g(str, true, str, true, this, i10, list, z10), 0L);
    }

    public final void b1(int i10, List<gf.c> list) {
        qe.k.f(list, "requestHeaders");
        synchronized (this) {
            if (this.B.contains(Integer.valueOf(i10))) {
                u1(i10, gf.b.PROTOCOL_ERROR);
                return;
            }
            this.B.add(Integer.valueOf(i10));
            String str = this.f30913d + '[' + i10 + "] onRequest";
            this.f30919j.i(new h(str, true, str, true, this, i10, list), 0L);
        }
    }

    public final void c1(int i10, gf.b bVar) {
        qe.k.f(bVar, IronSourceConstants.EVENTS_ERROR_CODE);
        String str = this.f30913d + '[' + i10 + "] onReset";
        this.f30919j.i(new i(str, true, str, true, this, i10, bVar), 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        g0(gf.b.NO_ERROR, gf.b.CANCEL, null);
    }

    public final boolean d1(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final void flush() throws IOException {
        this.f30935z.flush();
    }

    public final void g0(gf.b bVar, gf.b bVar2, IOException iOException) {
        int i10;
        qe.k.f(bVar, "connectionCode");
        qe.k.f(bVar2, "streamCode");
        if (ze.c.f40525g && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            qe.k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        try {
            m1(bVar);
        } catch (IOException unused) {
        }
        gf.i[] iVarArr = null;
        synchronized (this) {
            if (!this.f30912c.isEmpty()) {
                Object[] array = this.f30912c.values().toArray(new gf.i[0]);
                if (array != null) {
                    iVarArr = (gf.i[]) array;
                    this.f30912c.clear();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            u uVar = u.f29813a;
        }
        if (iVarArr != null) {
            for (gf.i iVar : iVarArr) {
                try {
                    iVar.d(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f30935z.close();
        } catch (IOException unused3) {
        }
        try {
            this.f30934y.close();
        } catch (IOException unused4) {
        }
        this.f30918i.n();
        this.f30919j.n();
        this.f30920k.n();
    }

    public final synchronized gf.i i1(int i10) {
        gf.i remove;
        remove = this.f30912c.remove(Integer.valueOf(i10));
        notifyAll();
        return remove;
    }

    public final void j1() {
        synchronized (this) {
            long j10 = this.f30925p;
            long j11 = this.f30924o;
            if (j10 < j11) {
                return;
            }
            this.f30924o = j11 + 1;
            this.f30927r = System.nanoTime() + 1000000000;
            u uVar = u.f29813a;
            String str = this.f30913d + " ping";
            this.f30918i.i(new j(str, true, str, true, this), 0L);
        }
    }

    public final void k1(int i10) {
        this.f30914e = i10;
    }

    public final void l1(m mVar) {
        qe.k.f(mVar, "<set-?>");
        this.f30929t = mVar;
    }

    public final boolean m0() {
        return this.f30910a;
    }

    public final void m1(gf.b bVar) throws IOException {
        qe.k.f(bVar, "statusCode");
        synchronized (this.f30935z) {
            synchronized (this) {
                if (this.f30916g) {
                    return;
                }
                this.f30916g = true;
                int i10 = this.f30914e;
                u uVar = u.f29813a;
                this.f30935z.l(i10, bVar, ze.c.f40519a);
            }
        }
    }

    public final void n1(boolean z10, cf.e eVar) throws IOException {
        qe.k.f(eVar, "taskRunner");
        if (z10) {
            this.f30935z.b();
            this.f30935z.C(this.f30928s);
            int c10 = this.f30928s.c();
            if (c10 != 65535) {
                this.f30935z.L(0, c10 - 65535);
            }
        }
        cf.d i10 = eVar.i();
        String str = this.f30913d;
        i10.i(new cf.c(this.A, str, true, str, true), 0L);
    }

    public final synchronized void p1(long j10) {
        long j11 = this.f30930u + j10;
        this.f30930u = j11;
        long j12 = j11 - this.f30931v;
        if (j12 >= this.f30928s.c() / 2) {
            v1(0, j12);
            this.f30931v += j12;
        }
    }

    public final String q0() {
        return this.f30913d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0031, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0033, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r5 - r3), r8.f30935z.w());
        r6 = r3;
        r8.f30932w += r6;
        r4 = ee.u.f29813a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q1(int r9, boolean r10, mf.f r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            gf.j r12 = r8.f30935z
            r12.d(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L6c
            monitor-enter(r8)
        L12:
            long r3 = r8.f30932w     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            long r5 = r8.f30933x     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L32
            java.util.Map<java.lang.Integer, gf.i> r3 = r8.f30912c     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            if (r3 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            goto L12
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            throw r9     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
        L32:
            long r5 = r5 - r3
            long r3 = java.lang.Math.min(r12, r5)     // Catch: java.lang.Throwable -> L5b
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L5b
            gf.j r3 = r8.f30935z     // Catch: java.lang.Throwable -> L5b
            int r3 = r3.w()     // Catch: java.lang.Throwable -> L5b
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L5b
            long r4 = r8.f30932w     // Catch: java.lang.Throwable -> L5b
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L5b
            long r4 = r4 + r6
            r8.f30932w = r4     // Catch: java.lang.Throwable -> L5b
            ee.u r4 = ee.u.f29813a     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r8)
            long r12 = r12 - r6
            gf.j r4 = r8.f30935z
            if (r10 == 0) goto L56
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L56
            r5 = 1
            goto L57
        L56:
            r5 = 0
        L57:
            r4.d(r5, r9, r11, r3)
            goto Ld
        L5b:
            r9 = move-exception
            goto L6a
        L5d:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L5b
            r9.interrupt()     // Catch: java.lang.Throwable -> L5b
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L5b
            r9.<init>()     // Catch: java.lang.Throwable -> L5b
            throw r9     // Catch: java.lang.Throwable -> L5b
        L6a:
            monitor-exit(r8)
            throw r9
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.f.q1(int, boolean, mf.f, long):void");
    }

    public final int r0() {
        return this.f30914e;
    }

    public final void r1(int i10, boolean z10, List<gf.c> list) throws IOException {
        qe.k.f(list, "alternating");
        this.f30935z.q(z10, i10, list);
    }

    public final d s0() {
        return this.f30911b;
    }

    public final void s1(boolean z10, int i10, int i11) {
        try {
            this.f30935z.y(z10, i10, i11);
        } catch (IOException e10) {
            h0(e10);
        }
    }

    public final void t1(int i10, gf.b bVar) throws IOException {
        qe.k.f(bVar, "statusCode");
        this.f30935z.A(i10, bVar);
    }

    public final void u1(int i10, gf.b bVar) {
        qe.k.f(bVar, IronSourceConstants.EVENTS_ERROR_CODE);
        String str = this.f30913d + '[' + i10 + "] writeSynReset";
        this.f30918i.i(new k(str, true, str, true, this, i10, bVar), 0L);
    }

    public final void v1(int i10, long j10) {
        String str = this.f30913d + '[' + i10 + "] windowUpdate";
        this.f30918i.i(new l(str, true, str, true, this, i10, j10), 0L);
    }

    public final int z0() {
        return this.f30915f;
    }
}
