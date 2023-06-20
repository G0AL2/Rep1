package v8;

import android.net.Uri;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.a;
import ea.a0;
import ea.n0;
import j8.p1;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import l8.e0;
import p8.j;
import p8.k;
import p8.m;
import p8.n;
import p8.t;
import p8.u;
import p8.w;
import v8.g;

/* compiled from: Mp3Extractor.java */
/* loaded from: classes2.dex */
public final class f implements p8.i {

    /* renamed from: u */
    private static final a.InterfaceC0288a f37980u;

    /* renamed from: a */
    private final int f37981a;

    /* renamed from: b */
    private final long f37982b;

    /* renamed from: c */
    private final a0 f37983c;

    /* renamed from: d */
    private final e0.a f37984d;

    /* renamed from: e */
    private final t f37985e;

    /* renamed from: f */
    private final u f37986f;

    /* renamed from: g */
    private final p8.a0 f37987g;

    /* renamed from: h */
    private k f37988h;

    /* renamed from: i */
    private p8.a0 f37989i;

    /* renamed from: j */
    private p8.a0 f37990j;

    /* renamed from: k */
    private int f37991k;

    /* renamed from: l */
    private Metadata f37992l;

    /* renamed from: m */
    private long f37993m;

    /* renamed from: n */
    private long f37994n;

    /* renamed from: o */
    private long f37995o;

    /* renamed from: p */
    private int f37996p;

    /* renamed from: q */
    private g f37997q;

    /* renamed from: r */
    private boolean f37998r;

    /* renamed from: s */
    private boolean f37999s;

    /* renamed from: t */
    private long f38000t;

    static {
        e eVar = new n() { // from class: v8.e
            @Override // p8.n
            public /* synthetic */ p8.i[] a(Uri uri, Map map) {
                return m.a(this, uri, map);
            }

            @Override // p8.n
            public final p8.i[] b() {
                return f.b();
            }
        };
        f37980u = new a.InterfaceC0288a() { // from class: v8.d
            @Override // com.google.android.exoplayer2.metadata.id3.a.InterfaceC0288a
            public final boolean a(int i10, int i11, int i12, int i13, int i14) {
                return f.d(i10, i11, i12, i13, i14);
            }
        };
    }

    public f() {
        this(0);
    }

    public static /* synthetic */ p8.i[] b() {
        return o();
    }

    public static /* synthetic */ boolean d(int i10, int i11, int i12, int i13, int i14) {
        return p(i10, i11, i12, i13, i14);
    }

    private void e() {
        ea.a.h(this.f37989i);
        n0.j(this.f37988h);
    }

    private g f(j jVar) throws IOException {
        long l10;
        long j10;
        long i10;
        long e10;
        g r10 = r(jVar);
        c q10 = q(this.f37992l, jVar.getPosition());
        if (this.f37998r) {
            return new g.a();
        }
        if ((this.f37981a & 4) != 0) {
            if (q10 != null) {
                i10 = q10.i();
                e10 = q10.e();
            } else if (r10 != null) {
                i10 = r10.i();
                e10 = r10.e();
            } else {
                l10 = l(this.f37992l);
                j10 = -1;
                r10 = new b(l10, jVar.getPosition(), j10);
            }
            j10 = e10;
            l10 = i10;
            r10 = new b(l10, jVar.getPosition(), j10);
        } else if (q10 != null) {
            r10 = q10;
        } else if (r10 == null) {
            r10 = null;
        }
        if (r10 == null || !(r10.f() || (this.f37981a & 1) == 0)) {
            return k(jVar, (this.f37981a & 2) != 0);
        }
        return r10;
    }

    private long i(long j10) {
        return this.f37993m + ((j10 * 1000000) / this.f37984d.f33807d);
    }

    private g k(j jVar, boolean z10) throws IOException {
        jVar.p(this.f37983c.d(), 0, 4);
        this.f37983c.P(0);
        this.f37984d.a(this.f37983c.n());
        return new a(jVar.b(), jVar.getPosition(), this.f37984d, z10);
    }

    private static long l(Metadata metadata) {
        if (metadata != null) {
            int g10 = metadata.g();
            for (int i10 = 0; i10 < g10; i10++) {
                Metadata.Entry f10 = metadata.f(i10);
                if (f10 instanceof TextInformationFrame) {
                    TextInformationFrame textInformationFrame = (TextInformationFrame) f10;
                    if (textInformationFrame.f21198a.equals("TLEN")) {
                        return n0.C0(Long.parseLong(textInformationFrame.f21210c));
                    }
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private static int m(a0 a0Var, int i10) {
        if (a0Var.f() >= i10 + 4) {
            a0Var.P(i10);
            int n10 = a0Var.n();
            if (n10 == 1483304551 || n10 == 1231971951) {
                return n10;
            }
        }
        if (a0Var.f() >= 40) {
            a0Var.P(36);
            return a0Var.n() == 1447187017 ? 1447187017 : 0;
        }
        return 0;
    }

    private static boolean n(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    public static /* synthetic */ p8.i[] o() {
        return new p8.i[]{new f()};
    }

    public static /* synthetic */ boolean p(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    private static c q(Metadata metadata, long j10) {
        if (metadata != null) {
            int g10 = metadata.g();
            for (int i10 = 0; i10 < g10; i10++) {
                Metadata.Entry f10 = metadata.f(i10);
                if (f10 instanceof MlltFrame) {
                    return c.a(j10, (MlltFrame) f10, l(metadata));
                }
            }
            return null;
        }
        return null;
    }

    private g r(j jVar) throws IOException {
        int i10;
        a0 a0Var = new a0(this.f37984d.f33806c);
        jVar.p(a0Var.d(), 0, this.f37984d.f33806c);
        e0.a aVar = this.f37984d;
        if ((aVar.f33804a & 1) != 0) {
            if (aVar.f33808e != 1) {
                i10 = 36;
            }
            i10 = 21;
        } else {
            if (aVar.f33808e == 1) {
                i10 = 13;
            }
            i10 = 21;
        }
        int m10 = m(a0Var, i10);
        if (m10 != 1483304551 && m10 != 1231971951) {
            if (m10 == 1447187017) {
                h a10 = h.a(jVar.b(), jVar.getPosition(), this.f37984d, a0Var);
                jVar.m(this.f37984d.f33806c);
                return a10;
            }
            jVar.f();
            return null;
        }
        i a11 = i.a(jVar.b(), jVar.getPosition(), this.f37984d, a0Var);
        if (a11 != null && !this.f37985e.a()) {
            jVar.f();
            jVar.j(i10 + 141);
            jVar.p(this.f37983c.d(), 0, 3);
            this.f37983c.P(0);
            this.f37985e.d(this.f37983c.G());
        }
        jVar.m(this.f37984d.f33806c);
        return (a11 == null || a11.f() || m10 != 1231971951) ? a11 : k(jVar, false);
    }

    private boolean s(j jVar) throws IOException {
        g gVar = this.f37997q;
        if (gVar != null) {
            long e10 = gVar.e();
            if (e10 != -1 && jVar.i() > e10 - 4) {
                return true;
            }
        }
        try {
            return !jVar.d(this.f37983c.d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int t(j jVar) throws IOException {
        if (this.f37991k == 0) {
            try {
                v(jVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f37997q == null) {
            g f10 = f(jVar);
            this.f37997q = f10;
            this.f37988h.n(f10);
            this.f37990j.d(new p1.b().e0(this.f37984d.f33805b).W(4096).H(this.f37984d.f33808e).f0(this.f37984d.f33807d).N(this.f37985e.f35694a).O(this.f37985e.f35695b).X((this.f37981a & 8) != 0 ? null : this.f37992l).E());
            this.f37995o = jVar.getPosition();
        } else if (this.f37995o != 0) {
            long position = jVar.getPosition();
            long j10 = this.f37995o;
            if (position < j10) {
                jVar.m((int) (j10 - position));
            }
        }
        return u(jVar);
    }

    private int u(j jVar) throws IOException {
        e0.a aVar;
        if (this.f37996p == 0) {
            jVar.f();
            if (s(jVar)) {
                return -1;
            }
            this.f37983c.P(0);
            int n10 = this.f37983c.n();
            if (n(n10, this.f37991k) && e0.j(n10) != -1) {
                this.f37984d.a(n10);
                if (this.f37993m == -9223372036854775807L) {
                    this.f37993m = this.f37997q.b(jVar.getPosition());
                    if (this.f37982b != -9223372036854775807L) {
                        this.f37993m += this.f37982b - this.f37997q.b(0L);
                    }
                }
                this.f37996p = this.f37984d.f33806c;
                g gVar = this.f37997q;
                if (gVar instanceof b) {
                    b bVar = (b) gVar;
                    bVar.c(i(this.f37994n + aVar.f33810g), jVar.getPosition() + this.f37984d.f33806c);
                    if (this.f37999s && bVar.a(this.f38000t)) {
                        this.f37999s = false;
                        this.f37990j = this.f37989i;
                    }
                }
            } else {
                jVar.m(1);
                this.f37991k = 0;
                return 0;
            }
        }
        int c10 = this.f37990j.c(jVar, this.f37996p, true);
        if (c10 == -1) {
            return -1;
        }
        int i10 = this.f37996p - c10;
        this.f37996p = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f37990j.e(i(this.f37994n), 1, this.f37984d.f33806c, 0, null);
        this.f37994n += this.f37984d.f33810g;
        this.f37996p = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x009e, code lost:
        if (r13 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00a0, code lost:
        r12.m(r2 + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00a5, code lost:
        r12.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00a8, code lost:
        r11.f37991k = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00aa, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean v(p8.j r12, boolean r13) throws java.io.IOException {
        /*
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.f()
            long r1 = r12.getPosition()
            r3 = 0
            r5 = 0
            r6 = 1
            r7 = 0
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 != 0) goto L42
            int r1 = r11.f37981a
            r1 = r1 & 8
            if (r1 != 0) goto L20
            r1 = 1
            goto L21
        L20:
            r1 = 0
        L21:
            if (r1 == 0) goto L25
            r1 = r5
            goto L27
        L25:
            com.google.android.exoplayer2.metadata.id3.a$a r1 = v8.f.f37980u
        L27:
            p8.u r2 = r11.f37986f
            com.google.android.exoplayer2.metadata.Metadata r1 = r2.a(r12, r1)
            r11.f37992l = r1
            if (r1 == 0) goto L36
            p8.t r2 = r11.f37985e
            r2.c(r1)
        L36:
            long r1 = r12.i()
            int r2 = (int) r1
            if (r13 != 0) goto L40
            r12.m(r2)
        L40:
            r1 = 0
            goto L44
        L42:
            r1 = 0
            r2 = 0
        L44:
            r3 = 0
            r4 = 0
        L46:
            boolean r8 = r11.s(r12)
            if (r8 == 0) goto L55
            if (r3 <= 0) goto L4f
            goto L9e
        L4f:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L55:
            ea.a0 r8 = r11.f37983c
            r8.P(r7)
            ea.a0 r8 = r11.f37983c
            int r8 = r8.n()
            if (r1 == 0) goto L69
            long r9 = (long) r1
            boolean r9 = n(r8, r9)
            if (r9 == 0) goto L70
        L69:
            int r9 = l8.e0.j(r8)
            r10 = -1
            if (r9 != r10) goto L90
        L70:
            int r1 = r4 + 1
            if (r4 != r0) goto L7e
            if (r13 == 0) goto L77
            return r7
        L77:
            java.lang.String r12 = "Searched too many bytes."
            j8.j2 r12 = j8.j2.a(r12, r5)
            throw r12
        L7e:
            if (r13 == 0) goto L89
            r12.f()
            int r3 = r2 + r1
            r12.j(r3)
            goto L8c
        L89:
            r12.m(r6)
        L8c:
            r4 = r1
            r1 = 0
            r3 = 0
            goto L46
        L90:
            int r3 = r3 + 1
            if (r3 != r6) goto L9b
            l8.e0$a r1 = r11.f37984d
            r1.a(r8)
            r1 = r8
            goto Lab
        L9b:
            r8 = 4
            if (r3 != r8) goto Lab
        L9e:
            if (r13 == 0) goto La5
            int r2 = r2 + r4
            r12.m(r2)
            goto La8
        La5:
            r12.f()
        La8:
            r11.f37991k = r1
            return r6
        Lab:
            int r9 = r9 + (-4)
            r12.j(r9)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.f.v(p8.j, boolean):boolean");
    }

    @Override // p8.i
    public void a(long j10, long j11) {
        this.f37991k = 0;
        this.f37993m = -9223372036854775807L;
        this.f37994n = 0L;
        this.f37996p = 0;
        this.f38000t = j11;
        g gVar = this.f37997q;
        if (!(gVar instanceof b) || ((b) gVar).a(j11)) {
            return;
        }
        this.f37999s = true;
        this.f37990j = this.f37987g;
    }

    @Override // p8.i
    public void c(k kVar) {
        this.f37988h = kVar;
        p8.a0 f10 = kVar.f(0, 1);
        this.f37989i = f10;
        this.f37990j = f10;
        this.f37988h.r();
    }

    @Override // p8.i
    public int g(j jVar, w wVar) throws IOException {
        e();
        int t10 = t(jVar);
        if (t10 == -1 && (this.f37997q instanceof b)) {
            long i10 = i(this.f37994n);
            if (this.f37997q.i() != i10) {
                ((b) this.f37997q).g(i10);
                this.f37988h.n(this.f37997q);
            }
        }
        return t10;
    }

    @Override // p8.i
    public boolean h(j jVar) throws IOException {
        return v(jVar, true);
    }

    public void j() {
        this.f37998r = true;
    }

    @Override // p8.i
    public void release() {
    }

    public f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public f(int i10, long j10) {
        this.f37981a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f37982b = j10;
        this.f37983c = new a0(10);
        this.f37984d = new e0.a();
        this.f37985e = new t();
        this.f37993m = -9223372036854775807L;
        this.f37986f = new u();
        p8.h hVar = new p8.h();
        this.f37987g = hVar;
        this.f37990j = hVar;
    }
}
