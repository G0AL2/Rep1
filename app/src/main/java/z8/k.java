package z8;

import j8.p1;
import z8.i0;

/* compiled from: DtsReader.java */
/* loaded from: classes2.dex */
public final class k implements m {

    /* renamed from: b  reason: collision with root package name */
    private final String f40262b;

    /* renamed from: c  reason: collision with root package name */
    private String f40263c;

    /* renamed from: d  reason: collision with root package name */
    private p8.a0 f40264d;

    /* renamed from: f  reason: collision with root package name */
    private int f40266f;

    /* renamed from: g  reason: collision with root package name */
    private int f40267g;

    /* renamed from: h  reason: collision with root package name */
    private long f40268h;

    /* renamed from: i  reason: collision with root package name */
    private p1 f40269i;

    /* renamed from: j  reason: collision with root package name */
    private int f40270j;

    /* renamed from: a  reason: collision with root package name */
    private final ea.a0 f40261a = new ea.a0(new byte[18]);

    /* renamed from: e  reason: collision with root package name */
    private int f40265e = 0;

    /* renamed from: k  reason: collision with root package name */
    private long f40271k = -9223372036854775807L;

    public k(String str) {
        this.f40262b = str;
    }

    private boolean a(ea.a0 a0Var, byte[] bArr, int i10) {
        int min = Math.min(a0Var.a(), i10 - this.f40266f);
        a0Var.j(bArr, this.f40266f, min);
        int i11 = this.f40266f + min;
        this.f40266f = i11;
        return i11 == i10;
    }

    private void g() {
        byte[] d10 = this.f40261a.d();
        if (this.f40269i == null) {
            p1 g10 = l8.b0.g(d10, this.f40263c, this.f40262b, null);
            this.f40269i = g10;
            this.f40264d.d(g10);
        }
        this.f40270j = l8.b0.a(d10);
        this.f40268h = (int) ((l8.b0.f(d10) * 1000000) / this.f40269i.f32723z);
    }

    private boolean h(ea.a0 a0Var) {
        while (a0Var.a() > 0) {
            int i10 = this.f40267g << 8;
            this.f40267g = i10;
            int D = i10 | a0Var.D();
            this.f40267g = D;
            if (l8.b0.d(D)) {
                byte[] d10 = this.f40261a.d();
                int i11 = this.f40267g;
                d10[0] = (byte) ((i11 >> 24) & 255);
                d10[1] = (byte) ((i11 >> 16) & 255);
                d10[2] = (byte) ((i11 >> 8) & 255);
                d10[3] = (byte) (i11 & 255);
                this.f40266f = 4;
                this.f40267g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // z8.m
    public void b() {
        this.f40265e = 0;
        this.f40266f = 0;
        this.f40267g = 0;
        this.f40271k = -9223372036854775807L;
    }

    @Override // z8.m
    public void c(ea.a0 a0Var) {
        ea.a.h(this.f40264d);
        while (a0Var.a() > 0) {
            int i10 = this.f40265e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(a0Var.a(), this.f40270j - this.f40266f);
                        this.f40264d.a(a0Var, min);
                        int i11 = this.f40266f + min;
                        this.f40266f = i11;
                        int i12 = this.f40270j;
                        if (i11 == i12) {
                            long j10 = this.f40271k;
                            if (j10 != -9223372036854775807L) {
                                this.f40264d.e(j10, 1, i12, 0, null);
                                this.f40271k += this.f40268h;
                            }
                            this.f40265e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(a0Var, this.f40261a.d(), 18)) {
                    g();
                    this.f40261a.P(0);
                    this.f40264d.a(this.f40261a, 18);
                    this.f40265e = 2;
                }
            } else if (h(a0Var)) {
                this.f40265e = 1;
            }
        }
    }

    @Override // z8.m
    public void d() {
    }

    @Override // z8.m
    public void e(p8.k kVar, i0.d dVar) {
        dVar.a();
        this.f40263c = dVar.b();
        this.f40264d = kVar.f(dVar.c(), 1);
    }

    @Override // z8.m
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f40271k = j10;
        }
    }
}
