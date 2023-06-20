package b4;

import java.io.Closeable;

/* compiled from: PooledByteBuffer.java */
/* loaded from: classes.dex */
public interface g extends Closeable {

    /* compiled from: PooledByteBuffer.java */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a() {
            super("Invalid bytebuf. Already closed");
        }
    }

    int c(int i10, byte[] bArr, int i11, int i12);

    byte f(int i10);

    boolean isClosed();

    int size();
}
