package y3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: ByteStreams.java */
/* loaded from: classes.dex */
public final class a {
    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        k.g(inputStream);
        k.g(outputStream);
        byte[] bArr = new byte[4096];
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j10;
            }
            outputStream.write(bArr, 0, read);
            j10 += read;
        }
    }

    public static int b(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        k.g(inputStream);
        k.g(bArr);
        if (i11 >= 0) {
            int i12 = 0;
            while (i12 < i11) {
                int read = inputStream.read(bArr, i10 + i12, i11 - i12);
                if (read == -1) {
                    break;
                }
                i12 += read;
            }
            return i12;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }
}
