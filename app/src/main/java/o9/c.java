package o9;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.api.Api;
import da.a0;
import da.d0;
import da.e0;
import da.g0;
import ea.n0;
import i9.b0;
import i9.n;
import i9.q;
import j8.j2;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jb.v;
import o9.c;
import o9.g;
import o9.h;
import o9.j;
import o9.l;

/* compiled from: DefaultHlsPlaylistTracker.java */
/* loaded from: classes2.dex */
public final class c implements l, e0.b<g0<i>> {

    /* renamed from: p */
    public static final l.a f35037p = new l.a() { // from class: o9.b
        @Override // o9.l.a
        public final l a(n9.b bVar, d0 d0Var, k kVar) {
            return new c(bVar, d0Var, kVar);
        }
    };

    /* renamed from: a */
    private final n9.b f35038a;

    /* renamed from: b */
    private final k f35039b;

    /* renamed from: c */
    private final d0 f35040c;

    /* renamed from: d */
    private final HashMap<Uri, C0466c> f35041d;

    /* renamed from: e */
    private final CopyOnWriteArrayList<l.b> f35042e;

    /* renamed from: f */
    private final double f35043f;

    /* renamed from: g */
    private b0.a f35044g;

    /* renamed from: h */
    private e0 f35045h;

    /* renamed from: i */
    private Handler f35046i;

    /* renamed from: j */
    private l.e f35047j;

    /* renamed from: k */
    private h f35048k;

    /* renamed from: l */
    private Uri f35049l;

    /* renamed from: m */
    private g f35050m;

    /* renamed from: n */
    private boolean f35051n;

    /* renamed from: o */
    private long f35052o;

    /* compiled from: DefaultHlsPlaylistTracker.java */
    /* loaded from: classes2.dex */
    public class b implements l.b {
        private b() {
            c.this = r1;
        }

        @Override // o9.l.b
        public boolean a(Uri uri, d0.c cVar, boolean z10) {
            C0466c c0466c;
            if (c.this.f35050m == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List<h.b> list = ((h) n0.j(c.this.f35048k)).f35113e;
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C0466c c0466c2 = (C0466c) c.this.f35041d.get(list.get(i11).f35125a);
                    if (c0466c2 != null && elapsedRealtime < c0466c2.f35061h) {
                        i10++;
                    }
                }
                d0.b a10 = c.this.f35040c.a(new d0.a(1, 0, c.this.f35048k.f35113e.size(), i10), cVar);
                if (a10 != null && a10.f29135a == 2 && (c0466c = (C0466c) c.this.f35041d.get(uri)) != null) {
                    c0466c.h(a10.f29136b);
                }
            }
            return false;
        }

        @Override // o9.l.b
        public void j() {
            c.this.f35042e.remove(this);
        }
    }

    /* compiled from: DefaultHlsPlaylistTracker.java */
    /* renamed from: o9.c$c */
    /* loaded from: classes2.dex */
    public final class C0466c implements e0.b<g0<i>> {

        /* renamed from: a */
        private final Uri f35054a;

        /* renamed from: b */
        private final e0 f35055b = new e0("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c */
        private final da.l f35056c;

        /* renamed from: d */
        private g f35057d;

        /* renamed from: e */
        private long f35058e;

        /* renamed from: f */
        private long f35059f;

        /* renamed from: g */
        private long f35060g;

        /* renamed from: h */
        private long f35061h;

        /* renamed from: i */
        private boolean f35062i;

        /* renamed from: j */
        private IOException f35063j;

        public C0466c(Uri uri) {
            c.this = r2;
            this.f35054a = uri;
            this.f35056c = r2.f35038a.a(4);
        }

        public static /* synthetic */ void a(C0466c c0466c, Uri uri) {
            c0466c.n(uri);
        }

        public boolean h(long j10) {
            this.f35061h = SystemClock.elapsedRealtime() + j10;
            return this.f35054a.equals(c.this.f35049l) && !c.this.L();
        }

        private Uri i() {
            g gVar = this.f35057d;
            if (gVar != null) {
                g.f fVar = gVar.f35087v;
                if (fVar.f35106a != -9223372036854775807L || fVar.f35110e) {
                    Uri.Builder buildUpon = this.f35054a.buildUpon();
                    g gVar2 = this.f35057d;
                    if (gVar2.f35087v.f35110e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(gVar2.f35076k + gVar2.f35083r.size()));
                        g gVar3 = this.f35057d;
                        if (gVar3.f35079n != -9223372036854775807L) {
                            List<g.b> list = gVar3.f35084s;
                            int size = list.size();
                            if (!list.isEmpty() && ((g.b) v.c(list)).f35089m) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    g.f fVar2 = this.f35057d.f35087v;
                    if (fVar2.f35106a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", fVar2.f35107b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.f35054a;
        }

        public /* synthetic */ void n(Uri uri) {
            this.f35062i = false;
            p(uri);
        }

        private void p(Uri uri) {
            g0 g0Var = new g0(this.f35056c, uri, 4, c.this.f35039b.b(c.this.f35048k, this.f35057d));
            c.this.f35044g.z(new n(g0Var.f29170a, g0Var.f29171b, this.f35055b.n(g0Var, this, c.this.f35040c.c(g0Var.f29172c))), g0Var.f29172c);
        }

        public void q(final Uri uri) {
            this.f35061h = 0L;
            if (this.f35062i || this.f35055b.j() || this.f35055b.i()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime < this.f35060g) {
                this.f35062i = true;
                c.this.f35046i.postDelayed(new Runnable() { // from class: o9.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.C0466c.a(c.C0466c.this, uri);
                    }
                }, this.f35060g - elapsedRealtime);
                return;
            }
            p(uri);
        }

        public void w(g gVar, n nVar) {
            IOException dVar;
            boolean z10;
            g gVar2 = this.f35057d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f35058e = elapsedRealtime;
            g G = c.this.G(gVar2, gVar);
            this.f35057d = G;
            boolean z11 = false;
            if (G != gVar2) {
                this.f35063j = null;
                this.f35059f = elapsedRealtime;
                c.this.R(this.f35054a, G);
            } else if (!G.f35080o) {
                g gVar3 = this.f35057d;
                if (gVar.f35076k + gVar.f35083r.size() < gVar3.f35076k) {
                    dVar = new l.c(this.f35054a);
                    z10 = true;
                } else {
                    dVar = ((double) (elapsedRealtime - this.f35059f)) > ((double) n0.Z0(gVar3.f35078m)) * c.this.f35043f ? new l.d(this.f35054a) : null;
                    z10 = false;
                }
                if (dVar != null) {
                    this.f35063j = dVar;
                    c.this.N(this.f35054a, new d0.c(nVar, new q(4), dVar, 1), z10);
                }
            }
            long j10 = 0;
            g gVar4 = this.f35057d;
            if (!gVar4.f35087v.f35110e) {
                if (gVar4 != gVar2) {
                    j10 = gVar4.f35078m;
                } else {
                    j10 = gVar4.f35078m / 2;
                }
            }
            this.f35060g = elapsedRealtime + n0.Z0(j10);
            if (!((this.f35057d.f35079n != -9223372036854775807L || this.f35054a.equals(c.this.f35049l)) ? true : true) || this.f35057d.f35080o) {
                return;
            }
            q(i());
        }

        public g k() {
            return this.f35057d;
        }

        public boolean l() {
            int i10;
            if (this.f35057d == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, n0.Z0(this.f35057d.f35086u));
            g gVar = this.f35057d;
            return gVar.f35080o || (i10 = gVar.f35069d) == 2 || i10 == 1 || this.f35058e + max > elapsedRealtime;
        }

        public void o() {
            q(this.f35054a);
        }

        public void r() throws IOException {
            this.f35055b.a();
            IOException iOException = this.f35063j;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // da.e0.b
        /* renamed from: t */
        public void j(g0<i> g0Var, long j10, long j11, boolean z10) {
            n nVar = new n(g0Var.f29170a, g0Var.f29171b, g0Var.e(), g0Var.c(), j10, j11, g0Var.a());
            c.this.f35040c.d(g0Var.f29170a);
            c.this.f35044g.q(nVar, 4);
        }

        @Override // da.e0.b
        /* renamed from: u */
        public void m(g0<i> g0Var, long j10, long j11) {
            i d10 = g0Var.d();
            n nVar = new n(g0Var.f29170a, g0Var.f29171b, g0Var.e(), g0Var.c(), j10, j11, g0Var.a());
            if (d10 instanceof g) {
                w((g) d10, nVar);
                c.this.f35044g.t(nVar, 4);
            } else {
                this.f35063j = j2.c("Loaded playlist has unexpected type.", null);
                c.this.f35044g.x(nVar, 4, this.f35063j, true);
            }
            c.this.f35040c.d(g0Var.f29170a);
        }

        @Override // da.e0.b
        /* renamed from: v */
        public e0.c s(g0<i> g0Var, long j10, long j11, IOException iOException, int i10) {
            e0.c cVar;
            n nVar = new n(g0Var.f29170a, g0Var.f29171b, g0Var.e(), g0Var.c(), j10, j11, g0Var.a());
            boolean z10 = iOException instanceof j.a;
            if ((g0Var.e().getQueryParameter("_HLS_msn") != null) || z10) {
                int i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (iOException instanceof a0.e) {
                    i11 = ((a0.e) iOException).f29120b;
                }
                if (z10 || i11 == 400 || i11 == 503) {
                    this.f35060g = SystemClock.elapsedRealtime();
                    o();
                    ((b0.a) n0.j(c.this.f35044g)).x(nVar, g0Var.f29172c, iOException, true);
                    return e0.f29144e;
                }
            }
            d0.c cVar2 = new d0.c(nVar, new q(g0Var.f29172c), iOException, i10);
            if (c.this.N(this.f35054a, cVar2, false)) {
                long b10 = c.this.f35040c.b(cVar2);
                if (b10 != -9223372036854775807L) {
                    cVar = e0.h(false, b10);
                } else {
                    cVar = e0.f29145f;
                }
            } else {
                cVar = e0.f29144e;
            }
            boolean c10 = true ^ cVar.c();
            c.this.f35044g.x(nVar, g0Var.f29172c, iOException, c10);
            if (c10) {
                c.this.f35040c.d(g0Var.f29170a);
            }
            return cVar;
        }

        public void x() {
            this.f35055b.l();
        }
    }

    public c(n9.b bVar, d0 d0Var, k kVar) {
        this(bVar, d0Var, kVar, 3.5d);
    }

    private void E(List<Uri> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = list.get(i10);
            this.f35041d.put(uri, new C0466c(uri));
        }
    }

    private static g.d F(g gVar, g gVar2) {
        int i10 = (int) (gVar2.f35076k - gVar.f35076k);
        List<g.d> list = gVar.f35083r;
        if (i10 < list.size()) {
            return list.get(i10);
        }
        return null;
    }

    public g G(g gVar, g gVar2) {
        if (gVar2.f(gVar)) {
            return gVar2.c(I(gVar, gVar2), H(gVar, gVar2));
        }
        return gVar2.f35080o ? gVar.d() : gVar;
    }

    private int H(g gVar, g gVar2) {
        g.d F;
        if (gVar2.f35074i) {
            return gVar2.f35075j;
        }
        g gVar3 = this.f35050m;
        int i10 = gVar3 != null ? gVar3.f35075j : 0;
        return (gVar == null || (F = F(gVar, gVar2)) == null) ? i10 : (gVar.f35075j + F.f35098d) - gVar2.f35083r.get(0).f35098d;
    }

    private long I(g gVar, g gVar2) {
        if (gVar2.f35081p) {
            return gVar2.f35073h;
        }
        g gVar3 = this.f35050m;
        long j10 = gVar3 != null ? gVar3.f35073h : 0L;
        if (gVar == null) {
            return j10;
        }
        int size = gVar.f35083r.size();
        g.d F = F(gVar, gVar2);
        if (F != null) {
            return gVar.f35073h + F.f35099e;
        }
        return ((long) size) == gVar2.f35076k - gVar.f35076k ? gVar.e() : j10;
    }

    private Uri J(Uri uri) {
        g.c cVar;
        g gVar = this.f35050m;
        if (gVar == null || !gVar.f35087v.f35110e || (cVar = gVar.f35085t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f35091b));
        int i10 = cVar.f35092c;
        if (i10 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return buildUpon.build();
    }

    private boolean K(Uri uri) {
        List<h.b> list = this.f35048k.f35113e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(list.get(i10).f35125a)) {
                return true;
            }
        }
        return false;
    }

    public boolean L() {
        List<h.b> list = this.f35048k.f35113e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            C0466c c0466c = (C0466c) ea.a.e(this.f35041d.get(list.get(i10).f35125a));
            if (elapsedRealtime > c0466c.f35061h) {
                Uri uri = c0466c.f35054a;
                this.f35049l = uri;
                c0466c.q(J(uri));
                return true;
            }
        }
        return false;
    }

    private void M(Uri uri) {
        if (uri.equals(this.f35049l) || !K(uri)) {
            return;
        }
        g gVar = this.f35050m;
        if (gVar == null || !gVar.f35080o) {
            this.f35049l = uri;
            C0466c c0466c = this.f35041d.get(uri);
            g gVar2 = c0466c.f35057d;
            if (gVar2 == null || !gVar2.f35080o) {
                c0466c.q(J(uri));
                return;
            }
            this.f35050m = gVar2;
            this.f35047j.e(gVar2);
        }
    }

    public boolean N(Uri uri, d0.c cVar, boolean z10) {
        Iterator<l.b> it = this.f35042e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !it.next().a(uri, cVar, z10);
        }
        return z11;
    }

    public void R(Uri uri, g gVar) {
        if (uri.equals(this.f35049l)) {
            if (this.f35050m == null) {
                this.f35051n = !gVar.f35080o;
                this.f35052o = gVar.f35073h;
            }
            this.f35050m = gVar;
            this.f35047j.e(gVar);
        }
        Iterator<l.b> it = this.f35042e.iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    @Override // da.e0.b
    /* renamed from: O */
    public void j(g0<i> g0Var, long j10, long j11, boolean z10) {
        n nVar = new n(g0Var.f29170a, g0Var.f29171b, g0Var.e(), g0Var.c(), j10, j11, g0Var.a());
        this.f35040c.d(g0Var.f29170a);
        this.f35044g.q(nVar, 4);
    }

    @Override // da.e0.b
    /* renamed from: P */
    public void m(g0<i> g0Var, long j10, long j11) {
        h hVar;
        i d10 = g0Var.d();
        boolean z10 = d10 instanceof g;
        if (z10) {
            hVar = h.e(d10.f35131a);
        } else {
            hVar = (h) d10;
        }
        this.f35048k = hVar;
        this.f35049l = hVar.f35113e.get(0).f35125a;
        this.f35042e.add(new b());
        E(hVar.f35112d);
        n nVar = new n(g0Var.f29170a, g0Var.f29171b, g0Var.e(), g0Var.c(), j10, j11, g0Var.a());
        C0466c c0466c = this.f35041d.get(this.f35049l);
        if (z10) {
            c0466c.w((g) d10, nVar);
        } else {
            c0466c.o();
        }
        this.f35040c.d(g0Var.f29170a);
        this.f35044g.t(nVar, 4);
    }

    @Override // da.e0.b
    /* renamed from: Q */
    public e0.c s(g0<i> g0Var, long j10, long j11, IOException iOException, int i10) {
        n nVar = new n(g0Var.f29170a, g0Var.f29171b, g0Var.e(), g0Var.c(), j10, j11, g0Var.a());
        long b10 = this.f35040c.b(new d0.c(nVar, new q(g0Var.f29172c), iOException, i10));
        boolean z10 = b10 == -9223372036854775807L;
        this.f35044g.x(nVar, g0Var.f29172c, iOException, z10);
        if (z10) {
            this.f35040c.d(g0Var.f29170a);
        }
        if (z10) {
            return e0.f29145f;
        }
        return e0.h(false, b10);
    }

    @Override // o9.l
    public void a(Uri uri) throws IOException {
        this.f35041d.get(uri).r();
    }

    @Override // o9.l
    public long b() {
        return this.f35052o;
    }

    @Override // o9.l
    public h c() {
        return this.f35048k;
    }

    @Override // o9.l
    public void d(Uri uri) {
        this.f35041d.get(uri).o();
    }

    @Override // o9.l
    public void e(l.b bVar) {
        this.f35042e.remove(bVar);
    }

    @Override // o9.l
    public void f(l.b bVar) {
        ea.a.e(bVar);
        this.f35042e.add(bVar);
    }

    @Override // o9.l
    public void g(Uri uri, b0.a aVar, l.e eVar) {
        this.f35046i = n0.w();
        this.f35044g = aVar;
        this.f35047j = eVar;
        g0 g0Var = new g0(this.f35038a.a(4), uri, 4, this.f35039b.a());
        ea.a.f(this.f35045h == null);
        e0 e0Var = new e0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f35045h = e0Var;
        aVar.z(new n(g0Var.f29170a, g0Var.f29171b, e0Var.n(g0Var, this, this.f35040c.c(g0Var.f29172c))), g0Var.f29172c);
    }

    @Override // o9.l
    public boolean h(Uri uri) {
        return this.f35041d.get(uri).l();
    }

    @Override // o9.l
    public boolean i() {
        return this.f35051n;
    }

    @Override // o9.l
    public boolean k(Uri uri, long j10) {
        C0466c c0466c = this.f35041d.get(uri);
        if (c0466c != null) {
            return !c0466c.h(j10);
        }
        return false;
    }

    @Override // o9.l
    public void l() throws IOException {
        e0 e0Var = this.f35045h;
        if (e0Var != null) {
            e0Var.a();
        }
        Uri uri = this.f35049l;
        if (uri != null) {
            a(uri);
        }
    }

    @Override // o9.l
    public g n(Uri uri, boolean z10) {
        g k10 = this.f35041d.get(uri).k();
        if (k10 != null && z10) {
            M(uri);
        }
        return k10;
    }

    @Override // o9.l
    public void stop() {
        this.f35049l = null;
        this.f35050m = null;
        this.f35048k = null;
        this.f35052o = -9223372036854775807L;
        this.f35045h.l();
        this.f35045h = null;
        for (C0466c c0466c : this.f35041d.values()) {
            c0466c.x();
        }
        this.f35046i.removeCallbacksAndMessages(null);
        this.f35046i = null;
        this.f35041d.clear();
    }

    public c(n9.b bVar, d0 d0Var, k kVar, double d10) {
        this.f35038a = bVar;
        this.f35039b = kVar;
        this.f35040c = d0Var;
        this.f35043f = d10;
        this.f35042e = new CopyOnWriteArrayList<>();
        this.f35041d = new HashMap<>();
        this.f35052o = -9223372036854775807L;
    }
}
