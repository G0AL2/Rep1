package da;

import com.inmobi.media.fq;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DataSourceInputStream.java */
/* loaded from: classes2.dex */
public final class n extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final l f29212a;

    /* renamed from: b  reason: collision with root package name */
    private final p f29213b;

    /* renamed from: f  reason: collision with root package name */
    private long f29217f;

    /* renamed from: d  reason: collision with root package name */
    private boolean f29215d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f29216e = false;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f29214c = new byte[1];

    public n(l lVar, p pVar) {
        this.f29212a = lVar;
        this.f29213b = pVar;
    }

    private void a() throws IOException {
        if (this.f29215d) {
            return;
        }
        this.f29212a.g(this.f29213b);
        this.f29215d = true;
    }

    public void b() throws IOException {
        a();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f29216e) {
            return;
        }
        this.f29212a.close();
        this.f29216e = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f29214c) == -1) {
            return -1;
        }
        return this.f29214c[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        ea.a.f(!this.f29216e);
        a();
        int c10 = this.f29212a.c(bArr, i10, i11);
        if (c10 == -1) {
            return -1;
        }
        this.f29217f += c10;
        return c10;
    }
}
