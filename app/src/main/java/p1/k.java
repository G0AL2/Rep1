package p1;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: NetworkApi23.kt */
/* loaded from: classes.dex */
public final class k {
    public static final Network a(ConnectivityManager connectivityManager) {
        qe.k.f(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
