package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.util.TypedValue;
import java.io.File;
import y.h;

/* compiled from: ContextCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f2607a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f2608b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static TypedValue f2609c;

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    static class a {
        static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0049b {
        static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    static class c {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }

        static Drawable b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    static class d {
        static int a(Context context, int i10) {
            return context.getColor(i10);
        }

        static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    static class e {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static File b(Context context) {
            return context.getDataDir();
        }

        static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    static class f {
        static ComponentName a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    public static int a(Context context, String str) {
        h0.c.c(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static Context b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.a(context);
        }
        return null;
    }

    private static File c(File file) {
        synchronized (f2608b) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                Log.w("ContextCompat", "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    public static int d(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return d.a(context, i10);
        }
        return context.getResources().getColor(i10);
    }

    public static ColorStateList e(Context context, int i10) {
        return h.d(context.getResources(), i10, context.getTheme());
    }

    public static Drawable f(Context context, int i10) {
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 21) {
            return c.b(context, i10);
        }
        if (i12 >= 16) {
            return context.getResources().getDrawable(i10);
        }
        synchronized (f2607a) {
            if (f2609c == null) {
                f2609c = new TypedValue();
            }
            context.getResources().getValue(i10, f2609c, true);
            i11 = f2609c.resourceId;
        }
        return context.getResources().getDrawable(i11);
    }

    public static File[] g(Context context) {
        return Build.VERSION.SDK_INT >= 19 ? C0049b.a(context) : new File[]{context.getExternalCacheDir()};
    }

    public static File[] h(Context context, String str) {
        return Build.VERSION.SDK_INT >= 19 ? C0049b.b(context, str) : new File[]{context.getExternalFilesDir(str)};
    }

    public static File i(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return c.c(context);
        }
        return c(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    public static boolean j(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            a.a(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    public static void k(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            a.b(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    public static void l(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            f.a(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
