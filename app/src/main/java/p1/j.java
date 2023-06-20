package p1;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: NetworkApi21.kt */
/* loaded from: classes.dex */
public final class j {
    public static final NetworkCapabilities a(ConnectivityManager connectivityManager, Network network) {
        qe.k.f(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final boolean b(NetworkCapabilities networkCapabilities, int i10) {
        qe.k.f(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i10);
    }

    public static final void c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        qe.k.f(connectivityManager, "<this>");
        qe.k.f(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
