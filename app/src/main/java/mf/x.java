package mf;

import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: RealBufferedSink.kt */
/* loaded from: classes3.dex */
public final class x implements g {

    /* renamed from: a  reason: collision with root package name */
    public final f f34500a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f34501b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f34502c;

    public x(c0 c0Var) {
        qe.k.f(c0Var, "sink");
        this.f34502c = c0Var;
        this.f34500a = new f();
    }

    @Override // mf.g
    public g D() {
        if (!this.f34501b) {
            long e10 = this.f34500a.e();
            if (e10 > 0) {
                this.f34502c.n0(this.f34500a, e10);
            }
            return this;
        }
        throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
    }

    @Override // mf.g
    public g M(String str) {
        qe.k.f(str, "string");
        if (!this.f34501b) {
            this.f34500a.M(str);
            return D();
        }
        throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
    }

    @Override // mf.g
    public g M0(long j10) {
        if (!this.f34501b) {
            this.f34500a.M0(j10);
            return D();
        }
        throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
    }

    @Override // mf.g
    public g S(String str, int i10, int i11) {
        qe.k.f(str, "string");
        if (!this.f34501b) {
            this.f34500a.S(str, i10, i11);
            return D();
        }
        throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
    }

    @Override // mf.g
    public g Y(i iVar) {
        qe.k.f(iVar, "byteString");
        if (!this.f34501b) {
            this.f34500a.Y(iVar);
            return D();
        }
        throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
    }

    public g a(int i10) {
        if (!this.f34501b) {
            this.f34500a.b1(i10);
            return D();
        }
        throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
    }

    @Override // mf.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f34501b) {
            return;
        }
        Throwable th = null;
        try {
            if (this.f34500a.C0() > 0) {
                c0 c0Var = this.f34502c;
                f fVar = this.f34500a;
                c0Var.n0(fVar, fVar.C0());
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f34502c.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f34501b = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // mf.g
    public OutputStream e1() {
        return new a();
    }

    @Override // mf.g, mf.c0, java.io.Flushable
    public void flush() {
        if (!this.f34501b) {
            if (this.f34500a.C0() > 0) {
                c0 c0Var = this.f34502c;
                f fVar = this.f34500a;
                c0Var.n0(fVar, fVar.C0());
            }
            this.f34502c.flush();
            return;
        }
        throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f34501b;
    }

    @Override // mf.g
    public f j() {
        return this.f34500a;
    }

    @Override // mf.c0
    public f0 k() {
        return this.f34502c.k();
    }

    @Override // mf.g
    public g k0(long j10) {
        if (!this.f34501b) {
            this.f34500a.k0(j10);
            return D();
        }
        throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
    }

    @Override // mf.c0
    public void n0(f fVar, long j10) {
        qe.k.f(fVar, "source");
        if (!this.f34501b) {
            this.f34500a.n0(fVar, j10);
            D();
            return;
        }
        throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
    }

    @Override // mf.g
    public long t(e0 e0Var) {
        qe.k.f(e0Var, "source");
        long j10 = 0;
        while (true) {
            long e02 = e0Var.e0(this.f34500a, (long) Constants.BUFFER_SIZE);
            if (e02 == -1) {
                return j10;
            }
            j10 += e02;
            D();
        }
    }

    public String toString() {
        return "buffer(" + this.f34502c + ')';
    }

    @Override // mf.g
    public g u() {
        if (!this.f34501b) {
            long C0 = this.f34500a.C0();
            if (C0 > 0) {
                this.f34502c.n0(this.f34500a, C0);
            }
            return this;
        }
        throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        qe.k.f(byteBuffer, "source");
        if (!this.f34501b) {
            int write = this.f34500a.write(byteBuffer);
            D();
            return write;
        }
        throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
    }

    @Override // mf.g
    public g writeByte(int i10) {
        if (!this.f34501b) {
            this.f34500a.writeByte(i10);
            return D();
        }
        throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
    }

    @Override // mf.g
    public g writeInt(int i10) {
        if (!this.f34501b) {
            this.f34500a.writeInt(i10);
            return D();
        }
        throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
    }

    @Override // mf.g
    public g writeShort(int i10) {
        if (!this.f34501b) {
            this.f34500a.writeShort(i10);
            return D();
        }
        throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
    }

    /* compiled from: RealBufferedSink.kt */
    /* loaded from: classes3.dex */
    public static final class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            x.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            x xVar = x.this;
            if (xVar.f34501b) {
                return;
            }
            xVar.flush();
        }

        public String toString() {
            return x.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            x xVar = x.this;
            if (!xVar.f34501b) {
                xVar.f34500a.writeByte((byte) i10);
                x.this.D();
                return;
            }
            throw new IOException(RNAdsEvents.EVENT_CLOSED);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            qe.k.f(bArr, "data");
            x xVar = x.this;
            if (!xVar.f34501b) {
                xVar.f34500a.write(bArr, i10, i11);
                x.this.D();
                return;
            }
            throw new IOException(RNAdsEvents.EVENT_CLOSED);
        }
    }

    @Override // mf.g
    public g write(byte[] bArr) {
        qe.k.f(bArr, "source");
        if (!this.f34501b) {
            this.f34500a.write(bArr);
            return D();
        }
        throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
    }

    @Override // mf.g
    public g write(byte[] bArr, int i10, int i11) {
        qe.k.f(bArr, "source");
        if (!this.f34501b) {
            this.f34500a.write(bArr, i10, i11);
            return D();
        }
        throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
    }
}
