package j8;

/* compiled from: DefaultMediaClock.java */
/* loaded from: classes2.dex */
final class k implements ea.t {

    /* renamed from: a  reason: collision with root package name */
    private final ea.f0 f32536a;

    /* renamed from: b  reason: collision with root package name */
    private final a f32537b;

    /* renamed from: c  reason: collision with root package name */
    private w2 f32538c;

    /* renamed from: d  reason: collision with root package name */
    private ea.t f32539d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f32540e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f32541f;

    /* compiled from: DefaultMediaClock.java */
    /* loaded from: classes2.dex */
    public interface a {
        void d(o2 o2Var);
    }

    public k(a aVar, ea.c cVar) {
        this.f32537b = aVar;
        this.f32536a = new ea.f0(cVar);
    }

    private boolean f(boolean z10) {
        w2 w2Var = this.f32538c;
        return w2Var == null || w2Var.d() || (!this.f32538c.isReady() && (z10 || this.f32538c.g()));
    }

    private void j(boolean z10) {
        if (f(z10)) {
            this.f32540e = true;
            if (this.f32541f) {
                this.f32536a.d();
                return;
            }
            return;
        }
        ea.t tVar = (ea.t) ea.a.e(this.f32539d);
        long o10 = tVar.o();
        if (this.f32540e) {
            if (o10 < this.f32536a.o()) {
                this.f32536a.e();
                return;
            }
            this.f32540e = false;
            if (this.f32541f) {
                this.f32536a.d();
            }
        }
        this.f32536a.a(o10);
        o2 c10 = tVar.c();
        if (c10.equals(this.f32536a.c())) {
            return;
        }
        this.f32536a.b(c10);
        this.f32537b.d(c10);
    }

    public void a(w2 w2Var) {
        if (w2Var == this.f32538c) {
            this.f32539d = null;
            this.f32538c = null;
            this.f32540e = true;
        }
    }

    @Override // ea.t
    public void b(o2 o2Var) {
        ea.t tVar = this.f32539d;
        if (tVar != null) {
            tVar.b(o2Var);
            o2Var = this.f32539d.c();
        }
        this.f32536a.b(o2Var);
    }

    @Override // ea.t
    public o2 c() {
        ea.t tVar = this.f32539d;
        if (tVar != null) {
            return tVar.c();
        }
        return this.f32536a.c();
    }

    public void d(w2 w2Var) throws n {
        ea.t tVar;
        ea.t v10 = w2Var.v();
        if (v10 == null || v10 == (tVar = this.f32539d)) {
            return;
        }
        if (tVar == null) {
            this.f32539d = v10;
            this.f32538c = w2Var;
            v10.b(this.f32536a.c());
            return;
        }
        throw n.e(new IllegalStateException("Multiple renderer media clocks enabled."));
    }

    public void e(long j10) {
        this.f32536a.a(j10);
    }

    public void g() {
        this.f32541f = true;
        this.f32536a.d();
    }

    public void h() {
        this.f32541f = false;
        this.f32536a.e();
    }

    public long i(boolean z10) {
        j(z10);
        return o();
    }

    @Override // ea.t
    public long o() {
        if (this.f32540e) {
            return this.f32536a.o();
        }
        return ((ea.t) ea.a.e(this.f32539d)).o();
    }
}
