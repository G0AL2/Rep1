package i9;

import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import i9.r;
import j8.b3;
import j8.p1;
import j8.q1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: MergingMediaPeriod.java */
/* loaded from: classes2.dex */
final class c0 implements r, r.a {

    /* renamed from: a  reason: collision with root package name */
    private final r[] f31569a;

    /* renamed from: c  reason: collision with root package name */
    private final h f31571c;

    /* renamed from: f  reason: collision with root package name */
    private r.a f31574f;

    /* renamed from: g  reason: collision with root package name */
    private y0 f31575g;

    /* renamed from: i  reason: collision with root package name */
    private p0 f31577i;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<r> f31572d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<w0, w0> f31573e = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final IdentityHashMap<o0, Integer> f31570b = new IdentityHashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private r[] f31576h = new r[0];

    /* compiled from: MergingMediaPeriod.java */
    /* loaded from: classes2.dex */
    private static final class a implements ba.q {

        /* renamed from: a  reason: collision with root package name */
        private final ba.q f31578a;

        /* renamed from: b  reason: collision with root package name */
        private final w0 f31579b;

        public a(ba.q qVar, w0 w0Var) {
            this.f31578a = qVar;
            this.f31579b = w0Var;
        }

        @Override // ba.q
        public int a() {
            return this.f31578a.a();
        }

        @Override // ba.q
        public boolean b(int i10, long j10) {
            return this.f31578a.b(i10, j10);
        }

        @Override // ba.q
        public boolean c(int i10, long j10) {
            return this.f31578a.c(i10, j10);
        }

        @Override // ba.t
        public p1 d(int i10) {
            return this.f31578a.d(i10);
        }

        @Override // ba.q
        public void disable() {
            this.f31578a.disable();
        }

        @Override // ba.t
        public int e(int i10) {
            return this.f31578a.e(i10);
        }

        @Override // ba.q
        public void enable() {
            this.f31578a.enable();
        }

        @Override // ba.q
        public void f(float f10) {
            this.f31578a.f(f10);
        }

        @Override // ba.q
        public Object g() {
            return this.f31578a.g();
        }

        @Override // ba.q
        public void h() {
            this.f31578a.h();
        }

        @Override // ba.t
        public int i(int i10) {
            return this.f31578a.i(i10);
        }

        @Override // ba.q
        public void j(long j10, long j11, long j12, List<? extends k9.n> list, MediaChunkIterator[] mediaChunkIteratorArr) {
            this.f31578a.j(j10, j11, j12, list, mediaChunkIteratorArr);
        }

        @Override // ba.t
        public w0 k() {
            return this.f31579b;
        }

        @Override // ba.q
        public void l(boolean z10) {
            this.f31578a.l(z10);
        }

        @Override // ba.t
        public int length() {
            return this.f31578a.length();
        }

        @Override // ba.q
        public int m(long j10, List<? extends k9.n> list) {
            return this.f31578a.m(j10, list);
        }

        @Override // ba.q
        public int n() {
            return this.f31578a.n();
        }

        @Override // ba.t
        public int o(p1 p1Var) {
            return this.f31578a.o(p1Var);
        }

        @Override // ba.q
        public p1 p() {
            return this.f31578a.p();
        }

        @Override // ba.q
        public int q() {
            return this.f31578a.q();
        }

        @Override // ba.q
        public boolean r(long j10, k9.f fVar, List<? extends k9.n> list) {
            return this.f31578a.r(j10, fVar, list);
        }

        @Override // ba.q
        public void s() {
            this.f31578a.s();
        }
    }

    /* compiled from: MergingMediaPeriod.java */
    /* loaded from: classes2.dex */
    private static final class b implements r, r.a {

        /* renamed from: a  reason: collision with root package name */
        private final r f31580a;

        /* renamed from: b  reason: collision with root package name */
        private final long f31581b;

        /* renamed from: c  reason: collision with root package name */
        private r.a f31582c;

        public b(r rVar, long j10) {
            this.f31580a = rVar;
            this.f31581b = j10;
        }

        @Override // i9.r, i9.p0
        public long b() {
            long b10 = this.f31580a.b();
            if (b10 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f31581b + b10;
        }

        @Override // i9.r, i9.p0
        public boolean c() {
            return this.f31580a.c();
        }

        @Override // i9.r, i9.p0
        public boolean d(long j10) {
            return this.f31580a.d(j10 - this.f31581b);
        }

        @Override // i9.r
        public long e(long j10, b3 b3Var) {
            return this.f31580a.e(j10 - this.f31581b, b3Var) + this.f31581b;
        }

        @Override // i9.r.a
        public void f(r rVar) {
            ((r.a) ea.a.e(this.f31582c)).f(this);
        }

        @Override // i9.r, i9.p0
        public long g() {
            long g10 = this.f31580a.g();
            if (g10 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f31581b + g10;
        }

        @Override // i9.r, i9.p0
        public void h(long j10) {
            this.f31580a.h(j10 - this.f31581b);
        }

        @Override // i9.r
        public void i(r.a aVar, long j10) {
            this.f31582c = aVar;
            this.f31580a.i(this, j10 - this.f31581b);
        }

        @Override // i9.p0.a
        /* renamed from: j */
        public void m(r rVar) {
            ((r.a) ea.a.e(this.f31582c)).m(this);
        }

        @Override // i9.r
        public long k(long j10) {
            return this.f31580a.k(j10 - this.f31581b) + this.f31581b;
        }

        @Override // i9.r
        public long l() {
            long l10 = this.f31580a.l();
            if (l10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f31581b + l10;
        }

        @Override // i9.r
        public long p(ba.q[] qVarArr, boolean[] zArr, o0[] o0VarArr, boolean[] zArr2, long j10) {
            o0[] o0VarArr2 = new o0[o0VarArr.length];
            int i10 = 0;
            while (true) {
                o0 o0Var = null;
                if (i10 >= o0VarArr.length) {
                    break;
                }
                c cVar = (c) o0VarArr[i10];
                if (cVar != null) {
                    o0Var = cVar.b();
                }
                o0VarArr2[i10] = o0Var;
                i10++;
            }
            long p10 = this.f31580a.p(qVarArr, zArr, o0VarArr2, zArr2, j10 - this.f31581b);
            for (int i11 = 0; i11 < o0VarArr.length; i11++) {
                o0 o0Var2 = o0VarArr2[i11];
                if (o0Var2 == null) {
                    o0VarArr[i11] = null;
                } else if (o0VarArr[i11] == null || ((c) o0VarArr[i11]).b() != o0Var2) {
                    o0VarArr[i11] = new c(o0Var2, this.f31581b);
                }
            }
            return p10 + this.f31581b;
        }

        @Override // i9.r
        public void q() throws IOException {
            this.f31580a.q();
        }

        @Override // i9.r
        public y0 t() {
            return this.f31580a.t();
        }

        @Override // i9.r
        public void u(long j10, boolean z10) {
            this.f31580a.u(j10 - this.f31581b, z10);
        }
    }

    /* compiled from: MergingMediaPeriod.java */
    /* loaded from: classes2.dex */
    private static final class c implements o0 {

        /* renamed from: a  reason: collision with root package name */
        private final o0 f31583a;

        /* renamed from: b  reason: collision with root package name */
        private final long f31584b;

        public c(o0 o0Var, long j10) {
            this.f31583a = o0Var;
            this.f31584b = j10;
        }

        @Override // i9.o0
        public void a() throws IOException {
            this.f31583a.a();
        }

        public o0 b() {
            return this.f31583a;
        }

        @Override // i9.o0
        public int f(q1 q1Var, m8.g gVar, int i10) {
            int f10 = this.f31583a.f(q1Var, gVar, i10);
            if (f10 == -4) {
                gVar.f34292e = Math.max(0L, gVar.f34292e + this.f31584b);
            }
            return f10;
        }

        @Override // i9.o0
        public boolean isReady() {
            return this.f31583a.isReady();
        }

        @Override // i9.o0
        public int n(long j10) {
            return this.f31583a.n(j10 - this.f31584b);
        }
    }

    public c0(h hVar, long[] jArr, r... rVarArr) {
        this.f31571c = hVar;
        this.f31569a = rVarArr;
        this.f31577i = hVar.a(new p0[0]);
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            if (jArr[i10] != 0) {
                this.f31569a[i10] = new b(rVarArr[i10], jArr[i10]);
            }
        }
    }

    public r a(int i10) {
        r[] rVarArr = this.f31569a;
        if (rVarArr[i10] instanceof b) {
            return ((b) rVarArr[i10]).f31580a;
        }
        return rVarArr[i10];
    }

    @Override // i9.r, i9.p0
    public long b() {
        return this.f31577i.b();
    }

    @Override // i9.r, i9.p0
    public boolean c() {
        return this.f31577i.c();
    }

    @Override // i9.r, i9.p0
    public boolean d(long j10) {
        if (!this.f31572d.isEmpty()) {
            int size = this.f31572d.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f31572d.get(i10).d(j10);
            }
            return false;
        }
        return this.f31577i.d(j10);
    }

    @Override // i9.r
    public long e(long j10, b3 b3Var) {
        r[] rVarArr = this.f31576h;
        return (rVarArr.length > 0 ? rVarArr[0] : this.f31569a[0]).e(j10, b3Var);
    }

    @Override // i9.r.a
    public void f(r rVar) {
        this.f31572d.remove(rVar);
        if (!this.f31572d.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (r rVar2 : this.f31569a) {
            i10 += rVar2.t().f31863a;
        }
        w0[] w0VarArr = new w0[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            r[] rVarArr = this.f31569a;
            if (i11 < rVarArr.length) {
                y0 t10 = rVarArr[i11].t();
                int i13 = t10.f31863a;
                int i14 = 0;
                while (i14 < i13) {
                    w0 b10 = t10.b(i14);
                    String str = b10.f31847b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
                    sb2.append(i11);
                    sb2.append(":");
                    sb2.append(str);
                    w0 b11 = b10.b(sb2.toString());
                    this.f31573e.put(b11, b10);
                    w0VarArr[i12] = b11;
                    i14++;
                    i12++;
                }
                i11++;
            } else {
                this.f31575g = new y0(w0VarArr);
                ((r.a) ea.a.e(this.f31574f)).f(this);
                return;
            }
        }
    }

    @Override // i9.r, i9.p0
    public long g() {
        return this.f31577i.g();
    }

    @Override // i9.r, i9.p0
    public void h(long j10) {
        this.f31577i.h(j10);
    }

    @Override // i9.r
    public void i(r.a aVar, long j10) {
        this.f31574f = aVar;
        Collections.addAll(this.f31572d, this.f31569a);
        for (r rVar : this.f31569a) {
            rVar.i(this, j10);
        }
    }

    @Override // i9.p0.a
    /* renamed from: j */
    public void m(r rVar) {
        ((r.a) ea.a.e(this.f31574f)).m(this);
    }

    @Override // i9.r
    public long k(long j10) {
        long k10 = this.f31576h[0].k(j10);
        int i10 = 1;
        while (true) {
            r[] rVarArr = this.f31576h;
            if (i10 >= rVarArr.length) {
                return k10;
            }
            if (rVarArr[i10].k(k10) != k10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // i9.r
    public long l() {
        r[] rVarArr;
        r[] rVarArr2;
        long j10 = -9223372036854775807L;
        for (r rVar : this.f31576h) {
            long l10 = rVar.l();
            if (l10 != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (r rVar2 : this.f31576h) {
                        if (rVar2 == rVar) {
                            break;
                        } else if (rVar2.k(l10) != l10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = l10;
                } else if (l10 != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && rVar.k(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    @Override // i9.r
    public long p(ba.q[] qVarArr, boolean[] zArr, o0[] o0VarArr, boolean[] zArr2, long j10) {
        ba.q qVar;
        int[] iArr = new int[qVarArr.length];
        int[] iArr2 = new int[qVarArr.length];
        int i10 = 0;
        while (true) {
            qVar = null;
            if (i10 >= qVarArr.length) {
                break;
            }
            Integer num = o0VarArr[i10] != null ? this.f31570b.get(o0VarArr[i10]) : null;
            iArr[i10] = num == null ? -1 : num.intValue();
            iArr2[i10] = -1;
            if (qVarArr[i10] != null) {
                w0 w0Var = (w0) ea.a.e(this.f31573e.get(qVarArr[i10].k()));
                int i11 = 0;
                while (true) {
                    r[] rVarArr = this.f31569a;
                    if (i11 >= rVarArr.length) {
                        break;
                    } else if (rVarArr[i11].t().c(w0Var) != -1) {
                        iArr2[i10] = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            i10++;
        }
        this.f31570b.clear();
        int length = qVarArr.length;
        o0[] o0VarArr2 = new o0[length];
        o0[] o0VarArr3 = new o0[qVarArr.length];
        ba.q[] qVarArr2 = new ba.q[qVarArr.length];
        ArrayList arrayList = new ArrayList(this.f31569a.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f31569a.length) {
            for (int i13 = 0; i13 < qVarArr.length; i13++) {
                o0VarArr3[i13] = iArr[i13] == i12 ? o0VarArr[i13] : qVar;
                if (iArr2[i13] == i12) {
                    ba.q qVar2 = (ba.q) ea.a.e(qVarArr[i13]);
                    qVarArr2[i13] = new a(qVar2, (w0) ea.a.e(this.f31573e.get(qVar2.k())));
                } else {
                    qVarArr2[i13] = qVar;
                }
            }
            int i14 = i12;
            ArrayList arrayList2 = arrayList;
            ba.q[] qVarArr3 = qVarArr2;
            long p10 = this.f31569a[i12].p(qVarArr2, zArr, o0VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = p10;
            } else if (p10 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < qVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    o0VarArr2[i15] = o0VarArr3[i15];
                    this.f31570b.put((o0) ea.a.e(o0VarArr3[i15]), Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    ea.a.f(o0VarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList2.add(this.f31569a[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            qVarArr2 = qVarArr3;
            qVar = null;
        }
        System.arraycopy(o0VarArr2, 0, o0VarArr, 0, length);
        r[] rVarArr2 = (r[]) arrayList.toArray(new r[0]);
        this.f31576h = rVarArr2;
        this.f31577i = this.f31571c.a(rVarArr2);
        return j11;
    }

    @Override // i9.r
    public void q() throws IOException {
        for (r rVar : this.f31569a) {
            rVar.q();
        }
    }

    @Override // i9.r
    public y0 t() {
        return (y0) ea.a.e(this.f31575g);
    }

    @Override // i9.r
    public void u(long j10, boolean z10) {
        for (r rVar : this.f31576h) {
            rVar.u(j10, z10);
        }
    }
}
