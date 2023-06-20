package z8;

import android.util.SparseArray;
import ea.n0;
import ea.w;
import j8.p1;
import java.util.ArrayList;
import java.util.Arrays;
import z8.i0;

/* compiled from: H264Reader.java */
/* loaded from: classes2.dex */
public final class p implements m {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f40328a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f40329b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f40330c;

    /* renamed from: g  reason: collision with root package name */
    private long f40334g;

    /* renamed from: i  reason: collision with root package name */
    private String f40336i;

    /* renamed from: j  reason: collision with root package name */
    private p8.a0 f40337j;

    /* renamed from: k  reason: collision with root package name */
    private b f40338k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f40339l;

    /* renamed from: n  reason: collision with root package name */
    private boolean f40341n;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f40335h = new boolean[3];

    /* renamed from: d  reason: collision with root package name */
    private final u f40331d = new u(7, 128);

    /* renamed from: e  reason: collision with root package name */
    private final u f40332e = new u(8, 128);

    /* renamed from: f  reason: collision with root package name */
    private final u f40333f = new u(6, 128);

    /* renamed from: m  reason: collision with root package name */
    private long f40340m = -9223372036854775807L;

    /* renamed from: o  reason: collision with root package name */
    private final ea.a0 f40342o = new ea.a0();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: H264Reader.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final p8.a0 f40343a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f40344b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f40345c;

        /* renamed from: f  reason: collision with root package name */
        private final ea.b0 f40348f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f40349g;

        /* renamed from: h  reason: collision with root package name */
        private int f40350h;

        /* renamed from: i  reason: collision with root package name */
        private int f40351i;

        /* renamed from: j  reason: collision with root package name */
        private long f40352j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f40353k;

        /* renamed from: l  reason: collision with root package name */
        private long f40354l;

        /* renamed from: o  reason: collision with root package name */
        private boolean f40357o;

        /* renamed from: p  reason: collision with root package name */
        private long f40358p;

        /* renamed from: q  reason: collision with root package name */
        private long f40359q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f40360r;

        /* renamed from: d  reason: collision with root package name */
        private final SparseArray<w.c> f40346d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        private final SparseArray<w.b> f40347e = new SparseArray<>();

        /* renamed from: m  reason: collision with root package name */
        private a f40355m = new a();

        /* renamed from: n  reason: collision with root package name */
        private a f40356n = new a();

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: H264Reader.java */
        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f40361a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f40362b;

            /* renamed from: c  reason: collision with root package name */
            private w.c f40363c;

            /* renamed from: d  reason: collision with root package name */
            private int f40364d;

            /* renamed from: e  reason: collision with root package name */
            private int f40365e;

            /* renamed from: f  reason: collision with root package name */
            private int f40366f;

            /* renamed from: g  reason: collision with root package name */
            private int f40367g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f40368h;

            /* renamed from: i  reason: collision with root package name */
            private boolean f40369i;

            /* renamed from: j  reason: collision with root package name */
            private boolean f40370j;

            /* renamed from: k  reason: collision with root package name */
            private boolean f40371k;

            /* renamed from: l  reason: collision with root package name */
            private int f40372l;

            /* renamed from: m  reason: collision with root package name */
            private int f40373m;

            /* renamed from: n  reason: collision with root package name */
            private int f40374n;

            /* renamed from: o  reason: collision with root package name */
            private int f40375o;

            /* renamed from: p  reason: collision with root package name */
            private int f40376p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (this.f40361a) {
                    if (aVar.f40361a) {
                        w.c cVar = (w.c) ea.a.h(this.f40363c);
                        w.c cVar2 = (w.c) ea.a.h(aVar.f40363c);
                        return (this.f40366f == aVar.f40366f && this.f40367g == aVar.f40367g && this.f40368h == aVar.f40368h && (!this.f40369i || !aVar.f40369i || this.f40370j == aVar.f40370j) && (((i10 = this.f40364d) == (i11 = aVar.f40364d) || (i10 != 0 && i11 != 0)) && (((i12 = cVar.f29775k) != 0 || cVar2.f29775k != 0 || (this.f40373m == aVar.f40373m && this.f40374n == aVar.f40374n)) && ((i12 != 1 || cVar2.f29775k != 1 || (this.f40375o == aVar.f40375o && this.f40376p == aVar.f40376p)) && (z10 = this.f40371k) == aVar.f40371k && (!z10 || this.f40372l == aVar.f40372l))))) ? false : true;
                    }
                    return true;
                }
                return false;
            }

            public void b() {
                this.f40362b = false;
                this.f40361a = false;
            }

            public boolean d() {
                int i10;
                return this.f40362b && ((i10 = this.f40365e) == 7 || i10 == 2);
            }

            public void e(w.c cVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f40363c = cVar;
                this.f40364d = i10;
                this.f40365e = i11;
                this.f40366f = i12;
                this.f40367g = i13;
                this.f40368h = z10;
                this.f40369i = z11;
                this.f40370j = z12;
                this.f40371k = z13;
                this.f40372l = i14;
                this.f40373m = i15;
                this.f40374n = i16;
                this.f40375o = i17;
                this.f40376p = i18;
                this.f40361a = true;
                this.f40362b = true;
            }

            public void f(int i10) {
                this.f40365e = i10;
                this.f40362b = true;
            }
        }

        public b(p8.a0 a0Var, boolean z10, boolean z11) {
            this.f40343a = a0Var;
            this.f40344b = z10;
            this.f40345c = z11;
            byte[] bArr = new byte[128];
            this.f40349g = bArr;
            this.f40348f = new ea.b0(bArr, 0, 0);
            g();
        }

        private void d(int i10) {
            long j10 = this.f40359q;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.f40360r;
            this.f40343a.e(j10, z10 ? 1 : 0, (int) (this.f40352j - this.f40358p), i10, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 408
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: z8.p.b.a(byte[], int, int):void");
        }

        public boolean b(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f40351i == 9 || (this.f40345c && this.f40356n.c(this.f40355m))) {
                if (z10 && this.f40357o) {
                    d(i10 + ((int) (j10 - this.f40352j)));
                }
                this.f40358p = this.f40352j;
                this.f40359q = this.f40354l;
                this.f40360r = false;
                this.f40357o = true;
            }
            if (this.f40344b) {
                z11 = this.f40356n.d();
            }
            boolean z13 = this.f40360r;
            int i11 = this.f40351i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f40360r = z14;
            return z14;
        }

        public boolean c() {
            return this.f40345c;
        }

        public void e(w.b bVar) {
            this.f40347e.append(bVar.f29762a, bVar);
        }

        public void f(w.c cVar) {
            this.f40346d.append(cVar.f29768d, cVar);
        }

        public void g() {
            this.f40353k = false;
            this.f40357o = false;
            this.f40356n.b();
        }

        public void h(long j10, int i10, long j11) {
            this.f40351i = i10;
            this.f40354l = j11;
            this.f40352j = j10;
            if (!this.f40344b || i10 != 1) {
                if (!this.f40345c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f40355m;
            this.f40355m = this.f40356n;
            this.f40356n = aVar;
            aVar.b();
            this.f40350h = 0;
            this.f40353k = true;
        }
    }

    public p(d0 d0Var, boolean z10, boolean z11) {
        this.f40328a = d0Var;
        this.f40329b = z10;
        this.f40330c = z11;
    }

    private void a() {
        ea.a.h(this.f40337j);
        n0.j(this.f40338k);
    }

    private void g(long j10, int i10, int i11, long j11) {
        if (!this.f40339l || this.f40338k.c()) {
            this.f40331d.b(i11);
            this.f40332e.b(i11);
            if (!this.f40339l) {
                if (this.f40331d.c() && this.f40332e.c()) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = this.f40331d;
                    arrayList.add(Arrays.copyOf(uVar.f40446d, uVar.f40447e));
                    u uVar2 = this.f40332e;
                    arrayList.add(Arrays.copyOf(uVar2.f40446d, uVar2.f40447e));
                    u uVar3 = this.f40331d;
                    w.c l10 = ea.w.l(uVar3.f40446d, 3, uVar3.f40447e);
                    u uVar4 = this.f40332e;
                    w.b j12 = ea.w.j(uVar4.f40446d, 3, uVar4.f40447e);
                    this.f40337j.d(new p1.b().S(this.f40336i).e0("video/avc").I(ea.d.a(l10.f29765a, l10.f29766b, l10.f29767c)).j0(l10.f29769e).Q(l10.f29770f).a0(l10.f29771g).T(arrayList).E());
                    this.f40339l = true;
                    this.f40338k.f(l10);
                    this.f40338k.e(j12);
                    this.f40331d.d();
                    this.f40332e.d();
                }
            } else if (this.f40331d.c()) {
                u uVar5 = this.f40331d;
                this.f40338k.f(ea.w.l(uVar5.f40446d, 3, uVar5.f40447e));
                this.f40331d.d();
            } else if (this.f40332e.c()) {
                u uVar6 = this.f40332e;
                this.f40338k.e(ea.w.j(uVar6.f40446d, 3, uVar6.f40447e));
                this.f40332e.d();
            }
        }
        if (this.f40333f.b(i11)) {
            u uVar7 = this.f40333f;
            this.f40342o.N(this.f40333f.f40446d, ea.w.q(uVar7.f40446d, uVar7.f40447e));
            this.f40342o.P(4);
            this.f40328a.a(j11, this.f40342o);
        }
        if (this.f40338k.b(j10, i10, this.f40339l, this.f40341n)) {
            this.f40341n = false;
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        if (!this.f40339l || this.f40338k.c()) {
            this.f40331d.a(bArr, i10, i11);
            this.f40332e.a(bArr, i10, i11);
        }
        this.f40333f.a(bArr, i10, i11);
        this.f40338k.a(bArr, i10, i11);
    }

    private void i(long j10, int i10, long j11) {
        if (!this.f40339l || this.f40338k.c()) {
            this.f40331d.e(i10);
            this.f40332e.e(i10);
        }
        this.f40333f.e(i10);
        this.f40338k.h(j10, i10, j11);
    }

    @Override // z8.m
    public void b() {
        this.f40334g = 0L;
        this.f40341n = false;
        this.f40340m = -9223372036854775807L;
        ea.w.a(this.f40335h);
        this.f40331d.d();
        this.f40332e.d();
        this.f40333f.d();
        b bVar = this.f40338k;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // z8.m
    public void c(ea.a0 a0Var) {
        a();
        int e10 = a0Var.e();
        int f10 = a0Var.f();
        byte[] d10 = a0Var.d();
        this.f40334g += a0Var.a();
        this.f40337j.a(a0Var, a0Var.a());
        while (true) {
            int c10 = ea.w.c(d10, e10, f10, this.f40335h);
            if (c10 == f10) {
                h(d10, e10, f10);
                return;
            }
            int f11 = ea.w.f(d10, c10);
            int i10 = c10 - e10;
            if (i10 > 0) {
                h(d10, e10, c10);
            }
            int i11 = f10 - c10;
            long j10 = this.f40334g - i11;
            g(j10, i11, i10 < 0 ? -i10 : 0, this.f40340m);
            i(j10, f11, this.f40340m);
            e10 = c10 + 3;
        }
    }

    @Override // z8.m
    public void d() {
    }

    @Override // z8.m
    public void e(p8.k kVar, i0.d dVar) {
        dVar.a();
        this.f40336i = dVar.b();
        p8.a0 f10 = kVar.f(dVar.c(), 2);
        this.f40337j = f10;
        this.f40338k = new b(f10, this.f40329b, this.f40330c);
        this.f40328a.b(kVar, dVar);
    }

    @Override // z8.m
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f40340m = j10;
        }
        this.f40341n |= (i10 & 2) != 0;
    }
}
