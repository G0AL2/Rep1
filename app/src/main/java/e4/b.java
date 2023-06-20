package e4;

import com.inmobi.media.fq;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* compiled from: TailAppendingInputStream.java */
/* loaded from: classes.dex */
public class b extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f29567a;

    /* renamed from: b  reason: collision with root package name */
    private int f29568b;

    /* renamed from: c  reason: collision with root package name */
    private int f29569c;

    public b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        Objects.requireNonNull(inputStream);
        Objects.requireNonNull(bArr);
        this.f29567a = bArr;
    }

    private int a() {
        int i10 = this.f29568b;
        byte[] bArr = this.f29567a;
        if (i10 >= bArr.length) {
            return -1;
        }
        this.f29568b = i10 + 1;
        return bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i10);
            this.f29569c = this.f29568b;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        return read != -1 ? read : a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.reset();
            this.f29568b = this.f29569c;
            return;
        }
        throw new IOException("mark is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr, i10, i11);
        if (read != -1) {
            return read;
        }
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        while (i12 < i11) {
            int a10 = a();
            if (a10 == -1) {
                break;
            }
            bArr[i10 + i12] = (byte) a10;
            i12++;
        }
        if (i12 > 0) {
            return i12;
        }
        return -1;
    }
}
