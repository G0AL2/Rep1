package cb;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public abstract class u implements Closeable {
    public abstract long a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract InputStream b(long j10, long j11) throws IOException;

    public synchronized InputStream d() throws IOException {
        return b(0L, a());
    }
}
