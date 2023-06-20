package mf;

import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: InflaterSource.kt */
/* loaded from: classes3.dex */
public final class p implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private int f34482a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f34483b;

    /* renamed from: c  reason: collision with root package name */
    private final h f34484c;

    /* renamed from: d  reason: collision with root package name */
    private final Inflater f34485d;

    public p(h hVar, Inflater inflater) {
        qe.k.f(hVar, "source");
        qe.k.f(inflater, "inflater");
        this.f34484c = hVar;
        this.f34485d = inflater;
    }

    private final void d() {
        int i10 = this.f34482a;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f34485d.getRemaining();
        this.f34482a -= remaining;
        this.f34484c.O0(remaining);
    }

    public final long a(f fVar, long j10) throws IOException {
        qe.k.f(fVar, "sink");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (!this.f34483b) {
                if (i10 == 0) {
                    return 0L;
                }
                try {
                    z K0 = fVar.K0(1);
                    int min = (int) Math.min(j10, 8192 - K0.f34510c);
                    b();
                    int inflate = this.f34485d.inflate(K0.f34508a, K0.f34510c, min);
                    d();
                    if (inflate > 0) {
                        K0.f34510c += inflate;
                        long j11 = inflate;
                        fVar.z0(fVar.C0() + j11);
                        return j11;
                    }
                    if (K0.f34509b == K0.f34510c) {
                        fVar.f34446a = K0.b();
                        a0.b(K0);
                    }
                    return 0L;
                } catch (DataFormatException e10) {
                    throw new IOException(e10);
                }
            }
            throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
    }

    public final boolean b() throws IOException {
        if (this.f34485d.needsInput()) {
            if (this.f34484c.w0()) {
                return true;
            }
            z zVar = this.f34484c.j().f34446a;
            qe.k.c(zVar);
            int i10 = zVar.f34510c;
            int i11 = zVar.f34509b;
            int i12 = i10 - i11;
            this.f34482a = i12;
            this.f34485d.setInput(zVar.f34508a, i11, i12);
            return false;
        }
        return false;
    }

    @Override // mf.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f34483b) {
            return;
        }
        this.f34485d.end();
        this.f34483b = true;
        this.f34484c.close();
    }

    @Override // mf.e0
    public long e0(f fVar, long j10) throws IOException {
        qe.k.f(fVar, "sink");
        do {
            long a10 = a(fVar, j10);
            if (a10 > 0) {
                return a10;
            }
            if (this.f34485d.finished() || this.f34485d.needsDictionary()) {
                return -1L;
            }
        } while (!this.f34484c.w0());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // mf.e0
    public f0 k() {
        return this.f34484c.k();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(e0 e0Var, Inflater inflater) {
        this(r.d(e0Var), inflater);
        qe.k.f(e0Var, "source");
        qe.k.f(inflater, "inflater");
    }
}
