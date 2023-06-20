package com.fyber.inneractive.sdk.bidder;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.k;
import com.fyber.inneractive.sdk.util.k0;

/* loaded from: classes.dex */
public class b extends ConnectivityManager.NetworkCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f16789a;

    public b(a aVar) {
        this.f16789a = aVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        k0 k0Var = k0.UNKNOWN;
        if (networkCapabilities.hasTransport(3)) {
            k0Var = k0.ETHERNET;
        } else if (networkCapabilities.hasTransport(0)) {
            k0Var = k.i() == 13 ? k0.MOBILE_4G : k0.MOBILE_3G;
        } else if (networkCapabilities.hasTransport(1)) {
            k0Var = k0.WIFI;
        }
        if (TextUtils.equals(this.f16789a.f16744c.f16807r, k0Var.f20300a)) {
            return;
        }
        a aVar = this.f16789a;
        aVar.f16744c.f16807r = k0Var.f20300a;
        aVar.b();
    }
}
