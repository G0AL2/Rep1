package y3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Closeables.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final Logger f39258a = Logger.getLogger(b.class.getName());

    private b() {
    }

    public static void a(Closeable closeable, boolean z10) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            if (z10) {
                f39258a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e10);
                return;
            }
            throw e10;
        }
    }

    public static void b(InputStream inputStream) {
        try {
            a(inputStream, true);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
