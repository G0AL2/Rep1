package mf;

import java.io.IOException;

/* compiled from: ForwardingSink.kt */
/* loaded from: classes3.dex */
public abstract class k implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final c0 f34469a;

    public k(c0 c0Var) {
        qe.k.f(c0Var, "delegate");
        this.f34469a = c0Var;
    }

    @Override // mf.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f34469a.close();
    }

    @Override // mf.c0, java.io.Flushable
    public void flush() throws IOException {
        this.f34469a.flush();
    }

    @Override // mf.c0
    public f0 k() {
        return this.f34469a.k();
    }

    @Override // mf.c0
    public void n0(f fVar, long j10) throws IOException {
        qe.k.f(fVar, "source");
        this.f34469a.n0(fVar, j10);
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f34469a + ')';
    }
}
