package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import ee.n;
import ee.o;
import ee.r;
import java.lang.reflect.Constructor;
import qe.k;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes3.dex */
public final class c {
    static {
        Object a10;
        try {
            n.a aVar = n.f29807a;
            Looper mainLooper = Looper.getMainLooper();
            k.b(mainLooper, "Looper.getMainLooper()");
            a10 = n.a(new a(a(mainLooper, true), "Main"));
        } catch (Throwable th) {
            n.a aVar2 = n.f29807a;
            a10 = n.a(o.a(th));
        }
        if (n.c(a10)) {
            a10 = null;
        }
        b bVar = (b) a10;
    }

    public static final Handler a(Looper looper, boolean z10) {
        int i10;
        k.g(looper, "$this$asHandler");
        if (!z10 || (i10 = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i10 >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new r("null cannot be cast to non-null type android.os.Handler");
        }
        try {
            Constructor declaredConstructor = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE);
            k.b(declaredConstructor, "Handler::class.java.getD…:class.javaPrimitiveType)");
            Object newInstance = declaredConstructor.newInstance(looper, null, Boolean.TRUE);
            k.b(newInstance, "constructor.newInstance(this, null, true)");
            return (Handler) newInstance;
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
