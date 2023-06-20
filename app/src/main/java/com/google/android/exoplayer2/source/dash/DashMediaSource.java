package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.d;
import com.google.android.exoplayer2.source.dash.f;
import com.inmobi.media.jh;
import da.d0;
import da.e0;
import da.f0;
import da.g0;
import da.l;
import da.m0;
import da.y;
import ea.e0;
import ea.n0;
import ea.r;
import i9.b0;
import i9.n;
import i9.q;
import i9.u;
import j8.j2;
import j8.j3;
import j8.m1;
import j8.x1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m9.j;
import n8.o;

/* loaded from: classes2.dex */
public final class DashMediaSource extends i9.a {
    private e0 A;
    private m0 B;
    private IOException C;
    private Handler D;
    private x1.g E;
    private Uri F;
    private Uri G;
    private m9.c H;
    private boolean I;
    private long J;
    private long K;
    private long L;
    private int M;
    private long N;
    private int O;

    /* renamed from: h */
    private final x1 f21276h;

    /* renamed from: i */
    private final boolean f21277i;

    /* renamed from: j */
    private final l.a f21278j;

    /* renamed from: k */
    private final a.InterfaceC0289a f21279k;

    /* renamed from: l */
    private final i9.h f21280l;

    /* renamed from: m */
    private final com.google.android.exoplayer2.drm.l f21281m;

    /* renamed from: n */
    private final d0 f21282n;

    /* renamed from: o */
    private final l9.b f21283o;

    /* renamed from: p */
    private final long f21284p;

    /* renamed from: q */
    private final b0.a f21285q;

    /* renamed from: r */
    private final g0.a<? extends m9.c> f21286r;

    /* renamed from: s */
    private final e f21287s;

    /* renamed from: t */
    private final Object f21288t;

    /* renamed from: u */
    private final SparseArray<com.google.android.exoplayer2.source.dash.b> f21289u;

    /* renamed from: v */
    private final Runnable f21290v;

    /* renamed from: w */
    private final Runnable f21291w;

    /* renamed from: x */
    private final f.b f21292x;

    /* renamed from: y */
    private final f0 f21293y;

    /* renamed from: z */
    private l f21294z;

    /* loaded from: classes2.dex */
    public static final class Factory implements u.a {

        /* renamed from: a */
        private final a.InterfaceC0289a f21295a;

        /* renamed from: b */
        private final l.a f21296b;

        /* renamed from: c */
        private o f21297c;

        /* renamed from: d */
        private i9.h f21298d;

        /* renamed from: e */
        private d0 f21299e;

        /* renamed from: f */
        private long f21300f;

        /* renamed from: g */
        private g0.a<? extends m9.c> f21301g;

        public Factory(l.a aVar) {
            this(new d.a(aVar), aVar);
        }

        public DashMediaSource a(x1 x1Var) {
            ea.a.e(x1Var.f32820b);
            g0.a aVar = this.f21301g;
            if (aVar == null) {
                aVar = new m9.d();
            }
            List<StreamKey> list = x1Var.f32820b.f32880e;
            return new DashMediaSource(x1Var, null, this.f21296b, !list.isEmpty() ? new com.google.android.exoplayer2.offline.a(aVar, list) : aVar, this.f21295a, this.f21298d, this.f21297c.a(x1Var), this.f21299e, this.f21300f, null);
        }

        public Factory b(o oVar) {
            if (oVar == null) {
                oVar = new i();
            }
            this.f21297c = oVar;
            return this;
        }

        public Factory c(d0 d0Var) {
            if (d0Var == null) {
                d0Var = new y();
            }
            this.f21299e = d0Var;
            return this;
        }

        public Factory(a.InterfaceC0289a interfaceC0289a, l.a aVar) {
            this.f21295a = (a.InterfaceC0289a) ea.a.e(interfaceC0289a);
            this.f21296b = aVar;
            this.f21297c = new i();
            this.f21299e = new y();
            this.f21300f = 30000L;
            this.f21298d = new i9.i();
        }
    }

    /* loaded from: classes2.dex */
    public class a implements e0.b {
        a() {
            DashMediaSource.this = r1;
        }

        @Override // ea.e0.b
        public void a(IOException iOException) {
            DashMediaSource.this.a0(iOException);
        }

        @Override // ea.e0.b
        public void b() {
            DashMediaSource.this.b0(ea.e0.h());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends j3 {

        /* renamed from: b */
        private final long f21303b;

        /* renamed from: c */
        private final long f21304c;

        /* renamed from: d */
        private final long f21305d;

        /* renamed from: e */
        private final int f21306e;

        /* renamed from: f */
        private final long f21307f;

        /* renamed from: g */
        private final long f21308g;

        /* renamed from: h */
        private final long f21309h;

        /* renamed from: i */
        private final m9.c f21310i;

        /* renamed from: j */
        private final x1 f21311j;

        /* renamed from: k */
        private final x1.g f21312k;

        public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, m9.c cVar, x1 x1Var, x1.g gVar) {
            ea.a.f(cVar.f34335d == (gVar != null));
            this.f21303b = j10;
            this.f21304c = j11;
            this.f21305d = j12;
            this.f21306e = i10;
            this.f21307f = j13;
            this.f21308g = j14;
            this.f21309h = j15;
            this.f21310i = cVar;
            this.f21311j = x1Var;
            this.f21312k = gVar;
        }

        private long s(long j10) {
            l9.f l10;
            long j11 = this.f21309h;
            if (t(this.f21310i)) {
                if (j10 > 0) {
                    j11 += j10;
                    if (j11 > this.f21308g) {
                        return -9223372036854775807L;
                    }
                }
                long j12 = this.f21307f + j11;
                long g10 = this.f21310i.g(0);
                int i10 = 0;
                while (i10 < this.f21310i.e() - 1 && j12 >= g10) {
                    j12 -= g10;
                    i10++;
                    g10 = this.f21310i.g(i10);
                }
                m9.g d10 = this.f21310i.d(i10);
                int a10 = d10.a(2);
                return (a10 == -1 || (l10 = d10.f34368c.get(a10).f34324c.get(0).l()) == null || l10.h(g10) == 0) ? j11 : (j11 + l10.b(l10.g(j12, g10))) - j12;
            }
            return j11;
        }

        private static boolean t(m9.c cVar) {
            return cVar.f34335d && cVar.f34336e != -9223372036854775807L && cVar.f34333b == -9223372036854775807L;
        }

        @Override // j8.j3
        public int b(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f21306e) >= 0 && intValue < i()) {
                return intValue;
            }
            return -1;
        }

        @Override // j8.j3
        public j3.b g(int i10, j3.b bVar, boolean z10) {
            ea.a.c(i10, 0, i());
            return bVar.u(z10 ? this.f21310i.d(i10).f34366a : null, z10 ? Integer.valueOf(this.f21306e + i10) : null, 0, this.f21310i.g(i10), n0.C0(this.f21310i.d(i10).f34367b - this.f21310i.d(0).f34367b) - this.f21307f);
        }

        @Override // j8.j3
        public int i() {
            return this.f21310i.e();
        }

        @Override // j8.j3
        public Object m(int i10) {
            ea.a.c(i10, 0, i());
            return Integer.valueOf(this.f21306e + i10);
        }

        @Override // j8.j3
        public j3.c o(int i10, j3.c cVar, long j10) {
            ea.a.c(i10, 0, 1);
            long s10 = s(j10);
            Object obj = j3.c.f32515r;
            x1 x1Var = this.f21311j;
            m9.c cVar2 = this.f21310i;
            return cVar.i(obj, x1Var, cVar2, this.f21303b, this.f21304c, this.f21305d, true, t(cVar2), this.f21312k, s10, this.f21308g, 0, i() - 1, this.f21307f);
        }

        @Override // j8.j3
        public int p() {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public final class c implements f.b {
        private c() {
            DashMediaSource.this = r1;
        }

        @Override // com.google.android.exoplayer2.source.dash.f.b
        public void a(long j10) {
            DashMediaSource.this.T(j10);
        }

        @Override // com.google.android.exoplayer2.source.dash.f.b
        public void b() {
            DashMediaSource.this.U();
        }

        /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements g0.a<Long> {

        /* renamed from: a */
        private static final Pattern f21314a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        d() {
        }

        @Override // da.g0.a
        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) throws IOException {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, ib.d.f31905c)).readLine();
            try {
                Matcher matcher = f21314a.matcher(readLine);
                if (!matcher.matches()) {
                    String valueOf = String.valueOf(readLine);
                    throw j2.c(valueOf.length() != 0 ? "Couldn't parse timestamp: ".concat(valueOf) : new String("Couldn't parse timestamp: "), null);
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= j10 * ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60) * 1000);
                }
                return Long.valueOf(time);
            } catch (ParseException e10) {
                throw j2.c(null, e10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class e implements e0.b<g0<m9.c>> {
        private e() {
            DashMediaSource.this = r1;
        }

        @Override // da.e0.b
        /* renamed from: a */
        public void j(g0<m9.c> g0Var, long j10, long j11, boolean z10) {
            DashMediaSource.this.V(g0Var, j10, j11);
        }

        @Override // da.e0.b
        /* renamed from: b */
        public void m(g0<m9.c> g0Var, long j10, long j11) {
            DashMediaSource.this.W(g0Var, j10, j11);
        }

        @Override // da.e0.b
        /* renamed from: c */
        public e0.c s(g0<m9.c> g0Var, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.X(g0Var, j10, j11, iOException, i10);
        }

        /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class f implements f0 {
        f() {
            DashMediaSource.this = r1;
        }

        private void b() throws IOException {
            if (DashMediaSource.this.C != null) {
                throw DashMediaSource.this.C;
            }
        }

        @Override // da.f0
        public void a() throws IOException {
            DashMediaSource.this.A.a();
            b();
        }
    }

    /* loaded from: classes2.dex */
    public final class g implements e0.b<g0<Long>> {
        private g() {
            DashMediaSource.this = r1;
        }

        @Override // da.e0.b
        /* renamed from: a */
        public void j(g0<Long> g0Var, long j10, long j11, boolean z10) {
            DashMediaSource.this.V(g0Var, j10, j11);
        }

        @Override // da.e0.b
        /* renamed from: b */
        public void m(g0<Long> g0Var, long j10, long j11) {
            DashMediaSource.this.Y(g0Var, j10, j11);
        }

        @Override // da.e0.b
        /* renamed from: c */
        public e0.c s(g0<Long> g0Var, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.Z(g0Var, j10, j11, iOException);
        }

        /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class h implements g0.a<Long> {
        private h() {
        }

        @Override // da.g0.a
        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(n0.J0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        m1.a("goog.exo.dash");
    }

    /* synthetic */ DashMediaSource(x1 x1Var, m9.c cVar, l.a aVar, g0.a aVar2, a.InterfaceC0289a interfaceC0289a, i9.h hVar, com.google.android.exoplayer2.drm.l lVar, d0 d0Var, long j10, a aVar3) {
        this(x1Var, cVar, aVar, aVar2, interfaceC0289a, hVar, lVar, d0Var, j10);
    }

    public static /* synthetic */ void F(DashMediaSource dashMediaSource) {
        dashMediaSource.i0();
    }

    public static /* synthetic */ void G(DashMediaSource dashMediaSource) {
        dashMediaSource.R();
    }

    private static long L(m9.g gVar, long j10, long j11) {
        long C0 = n0.C0(gVar.f34367b);
        boolean P = P(gVar);
        long j12 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < gVar.f34368c.size(); i10++) {
            m9.a aVar = gVar.f34368c.get(i10);
            List<j> list = aVar.f34324c;
            if ((!P || aVar.f34323b != 3) && !list.isEmpty()) {
                l9.f l10 = list.get(0).l();
                if (l10 == null) {
                    return C0 + j10;
                }
                long k10 = l10.k(j10, j11);
                if (k10 == 0) {
                    return C0;
                }
                long d10 = (l10.d(j10, j11) + k10) - 1;
                j12 = Math.min(j12, l10.c(d10, j10) + l10.b(d10) + C0);
            }
        }
        return j12;
    }

    private static long M(m9.g gVar, long j10, long j11) {
        long C0 = n0.C0(gVar.f34367b);
        boolean P = P(gVar);
        long j12 = C0;
        for (int i10 = 0; i10 < gVar.f34368c.size(); i10++) {
            m9.a aVar = gVar.f34368c.get(i10);
            List<j> list = aVar.f34324c;
            if ((!P || aVar.f34323b != 3) && !list.isEmpty()) {
                l9.f l10 = list.get(0).l();
                if (l10 == null || l10.k(j10, j11) == 0) {
                    return C0;
                }
                j12 = Math.max(j12, l10.b(l10.d(j10, j11)) + C0);
            }
        }
        return j12;
    }

    private static long N(m9.c cVar, long j10) {
        l9.f l10;
        int e10 = cVar.e() - 1;
        m9.g d10 = cVar.d(e10);
        long C0 = n0.C0(d10.f34367b);
        long g10 = cVar.g(e10);
        long C02 = n0.C0(j10);
        long C03 = n0.C0(cVar.f34332a);
        long C04 = n0.C0(5000L);
        for (int i10 = 0; i10 < d10.f34368c.size(); i10++) {
            List<j> list = d10.f34368c.get(i10).f34324c;
            if (!list.isEmpty() && (l10 = list.get(0).l()) != null) {
                long e11 = ((C03 + C0) + l10.e(g10, C02)) - C02;
                if (e11 < C04 - 100000 || (e11 > C04 && e11 < C04 + 100000)) {
                    C04 = e11;
                }
            }
        }
        return lb.b.a(C04, 1000L, RoundingMode.CEILING);
    }

    private long O() {
        return Math.min((this.M - 1) * 1000, (int) jh.DEFAULT_BITMAP_TIMEOUT);
    }

    private static boolean P(m9.g gVar) {
        for (int i10 = 0; i10 < gVar.f34368c.size(); i10++) {
            int i11 = gVar.f34368c.get(i10).f34323b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean Q(m9.g gVar) {
        for (int i10 = 0; i10 < gVar.f34368c.size(); i10++) {
            l9.f l10 = gVar.f34368c.get(i10).f34324c.get(0).l();
            if (l10 == null || l10.i()) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ void R() {
        c0(false);
    }

    private void S() {
        ea.e0.j(this.A, new a());
    }

    public void a0(IOException iOException) {
        r.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        c0(true);
    }

    public void b0(long j10) {
        this.L = j10;
        c0(true);
    }

    private void c0(boolean z10) {
        m9.g gVar;
        long j10;
        long j11;
        for (int i10 = 0; i10 < this.f21289u.size(); i10++) {
            int keyAt = this.f21289u.keyAt(i10);
            if (keyAt >= this.O) {
                this.f21289u.valueAt(i10).L(this.H, keyAt - this.O);
            }
        }
        m9.g d10 = this.H.d(0);
        int e10 = this.H.e() - 1;
        m9.g d11 = this.H.d(e10);
        long g10 = this.H.g(e10);
        long C0 = n0.C0(n0.c0(this.L));
        long M = M(d10, this.H.g(0), C0);
        long L = L(d11, g10, C0);
        boolean z11 = this.H.f34335d && !Q(d11);
        if (z11) {
            long j12 = this.H.f34337f;
            if (j12 != -9223372036854775807L) {
                M = Math.max(M, L - n0.C0(j12));
            }
        }
        long j13 = L - M;
        m9.c cVar = this.H;
        if (cVar.f34335d) {
            ea.a.f(cVar.f34332a != -9223372036854775807L);
            long C02 = (C0 - n0.C0(this.H.f34332a)) - M;
            j0(C02, j13);
            long Z0 = this.H.f34332a + n0.Z0(M);
            long C03 = C02 - n0.C0(this.E.f32866a);
            long min = Math.min(5000000L, j13 / 2);
            j10 = Z0;
            j11 = C03 < min ? min : C03;
            gVar = d10;
        } else {
            gVar = d10;
            j10 = -9223372036854775807L;
            j11 = 0;
        }
        long C04 = M - n0.C0(gVar.f34367b);
        m9.c cVar2 = this.H;
        D(new b(cVar2.f34332a, j10, this.L, this.O, C04, j13, j11, cVar2, this.f21276h, cVar2.f34335d ? this.E : null));
        if (this.f21277i) {
            return;
        }
        this.D.removeCallbacks(this.f21291w);
        if (z11) {
            this.D.postDelayed(this.f21291w, N(this.H, n0.c0(this.L)));
        }
        if (this.I) {
            i0();
        } else if (z10) {
            m9.c cVar3 = this.H;
            if (cVar3.f34335d) {
                long j14 = cVar3.f34336e;
                if (j14 != -9223372036854775807L) {
                    if (j14 == 0) {
                        j14 = 5000;
                    }
                    g0(Math.max(0L, (this.J + j14) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void d0(m9.o oVar) {
        String str = oVar.f34417a;
        if (!n0.c(str, "urn:mpeg:dash:utc:direct:2014") && !n0.c(str, "urn:mpeg:dash:utc:direct:2012")) {
            if (!n0.c(str, "urn:mpeg:dash:utc:http-iso:2014") && !n0.c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                if (!n0.c(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !n0.c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                    if (!n0.c(str, "urn:mpeg:dash:utc:ntp:2014") && !n0.c(str, "urn:mpeg:dash:utc:ntp:2012")) {
                        a0(new IOException("Unsupported UTC timing scheme"));
                        return;
                    } else {
                        S();
                        return;
                    }
                }
                f0(oVar, new h(null));
                return;
            }
            f0(oVar, new d());
            return;
        }
        e0(oVar);
    }

    private void e0(m9.o oVar) {
        try {
            b0(n0.J0(oVar.f34418b) - this.K);
        } catch (j2 e10) {
            a0(e10);
        }
    }

    private void f0(m9.o oVar, g0.a<Long> aVar) {
        h0(new g0(this.f21294z, Uri.parse(oVar.f34418b), 5, aVar), new g(this, null), 1);
    }

    private void g0(long j10) {
        this.D.postDelayed(this.f21290v, j10);
    }

    private <T> void h0(g0<T> g0Var, e0.b<g0<T>> bVar, int i10) {
        this.f21285q.z(new n(g0Var.f29170a, g0Var.f29171b, this.A.n(g0Var, bVar, i10)), g0Var.f29172c);
    }

    public void i0() {
        Uri uri;
        this.D.removeCallbacks(this.f21290v);
        if (this.A.i()) {
            return;
        }
        if (this.A.j()) {
            this.I = true;
            return;
        }
        synchronized (this.f21288t) {
            uri = this.F;
        }
        this.I = false;
        h0(new g0(this.f21294z, uri, 4, this.f21286r), this.f21287s, this.f21282n.c(4));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j0(long r18, long r20) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.j0(long, long):void");
    }

    @Override // i9.a
    protected void C(m0 m0Var) {
        this.B = m0Var;
        this.f21281m.a();
        this.f21281m.c(Looper.myLooper(), A());
        if (this.f21277i) {
            c0(false);
            return;
        }
        this.f21294z = this.f21278j.a();
        this.A = new da.e0("DashMediaSource");
        this.D = n0.w();
        i0();
    }

    @Override // i9.a
    protected void E() {
        this.I = false;
        this.f21294z = null;
        da.e0 e0Var = this.A;
        if (e0Var != null) {
            e0Var.l();
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.H = this.f21277i ? this.H : null;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.O = 0;
        this.f21289u.clear();
        this.f21283o.i();
        this.f21281m.release();
    }

    void T(long j10) {
        long j11 = this.N;
        if (j11 == -9223372036854775807L || j11 < j10) {
            this.N = j10;
        }
    }

    void U() {
        this.D.removeCallbacks(this.f21291w);
        i0();
    }

    void V(g0<?> g0Var, long j10, long j11) {
        n nVar = new n(g0Var.f29170a, g0Var.f29171b, g0Var.e(), g0Var.c(), j10, j11, g0Var.a());
        this.f21282n.d(g0Var.f29170a);
        this.f21285q.q(nVar, g0Var.f29172c);
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void W(da.g0<m9.c> r19, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.W(da.g0, long, long):void");
    }

    e0.c X(g0<m9.c> g0Var, long j10, long j11, IOException iOException, int i10) {
        e0.c h10;
        n nVar = new n(g0Var.f29170a, g0Var.f29171b, g0Var.e(), g0Var.c(), j10, j11, g0Var.a());
        long b10 = this.f21282n.b(new d0.c(nVar, new q(g0Var.f29172c), iOException, i10));
        if (b10 == -9223372036854775807L) {
            h10 = da.e0.f29145f;
        } else {
            h10 = da.e0.h(false, b10);
        }
        boolean z10 = !h10.c();
        this.f21285q.x(nVar, g0Var.f29172c, iOException, z10);
        if (z10) {
            this.f21282n.d(g0Var.f29170a);
        }
        return h10;
    }

    void Y(g0<Long> g0Var, long j10, long j11) {
        n nVar = new n(g0Var.f29170a, g0Var.f29171b, g0Var.e(), g0Var.c(), j10, j11, g0Var.a());
        this.f21282n.d(g0Var.f29170a);
        this.f21285q.t(nVar, g0Var.f29172c);
        b0(g0Var.d().longValue() - j10);
    }

    e0.c Z(g0<Long> g0Var, long j10, long j11, IOException iOException) {
        this.f21285q.x(new n(g0Var.f29170a, g0Var.f29171b, g0Var.e(), g0Var.c(), j10, j11, g0Var.a()), g0Var.f29172c, iOException, true);
        this.f21282n.d(g0Var.f29170a);
        a0(iOException);
        return da.e0.f29144e;
    }

    @Override // i9.u
    public x1 d() {
        return this.f21276h;
    }

    @Override // i9.u
    public i9.r f(u.b bVar, da.b bVar2, long j10) {
        int intValue = ((Integer) bVar.f31793a).intValue() - this.O;
        b0.a x10 = x(bVar, this.H.d(intValue).f34367b);
        com.google.android.exoplayer2.source.dash.b bVar3 = new com.google.android.exoplayer2.source.dash.b(intValue + this.O, this.H, this.f21283o, intValue, this.f21279k, this.B, this.f21281m, u(bVar), this.f21282n, x10, this.L, this.f21293y, bVar2, this.f21280l, this.f21292x, A());
        this.f21289u.put(bVar3.f21320a, bVar3);
        return bVar3;
    }

    @Override // i9.u
    public void i(i9.r rVar) {
        com.google.android.exoplayer2.source.dash.b bVar = (com.google.android.exoplayer2.source.dash.b) rVar;
        bVar.H();
        this.f21289u.remove(bVar.f21320a);
    }

    @Override // i9.u
    public void p() throws IOException {
        this.f21293y.a();
    }

    private DashMediaSource(x1 x1Var, m9.c cVar, l.a aVar, g0.a<? extends m9.c> aVar2, a.InterfaceC0289a interfaceC0289a, i9.h hVar, com.google.android.exoplayer2.drm.l lVar, d0 d0Var, long j10) {
        this.f21276h = x1Var;
        this.E = x1Var.f32821c;
        this.F = ((x1.h) ea.a.e(x1Var.f32820b)).f32876a;
        this.G = x1Var.f32820b.f32876a;
        this.H = cVar;
        this.f21278j = aVar;
        this.f21286r = aVar2;
        this.f21279k = interfaceC0289a;
        this.f21281m = lVar;
        this.f21282n = d0Var;
        this.f21284p = j10;
        this.f21280l = hVar;
        this.f21283o = new l9.b();
        boolean z10 = cVar != null;
        this.f21277i = z10;
        this.f21285q = w(null);
        this.f21288t = new Object();
        this.f21289u = new SparseArray<>();
        this.f21292x = new c(this, null);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        if (z10) {
            ea.a.f(true ^ cVar.f34335d);
            this.f21287s = null;
            this.f21290v = null;
            this.f21291w = null;
            this.f21293y = new f0.a();
            return;
        }
        this.f21287s = new e(this, null);
        this.f21293y = new f();
        this.f21290v = new Runnable() { // from class: l9.d
            @Override // java.lang.Runnable
            public final void run() {
                DashMediaSource.F(DashMediaSource.this);
            }
        };
        this.f21291w = new Runnable() { // from class: l9.e
            @Override // java.lang.Runnable
            public final void run() {
                DashMediaSource.G(DashMediaSource.this);
            }
        };
    }
}
