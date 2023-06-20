package p1;

import android.net.ConnectivityManager;

/* compiled from: NetworkApi24.kt */
/* loaded from: classes.dex */
public final class l {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        qe.k.f(connectivityManager, "<this>");
        qe.k.f(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
