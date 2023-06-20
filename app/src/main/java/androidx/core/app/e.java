package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: BundleCompat.java */
/* loaded from: classes.dex */
public final class e {

    /* compiled from: BundleCompat.java */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Method f2504a;

        /* renamed from: b  reason: collision with root package name */
        private static boolean f2505b;

        /* renamed from: c  reason: collision with root package name */
        private static Method f2506c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f2507d;

        public static IBinder a(Bundle bundle, String str) {
            if (!f2505b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f2504a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e10) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e10);
                }
                f2505b = true;
            }
            Method method2 = f2504a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e11);
                    f2504a = null;
                }
            }
            return null;
        }

        public static void b(Bundle bundle, String str, IBinder iBinder) {
            if (!f2507d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    f2506c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e10) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e10);
                }
                f2507d = true;
            }
            Method method2 = f2506c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e11);
                    f2506c = null;
                }
            }
        }
    }

    public static IBinder a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return a.a(bundle, str);
    }

    public static void b(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            a.b(bundle, str, iBinder);
        }
    }
}
