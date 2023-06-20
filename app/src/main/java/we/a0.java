package we;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final List<CoroutineExceptionHandler> f38586a;

    static {
        ue.d a10;
        List<CoroutineExceptionHandler> j10;
        Iterator it = ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator();
        qe.k.b(it, "ServiceLoader.load(\n    ….classLoader\n).iterator()");
        a10 = ue.h.a(it);
        j10 = ue.j.j(a10);
        f38586a = j10;
    }

    public static final void a(ie.g gVar, Throwable th) {
        qe.k.g(gVar, "context");
        qe.k.g(th, "exception");
        for (CoroutineExceptionHandler coroutineExceptionHandler : f38586a) {
            try {
                coroutineExceptionHandler.handleException(gVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                qe.k.b(currentThread, "currentThread");
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, b0.b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        qe.k.b(currentThread2, "currentThread");
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
