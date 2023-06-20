package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
final class c {

    /* renamed from: a  reason: collision with root package name */
    protected static final Class<?> f2485a;

    /* renamed from: b  reason: collision with root package name */
    protected static final Field f2486b;

    /* renamed from: c  reason: collision with root package name */
    protected static final Field f2487c;

    /* renamed from: d  reason: collision with root package name */
    protected static final Method f2488d;

    /* renamed from: e  reason: collision with root package name */
    protected static final Method f2489e;

    /* renamed from: f  reason: collision with root package name */
    protected static final Method f2490f;

    /* renamed from: g  reason: collision with root package name */
    private static final Handler f2491g = new Handler(Looper.getMainLooper());

    /* compiled from: ActivityRecreator.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f2492a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f2493b;

        a(d dVar, Object obj) {
            this.f2492a = dVar;
            this.f2493b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2492a.f2498a = this.f2493b;
        }
    }

    /* compiled from: ActivityRecreator.java */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Application f2494a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f2495b;

        b(Application application, d dVar) {
            this.f2494a = application;
            this.f2495b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2494a.unregisterActivityLifecycleCallbacks(this.f2495b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityRecreator.java */
    /* renamed from: androidx.core.app.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0047c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f2496a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f2497b;

        RunnableC0047c(Object obj, Object obj2) {
            this.f2496a = obj;
            this.f2497b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = c.f2488d;
                if (method != null) {
                    method.invoke(this.f2496a, this.f2497b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    c.f2489e.invoke(this.f2496a, this.f2497b, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* compiled from: ActivityRecreator.java */
    /* loaded from: classes.dex */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        Object f2498a;

        /* renamed from: b  reason: collision with root package name */
        private Activity f2499b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2500c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f2501d = false;

        /* renamed from: e  reason: collision with root package name */
        private boolean f2502e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f2503f = false;

        d(Activity activity) {
            this.f2499b = activity;
            this.f2500c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f2499b == activity) {
                this.f2499b = null;
                this.f2502e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f2502e || this.f2503f || this.f2501d || !c.h(this.f2498a, this.f2500c, activity)) {
                return;
            }
            this.f2503f = true;
            this.f2498a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f2499b == activity) {
                this.f2501d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a10 = a();
        f2485a = a10;
        f2486b = b();
        f2487c = f();
        f2488d = d(a10);
        f2489e = c(a10);
        f2490f = e(a10);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f2487c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f2491g.postAtFrontOfQueue(new RunnableC0047c(f2486b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f2490f == null) {
            return false;
        } else {
            if (f2489e == null && f2488d == null) {
                return false;
            }
            try {
                Object obj2 = f2487c.get(activity);
                if (obj2 == null || (obj = f2486b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                d dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f2491g;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = f2490f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
