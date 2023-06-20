package mf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes3.dex */
public final class r {
    public static final c0 a(File file) throws FileNotFoundException {
        return s.b(file);
    }

    public static final c0 b() {
        return t.a();
    }

    public static final g c(c0 c0Var) {
        return t.b(c0Var);
    }

    public static final h d(e0 e0Var) {
        return t.c(e0Var);
    }

    public static final boolean e(AssertionError assertionError) {
        return s.c(assertionError);
    }

    public static final c0 f(File file, boolean z10) throws FileNotFoundException {
        return s.d(file, z10);
    }

    public static final c0 g(OutputStream outputStream) {
        return s.e(outputStream);
    }

    public static final c0 h(Socket socket) throws IOException {
        return s.f(socket);
    }

    public static final e0 j(File file) throws FileNotFoundException {
        return s.h(file);
    }

    public static final e0 k(InputStream inputStream) {
        return s.i(inputStream);
    }

    public static final e0 l(Socket socket) throws IOException {
        return s.j(socket);
    }
}
