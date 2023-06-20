package gb;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class t<ResultT> extends e<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f30808a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final o<ResultT> f30809b = new o<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f30810c;

    /* renamed from: d  reason: collision with root package name */
    private ResultT f30811d;

    /* renamed from: e  reason: collision with root package name */
    private Exception f30812e;

    private final void h() {
        cb.q.c(this.f30810c, "Task is not yet complete");
    }

    private final void k() {
        cb.q.c(!this.f30810c, "Task is already complete");
    }

    private final void n() {
        synchronized (this.f30808a) {
            if (this.f30810c) {
                this.f30809b.a(this);
            }
        }
    }

    @Override // gb.e
    public final e<ResultT> a(a<ResultT> aVar) {
        this.f30809b.b(new i(f.f30786a, aVar));
        n();
        return this;
    }

    @Override // gb.e
    public final e<ResultT> b(Executor executor, b bVar) {
        this.f30809b.b(new k(executor, bVar));
        n();
        return this;
    }

    @Override // gb.e
    public final e<ResultT> c(Executor executor, c<? super ResultT> cVar) {
        this.f30809b.b(new m(executor, cVar));
        n();
        return this;
    }

    @Override // gb.e
    public final Exception d() {
        Exception exc;
        synchronized (this.f30808a) {
            exc = this.f30812e;
        }
        return exc;
    }

    @Override // gb.e
    public final ResultT e() {
        ResultT resultt;
        synchronized (this.f30808a) {
            h();
            Exception exc = this.f30812e;
            if (exc != null) {
                throw new d(exc);
            }
            resultt = this.f30811d;
        }
        return resultt;
    }

    @Override // gb.e
    public final boolean f() {
        boolean z10;
        synchronized (this.f30808a) {
            z10 = this.f30810c;
        }
        return z10;
    }

    @Override // gb.e
    public final boolean g() {
        boolean z10;
        synchronized (this.f30808a) {
            z10 = false;
            if (this.f30810c && this.f30812e == null) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void i(Exception exc) {
        synchronized (this.f30808a) {
            k();
            this.f30810c = true;
            this.f30812e = exc;
        }
        this.f30809b.a(this);
    }

    public final void j(ResultT resultt) {
        synchronized (this.f30808a) {
            k();
            this.f30810c = true;
            this.f30811d = resultt;
        }
        this.f30809b.a(this);
    }

    public final boolean l(Exception exc) {
        synchronized (this.f30808a) {
            if (this.f30810c) {
                return false;
            }
            this.f30810c = true;
            this.f30812e = exc;
            this.f30809b.a(this);
            return true;
        }
    }

    public final boolean m(ResultT resultt) {
        synchronized (this.f30808a) {
            if (this.f30810c) {
                return false;
            }
            this.f30810c = true;
            this.f30811d = resultt;
            this.f30809b.a(this);
            return true;
        }
    }
}
