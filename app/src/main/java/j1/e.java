package j1;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: WebViewGlueCommunicator.java */
/* loaded from: classes.dex */
public class e {

    /* compiled from: WebViewGlueCommunicator.java */
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final h f32176a = new h(e.d().getWebkitToCompatConverter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WebViewGlueCommunicator.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        static final f f32177a = e.a();
    }

    static f a() {
        if (Build.VERSION.SDK_INT < 21) {
            return new j1.b();
        }
        try {
            return new g((WebViewProviderFactoryBoundaryInterface) of.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new j1.b();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private static InvocationHandler b() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    public static h c() {
        return a.f32176a;
    }

    public static f d() {
        return b.f32177a;
    }

    public static ClassLoader e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.getWebViewClassLoader();
        }
        return f().getClass().getClassLoader();
    }

    private static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }
}
