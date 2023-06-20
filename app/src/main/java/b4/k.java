package b4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PooledByteStreams.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final int f4818a;

    /* renamed from: b  reason: collision with root package name */
    private final a f4819b;

    public k(a aVar) {
        this(aVar, 16384);
    }

    public long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = this.f4819b.get(this.f4818a);
        long j10 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.f4818a);
                if (read == -1) {
                    return j10;
                }
                outputStream.write(bArr, 0, read);
                j10 += read;
            } finally {
                this.f4819b.a(bArr);
            }
        }
    }

    public k(a aVar, int i10) {
        y3.k.b(Boolean.valueOf(i10 > 0));
        this.f4818a = i10;
        this.f4819b = aVar;
    }
}
