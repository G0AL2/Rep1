package mf;

import com.google.android.gms.common.api.Api;
import com.inmobi.media.fq;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: RealBufferedSource.kt */
/* loaded from: classes3.dex */
public final class y implements h {

    /* renamed from: a  reason: collision with root package name */
    public final f f34504a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f34505b;

    /* renamed from: c  reason: collision with root package name */
    public final e0 f34506c;

    public y(e0 e0Var) {
        qe.k.f(e0Var, "source");
        this.f34506c = e0Var;
        this.f34504a = new f();
    }

    @Override // mf.h
    public String F(long j10) {
        if (j10 >= 0) {
            long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
            byte b10 = (byte) 10;
            long b11 = b(b10, 0L, j11);
            if (b11 != -1) {
                return nf.a.c(this.f34504a, b11);
            }
            if (j11 < Long.MAX_VALUE && W(j11) && this.f34504a.A(j11 - 1) == ((byte) 13) && W(1 + j11) && this.f34504a.A(j11) == b10) {
                return nf.a.c(this.f34504a, j11);
            }
            f fVar = new f();
            f fVar2 = this.f34504a;
            fVar2.w(fVar, 0L, Math.min(32, fVar2.C0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f34504a.C0(), j10) + " content=" + fVar.g0().p() + "…");
        }
        throw new IllegalArgumentException(("limit < 0: " + j10).toString());
    }

    @Override // mf.h
    public String J0(Charset charset) {
        qe.k.f(charset, "charset");
        this.f34504a.t(this.f34506c);
        return this.f34504a.J0(charset);
    }

    @Override // mf.h
    public boolean N(long j10, i iVar) {
        qe.k.f(iVar, "bytes");
        return h(j10, iVar, 0, iVar.A());
    }

    @Override // mf.h
    public void O0(long j10) {
        if (!(!this.f34505b)) {
            throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
        }
        while (j10 > 0) {
            if (this.f34504a.C0() == 0 && this.f34506c.e0(this.f34504a, (long) Constants.BUFFER_SIZE) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j10, this.f34504a.C0());
            this.f34504a.O0(min);
            j10 -= min;
        }
    }

    @Override // mf.h
    public long P(i iVar) {
        qe.k.f(iVar, "targetBytes");
        return e(iVar, 0L);
    }

    @Override // mf.h
    public boolean W(long j10) {
        if (j10 >= 0) {
            if (!this.f34505b) {
                while (this.f34504a.C0() < j10) {
                    if (this.f34506c.e0(this.f34504a, (long) Constants.BUFFER_SIZE) == -1) {
                        return false;
                    }
                }
                return true;
            }
            throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
    }

    @Override // mf.h
    public int X(u uVar) {
        qe.k.f(uVar, "options");
        if (!this.f34505b) {
            while (true) {
                int d10 = nf.a.d(this.f34504a, uVar, true);
                if (d10 == -2) {
                    if (this.f34506c.e0(this.f34504a, (long) Constants.BUFFER_SIZE) == -1) {
                        break;
                    }
                } else if (d10 != -1) {
                    this.f34504a.O0(uVar.h()[d10].A());
                    return d10;
                }
            }
            return -1;
        }
        throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
    }

    public long a(byte b10) {
        return b(b10, 0L, Long.MAX_VALUE);
    }

    @Override // mf.h
    public String a0() {
        return F(Long.MAX_VALUE);
    }

    public long b(byte b10, long j10, long j11) {
        boolean z10 = true;
        if (!this.f34505b) {
            if (!((0 > j10 || j11 < j10) ? false : false)) {
                throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
            }
            while (j10 < j11) {
                long C = this.f34504a.C(b10, j10, j11);
                if (C != -1) {
                    return C;
                }
                long C0 = this.f34504a.C0();
                if (C0 >= j11 || this.f34506c.e0(this.f34504a, (long) Constants.BUFFER_SIZE) == -1) {
                    return -1L;
                }
                j10 = Math.max(j10, C0);
            }
            return -1L;
        }
        throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
    }

    @Override // mf.h
    public byte[] b0(long j10) {
        j0(j10);
        return this.f34504a.b0(j10);
    }

    @Override // mf.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f34505b) {
            return;
        }
        this.f34505b = true;
        this.f34506c.close();
        this.f34504a.b();
    }

    public long d(i iVar, long j10) {
        qe.k.f(iVar, "bytes");
        if (!(!this.f34505b)) {
            throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
        }
        while (true) {
            long L = this.f34504a.L(iVar, j10);
            if (L != -1) {
                return L;
            }
            long C0 = this.f34504a.C0();
            if (this.f34506c.e0(this.f34504a, (long) Constants.BUFFER_SIZE) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, (C0 - iVar.A()) + 1);
        }
    }

    public long e(i iVar, long j10) {
        qe.k.f(iVar, "targetBytes");
        if (!(!this.f34505b)) {
            throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
        }
        while (true) {
            long O = this.f34504a.O(iVar, j10);
            if (O != -1) {
                return O;
            }
            long C0 = this.f34504a.C0();
            if (this.f34506c.e0(this.f34504a, (long) Constants.BUFFER_SIZE) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, C0);
        }
    }

    @Override // mf.e0
    public long e0(f fVar, long j10) {
        qe.k.f(fVar, "sink");
        if (j10 >= 0) {
            if (true ^ this.f34505b) {
                if (this.f34504a.C0() == 0 && this.f34506c.e0(this.f34504a, (long) Constants.BUFFER_SIZE) == -1) {
                    return -1L;
                }
                return this.f34504a.e0(fVar, Math.min(j10, this.f34504a.C0()));
            }
            throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
    }

    @Override // mf.h
    public long f0(i iVar) {
        qe.k.f(iVar, "bytes");
        return d(iVar, 0L);
    }

    @Override // mf.h
    public long f1() {
        byte A;
        int a10;
        int a11;
        j0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!W(i11)) {
                break;
            }
            A = this.f34504a.A(i10);
            if ((A < ((byte) 48) || A > ((byte) 57)) && ((A < ((byte) 97) || A > ((byte) 102)) && (A < ((byte) 65) || A > ((byte) 70)))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            a10 = ve.b.a(16);
            a11 = ve.b.a(a10);
            String num = Integer.toString(A, a11);
            qe.k.e(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb2.append(num);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f34504a.f1();
    }

    public boolean h(long j10, i iVar, int i10, int i11) {
        int i12;
        qe.k.f(iVar, "bytes");
        if (!this.f34505b) {
            if (j10 >= 0 && i10 >= 0 && i11 >= 0 && iVar.A() - i10 >= i11) {
                while (i12 < i11) {
                    long j11 = i12 + j10;
                    i12 = (W(1 + j11) && this.f34504a.A(j11) == iVar.k(i10 + i12)) ? i12 + 1 : 0;
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
    }

    @Override // mf.h
    public InputStream h1() {
        return new a();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f34505b;
    }

    @Override // mf.h, mf.g
    public f j() {
        return this.f34504a;
    }

    @Override // mf.h
    public void j0(long j10) {
        if (!W(j10)) {
            throw new EOFException();
        }
    }

    @Override // mf.e0
    public f0 k() {
        return this.f34506c.k();
    }

    public int l() {
        j0(4L);
        return this.f34504a.h0();
    }

    @Override // mf.h
    public i o0(long j10) {
        j0(j10);
        return this.f34504a.o0(j10);
    }

    @Override // mf.h
    public f p() {
        return this.f34504a;
    }

    @Override // mf.h
    public h peek() {
        return r.d(new w(this));
    }

    public short q() {
        j0(2L);
        return this.f34504a.m0();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        qe.k.f(byteBuffer, "sink");
        if (this.f34504a.C0() == 0 && this.f34506c.e0(this.f34504a, (long) Constants.BUFFER_SIZE) == -1) {
            return -1;
        }
        return this.f34504a.read(byteBuffer);
    }

    @Override // mf.h
    public byte readByte() {
        j0(1L);
        return this.f34504a.readByte();
    }

    @Override // mf.h
    public void readFully(byte[] bArr) {
        qe.k.f(bArr, "sink");
        try {
            j0(bArr.length);
            this.f34504a.readFully(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (this.f34504a.C0() > 0) {
                f fVar = this.f34504a;
                int U = fVar.U(bArr, i10, (int) fVar.C0());
                if (U == -1) {
                    throw new AssertionError();
                }
                i10 += U;
            }
            throw e10;
        }
    }

    @Override // mf.h
    public int readInt() {
        j0(4L);
        return this.f34504a.readInt();
    }

    @Override // mf.h
    public long readLong() {
        j0(8L);
        return this.f34504a.readLong();
    }

    @Override // mf.h
    public short readShort() {
        j0(2L);
        return this.f34504a.readShort();
    }

    public String toString() {
        return "buffer(" + this.f34506c + ')';
    }

    @Override // mf.h
    public byte[] u0() {
        this.f34504a.t(this.f34506c);
        return this.f34504a.u0();
    }

    @Override // mf.h
    public boolean w0() {
        if (!this.f34505b) {
            return this.f34504a.w0() && this.f34506c.e0(this.f34504a, (long) Constants.BUFFER_SIZE) == -1;
        }
        throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r9 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Expected leading [0-9] or '-' character but was 0x");
        r2 = ve.b.a(16);
        r2 = ve.b.a(r2);
        r2 = java.lang.Integer.toString(r8, r2);
        qe.k.e(r2, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // mf.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long x0() {
        /*
            r10 = this;
            r0 = 1
            r10.j0(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.W(r6)
            if (r8 == 0) goto L59
            mf.f r8 = r10.f34504a
            byte r8 = r8.A(r4)
            r9 = 48
            byte r9 = (byte) r9
            if (r8 < r9) goto L20
            r9 = 57
            byte r9 = (byte) r9
            if (r8 <= r9) goto L2a
        L20:
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 != 0) goto L2c
            r4 = 45
            byte r4 = (byte) r4
            if (r8 == r4) goto L2a
            goto L2c
        L2a:
            r4 = r6
            goto L8
        L2c:
            if (r9 == 0) goto L2f
            goto L59
        L2f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.append(r2)
            r2 = 16
            int r2 = ve.a.a(r2)
            int r2 = ve.a.a(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            qe.k.e(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L59:
            mf.f r0 = r10.f34504a
            long r0 = r0.x0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.y.x0():long");
    }

    @Override // mf.h
    public void y0(f fVar, long j10) {
        qe.k.f(fVar, "sink");
        try {
            j0(j10);
            this.f34504a.y0(fVar, j10);
        } catch (EOFException e10) {
            fVar.t(this.f34504a);
            throw e10;
        }
    }

    /* compiled from: RealBufferedSource.kt */
    /* loaded from: classes3.dex */
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            y yVar = y.this;
            if (!yVar.f34505b) {
                return (int) Math.min(yVar.f34504a.C0(), (long) Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
            throw new IOException(RNAdsEvents.EVENT_CLOSED);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            y.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            y yVar = y.this;
            if (!yVar.f34505b) {
                if (yVar.f34504a.C0() == 0) {
                    y yVar2 = y.this;
                    if (yVar2.f34506c.e0(yVar2.f34504a, (long) Constants.BUFFER_SIZE) == -1) {
                        return -1;
                    }
                }
                return y.this.f34504a.readByte() & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
            }
            throw new IOException(RNAdsEvents.EVENT_CLOSED);
        }

        public String toString() {
            return y.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            qe.k.f(bArr, "data");
            if (!y.this.f34505b) {
                c.b(bArr.length, i10, i11);
                if (y.this.f34504a.C0() == 0) {
                    y yVar = y.this;
                    if (yVar.f34506c.e0(yVar.f34504a, (long) Constants.BUFFER_SIZE) == -1) {
                        return -1;
                    }
                }
                return y.this.f34504a.U(bArr, i10, i11);
            }
            throw new IOException(RNAdsEvents.EVENT_CLOSED);
        }
    }
}
