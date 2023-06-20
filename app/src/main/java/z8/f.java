package z8;

import j8.p1;
import l8.c;
import z8.i0;

/* compiled from: Ac4Reader.java */
/* loaded from: classes2.dex */
public final class f implements m {

    /* renamed from: a  reason: collision with root package name */
    private final ea.z f40164a;

    /* renamed from: b  reason: collision with root package name */
    private final ea.a0 f40165b;

    /* renamed from: c  reason: collision with root package name */
    private final String f40166c;

    /* renamed from: d  reason: collision with root package name */
    private String f40167d;

    /* renamed from: e  reason: collision with root package name */
    private p8.a0 f40168e;

    /* renamed from: f  reason: collision with root package name */
    private int f40169f;

    /* renamed from: g  reason: collision with root package name */
    private int f40170g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f40171h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f40172i;

    /* renamed from: j  reason: collision with root package name */
    private long f40173j;

    /* renamed from: k  reason: collision with root package name */
    private p1 f40174k;

    /* renamed from: l  reason: collision with root package name */
    private int f40175l;

    /* renamed from: m  reason: collision with root package name */
    private long f40176m;

    public f() {
        this(null);
    }

    private boolean a(ea.a0 a0Var, byte[] bArr, int i10) {
        int min = Math.min(a0Var.a(), i10 - this.f40170g);
        a0Var.j(bArr, this.f40170g, min);
        int i11 = this.f40170g + min;
        this.f40170g = i11;
        return i11 == i10;
    }

    private void g() {
        this.f40164a.p(0);
        c.b d10 = l8.c.d(this.f40164a);
        p1 p1Var = this.f40174k;
        if (p1Var == null || d10.f33775b != p1Var.f32722y || d10.f33774a != p1Var.f32723z || !"audio/ac4".equals(p1Var.f32709l)) {
            p1 E = new p1.b().S(this.f40167d).e0("audio/ac4").H(d10.f33775b).f0(d10.f33774a).V(this.f40166c).E();
            this.f40174k = E;
            this.f40168e.d(E);
        }
        this.f40175l = d10.f33776c;
        this.f40173j = (d10.f33777d * 1000000) / this.f40174k.f32723z;
    }

    private boolean h(ea.a0 a0Var) {
        int D;
        while (true) {
            if (a0Var.a() <= 0) {
                return false;
            }
            if (!this.f40171h) {
                this.f40171h = a0Var.D() == 172;
            } else {
                D = a0Var.D();
                this.f40171h = D == 172;
                if (D == 64 || D == 65) {
                    break;
                }
            }
        }
        this.f40172i = D == 65;
        return true;
    }

    @Override // z8.m
    public void b() {
        this.f40169f = 0;
        this.f40170g = 0;
        this.f40171h = false;
        this.f40172i = false;
        this.f40176m = -9223372036854775807L;
    }

    @Override // z8.m
    public void c(ea.a0 a0Var) {
        ea.a.h(this.f40168e);
        while (a0Var.a() > 0) {
            int i10 = this.f40169f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(a0Var.a(), this.f40175l - this.f40170g);
                        this.f40168e.a(a0Var, min);
                        int i11 = this.f40170g + min;
                        this.f40170g = i11;
                        int i12 = this.f40175l;
                        if (i11 == i12) {
                            long j10 = this.f40176m;
                            if (j10 != -9223372036854775807L) {
                                this.f40168e.e(j10, 1, i12, 0, null);
                                this.f40176m += this.f40173j;
                            }
                            this.f40169f = 0;
                        }
                    }
                } else if (a(a0Var, this.f40165b.d(), 16)) {
                    g();
                    this.f40165b.P(0);
                    this.f40168e.a(this.f40165b, 16);
                    this.f40169f = 2;
                }
            } else if (h(a0Var)) {
                this.f40169f = 1;
                this.f40165b.d()[0] = -84;
                this.f40165b.d()[1] = (byte) (this.f40172i ? 65 : 64);
                this.f40170g = 2;
            }
        }
    }

    @Override // z8.m
    public void d() {
    }

    @Override // z8.m
    public void e(p8.k kVar, i0.d dVar) {
        dVar.a();
        this.f40167d = dVar.b();
        this.f40168e = kVar.f(dVar.c(), 1);
    }

    @Override // z8.m
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f40176m = j10;
        }
    }

    public f(String str) {
        ea.z zVar = new ea.z(new byte[16]);
        this.f40164a = zVar;
        this.f40165b = new ea.a0(zVar.f29788a);
        this.f40169f = 0;
        this.f40170g = 0;
        this.f40171h = false;
        this.f40172i = false;
        this.f40176m = -9223372036854775807L;
        this.f40166c = str;
    }
}
