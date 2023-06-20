package w8;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import ea.a0;
import ea.n0;
import j8.j2;
import j8.p1;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p8.b0;
import p8.t;
import p8.w;
import p8.x;
import p8.y;
import w8.a;

/* compiled from: Mp4Extractor.java */
/* loaded from: classes2.dex */
public final class k implements p8.i, x {

    /* renamed from: a */
    private final int f38406a;

    /* renamed from: b */
    private final a0 f38407b;

    /* renamed from: c */
    private final a0 f38408c;

    /* renamed from: d */
    private final a0 f38409d;

    /* renamed from: e */
    private final a0 f38410e;

    /* renamed from: f */
    private final ArrayDeque<a.C0529a> f38411f;

    /* renamed from: g */
    private final m f38412g;

    /* renamed from: h */
    private final List<Metadata.Entry> f38413h;

    /* renamed from: i */
    private int f38414i;

    /* renamed from: j */
    private int f38415j;

    /* renamed from: k */
    private long f38416k;

    /* renamed from: l */
    private int f38417l;

    /* renamed from: m */
    private a0 f38418m;

    /* renamed from: n */
    private int f38419n;

    /* renamed from: o */
    private int f38420o;

    /* renamed from: p */
    private int f38421p;

    /* renamed from: q */
    private int f38422q;

    /* renamed from: r */
    private p8.k f38423r;

    /* renamed from: s */
    private a[] f38424s;

    /* renamed from: t */
    private long[][] f38425t;

    /* renamed from: u */
    private int f38426u;

    /* renamed from: v */
    private long f38427v;

    /* renamed from: w */
    private int f38428w;

    /* renamed from: x */
    private MotionPhotoMetadata f38429x;

    /* compiled from: Mp4Extractor.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final o f38430a;

        /* renamed from: b */
        public final r f38431b;

        /* renamed from: c */
        public final p8.a0 f38432c;

        /* renamed from: d */
        public final b0 f38433d;

        /* renamed from: e */
        public int f38434e;

        public a(o oVar, r rVar, p8.a0 a0Var) {
            this.f38430a = oVar;
            this.f38431b = rVar;
            this.f38432c = a0Var;
            this.f38433d = "audio/true-hd".equals(oVar.f38451f.f32709l) ? new b0() : null;
        }
    }

    static {
        j jVar = new p8.n() { // from class: w8.j
            @Override // p8.n
            public /* synthetic */ p8.i[] a(Uri uri, Map map) {
                return p8.m.a(this, uri, map);
            }

            @Override // p8.n
            public final p8.i[] b() {
                return k.k();
            }
        };
    }

    public k() {
        this(0);
    }

    private boolean A(p8.j jVar, w wVar) throws IOException {
        boolean z10;
        long j10 = this.f38416k - this.f38417l;
        long position = jVar.getPosition() + j10;
        a0 a0Var = this.f38418m;
        if (a0Var != null) {
            jVar.readFully(a0Var.d(), this.f38417l, (int) j10);
            if (this.f38415j == 1718909296) {
                this.f38428w = w(a0Var);
            } else if (!this.f38411f.isEmpty()) {
                this.f38411f.peek().e(new a.b(this.f38415j, a0Var));
            }
        } else if (j10 < 262144) {
            jVar.m((int) j10);
        } else {
            wVar.f35701a = jVar.getPosition() + j10;
            z10 = true;
            u(position);
            return (z10 || this.f38414i == 2) ? false : true;
        }
        z10 = false;
        u(position);
        if (z10) {
        }
    }

    private int B(p8.j jVar, w wVar) throws IOException {
        int i10;
        w wVar2;
        long position = jVar.getPosition();
        if (this.f38419n == -1) {
            int p10 = p(position);
            this.f38419n = p10;
            if (p10 == -1) {
                return -1;
            }
        }
        a aVar = ((a[]) n0.j(this.f38424s))[this.f38419n];
        p8.a0 a0Var = aVar.f38432c;
        int i11 = aVar.f38434e;
        r rVar = aVar.f38431b;
        long j10 = rVar.f38482c[i11];
        int i12 = rVar.f38483d[i11];
        b0 b0Var = aVar.f38433d;
        long j11 = (j10 - position) + this.f38420o;
        if (j11 < 0) {
            i10 = 1;
            wVar2 = wVar;
        } else if (j11 < 262144) {
            if (aVar.f38430a.f38452g == 1) {
                j11 += 8;
                i12 -= 8;
            }
            jVar.m((int) j11);
            o oVar = aVar.f38430a;
            if (oVar.f38455j != 0) {
                byte[] d10 = this.f38408c.d();
                d10[0] = 0;
                d10[1] = 0;
                d10[2] = 0;
                int i13 = aVar.f38430a.f38455j;
                int i14 = 4 - i13;
                while (this.f38421p < i12) {
                    int i15 = this.f38422q;
                    if (i15 == 0) {
                        jVar.readFully(d10, i14, i13);
                        this.f38420o += i13;
                        this.f38408c.P(0);
                        int n10 = this.f38408c.n();
                        if (n10 >= 0) {
                            this.f38422q = n10;
                            this.f38407b.P(0);
                            a0Var.a(this.f38407b, 4);
                            this.f38421p += 4;
                            i12 += i14;
                        } else {
                            throw j2.a("Invalid NAL length", null);
                        }
                    } else {
                        int c10 = a0Var.c(jVar, i15, false);
                        this.f38420o += c10;
                        this.f38421p += c10;
                        this.f38422q -= c10;
                    }
                }
            } else {
                if ("audio/ac4".equals(oVar.f38451f.f32709l)) {
                    if (this.f38421p == 0) {
                        l8.c.a(i12, this.f38409d);
                        a0Var.a(this.f38409d, 7);
                        this.f38421p += 7;
                    }
                    i12 += 7;
                } else if (b0Var != null) {
                    b0Var.d(jVar);
                }
                while (true) {
                    int i16 = this.f38421p;
                    if (i16 >= i12) {
                        break;
                    }
                    int c11 = a0Var.c(jVar, i12 - i16, false);
                    this.f38420o += c11;
                    this.f38421p += c11;
                    this.f38422q -= c11;
                }
            }
            int i17 = i12;
            r rVar2 = aVar.f38431b;
            long j12 = rVar2.f38485f[i11];
            int i18 = rVar2.f38486g[i11];
            if (b0Var != null) {
                b0Var.c(a0Var, j12, i18, i17, 0, null);
                if (i11 + 1 == aVar.f38431b.f38481b) {
                    b0Var.a(a0Var, null);
                }
            } else {
                a0Var.e(j12, i18, i17, 0, null);
            }
            aVar.f38434e++;
            this.f38419n = -1;
            this.f38420o = 0;
            this.f38421p = 0;
            this.f38422q = 0;
            return 0;
        } else {
            wVar2 = wVar;
            i10 = 1;
        }
        wVar2.f35701a = j10;
        return i10;
    }

    private int C(p8.j jVar, w wVar) throws IOException {
        int c10 = this.f38412g.c(jVar, wVar, this.f38413h);
        if (c10 == 1 && wVar.f35701a == 0) {
            n();
        }
        return c10;
    }

    private static boolean D(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    private static boolean E(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    private void F(a aVar, long j10) {
        r rVar = aVar.f38431b;
        int a10 = rVar.a(j10);
        if (a10 == -1) {
            a10 = rVar.b(j10);
        }
        aVar.f38434e = a10;
    }

    public static /* synthetic */ o j(o oVar) {
        return q(oVar);
    }

    public static /* synthetic */ p8.i[] k() {
        return r();
    }

    private static int l(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] m(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f38431b.f38481b];
            jArr2[i10] = aVarArr[i10].f38431b.f38485f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13] && jArr2[i13] <= j11) {
                    j11 = jArr2[i13];
                    i12 = i13;
                }
            }
            int i14 = iArr[i12];
            jArr[i12][i14] = j10;
            j10 += aVarArr[i12].f38431b.f38483d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr[i12].length) {
                jArr2[i12] = aVarArr[i12].f38431b.f38485f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private void n() {
        this.f38414i = 0;
        this.f38417l = 0;
    }

    private static int o(r rVar, long j10) {
        int a10 = rVar.a(j10);
        return a10 == -1 ? rVar.b(j10) : a10;
    }

    private int p(long j10) {
        int i10 = -1;
        int i11 = -1;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < ((a[]) n0.j(this.f38424s)).length; i12++) {
            a aVar = this.f38424s[i12];
            int i13 = aVar.f38434e;
            r rVar = aVar.f38431b;
            if (i13 != rVar.f38481b) {
                long j14 = rVar.f38482c[i13];
                long j15 = ((long[][]) n0.j(this.f38425t))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j13 = j16;
                    i11 = i12;
                    j12 = j15;
                }
                if (j15 < j11) {
                    z10 = z12;
                    i10 = i12;
                    j11 = j15;
                }
            }
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    public static /* synthetic */ o q(o oVar) {
        return oVar;
    }

    public static /* synthetic */ p8.i[] r() {
        return new p8.i[]{new k()};
    }

    private static long s(r rVar, long j10, long j11) {
        int o10 = o(rVar, j10);
        return o10 == -1 ? j11 : Math.min(rVar.f38482c[o10], j11);
    }

    private void t(p8.j jVar) throws IOException {
        this.f38409d.L(8);
        jVar.p(this.f38409d.d(), 0, 8);
        b.e(this.f38409d);
        jVar.m(this.f38409d.e());
        jVar.f();
    }

    private void u(long j10) throws j2 {
        while (!this.f38411f.isEmpty() && this.f38411f.peek().f38321b == j10) {
            a.C0529a pop = this.f38411f.pop();
            if (pop.f38320a == 1836019574) {
                x(pop);
                this.f38411f.clear();
                this.f38414i = 2;
            } else if (!this.f38411f.isEmpty()) {
                this.f38411f.peek().d(pop);
            }
        }
        if (this.f38414i != 2) {
            n();
        }
    }

    private void v() {
        if (this.f38428w != 2 || (this.f38406a & 2) == 0) {
            return;
        }
        p8.k kVar = (p8.k) ea.a.e(this.f38423r);
        kVar.f(0, 4).d(new p1.b().X(this.f38429x == null ? null : new Metadata(this.f38429x)).E());
        kVar.r();
        kVar.n(new x.b(-9223372036854775807L));
    }

    private static int w(a0 a0Var) {
        a0Var.P(8);
        int l10 = l(a0Var.n());
        if (l10 != 0) {
            return l10;
        }
        a0Var.Q(4);
        while (a0Var.a() > 0) {
            int l11 = l(a0Var.n());
            if (l11 != 0) {
                return l11;
            }
        }
        return 0;
    }

    private void x(a.C0529a c0529a) throws j2 {
        Metadata metadata;
        Metadata metadata2;
        ArrayList arrayList;
        List<r> list;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = this.f38428w == 1;
        t tVar = new t();
        a.b g10 = c0529a.g(1969517665);
        if (g10 != null) {
            Pair<Metadata, Metadata> B = b.B(g10);
            Metadata metadata3 = (Metadata) B.first;
            Metadata metadata4 = (Metadata) B.second;
            if (metadata3 != null) {
                tVar.c(metadata3);
            }
            metadata = metadata4;
            metadata2 = metadata3;
        } else {
            metadata = null;
            metadata2 = null;
        }
        a.C0529a f10 = c0529a.f(1835365473);
        Metadata n10 = f10 != null ? b.n(f10) : null;
        List<r> A = b.A(c0529a, tVar, -9223372036854775807L, null, (this.f38406a & 1) != 0, z10, new ib.f() { // from class: w8.i
            @Override // ib.f
            public final Object apply(Object obj) {
                return k.j((o) obj);
            }
        });
        p8.k kVar = (p8.k) ea.a.e(this.f38423r);
        int size = A.size();
        int i13 = 0;
        int i14 = -1;
        long j10 = -9223372036854775807L;
        while (i13 < size) {
            r rVar = A.get(i13);
            if (rVar.f38481b == 0) {
                list = A;
                i10 = size;
                arrayList = arrayList2;
            } else {
                o oVar = rVar.f38480a;
                int i15 = i14;
                arrayList = arrayList2;
                long j11 = oVar.f38450e;
                if (j11 == -9223372036854775807L) {
                    j11 = rVar.f38487h;
                }
                long max = Math.max(j10, j11);
                list = A;
                i10 = size;
                a aVar = new a(oVar, rVar, kVar.f(i13, oVar.f38447b));
                if ("audio/true-hd".equals(oVar.f38451f.f32709l)) {
                    i11 = rVar.f38484e * 16;
                } else {
                    i11 = rVar.f38484e + 30;
                }
                p1.b b10 = oVar.f38451f.b();
                b10.W(i11);
                if (oVar.f38447b == 2 && j11 > 0 && (i12 = rVar.f38481b) > 1) {
                    b10.P(i12 / (((float) j11) / 1000000.0f));
                }
                h.k(oVar.f38447b, tVar, b10);
                int i16 = oVar.f38447b;
                Metadata[] metadataArr = new Metadata[2];
                metadataArr[0] = metadata;
                metadataArr[1] = this.f38413h.isEmpty() ? null : new Metadata(this.f38413h);
                h.l(i16, metadata2, n10, b10, metadataArr);
                aVar.f38432c.d(b10.E());
                if (oVar.f38447b == 2 && i15 == -1) {
                    i14 = arrayList.size();
                    arrayList.add(aVar);
                    j10 = max;
                }
                i14 = i15;
                arrayList.add(aVar);
                j10 = max;
            }
            i13++;
            arrayList2 = arrayList;
            A = list;
            size = i10;
        }
        this.f38426u = i14;
        this.f38427v = j10;
        a[] aVarArr = (a[]) arrayList2.toArray(new a[0]);
        this.f38424s = aVarArr;
        this.f38425t = m(aVarArr);
        kVar.r();
        kVar.n(this);
    }

    private void y(long j10) {
        if (this.f38415j == 1836086884) {
            int i10 = this.f38417l;
            this.f38429x = new MotionPhotoMetadata(0L, j10, -9223372036854775807L, j10 + i10, this.f38416k - i10);
        }
    }

    private boolean z(p8.j jVar) throws IOException {
        a.C0529a peek;
        if (this.f38417l == 0) {
            if (!jVar.h(this.f38410e.d(), 0, 8, true)) {
                v();
                return false;
            }
            this.f38417l = 8;
            this.f38410e.P(0);
            this.f38416k = this.f38410e.F();
            this.f38415j = this.f38410e.n();
        }
        long j10 = this.f38416k;
        if (j10 == 1) {
            jVar.readFully(this.f38410e.d(), 8, 8);
            this.f38417l += 8;
            this.f38416k = this.f38410e.I();
        } else if (j10 == 0) {
            long b10 = jVar.b();
            if (b10 == -1 && (peek = this.f38411f.peek()) != null) {
                b10 = peek.f38321b;
            }
            if (b10 != -1) {
                this.f38416k = (b10 - jVar.getPosition()) + this.f38417l;
            }
        }
        if (this.f38416k >= this.f38417l) {
            if (D(this.f38415j)) {
                long position = jVar.getPosition();
                long j11 = this.f38416k;
                int i10 = this.f38417l;
                long j12 = (position + j11) - i10;
                if (j11 != i10 && this.f38415j == 1835365473) {
                    t(jVar);
                }
                this.f38411f.push(new a.C0529a(this.f38415j, j12));
                if (this.f38416k == this.f38417l) {
                    u(j12);
                } else {
                    n();
                }
            } else if (E(this.f38415j)) {
                ea.a.f(this.f38417l == 8);
                ea.a.f(this.f38416k <= 2147483647L);
                a0 a0Var = new a0((int) this.f38416k);
                System.arraycopy(this.f38410e.d(), 0, a0Var.d(), 0, 8);
                this.f38418m = a0Var;
                this.f38414i = 1;
            } else {
                y(jVar.getPosition() - this.f38417l);
                this.f38418m = null;
                this.f38414i = 1;
            }
            return true;
        }
        throw j2.d("Atom size less than header length (unsupported).");
    }

    @Override // p8.i
    public void a(long j10, long j11) {
        this.f38411f.clear();
        this.f38417l = 0;
        this.f38419n = -1;
        this.f38420o = 0;
        this.f38421p = 0;
        this.f38422q = 0;
        if (j10 == 0) {
            if (this.f38414i != 3) {
                n();
                return;
            }
            this.f38412g.g();
            this.f38413h.clear();
            return;
        }
        a[] aVarArr = this.f38424s;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                F(aVar, j11);
                b0 b0Var = aVar.f38433d;
                if (b0Var != null) {
                    b0Var.b();
                }
            }
        }
    }

    @Override // p8.i
    public void c(p8.k kVar) {
        this.f38423r = kVar;
    }

    @Override // p8.x
    public x.a d(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        int b10;
        if (((a[]) ea.a.e(this.f38424s)).length == 0) {
            return new x.a(y.f35706c);
        }
        int i10 = this.f38426u;
        if (i10 != -1) {
            r rVar = this.f38424s[i10].f38431b;
            int o10 = o(rVar, j10);
            if (o10 == -1) {
                return new x.a(y.f35706c);
            }
            long j15 = rVar.f38485f[o10];
            j11 = rVar.f38482c[o10];
            if (j15 >= j10 || o10 >= rVar.f38481b - 1 || (b10 = rVar.b(j10)) == -1 || b10 == o10) {
                j14 = -1;
                j13 = -9223372036854775807L;
            } else {
                j13 = rVar.f38485f[b10];
                j14 = rVar.f38482c[b10];
            }
            j12 = j14;
            j10 = j15;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -1;
            j13 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            a[] aVarArr = this.f38424s;
            if (i11 >= aVarArr.length) {
                break;
            }
            if (i11 != this.f38426u) {
                r rVar2 = aVarArr[i11].f38431b;
                long s10 = s(rVar2, j10, j11);
                if (j13 != -9223372036854775807L) {
                    j12 = s(rVar2, j13, j12);
                }
                j11 = s10;
            }
            i11++;
        }
        y yVar = new y(j10, j11);
        if (j13 == -9223372036854775807L) {
            return new x.a(yVar);
        }
        return new x.a(yVar, new y(j13, j12));
    }

    @Override // p8.x
    public boolean f() {
        return true;
    }

    @Override // p8.i
    public int g(p8.j jVar, w wVar) throws IOException {
        while (true) {
            int i10 = this.f38414i;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            return C(jVar, wVar);
                        }
                        throw new IllegalStateException();
                    }
                    return B(jVar, wVar);
                } else if (A(jVar, wVar)) {
                    return 1;
                }
            } else if (!z(jVar)) {
                return -1;
            }
        }
    }

    @Override // p8.i
    public boolean h(p8.j jVar) throws IOException {
        return n.d(jVar, (this.f38406a & 2) != 0);
    }

    @Override // p8.x
    public long i() {
        return this.f38427v;
    }

    @Override // p8.i
    public void release() {
    }

    public k(int i10) {
        this.f38406a = i10;
        this.f38414i = (i10 & 4) != 0 ? 3 : 0;
        this.f38412g = new m();
        this.f38413h = new ArrayList();
        this.f38410e = new a0(16);
        this.f38411f = new ArrayDeque<>();
        this.f38407b = new a0(ea.w.f29749a);
        this.f38408c = new a0(4);
        this.f38409d = new a0();
        this.f38419n = -1;
    }
}
