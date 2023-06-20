package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import ba.q;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.f;
import da.a0;
import da.d0;
import da.f0;
import da.l;
import da.m0;
import ea.n0;
import j8.b3;
import j8.p1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k8.o1;
import k9.g;
import k9.h;
import k9.k;
import k9.m;
import k9.n;
import k9.o;
import k9.p;
import m9.i;
import m9.j;

/* compiled from: DefaultDashChunkSource.java */
/* loaded from: classes2.dex */
public class d implements com.google.android.exoplayer2.source.dash.a {

    /* renamed from: a  reason: collision with root package name */
    private final f0 f21351a;

    /* renamed from: b  reason: collision with root package name */
    private final l9.b f21352b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f21353c;

    /* renamed from: d  reason: collision with root package name */
    private final int f21354d;

    /* renamed from: e  reason: collision with root package name */
    private final l f21355e;

    /* renamed from: f  reason: collision with root package name */
    private final long f21356f;

    /* renamed from: g  reason: collision with root package name */
    private final int f21357g;

    /* renamed from: h  reason: collision with root package name */
    private final f.c f21358h;

    /* renamed from: i  reason: collision with root package name */
    protected final b[] f21359i;

    /* renamed from: j  reason: collision with root package name */
    private q f21360j;

    /* renamed from: k  reason: collision with root package name */
    private m9.c f21361k;

    /* renamed from: l  reason: collision with root package name */
    private int f21362l;

    /* renamed from: m  reason: collision with root package name */
    private IOException f21363m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f21364n;

    /* compiled from: DefaultDashChunkSource.java */
    /* loaded from: classes2.dex */
    public static final class a implements a.InterfaceC0289a {

        /* renamed from: a  reason: collision with root package name */
        private final l.a f21365a;

        /* renamed from: b  reason: collision with root package name */
        private final int f21366b;

        /* renamed from: c  reason: collision with root package name */
        private final g.a f21367c;

        public a(l.a aVar) {
            this(aVar, 1);
        }

        @Override // com.google.android.exoplayer2.source.dash.a.InterfaceC0289a
        public com.google.android.exoplayer2.source.dash.a a(f0 f0Var, m9.c cVar, l9.b bVar, int i10, int[] iArr, q qVar, int i11, long j10, boolean z10, List<p1> list, f.c cVar2, m0 m0Var, o1 o1Var) {
            l a10 = this.f21365a.a();
            if (m0Var != null) {
                a10.l(m0Var);
            }
            return new d(this.f21367c, f0Var, cVar, bVar, i10, iArr, qVar, i11, a10, j10, this.f21366b, z10, list, cVar2, o1Var);
        }

        public a(l.a aVar, int i10) {
            this(k9.e.f33367j, aVar, i10);
        }

        public a(g.a aVar, l.a aVar2, int i10) {
            this.f21367c = aVar;
            this.f21365a = aVar2;
            this.f21366b = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: DefaultDashChunkSource.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final g f21368a;

        /* renamed from: b  reason: collision with root package name */
        public final j f21369b;

        /* renamed from: c  reason: collision with root package name */
        public final m9.b f21370c;

        /* renamed from: d  reason: collision with root package name */
        public final l9.f f21371d;

        /* renamed from: e  reason: collision with root package name */
        private final long f21372e;

        /* renamed from: f  reason: collision with root package name */
        private final long f21373f;

        b(long j10, j jVar, m9.b bVar, g gVar, long j11, l9.f fVar) {
            this.f21372e = j10;
            this.f21369b = jVar;
            this.f21370c = bVar;
            this.f21373f = j11;
            this.f21368a = gVar;
            this.f21371d = fVar;
        }

        b b(long j10, j jVar) throws i9.b {
            long g10;
            long g11;
            l9.f l10 = this.f21369b.l();
            l9.f l11 = jVar.l();
            if (l10 == null) {
                return new b(j10, jVar, this.f21370c, this.f21368a, this.f21373f, l10);
            }
            if (!l10.i()) {
                return new b(j10, jVar, this.f21370c, this.f21368a, this.f21373f, l11);
            }
            long h10 = l10.h(j10);
            if (h10 == 0) {
                return new b(j10, jVar, this.f21370c, this.f21368a, this.f21373f, l11);
            }
            long j11 = l10.j();
            long b10 = l10.b(j11);
            long j12 = (h10 + j11) - 1;
            long j13 = l11.j();
            long b11 = l11.b(j13);
            long j14 = this.f21373f;
            int i10 = ((l10.b(j12) + l10.c(j12, j10)) > b11 ? 1 : ((l10.b(j12) + l10.c(j12, j10)) == b11 ? 0 : -1));
            if (i10 == 0) {
                g10 = j12 + 1;
            } else if (i10 < 0) {
                throw new i9.b();
            } else {
                if (b11 < b10) {
                    g11 = j14 - (l11.g(b10, j10) - j11);
                    return new b(j10, jVar, this.f21370c, this.f21368a, g11, l11);
                }
                g10 = l10.g(b11, j10);
            }
            g11 = j14 + (g10 - j13);
            return new b(j10, jVar, this.f21370c, this.f21368a, g11, l11);
        }

        b c(l9.f fVar) {
            return new b(this.f21372e, this.f21369b, this.f21370c, this.f21368a, this.f21373f, fVar);
        }

        b d(m9.b bVar) {
            return new b(this.f21372e, this.f21369b, bVar, this.f21368a, this.f21373f, this.f21371d);
        }

        public long e(long j10) {
            return this.f21371d.d(this.f21372e, j10) + this.f21373f;
        }

        public long f() {
            return this.f21371d.j() + this.f21373f;
        }

        public long g(long j10) {
            return (e(j10) + this.f21371d.k(this.f21372e, j10)) - 1;
        }

        public long h() {
            return this.f21371d.h(this.f21372e);
        }

        public long i(long j10) {
            return k(j10) + this.f21371d.c(j10 - this.f21373f, this.f21372e);
        }

        public long j(long j10) {
            return this.f21371d.g(j10, this.f21372e) + this.f21373f;
        }

        public long k(long j10) {
            return this.f21371d.b(j10 - this.f21373f);
        }

        public i l(long j10) {
            return this.f21371d.f(j10 - this.f21373f);
        }

        public boolean m(long j10, long j11) {
            return this.f21371d.i() || j11 == -9223372036854775807L || i(j10) <= j11;
        }
    }

    /* compiled from: DefaultDashChunkSource.java */
    /* loaded from: classes2.dex */
    protected static final class c extends k9.b {

        /* renamed from: e  reason: collision with root package name */
        private final b f21374e;

        public c(b bVar, long j10, long j11, long j12) {
            super(j10, j11);
            this.f21374e = bVar;
        }

        @Override // k9.o
        public long a() {
            c();
            return this.f21374e.k(d());
        }

        @Override // k9.o
        public long b() {
            c();
            return this.f21374e.i(d());
        }
    }

    public d(g.a aVar, f0 f0Var, m9.c cVar, l9.b bVar, int i10, int[] iArr, q qVar, int i11, l lVar, long j10, int i12, boolean z10, List<p1> list, f.c cVar2, o1 o1Var) {
        this.f21351a = f0Var;
        this.f21361k = cVar;
        this.f21352b = bVar;
        this.f21353c = iArr;
        this.f21360j = qVar;
        this.f21354d = i11;
        this.f21355e = lVar;
        this.f21362l = i10;
        this.f21356f = j10;
        this.f21357g = i12;
        this.f21358h = cVar2;
        long g10 = cVar.g(i10);
        ArrayList<j> n10 = n();
        this.f21359i = new b[qVar.length()];
        int i13 = 0;
        while (i13 < this.f21359i.length) {
            j jVar = n10.get(qVar.e(i13));
            m9.b j11 = bVar.j(jVar.f34380b);
            b[] bVarArr = this.f21359i;
            if (j11 == null) {
                j11 = jVar.f34380b.get(0);
            }
            int i14 = i13;
            bVarArr[i14] = new b(g10, jVar, j11, aVar.a(i11, jVar.f34379a, z10, list, cVar2, o1Var), 0L, jVar.l());
            i13 = i14 + 1;
        }
    }

    private d0.a k(q qVar, List<m9.b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = qVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (qVar.c(i11, elapsedRealtime)) {
                i10++;
            }
        }
        int f10 = l9.b.f(list);
        return new d0.a(f10, f10 - this.f21352b.g(list), length, i10);
    }

    private long l(long j10, long j11) {
        if (this.f21361k.f34335d) {
            return Math.max(0L, Math.min(m(j10), this.f21359i[0].i(this.f21359i[0].g(j10))) - j11);
        }
        return -9223372036854775807L;
    }

    private long m(long j10) {
        m9.c cVar = this.f21361k;
        long j11 = cVar.f34332a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - n0.C0(j11 + cVar.d(this.f21362l).f34367b);
    }

    private ArrayList<j> n() {
        List<m9.a> list = this.f21361k.d(this.f21362l).f34368c;
        ArrayList<j> arrayList = new ArrayList<>();
        for (int i10 : this.f21353c) {
            arrayList.addAll(list.get(i10).f34324c);
        }
        return arrayList;
    }

    private long o(b bVar, n nVar, long j10, long j11, long j12) {
        if (nVar != null) {
            return nVar.f();
        }
        return n0.r(bVar.j(j10), j11, j12);
    }

    private b r(int i10) {
        b bVar = this.f21359i[i10];
        m9.b j10 = this.f21352b.j(bVar.f21369b.f34380b);
        if (j10 == null || j10.equals(bVar.f21370c)) {
            return bVar;
        }
        b d10 = bVar.d(j10);
        this.f21359i[i10] = d10;
        return d10;
    }

    @Override // k9.j
    public void a() throws IOException {
        IOException iOException = this.f21363m;
        if (iOException == null) {
            this.f21351a.a();
            return;
        }
        throw iOException;
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void b(q qVar) {
        this.f21360j = qVar;
    }

    @Override // k9.j
    public void d(long j10, long j11, List<? extends n> list, h hVar) {
        int i10;
        int i11;
        o[] oVarArr;
        long j12;
        long j13;
        if (this.f21363m != null) {
            return;
        }
        long j14 = j11 - j10;
        long C0 = n0.C0(this.f21361k.f34332a) + n0.C0(this.f21361k.d(this.f21362l).f34367b) + j11;
        f.c cVar = this.f21358h;
        if (cVar == null || !cVar.h(C0)) {
            long C02 = n0.C0(n0.c0(this.f21356f));
            long m10 = m(C02);
            n nVar = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = this.f21360j.length();
            MediaChunkIterator[] mediaChunkIteratorArr = new o[length];
            int i12 = 0;
            while (i12 < length) {
                b bVar = this.f21359i[i12];
                if (bVar.f21371d == null) {
                    mediaChunkIteratorArr[i12] = o.f33437a;
                    i10 = i12;
                    i11 = length;
                    oVarArr = mediaChunkIteratorArr;
                    j12 = j14;
                    j13 = C02;
                } else {
                    long e10 = bVar.e(C02);
                    long g10 = bVar.g(C02);
                    i10 = i12;
                    i11 = length;
                    oVarArr = mediaChunkIteratorArr;
                    j12 = j14;
                    j13 = C02;
                    long o10 = o(bVar, nVar, j11, e10, g10);
                    if (o10 < e10) {
                        oVarArr[i10] = o.f33437a;
                    } else {
                        oVarArr[i10] = new c(r(i10), o10, g10, m10);
                    }
                }
                i12 = i10 + 1;
                C02 = j13;
                mediaChunkIteratorArr = oVarArr;
                length = i11;
                j14 = j12;
            }
            long j15 = j14;
            long j16 = C02;
            this.f21360j.j(j10, j15, l(j16, j10), list, mediaChunkIteratorArr);
            b r10 = r(this.f21360j.a());
            g gVar = r10.f21368a;
            if (gVar != null) {
                j jVar = r10.f21369b;
                i n10 = gVar.d() == null ? jVar.n() : null;
                i m11 = r10.f21371d == null ? jVar.m() : null;
                if (n10 != null || m11 != null) {
                    hVar.f33394a = p(r10, this.f21355e, this.f21360j.p(), this.f21360j.q(), this.f21360j.g(), n10, m11);
                    return;
                }
            }
            long j17 = r10.f21372e;
            int i13 = (j17 > (-9223372036854775807L) ? 1 : (j17 == (-9223372036854775807L) ? 0 : -1));
            boolean z10 = i13 != 0;
            if (r10.h() == 0) {
                hVar.f33395b = z10;
                return;
            }
            long e11 = r10.e(j16);
            long g11 = r10.g(j16);
            long o11 = o(r10, nVar, j11, e11, g11);
            if (o11 < e11) {
                this.f21363m = new i9.b();
                return;
            }
            int i14 = (o11 > g11 ? 1 : (o11 == g11 ? 0 : -1));
            if (i14 <= 0 && (!this.f21364n || i14 < 0)) {
                if (z10 && r10.k(o11) >= j17) {
                    hVar.f33395b = true;
                    return;
                }
                int min = (int) Math.min(this.f21357g, (g11 - o11) + 1);
                if (i13 != 0) {
                    while (min > 1 && r10.k((min + o11) - 1) >= j17) {
                        min--;
                    }
                }
                hVar.f33394a = q(r10, this.f21355e, this.f21354d, this.f21360j.p(), this.f21360j.q(), this.f21360j.g(), o11, min, list.isEmpty() ? j11 : -9223372036854775807L, m10);
                return;
            }
            hVar.f33395b = z10;
        }
    }

    @Override // k9.j
    public long e(long j10, b3 b3Var) {
        b[] bVarArr;
        for (b bVar : this.f21359i) {
            if (bVar.f21371d != null) {
                long j11 = bVar.j(j10);
                long k10 = bVar.k(j11);
                long h10 = bVar.h();
                return b3Var.a(j10, k10, (k10 >= j10 || (h10 != -1 && j11 >= (bVar.f() + h10) - 1)) ? k10 : bVar.k(j11 + 1));
            }
        }
        return j10;
    }

    @Override // k9.j
    public boolean f(long j10, k9.f fVar, List<? extends n> list) {
        if (this.f21363m != null) {
            return false;
        }
        return this.f21360j.r(j10, fVar, list);
    }

    @Override // k9.j
    public void g(k9.f fVar) {
        p8.d c10;
        if (fVar instanceof m) {
            int o10 = this.f21360j.o(((m) fVar).f33388d);
            b bVar = this.f21359i[o10];
            if (bVar.f21371d == null && (c10 = bVar.f21368a.c()) != null) {
                this.f21359i[o10] = bVar.c(new l9.g(c10, bVar.f21369b.f34381c));
            }
        }
        f.c cVar = this.f21358h;
        if (cVar != null) {
            cVar.i(fVar);
        }
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void h(m9.c cVar, int i10) {
        try {
            this.f21361k = cVar;
            this.f21362l = i10;
            long g10 = cVar.g(i10);
            ArrayList<j> n10 = n();
            for (int i11 = 0; i11 < this.f21359i.length; i11++) {
                b[] bVarArr = this.f21359i;
                bVarArr[i11] = bVarArr[i11].b(g10, n10.get(this.f21360j.e(i11)));
            }
        } catch (i9.b e10) {
            this.f21363m = e10;
        }
    }

    @Override // k9.j
    public int i(long j10, List<? extends n> list) {
        if (this.f21363m == null && this.f21360j.length() >= 2) {
            return this.f21360j.m(j10, list);
        }
        return list.size();
    }

    @Override // k9.j
    public boolean j(k9.f fVar, boolean z10, d0.c cVar, d0 d0Var) {
        d0.b a10;
        if (z10) {
            f.c cVar2 = this.f21358h;
            if (cVar2 == null || !cVar2.j(fVar)) {
                if (!this.f21361k.f34335d && (fVar instanceof n)) {
                    IOException iOException = cVar.f29137a;
                    if ((iOException instanceof a0.e) && ((a0.e) iOException).f29120b == 404) {
                        b bVar = this.f21359i[this.f21360j.o(fVar.f33388d)];
                        long h10 = bVar.h();
                        if (h10 != -1 && h10 != 0) {
                            if (((n) fVar).f() > (bVar.f() + h10) - 1) {
                                this.f21364n = true;
                                return true;
                            }
                        }
                    }
                }
                b bVar2 = this.f21359i[this.f21360j.o(fVar.f33388d)];
                m9.b j10 = this.f21352b.j(bVar2.f21369b.f34380b);
                if (j10 == null || bVar2.f21370c.equals(j10)) {
                    d0.a k10 = k(this.f21360j, bVar2.f21369b.f34380b);
                    if ((k10.a(2) || k10.a(1)) && (a10 = d0Var.a(k10, cVar)) != null && k10.a(a10.f29135a)) {
                        int i10 = a10.f29135a;
                        if (i10 == 2) {
                            q qVar = this.f21360j;
                            return qVar.b(qVar.o(fVar.f33388d), a10.f29136b);
                        } else if (i10 == 1) {
                            this.f21352b.e(bVar2.f21370c, a10.f29136b);
                            return true;
                        } else {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    protected k9.f p(b bVar, l lVar, p1 p1Var, int i10, Object obj, i iVar, i iVar2) {
        i iVar3 = iVar;
        j jVar = bVar.f21369b;
        if (iVar3 != null) {
            i a10 = iVar3.a(iVar2, bVar.f21370c.f34328a);
            if (a10 != null) {
                iVar3 = a10;
            }
        } else {
            iVar3 = iVar2;
        }
        return new m(lVar, com.google.android.exoplayer2.source.dash.c.a(jVar, bVar.f21370c.f34328a, iVar3, 0), p1Var, i10, obj, bVar.f21368a);
    }

    protected k9.f q(b bVar, l lVar, int i10, p1 p1Var, int i11, Object obj, long j10, int i12, long j11, long j12) {
        j jVar = bVar.f21369b;
        long k10 = bVar.k(j10);
        i l10 = bVar.l(j10);
        if (bVar.f21368a == null) {
            return new p(lVar, com.google.android.exoplayer2.source.dash.c.a(jVar, bVar.f21370c.f34328a, l10, bVar.m(j10, j12) ? 0 : 8), p1Var, i11, obj, k10, bVar.i(j10), j10, i10, p1Var);
        }
        int i13 = 1;
        int i14 = 1;
        while (i13 < i12) {
            i a10 = l10.a(bVar.l(i13 + j10), bVar.f21370c.f34328a);
            if (a10 == null) {
                break;
            }
            i14++;
            i13++;
            l10 = a10;
        }
        long j13 = (i14 + j10) - 1;
        long i15 = bVar.i(j13);
        long j14 = bVar.f21372e;
        return new k(lVar, com.google.android.exoplayer2.source.dash.c.a(jVar, bVar.f21370c.f34328a, l10, bVar.m(j13, j12) ? 0 : 8), p1Var, i11, obj, k10, i15, j11, (j14 == -9223372036854775807L || j14 > i15) ? -9223372036854775807L : j14, j10, i14, -jVar.f34381c, bVar.f21368a);
    }

    @Override // k9.j
    public void release() {
        for (b bVar : this.f21359i) {
            g gVar = bVar.f21368a;
            if (gVar != null) {
                gVar.release();
            }
        }
    }
}
