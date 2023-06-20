package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b;
import com.fyber.inneractive.sdk.player.exoplayer2.i;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.source.f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.q;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import com.fyber.inneractive.sdk.player.exoplayer2.util.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements x.a<y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c>> {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f18368a;

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.d f18369b;

    /* renamed from: d  reason: collision with root package name */
    public final int f18371d;

    /* renamed from: g  reason: collision with root package name */
    public final InterfaceC0251e f18374g;

    /* renamed from: j  reason: collision with root package name */
    public final f.a f18377j;

    /* renamed from: k  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a f18378k;

    /* renamed from: l  reason: collision with root package name */
    public a.C0250a f18379l;

    /* renamed from: m  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b f18380m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f18381n;

    /* renamed from: h  reason: collision with root package name */
    public final List<b> f18375h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final x f18376i = new x("HlsPlaylistTracker:MasterPlaylist");

    /* renamed from: c  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d f18370c = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d();

    /* renamed from: e  reason: collision with root package name */
    public final IdentityHashMap<a.C0250a, a> f18372e = new IdentityHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final Handler f18373f = new Handler();

    /* loaded from: classes.dex */
    public interface b {
        void a(a.C0250a c0250a, long j10);

        void c();
    }

    /* loaded from: classes.dex */
    public static final class c extends IOException {
        public c(String str) {
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends IOException {
        public d(String str) {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0251e {
    }

    public e(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.d dVar, f.a aVar, int i10, InterfaceC0251e interfaceC0251e) {
        this.f18368a = uri;
        this.f18369b = dVar;
        this.f18377j = aVar;
        this.f18371d = i10;
        this.f18374g = interfaceC0251e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
    public void a(y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar, long j10, long j11, boolean z10) {
        y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar2 = yVar;
        this.f18377j.a(yVar2.f19536a, 4, j10, j11, yVar2.f19541f);
    }

    public boolean b(a.C0250a c0250a) {
        int i10;
        a aVar = this.f18372e.get(c0250a);
        if (aVar.f18385d != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, com.fyber.inneractive.sdk.player.exoplayer2.b.b(aVar.f18385d.f18332o));
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar = aVar.f18385d;
            if (bVar.f18327j || (i10 = bVar.f18319b) == 2 || i10 == 1 || aVar.f18386e + max > elapsedRealtime) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
    public void a(y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar, long j10, long j11) {
        y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar;
        y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar3 = yVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c cVar = yVar3.f19539d;
        boolean z10 = cVar instanceof com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b;
        if (z10) {
            yVar2 = yVar3;
            List singletonList = Collections.singletonList(new a.C0250a(cVar.f18342a, new i("0", "application/x-mpegURL", null, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null)));
            List emptyList = Collections.emptyList();
            aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a(null, singletonList, emptyList, emptyList, null, null);
        } else {
            yVar2 = yVar3;
            aVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) cVar;
        }
        this.f18378k = aVar;
        this.f18379l = aVar.f18312b.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(aVar.f18312b);
        arrayList.addAll(aVar.f18313c);
        arrayList.addAll(aVar.f18314d);
        int size = arrayList.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            a.C0250a c0250a = (a.C0250a) arrayList.get(i10);
            this.f18372e.put(c0250a, new a(c0250a, elapsedRealtime));
        }
        a aVar2 = this.f18372e.get(this.f18379l);
        if (z10) {
            aVar2.a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b) cVar);
        } else {
            aVar2.b();
        }
        y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar4 = yVar2;
        this.f18377j.b(yVar4.f19536a, 4, j10, j11, yVar4.f19541f);
    }

    /* loaded from: classes.dex */
    public final class a implements x.a<y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c>>, Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final a.C0250a f18382a;

        /* renamed from: b  reason: collision with root package name */
        public final x f18383b = new x("HlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c  reason: collision with root package name */
        public final y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> f18384c;

        /* renamed from: d  reason: collision with root package name */
        public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b f18385d;

        /* renamed from: e  reason: collision with root package name */
        public long f18386e;

        /* renamed from: f  reason: collision with root package name */
        public long f18387f;

        /* renamed from: g  reason: collision with root package name */
        public long f18388g;

        /* renamed from: h  reason: collision with root package name */
        public long f18389h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f18390i;

        /* renamed from: j  reason: collision with root package name */
        public IOException f18391j;

        public a(a.C0250a c0250a, long j10) {
            this.f18382a = c0250a;
            this.f18388g = j10;
            this.f18384c = new y<>(((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b) e.this.f18369b).a(4), t.a(e.this.f18378k.f18342a, c0250a.f18317a), 4, e.this.f18370c);
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
        public void a(y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar, long j10, long j11, boolean z10) {
            y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar2 = yVar;
            e.this.f18377j.a(yVar2.f19536a, 4, j10, j11, yVar2.f19541f);
        }

        public void b() {
            this.f18389h = 0L;
            if (this.f18390i || this.f18383b.b()) {
                return;
            }
            this.f18383b.a(this.f18384c, this, e.this.f18371d);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18390i = false;
            b();
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
        public void a(y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar, long j10, long j11) {
            y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar2 = yVar;
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c cVar = yVar2.f19539d;
            if (cVar instanceof com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b) {
                a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b) cVar);
                e.this.f18377j.b(yVar2.f19536a, 4, j10, j11, yVar2.f19541f);
                return;
            }
            this.f18391j = new l("Loaded playlist has unexpected type.");
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
        public int a(y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar, long j10, long j11, IOException iOException) {
            y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar2 = yVar;
            boolean z10 = iOException instanceof l;
            e.this.f18377j.a(yVar2.f19536a, 4, j10, j11, yVar2.f19541f, iOException, z10);
            if (z10) {
                return 3;
            }
            boolean z11 = true;
            if (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.b.a(iOException)) {
                a();
                e eVar = e.this;
                if (eVar.f18379l != this.f18382a || e.a(eVar)) {
                    z11 = false;
                }
            }
            return z11 ? 0 : 2;
        }

        public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar) {
            long j10;
            long j11;
            long j12;
            long j13;
            int i10;
            b.a a10;
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar2;
            long j14;
            int i11;
            int i12;
            int size;
            int size2;
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar3 = this.f18385d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f18386e = elapsedRealtime;
            e eVar = e.this;
            eVar.getClass();
            bVar.getClass();
            if (!(bVar3 == null || (i11 = bVar.f18324g) > (i12 = bVar3.f18324g) || (i11 >= i12 && ((size = bVar.f18330m.size()) > (size2 = bVar3.f18330m.size()) || (size == size2 && bVar.f18327j && !bVar3.f18327j))))) {
                if (!bVar.f18327j || bVar3.f18327j) {
                    j10 = elapsedRealtime;
                    bVar2 = bVar3;
                } else {
                    j10 = elapsedRealtime;
                    bVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b(bVar3.f18319b, bVar3.f18342a, bVar3.f18320c, bVar3.f18321d, bVar3.f18322e, bVar3.f18323f, bVar3.f18324g, bVar3.f18325h, bVar3.f18326i, true, bVar3.f18328k, bVar3.f18329l, bVar3.f18330m, bVar3.f18331n);
                }
            } else {
                j10 = elapsedRealtime;
                if (bVar.f18328k) {
                    j11 = bVar.f18321d;
                } else {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar4 = eVar.f18380m;
                    j11 = bVar4 != null ? bVar4.f18321d : 0L;
                    if (bVar3 != null) {
                        int size3 = bVar3.f18330m.size();
                        b.a a11 = e.a(bVar3, bVar);
                        if (a11 != null) {
                            j12 = bVar3.f18321d;
                            j13 = a11.f18336d;
                        } else if (size3 == bVar.f18324g - bVar3.f18324g) {
                            j12 = bVar3.f18321d;
                            j13 = bVar3.f18332o;
                        }
                        j11 = j12 + j13;
                    }
                }
                long j15 = j11;
                if (bVar.f18322e) {
                    i10 = bVar.f18323f;
                } else {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar5 = eVar.f18380m;
                    i10 = bVar5 != null ? bVar5.f18323f : 0;
                    if (bVar3 != null && (a10 = e.a(bVar3, bVar)) != null) {
                        i10 = (bVar3.f18323f + a10.f18335c) - bVar.f18330m.get(0).f18335c;
                    }
                }
                bVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b(bVar.f18319b, bVar.f18342a, bVar.f18320c, j15, true, i10, bVar.f18324g, bVar.f18325h, bVar.f18326i, bVar.f18327j, bVar.f18328k, bVar.f18329l, bVar.f18330m, bVar.f18331n);
            }
            this.f18385d = bVar2;
            if (bVar2 != bVar3) {
                this.f18391j = null;
                this.f18387f = j10;
                if (e.a(e.this, this.f18382a, bVar2)) {
                    j14 = this.f18385d.f18326i;
                }
                j14 = -9223372036854775807L;
            } else {
                long j16 = j10;
                if (!bVar2.f18327j) {
                    if (j16 - this.f18387f > com.fyber.inneractive.sdk.player.exoplayer2.b.b(bVar2.f18326i) * 3.5d) {
                        this.f18391j = new d(this.f18382a.f18317a);
                        a();
                    } else if (bVar.f18324g + bVar.f18330m.size() < this.f18385d.f18324g) {
                        this.f18391j = new c(this.f18382a.f18317a);
                    }
                    j14 = this.f18385d.f18326i / 2;
                }
                j14 = -9223372036854775807L;
            }
            if (j14 != -9223372036854775807L) {
                this.f18390i = e.this.f18373f.postDelayed(this, com.fyber.inneractive.sdk.player.exoplayer2.b.b(j14));
            }
        }

        public final void a() {
            this.f18389h = SystemClock.elapsedRealtime() + 60000;
            e eVar = e.this;
            a.C0250a c0250a = this.f18382a;
            int size = eVar.f18375h.size();
            for (int i10 = 0; i10 < size; i10++) {
                eVar.f18375h.get(i10).a(c0250a, 60000L);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
    public int a(y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar, long j10, long j11, IOException iOException) {
        y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar2 = yVar;
        boolean z10 = iOException instanceof l;
        this.f18377j.a(yVar2.f19536a, 4, j10, j11, yVar2.f19541f, iOException, z10);
        return z10 ? 3 : 0;
    }

    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b a(a.C0250a c0250a) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar;
        a aVar = this.f18372e.get(c0250a);
        aVar.getClass();
        aVar.f18388g = SystemClock.elapsedRealtime();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar2 = aVar.f18385d;
        if (bVar2 != null && this.f18378k.f18312b.contains(c0250a) && (((bVar = this.f18380m) == null || !bVar.f18327j) && this.f18372e.get(this.f18379l).f18388g - SystemClock.elapsedRealtime() > 15000)) {
            this.f18379l = c0250a;
            this.f18372e.get(c0250a).b();
        }
        return bVar2;
    }

    public static boolean a(e eVar) {
        List<a.C0250a> list = eVar.f18378k.f18312b;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = eVar.f18372e.get(list.get(i10));
            if (elapsedRealtime > aVar.f18389h) {
                eVar.f18379l = aVar.f18382a;
                aVar.b();
                return true;
            }
        }
        return false;
    }

    public static boolean a(e eVar, a.C0250a c0250a, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar) {
        q qVar;
        long j10;
        if (c0250a == eVar.f18379l) {
            if (eVar.f18380m == null) {
                eVar.f18381n = !bVar.f18327j;
            }
            eVar.f18380m = bVar;
            h hVar = (h) eVar.f18374g;
            hVar.getClass();
            long j11 = bVar.f18320c;
            if (hVar.f18273d.f18381n) {
                long j12 = bVar.f18327j ? bVar.f18321d + bVar.f18332o : -9223372036854775807L;
                List<b.a> list = bVar.f18330m;
                if (j11 == -9223372036854775807L) {
                    if (!list.isEmpty()) {
                        j11 = list.get(Math.max(0, list.size() - 3)).f18336d;
                    } else {
                        j10 = 0;
                        qVar = new q(j12, bVar.f18332o, bVar.f18321d, j10, true, !bVar.f18327j);
                    }
                }
                j10 = j11;
                qVar = new q(j12, bVar.f18332o, bVar.f18321d, j10, true, !bVar.f18327j);
            } else {
                long j13 = j11 == -9223372036854775807L ? 0L : j11;
                long j14 = bVar.f18321d;
                long j15 = bVar.f18332o;
                qVar = new q(j14 + j15, j15, j14, j13, true, false);
            }
            hVar.f18274e.a(qVar, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.e(hVar.f18273d.f18378k, bVar));
        }
        int size = eVar.f18375h.size();
        for (int i10 = 0; i10 < size; i10++) {
            eVar.f18375h.get(i10).c();
        }
        return c0250a == eVar.f18379l && !bVar.f18327j;
    }

    public static b.a a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar2) {
        int i10 = bVar2.f18324g - bVar.f18324g;
        List<b.a> list = bVar.f18330m;
        if (i10 < list.size()) {
            return list.get(i10);
        }
        return null;
    }
}
