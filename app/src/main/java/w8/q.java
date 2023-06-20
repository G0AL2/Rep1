package w8;

import ea.a0;
import java.io.IOException;

/* compiled from: TrackFragment.java */
/* loaded from: classes2.dex */
final class q {

    /* renamed from: a  reason: collision with root package name */
    public c f38462a;

    /* renamed from: b  reason: collision with root package name */
    public long f38463b;

    /* renamed from: c  reason: collision with root package name */
    public long f38464c;

    /* renamed from: d  reason: collision with root package name */
    public long f38465d;

    /* renamed from: e  reason: collision with root package name */
    public int f38466e;

    /* renamed from: f  reason: collision with root package name */
    public int f38467f;

    /* renamed from: l  reason: collision with root package name */
    public boolean f38473l;

    /* renamed from: n  reason: collision with root package name */
    public p f38475n;

    /* renamed from: p  reason: collision with root package name */
    public boolean f38477p;

    /* renamed from: q  reason: collision with root package name */
    public long f38478q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f38479r;

    /* renamed from: g  reason: collision with root package name */
    public long[] f38468g = new long[0];

    /* renamed from: h  reason: collision with root package name */
    public int[] f38469h = new int[0];

    /* renamed from: i  reason: collision with root package name */
    public int[] f38470i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    public long[] f38471j = new long[0];

    /* renamed from: k  reason: collision with root package name */
    public boolean[] f38472k = new boolean[0];

    /* renamed from: m  reason: collision with root package name */
    public boolean[] f38474m = new boolean[0];

    /* renamed from: o  reason: collision with root package name */
    public final a0 f38476o = new a0();

    public void a(a0 a0Var) {
        a0Var.j(this.f38476o.d(), 0, this.f38476o.f());
        this.f38476o.P(0);
        this.f38477p = false;
    }

    public void b(p8.j jVar) throws IOException {
        jVar.readFully(this.f38476o.d(), 0, this.f38476o.f());
        this.f38476o.P(0);
        this.f38477p = false;
    }

    public long c(int i10) {
        return this.f38471j[i10];
    }

    public void d(int i10) {
        this.f38476o.L(i10);
        this.f38473l = true;
        this.f38477p = true;
    }

    public void e(int i10, int i11) {
        this.f38466e = i10;
        this.f38467f = i11;
        if (this.f38469h.length < i10) {
            this.f38468g = new long[i10];
            this.f38469h = new int[i10];
        }
        if (this.f38470i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f38470i = new int[i12];
            this.f38471j = new long[i12];
            this.f38472k = new boolean[i12];
            this.f38474m = new boolean[i12];
        }
    }

    public void f() {
        this.f38466e = 0;
        this.f38478q = 0L;
        this.f38479r = false;
        this.f38473l = false;
        this.f38477p = false;
        this.f38475n = null;
    }

    public boolean g(int i10) {
        return this.f38473l && this.f38474m[i10];
    }
}
