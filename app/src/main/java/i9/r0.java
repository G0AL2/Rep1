package i9;

import android.net.Uri;
import j8.j3;
import j8.x1;

/* compiled from: SinglePeriodTimeline.java */
/* loaded from: classes2.dex */
public final class r0 extends j3 {

    /* renamed from: o  reason: collision with root package name */
    private static final Object f31779o = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final long f31780b;

    /* renamed from: c  reason: collision with root package name */
    private final long f31781c;

    /* renamed from: d  reason: collision with root package name */
    private final long f31782d;

    /* renamed from: e  reason: collision with root package name */
    private final long f31783e;

    /* renamed from: f  reason: collision with root package name */
    private final long f31784f;

    /* renamed from: g  reason: collision with root package name */
    private final long f31785g;

    /* renamed from: h  reason: collision with root package name */
    private final long f31786h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f31787i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f31788j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f31789k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f31790l;

    /* renamed from: m  reason: collision with root package name */
    private final x1 f31791m;

    /* renamed from: n  reason: collision with root package name */
    private final x1.g f31792n;

    static {
        new x1.c().c("SinglePeriodTimeline").f(Uri.EMPTY).a();
    }

    public r0(long j10, boolean z10, boolean z11, boolean z12, Object obj, x1 x1Var) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, x1Var);
    }

    @Override // j8.j3
    public int b(Object obj) {
        return f31779o.equals(obj) ? 0 : -1;
    }

    @Override // j8.j3
    public j3.b g(int i10, j3.b bVar, boolean z10) {
        ea.a.c(i10, 0, 1);
        return bVar.u(null, z10 ? f31779o : null, 0, this.f31783e, -this.f31785g);
    }

    @Override // j8.j3
    public int i() {
        return 1;
    }

    @Override // j8.j3
    public Object m(int i10) {
        ea.a.c(i10, 0, 1);
        return f31779o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r1 > r5) goto L9;
     */
    @Override // j8.j3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j8.j3.c o(int r25, j8.j3.c r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            ea.a.c(r3, r1, r2)
            long r1 = r0.f31786h
            boolean r14 = r0.f31788j
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L2e
            boolean r5 = r0.f31789k
            if (r5 != 0) goto L2e
            r5 = 0
            int r7 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r7 == 0) goto L2e
            long r5 = r0.f31784f
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r3
            goto L30
        L27:
            long r1 = r1 + r27
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = j8.j3.c.f32515r
            j8.x1 r5 = r0.f31791m
            java.lang.Object r6 = r0.f31790l
            long r7 = r0.f31780b
            long r9 = r0.f31781c
            long r11 = r0.f31782d
            boolean r13 = r0.f31787i
            j8.x1$g r15 = r0.f31792n
            long r1 = r0.f31784f
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f31785g
            r22 = r1
            r3 = r26
            j8.j3$c r1 = r3.i(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.r0.o(int, j8.j3$c, long):j8.j3$c");
    }

    @Override // j8.j3
    public int p() {
        return 1;
    }

    public r0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, x1 x1Var) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, x1Var, z12 ? x1Var.f32821c : null);
    }

    public r0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, x1 x1Var, x1.g gVar) {
        this.f31780b = j10;
        this.f31781c = j11;
        this.f31782d = j12;
        this.f31783e = j13;
        this.f31784f = j14;
        this.f31785g = j15;
        this.f31786h = j16;
        this.f31787i = z10;
        this.f31788j = z11;
        this.f31789k = z12;
        this.f31790l = obj;
        this.f31791m = (x1) ea.a.e(x1Var);
        this.f31792n = gVar;
    }
}
