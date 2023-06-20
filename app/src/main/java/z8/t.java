package z8;

import com.inmobi.media.fq;
import j8.p1;
import l8.e0;
import z8.i0;

/* compiled from: MpegAudioReader.java */
/* loaded from: classes2.dex */
public final class t implements m {

    /* renamed from: a  reason: collision with root package name */
    private final ea.a0 f40431a;

    /* renamed from: b  reason: collision with root package name */
    private final e0.a f40432b;

    /* renamed from: c  reason: collision with root package name */
    private final String f40433c;

    /* renamed from: d  reason: collision with root package name */
    private p8.a0 f40434d;

    /* renamed from: e  reason: collision with root package name */
    private String f40435e;

    /* renamed from: f  reason: collision with root package name */
    private int f40436f;

    /* renamed from: g  reason: collision with root package name */
    private int f40437g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f40438h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f40439i;

    /* renamed from: j  reason: collision with root package name */
    private long f40440j;

    /* renamed from: k  reason: collision with root package name */
    private int f40441k;

    /* renamed from: l  reason: collision with root package name */
    private long f40442l;

    public t() {
        this(null);
    }

    private void a(ea.a0 a0Var) {
        byte[] d10 = a0Var.d();
        int f10 = a0Var.f();
        for (int e10 = a0Var.e(); e10 < f10; e10++) {
            boolean z10 = (d10[e10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) == 255;
            boolean z11 = this.f40439i && (d10[e10] & 224) == 224;
            this.f40439i = z10;
            if (z11) {
                a0Var.P(e10 + 1);
                this.f40439i = false;
                this.f40431a.d()[1] = d10[e10];
                this.f40437g = 2;
                this.f40436f = 1;
                return;
            }
        }
        a0Var.P(f10);
    }

    private void g(ea.a0 a0Var) {
        int min = Math.min(a0Var.a(), this.f40441k - this.f40437g);
        this.f40434d.a(a0Var, min);
        int i10 = this.f40437g + min;
        this.f40437g = i10;
        int i11 = this.f40441k;
        if (i10 < i11) {
            return;
        }
        long j10 = this.f40442l;
        if (j10 != -9223372036854775807L) {
            this.f40434d.e(j10, 1, i11, 0, null);
            this.f40442l += this.f40440j;
        }
        this.f40437g = 0;
        this.f40436f = 0;
    }

    private void h(ea.a0 a0Var) {
        int min = Math.min(a0Var.a(), 4 - this.f40437g);
        a0Var.j(this.f40431a.d(), this.f40437g, min);
        int i10 = this.f40437g + min;
        this.f40437g = i10;
        if (i10 < 4) {
            return;
        }
        this.f40431a.P(0);
        if (!this.f40432b.a(this.f40431a.n())) {
            this.f40437g = 0;
            this.f40436f = 1;
            return;
        }
        e0.a aVar = this.f40432b;
        this.f40441k = aVar.f33806c;
        if (!this.f40438h) {
            this.f40440j = (aVar.f33810g * 1000000) / aVar.f33807d;
            this.f40434d.d(new p1.b().S(this.f40435e).e0(this.f40432b.f33805b).W(4096).H(this.f40432b.f33808e).f0(this.f40432b.f33807d).V(this.f40433c).E());
            this.f40438h = true;
        }
        this.f40431a.P(0);
        this.f40434d.a(this.f40431a, 4);
        this.f40436f = 2;
    }

    @Override // z8.m
    public void b() {
        this.f40436f = 0;
        this.f40437g = 0;
        this.f40439i = false;
        this.f40442l = -9223372036854775807L;
    }

    @Override // z8.m
    public void c(ea.a0 a0Var) {
        ea.a.h(this.f40434d);
        while (a0Var.a() > 0) {
            int i10 = this.f40436f;
            if (i10 == 0) {
                a(a0Var);
            } else if (i10 == 1) {
                h(a0Var);
            } else if (i10 == 2) {
                g(a0Var);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // z8.m
    public void d() {
    }

    @Override // z8.m
    public void e(p8.k kVar, i0.d dVar) {
        dVar.a();
        this.f40435e = dVar.b();
        this.f40434d = kVar.f(dVar.c(), 1);
    }

    @Override // z8.m
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f40442l = j10;
        }
    }

    public t(String str) {
        this.f40436f = 0;
        ea.a0 a0Var = new ea.a0(4);
        this.f40431a = a0Var;
        a0Var.d()[0] = -1;
        this.f40432b = new e0.a();
        this.f40442l = -9223372036854775807L;
        this.f40433c = str;
    }
}
