package j8;

import java.io.IOException;

/* compiled from: BaseRenderer.java */
/* loaded from: classes2.dex */
public abstract class f implements w2, y2 {

    /* renamed from: a  reason: collision with root package name */
    private final int f32386a;

    /* renamed from: c  reason: collision with root package name */
    private z2 f32388c;

    /* renamed from: d  reason: collision with root package name */
    private int f32389d;

    /* renamed from: e  reason: collision with root package name */
    private k8.o1 f32390e;

    /* renamed from: f  reason: collision with root package name */
    private int f32391f;

    /* renamed from: g  reason: collision with root package name */
    private i9.o0 f32392g;

    /* renamed from: h  reason: collision with root package name */
    private p1[] f32393h;

    /* renamed from: i  reason: collision with root package name */
    private long f32394i;

    /* renamed from: k  reason: collision with root package name */
    private boolean f32396k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f32397l;

    /* renamed from: b  reason: collision with root package name */
    private final q1 f32387b = new q1();

    /* renamed from: j  reason: collision with root package name */
    private long f32395j = Long.MIN_VALUE;

    public f(int i10) {
        this.f32386a = i10;
    }

    private void M(long j10, boolean z10) throws n {
        this.f32396k = false;
        this.f32395j = j10;
        G(j10, z10);
    }

    protected final int A() {
        return this.f32389d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final k8.o1 B() {
        return (k8.o1) ea.a.e(this.f32390e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final p1[] C() {
        return (p1[]) ea.a.e(this.f32393h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean D() {
        return g() ? this.f32396k : ((i9.o0) ea.a.e(this.f32392g)).isReady();
    }

    protected abstract void E();

    protected void F(boolean z10, boolean z11) throws n {
    }

    protected abstract void G(long j10, boolean z10) throws n;

    protected void H() {
    }

    protected void I() throws n {
    }

    protected void J() {
    }

    protected abstract void K(p1[] p1VarArr, long j10, long j11) throws n;

    /* JADX INFO: Access modifiers changed from: protected */
    public final int L(q1 q1Var, m8.g gVar, int i10) {
        int f10 = ((i9.o0) ea.a.e(this.f32392g)).f(q1Var, gVar, i10);
        if (f10 == -4) {
            if (gVar.l()) {
                this.f32395j = Long.MIN_VALUE;
                return this.f32396k ? -4 : -3;
            }
            long j10 = gVar.f34292e + this.f32394i;
            gVar.f34292e = j10;
            this.f32395j = Math.max(this.f32395j, j10);
        } else if (f10 == -5) {
            p1 p1Var = (p1) ea.a.e(q1Var.f32770b);
            if (p1Var.f32713p != Long.MAX_VALUE) {
                q1Var.f32770b = p1Var.b().i0(p1Var.f32713p + this.f32394i).E();
            }
        }
        return f10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int N(long j10) {
        return ((i9.o0) ea.a.e(this.f32392g)).n(j10 - this.f32394i);
    }

    @Override // j8.w2
    public final void disable() {
        ea.a.f(this.f32391f == 1);
        this.f32387b.a();
        this.f32391f = 0;
        this.f32392g = null;
        this.f32393h = null;
        this.f32396k = false;
        E();
    }

    @Override // j8.w2, j8.y2
    public final int e() {
        return this.f32386a;
    }

    @Override // j8.w2
    public final i9.o0 f() {
        return this.f32392g;
    }

    @Override // j8.w2
    public final boolean g() {
        return this.f32395j == Long.MIN_VALUE;
    }

    @Override // j8.w2
    public final int getState() {
        return this.f32391f;
    }

    @Override // j8.w2
    public final void h() {
        this.f32396k = true;
    }

    @Override // j8.w2
    public final void i(int i10, k8.o1 o1Var) {
        this.f32389d = i10;
        this.f32390e = o1Var;
    }

    @Override // j8.w2
    public final void j(p1[] p1VarArr, i9.o0 o0Var, long j10, long j11) throws n {
        ea.a.f(!this.f32396k);
        this.f32392g = o0Var;
        if (this.f32395j == Long.MIN_VALUE) {
            this.f32395j = j10;
        }
        this.f32393h = p1VarArr;
        this.f32394i = j11;
        K(p1VarArr, j10, j11);
    }

    @Override // j8.r2.b
    public void k(int i10, Object obj) throws n {
    }

    @Override // j8.w2
    public final void l() throws IOException {
        ((i9.o0) ea.a.e(this.f32392g)).a();
    }

    @Override // j8.w2
    public final boolean m() {
        return this.f32396k;
    }

    @Override // j8.w2
    public final y2 n() {
        return this;
    }

    @Override // j8.w2
    public /* synthetic */ void p(float f10, float f11) {
        v2.a(this, f10, f11);
    }

    public int q() throws n {
        return 0;
    }

    @Override // j8.w2
    public final void reset() {
        ea.a.f(this.f32391f == 0);
        this.f32387b.a();
        H();
    }

    @Override // j8.w2
    public final void s(z2 z2Var, p1[] p1VarArr, i9.o0 o0Var, long j10, boolean z10, boolean z11, long j11, long j12) throws n {
        ea.a.f(this.f32391f == 0);
        this.f32388c = z2Var;
        this.f32391f = 1;
        F(z10, z11);
        j(p1VarArr, o0Var, j11, j12);
        M(j10, z10);
    }

    @Override // j8.w2
    public final void start() throws n {
        ea.a.f(this.f32391f == 1);
        this.f32391f = 2;
        I();
    }

    @Override // j8.w2
    public final void stop() {
        ea.a.f(this.f32391f == 2);
        this.f32391f = 1;
        J();
    }

    @Override // j8.w2
    public final long t() {
        return this.f32395j;
    }

    @Override // j8.w2
    public final void u(long j10) throws n {
        M(j10, false);
    }

    @Override // j8.w2
    public ea.t v() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final n w(Throwable th, p1 p1Var, int i10) {
        return x(th, p1Var, false, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final n x(Throwable th, p1 p1Var, boolean z10, int i10) {
        int i11;
        if (p1Var != null && !this.f32397l) {
            this.f32397l = true;
            try {
                int f10 = x2.f(a(p1Var));
                this.f32397l = false;
                i11 = f10;
            } catch (n unused) {
                this.f32397l = false;
            } catch (Throwable th2) {
                this.f32397l = false;
                throw th2;
            }
            return n.c(th, getName(), A(), p1Var, i11, z10, i10);
        }
        i11 = 4;
        return n.c(th, getName(), A(), p1Var, i11, z10, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final z2 y() {
        return (z2) ea.a.e(this.f32388c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final q1 z() {
        this.f32387b.a();
        return this.f32387b;
    }
}
