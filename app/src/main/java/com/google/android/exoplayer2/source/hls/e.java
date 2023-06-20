package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import ba.q;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import da.m0;
import da.p;
import ea.l0;
import ea.n0;
import i9.w0;
import j8.b3;
import j8.p1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jb.s;
import jb.v;
import k8.o1;
import o9.g;

/* compiled from: HlsChunkSource.java */
/* loaded from: classes2.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    private final f f21447a;

    /* renamed from: b  reason: collision with root package name */
    private final da.l f21448b;

    /* renamed from: c  reason: collision with root package name */
    private final da.l f21449c;

    /* renamed from: d  reason: collision with root package name */
    private final n9.e f21450d;

    /* renamed from: e  reason: collision with root package name */
    private final Uri[] f21451e;

    /* renamed from: f  reason: collision with root package name */
    private final p1[] f21452f;

    /* renamed from: g  reason: collision with root package name */
    private final o9.l f21453g;

    /* renamed from: h  reason: collision with root package name */
    private final w0 f21454h;

    /* renamed from: i  reason: collision with root package name */
    private final List<p1> f21455i;

    /* renamed from: k  reason: collision with root package name */
    private final o1 f21457k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f21458l;

    /* renamed from: n  reason: collision with root package name */
    private IOException f21460n;

    /* renamed from: o  reason: collision with root package name */
    private Uri f21461o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f21462p;

    /* renamed from: q  reason: collision with root package name */
    private q f21463q;

    /* renamed from: s  reason: collision with root package name */
    private boolean f21465s;

    /* renamed from: j  reason: collision with root package name */
    private final com.google.android.exoplayer2.source.hls.d f21456j = new com.google.android.exoplayer2.source.hls.d(4);

    /* renamed from: m  reason: collision with root package name */
    private byte[] f21459m = n0.f29714f;

    /* renamed from: r  reason: collision with root package name */
    private long f21464r = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HlsChunkSource.java */
    /* loaded from: classes2.dex */
    public static final class a extends k9.l {

        /* renamed from: l  reason: collision with root package name */
        private byte[] f21466l;

        public a(da.l lVar, p pVar, p1 p1Var, int i10, Object obj, byte[] bArr) {
            super(lVar, pVar, 3, p1Var, i10, obj, bArr);
        }

        @Override // k9.l
        protected void f(byte[] bArr, int i10) {
            this.f21466l = Arrays.copyOf(bArr, i10);
        }

        public byte[] i() {
            return this.f21466l;
        }
    }

    /* compiled from: HlsChunkSource.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public k9.f f21467a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f21468b;

        /* renamed from: c  reason: collision with root package name */
        public Uri f21469c;

        public b() {
            a();
        }

        public void a() {
            this.f21467a = null;
            this.f21468b = false;
            this.f21469c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HlsChunkSource.java */
    /* loaded from: classes2.dex */
    public static final class c extends k9.b {

        /* renamed from: e  reason: collision with root package name */
        private final List<g.e> f21470e;

        /* renamed from: f  reason: collision with root package name */
        private final long f21471f;

        public c(String str, long j10, List<g.e> list) {
            super(0L, list.size() - 1);
            this.f21471f = j10;
            this.f21470e = list;
        }

        @Override // k9.o
        public long a() {
            c();
            return this.f21471f + this.f21470e.get((int) d()).f35099e;
        }

        @Override // k9.o
        public long b() {
            c();
            g.e eVar = this.f21470e.get((int) d());
            return this.f21471f + eVar.f35099e + eVar.f35097c;
        }
    }

    /* compiled from: HlsChunkSource.java */
    /* loaded from: classes2.dex */
    private static final class d extends ba.c {

        /* renamed from: g  reason: collision with root package name */
        private int f21472g;

        public d(w0 w0Var, int[] iArr) {
            super(w0Var, iArr);
            this.f21472g = o(w0Var.c(iArr[0]));
        }

        @Override // ba.q
        public int a() {
            return this.f21472g;
        }

        @Override // ba.q
        public Object g() {
            return null;
        }

        @Override // ba.q
        public void j(long j10, long j11, long j12, List<? extends k9.n> list, MediaChunkIterator[] mediaChunkIteratorArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (c(this.f21472g, elapsedRealtime)) {
                for (int i10 = this.f5049b - 1; i10 >= 0; i10--) {
                    if (!c(i10, elapsedRealtime)) {
                        this.f21472g = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // ba.q
        public int q() {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HlsChunkSource.java */
    /* renamed from: com.google.android.exoplayer2.source.hls.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0290e {

        /* renamed from: a  reason: collision with root package name */
        public final g.e f21473a;

        /* renamed from: b  reason: collision with root package name */
        public final long f21474b;

        /* renamed from: c  reason: collision with root package name */
        public final int f21475c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f21476d;

        public C0290e(g.e eVar, long j10, int i10) {
            this.f21473a = eVar;
            this.f21474b = j10;
            this.f21475c = i10;
            this.f21476d = (eVar instanceof g.b) && ((g.b) eVar).f35089m;
        }
    }

    public e(f fVar, o9.l lVar, Uri[] uriArr, Format[] formatArr, n9.b bVar, m0 m0Var, n9.e eVar, List<p1> list, o1 o1Var) {
        this.f21447a = fVar;
        this.f21453g = lVar;
        this.f21451e = uriArr;
        this.f21452f = formatArr;
        this.f21450d = eVar;
        this.f21455i = list;
        this.f21457k = o1Var;
        da.l a10 = bVar.a(1);
        this.f21448b = a10;
        if (m0Var != null) {
            a10.l(m0Var);
        }
        this.f21449c = bVar.a(3);
        this.f21454h = new w0(formatArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((formatArr[i10].f32702e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f21463q = new d(this.f21454h, mb.d.l(arrayList));
    }

    private static Uri d(o9.g gVar, g.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f35101g) == null) {
            return null;
        }
        return l0.e(gVar.f35131a, str);
    }

    private Pair<Long, Integer> f(h hVar, boolean z10, o9.g gVar, long j10, long j11) {
        List<g.b> list;
        long j12;
        if (hVar != null && !z10) {
            if (hVar.g()) {
                if (hVar.f21482o == -1) {
                    j12 = hVar.f();
                } else {
                    j12 = hVar.f33436j;
                }
                Long valueOf = Long.valueOf(j12);
                int i10 = hVar.f21482o;
                return new Pair<>(valueOf, Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
            }
            return new Pair<>(Long.valueOf(hVar.f33436j), Integer.valueOf(hVar.f21482o));
        }
        long j13 = gVar.f35086u + j10;
        if (hVar != null && !this.f21462p) {
            j11 = hVar.f33391g;
        }
        if (!gVar.f35080o && j11 >= j13) {
            return new Pair<>(Long.valueOf(gVar.f35076k + gVar.f35083r.size()), -1);
        }
        long j14 = j11 - j10;
        int i11 = 0;
        int g10 = n0.g(gVar.f35083r, Long.valueOf(j14), true, !this.f21453g.i() || hVar == null);
        long j15 = g10 + gVar.f35076k;
        if (g10 >= 0) {
            g.d dVar = gVar.f35083r.get(g10);
            if (j14 < dVar.f35099e + dVar.f35097c) {
                list = dVar.f35094m;
            } else {
                list = gVar.f35084s;
            }
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                g.b bVar = list.get(i11);
                if (j14 >= bVar.f35099e + bVar.f35097c) {
                    i11++;
                } else if (bVar.f35088l) {
                    j15 += list == gVar.f35084s ? 1L : 0L;
                    r1 = i11;
                }
            }
        }
        return new Pair<>(Long.valueOf(j15), Integer.valueOf(r1));
    }

    private static C0290e g(o9.g gVar, long j10, int i10) {
        int i11 = (int) (j10 - gVar.f35076k);
        if (i11 == gVar.f35083r.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < gVar.f35084s.size()) {
                return new C0290e(gVar.f35084s.get(i10), j10, i10);
            }
            return null;
        }
        g.d dVar = gVar.f35083r.get(i11);
        if (i10 == -1) {
            return new C0290e(dVar, j10, -1);
        }
        if (i10 < dVar.f35094m.size()) {
            return new C0290e(dVar.f35094m.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < gVar.f35083r.size()) {
            return new C0290e(gVar.f35083r.get(i12), j10 + 1, -1);
        }
        if (gVar.f35084s.isEmpty()) {
            return null;
        }
        return new C0290e(gVar.f35084s.get(0), j10 + 1, 0);
    }

    static List<g.e> i(o9.g gVar, long j10, int i10) {
        int i11 = (int) (j10 - gVar.f35076k);
        if (i11 >= 0 && gVar.f35083r.size() >= i11) {
            ArrayList arrayList = new ArrayList();
            if (i11 < gVar.f35083r.size()) {
                if (i10 != -1) {
                    g.d dVar = gVar.f35083r.get(i11);
                    if (i10 == 0) {
                        arrayList.add(dVar);
                    } else if (i10 < dVar.f35094m.size()) {
                        List<g.b> list = dVar.f35094m;
                        arrayList.addAll(list.subList(i10, list.size()));
                    }
                    i11++;
                }
                List<g.d> list2 = gVar.f35083r;
                arrayList.addAll(list2.subList(i11, list2.size()));
                i10 = 0;
            }
            if (gVar.f35079n != -9223372036854775807L) {
                int i12 = i10 != -1 ? i10 : 0;
                if (i12 < gVar.f35084s.size()) {
                    List<g.b> list3 = gVar.f35084s;
                    arrayList.addAll(list3.subList(i12, list3.size()));
                }
            }
            return Collections.unmodifiableList(arrayList);
        }
        return s.t();
    }

    private k9.f l(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        byte[] c10 = this.f21456j.c(uri);
        if (c10 != null) {
            this.f21456j.b(uri, c10);
            return null;
        }
        return new a(this.f21449c, new p.b().i(uri).b(1).a(), this.f21452f[i10], this.f21463q.q(), this.f21463q.g(), this.f21459m);
    }

    private long s(long j10) {
        long j11 = this.f21464r;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    private void w(o9.g gVar) {
        this.f21464r = gVar.f35080o ? -9223372036854775807L : gVar.e() - this.f21453g.b();
    }

    public k9.o[] a(h hVar, long j10) {
        int i10;
        int d10 = hVar == null ? -1 : this.f21454h.d(hVar.f33388d);
        int length = this.f21463q.length();
        k9.o[] oVarArr = new k9.o[length];
        boolean z10 = false;
        int i11 = 0;
        while (i11 < length) {
            int e10 = this.f21463q.e(i11);
            Uri uri = this.f21451e[e10];
            if (!this.f21453g.h(uri)) {
                oVarArr[i11] = k9.o.f33437a;
                i10 = i11;
            } else {
                o9.g n10 = this.f21453g.n(uri, z10);
                ea.a.e(n10);
                long b10 = n10.f35073h - this.f21453g.b();
                i10 = i11;
                Pair<Long, Integer> f10 = f(hVar, e10 != d10, n10, b10, j10);
                oVarArr[i10] = new c(n10.f35131a, b10, i(n10, ((Long) f10.first).longValue(), ((Integer) f10.second).intValue()));
            }
            i11 = i10 + 1;
            z10 = false;
        }
        return oVarArr;
    }

    public long b(long j10, b3 b3Var) {
        int a10 = this.f21463q.a();
        Uri[] uriArr = this.f21451e;
        o9.g n10 = (a10 >= uriArr.length || a10 == -1) ? null : this.f21453g.n(uriArr[this.f21463q.n()], true);
        if (n10 == null || n10.f35083r.isEmpty() || !n10.f35133c) {
            return j10;
        }
        long b10 = n10.f35073h - this.f21453g.b();
        long j11 = j10 - b10;
        int g10 = n0.g(n10.f35083r, Long.valueOf(j11), true, true);
        long j12 = n10.f35083r.get(g10).f35099e;
        return b3Var.a(j11, j12, g10 != n10.f35083r.size() - 1 ? n10.f35083r.get(g10 + 1).f35099e : j12) + b10;
    }

    public int c(h hVar) {
        List<g.b> list;
        if (hVar.f21482o == -1) {
            return 1;
        }
        o9.g gVar = (o9.g) ea.a.e(this.f21453g.n(this.f21451e[this.f21454h.d(hVar.f33388d)], false));
        int i10 = (int) (hVar.f33436j - gVar.f35076k);
        if (i10 < 0) {
            return 1;
        }
        if (i10 < gVar.f35083r.size()) {
            list = gVar.f35083r.get(i10).f35094m;
        } else {
            list = gVar.f35084s;
        }
        if (hVar.f21482o >= list.size()) {
            return 2;
        }
        g.b bVar = list.get(hVar.f21482o);
        if (bVar.f35089m) {
            return 0;
        }
        return n0.c(Uri.parse(l0.d(gVar.f35131a, bVar.f35095a)), hVar.f33386b.f29227a) ? 1 : 2;
    }

    public void e(long j10, long j11, List<h> list, boolean z10, b bVar) {
        o9.g gVar;
        long j12;
        Uri uri;
        int i10;
        h hVar = list.isEmpty() ? null : (h) v.c(list);
        int d10 = hVar == null ? -1 : this.f21454h.d(hVar.f33388d);
        long j13 = j11 - j10;
        long s10 = s(j10);
        if (hVar != null && !this.f21462p) {
            long c10 = hVar.c();
            j13 = Math.max(0L, j13 - c10);
            if (s10 != -9223372036854775807L) {
                s10 = Math.max(0L, s10 - c10);
            }
        }
        this.f21463q.j(j10, j13, s10, list, a(hVar, j11));
        int n10 = this.f21463q.n();
        boolean z11 = d10 != n10;
        Uri uri2 = this.f21451e[n10];
        if (!this.f21453g.h(uri2)) {
            bVar.f21469c = uri2;
            this.f21465s &= uri2.equals(this.f21461o);
            this.f21461o = uri2;
            return;
        }
        o9.g n11 = this.f21453g.n(uri2, true);
        ea.a.e(n11);
        this.f21462p = n11.f35133c;
        w(n11);
        long b10 = n11.f35073h - this.f21453g.b();
        Pair<Long, Integer> f10 = f(hVar, z11, n11, b10, j11);
        long longValue = ((Long) f10.first).longValue();
        int intValue = ((Integer) f10.second).intValue();
        if (longValue >= n11.f35076k || hVar == null || !z11) {
            gVar = n11;
            j12 = b10;
            uri = uri2;
            i10 = n10;
        } else {
            Uri uri3 = this.f21451e[d10];
            o9.g n12 = this.f21453g.n(uri3, true);
            ea.a.e(n12);
            j12 = n12.f35073h - this.f21453g.b();
            Pair<Long, Integer> f11 = f(hVar, false, n12, j12, j11);
            longValue = ((Long) f11.first).longValue();
            intValue = ((Integer) f11.second).intValue();
            i10 = d10;
            uri = uri3;
            gVar = n12;
        }
        if (longValue < gVar.f35076k) {
            this.f21460n = new i9.b();
            return;
        }
        C0290e g10 = g(gVar, longValue, intValue);
        if (g10 == null) {
            if (!gVar.f35080o) {
                bVar.f21469c = uri;
                this.f21465s &= uri.equals(this.f21461o);
                this.f21461o = uri;
                return;
            } else if (!z10 && !gVar.f35083r.isEmpty()) {
                g10 = new C0290e((g.e) v.c(gVar.f35083r), (gVar.f35076k + gVar.f35083r.size()) - 1, -1);
            } else {
                bVar.f21468b = true;
                return;
            }
        }
        this.f21465s = false;
        this.f21461o = null;
        Uri d11 = d(gVar, g10.f21473a.f35096b);
        k9.f l10 = l(d11, i10);
        bVar.f21467a = l10;
        if (l10 != null) {
            return;
        }
        Uri d12 = d(gVar, g10.f21473a);
        k9.f l11 = l(d12, i10);
        bVar.f21467a = l11;
        if (l11 != null) {
            return;
        }
        boolean v10 = h.v(hVar, uri, gVar, g10, j12);
        if (v10 && g10.f21476d) {
            return;
        }
        bVar.f21467a = h.i(this.f21447a, this.f21448b, this.f21452f[i10], j12, gVar, g10, uri, this.f21455i, this.f21463q.q(), this.f21463q.g(), this.f21458l, this.f21450d, hVar, this.f21456j.a(d12), this.f21456j.a(d11), v10, this.f21457k);
    }

    public int h(long j10, List<? extends k9.n> list) {
        if (this.f21460n == null && this.f21463q.length() >= 2) {
            return this.f21463q.m(j10, list);
        }
        return list.size();
    }

    public w0 j() {
        return this.f21454h;
    }

    public q k() {
        return this.f21463q;
    }

    public boolean m(k9.f fVar, long j10) {
        q qVar = this.f21463q;
        return qVar.b(qVar.i(this.f21454h.d(fVar.f33388d)), j10);
    }

    public void n() throws IOException {
        IOException iOException = this.f21460n;
        if (iOException == null) {
            Uri uri = this.f21461o;
            if (uri == null || !this.f21465s) {
                return;
            }
            this.f21453g.a(uri);
            return;
        }
        throw iOException;
    }

    public boolean o(Uri uri) {
        return n0.s(this.f21451e, uri);
    }

    public void p(k9.f fVar) {
        if (fVar instanceof a) {
            a aVar = (a) fVar;
            this.f21459m = aVar.g();
            this.f21456j.b(aVar.f33386b.f29227a, (byte[]) ea.a.e(aVar.i()));
        }
    }

    public boolean q(Uri uri, long j10) {
        int i10;
        int i11 = 0;
        while (true) {
            Uri[] uriArr = this.f21451e;
            if (i11 >= uriArr.length) {
                i11 = -1;
                break;
            } else if (uriArr[i11].equals(uri)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1 || (i10 = this.f21463q.i(i11)) == -1) {
            return true;
        }
        this.f21465s |= uri.equals(this.f21461o);
        return j10 == -9223372036854775807L || (this.f21463q.b(i10, j10) && this.f21453g.k(uri, j10));
    }

    public void r() {
        this.f21460n = null;
    }

    public void t(boolean z10) {
        this.f21458l = z10;
    }

    public void u(q qVar) {
        this.f21463q = qVar;
    }

    public boolean v(long j10, k9.f fVar, List<? extends k9.n> list) {
        if (this.f21460n != null) {
            return false;
        }
        return this.f21463q.r(j10, fVar, list);
    }
}
