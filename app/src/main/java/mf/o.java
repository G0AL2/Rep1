package mf;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: GzipSource.kt */
/* loaded from: classes3.dex */
public final class o implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private byte f34477a;

    /* renamed from: b  reason: collision with root package name */
    private final y f34478b;

    /* renamed from: c  reason: collision with root package name */
    private final Inflater f34479c;

    /* renamed from: d  reason: collision with root package name */
    private final p f34480d;

    /* renamed from: e  reason: collision with root package name */
    private final CRC32 f34481e;

    public o(e0 e0Var) {
        qe.k.f(e0Var, "source");
        y yVar = new y(e0Var);
        this.f34478b = yVar;
        Inflater inflater = new Inflater(true);
        this.f34479c = inflater;
        this.f34480d = new p((h) yVar, inflater);
        this.f34481e = new CRC32();
    }

    private final void a(String str, int i10, int i11) {
        if (i11 == i10) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
        qe.k.e(format, "java.lang.String.format(this, *args)");
        throw new IOException(format);
    }

    private final void b() throws IOException {
        this.f34478b.j0(10L);
        byte A = this.f34478b.f34504a.A(3L);
        boolean z10 = ((A >> 1) & 1) == 1;
        if (z10) {
            e(this.f34478b.f34504a, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f34478b.readShort());
        this.f34478b.O0(8L);
        if (((A >> 2) & 1) == 1) {
            this.f34478b.j0(2L);
            if (z10) {
                e(this.f34478b.f34504a, 0L, 2L);
            }
            long m02 = this.f34478b.f34504a.m0();
            this.f34478b.j0(m02);
            if (z10) {
                e(this.f34478b.f34504a, 0L, m02);
            }
            this.f34478b.O0(m02);
        }
        if (((A >> 3) & 1) == 1) {
            long a10 = this.f34478b.a((byte) 0);
            if (a10 != -1) {
                if (z10) {
                    e(this.f34478b.f34504a, 0L, a10 + 1);
                }
                this.f34478b.O0(a10 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((A >> 4) & 1) == 1) {
            long a11 = this.f34478b.a((byte) 0);
            if (a11 != -1) {
                if (z10) {
                    e(this.f34478b.f34504a, 0L, a11 + 1);
                }
                this.f34478b.O0(a11 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z10) {
            a("FHCRC", this.f34478b.q(), (short) this.f34481e.getValue());
            this.f34481e.reset();
        }
    }

    private final void d() throws IOException {
        a("CRC", this.f34478b.l(), (int) this.f34481e.getValue());
        a("ISIZE", this.f34478b.l(), (int) this.f34479c.getBytesWritten());
    }

    private final void e(f fVar, long j10, long j11) {
        int i10;
        z zVar = fVar.f34446a;
        qe.k.c(zVar);
        while (true) {
            int i11 = zVar.f34510c;
            int i12 = zVar.f34509b;
            if (j10 < i11 - i12) {
                break;
            }
            j10 -= i11 - i12;
            zVar = zVar.f34513f;
            qe.k.c(zVar);
        }
        while (j11 > 0) {
            int min = (int) Math.min(zVar.f34510c - i10, j11);
            this.f34481e.update(zVar.f34508a, (int) (zVar.f34509b + j10), min);
            j11 -= min;
            zVar = zVar.f34513f;
            qe.k.c(zVar);
            j10 = 0;
        }
    }

    @Override // mf.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f34480d.close();
    }

    @Override // mf.e0
    public long e0(f fVar, long j10) throws IOException {
        qe.k.f(fVar, "sink");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (i10 == 0) {
            return 0L;
        } else {
            if (this.f34477a == 0) {
                b();
                this.f34477a = (byte) 1;
            }
            if (this.f34477a == 1) {
                long C0 = fVar.C0();
                long e02 = this.f34480d.e0(fVar, j10);
                if (e02 != -1) {
                    e(fVar, C0, e02);
                    return e02;
                }
                this.f34477a = (byte) 2;
            }
            if (this.f34477a == 2) {
                d();
                this.f34477a = (byte) 3;
                if (!this.f34478b.w0()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
    }

    @Override // mf.e0
    public f0 k() {
        return this.f34478b.k();
    }
}
