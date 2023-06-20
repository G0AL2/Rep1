package j8;

import android.os.Handler;
import i9.u;
import j8.j3;
import jb.s;

/* compiled from: MediaPeriodQueue.java */
/* loaded from: classes2.dex */
public final class f2 {

    /* renamed from: a */
    private final j3.b f32400a = new j3.b();

    /* renamed from: b */
    private final j3.c f32401b = new j3.c();

    /* renamed from: c */
    private final k8.a f32402c;

    /* renamed from: d */
    private final Handler f32403d;

    /* renamed from: e */
    private long f32404e;

    /* renamed from: f */
    private int f32405f;

    /* renamed from: g */
    private boolean f32406g;

    /* renamed from: h */
    private c2 f32407h;

    /* renamed from: i */
    private c2 f32408i;

    /* renamed from: j */
    private c2 f32409j;

    /* renamed from: k */
    private int f32410k;

    /* renamed from: l */
    private Object f32411l;

    /* renamed from: m */
    private long f32412m;

    public f2(k8.a aVar, Handler handler) {
        this.f32402c = aVar;
        this.f32403d = handler;
    }

    private static u.b A(j3 j3Var, Object obj, long j10, long j11, j3.c cVar, j3.b bVar) {
        j3Var.h(obj, bVar);
        j3Var.n(bVar.f32510c, cVar);
        int b10 = j3Var.b(obj);
        Object obj2 = obj;
        while (bVar.f32511d == 0 && bVar.e() > 0 && bVar.s(bVar.q()) && bVar.g(0L) == -1) {
            int i10 = b10 + 1;
            if (b10 >= cVar.f32534p) {
                break;
            }
            j3Var.g(i10, bVar, true);
            obj2 = ea.a.e(bVar.f32509b);
            b10 = i10;
        }
        j3Var.h(obj2, bVar);
        int g10 = bVar.g(j10);
        if (g10 == -1) {
            return new u.b(obj2, j11, bVar.f(j10));
        }
        return new u.b(obj2, g10, bVar.m(g10), j11);
    }

    private long C(j3 j3Var, Object obj) {
        int b10;
        int i10 = j3Var.h(obj, this.f32400a).f32510c;
        Object obj2 = this.f32411l;
        if (obj2 != null && (b10 = j3Var.b(obj2)) != -1 && j3Var.f(b10, this.f32400a).f32510c == i10) {
            return this.f32412m;
        }
        for (c2 c2Var = this.f32407h; c2Var != null; c2Var = c2Var.j()) {
            if (c2Var.f32337b.equals(obj)) {
                return c2Var.f32341f.f32367a.f31796d;
            }
        }
        for (c2 c2Var2 = this.f32407h; c2Var2 != null; c2Var2 = c2Var2.j()) {
            int b11 = j3Var.b(c2Var2.f32337b);
            if (b11 != -1 && j3Var.f(b11, this.f32400a).f32510c == i10) {
                return c2Var2.f32341f.f32367a.f31796d;
            }
        }
        long j10 = this.f32404e;
        this.f32404e = 1 + j10;
        if (this.f32407h == null) {
            this.f32411l = obj;
            this.f32412m = j10;
        }
        return j10;
    }

    private boolean E(j3 j3Var) {
        c2 c2Var = this.f32407h;
        if (c2Var == null) {
            return true;
        }
        int b10 = j3Var.b(c2Var.f32337b);
        while (true) {
            b10 = j3Var.d(b10, this.f32400a, this.f32401b, this.f32405f, this.f32406g);
            while (c2Var.j() != null && !c2Var.f32341f.f32373g) {
                c2Var = c2Var.j();
            }
            c2 j10 = c2Var.j();
            if (b10 == -1 || j10 == null || j3Var.b(j10.f32337b) != b10) {
                break;
            }
            c2Var = j10;
        }
        boolean z10 = z(c2Var);
        c2Var.f32341f = r(j3Var, c2Var.f32341f);
        return !z10;
    }

    public static /* synthetic */ void a(f2 f2Var, s.a aVar, u.b bVar) {
        f2Var.w(aVar, bVar);
    }

    private boolean d(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    private boolean e(d2 d2Var, d2 d2Var2) {
        return d2Var.f32368b == d2Var2.f32368b && d2Var.f32367a.equals(d2Var2.f32367a);
    }

    private d2 h(n2 n2Var) {
        return k(n2Var.f32635a, n2Var.f32636b, n2Var.f32637c, n2Var.f32653s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x00cc, code lost:
        if (r0.s(r0.q()) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private j8.d2 i(j8.j3 r20, j8.c2 r21, long r22) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.f2.i(j8.j3, j8.c2, long):j8.d2");
    }

    private d2 k(j3 j3Var, u.b bVar, long j10, long j11) {
        j3Var.h(bVar.f31793a, this.f32400a);
        if (bVar.b()) {
            return l(j3Var, bVar.f31793a, bVar.f31794b, bVar.f31795c, j10, bVar.f31796d);
        }
        return m(j3Var, bVar.f31793a, j11, j10, bVar.f31796d);
    }

    private d2 l(j3 j3Var, Object obj, int i10, int i11, long j10, long j11) {
        u.b bVar = new u.b(obj, i10, i11, j11);
        long d10 = j3Var.h(bVar.f31793a, this.f32400a).d(bVar.f31794b, bVar.f31795c);
        long i12 = i11 == this.f32400a.m(i10) ? this.f32400a.i() : 0L;
        return new d2(bVar, (d10 == -9223372036854775807L || i12 < d10) ? i12 : Math.max(0L, d10 - 1), j10, -9223372036854775807L, d10, this.f32400a.s(bVar.f31794b), false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x002a, code lost:
        if (r9.s(r9.q()) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private j8.d2 m(j8.j3 r25, java.lang.Object r26, long r27, long r29, long r31) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            j8.j3$b r5 = r0.f32400a
            r1.h(r2, r5)
            j8.j3$b r5 = r0.f32400a
            int r5 = r5.f(r3)
            r6 = 1
            r7 = 0
            r8 = -1
            if (r5 != r8) goto L2d
            j8.j3$b r9 = r0.f32400a
            int r9 = r9.e()
            if (r9 <= 0) goto L4c
            j8.j3$b r9 = r0.f32400a
            int r10 = r9.q()
            boolean r9 = r9.s(r10)
            if (r9 == 0) goto L4c
            goto L4a
        L2d:
            j8.j3$b r9 = r0.f32400a
            boolean r9 = r9.s(r5)
            if (r9 == 0) goto L4c
            j8.j3$b r9 = r0.f32400a
            long r9 = r9.h(r5)
            j8.j3$b r11 = r0.f32400a
            long r12 = r11.f32511d
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 != 0) goto L4c
            boolean r9 = r11.r(r5)
            if (r9 == 0) goto L4c
            r5 = -1
        L4a:
            r9 = 1
            goto L4d
        L4c:
            r9 = 0
        L4d:
            i9.u$b r11 = new i9.u$b
            r12 = r31
            r11.<init>(r2, r12, r5)
            boolean r2 = r0.s(r11)
            boolean r22 = r0.u(r1, r11)
            boolean r23 = r0.t(r1, r11, r2)
            if (r5 == r8) goto L6d
            j8.j3$b r1 = r0.f32400a
            boolean r1 = r1.s(r5)
            if (r1 == 0) goto L6d
            r20 = 1
            goto L6f
        L6d:
            r20 = 0
        L6f:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == r8) goto L7f
            j8.j3$b r1 = r0.f32400a
            long r8 = r1.h(r5)
        L7c:
            r16 = r8
            goto L88
        L7f:
            if (r9 == 0) goto L86
            j8.j3$b r1 = r0.f32400a
            long r8 = r1.f32511d
            goto L7c
        L86:
            r16 = r6
        L88:
            int r1 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r1 == 0) goto L96
            r8 = -9223372036854775808
            int r1 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r1 != 0) goto L93
            goto L96
        L93:
            r18 = r16
            goto L9c
        L96:
            j8.j3$b r1 = r0.f32400a
            long r8 = r1.f32511d
            r18 = r8
        L9c:
            int r1 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r1 == 0) goto Lae
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 < 0) goto Lae
            r3 = 0
            r5 = 1
            long r5 = r18 - r5
            long r3 = java.lang.Math.max(r3, r5)
        Lae:
            r12 = r3
            j8.d2 r1 = new j8.d2
            r10 = r1
            r14 = r29
            r21 = r2
            r10.<init>(r11, r12, r14, r16, r18, r20, r21, r22, r23)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.f2.m(j8.j3, java.lang.Object, long, long, long):j8.d2");
    }

    private long n(j3 j3Var, Object obj, int i10) {
        j3Var.h(obj, this.f32400a);
        long h10 = this.f32400a.h(i10);
        if (h10 == Long.MIN_VALUE) {
            return this.f32400a.f32511d;
        }
        return h10 + this.f32400a.k(i10);
    }

    private boolean s(u.b bVar) {
        return !bVar.b() && bVar.f31797e == -1;
    }

    private boolean t(j3 j3Var, u.b bVar, boolean z10) {
        int b10 = j3Var.b(bVar.f31793a);
        return !j3Var.n(j3Var.f(b10, this.f32400a).f32510c, this.f32401b).f32527i && j3Var.r(b10, this.f32400a, this.f32401b, this.f32405f, this.f32406g) && z10;
    }

    private boolean u(j3 j3Var, u.b bVar) {
        if (s(bVar)) {
            return j3Var.n(j3Var.h(bVar.f31793a, this.f32400a).f32510c, this.f32401b).f32534p == j3Var.b(bVar.f31793a);
        }
        return false;
    }

    public /* synthetic */ void w(s.a aVar, u.b bVar) {
        this.f32402c.I(aVar.h(), bVar);
    }

    private void x() {
        final s.a n10 = jb.s.n();
        for (c2 c2Var = this.f32407h; c2Var != null; c2Var = c2Var.j()) {
            n10.a(c2Var.f32341f.f32367a);
        }
        c2 c2Var2 = this.f32408i;
        final u.b bVar = c2Var2 == null ? null : c2Var2.f32341f.f32367a;
        this.f32403d.post(new Runnable() { // from class: j8.e2
            @Override // java.lang.Runnable
            public final void run() {
                f2.a(f2.this, n10, bVar);
            }
        });
    }

    public u.b B(j3 j3Var, Object obj, long j10) {
        long C = C(j3Var, obj);
        j3Var.h(obj, this.f32400a);
        j3Var.n(this.f32400a.f32510c, this.f32401b);
        boolean z10 = false;
        for (int b10 = j3Var.b(obj); b10 >= this.f32401b.f32533o; b10--) {
            j3Var.g(b10, this.f32400a, true);
            boolean z11 = this.f32400a.e() > 0;
            z10 |= z11;
            j3.b bVar = this.f32400a;
            if (bVar.g(bVar.f32511d) != -1) {
                obj = ea.a.e(this.f32400a.f32509b);
            }
            if (z10 && (!z11 || this.f32400a.f32511d != 0)) {
                break;
            }
        }
        return A(j3Var, obj, j10, C, this.f32401b, this.f32400a);
    }

    public boolean D() {
        c2 c2Var = this.f32409j;
        return c2Var == null || (!c2Var.f32341f.f32375i && c2Var.q() && this.f32409j.f32341f.f32371e != -9223372036854775807L && this.f32410k < 100);
    }

    public boolean F(j3 j3Var, long j10, long j11) {
        d2 d2Var;
        c2 c2Var = this.f32407h;
        c2 c2Var2 = null;
        while (c2Var != null) {
            d2 d2Var2 = c2Var.f32341f;
            if (c2Var2 == null) {
                d2Var = r(j3Var, d2Var2);
            } else {
                d2 i10 = i(j3Var, c2Var2, j10);
                if (i10 == null) {
                    return !z(c2Var2);
                }
                if (!e(d2Var2, i10)) {
                    return !z(c2Var2);
                }
                d2Var = i10;
            }
            c2Var.f32341f = d2Var.a(d2Var2.f32369c);
            if (!d(d2Var2.f32371e, d2Var.f32371e)) {
                c2Var.A();
                long j12 = d2Var.f32371e;
                return (z(c2Var) || (c2Var == this.f32408i && !c2Var.f32341f.f32372f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c2Var.z(j12)) ? 1 : (j11 == ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c2Var.z(j12)) ? 0 : -1)) >= 0))) ? false : true;
            }
            c2Var2 = c2Var;
            c2Var = c2Var.j();
        }
        return true;
    }

    public boolean G(j3 j3Var, int i10) {
        this.f32405f = i10;
        return E(j3Var);
    }

    public boolean H(j3 j3Var, boolean z10) {
        this.f32406g = z10;
        return E(j3Var);
    }

    public c2 b() {
        c2 c2Var = this.f32407h;
        if (c2Var == null) {
            return null;
        }
        if (c2Var == this.f32408i) {
            this.f32408i = c2Var.j();
        }
        this.f32407h.t();
        int i10 = this.f32410k - 1;
        this.f32410k = i10;
        if (i10 == 0) {
            this.f32409j = null;
            c2 c2Var2 = this.f32407h;
            this.f32411l = c2Var2.f32337b;
            this.f32412m = c2Var2.f32341f.f32367a.f31796d;
        }
        this.f32407h = this.f32407h.j();
        x();
        return this.f32407h;
    }

    public c2 c() {
        c2 c2Var = this.f32408i;
        ea.a.f((c2Var == null || c2Var.j() == null) ? false : true);
        this.f32408i = this.f32408i.j();
        x();
        return this.f32408i;
    }

    public void f() {
        if (this.f32410k == 0) {
            return;
        }
        c2 c2Var = (c2) ea.a.h(this.f32407h);
        this.f32411l = c2Var.f32337b;
        this.f32412m = c2Var.f32341f.f32367a.f31796d;
        while (c2Var != null) {
            c2Var.t();
            c2Var = c2Var.j();
        }
        this.f32407h = null;
        this.f32409j = null;
        this.f32408i = null;
        this.f32410k = 0;
        x();
    }

    public c2 g(y2[] y2VarArr, ba.a0 a0Var, da.b bVar, i2 i2Var, d2 d2Var, ba.b0 b0Var) {
        c2 c2Var = this.f32409j;
        c2 c2Var2 = new c2(y2VarArr, c2Var == null ? 1000000000000L : (c2Var.l() + this.f32409j.f32341f.f32371e) - d2Var.f32368b, a0Var, bVar, i2Var, d2Var, b0Var);
        c2 c2Var3 = this.f32409j;
        if (c2Var3 != null) {
            c2Var3.w(c2Var2);
        } else {
            this.f32407h = c2Var2;
            this.f32408i = c2Var2;
        }
        this.f32411l = null;
        this.f32409j = c2Var2;
        this.f32410k++;
        x();
        return c2Var2;
    }

    public c2 j() {
        return this.f32409j;
    }

    public d2 o(long j10, n2 n2Var) {
        c2 c2Var = this.f32409j;
        if (c2Var == null) {
            return h(n2Var);
        }
        return i(n2Var.f32635a, c2Var, j10);
    }

    public c2 p() {
        return this.f32407h;
    }

    public c2 q() {
        return this.f32408i;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j8.d2 r(j8.j3 r19, j8.d2 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            i9.u$b r3 = r2.f32367a
            boolean r12 = r0.s(r3)
            boolean r13 = r0.u(r1, r3)
            boolean r14 = r0.t(r1, r3, r12)
            i9.u$b r4 = r2.f32367a
            java.lang.Object r4 = r4.f31793a
            j8.j3$b r5 = r0.f32400a
            r1.h(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L35
            int r1 = r3.f31797e
            if (r1 != r4) goto L2e
            goto L35
        L2e:
            j8.j3$b r7 = r0.f32400a
            long r7 = r7.h(r1)
            goto L36
        L35:
            r7 = r5
        L36:
            boolean r1 = r3.b()
            if (r1 == 0) goto L48
            j8.j3$b r1 = r0.f32400a
            int r5 = r3.f31794b
            int r6 = r3.f31795c
            long r5 = r1.d(r5, r6)
        L46:
            r9 = r5
            goto L5c
        L48:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L55
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            j8.j3$b r1 = r0.f32400a
            long r5 = r1.l()
            goto L46
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L6c
            j8.j3$b r1 = r0.f32400a
            int r4 = r3.f31794b
            boolean r1 = r1.s(r4)
            r11 = r1
            goto L7d
        L6c:
            int r1 = r3.f31797e
            if (r1 == r4) goto L7b
            j8.j3$b r4 = r0.f32400a
            boolean r1 = r4.s(r1)
            if (r1 == 0) goto L7b
            r1 = 1
            r11 = 1
            goto L7d
        L7b:
            r1 = 0
            r11 = 0
        L7d:
            j8.d2 r15 = new j8.d2
            long r4 = r2.f32368b
            long r1 = r2.f32369c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.f2.r(j8.j3, j8.d2):j8.d2");
    }

    public boolean v(i9.r rVar) {
        c2 c2Var = this.f32409j;
        return c2Var != null && c2Var.f32336a == rVar;
    }

    public void y(long j10) {
        c2 c2Var = this.f32409j;
        if (c2Var != null) {
            c2Var.s(j10);
        }
    }

    public boolean z(c2 c2Var) {
        boolean z10 = false;
        ea.a.f(c2Var != null);
        if (c2Var.equals(this.f32409j)) {
            return false;
        }
        this.f32409j = c2Var;
        while (c2Var.j() != null) {
            c2Var = c2Var.j();
            if (c2Var == this.f32408i) {
                this.f32408i = this.f32407h;
                z10 = true;
            }
            c2Var.t();
            this.f32410k--;
        }
        this.f32409j.w(null);
        x();
        return z10;
    }
}
