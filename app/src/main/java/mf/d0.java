package mf;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
/* loaded from: classes3.dex */
public final class d0 extends d {

    /* renamed from: l  reason: collision with root package name */
    private final Socket f34445l;

    public d0(Socket socket) {
        qe.k.f(socket, "socket");
        this.f34445l = socket;
    }

    @Override // mf.d
    protected IOException t(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // mf.d
    protected void x() {
        Logger logger;
        Logger logger2;
        try {
            this.f34445l.close();
        } catch (AssertionError e10) {
            if (r.e(e10)) {
                logger2 = s.f34488a;
                Level level = Level.WARNING;
                logger2.log(level, "Failed to close timed out socket " + this.f34445l, (Throwable) e10);
                return;
            }
            throw e10;
        } catch (Exception e11) {
            logger = s.f34488a;
            Level level2 = Level.WARNING;
            logger.log(level2, "Failed to close timed out socket " + this.f34445l, (Throwable) e11);
        }
    }
}
