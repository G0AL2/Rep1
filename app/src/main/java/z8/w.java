package z8;

import j8.j2;
import z8.i0;

/* compiled from: PesReader.java */
/* loaded from: classes2.dex */
public final class w implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private final m f40451a;

    /* renamed from: b  reason: collision with root package name */
    private final ea.z f40452b = new ea.z(new byte[10]);

    /* renamed from: c  reason: collision with root package name */
    private int f40453c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f40454d;

    /* renamed from: e  reason: collision with root package name */
    private ea.j0 f40455e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f40456f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f40457g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f40458h;

    /* renamed from: i  reason: collision with root package name */
    private int f40459i;

    /* renamed from: j  reason: collision with root package name */
    private int f40460j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f40461k;

    /* renamed from: l  reason: collision with root package name */
    private long f40462l;

    public w(m mVar) {
        this.f40451a = mVar;
    }

    private boolean d(ea.a0 a0Var, byte[] bArr, int i10) {
        int min = Math.min(a0Var.a(), i10 - this.f40454d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            a0Var.Q(min);
        } else {
            a0Var.j(bArr, this.f40454d, min);
        }
        int i11 = this.f40454d + min;
        this.f40454d = i11;
        return i11 == i10;
    }

    private boolean e() {
        this.f40452b.p(0);
        int h10 = this.f40452b.h(24);
        if (h10 != 1) {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Unexpected start code prefix: ");
            sb2.append(h10);
            ea.r.h("PesReader", sb2.toString());
            this.f40460j = -1;
            return false;
        }
        this.f40452b.r(8);
        int h11 = this.f40452b.h(16);
        this.f40452b.r(5);
        this.f40461k = this.f40452b.g();
        this.f40452b.r(2);
        this.f40456f = this.f40452b.g();
        this.f40457g = this.f40452b.g();
        this.f40452b.r(6);
        int h12 = this.f40452b.h(8);
        this.f40459i = h12;
        if (h11 == 0) {
            this.f40460j = -1;
        } else {
            int i10 = ((h11 + 6) - 9) - h12;
            this.f40460j = i10;
            if (i10 < 0) {
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("Found negative packet payload size: ");
                sb3.append(i10);
                ea.r.h("PesReader", sb3.toString());
                this.f40460j = -1;
            }
        }
        return true;
    }

    private void f() {
        this.f40452b.p(0);
        this.f40462l = -9223372036854775807L;
        if (this.f40456f) {
            this.f40452b.r(4);
            this.f40452b.r(1);
            this.f40452b.r(1);
            long h10 = (this.f40452b.h(3) << 30) | (this.f40452b.h(15) << 15) | this.f40452b.h(15);
            this.f40452b.r(1);
            if (!this.f40458h && this.f40457g) {
                this.f40452b.r(4);
                this.f40452b.r(1);
                this.f40452b.r(1);
                this.f40452b.r(1);
                this.f40455e.b((this.f40452b.h(3) << 30) | (this.f40452b.h(15) << 15) | this.f40452b.h(15));
                this.f40458h = true;
            }
            this.f40462l = this.f40455e.b(h10);
        }
    }

    private void g(int i10) {
        this.f40453c = i10;
        this.f40454d = 0;
    }

    @Override // z8.i0
    public void a(ea.j0 j0Var, p8.k kVar, i0.d dVar) {
        this.f40455e = j0Var;
        this.f40451a.e(kVar, dVar);
    }

    @Override // z8.i0
    public final void b() {
        this.f40453c = 0;
        this.f40454d = 0;
        this.f40458h = false;
        this.f40451a.b();
    }

    @Override // z8.i0
    public final void c(ea.a0 a0Var, int i10) throws j2 {
        ea.a.h(this.f40455e);
        if ((i10 & 1) != 0) {
            int i11 = this.f40453c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    ea.r.h("PesReader", "Unexpected start indicator reading extended header");
                } else if (i11 == 3) {
                    int i12 = this.f40460j;
                    if (i12 != -1) {
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Unexpected start indicator: expected ");
                        sb2.append(i12);
                        sb2.append(" more bytes");
                        ea.r.h("PesReader", sb2.toString());
                    }
                    this.f40451a.d();
                } else {
                    throw new IllegalStateException();
                }
            }
            g(1);
        }
        while (a0Var.a() > 0) {
            int i13 = this.f40453c;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        if (d(a0Var, this.f40452b.f29788a, Math.min(10, this.f40459i)) && d(a0Var, null, this.f40459i)) {
                            f();
                            i10 |= this.f40461k ? 4 : 0;
                            this.f40451a.f(this.f40462l, i10);
                            g(3);
                        }
                    } else if (i13 == 3) {
                        int a10 = a0Var.a();
                        int i14 = this.f40460j;
                        int i15 = i14 != -1 ? a10 - i14 : 0;
                        if (i15 > 0) {
                            a10 -= i15;
                            a0Var.O(a0Var.e() + a10);
                        }
                        this.f40451a.c(a0Var);
                        int i16 = this.f40460j;
                        if (i16 != -1) {
                            int i17 = i16 - a10;
                            this.f40460j = i17;
                            if (i17 == 0) {
                                this.f40451a.d();
                                g(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (d(a0Var, this.f40452b.f29788a, 9)) {
                    g(e() ? 2 : 0);
                }
            } else {
                a0Var.Q(a0Var.a());
            }
        }
    }
}
