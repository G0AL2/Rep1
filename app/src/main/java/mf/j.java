package mf;

import java.io.IOException;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: DeflaterSink.kt */
/* loaded from: classes3.dex */
public final class j implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f34466a;

    /* renamed from: b  reason: collision with root package name */
    private final g f34467b;

    /* renamed from: c  reason: collision with root package name */
    private final Deflater f34468c;

    public j(g gVar, Deflater deflater) {
        qe.k.f(gVar, "sink");
        qe.k.f(deflater, "deflater");
        this.f34467b = gVar;
        this.f34468c = deflater;
    }

    @IgnoreJRERequirement
    private final void a(boolean z10) {
        z K0;
        int deflate;
        f j10 = this.f34467b.j();
        while (true) {
            K0 = j10.K0(1);
            if (z10) {
                Deflater deflater = this.f34468c;
                byte[] bArr = K0.f34508a;
                int i10 = K0.f34510c;
                deflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
            } else {
                Deflater deflater2 = this.f34468c;
                byte[] bArr2 = K0.f34508a;
                int i11 = K0.f34510c;
                deflate = deflater2.deflate(bArr2, i11, 8192 - i11);
            }
            if (deflate > 0) {
                K0.f34510c += deflate;
                j10.z0(j10.C0() + deflate);
                this.f34467b.D();
            } else if (this.f34468c.needsInput()) {
                break;
            }
        }
        if (K0.f34509b == K0.f34510c) {
            j10.f34446a = K0.b();
            a0.b(K0);
        }
    }

    public final void b() {
        this.f34468c.finish();
        a(false);
    }

    @Override // mf.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f34466a) {
            return;
        }
        Throwable th = null;
        try {
            b();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f34468c.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f34467b.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f34466a = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // mf.c0, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.f34467b.flush();
    }

    @Override // mf.c0
    public f0 k() {
        return this.f34467b.k();
    }

    @Override // mf.c0
    public void n0(f fVar, long j10) throws IOException {
        qe.k.f(fVar, "source");
        c.b(fVar.C0(), 0L, j10);
        while (j10 > 0) {
            z zVar = fVar.f34446a;
            qe.k.c(zVar);
            int min = (int) Math.min(j10, zVar.f34510c - zVar.f34509b);
            this.f34468c.setInput(zVar.f34508a, zVar.f34509b, min);
            a(false);
            long j11 = min;
            fVar.z0(fVar.C0() - j11);
            int i10 = zVar.f34509b + min;
            zVar.f34509b = i10;
            if (i10 == zVar.f34510c) {
                fVar.f34446a = zVar.b();
                a0.b(zVar);
            }
            j10 -= j11;
        }
    }

    public String toString() {
        return "DeflaterSink(" + this.f34467b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(c0 c0Var, Deflater deflater) {
        this(r.c(c0Var), deflater);
        qe.k.f(c0Var, "sink");
        qe.k.f(deflater, "deflater");
    }
}
