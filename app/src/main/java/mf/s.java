package mf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class s {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f34488a = Logger.getLogger("okio.Okio");

    public static final c0 b(File file) throws FileNotFoundException {
        qe.k.f(file, "$this$appendingSink");
        return r.g(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        qe.k.f(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            return message != null ? ve.q.D(message, "getsockname failed", false, 2, null) : false;
        }
        return false;
    }

    public static final c0 d(File file, boolean z10) throws FileNotFoundException {
        qe.k.f(file, "$this$sink");
        return r.g(new FileOutputStream(file, z10));
    }

    public static final c0 e(OutputStream outputStream) {
        qe.k.f(outputStream, "$this$sink");
        return new v(outputStream, new f0());
    }

    public static final c0 f(Socket socket) throws IOException {
        qe.k.f(socket, "$this$sink");
        d0 d0Var = new d0(socket);
        OutputStream outputStream = socket.getOutputStream();
        qe.k.e(outputStream, "getOutputStream()");
        return d0Var.v(new v(outputStream, d0Var));
    }

    public static /* synthetic */ c0 g(File file, boolean z10, int i10, Object obj) throws FileNotFoundException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return r.f(file, z10);
    }

    public static final e0 h(File file) throws FileNotFoundException {
        qe.k.f(file, "$this$source");
        return r.k(new FileInputStream(file));
    }

    public static final e0 i(InputStream inputStream) {
        qe.k.f(inputStream, "$this$source");
        return new q(inputStream, new f0());
    }

    public static final e0 j(Socket socket) throws IOException {
        qe.k.f(socket, "$this$source");
        d0 d0Var = new d0(socket);
        InputStream inputStream = socket.getInputStream();
        qe.k.e(inputStream, "getInputStream()");
        return d0Var.w(new q(inputStream, d0Var));
    }
}
