package jd;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.ReactApplicationContext;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: NetworkCallbackConnectivityReceiver.java */
@TargetApi(24)
/* loaded from: classes3.dex */
public class f extends jd.b {

    /* renamed from: j */
    private final b f33096j;

    /* renamed from: k */
    private Network f33097k;

    /* renamed from: l */
    private NetworkCapabilities f33098l;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NetworkCallbackConnectivityReceiver.java */
    /* loaded from: classes3.dex */
    public class b extends ConnectivityManager.NetworkCallback {
        private b() {
            f.this = r1;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            f.this.f33097k = network;
            f.this.p(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            f.this.f33097k = network;
            f.this.f33098l = networkCapabilities;
            f.this.r();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (f.this.f33097k != null) {
                f.this.f33097k = network;
            }
            f.this.p(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i10) {
            f.this.f33097k = network;
            f.this.r();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            f.this.f33097k = null;
            f.this.f33098l = null;
            f.this.r();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            f.this.f33097k = null;
            f.this.f33098l = null;
            f.this.r();
        }
    }

    public f(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f33097k = null;
        this.f33098l = null;
        this.f33096j = new b();
    }

    public static /* synthetic */ void k(f fVar) {
        fVar.q();
    }

    public void p(int i10) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: jd.e
            @Override // java.lang.Runnable
            public final void run() {
                f.k(f.this);
            }
        }, i10);
    }

    public /* synthetic */ void q() {
        this.f33098l = c().getNetworkCapabilities(this.f33097k);
        r();
    }

    @Override // jd.b
    @SuppressLint({"MissingPermission"})
    public void f() {
        try {
            this.f33097k = c().getActiveNetwork();
            p(0);
            c().registerDefaultNetworkCallback(this.f33096j);
        } catch (SecurityException unused) {
        }
    }

    @Override // jd.b
    public void i() {
        try {
            c().unregisterNetworkCallback(this.f33096j);
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    @SuppressLint({"MissingPermission"})
    void r() {
        boolean z10;
        kd.b bVar = kd.b.UNKNOWN;
        Network network = this.f33097k;
        NetworkCapabilities networkCapabilities = this.f33098l;
        kd.a aVar = null;
        boolean z11 = false;
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(2)) {
                bVar = kd.b.BLUETOOTH;
            } else if (networkCapabilities.hasTransport(0)) {
                bVar = kd.b.CELLULAR;
            } else if (networkCapabilities.hasTransport(3)) {
                bVar = kd.b.ETHERNET;
            } else if (networkCapabilities.hasTransport(1)) {
                bVar = kd.b.WIFI;
            } else if (networkCapabilities.hasTransport(4)) {
                bVar = kd.b.VPN;
            }
            NetworkInfo networkInfo = network != null ? c().getNetworkInfo(network) : null;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = !networkCapabilities.hasCapability(21);
            } else {
                z10 = (network == null || networkInfo == null || networkInfo.getDetailedState().equals(NetworkInfo.DetailedState.CONNECTED)) ? false : true;
            }
            if (networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16) && !z10) {
                z11 = true;
            }
            if (network != null && bVar == kd.b.CELLULAR && z11) {
                aVar = kd.a.g(networkInfo);
            }
        } else {
            bVar = kd.b.NONE;
        }
        j(bVar, aVar, z11);
    }
}
