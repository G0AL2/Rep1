package n1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* compiled from: NetworkStateTracker.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f34617a;

    static {
        String i10 = androidx.work.l.i("NetworkStateTracker");
        qe.k.e(i10, "tagWithPrefix(\"NetworkStateTracker\")");
        f34617a = i10;
    }

    public static final h<l1.b> a(Context context, q1.c cVar) {
        qe.k.f(context, "context");
        qe.k.f(cVar, "taskExecutor");
        if (Build.VERSION.SDK_INT >= 24) {
            return new j(context, cVar);
        }
        return new l(context, cVar);
    }

    public static final l1.b c(ConnectivityManager connectivityManager) {
        qe.k.f(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = true;
        return new l1.b(activeNetworkInfo != null && activeNetworkInfo.isConnected(), d(connectivityManager), d0.a.a(connectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : false);
    }

    public static final boolean d(ConnectivityManager connectivityManager) {
        qe.k.f(connectivityManager, "<this>");
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities a10 = p1.j.a(connectivityManager, p1.k.a(connectivityManager));
            if (a10 != null) {
                return p1.j.b(a10, 16);
            }
            return false;
        } catch (SecurityException e10) {
            androidx.work.l.e().d(f34617a, "Unable to validate active network", e10);
            return false;
        }
    }
}
