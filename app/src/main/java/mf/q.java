package mf;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
/* loaded from: classes3.dex */
public final class q implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f34486a;

    /* renamed from: b  reason: collision with root package name */
    private final f0 f34487b;

    public q(InputStream inputStream, f0 f0Var) {
        qe.k.f(inputStream, "input");
        qe.k.f(f0Var, "timeout");
        this.f34486a = inputStream;
        this.f34487b = f0Var;
    }

    @Override // mf.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f34486a.close();
    }

    @Override // mf.e0
    public long e0(f fVar, long j10) {
        qe.k.f(fVar, "sink");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0) {
            return 0L;
        }
        if (i10 >= 0) {
            try {
                this.f34487b.f();
                z K0 = fVar.K0(1);
                int read = this.f34486a.read(K0.f34508a, K0.f34510c, (int) Math.min(j10, 8192 - K0.f34510c));
                if (read == -1) {
                    if (K0.f34509b == K0.f34510c) {
                        fVar.f34446a = K0.b();
                        a0.b(K0);
                        return -1L;
                    }
                    return -1L;
                }
                K0.f34510c += read;
                long j11 = read;
                fVar.z0(fVar.C0() + j11);
                return j11;
            } catch (AssertionError e10) {
                if (r.e(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
    }

    @Override // mf.e0
    public f0 k() {
        return this.f34487b;
    }

    public String toString() {
        return "source(" + this.f34486a + ')';
    }
}
