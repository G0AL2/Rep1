package b4;

import com.inmobi.media.fq;
import java.io.InputStream;

/* compiled from: PooledByteBufferInputStream.java */
/* loaded from: classes.dex */
public class i extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    final g f4815a;

    /* renamed from: b  reason: collision with root package name */
    int f4816b;

    /* renamed from: c  reason: collision with root package name */
    int f4817c;

    public i(g gVar) {
        y3.k.b(Boolean.valueOf(!gVar.isClosed()));
        this.f4815a = (g) y3.k.g(gVar);
        this.f4816b = 0;
        this.f4817c = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f4815a.size() - this.f4816b;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f4817c = this.f4816b;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        g gVar = this.f4815a;
        int i10 = this.f4816b;
        this.f4816b = i10 + 1;
        return gVar.f(i10) & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f4816b = this.f4817c;
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        y3.k.b(Boolean.valueOf(j10 >= 0));
        int min = Math.min((int) j10, available());
        this.f4816b += min;
        return min;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0 && i10 + i11 <= bArr.length) {
            int available = available();
            if (available <= 0) {
                return -1;
            }
            if (i11 <= 0) {
                return 0;
            }
            int min = Math.min(available, i11);
            this.f4815a.c(this.f4816b, bArr, i10, min);
            this.f4816b += min;
            return min;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i10 + "; regionLength=" + i11);
    }
}
