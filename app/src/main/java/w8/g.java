package w8;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.gms.common.api.Api;
import com.inmobi.media.fq;
import ea.j0;
import ea.n0;
import ea.w;
import j8.j2;
import j8.p1;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p8.a0;
import p8.t;
import p8.x;
import w8.a;

/* compiled from: FragmentedMp4Extractor.java */
/* loaded from: classes2.dex */
public class g implements p8.i {
    private static final byte[] I;
    private static final p1 J;
    private int A;
    private int B;
    private int C;
    private boolean D;
    private p8.k E;
    private a0[] F;
    private a0[] G;
    private boolean H;

    /* renamed from: a */
    private final int f38362a;

    /* renamed from: b */
    private final o f38363b;

    /* renamed from: c */
    private final List<p1> f38364c;

    /* renamed from: d */
    private final SparseArray<b> f38365d;

    /* renamed from: e */
    private final ea.a0 f38366e;

    /* renamed from: f */
    private final ea.a0 f38367f;

    /* renamed from: g */
    private final ea.a0 f38368g;

    /* renamed from: h */
    private final byte[] f38369h;

    /* renamed from: i */
    private final ea.a0 f38370i;

    /* renamed from: j */
    private final j0 f38371j;

    /* renamed from: k */
    private final com.google.android.exoplayer2.metadata.emsg.a f38372k;

    /* renamed from: l */
    private final ea.a0 f38373l;

    /* renamed from: m */
    private final ArrayDeque<a.C0529a> f38374m;

    /* renamed from: n */
    private final ArrayDeque<a> f38375n;

    /* renamed from: o */
    private final a0 f38376o;

    /* renamed from: p */
    private int f38377p;

    /* renamed from: q */
    private int f38378q;

    /* renamed from: r */
    private long f38379r;

    /* renamed from: s */
    private int f38380s;

    /* renamed from: t */
    private ea.a0 f38381t;

    /* renamed from: u */
    private long f38382u;

    /* renamed from: v */
    private int f38383v;

    /* renamed from: w */
    private long f38384w;

    /* renamed from: x */
    private long f38385x;

    /* renamed from: y */
    private long f38386y;

    /* renamed from: z */
    private b f38387z;

    /* compiled from: FragmentedMp4Extractor.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final long f38388a;

        /* renamed from: b */
        public final boolean f38389b;

        /* renamed from: c */
        public final int f38390c;

        public a(long j10, boolean z10, int i10) {
            this.f38388a = j10;
            this.f38389b = z10;
            this.f38390c = i10;
        }
    }

    /* compiled from: FragmentedMp4Extractor.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        public final a0 f38391a;

        /* renamed from: d */
        public r f38394d;

        /* renamed from: e */
        public c f38395e;

        /* renamed from: f */
        public int f38396f;

        /* renamed from: g */
        public int f38397g;

        /* renamed from: h */
        public int f38398h;

        /* renamed from: i */
        public int f38399i;

        /* renamed from: l */
        private boolean f38402l;

        /* renamed from: b */
        public final q f38392b = new q();

        /* renamed from: c */
        public final ea.a0 f38393c = new ea.a0();

        /* renamed from: j */
        private final ea.a0 f38400j = new ea.a0(1);

        /* renamed from: k */
        private final ea.a0 f38401k = new ea.a0();

        public b(a0 a0Var, r rVar, c cVar) {
            this.f38391a = a0Var;
            this.f38394d = rVar;
            this.f38395e = cVar;
            j(rVar, cVar);
        }

        public int c() {
            int i10;
            if (!this.f38402l) {
                i10 = this.f38394d.f38486g[this.f38396f];
            } else {
                i10 = this.f38392b.f38472k[this.f38396f] ? 1 : 0;
            }
            return g() != null ? i10 | 1073741824 : i10;
        }

        public long d() {
            if (!this.f38402l) {
                return this.f38394d.f38482c[this.f38396f];
            }
            return this.f38392b.f38468g[this.f38398h];
        }

        public long e() {
            if (!this.f38402l) {
                return this.f38394d.f38485f[this.f38396f];
            }
            return this.f38392b.c(this.f38396f);
        }

        public int f() {
            if (!this.f38402l) {
                return this.f38394d.f38483d[this.f38396f];
            }
            return this.f38392b.f38470i[this.f38396f];
        }

        public p g() {
            if (this.f38402l) {
                int i10 = ((c) n0.j(this.f38392b.f38462a)).f38350a;
                p pVar = this.f38392b.f38475n;
                if (pVar == null) {
                    pVar = this.f38394d.f38480a.a(i10);
                }
                if (pVar == null || !pVar.f38457a) {
                    return null;
                }
                return pVar;
            }
            return null;
        }

        public boolean h() {
            this.f38396f++;
            if (this.f38402l) {
                int i10 = this.f38397g + 1;
                this.f38397g = i10;
                int[] iArr = this.f38392b.f38469h;
                int i11 = this.f38398h;
                if (i10 == iArr[i11]) {
                    this.f38398h = i11 + 1;
                    this.f38397g = 0;
                    return false;
                }
                return true;
            }
            return false;
        }

        public int i(int i10, int i11) {
            ea.a0 a0Var;
            p g10 = g();
            if (g10 == null) {
                return 0;
            }
            int i12 = g10.f38460d;
            if (i12 != 0) {
                a0Var = this.f38392b.f38476o;
            } else {
                byte[] bArr = (byte[]) n0.j(g10.f38461e);
                this.f38401k.N(bArr, bArr.length);
                ea.a0 a0Var2 = this.f38401k;
                i12 = bArr.length;
                a0Var = a0Var2;
            }
            boolean g11 = this.f38392b.g(this.f38396f);
            boolean z10 = g11 || i11 != 0;
            this.f38400j.d()[0] = (byte) ((z10 ? 128 : 0) | i12);
            this.f38400j.P(0);
            this.f38391a.f(this.f38400j, 1, 1);
            this.f38391a.f(a0Var, i12, 1);
            if (z10) {
                if (!g11) {
                    this.f38393c.L(8);
                    byte[] d10 = this.f38393c.d();
                    d10[0] = 0;
                    d10[1] = 1;
                    d10[2] = (byte) ((i11 >> 8) & 255);
                    d10[3] = (byte) (i11 & 255);
                    d10[4] = (byte) ((i10 >> 24) & 255);
                    d10[5] = (byte) ((i10 >> 16) & 255);
                    d10[6] = (byte) ((i10 >> 8) & 255);
                    d10[7] = (byte) (i10 & 255);
                    this.f38391a.f(this.f38393c, 8, 1);
                    return i12 + 1 + 8;
                }
                ea.a0 a0Var3 = this.f38392b.f38476o;
                int J = a0Var3.J();
                a0Var3.Q(-2);
                int i13 = (J * 6) + 2;
                if (i11 != 0) {
                    this.f38393c.L(i13);
                    byte[] d11 = this.f38393c.d();
                    a0Var3.j(d11, 0, i13);
                    int i14 = (((d11[2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (d11[3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED)) + i11;
                    d11[2] = (byte) ((i14 >> 8) & 255);
                    d11[3] = (byte) (i14 & 255);
                    a0Var3 = this.f38393c;
                }
                this.f38391a.f(a0Var3, i13, 1);
                return i12 + 1 + i13;
            }
            return i12 + 1;
        }

        public void j(r rVar, c cVar) {
            this.f38394d = rVar;
            this.f38395e = cVar;
            this.f38391a.d(rVar.f38480a.f38451f);
            k();
        }

        public void k() {
            this.f38392b.f();
            this.f38396f = 0;
            this.f38398h = 0;
            this.f38397g = 0;
            this.f38399i = 0;
            this.f38402l = false;
        }

        public void l(long j10) {
            int i10 = this.f38396f;
            while (true) {
                q qVar = this.f38392b;
                if (i10 >= qVar.f38467f || qVar.c(i10) >= j10) {
                    return;
                }
                if (this.f38392b.f38472k[i10]) {
                    this.f38399i = i10;
                }
                i10++;
            }
        }

        public void m() {
            p g10 = g();
            if (g10 == null) {
                return;
            }
            ea.a0 a0Var = this.f38392b.f38476o;
            int i10 = g10.f38460d;
            if (i10 != 0) {
                a0Var.Q(i10);
            }
            if (this.f38392b.g(this.f38396f)) {
                a0Var.Q(a0Var.J() * 6);
            }
        }

        public void n(DrmInitData drmInitData) {
            p a10 = this.f38394d.f38480a.a(((c) n0.j(this.f38392b.f38462a)).f38350a);
            this.f38391a.d(this.f38394d.f38480a.f38451f.b().M(drmInitData.f(a10 != null ? a10.f38458b : null)).E());
        }
    }

    static {
        f fVar = new p8.n() { // from class: w8.f
            @Override // p8.n
            public /* synthetic */ p8.i[] a(Uri uri, Map map) {
                return p8.m.a(this, uri, map);
            }

            @Override // p8.n
            public final p8.i[] b() {
                return g.b();
            }
        };
        I = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        J = new p1.b().e0("application/x-emsg").E();
    }

    public g() {
        this(0);
    }

    private static Pair<Long, p8.d> A(ea.a0 a0Var, long j10) throws j2 {
        long I2;
        long I3;
        a0Var.P(8);
        int c10 = w8.a.c(a0Var.n());
        a0Var.Q(4);
        long F = a0Var.F();
        if (c10 == 0) {
            I2 = a0Var.F();
            I3 = a0Var.F();
        } else {
            I2 = a0Var.I();
            I3 = a0Var.I();
        }
        long j11 = I2;
        long j12 = j10 + I3;
        long O0 = n0.O0(j11, 1000000L, F);
        a0Var.Q(2);
        int J2 = a0Var.J();
        int[] iArr = new int[J2];
        long[] jArr = new long[J2];
        long[] jArr2 = new long[J2];
        long[] jArr3 = new long[J2];
        long j13 = j11;
        long j14 = O0;
        int i10 = 0;
        while (i10 < J2) {
            int n10 = a0Var.n();
            if ((n10 & RecyclerView.UNDEFINED_DURATION) == 0) {
                long F2 = a0Var.F();
                iArr[i10] = n10 & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                jArr[i10] = j12;
                jArr3[i10] = j14;
                long j15 = j13 + F2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i11 = J2;
                int[] iArr2 = iArr;
                long O02 = n0.O0(j15, 1000000L, F);
                jArr4[i10] = O02 - jArr5[i10];
                a0Var.Q(4);
                j12 += iArr2[i10];
                i10++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                J2 = i11;
                j13 = j15;
                j14 = O02;
            } else {
                throw j2.a("Unhandled indirect reference", null);
            }
        }
        return Pair.create(Long.valueOf(O0), new p8.d(iArr, jArr, jArr2, jArr3));
    }

    private static long B(ea.a0 a0Var) {
        a0Var.P(8);
        return w8.a.c(a0Var.n()) == 1 ? a0Var.I() : a0Var.F();
    }

    private static b C(ea.a0 a0Var, SparseArray<b> sparseArray, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        a0Var.P(8);
        int b10 = w8.a.b(a0Var.n());
        b valueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(a0Var.n());
        if (valueAt == null) {
            return null;
        }
        if ((b10 & 1) != 0) {
            long I2 = a0Var.I();
            q qVar = valueAt.f38392b;
            qVar.f38464c = I2;
            qVar.f38465d = I2;
        }
        c cVar = valueAt.f38395e;
        if ((b10 & 2) != 0) {
            i10 = a0Var.n() - 1;
        } else {
            i10 = cVar.f38350a;
        }
        if ((b10 & 8) != 0) {
            i11 = a0Var.n();
        } else {
            i11 = cVar.f38351b;
        }
        if ((b10 & 16) != 0) {
            i12 = a0Var.n();
        } else {
            i12 = cVar.f38352c;
        }
        if ((b10 & 32) != 0) {
            i13 = a0Var.n();
        } else {
            i13 = cVar.f38353d;
        }
        valueAt.f38392b.f38462a = new c(i10, i11, i12, i13);
        return valueAt;
    }

    private static void D(a.C0529a c0529a, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws j2 {
        b C = C(((a.b) ea.a.e(c0529a.g(1952868452))).f38324b, sparseArray, z10);
        if (C == null) {
            return;
        }
        q qVar = C.f38392b;
        long j10 = qVar.f38478q;
        boolean z11 = qVar.f38479r;
        C.k();
        C.f38402l = true;
        a.b g10 = c0529a.g(1952867444);
        if (g10 != null && (i10 & 2) == 0) {
            qVar.f38478q = B(g10.f38324b);
            qVar.f38479r = true;
        } else {
            qVar.f38478q = j10;
            qVar.f38479r = z11;
        }
        G(c0529a, C, i10);
        p a10 = C.f38394d.f38480a.a(((c) ea.a.e(qVar.f38462a)).f38350a);
        a.b g11 = c0529a.g(1935763834);
        if (g11 != null) {
            w((p) ea.a.e(a10), g11.f38324b, qVar);
        }
        a.b g12 = c0529a.g(1935763823);
        if (g12 != null) {
            v(g12.f38324b, qVar);
        }
        a.b g13 = c0529a.g(1936027235);
        if (g13 != null) {
            z(g13.f38324b, qVar);
        }
        x(c0529a, a10 != null ? a10.f38458b : null, qVar);
        int size = c0529a.f38322c.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.b bVar = c0529a.f38322c.get(i11);
            if (bVar.f38320a == 1970628964) {
                H(bVar.f38324b, qVar, bArr);
            }
        }
    }

    private static Pair<Integer, c> E(ea.a0 a0Var) {
        a0Var.P(12);
        return Pair.create(Integer.valueOf(a0Var.n()), new c(a0Var.n() - 1, a0Var.n(), a0Var.n(), a0Var.n()));
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int F(w8.g.b r34, int r35, int r36, ea.a0 r37, int r38) throws j8.j2 {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.g.F(w8.g$b, int, int, ea.a0, int):int");
    }

    private static void G(a.C0529a c0529a, b bVar, int i10) throws j2 {
        List<a.b> list = c0529a.f38322c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar2 = list.get(i13);
            if (bVar2.f38320a == 1953658222) {
                ea.a0 a0Var = bVar2.f38324b;
                a0Var.P(12);
                int H = a0Var.H();
                if (H > 0) {
                    i12 += H;
                    i11++;
                }
            }
        }
        bVar.f38398h = 0;
        bVar.f38397g = 0;
        bVar.f38396f = 0;
        bVar.f38392b.e(i11, i12);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            a.b bVar3 = list.get(i16);
            if (bVar3.f38320a == 1953658222) {
                i15 = F(bVar, i14, i10, bVar3.f38324b, i15);
                i14++;
            }
        }
    }

    private static void H(ea.a0 a0Var, q qVar, byte[] bArr) throws j2 {
        a0Var.P(8);
        a0Var.j(bArr, 0, 16);
        if (Arrays.equals(bArr, I)) {
            y(a0Var, 16, qVar);
        }
    }

    private void I(long j10) throws j2 {
        while (!this.f38374m.isEmpty() && this.f38374m.peek().f38321b == j10) {
            n(this.f38374m.pop());
        }
        e();
    }

    private boolean J(p8.j jVar) throws IOException {
        if (this.f38380s == 0) {
            if (!jVar.h(this.f38373l.d(), 0, 8, true)) {
                return false;
            }
            this.f38380s = 8;
            this.f38373l.P(0);
            this.f38379r = this.f38373l.F();
            this.f38378q = this.f38373l.n();
        }
        long j10 = this.f38379r;
        if (j10 == 1) {
            jVar.readFully(this.f38373l.d(), 8, 8);
            this.f38380s += 8;
            this.f38379r = this.f38373l.I();
        } else if (j10 == 0) {
            long b10 = jVar.b();
            if (b10 == -1 && !this.f38374m.isEmpty()) {
                b10 = this.f38374m.peek().f38321b;
            }
            if (b10 != -1) {
                this.f38379r = (b10 - jVar.getPosition()) + this.f38380s;
            }
        }
        if (this.f38379r >= this.f38380s) {
            long position = jVar.getPosition() - this.f38380s;
            int i10 = this.f38378q;
            if ((i10 == 1836019558 || i10 == 1835295092) && !this.H) {
                this.E.n(new x.b(this.f38385x, position));
                this.H = true;
            }
            if (this.f38378q == 1836019558) {
                int size = this.f38365d.size();
                for (int i11 = 0; i11 < size; i11++) {
                    q qVar = this.f38365d.valueAt(i11).f38392b;
                    qVar.f38463b = position;
                    qVar.f38465d = position;
                    qVar.f38464c = position;
                }
            }
            int i12 = this.f38378q;
            if (i12 == 1835295092) {
                this.f38387z = null;
                this.f38382u = position + this.f38379r;
                this.f38377p = 2;
                return true;
            }
            if (N(i12)) {
                long position2 = (jVar.getPosition() + this.f38379r) - 8;
                this.f38374m.push(new a.C0529a(this.f38378q, position2));
                if (this.f38379r == this.f38380s) {
                    I(position2);
                } else {
                    e();
                }
            } else if (O(this.f38378q)) {
                if (this.f38380s == 8) {
                    long j11 = this.f38379r;
                    if (j11 <= 2147483647L) {
                        ea.a0 a0Var = new ea.a0((int) j11);
                        System.arraycopy(this.f38373l.d(), 0, a0Var.d(), 0, 8);
                        this.f38381t = a0Var;
                        this.f38377p = 1;
                    } else {
                        throw j2.d("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw j2.d("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.f38379r <= 2147483647L) {
                this.f38381t = null;
                this.f38377p = 1;
            } else {
                throw j2.d("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw j2.d("Atom size less than header length (unsupported).");
    }

    private void K(p8.j jVar) throws IOException {
        int i10 = ((int) this.f38379r) - this.f38380s;
        ea.a0 a0Var = this.f38381t;
        if (a0Var != null) {
            jVar.readFully(a0Var.d(), 8, i10);
            p(new a.b(this.f38378q, a0Var), jVar.getPosition());
        } else {
            jVar.m(i10);
        }
        I(jVar.getPosition());
    }

    private void L(p8.j jVar) throws IOException {
        int size = this.f38365d.size();
        long j10 = Long.MAX_VALUE;
        b bVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = this.f38365d.valueAt(i10).f38392b;
            if (qVar.f38477p) {
                long j11 = qVar.f38465d;
                if (j11 < j10) {
                    bVar = this.f38365d.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVar == null) {
            this.f38377p = 3;
            return;
        }
        int position = (int) (j10 - jVar.getPosition());
        if (position >= 0) {
            jVar.m(position);
            bVar.f38392b.b(jVar);
            return;
        }
        throw j2.a("Offset to encryption data was negative.", null);
    }

    private boolean M(p8.j jVar) throws IOException {
        int c10;
        b bVar = this.f38387z;
        Throwable th = null;
        if (bVar == null) {
            bVar = j(this.f38365d);
            if (bVar == null) {
                int position = (int) (this.f38382u - jVar.getPosition());
                if (position >= 0) {
                    jVar.m(position);
                    e();
                    return false;
                }
                throw j2.a("Offset to end of mdat was negative.", null);
            }
            int d10 = (int) (bVar.d() - jVar.getPosition());
            if (d10 < 0) {
                ea.r.h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                d10 = 0;
            }
            jVar.m(d10);
            this.f38387z = bVar;
        }
        int i10 = 4;
        int i11 = 1;
        if (this.f38377p == 3) {
            int f10 = bVar.f();
            this.A = f10;
            if (bVar.f38396f < bVar.f38399i) {
                jVar.m(f10);
                bVar.m();
                if (!bVar.h()) {
                    this.f38387z = null;
                }
                this.f38377p = 3;
                return true;
            }
            if (bVar.f38394d.f38480a.f38452g == 1) {
                this.A = f10 - 8;
                jVar.m(8);
            }
            if ("audio/ac4".equals(bVar.f38394d.f38480a.f38451f.f32709l)) {
                this.B = bVar.i(this.A, 7);
                l8.c.a(this.A, this.f38370i);
                bVar.f38391a.a(this.f38370i, 7);
                this.B += 7;
            } else {
                this.B = bVar.i(this.A, 0);
            }
            this.A += this.B;
            this.f38377p = 4;
            this.C = 0;
        }
        o oVar = bVar.f38394d.f38480a;
        a0 a0Var = bVar.f38391a;
        long e10 = bVar.e();
        j0 j0Var = this.f38371j;
        if (j0Var != null) {
            e10 = j0Var.a(e10);
        }
        long j10 = e10;
        if (oVar.f38455j == 0) {
            while (true) {
                int i12 = this.B;
                int i13 = this.A;
                if (i12 >= i13) {
                    break;
                }
                this.B += a0Var.c(jVar, i13 - i12, false);
            }
        } else {
            byte[] d11 = this.f38367f.d();
            d11[0] = 0;
            d11[1] = 0;
            d11[2] = 0;
            int i14 = oVar.f38455j;
            int i15 = i14 + 1;
            int i16 = 4 - i14;
            while (this.B < this.A) {
                int i17 = this.C;
                if (i17 == 0) {
                    jVar.readFully(d11, i16, i15);
                    this.f38367f.P(0);
                    int n10 = this.f38367f.n();
                    if (n10 >= i11) {
                        this.C = n10 - 1;
                        this.f38366e.P(0);
                        a0Var.a(this.f38366e, i10);
                        a0Var.a(this.f38367f, i11);
                        this.D = this.G.length > 0 && w.g(oVar.f38451f.f32709l, d11[i10]);
                        this.B += 5;
                        this.A += i16;
                    } else {
                        throw j2.a("Invalid NAL length", th);
                    }
                } else {
                    if (this.D) {
                        this.f38368g.L(i17);
                        jVar.readFully(this.f38368g.d(), 0, this.C);
                        a0Var.a(this.f38368g, this.C);
                        c10 = this.C;
                        int q10 = w.q(this.f38368g.d(), this.f38368g.f());
                        this.f38368g.P("video/hevc".equals(oVar.f38451f.f32709l) ? 1 : 0);
                        this.f38368g.O(q10);
                        p8.c.a(j10, this.f38368g, this.G);
                    } else {
                        c10 = a0Var.c(jVar, i17, false);
                    }
                    this.B += c10;
                    this.C -= c10;
                    th = null;
                    i10 = 4;
                    i11 = 1;
                }
            }
        }
        int c11 = bVar.c();
        p g10 = bVar.g();
        a0Var.e(j10, c11, this.A, 0, g10 != null ? g10.f38459c : null);
        s(j10);
        if (!bVar.h()) {
            this.f38387z = null;
        }
        this.f38377p = 3;
        return true;
    }

    private static boolean N(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    private static boolean O(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    public static /* synthetic */ p8.i[] b() {
        return l();
    }

    private static int d(int i10) throws j2 {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("Unexpected negative value: ");
        sb2.append(i10);
        throw j2.a(sb2.toString(), null);
    }

    private void e() {
        this.f38377p = 0;
        this.f38380s = 0;
    }

    private c f(SparseArray<c> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (c) ea.a.e(sparseArray.get(i10));
    }

    private static DrmInitData i(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = list.get(i10);
            if (bVar.f38320a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] d10 = bVar.f38324b.d();
                UUID f10 = l.f(d10);
                if (f10 == null) {
                    ea.r.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(f10, "video/mp4", d10));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private static b j(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b valueAt = sparseArray.valueAt(i10);
            if ((valueAt.f38402l || valueAt.f38396f != valueAt.f38394d.f38481b) && (!valueAt.f38402l || valueAt.f38398h != valueAt.f38392b.f38466e)) {
                long d10 = valueAt.d();
                if (d10 < j10) {
                    bVar = valueAt;
                    j10 = d10;
                }
            }
        }
        return bVar;
    }

    private void k() {
        int i10;
        a0[] a0VarArr = new a0[2];
        this.F = a0VarArr;
        a0 a0Var = this.f38376o;
        int i11 = 0;
        if (a0Var != null) {
            a0VarArr[0] = a0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f38362a & 4) != 0) {
            a0VarArr[i10] = this.E.f(100, 5);
            i10++;
            i12 = 101;
        }
        a0[] a0VarArr2 = (a0[]) n0.H0(this.F, i10);
        this.F = a0VarArr2;
        for (a0 a0Var2 : a0VarArr2) {
            a0Var2.d(J);
        }
        this.G = new a0[this.f38364c.size()];
        while (i11 < this.G.length) {
            a0 f10 = this.E.f(i12, 3);
            f10.d(this.f38364c.get(i11));
            this.G[i11] = f10;
            i11++;
            i12++;
        }
    }

    public static /* synthetic */ p8.i[] l() {
        return new p8.i[]{new g()};
    }

    private void n(a.C0529a c0529a) throws j2 {
        int i10 = c0529a.f38320a;
        if (i10 == 1836019574) {
            r(c0529a);
        } else if (i10 == 1836019558) {
            q(c0529a);
        } else if (this.f38374m.isEmpty()) {
        } else {
            this.f38374m.peek().d(c0529a);
        }
    }

    private void o(ea.a0 a0Var) {
        long O0;
        String str;
        long O02;
        String str2;
        long F;
        long j10;
        a0[] a0VarArr;
        if (this.F.length == 0) {
            return;
        }
        a0Var.P(8);
        int c10 = w8.a.c(a0Var.n());
        if (c10 == 0) {
            String str3 = (String) ea.a.e(a0Var.x());
            String str4 = (String) ea.a.e(a0Var.x());
            long F2 = a0Var.F();
            O0 = n0.O0(a0Var.F(), 1000000L, F2);
            long j11 = this.f38386y;
            long j12 = j11 != -9223372036854775807L ? j11 + O0 : -9223372036854775807L;
            str = str3;
            O02 = n0.O0(a0Var.F(), 1000L, F2);
            str2 = str4;
            F = a0Var.F();
            j10 = j12;
        } else if (c10 != 1) {
            StringBuilder sb2 = new StringBuilder(46);
            sb2.append("Skipping unsupported emsg version: ");
            sb2.append(c10);
            ea.r.h("FragmentedMp4Extractor", sb2.toString());
            return;
        } else {
            long F3 = a0Var.F();
            j10 = n0.O0(a0Var.I(), 1000000L, F3);
            long O03 = n0.O0(a0Var.F(), 1000L, F3);
            long F4 = a0Var.F();
            str = (String) ea.a.e(a0Var.x());
            O02 = O03;
            F = F4;
            str2 = (String) ea.a.e(a0Var.x());
            O0 = -9223372036854775807L;
        }
        byte[] bArr = new byte[a0Var.a()];
        a0Var.j(bArr, 0, a0Var.a());
        ea.a0 a0Var2 = new ea.a0(this.f38372k.a(new EventMessage(str, str2, O02, F, bArr)));
        int a10 = a0Var2.a();
        for (a0 a0Var3 : this.F) {
            a0Var2.P(0);
            a0Var3.a(a0Var2, a10);
        }
        if (j10 == -9223372036854775807L) {
            this.f38375n.addLast(new a(O0, true, a10));
            this.f38383v += a10;
        } else if (!this.f38375n.isEmpty()) {
            this.f38375n.addLast(new a(j10, false, a10));
            this.f38383v += a10;
        } else {
            j0 j0Var = this.f38371j;
            if (j0Var != null) {
                j10 = j0Var.a(j10);
            }
            for (a0 a0Var4 : this.F) {
                a0Var4.e(j10, 1, a10, 0, null);
            }
        }
    }

    private void p(a.b bVar, long j10) throws j2 {
        if (!this.f38374m.isEmpty()) {
            this.f38374m.peek().e(bVar);
            return;
        }
        int i10 = bVar.f38320a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                o(bVar.f38324b);
                return;
            }
            return;
        }
        Pair<Long, p8.d> A = A(bVar.f38324b, j10);
        this.f38386y = ((Long) A.first).longValue();
        this.E.n((x) A.second);
        this.H = true;
    }

    private void q(a.C0529a c0529a) throws j2 {
        u(c0529a, this.f38365d, this.f38363b != null, this.f38362a, this.f38369h);
        DrmInitData i10 = i(c0529a.f38322c);
        if (i10 != null) {
            int size = this.f38365d.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f38365d.valueAt(i11).n(i10);
            }
        }
        if (this.f38384w != -9223372036854775807L) {
            int size2 = this.f38365d.size();
            for (int i12 = 0; i12 < size2; i12++) {
                this.f38365d.valueAt(i12).l(this.f38384w);
            }
            this.f38384w = -9223372036854775807L;
        }
    }

    private void r(a.C0529a c0529a) throws j2 {
        int i10 = 0;
        ea.a.g(this.f38363b == null, "Unexpected moov box.");
        DrmInitData i11 = i(c0529a.f38322c);
        a.C0529a c0529a2 = (a.C0529a) ea.a.e(c0529a.f(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = c0529a2.f38322c.size();
        long j10 = -9223372036854775807L;
        for (int i12 = 0; i12 < size; i12++) {
            a.b bVar = c0529a2.f38322c.get(i12);
            int i13 = bVar.f38320a;
            if (i13 == 1953654136) {
                Pair<Integer, c> E = E(bVar.f38324b);
                sparseArray.put(((Integer) E.first).intValue(), (c) E.second);
            } else if (i13 == 1835362404) {
                j10 = t(bVar.f38324b);
            }
        }
        List<r> A = w8.b.A(c0529a, new t(), j10, i11, (this.f38362a & 16) != 0, false, new ib.f() { // from class: w8.e
            @Override // ib.f
            public final Object apply(Object obj) {
                return g.this.m((o) obj);
            }
        });
        int size2 = A.size();
        if (this.f38365d.size() == 0) {
            while (i10 < size2) {
                r rVar = A.get(i10);
                o oVar = rVar.f38480a;
                this.f38365d.put(oVar.f38446a, new b(this.E.f(i10, oVar.f38447b), rVar, f(sparseArray, oVar.f38446a)));
                this.f38385x = Math.max(this.f38385x, oVar.f38450e);
                i10++;
            }
            this.E.r();
            return;
        }
        ea.a.f(this.f38365d.size() == size2);
        while (i10 < size2) {
            r rVar2 = A.get(i10);
            o oVar2 = rVar2.f38480a;
            this.f38365d.get(oVar2.f38446a).j(rVar2, f(sparseArray, oVar2.f38446a));
            i10++;
        }
    }

    private void s(long j10) {
        while (!this.f38375n.isEmpty()) {
            a removeFirst = this.f38375n.removeFirst();
            this.f38383v -= removeFirst.f38390c;
            long j11 = removeFirst.f38388a;
            if (removeFirst.f38389b) {
                j11 += j10;
            }
            j0 j0Var = this.f38371j;
            if (j0Var != null) {
                j11 = j0Var.a(j11);
            }
            for (a0 a0Var : this.F) {
                a0Var.e(j11, 1, removeFirst.f38390c, this.f38383v, null);
            }
        }
    }

    private static long t(ea.a0 a0Var) {
        a0Var.P(8);
        return w8.a.c(a0Var.n()) == 0 ? a0Var.F() : a0Var.I();
    }

    private static void u(a.C0529a c0529a, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws j2 {
        int size = c0529a.f38323d.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.C0529a c0529a2 = c0529a.f38323d.get(i11);
            if (c0529a2.f38320a == 1953653094) {
                D(c0529a2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void v(ea.a0 a0Var, q qVar) throws j2 {
        a0Var.P(8);
        int n10 = a0Var.n();
        if ((w8.a.b(n10) & 1) == 1) {
            a0Var.Q(8);
        }
        int H = a0Var.H();
        if (H == 1) {
            qVar.f38465d += w8.a.c(n10) == 0 ? a0Var.F() : a0Var.I();
            return;
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Unexpected saio entry count: ");
        sb2.append(H);
        throw j2.a(sb2.toString(), null);
    }

    private static void w(p pVar, ea.a0 a0Var, q qVar) throws j2 {
        int i10;
        int i11 = pVar.f38460d;
        a0Var.P(8);
        if ((w8.a.b(a0Var.n()) & 1) == 1) {
            a0Var.Q(8);
        }
        int D = a0Var.D();
        int H = a0Var.H();
        int i12 = qVar.f38467f;
        if (H <= i12) {
            if (D == 0) {
                boolean[] zArr = qVar.f38474m;
                i10 = 0;
                for (int i13 = 0; i13 < H; i13++) {
                    int D2 = a0Var.D();
                    i10 += D2;
                    zArr[i13] = D2 > i11;
                }
            } else {
                i10 = (D * H) + 0;
                Arrays.fill(qVar.f38474m, 0, H, D > i11);
            }
            Arrays.fill(qVar.f38474m, H, qVar.f38467f, false);
            if (i10 > 0) {
                qVar.d(i10);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(78);
        sb2.append("Saiz sample count ");
        sb2.append(H);
        sb2.append(" is greater than fragment sample count");
        sb2.append(i12);
        throw j2.a(sb2.toString(), null);
    }

    private static void x(a.C0529a c0529a, String str, q qVar) throws j2 {
        byte[] bArr = null;
        ea.a0 a0Var = null;
        ea.a0 a0Var2 = null;
        for (int i10 = 0; i10 < c0529a.f38322c.size(); i10++) {
            a.b bVar = c0529a.f38322c.get(i10);
            ea.a0 a0Var3 = bVar.f38324b;
            int i11 = bVar.f38320a;
            if (i11 == 1935828848) {
                a0Var3.P(12);
                if (a0Var3.n() == 1936025959) {
                    a0Var = a0Var3;
                }
            } else if (i11 == 1936158820) {
                a0Var3.P(12);
                if (a0Var3.n() == 1936025959) {
                    a0Var2 = a0Var3;
                }
            }
        }
        if (a0Var == null || a0Var2 == null) {
            return;
        }
        a0Var.P(8);
        int c10 = w8.a.c(a0Var.n());
        a0Var.Q(4);
        if (c10 == 1) {
            a0Var.Q(4);
        }
        if (a0Var.n() == 1) {
            a0Var2.P(8);
            int c11 = w8.a.c(a0Var2.n());
            a0Var2.Q(4);
            if (c11 == 1) {
                if (a0Var2.F() == 0) {
                    throw j2.d("Variable length description in sgpd found (unsupported)");
                }
            } else if (c11 >= 2) {
                a0Var2.Q(4);
            }
            if (a0Var2.F() == 1) {
                a0Var2.Q(1);
                int D = a0Var2.D();
                int i12 = (D & 240) >> 4;
                int i13 = D & 15;
                boolean z10 = a0Var2.D() == 1;
                if (z10) {
                    int D2 = a0Var2.D();
                    byte[] bArr2 = new byte[16];
                    a0Var2.j(bArr2, 0, 16);
                    if (D2 == 0) {
                        int D3 = a0Var2.D();
                        bArr = new byte[D3];
                        a0Var2.j(bArr, 0, D3);
                    }
                    qVar.f38473l = true;
                    qVar.f38475n = new p(z10, str, D2, bArr2, i12, i13, bArr);
                    return;
                }
                return;
            }
            throw j2.d("Entry count in sgpd != 1 (unsupported).");
        }
        throw j2.d("Entry count in sbgp != 1 (unsupported).");
    }

    private static void y(ea.a0 a0Var, int i10, q qVar) throws j2 {
        a0Var.P(i10 + 8);
        int b10 = w8.a.b(a0Var.n());
        if ((b10 & 1) == 0) {
            boolean z10 = (b10 & 2) != 0;
            int H = a0Var.H();
            if (H == 0) {
                Arrays.fill(qVar.f38474m, 0, qVar.f38467f, false);
                return;
            }
            int i11 = qVar.f38467f;
            if (H == i11) {
                Arrays.fill(qVar.f38474m, 0, H, z10);
                qVar.d(a0Var.a());
                qVar.a(a0Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("Senc sample count ");
            sb2.append(H);
            sb2.append(" is different from fragment sample count");
            sb2.append(i11);
            throw j2.a(sb2.toString(), null);
        }
        throw j2.d("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static void z(ea.a0 a0Var, q qVar) throws j2 {
        y(a0Var, 0, qVar);
    }

    @Override // p8.i
    public void a(long j10, long j11) {
        int size = this.f38365d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f38365d.valueAt(i10).k();
        }
        this.f38375n.clear();
        this.f38383v = 0;
        this.f38384w = j11;
        this.f38374m.clear();
        e();
    }

    @Override // p8.i
    public void c(p8.k kVar) {
        this.E = kVar;
        e();
        k();
        o oVar = this.f38363b;
        if (oVar != null) {
            this.f38365d.put(0, new b(kVar.f(0, oVar.f38447b), new r(this.f38363b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0)));
            this.E.r();
        }
    }

    @Override // p8.i
    public int g(p8.j jVar, p8.w wVar) throws IOException {
        while (true) {
            int i10 = this.f38377p;
            if (i10 != 0) {
                if (i10 == 1) {
                    K(jVar);
                } else if (i10 != 2) {
                    if (M(jVar)) {
                        return 0;
                    }
                } else {
                    L(jVar);
                }
            } else if (!J(jVar)) {
                return -1;
            }
        }
    }

    @Override // p8.i
    public boolean h(p8.j jVar) throws IOException {
        return n.b(jVar);
    }

    public o m(o oVar) {
        return oVar;
    }

    @Override // p8.i
    public void release() {
    }

    public g(int i10) {
        this(i10, null);
    }

    public g(int i10, j0 j0Var) {
        this(i10, j0Var, null, Collections.emptyList());
    }

    public g(int i10, j0 j0Var, o oVar) {
        this(i10, j0Var, oVar, Collections.emptyList());
    }

    public g(int i10, j0 j0Var, o oVar, List<p1> list) {
        this(i10, j0Var, oVar, list, null);
    }

    public g(int i10, j0 j0Var, o oVar, List<p1> list, a0 a0Var) {
        this.f38362a = i10;
        this.f38371j = j0Var;
        this.f38363b = oVar;
        this.f38364c = Collections.unmodifiableList(list);
        this.f38376o = a0Var;
        this.f38372k = new com.google.android.exoplayer2.metadata.emsg.a();
        this.f38373l = new ea.a0(16);
        this.f38366e = new ea.a0(w.f29749a);
        this.f38367f = new ea.a0(5);
        this.f38368g = new ea.a0();
        byte[] bArr = new byte[16];
        this.f38369h = bArr;
        this.f38370i = new ea.a0(bArr);
        this.f38374m = new ArrayDeque<>();
        this.f38375n = new ArrayDeque<>();
        this.f38365d = new SparseArray<>();
        this.f38385x = -9223372036854775807L;
        this.f38384w = -9223372036854775807L;
        this.f38386y = -9223372036854775807L;
        this.E = p8.k.f35672d0;
        this.F = new a0[0];
        this.G = new a0[0];
    }
}
