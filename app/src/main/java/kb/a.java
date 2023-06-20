package kb;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import ib.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: ByteStreams.java */
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: ByteStreams.java */
    /* renamed from: kb.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0430a extends OutputStream {
        C0430a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            l.j(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            l.j(bArr);
        }
    }

    static {
        new C0430a();
    }

    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        l.j(inputStream);
        l.j(outputStream);
        byte[] b10 = b();
        long j10 = 0;
        while (true) {
            int read = inputStream.read(b10);
            if (read == -1) {
                return j10;
            }
            outputStream.write(b10, 0, read);
            j10 += read;
        }
    }

    static byte[] b() {
        return new byte[Constants.BUFFER_SIZE];
    }
}
