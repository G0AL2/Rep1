package g4;

import java.io.IOException;
import java.io.InputStream;
import y3.k;

/* compiled from: StreamUtil.java */
/* loaded from: classes.dex */
public class d {
    public static long a(InputStream inputStream, long j10) throws IOException {
        k.g(inputStream);
        k.b(Boolean.valueOf(j10 >= 0));
        long j11 = j10;
        while (j11 > 0) {
            long skip = inputStream.skip(j11);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    return j10 - j11;
                }
                skip = 1;
            }
            j11 -= skip;
        }
        return j10;
    }
}
