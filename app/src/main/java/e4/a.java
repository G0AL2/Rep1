package e4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* compiled from: LimitedInputStream.java */
/* loaded from: classes.dex */
public class a extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private int f29565a;

    /* renamed from: b  reason: collision with root package name */
    private int f29566b;

    public a(InputStream inputStream, int i10) {
        super(inputStream);
        Objects.requireNonNull(inputStream);
        if (i10 >= 0) {
            this.f29565a = i10;
            this.f29566b = -1;
            return;
        }
        throw new IllegalArgumentException("limit must be >= 0");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return Math.min(((FilterInputStream) this).in.available(), this.f29565a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i10);
            this.f29566b = this.f29565a;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f29565a == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f29565a--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.f29566b != -1) {
                ((FilterInputStream) this).in.reset();
                this.f29565a = this.f29566b;
                return;
            }
            throw new IOException("mark not set");
        }
        throw new IOException("mark is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f29565a));
        this.f29565a = (int) (this.f29565a - skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f29565a;
        if (i12 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i10, Math.min(i11, i12));
        if (read > 0) {
            this.f29565a -= read;
        }
        return read;
    }
}
