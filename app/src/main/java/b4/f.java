package b4;

import com.inmobi.media.fq;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PooledByteArrayBufferedInputStream.java */
/* loaded from: classes.dex */
public class f extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f4809a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f4810b;

    /* renamed from: c  reason: collision with root package name */
    private final c4.h<byte[]> f4811c;

    /* renamed from: d  reason: collision with root package name */
    private int f4812d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f4813e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4814f = false;

    public f(InputStream inputStream, byte[] bArr, c4.h<byte[]> hVar) {
        this.f4809a = (InputStream) y3.k.g(inputStream);
        this.f4810b = (byte[]) y3.k.g(bArr);
        this.f4811c = (c4.h) y3.k.g(hVar);
    }

    private boolean a() throws IOException {
        if (this.f4813e < this.f4812d) {
            return true;
        }
        int read = this.f4809a.read(this.f4810b);
        if (read <= 0) {
            return false;
        }
        this.f4812d = read;
        this.f4813e = 0;
        return true;
    }

    private void b() throws IOException {
        if (this.f4814f) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        y3.k.i(this.f4813e <= this.f4812d);
        b();
        return (this.f4812d - this.f4813e) + this.f4809a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f4814f) {
            return;
        }
        this.f4814f = true;
        this.f4811c.a(this.f4810b);
        super.close();
    }

    protected void finalize() throws Throwable {
        if (!this.f4814f) {
            z3.a.j("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        y3.k.i(this.f4813e <= this.f4812d);
        b();
        if (a()) {
            byte[] bArr = this.f4810b;
            int i10 = this.f4813e;
            this.f4813e = i10 + 1;
            return bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        y3.k.i(this.f4813e <= this.f4812d);
        b();
        int i10 = this.f4812d;
        int i11 = this.f4813e;
        long j11 = i10 - i11;
        if (j11 >= j10) {
            this.f4813e = (int) (i11 + j10);
            return j10;
        }
        this.f4813e = i10;
        return j11 + this.f4809a.skip(j10 - j11);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        y3.k.i(this.f4813e <= this.f4812d);
        b();
        if (a()) {
            int min = Math.min(this.f4812d - this.f4813e, i11);
            System.arraycopy(this.f4810b, this.f4813e, bArr, i10, min);
            this.f4813e += min;
            return min;
        }
        return -1;
    }
}
