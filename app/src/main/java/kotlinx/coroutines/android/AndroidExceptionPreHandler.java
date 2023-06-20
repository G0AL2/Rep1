package kotlinx.coroutines.android;

import android.os.Build;
import androidx.annotation.Keep;
import ee.h;
import ee.j;
import ie.g;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;
import qe.k;
import qe.o;
import qe.t;
import te.f;

/* compiled from: AndroidExceptionPreHandler.kt */
@Keep
/* loaded from: classes3.dex */
public final class AndroidExceptionPreHandler extends ie.a implements CoroutineExceptionHandler, pe.a<Method> {
    static final /* synthetic */ f[] $$delegatedProperties = {t.d(new o(t.b(AndroidExceptionPreHandler.class), "preHandler", "getPreHandler()Ljava/lang/reflect/Method;"))};
    private final h preHandler$delegate;

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.f33475c0);
        h a10;
        a10 = j.a(this);
        this.preHandler$delegate = a10;
    }

    private final Method getPreHandler() {
        h hVar = this.preHandler$delegate;
        f fVar = $$delegatedProperties[0];
        return (Method) hVar.getValue();
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(g gVar, Throwable th) {
        k.g(gVar, "context");
        k.g(th, "exception");
        Thread currentThread = Thread.currentThread();
        if (Build.VERSION.SDK_INT >= 28) {
            k.b(currentThread, "thread");
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
            return;
        }
        Method preHandler = getPreHandler();
        Object invoke = preHandler != null ? preHandler.invoke(null, new Object[0]) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? invoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(currentThread, th);
        }
    }

    @Override // pe.a
    public Method invoke() {
        try {
            boolean z10 = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            k.b(declaredMethod, "it");
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z10 = true;
                }
            }
            if (z10) {
                return declaredMethod;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
