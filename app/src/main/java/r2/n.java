package r2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: PoolingByteArrayOutputStream.java */
/* loaded from: classes.dex */
public class n extends ByteArrayOutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final d f36161a;

    public n(d dVar, int i10) {
        this.f36161a = dVar;
        ((ByteArrayOutputStream) this).buf = dVar.a(Math.max(i10, 256));
    }

    private void a(int i10) {
        int i11 = ((ByteArrayOutputStream) this).count;
        if (i11 + i10 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] a10 = this.f36161a.a((i11 + i10) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a10, 0, ((ByteArrayOutputStream) this).count);
        this.f36161a.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = a10;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f36161a.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public void finalize() {
        this.f36161a.b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) {
        a(i11);
        super.write(bArr, i10, i11);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i10) {
        a(1);
        super.write(i10);
    }
}
