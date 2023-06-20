package i9;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.drm.l;
import i9.n0;
import j8.p1;
import j8.q1;
import java.io.IOException;
import p8.a0;

/* compiled from: SampleQueue.java */
/* loaded from: classes2.dex */
public class n0 implements p8.a0 {
    private p1 A;
    private p1 B;
    private int C;
    private boolean D;
    private boolean E;
    private long F;
    private boolean G;

    /* renamed from: a */
    private final l0 f31716a;

    /* renamed from: d */
    private final com.google.android.exoplayer2.drm.l f31719d;

    /* renamed from: e */
    private final k.a f31720e;

    /* renamed from: f */
    private d f31721f;

    /* renamed from: g */
    private p1 f31722g;

    /* renamed from: h */
    private com.google.android.exoplayer2.drm.j f31723h;

    /* renamed from: p */
    private int f31731p;

    /* renamed from: q */
    private int f31732q;

    /* renamed from: r */
    private int f31733r;

    /* renamed from: s */
    private int f31734s;

    /* renamed from: w */
    private boolean f31738w;

    /* renamed from: z */
    private boolean f31741z;

    /* renamed from: b */
    private final b f31717b = new b();

    /* renamed from: i */
    private int f31724i = 1000;

    /* renamed from: j */
    private int[] f31725j = new int[1000];

    /* renamed from: k */
    private long[] f31726k = new long[1000];

    /* renamed from: n */
    private long[] f31729n = new long[1000];

    /* renamed from: m */
    private int[] f31728m = new int[1000];

    /* renamed from: l */
    private int[] f31727l = new int[1000];

    /* renamed from: o */
    private a0.a[] f31730o = new a0.a[1000];

    /* renamed from: c */
    private final u0<c> f31718c = new u0<>(new ea.g() { // from class: i9.m0
        @Override // ea.g
        public final void accept(Object obj) {
            n0.g((n0.c) obj);
        }
    });

    /* renamed from: t */
    private long f31735t = Long.MIN_VALUE;

    /* renamed from: u */
    private long f31736u = Long.MIN_VALUE;

    /* renamed from: v */
    private long f31737v = Long.MIN_VALUE;

    /* renamed from: y */
    private boolean f31740y = true;

    /* renamed from: x */
    private boolean f31739x = true;

    /* compiled from: SampleQueue.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        public int f31742a;

        /* renamed from: b */
        public long f31743b;

        /* renamed from: c */
        public a0.a f31744c;

        b() {
        }
    }

    /* compiled from: SampleQueue.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a */
        public final p1 f31745a;

        /* renamed from: b */
        public final l.b f31746b;

        private c(p1 p1Var, l.b bVar) {
            this.f31745a = p1Var;
            this.f31746b = bVar;
        }
    }

    /* compiled from: SampleQueue.java */
    /* loaded from: classes2.dex */
    public interface d {
        void a(p1 p1Var);
    }

    public n0(da.b bVar, com.google.android.exoplayer2.drm.l lVar, k.a aVar) {
        this.f31719d = lVar;
        this.f31720e = aVar;
        this.f31716a = new l0(bVar);
    }

    private long B(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int D = D(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f31729n[D]);
            if ((this.f31728m[D] & 1) != 0) {
                break;
            }
            D--;
            if (D == -1) {
                D = this.f31724i - 1;
            }
        }
        return j10;
    }

    private int D(int i10) {
        int i11 = this.f31733r + i10;
        int i12 = this.f31724i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private boolean H() {
        return this.f31734s != this.f31731p;
    }

    public static /* synthetic */ void L(c cVar) {
        cVar.f31746b.release();
    }

    private boolean M(int i10) {
        com.google.android.exoplayer2.drm.j jVar = this.f31723h;
        return jVar == null || jVar.getState() == 4 || ((this.f31728m[i10] & 1073741824) == 0 && this.f31723h.d());
    }

    private void O(p1 p1Var, q1 q1Var) {
        p1 p1Var2 = this.f31722g;
        boolean z10 = p1Var2 == null;
        DrmInitData drmInitData = z10 ? null : p1Var2.f32712o;
        this.f31722g = p1Var;
        DrmInitData drmInitData2 = p1Var.f32712o;
        com.google.android.exoplayer2.drm.l lVar = this.f31719d;
        q1Var.f32770b = lVar != null ? p1Var.c(lVar.b(p1Var)) : p1Var;
        q1Var.f32769a = this.f31723h;
        if (this.f31719d == null) {
            return;
        }
        if (z10 || !ea.n0.c(drmInitData, drmInitData2)) {
            com.google.android.exoplayer2.drm.j jVar = this.f31723h;
            com.google.android.exoplayer2.drm.j d10 = this.f31719d.d(this.f31720e, p1Var);
            this.f31723h = d10;
            q1Var.f32769a = d10;
            if (jVar != null) {
                jVar.b(this.f31720e);
            }
        }
    }

    private synchronized int P(q1 q1Var, m8.g gVar, boolean z10, boolean z11, b bVar) {
        gVar.f34291d = false;
        if (!H()) {
            if (!z11 && !this.f31738w) {
                p1 p1Var = this.B;
                if (p1Var == null || (!z10 && p1Var == this.f31722g)) {
                    return -3;
                }
                O((p1) ea.a.e(p1Var), q1Var);
                return -5;
            }
            gVar.n(4);
            return -4;
        }
        p1 p1Var2 = this.f31718c.e(C()).f31745a;
        if (!z10 && p1Var2 == this.f31722g) {
            int D = D(this.f31734s);
            if (!M(D)) {
                gVar.f34291d = true;
                return -3;
            }
            gVar.n(this.f31728m[D]);
            long j10 = this.f31729n[D];
            gVar.f34292e = j10;
            if (j10 < this.f31735t) {
                gVar.d(RecyclerView.UNDEFINED_DURATION);
            }
            bVar.f31742a = this.f31727l[D];
            bVar.f31743b = this.f31726k[D];
            bVar.f31744c = this.f31730o[D];
            return -4;
        }
        O(p1Var2, q1Var);
        return -5;
    }

    private void U() {
        com.google.android.exoplayer2.drm.j jVar = this.f31723h;
        if (jVar != null) {
            jVar.b(this.f31720e);
            this.f31723h = null;
            this.f31722g = null;
        }
    }

    private synchronized void X() {
        this.f31734s = 0;
        this.f31716a.o();
    }

    private synchronized boolean c0(p1 p1Var) {
        this.f31740y = false;
        if (ea.n0.c(p1Var, this.B)) {
            return false;
        }
        if (!this.f31718c.g() && this.f31718c.f().f31745a.equals(p1Var)) {
            this.B = this.f31718c.f().f31745a;
        } else {
            this.B = p1Var;
        }
        p1 p1Var2 = this.B;
        this.D = ea.v.a(p1Var2.f32709l, p1Var2.f32706i);
        this.E = false;
        return true;
    }

    public static /* synthetic */ void g(c cVar) {
        L(cVar);
    }

    private synchronized boolean h(long j10) {
        if (this.f31731p == 0) {
            return j10 > this.f31736u;
        } else if (A() >= j10) {
            return false;
        } else {
            t(this.f31732q + j(j10));
            return true;
        }
    }

    private synchronized void i(long j10, int i10, long j11, int i11, a0.a aVar) {
        l.b bVar;
        int i12 = this.f31731p;
        if (i12 > 0) {
            int D = D(i12 - 1);
            ea.a.a(this.f31726k[D] + ((long) this.f31727l[D]) <= j11);
        }
        this.f31738w = (536870912 & i10) != 0;
        this.f31737v = Math.max(this.f31737v, j10);
        int D2 = D(this.f31731p);
        this.f31729n[D2] = j10;
        this.f31726k[D2] = j11;
        this.f31727l[D2] = i11;
        this.f31728m[D2] = i10;
        this.f31730o[D2] = aVar;
        this.f31725j[D2] = this.C;
        if (this.f31718c.g() || !this.f31718c.f().f31745a.equals(this.B)) {
            com.google.android.exoplayer2.drm.l lVar = this.f31719d;
            if (lVar != null) {
                bVar = lVar.e(this.f31720e, this.B);
            } else {
                bVar = l.b.f21118a;
            }
            this.f31718c.a(G(), new c((p1) ea.a.e(this.B), bVar));
        }
        int i13 = this.f31731p + 1;
        this.f31731p = i13;
        int i14 = this.f31724i;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            int[] iArr = new int[i15];
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            a0.a[] aVarArr = new a0.a[i15];
            int i16 = this.f31733r;
            int i17 = i14 - i16;
            System.arraycopy(this.f31726k, i16, jArr, 0, i17);
            System.arraycopy(this.f31729n, this.f31733r, jArr2, 0, i17);
            System.arraycopy(this.f31728m, this.f31733r, iArr2, 0, i17);
            System.arraycopy(this.f31727l, this.f31733r, iArr3, 0, i17);
            System.arraycopy(this.f31730o, this.f31733r, aVarArr, 0, i17);
            System.arraycopy(this.f31725j, this.f31733r, iArr, 0, i17);
            int i18 = this.f31733r;
            System.arraycopy(this.f31726k, 0, jArr, i17, i18);
            System.arraycopy(this.f31729n, 0, jArr2, i17, i18);
            System.arraycopy(this.f31728m, 0, iArr2, i17, i18);
            System.arraycopy(this.f31727l, 0, iArr3, i17, i18);
            System.arraycopy(this.f31730o, 0, aVarArr, i17, i18);
            System.arraycopy(this.f31725j, 0, iArr, i17, i18);
            this.f31726k = jArr;
            this.f31729n = jArr2;
            this.f31728m = iArr2;
            this.f31727l = iArr3;
            this.f31730o = aVarArr;
            this.f31725j = iArr;
            this.f31733r = 0;
            this.f31724i = i15;
        }
    }

    private int j(long j10) {
        int i10 = this.f31731p;
        int D = D(i10 - 1);
        while (i10 > this.f31734s && this.f31729n[D] >= j10) {
            i10--;
            D--;
            if (D == -1) {
                D = this.f31724i - 1;
            }
        }
        return i10;
    }

    public static n0 k(da.b bVar, com.google.android.exoplayer2.drm.l lVar, k.a aVar) {
        return new n0(bVar, (com.google.android.exoplayer2.drm.l) ea.a.e(lVar), (k.a) ea.a.e(aVar));
    }

    public static n0 l(da.b bVar) {
        return new n0(bVar, null, null);
    }

    private synchronized long m(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.f31731p;
        if (i11 != 0) {
            long[] jArr = this.f31729n;
            int i12 = this.f31733r;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.f31734s) != i11) {
                    i11 = i10 + 1;
                }
                int v10 = v(i12, i11, j10, z10);
                if (v10 == -1) {
                    return -1L;
                }
                return p(v10);
            }
        }
        return -1L;
    }

    private synchronized long n() {
        int i10 = this.f31731p;
        if (i10 == 0) {
            return -1L;
        }
        return p(i10);
    }

    private long p(int i10) {
        int i11;
        this.f31736u = Math.max(this.f31736u, B(i10));
        this.f31731p -= i10;
        int i12 = this.f31732q + i10;
        this.f31732q = i12;
        int i13 = this.f31733r + i10;
        this.f31733r = i13;
        int i14 = this.f31724i;
        if (i13 >= i14) {
            this.f31733r = i13 - i14;
        }
        int i15 = this.f31734s - i10;
        this.f31734s = i15;
        if (i15 < 0) {
            this.f31734s = 0;
        }
        this.f31718c.d(i12);
        if (this.f31731p == 0) {
            int i16 = this.f31733r;
            if (i16 == 0) {
                i16 = this.f31724i;
            }
            return this.f31726k[i16 - 1] + this.f31727l[i11];
        }
        return this.f31726k[this.f31733r];
    }

    private long t(int i10) {
        int G = G() - i10;
        boolean z10 = false;
        ea.a.a(G >= 0 && G <= this.f31731p - this.f31734s);
        int i11 = this.f31731p - G;
        this.f31731p = i11;
        this.f31737v = Math.max(this.f31736u, B(i11));
        if (G == 0 && this.f31738w) {
            z10 = true;
        }
        this.f31738w = z10;
        this.f31718c.c(i10);
        int i12 = this.f31731p;
        if (i12 != 0) {
            int D = D(i12 - 1);
            return this.f31726k[D] + this.f31727l[D];
        }
        return 0L;
    }

    private int v(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long[] jArr = this.f31729n;
            if (jArr[i10] > j10) {
                return i12;
            }
            if (!z10 || (this.f31728m[i10] & 1) != 0) {
                if (jArr[i10] == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f31724i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final synchronized long A() {
        return Math.max(this.f31736u, B(this.f31734s));
    }

    public final int C() {
        return this.f31732q + this.f31734s;
    }

    public final synchronized int E(long j10, boolean z10) {
        int D = D(this.f31734s);
        if (H() && j10 >= this.f31729n[D]) {
            if (j10 > this.f31737v && z10) {
                return this.f31731p - this.f31734s;
            }
            int v10 = v(D, this.f31731p - this.f31734s, j10, true);
            if (v10 == -1) {
                return 0;
            }
            return v10;
        }
        return 0;
    }

    public final synchronized p1 F() {
        return this.f31740y ? null : this.B;
    }

    public final int G() {
        return this.f31732q + this.f31731p;
    }

    public final void I() {
        this.f31741z = true;
    }

    public final synchronized boolean J() {
        return this.f31738w;
    }

    public synchronized boolean K(boolean z10) {
        p1 p1Var;
        boolean z11 = true;
        if (!H()) {
            if (!z10 && !this.f31738w && ((p1Var = this.B) == null || p1Var == this.f31722g)) {
                z11 = false;
            }
            return z11;
        } else if (this.f31718c.e(C()).f31745a != this.f31722g) {
            return true;
        } else {
            return M(D(this.f31734s));
        }
    }

    public void N() throws IOException {
        com.google.android.exoplayer2.drm.j jVar = this.f31723h;
        if (jVar != null && jVar.getState() == 1) {
            throw ((j.a) ea.a.e(this.f31723h.getError()));
        }
    }

    public final synchronized int Q() {
        return H() ? this.f31725j[D(this.f31734s)] : this.C;
    }

    public void R() {
        r();
        U();
    }

    public int S(q1 q1Var, m8.g gVar, int i10, boolean z10) {
        int P = P(q1Var, gVar, (i10 & 2) != 0, z10, this.f31717b);
        if (P == -4 && !gVar.l()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f31716a.f(gVar, this.f31717b);
                } else {
                    this.f31716a.m(gVar, this.f31717b);
                }
            }
            if (!z11) {
                this.f31734s++;
            }
        }
        return P;
    }

    public void T() {
        W(true);
        U();
    }

    public final void V() {
        W(false);
    }

    public void W(boolean z10) {
        this.f31716a.n();
        this.f31731p = 0;
        this.f31732q = 0;
        this.f31733r = 0;
        this.f31734s = 0;
        this.f31739x = true;
        this.f31735t = Long.MIN_VALUE;
        this.f31736u = Long.MIN_VALUE;
        this.f31737v = Long.MIN_VALUE;
        this.f31738w = false;
        this.f31718c.b();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f31740y = true;
        }
    }

    public final synchronized boolean Y(int i10) {
        X();
        int i11 = this.f31732q;
        if (i10 >= i11 && i10 <= this.f31731p + i11) {
            this.f31735t = Long.MIN_VALUE;
            this.f31734s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean Z(long j10, boolean z10) {
        X();
        int D = D(this.f31734s);
        if (H() && j10 >= this.f31729n[D] && (j10 <= this.f31737v || z10)) {
            int v10 = v(D, this.f31731p - this.f31734s, j10, true);
            if (v10 == -1) {
                return false;
            }
            this.f31735t = j10;
            this.f31734s += v10;
            return true;
        }
        return false;
    }

    @Override // p8.a0
    public /* synthetic */ void a(ea.a0 a0Var, int i10) {
        p8.z.b(this, a0Var, i10);
    }

    public final void a0(long j10) {
        if (this.F != j10) {
            this.F = j10;
            I();
        }
    }

    @Override // p8.a0
    public final int b(da.i iVar, int i10, boolean z10, int i11) throws IOException {
        return this.f31716a.p(iVar, i10, z10);
    }

    public final void b0(long j10) {
        this.f31735t = j10;
    }

    @Override // p8.a0
    public /* synthetic */ int c(da.i iVar, int i10, boolean z10) {
        return p8.z.a(this, iVar, i10, z10);
    }

    @Override // p8.a0
    public final void d(p1 p1Var) {
        p1 w10 = w(p1Var);
        this.f31741z = false;
        this.A = p1Var;
        boolean c02 = c0(w10);
        d dVar = this.f31721f;
        if (dVar == null || !c02) {
            return;
        }
        dVar.a(w10);
    }

    public final void d0(d dVar) {
        this.f31721f = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0063  */
    @Override // p8.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(long r12, int r14, int r15, int r16, p8.a0.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f31741z
            if (r0 == 0) goto L10
            j8.p1 r0 = r8.A
            java.lang.Object r0 = ea.a.h(r0)
            j8.p1 r0 = (j8.p1) r0
            r11.d(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            boolean r4 = r8.f31739x
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f31739x = r1
        L22:
            long r4 = r8.F
            long r4 = r4 + r12
            boolean r6 = r8.D
            if (r6 == 0) goto L5e
            long r6 = r8.f31735t
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L5e
            boolean r0 = r8.E
            if (r0 != 0) goto L5a
            j8.p1 r0 = r8.B
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r6 = r0.length()
            int r6 = r6 + 50
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r7.append(r6)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            java.lang.String r6 = "SampleQueue"
            ea.r.h(r6, r0)
            r8.E = r2
        L5a:
            r0 = r14 | 1
            r6 = r0
            goto L5f
        L5e:
            r6 = r14
        L5f:
            boolean r0 = r8.G
            if (r0 == 0) goto L70
            if (r3 == 0) goto L6f
            boolean r0 = r11.h(r4)
            if (r0 != 0) goto L6c
            goto L6f
        L6c:
            r8.G = r1
            goto L70
        L6f:
            return
        L70:
            i9.l0 r0 = r8.f31716a
            long r0 = r0.e()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.i(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.n0.e(long, int, int, int, p8.a0$a):void");
    }

    public final synchronized void e0(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f31734s + i10 <= this.f31731p) {
                    z10 = true;
                    ea.a.a(z10);
                    this.f31734s += i10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z10 = false;
        ea.a.a(z10);
        this.f31734s += i10;
    }

    @Override // p8.a0
    public final void f(ea.a0 a0Var, int i10, int i11) {
        this.f31716a.q(a0Var, i10);
    }

    public final void f0(int i10) {
        this.C = i10;
    }

    public final void g0() {
        this.G = true;
    }

    public synchronized long o() {
        int i10 = this.f31734s;
        if (i10 == 0) {
            return -1L;
        }
        return p(i10);
    }

    public final void q(long j10, boolean z10, boolean z11) {
        this.f31716a.b(m(j10, z10, z11));
    }

    public final void r() {
        this.f31716a.b(n());
    }

    public final void s() {
        this.f31716a.b(o());
    }

    public final void u(int i10) {
        this.f31716a.c(t(i10));
    }

    public p1 w(p1 p1Var) {
        return (this.F == 0 || p1Var.f32713p == Long.MAX_VALUE) ? p1Var : p1Var.b().i0(p1Var.f32713p + this.F).E();
    }

    public final int x() {
        return this.f31732q;
    }

    public final synchronized long y() {
        return this.f31731p == 0 ? Long.MIN_VALUE : this.f31729n[this.f31733r];
    }

    public final synchronized long z() {
        return this.f31737v;
    }
}
