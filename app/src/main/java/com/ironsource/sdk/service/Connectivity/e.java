package com.ironsource.sdk.service.Connectivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private String f28223a = e.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private int f28224b = 23;

    /* renamed from: c  reason: collision with root package name */
    private final d f28225c;

    /* renamed from: d  reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f28226d;

    /* loaded from: classes3.dex */
    final class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ Context f28227a;

        a(Context context) {
            this.f28227a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            if (network != null) {
                d dVar = e.this.f28225c;
                String a10 = com.ironsource.d.a.a(network, this.f28227a);
                com.ironsource.d.a.a(this.f28227a, network);
                dVar.a(a10);
                return;
            }
            d dVar2 = e.this.f28225c;
            String a11 = com.ironsource.d.a.a(this.f28227a);
            Context context = this.f28227a;
            com.ironsource.d.a.a(context, com.ironsource.d.a.b(context));
            dVar2.a(a11);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                e.this.f28225c.a(com.ironsource.d.a.a(network, this.f28227a), com.ironsource.d.a.a(this.f28227a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                e.this.f28225c.a(com.ironsource.d.a.a(network, this.f28227a), com.ironsource.d.a.a(this.f28227a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            if (com.ironsource.d.a.a(this.f28227a).equals("none")) {
                e.this.f28225c.a();
            }
        }
    }

    public e(d dVar) {
        this.f28225c = dVar;
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final void a() {
        this.f28226d = null;
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    @SuppressLint({"NewApi", "MissingPermission"})
    public final void a(Context context) {
        if (Build.VERSION.SDK_INT >= this.f28224b) {
            b(context);
            if (com.ironsource.d.a.a(context).equals("none")) {
                this.f28225c.a();
            }
            if (this.f28226d == null) {
                this.f28226d = new a(context);
            }
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(build, this.f28226d);
                }
            } catch (Exception unused) {
                Log.e(this.f28223a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    @SuppressLint({"NewApi"})
    public final void b(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.f28224b || this.f28226d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.f28226d);
        } catch (Exception unused) {
            Log.e(this.f28223a, "NetworkCallback for was not registered or already unregistered");
        }
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final JSONObject c(Context context) {
        return com.ironsource.d.a.a(context, com.ironsource.d.a.b(context));
    }
}
