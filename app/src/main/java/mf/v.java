package mf;

import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
/* loaded from: classes3.dex */
public final class v implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f34492a;

    /* renamed from: b  reason: collision with root package name */
    private final f0 f34493b;

    public v(OutputStream outputStream, f0 f0Var) {
        qe.k.f(outputStream, "out");
        qe.k.f(f0Var, "timeout");
        this.f34492a = outputStream;
        this.f34493b = f0Var;
    }

    @Override // mf.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f34492a.close();
    }

    @Override // mf.c0, java.io.Flushable
    public void flush() {
        this.f34492a.flush();
    }

    @Override // mf.c0
    public f0 k() {
        return this.f34493b;
    }

    @Override // mf.c0
    public void n0(f fVar, long j10) {
        qe.k.f(fVar, "source");
        c.b(fVar.C0(), 0L, j10);
        while (j10 > 0) {
            this.f34493b.f();
            z zVar = fVar.f34446a;
            qe.k.c(zVar);
            int min = (int) Math.min(j10, zVar.f34510c - zVar.f34509b);
            this.f34492a.write(zVar.f34508a, zVar.f34509b, min);
            zVar.f34509b += min;
            long j11 = min;
            j10 -= j11;
            fVar.z0(fVar.C0() - j11);
            if (zVar.f34509b == zVar.f34510c) {
                fVar.f34446a = zVar.b();
                a0.b(zVar);
            }
        }
    }

    public String toString() {
        return "sink(" + this.f34492a + ')';
    }
}
