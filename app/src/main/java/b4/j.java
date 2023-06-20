package b4;

import java.io.IOException;
import java.io.OutputStream;
import y3.p;

/* compiled from: PooledByteBufferOutputStream.java */
/* loaded from: classes.dex */
public abstract class j extends OutputStream {
    public abstract g a();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            p.a(e10);
        }
    }

    public abstract int size();
}
