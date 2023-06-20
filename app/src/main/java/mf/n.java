package mf;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* compiled from: GzipSink.kt */
/* loaded from: classes3.dex */
public final class n implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final x f34472a;

    /* renamed from: b  reason: collision with root package name */
    private final Deflater f34473b;

    /* renamed from: c  reason: collision with root package name */
    private final j f34474c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f34475d;

    /* renamed from: e  reason: collision with root package name */
    private final CRC32 f34476e;

    public n(c0 c0Var) {
        qe.k.f(c0Var, "sink");
        x xVar = new x(c0Var);
        this.f34472a = xVar;
        Deflater deflater = new Deflater(-1, true);
        this.f34473b = deflater;
        this.f34474c = new j((g) xVar, deflater);
        this.f34476e = new CRC32();
        f fVar = xVar.f34500a;
        fVar.writeShort(8075);
        fVar.writeByte(8);
        fVar.writeByte(0);
        fVar.writeInt(0);
        fVar.writeByte(0);
        fVar.writeByte(0);
    }

    private final void a(f fVar, long j10) {
        z zVar = fVar.f34446a;
        qe.k.c(zVar);
        while (j10 > 0) {
            int min = (int) Math.min(j10, zVar.f34510c - zVar.f34509b);
            this.f34476e.update(zVar.f34508a, zVar.f34509b, min);
            j10 -= min;
            zVar = zVar.f34513f;
            qe.k.c(zVar);
        }
    }

    private final void b() {
        this.f34472a.a((int) this.f34476e.getValue());
        this.f34472a.a((int) this.f34473b.getBytesRead());
    }

    @Override // mf.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f34475d) {
            return;
        }
        Throwable th = null;
        try {
            this.f34474c.b();
            b();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f34473b.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f34472a.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f34475d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // mf.c0, java.io.Flushable
    public void flush() throws IOException {
        this.f34474c.flush();
    }

    @Override // mf.c0
    public f0 k() {
        return this.f34472a.k();
    }

    @Override // mf.c0
    public void n0(f fVar, long j10) throws IOException {
        qe.k.f(fVar, "source");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (i10 == 0) {
        } else {
            a(fVar, j10);
            this.f34474c.n0(fVar, j10);
        }
    }
}
