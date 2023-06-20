package jd;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import com.facebook.react.bridge.ReactApplicationContext;

/* compiled from: BroadcastReceiverConnectivityReceiver.java */
/* loaded from: classes3.dex */
public class a extends jd.b {

    /* renamed from: j  reason: collision with root package name */
    private final b f33083j;

    /* compiled from: BroadcastReceiverConnectivityReceiver.java */
    /* loaded from: classes3.dex */
    private class b extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private boolean f33084a;

        private b() {
            this.f33084a = false;
        }

        public boolean a() {
            return this.f33084a;
        }

        public void b(boolean z10) {
            this.f33084a = z10;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action == null || !action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            a.this.l();
        }
    }

    public a(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f33083j = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public void l() {
        NetworkInfo activeNetworkInfo;
        kd.b bVar = kd.b.UNKNOWN;
        kd.a aVar = null;
        boolean z10 = false;
        try {
            activeNetworkInfo = c().getActiveNetworkInfo();
        } catch (SecurityException unused) {
            bVar = kd.b.UNKNOWN;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z10 = activeNetworkInfo.isConnected();
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    bVar = kd.b.WIFI;
                } else if (type != 4) {
                    if (type == 9) {
                        bVar = kd.b.ETHERNET;
                    } else if (type == 17) {
                        bVar = kd.b.VPN;
                    } else if (type == 6) {
                        bVar = kd.b.WIMAX;
                    } else if (type == 7) {
                        bVar = kd.b.BLUETOOTH;
                    }
                }
                j(bVar, aVar, z10);
            }
            bVar = kd.b.CELLULAR;
            aVar = kd.a.g(activeNetworkInfo);
            j(bVar, aVar, z10);
        }
        bVar = kd.b.NONE;
        j(bVar, aVar, z10);
    }

    @Override // jd.b
    public void f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        e().registerReceiver(this.f33083j, intentFilter);
        this.f33083j.b(true);
        l();
    }

    @Override // jd.b
    public void i() {
        if (this.f33083j.a()) {
            e().unregisterReceiver(this.f33083j);
            this.f33083j.b(false);
        }
    }
}
