package z8;

import ea.n0;
import j8.p1;
import java.util.Collections;
import z8.i0;

/* compiled from: H265Reader.java */
/* loaded from: classes2.dex */
public final class q implements m {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f40377a;

    /* renamed from: b  reason: collision with root package name */
    private String f40378b;

    /* renamed from: c  reason: collision with root package name */
    private p8.a0 f40379c;

    /* renamed from: d  reason: collision with root package name */
    private a f40380d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f40381e;

    /* renamed from: l  reason: collision with root package name */
    private long f40388l;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f40382f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    private final u f40383g = new u(32, 128);

    /* renamed from: h  reason: collision with root package name */
    private final u f40384h = new u(33, 128);

    /* renamed from: i  reason: collision with root package name */
    private final u f40385i = new u(34, 128);

    /* renamed from: j  reason: collision with root package name */
    private final u f40386j = new u(39, 128);

    /* renamed from: k  reason: collision with root package name */
    private final u f40387k = new u(40, 128);

    /* renamed from: m  reason: collision with root package name */
    private long f40389m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    private final ea.a0 f40390n = new ea.a0();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: H265Reader.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final p8.a0 f40391a;

        /* renamed from: b  reason: collision with root package name */
        private long f40392b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f40393c;

        /* renamed from: d  reason: collision with root package name */
        private int f40394d;

        /* renamed from: e  reason: collision with root package name */
        private long f40395e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f40396f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f40397g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f40398h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f40399i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f40400j;

        /* renamed from: k  reason: collision with root package name */
        private long f40401k;

        /* renamed from: l  reason: collision with root package name */
        private long f40402l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f40403m;

        public a(p8.a0 a0Var) {
            this.f40391a = a0Var;
        }

        private static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
        }

        private void d(int i10) {
            long j10 = this.f40402l;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.f40403m;
            this.f40391a.e(j10, z10 ? 1 : 0, (int) (this.f40392b - this.f40401k), i10, null);
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f40400j && this.f40397g) {
                this.f40403m = this.f40393c;
                this.f40400j = false;
            } else if (this.f40398h || this.f40397g) {
                if (z10 && this.f40399i) {
                    d(i10 + ((int) (j10 - this.f40392b)));
                }
                this.f40401k = this.f40392b;
                this.f40402l = this.f40395e;
                this.f40403m = this.f40393c;
                this.f40399i = true;
            }
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f40396f) {
                int i12 = this.f40394d;
                int i13 = (i10 + 2) - i12;
                if (i13 < i11) {
                    this.f40397g = (bArr[i13] & 128) != 0;
                    this.f40396f = false;
                    return;
                }
                this.f40394d = i12 + (i11 - i10);
            }
        }

        public void f() {
            this.f40396f = false;
            this.f40397g = false;
            this.f40398h = false;
            this.f40399i = false;
            this.f40400j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            boolean z11 = false;
            this.f40397g = false;
            this.f40398h = false;
            this.f40395e = j11;
            this.f40394d = 0;
            this.f40392b = j10;
            if (!c(i11)) {
                if (this.f40399i && !this.f40400j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f40399i = false;
                }
                if (b(i11)) {
                    this.f40398h = !this.f40400j;
                    this.f40400j = true;
                }
            }
            boolean z12 = i11 >= 16 && i11 <= 21;
            this.f40393c = z12;
            this.f40396f = (z12 || i11 <= 9) ? true : true;
        }
    }

    public q(d0 d0Var) {
        this.f40377a = d0Var;
    }

    private void a() {
        ea.a.h(this.f40379c);
        n0.j(this.f40380d);
    }

    private void g(long j10, int i10, int i11, long j11) {
        this.f40380d.a(j10, i10, this.f40381e);
        if (!this.f40381e) {
            this.f40383g.b(i11);
            this.f40384h.b(i11);
            this.f40385i.b(i11);
            if (this.f40383g.c() && this.f40384h.c() && this.f40385i.c()) {
                this.f40379c.d(i(this.f40378b, this.f40383g, this.f40384h, this.f40385i));
                this.f40381e = true;
            }
        }
        if (this.f40386j.b(i11)) {
            u uVar = this.f40386j;
            this.f40390n.N(this.f40386j.f40446d, ea.w.q(uVar.f40446d, uVar.f40447e));
            this.f40390n.Q(5);
            this.f40377a.a(j11, this.f40390n);
        }
        if (this.f40387k.b(i11)) {
            u uVar2 = this.f40387k;
            this.f40390n.N(this.f40387k.f40446d, ea.w.q(uVar2.f40446d, uVar2.f40447e));
            this.f40390n.Q(5);
            this.f40377a.a(j11, this.f40390n);
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        this.f40380d.e(bArr, i10, i11);
        if (!this.f40381e) {
            this.f40383g.a(bArr, i10, i11);
            this.f40384h.a(bArr, i10, i11);
            this.f40385i.a(bArr, i10, i11);
        }
        this.f40386j.a(bArr, i10, i11);
        this.f40387k.a(bArr, i10, i11);
    }

    private static p1 i(String str, u uVar, u uVar2, u uVar3) {
        int i10 = uVar.f40447e;
        byte[] bArr = new byte[uVar2.f40447e + i10 + uVar3.f40447e];
        System.arraycopy(uVar.f40446d, 0, bArr, 0, i10);
        System.arraycopy(uVar2.f40446d, 0, bArr, uVar.f40447e, uVar2.f40447e);
        System.arraycopy(uVar3.f40446d, 0, bArr, uVar.f40447e + uVar2.f40447e, uVar3.f40447e);
        ea.b0 b0Var = new ea.b0(uVar2.f40446d, 0, uVar2.f40447e);
        b0Var.l(44);
        int e10 = b0Var.e(3);
        b0Var.k();
        int e11 = b0Var.e(2);
        boolean d10 = b0Var.d();
        int e12 = b0Var.e(5);
        int i11 = 0;
        for (int i12 = 0; i12 < 32; i12++) {
            if (b0Var.d()) {
                i11 |= 1 << i12;
            }
        }
        int[] iArr = new int[6];
        for (int i13 = 0; i13 < 6; i13++) {
            iArr[i13] = b0Var.e(8);
        }
        int e13 = b0Var.e(8);
        int i14 = 0;
        for (int i15 = 0; i15 < e10; i15++) {
            if (b0Var.d()) {
                i14 += 89;
            }
            if (b0Var.d()) {
                i14 += 8;
            }
        }
        b0Var.l(i14);
        if (e10 > 0) {
            b0Var.l((8 - e10) * 2);
        }
        b0Var.h();
        int h10 = b0Var.h();
        if (h10 == 3) {
            b0Var.k();
        }
        int h11 = b0Var.h();
        int h12 = b0Var.h();
        if (b0Var.d()) {
            int h13 = b0Var.h();
            int h14 = b0Var.h();
            int h15 = b0Var.h();
            int h16 = b0Var.h();
            h11 -= ((h10 == 1 || h10 == 2) ? 2 : 1) * (h13 + h14);
            h12 -= (h10 == 1 ? 2 : 1) * (h15 + h16);
        }
        b0Var.h();
        b0Var.h();
        int h17 = b0Var.h();
        for (int i16 = b0Var.d() ? 0 : e10; i16 <= e10; i16++) {
            b0Var.h();
            b0Var.h();
            b0Var.h();
        }
        b0Var.h();
        b0Var.h();
        b0Var.h();
        b0Var.h();
        b0Var.h();
        b0Var.h();
        if (b0Var.d() && b0Var.d()) {
            j(b0Var);
        }
        b0Var.l(2);
        if (b0Var.d()) {
            b0Var.l(8);
            b0Var.h();
            b0Var.h();
            b0Var.k();
        }
        k(b0Var);
        if (b0Var.d()) {
            for (int i17 = 0; i17 < b0Var.h(); i17++) {
                b0Var.l(h17 + 4 + 1);
            }
        }
        b0Var.l(2);
        float f10 = 1.0f;
        if (b0Var.d()) {
            if (b0Var.d()) {
                int e14 = b0Var.e(8);
                if (e14 == 255) {
                    int e15 = b0Var.e(16);
                    int e16 = b0Var.e(16);
                    if (e15 != 0 && e16 != 0) {
                        f10 = e15 / e16;
                    }
                } else {
                    float[] fArr = ea.w.f29750b;
                    if (e14 < fArr.length) {
                        f10 = fArr[e14];
                    } else {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Unexpected aspect_ratio_idc value: ");
                        sb2.append(e14);
                        ea.r.h("H265Reader", sb2.toString());
                    }
                }
            }
            if (b0Var.d()) {
                b0Var.k();
            }
            if (b0Var.d()) {
                b0Var.l(4);
                if (b0Var.d()) {
                    b0Var.l(24);
                }
            }
            if (b0Var.d()) {
                b0Var.h();
                b0Var.h();
            }
            b0Var.k();
            if (b0Var.d()) {
                h12 *= 2;
            }
        }
        return new p1.b().S(str).e0("video/hevc").I(ea.d.c(e11, d10, e12, i11, iArr, e13)).j0(h11).Q(h12).a0(f10).T(Collections.singletonList(bArr)).E();
    }

    private static void j(ea.b0 b0Var) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (!b0Var.d()) {
                    b0Var.h();
                } else {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        b0Var.g();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        b0Var.g();
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void k(ea.b0 b0Var) {
        int h10 = b0Var.h();
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < h10; i11++) {
            if (i11 != 0) {
                z10 = b0Var.d();
            }
            if (z10) {
                b0Var.k();
                b0Var.h();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (b0Var.d()) {
                        b0Var.k();
                    }
                }
            } else {
                int h11 = b0Var.h();
                int h12 = b0Var.h();
                int i13 = h11 + h12;
                for (int i14 = 0; i14 < h11; i14++) {
                    b0Var.h();
                    b0Var.k();
                }
                for (int i15 = 0; i15 < h12; i15++) {
                    b0Var.h();
                    b0Var.k();
                }
                i10 = i13;
            }
        }
    }

    private void l(long j10, int i10, int i11, long j11) {
        this.f40380d.g(j10, i10, i11, j11, this.f40381e);
        if (!this.f40381e) {
            this.f40383g.e(i11);
            this.f40384h.e(i11);
            this.f40385i.e(i11);
        }
        this.f40386j.e(i11);
        this.f40387k.e(i11);
    }

    @Override // z8.m
    public void b() {
        this.f40388l = 0L;
        this.f40389m = -9223372036854775807L;
        ea.w.a(this.f40382f);
        this.f40383g.d();
        this.f40384h.d();
        this.f40385i.d();
        this.f40386j.d();
        this.f40387k.d();
        a aVar = this.f40380d;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // z8.m
    public void c(ea.a0 a0Var) {
        a();
        while (a0Var.a() > 0) {
            int e10 = a0Var.e();
            int f10 = a0Var.f();
            byte[] d10 = a0Var.d();
            this.f40388l += a0Var.a();
            this.f40379c.a(a0Var, a0Var.a());
            while (e10 < f10) {
                int c10 = ea.w.c(d10, e10, f10, this.f40382f);
                if (c10 == f10) {
                    h(d10, e10, f10);
                    return;
                }
                int e11 = ea.w.e(d10, c10);
                int i10 = c10 - e10;
                if (i10 > 0) {
                    h(d10, e10, c10);
                }
                int i11 = f10 - c10;
                long j10 = this.f40388l - i11;
                g(j10, i11, i10 < 0 ? -i10 : 0, this.f40389m);
                l(j10, i11, e11, this.f40389m);
                e10 = c10 + 3;
            }
        }
    }

    @Override // z8.m
    public void d() {
    }

    @Override // z8.m
    public void e(p8.k kVar, i0.d dVar) {
        dVar.a();
        this.f40378b = dVar.b();
        p8.a0 f10 = kVar.f(dVar.c(), 2);
        this.f40379c = f10;
        this.f40380d = new a(f10);
        this.f40377a.b(kVar, dVar);
    }

    @Override // z8.m
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f40389m = j10;
        }
    }
}
