package we;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes3.dex */
public final class b0 {
    public static final void a(ie.g gVar, Throwable th) {
        qe.k.g(gVar, "context");
        qe.k.g(th, "exception");
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) gVar.get(CoroutineExceptionHandler.f33475c0);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(gVar, th);
            } else {
                a0.a(gVar, th);
            }
        } catch (Throwable th2) {
            a0.a(gVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        qe.k.g(th, "originalException");
        qe.k.g(th2, "thrownException");
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        ee.b.a(runtimeException, th);
        return runtimeException;
    }
}
