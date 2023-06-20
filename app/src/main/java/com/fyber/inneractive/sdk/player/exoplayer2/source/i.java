package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.d;
import com.fyber.inneractive.sdk.player.exoplayer2.source.l;
import com.fyber.inneractive.sdk.player.exoplayer2.source.m;
import com.fyber.inneractive.sdk.player.exoplayer2.source.n;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.v;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.EOFException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

/* loaded from: classes2.dex */
public final class i implements m, com.fyber.inneractive.sdk.player.exoplayer2.extractor.h, x.a<c>, d.InterfaceC0248d {
    public boolean A;
    public long C;
    public int E;
    public boolean F;
    public boolean G;

    /* renamed from: a  reason: collision with root package name */
    public final Uri f19267a;

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f19268b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19269c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f19270d;

    /* renamed from: e  reason: collision with root package name */
    public final l.a f19271e;

    /* renamed from: f  reason: collision with root package name */
    public final n.a f19272f;

    /* renamed from: g  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f19273g;

    /* renamed from: h  reason: collision with root package name */
    public final String f19274h;

    /* renamed from: j  reason: collision with root package name */
    public final d f19276j;

    /* renamed from: p  reason: collision with root package name */
    public m.a f19282p;

    /* renamed from: q  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.m f19283q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f19284r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f19285s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f19286t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f19287u;

    /* renamed from: v  reason: collision with root package name */
    public int f19288v;

    /* renamed from: w  reason: collision with root package name */
    public s f19289w;

    /* renamed from: x  reason: collision with root package name */
    public long f19290x;

    /* renamed from: y  reason: collision with root package name */
    public boolean[] f19291y;

    /* renamed from: z  reason: collision with root package name */
    public boolean[] f19292z;

    /* renamed from: i  reason: collision with root package name */
    public final x f19275i = new x("Loader:ExtractorMediaPeriod");

    /* renamed from: k  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.d f19277k = new com.fyber.inneractive.sdk.player.exoplayer2.util.d();

    /* renamed from: l  reason: collision with root package name */
    public final Runnable f19278l = new a();

    /* renamed from: m  reason: collision with root package name */
    public final Runnable f19279m = new b();

    /* renamed from: n  reason: collision with root package name */
    public final Handler f19280n = new Handler();
    public long D = -9223372036854775807L;

    /* renamed from: o  reason: collision with root package name */
    public final SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> f19281o = new SparseArray<>();
    public long B = -1;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = i.this;
            if (iVar.G || iVar.f19285s || iVar.f19283q == null || !iVar.f19284r) {
                return;
            }
            int size = iVar.f19281o.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (iVar.f19281o.valueAt(i10).e() == null) {
                    return;
                }
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.d dVar = iVar.f19277k;
            synchronized (dVar) {
                dVar.f19551a = false;
            }
            r[] rVarArr = new r[size];
            iVar.f19292z = new boolean[size];
            iVar.f19291y = new boolean[size];
            iVar.f19290x = iVar.f19283q.c();
            int i11 = 0;
            while (true) {
                boolean z10 = true;
                if (i11 < size) {
                    com.fyber.inneractive.sdk.player.exoplayer2.i e10 = iVar.f19281o.valueAt(i11).e();
                    rVarArr[i11] = new r(e10);
                    String str = e10.f19119f;
                    if (!com.fyber.inneractive.sdk.player.exoplayer2.util.h.e(str) && !com.fyber.inneractive.sdk.player.exoplayer2.util.h.d(str)) {
                        z10 = false;
                    }
                    iVar.f19292z[i11] = z10;
                    iVar.A = z10 | iVar.A;
                    i11++;
                } else {
                    iVar.f19289w = new s(rVarArr);
                    iVar.f19285s = true;
                    iVar.f19272f.a(new q(iVar.f19290x, iVar.f19283q.a()), null);
                    ((com.fyber.inneractive.sdk.player.exoplayer2.h) iVar.f19282p).f19063f.obtainMessage(8, iVar).sendToTarget();
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = i.this;
            if (iVar.G) {
                return;
            }
            ((com.fyber.inneractive.sdk.player.exoplayer2.h) iVar.f19282p).a((p) iVar);
        }
    }

    /* loaded from: classes2.dex */
    public final class c implements x.c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f19295a;

        /* renamed from: b  reason: collision with root package name */
        public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f19296b;

        /* renamed from: c  reason: collision with root package name */
        public final d f19297c;

        /* renamed from: d  reason: collision with root package name */
        public final com.fyber.inneractive.sdk.player.exoplayer2.util.d f19298d;

        /* renamed from: f  reason: collision with root package name */
        public volatile boolean f19300f;

        /* renamed from: h  reason: collision with root package name */
        public long f19302h;

        /* renamed from: e  reason: collision with root package name */
        public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.l f19299e = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.l();

        /* renamed from: g  reason: collision with root package name */
        public boolean f19301g = true;

        /* renamed from: i  reason: collision with root package name */
        public long f19303i = -1;

        public c(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, d dVar, com.fyber.inneractive.sdk.player.exoplayer2.util.d dVar2) {
            this.f19295a = (Uri) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(uri);
            this.f19296b = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.g) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(gVar);
            this.f19297c = (d) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(dVar);
            this.f19298d = dVar2;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.c
        public boolean a() {
            return this.f19300f;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.c
        public void b() {
            this.f19300f = true;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.c
        public void load() throws IOException, InterruptedException {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar;
            long j10;
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar;
            int i10 = 0;
            while (i10 == 0 && !this.f19300f) {
                try {
                    long j11 = this.f19299e.f18411a;
                    j10 = j11;
                    long a10 = this.f19296b.a(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j(this.f19295a, null, j11, j11, -1L, i.this.f19274h, 0));
                    this.f19303i = a10;
                    if (a10 != -1) {
                        this.f19303i = a10 + j10;
                    }
                    gVar = this.f19296b;
                    bVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.b(gVar, j10, this.f19303i);
                } catch (Throwable th) {
                    th = th;
                    bVar = null;
                }
                try {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.f a11 = this.f19297c.a(bVar2, gVar.a());
                    if (this.f19301g) {
                        a11.a(j10, this.f19302h);
                        this.f19301g = false;
                    }
                    while (true) {
                        long j12 = j10;
                        while (i10 == 0 && !this.f19300f) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.d dVar = this.f19298d;
                            synchronized (dVar) {
                                while (!dVar.f19551a) {
                                    dVar.wait();
                                }
                            }
                            i10 = a11.a(bVar2, this.f19299e);
                            j10 = bVar2.f18144c;
                            if (j10 > 1048576 + j12) {
                                com.fyber.inneractive.sdk.player.exoplayer2.util.d dVar2 = this.f19298d;
                                synchronized (dVar2) {
                                    dVar2.f19551a = false;
                                }
                                i iVar = i.this;
                                iVar.f19280n.post(iVar.f19279m);
                            }
                        }
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else {
                        this.f19299e.f18411a = bVar2.f18144c;
                    }
                    u.a(this.f19296b);
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar2;
                    if (i10 != 1 && bVar != null) {
                        this.f19299e.f18411a = bVar.f18144c;
                    }
                    u.a(this.f19296b);
                    throw th;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.f[] f19305a;

        /* renamed from: b  reason: collision with root package name */
        public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.h f19306b;

        /* renamed from: c  reason: collision with root package name */
        public com.fyber.inneractive.sdk.player.exoplayer2.extractor.f f19307c;

        public d(com.fyber.inneractive.sdk.player.exoplayer2.extractor.f[] fVarArr, com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar) {
            this.f19305a = fVarArr;
            this.f19306b = hVar;
        }

        public com.fyber.inneractive.sdk.player.exoplayer2.extractor.f a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar, Uri uri) throws IOException, InterruptedException {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f fVar = this.f19307c;
            if (fVar != null) {
                return fVar;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f[] fVarArr = this.f19305a;
            int length = fVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.f fVar2 = fVarArr[i10];
                try {
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).f18146e = 0;
                    throw th;
                }
                if (fVar2.a(gVar)) {
                    this.f19307c = fVar2;
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).f18146e = 0;
                    break;
                }
                continue;
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).f18146e = 0;
                i10++;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f fVar3 = this.f19307c;
            if (fVar3 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("None of the available extractors (");
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.f[] fVarArr2 = this.f19305a;
                int i11 = u.f19606a;
                StringBuilder sb3 = new StringBuilder();
                for (int i12 = 0; i12 < fVarArr2.length; i12++) {
                    sb3.append(fVarArr2[i12].getClass().getSimpleName());
                    if (i12 < fVarArr2.length - 1) {
                        sb3.append(", ");
                    }
                }
                sb2.append(sb3.toString());
                sb2.append(") could read the stream.");
                throw new t(sb2.toString(), uri);
            }
            fVar3.a(this.f19306b);
            return this.f19307c;
        }
    }

    public i(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.f[] fVarArr, int i10, Handler handler, l.a aVar, n.a aVar2, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, String str) {
        this.f19267a = uri;
        this.f19268b = gVar;
        this.f19269c = i10;
        this.f19270d = handler;
        this.f19271e = aVar;
        this.f19272f = aVar2;
        this.f19273g = bVar;
        this.f19274h = str;
        this.f19276j = new d(fVarArr, this);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
    public void a(c cVar, long j10, long j11, boolean z10) {
        c cVar2 = cVar;
        if (this.B == -1) {
            this.B = cVar2.f19303i;
        }
        if (z10 || this.f19288v <= 0) {
            return;
        }
        int size = this.f19281o.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19281o.valueAt(i10).a(this.f19291y[i10]);
        }
        ((com.fyber.inneractive.sdk.player.exoplayer2.h) this.f19282p).a((p) this);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public s b() {
        return this.f19289w;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.h
    public void c() {
        this.f19284r = true;
        this.f19280n.post(this.f19278l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public void c(long j10) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public long d() {
        long h10;
        if (this.F) {
            return Long.MIN_VALUE;
        }
        if (i()) {
            return this.D;
        }
        if (this.A) {
            h10 = Long.MAX_VALUE;
            int size = this.f19281o.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f19292z[i10]) {
                    h10 = Math.min(h10, this.f19281o.valueAt(i10).d());
                }
            }
        } else {
            h10 = h();
        }
        return h10 == Long.MIN_VALUE ? this.C : h10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public void e() throws IOException {
        this.f19275i.c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public long f() {
        if (this.f19287u) {
            this.f19287u = false;
            return this.C;
        }
        return -9223372036854775807L;
    }

    public final int g() {
        int size = this.f19281o.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            d.c cVar = this.f19281o.valueAt(i11).f18151c;
            i10 += cVar.f18176j + cVar.f18175i;
        }
        return i10;
    }

    public final long h() {
        int size = this.f19281o.size();
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = Math.max(j10, this.f19281o.valueAt(i10).d());
        }
        return j10;
    }

    public final boolean i() {
        return this.D != -9223372036854775807L;
    }

    public final void j() {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar;
        c cVar = new c(this.f19267a, this.f19268b, this.f19276j, this.f19277k);
        if (this.f19285s) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(i());
            long j10 = this.f19290x;
            if (j10 != -9223372036854775807L && this.D >= j10) {
                this.F = true;
                this.D = -9223372036854775807L;
                return;
            }
            long a10 = this.f19283q.a(this.D);
            long j11 = this.D;
            cVar.f19299e.f18411a = a10;
            cVar.f19302h = j11;
            cVar.f19301g = true;
            this.D = -9223372036854775807L;
        }
        this.E = g();
        int i10 = this.f19269c;
        if (i10 == -1) {
            i10 = (this.f19285s && this.B == -1 && ((mVar = this.f19283q) == null || mVar.c() == -9223372036854775807L)) ? 6 : 3;
        }
        this.f19275i.a(cVar, this, i10);
    }

    /* loaded from: classes2.dex */
    public final class e implements o {

        /* renamed from: a  reason: collision with root package name */
        public final int f19308a;

        public e(int i10) {
            this.f19308a = i10;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.o
        public void a() throws IOException {
            i.this.f19275i.c();
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.o
        public boolean isReady() {
            i iVar = i.this;
            return iVar.F || !(iVar.i() || iVar.f19281o.valueAt(this.f19308a).f());
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.o
        public int a(com.fyber.inneractive.sdk.player.exoplayer2.j jVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar, boolean z10) {
            i iVar = i.this;
            int i10 = this.f19308a;
            if (iVar.f19287u || iVar.i()) {
                return -3;
            }
            return iVar.f19281o.valueAt(i10).a(jVar, bVar, z10, iVar.F, iVar.C);
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.o
        public void a(long j10) {
            i iVar = i.this;
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.d valueAt = iVar.f19281o.valueAt(this.f19308a);
            if (iVar.F && j10 > valueAt.d()) {
                valueAt.g();
            } else {
                valueAt.a(j10, true);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public long b(long j10) {
        if (!this.f19283q.a()) {
            j10 = 0;
        }
        this.C = j10;
        int size = this.f19281o.size();
        boolean z10 = !i();
        for (int i10 = 0; z10 && i10 < size; i10++) {
            if (this.f19291y[i10]) {
                z10 = this.f19281o.valueAt(i10).a(j10, false);
            }
        }
        if (!z10) {
            this.D = j10;
            this.F = false;
            if (this.f19275i.b()) {
                this.f19275i.a();
            } else {
                for (int i11 = 0; i11 < size; i11++) {
                    this.f19281o.valueAt(i11).a(this.f19291y[i11]);
                }
            }
        }
        this.f19287u = false;
        return j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
    public void a(c cVar, long j10, long j11) {
        c cVar2 = cVar;
        if (this.B == -1) {
            this.B = cVar2.f19303i;
        }
        this.F = true;
        if (this.f19290x == -9223372036854775807L) {
            long h10 = h();
            this.f19290x = h10 == Long.MIN_VALUE ? 0L : h10 + 10000;
            this.f19272f.a(new q(this.f19290x, this.f19283q.a()), null);
        }
        ((com.fyber.inneractive.sdk.player.exoplayer2.h) this.f19282p).a((p) this);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
    public int a(c cVar, long j10, long j11, IOException iOException) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar;
        c cVar2 = cVar;
        if (this.B == -1) {
            this.B = cVar2.f19303i;
        }
        Handler handler = this.f19270d;
        if (handler != null && this.f19271e != null) {
            handler.post(new k(this, iOException));
        }
        if ((iOException instanceof t) || (iOException instanceof v) || ((iOException instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.t) && iOException.getCause() != null && ((iOException.getCause() instanceof MalformedURLException) || (iOException.getCause() instanceof UnknownHostException)))) {
            return 3;
        }
        int i10 = g() > this.E ? 1 : 0;
        if (this.B == -1 && ((mVar = this.f19283q) == null || mVar.c() == -9223372036854775807L)) {
            this.C = 0L;
            this.f19287u = this.f19285s;
            int size = this.f19281o.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f19281o.valueAt(i11).a(!this.f19285s || this.f19291y[i11]);
            }
            cVar2.f19299e.f18411a = 0L;
            cVar2.f19302h = 0L;
            cVar2.f19301g = true;
        }
        this.E = g();
        return i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public void a(m.a aVar) {
        this.f19282p = aVar;
        com.fyber.inneractive.sdk.player.exoplayer2.util.d dVar = this.f19277k;
        synchronized (dVar) {
            if (!dVar.f19551a) {
                dVar.f19551a = true;
                dVar.notifyAll();
            }
        }
        j();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public long a(com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[] eVarArr, boolean[] zArr, o[] oVarArr, boolean[] zArr2, long j10) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.f19285s);
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            if (oVarArr[i10] != null && (eVarArr[i10] == null || !zArr[i10])) {
                int i11 = ((e) oVarArr[i10]).f19308a;
                com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.f19291y[i11]);
                this.f19288v--;
                this.f19291y[i11] = false;
                this.f19281o.valueAt(i11).b();
                oVarArr[i10] = null;
            }
        }
        boolean z10 = false;
        for (int i12 = 0; i12 < eVarArr.length; i12++) {
            if (oVarArr[i12] == null && eVarArr[i12] != null) {
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e eVar = eVarArr[i12];
                com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(eVar.f() == 1);
                com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(eVar.b(0) == 0);
                int a10 = this.f19289w.a(eVar.b());
                com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(!this.f19291y[a10]);
                this.f19288v++;
                this.f19291y[a10] = true;
                oVarArr[i12] = new e(a10);
                zArr2[i12] = true;
                z10 = true;
            }
        }
        if (!this.f19286t) {
            int size = this.f19281o.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (!this.f19291y[i13]) {
                    this.f19281o.valueAt(i13).b();
                }
            }
        }
        if (this.f19288v == 0) {
            this.f19287u = false;
            if (this.f19275i.b()) {
                this.f19275i.a();
            }
        } else if (!this.f19286t ? j10 != 0 : z10) {
            j10 = b(j10);
            for (int i14 = 0; i14 < oVarArr.length; i14++) {
                if (oVarArr[i14] != null) {
                    zArr2[i14] = true;
                }
            }
        }
        this.f19286t = true;
        return j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m, com.fyber.inneractive.sdk.player.exoplayer2.source.p
    public boolean a(long j10) {
        boolean z10 = false;
        if (this.F || (this.f19285s && this.f19288v == 0)) {
            return false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.d dVar = this.f19277k;
        synchronized (dVar) {
            if (!dVar.f19551a) {
                dVar.f19551a = true;
                dVar.notifyAll();
                z10 = true;
            }
        }
        if (this.f19275i.b()) {
            return z10;
        }
        j();
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m, com.fyber.inneractive.sdk.player.exoplayer2.source.p
    public long a() {
        if (this.f19288v == 0) {
            return Long.MIN_VALUE;
        }
        return d();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.h
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.n a(int i10, int i11) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.d dVar = this.f19281o.get(i10);
        if (dVar == null) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.d dVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.d(this.f19273g);
            dVar2.f18162n = this;
            this.f19281o.put(i10, dVar2);
            return dVar2;
        }
        return dVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar) {
        this.f19283q = mVar;
        this.f19280n.post(this.f19278l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.d.InterfaceC0248d
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.i iVar) {
        this.f19280n.post(this.f19278l);
    }
}
