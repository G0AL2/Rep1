package z8;

import com.inmobi.media.fq;
import ea.n0;
import j8.p1;
import java.util.Arrays;
import java.util.Collections;
import z8.i0;

/* compiled from: H263Reader.java */
/* loaded from: classes2.dex */
public final class o implements m {

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f40302l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final k0 f40303a;

    /* renamed from: b  reason: collision with root package name */
    private final ea.a0 f40304b;

    /* renamed from: e  reason: collision with root package name */
    private final u f40307e;

    /* renamed from: f  reason: collision with root package name */
    private b f40308f;

    /* renamed from: g  reason: collision with root package name */
    private long f40309g;

    /* renamed from: h  reason: collision with root package name */
    private String f40310h;

    /* renamed from: i  reason: collision with root package name */
    private p8.a0 f40311i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f40312j;

    /* renamed from: c  reason: collision with root package name */
    private final boolean[] f40305c = new boolean[4];

    /* renamed from: d  reason: collision with root package name */
    private final a f40306d = new a(128);

    /* renamed from: k  reason: collision with root package name */
    private long f40313k = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: H263Reader.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f40314f = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f40315a;

        /* renamed from: b  reason: collision with root package name */
        private int f40316b;

        /* renamed from: c  reason: collision with root package name */
        public int f40317c;

        /* renamed from: d  reason: collision with root package name */
        public int f40318d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f40319e;

        public a(int i10) {
            this.f40319e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f40315a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f40319e;
                int length = bArr2.length;
                int i13 = this.f40317c;
                if (length < i13 + i12) {
                    this.f40319e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f40319e, this.f40317c, i12);
                this.f40317c += i12;
            }
        }

        public boolean b(int i10, int i11) {
            int i12 = this.f40316b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                this.f40317c -= i11;
                                this.f40315a = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            ea.r.h("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f40318d = this.f40317c;
                            this.f40316b = 4;
                        }
                    } else if (i10 > 31) {
                        ea.r.h("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f40316b = 3;
                    }
                } else if (i10 != 181) {
                    ea.r.h("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f40316b = 2;
                }
            } else if (i10 == 176) {
                this.f40316b = 1;
                this.f40315a = true;
            }
            byte[] bArr = f40314f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f40315a = false;
            this.f40317c = 0;
            this.f40316b = 0;
        }
    }

    /* compiled from: H263Reader.java */
    /* loaded from: classes2.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final p8.a0 f40320a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f40321b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f40322c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f40323d;

        /* renamed from: e  reason: collision with root package name */
        private int f40324e;

        /* renamed from: f  reason: collision with root package name */
        private int f40325f;

        /* renamed from: g  reason: collision with root package name */
        private long f40326g;

        /* renamed from: h  reason: collision with root package name */
        private long f40327h;

        public b(p8.a0 a0Var) {
            this.f40320a = a0Var;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f40322c) {
                int i12 = this.f40325f;
                int i13 = (i10 + 1) - i12;
                if (i13 < i11) {
                    this.f40323d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f40322c = false;
                    return;
                }
                this.f40325f = i12 + (i11 - i10);
            }
        }

        public void b(long j10, int i10, boolean z10) {
            if (this.f40324e == 182 && z10 && this.f40321b) {
                long j11 = this.f40327h;
                if (j11 != -9223372036854775807L) {
                    this.f40320a.e(j11, this.f40323d ? 1 : 0, (int) (j10 - this.f40326g), i10, null);
                }
            }
            if (this.f40324e != 179) {
                this.f40326g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f40324e = i10;
            this.f40323d = false;
            this.f40321b = i10 == 182 || i10 == 179;
            this.f40322c = i10 == 182;
            this.f40325f = 0;
            this.f40327h = j10;
        }

        public void d() {
            this.f40321b = false;
            this.f40322c = false;
            this.f40323d = false;
            this.f40324e = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(k0 k0Var) {
        this.f40303a = k0Var;
        if (k0Var != null) {
            this.f40307e = new u(178, 128);
            this.f40304b = new ea.a0();
            return;
        }
        this.f40307e = null;
        this.f40304b = null;
    }

    private static p1 a(a aVar, int i10, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f40319e, aVar.f40317c);
        ea.z zVar = new ea.z(copyOf);
        zVar.s(i10);
        zVar.s(4);
        zVar.q();
        zVar.r(8);
        if (zVar.g()) {
            zVar.r(4);
            zVar.r(3);
        }
        int h10 = zVar.h(4);
        float f10 = 1.0f;
        if (h10 == 15) {
            int h11 = zVar.h(8);
            int h12 = zVar.h(8);
            if (h12 == 0) {
                ea.r.h("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = h11 / h12;
            }
        } else {
            float[] fArr = f40302l;
            if (h10 < fArr.length) {
                f10 = fArr[h10];
            } else {
                ea.r.h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (zVar.g()) {
            zVar.r(2);
            zVar.r(1);
            if (zVar.g()) {
                zVar.r(15);
                zVar.q();
                zVar.r(15);
                zVar.q();
                zVar.r(15);
                zVar.q();
                zVar.r(3);
                zVar.r(11);
                zVar.q();
                zVar.r(15);
                zVar.q();
            }
        }
        if (zVar.h(2) != 0) {
            ea.r.h("H263Reader", "Unhandled video object layer shape");
        }
        zVar.q();
        int h13 = zVar.h(16);
        zVar.q();
        if (zVar.g()) {
            if (h13 == 0) {
                ea.r.h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = h13 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                zVar.r(i11);
            }
        }
        zVar.q();
        int h14 = zVar.h(13);
        zVar.q();
        int h15 = zVar.h(13);
        zVar.q();
        zVar.q();
        return new p1.b().S(str).e0("video/mp4v-es").j0(h14).Q(h15).a0(f10).T(Collections.singletonList(copyOf)).E();
    }

    @Override // z8.m
    public void b() {
        ea.w.a(this.f40305c);
        this.f40306d.c();
        b bVar = this.f40308f;
        if (bVar != null) {
            bVar.d();
        }
        u uVar = this.f40307e;
        if (uVar != null) {
            uVar.d();
        }
        this.f40309g = 0L;
        this.f40313k = -9223372036854775807L;
    }

    @Override // z8.m
    public void c(ea.a0 a0Var) {
        ea.a.h(this.f40308f);
        ea.a.h(this.f40311i);
        int e10 = a0Var.e();
        int f10 = a0Var.f();
        byte[] d10 = a0Var.d();
        this.f40309g += a0Var.a();
        this.f40311i.a(a0Var, a0Var.a());
        while (true) {
            int c10 = ea.w.c(d10, e10, f10, this.f40305c);
            if (c10 == f10) {
                break;
            }
            int i10 = c10 + 3;
            int i11 = a0Var.d()[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
            int i12 = c10 - e10;
            int i13 = 0;
            if (!this.f40312j) {
                if (i12 > 0) {
                    this.f40306d.a(d10, e10, c10);
                }
                if (this.f40306d.b(i11, i12 < 0 ? -i12 : 0)) {
                    p8.a0 a0Var2 = this.f40311i;
                    a aVar = this.f40306d;
                    a0Var2.d(a(aVar, aVar.f40318d, (String) ea.a.e(this.f40310h)));
                    this.f40312j = true;
                }
            }
            this.f40308f.a(d10, e10, c10);
            u uVar = this.f40307e;
            if (uVar != null) {
                if (i12 > 0) {
                    uVar.a(d10, e10, c10);
                } else {
                    i13 = -i12;
                }
                if (this.f40307e.b(i13)) {
                    u uVar2 = this.f40307e;
                    ((ea.a0) n0.j(this.f40304b)).N(this.f40307e.f40446d, ea.w.q(uVar2.f40446d, uVar2.f40447e));
                    ((k0) n0.j(this.f40303a)).a(this.f40313k, this.f40304b);
                }
                if (i11 == 178 && a0Var.d()[c10 + 2] == 1) {
                    this.f40307e.e(i11);
                }
            }
            int i14 = f10 - c10;
            this.f40308f.b(this.f40309g - i14, i14, this.f40312j);
            this.f40308f.c(i11, this.f40313k);
            e10 = i10;
        }
        if (!this.f40312j) {
            this.f40306d.a(d10, e10, f10);
        }
        this.f40308f.a(d10, e10, f10);
        u uVar3 = this.f40307e;
        if (uVar3 != null) {
            uVar3.a(d10, e10, f10);
        }
    }

    @Override // z8.m
    public void d() {
    }

    @Override // z8.m
    public void e(p8.k kVar, i0.d dVar) {
        dVar.a();
        this.f40310h = dVar.b();
        p8.a0 f10 = kVar.f(dVar.c(), 2);
        this.f40311i = f10;
        this.f40308f = new b(f10);
        k0 k0Var = this.f40303a;
        if (k0Var != null) {
            k0Var.b(kVar, dVar);
        }
    }

    @Override // z8.m
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f40313k = j10;
        }
    }
}
