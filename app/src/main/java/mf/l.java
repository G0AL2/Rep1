package mf;

import java.io.IOException;

/* compiled from: ForwardingSource.kt */
/* loaded from: classes3.dex */
public abstract class l implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final e0 f34470a;

    public l(e0 e0Var) {
        qe.k.f(e0Var, "delegate");
        this.f34470a = e0Var;
    }

    public final e0 a() {
        return this.f34470a;
    }

    @Override // mf.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f34470a.close();
    }

    @Override // mf.e0
    public long e0(f fVar, long j10) throws IOException {
        qe.k.f(fVar, "sink");
        return this.f34470a.e0(fVar, j10);
    }

    @Override // mf.e0
    public f0 k() {
        return this.f34470a.k();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f34470a + ')';
    }
}
