package i9;

import com.ironsource.mediationsdk.logger.IronSourceError;
import da.d0;
import da.e0;
import da.l;
import i9.b0;
import i9.r;
import j8.b3;
import j8.p1;
import j8.q1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SingleSampleMediaPeriod.java */
/* loaded from: classes2.dex */
public final class s0 implements r, e0.b<c> {

    /* renamed from: a  reason: collision with root package name */
    private final da.p f31798a;

    /* renamed from: b  reason: collision with root package name */
    private final l.a f31799b;

    /* renamed from: c  reason: collision with root package name */
    private final da.m0 f31800c;

    /* renamed from: d  reason: collision with root package name */
    private final da.d0 f31801d;

    /* renamed from: e  reason: collision with root package name */
    private final b0.a f31802e;

    /* renamed from: f  reason: collision with root package name */
    private final y0 f31803f;

    /* renamed from: h  reason: collision with root package name */
    private final long f31805h;

    /* renamed from: j  reason: collision with root package name */
    final p1 f31807j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f31808k;

    /* renamed from: l  reason: collision with root package name */
    boolean f31809l;

    /* renamed from: m  reason: collision with root package name */
    byte[] f31810m;

    /* renamed from: n  reason: collision with root package name */
    int f31811n;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<b> f31804g = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    final da.e0 f31806i = new da.e0("SingleSampleMediaPeriod");

    /* compiled from: SingleSampleMediaPeriod.java */
    /* loaded from: classes2.dex */
    private final class b implements o0 {

        /* renamed from: a  reason: collision with root package name */
        private int f31812a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f31813b;

        private b() {
        }

        private void b() {
            if (this.f31813b) {
                return;
            }
            s0.this.f31802e.i(ea.v.l(s0.this.f31807j.f32709l), s0.this.f31807j, 0, null, 0L);
            this.f31813b = true;
        }

        @Override // i9.o0
        public void a() throws IOException {
            s0 s0Var = s0.this;
            if (s0Var.f31808k) {
                return;
            }
            s0Var.f31806i.a();
        }

        public void c() {
            if (this.f31812a == 2) {
                this.f31812a = 1;
            }
        }

        @Override // i9.o0
        public int f(q1 q1Var, m8.g gVar, int i10) {
            b();
            s0 s0Var = s0.this;
            boolean z10 = s0Var.f31809l;
            if (z10 && s0Var.f31810m == null) {
                this.f31812a = 2;
            }
            int i11 = this.f31812a;
            if (i11 == 2) {
                gVar.d(4);
                return -4;
            } else if ((i10 & 2) != 0 || i11 == 0) {
                q1Var.f32770b = s0Var.f31807j;
                this.f31812a = 1;
                return -5;
            } else if (z10) {
                ea.a.e(s0Var.f31810m);
                gVar.d(1);
                gVar.f34292e = 0L;
                if ((i10 & 4) == 0) {
                    gVar.p(s0.this.f31811n);
                    ByteBuffer byteBuffer = gVar.f34290c;
                    s0 s0Var2 = s0.this;
                    byteBuffer.put(s0Var2.f31810m, 0, s0Var2.f31811n);
                }
                if ((i10 & 1) == 0) {
                    this.f31812a = 2;
                }
                return -4;
            } else {
                return -3;
            }
        }

        @Override // i9.o0
        public boolean isReady() {
            return s0.this.f31809l;
        }

        @Override // i9.o0
        public int n(long j10) {
            b();
            if (j10 <= 0 || this.f31812a == 2) {
                return 0;
            }
            this.f31812a = 2;
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleSampleMediaPeriod.java */
    /* loaded from: classes2.dex */
    public static final class c implements e0.e {

        /* renamed from: a  reason: collision with root package name */
        public final long f31815a = n.a();

        /* renamed from: b  reason: collision with root package name */
        public final da.p f31816b;

        /* renamed from: c  reason: collision with root package name */
        private final da.l0 f31817c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f31818d;

        public c(da.p pVar, da.l lVar) {
            this.f31816b = pVar;
            this.f31817c = new da.l0(lVar);
        }

        @Override // da.e0.e
        public void b() {
        }

        @Override // da.e0.e
        public void load() throws IOException {
            this.f31817c.t();
            try {
                this.f31817c.g(this.f31816b);
                int i10 = 0;
                while (i10 != -1) {
                    int q10 = (int) this.f31817c.q();
                    byte[] bArr = this.f31818d;
                    if (bArr == null) {
                        this.f31818d = new byte[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];
                    } else if (q10 == bArr.length) {
                        this.f31818d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    da.l0 l0Var = this.f31817c;
                    byte[] bArr2 = this.f31818d;
                    i10 = l0Var.c(bArr2, q10, bArr2.length - q10);
                }
            } finally {
                da.o.a(this.f31817c);
            }
        }
    }

    public s0(da.p pVar, l.a aVar, da.m0 m0Var, p1 p1Var, long j10, da.d0 d0Var, b0.a aVar2, boolean z10) {
        this.f31798a = pVar;
        this.f31799b = aVar;
        this.f31800c = m0Var;
        this.f31807j = p1Var;
        this.f31805h = j10;
        this.f31801d = d0Var;
        this.f31802e = aVar2;
        this.f31808k = z10;
        this.f31803f = new y0(new w0(p1Var));
    }

    @Override // i9.r, i9.p0
    public long b() {
        return (this.f31809l || this.f31806i.j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // i9.r, i9.p0
    public boolean c() {
        return this.f31806i.j();
    }

    @Override // i9.r, i9.p0
    public boolean d(long j10) {
        if (this.f31809l || this.f31806i.j() || this.f31806i.i()) {
            return false;
        }
        da.l a10 = this.f31799b.a();
        da.m0 m0Var = this.f31800c;
        if (m0Var != null) {
            a10.l(m0Var);
        }
        c cVar = new c(this.f31798a, a10);
        this.f31802e.A(new n(cVar.f31815a, this.f31798a, this.f31806i.n(cVar, this, this.f31801d.c(1))), 1, -1, this.f31807j, 0, null, 0L, this.f31805h);
        return true;
    }

    @Override // i9.r
    public long e(long j10, b3 b3Var) {
        return j10;
    }

    @Override // da.e0.b
    /* renamed from: f */
    public void j(c cVar, long j10, long j11, boolean z10) {
        da.l0 l0Var = cVar.f31817c;
        n nVar = new n(cVar.f31815a, cVar.f31816b, l0Var.r(), l0Var.s(), j10, j11, l0Var.q());
        this.f31801d.d(cVar.f31815a);
        this.f31802e.r(nVar, 1, -1, null, 0, null, 0L, this.f31805h);
    }

    @Override // i9.r, i9.p0
    public long g() {
        return this.f31809l ? Long.MIN_VALUE : 0L;
    }

    @Override // i9.r, i9.p0
    public void h(long j10) {
    }

    @Override // i9.r
    public void i(r.a aVar, long j10) {
        aVar.f(this);
    }

    @Override // i9.r
    public long k(long j10) {
        for (int i10 = 0; i10 < this.f31804g.size(); i10++) {
            this.f31804g.get(i10).c();
        }
        return j10;
    }

    @Override // i9.r
    public long l() {
        return -9223372036854775807L;
    }

    @Override // da.e0.b
    /* renamed from: n */
    public void m(c cVar, long j10, long j11) {
        this.f31811n = (int) cVar.f31817c.q();
        this.f31810m = (byte[]) ea.a.e(cVar.f31818d);
        this.f31809l = true;
        da.l0 l0Var = cVar.f31817c;
        n nVar = new n(cVar.f31815a, cVar.f31816b, l0Var.r(), l0Var.s(), j10, j11, this.f31811n);
        this.f31801d.d(cVar.f31815a);
        this.f31802e.u(nVar, 1, -1, this.f31807j, 0, null, 0L, this.f31805h);
    }

    @Override // da.e0.b
    /* renamed from: o */
    public e0.c s(c cVar, long j10, long j11, IOException iOException, int i10) {
        e0.c cVar2;
        da.l0 l0Var = cVar.f31817c;
        n nVar = new n(cVar.f31815a, cVar.f31816b, l0Var.r(), l0Var.s(), j10, j11, l0Var.q());
        long b10 = this.f31801d.b(new d0.c(nVar, new q(1, -1, this.f31807j, 0, null, 0L, ea.n0.Z0(this.f31805h)), iOException, i10));
        int i11 = (b10 > (-9223372036854775807L) ? 1 : (b10 == (-9223372036854775807L) ? 0 : -1));
        boolean z10 = i11 == 0 || i10 >= this.f31801d.c(1);
        if (this.f31808k && z10) {
            ea.r.i("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f31809l = true;
            cVar2 = da.e0.f29144e;
        } else if (i11 != 0) {
            cVar2 = da.e0.h(false, b10);
        } else {
            cVar2 = da.e0.f29145f;
        }
        e0.c cVar3 = cVar2;
        boolean z11 = !cVar3.c();
        this.f31802e.w(nVar, 1, -1, this.f31807j, 0, null, 0L, this.f31805h, iOException, z11);
        if (z11) {
            this.f31801d.d(cVar.f31815a);
        }
        return cVar3;
    }

    @Override // i9.r
    public long p(ba.q[] qVarArr, boolean[] zArr, o0[] o0VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            if (o0VarArr[i10] != null && (qVarArr[i10] == null || !zArr[i10])) {
                this.f31804g.remove(o0VarArr[i10]);
                o0VarArr[i10] = null;
            }
            if (o0VarArr[i10] == null && qVarArr[i10] != null) {
                b bVar = new b();
                this.f31804g.add(bVar);
                o0VarArr[i10] = bVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // i9.r
    public void q() {
    }

    public void r() {
        this.f31806i.l();
    }

    @Override // i9.r
    public y0 t() {
        return this.f31803f;
    }

    @Override // i9.r
    public void u(long j10, boolean z10) {
    }
}
