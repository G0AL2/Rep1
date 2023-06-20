package p1;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* compiled from: ProcessUtils.kt */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final String f35458a;

    static {
        String i10 = androidx.work.l.i("ProcessUtils");
        qe.k.e(i10, "tagWithPrefix(\"ProcessUtils\")");
        f35458a = i10;
    }

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    private static final String a(Context context) {
        Object obj;
        boolean z10;
        Object invoke;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return a.f35425a.a();
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread", false, androidx.work.v.class.getClassLoader());
            if (i10 >= 18) {
                Method declaredMethod = cls.getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                invoke = declaredMethod.invoke(null, new Object[0]);
                qe.k.c(invoke);
            } else {
                Method declaredMethod2 = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = cls.getDeclaredMethod("getProcessName", new Class[0]);
                declaredMethod3.setAccessible(true);
                invoke = declaredMethod3.invoke(declaredMethod2.invoke(null, new Object[0]), new Object[0]);
                qe.k.c(invoke);
            }
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th) {
            androidx.work.l.e().b(f35458a, "Unable to check ActivityThread for processName", th);
        }
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        qe.k.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<T> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
            if (runningAppProcessInfo != null) {
                return runningAppProcessInfo.processName;
            }
            return null;
        }
        return null;
    }

    public static final boolean b(Context context, androidx.work.b bVar) {
        qe.k.f(context, "context");
        qe.k.f(bVar, "configuration");
        String a10 = a(context);
        String c10 = bVar.c();
        if (!(c10 == null || c10.length() == 0)) {
            return qe.k.a(a10, bVar.c());
        }
        return qe.k.a(a10, context.getApplicationInfo().processName);
    }
}
