package com.reactnativecommunity.netinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;

/* compiled from: AmazonFireDeviceConnectivityPoller.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private final Context f28311b;

    /* renamed from: c  reason: collision with root package name */
    private final b f28312c;

    /* renamed from: e  reason: collision with root package name */
    private Handler f28314e;

    /* renamed from: a  reason: collision with root package name */
    private final d f28310a = new d();

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f28313d = new c();

    /* renamed from: f  reason: collision with root package name */
    private boolean f28315f = false;

    /* compiled from: AmazonFireDeviceConnectivityPoller.java */
    /* loaded from: classes3.dex */
    public interface b {
        void onAmazonFireDeviceConnectivityChanged(boolean z10);
    }

    /* compiled from: AmazonFireDeviceConnectivityPoller.java */
    /* loaded from: classes3.dex */
    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f28315f) {
                a.this.f28311b.sendBroadcast(new Intent("com.amazon.tv.networkmonitor.CONNECTIVITY_CHECK"));
                a.this.f28314e.postDelayed(a.this.f28313d, 10000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AmazonFireDeviceConnectivityPoller.java */
    /* loaded from: classes3.dex */
    public class d extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        boolean f28317a;

        /* renamed from: b  reason: collision with root package name */
        private Boolean f28318b;

        private d() {
            this.f28317a = false;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z10;
            String action = intent == null ? null : intent.getAction();
            if ("com.amazon.tv.networkmonitor.INTERNET_DOWN".equals(action)) {
                z10 = false;
            } else if (!"com.amazon.tv.networkmonitor.INTERNET_UP".equals(action)) {
                return;
            } else {
                z10 = true;
            }
            Boolean bool = this.f28318b;
            if (bool == null || bool.booleanValue() != z10) {
                this.f28318b = Boolean.valueOf(z10);
                a.this.f28312c.onAmazonFireDeviceConnectivityChanged(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, b bVar) {
        this.f28311b = context;
        this.f28312c = bVar;
    }

    private boolean f() {
        if (Build.MANUFACTURER.equals("Amazon")) {
            String str = Build.MODEL;
            if (str.startsWith("AF") || str.startsWith("KF")) {
                return true;
            }
        }
        return false;
    }

    private void h() {
        if (this.f28310a.f28317a) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_DOWN");
        intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_UP");
        this.f28311b.registerReceiver(this.f28310a, intentFilter);
        this.f28310a.f28317a = true;
    }

    private void i() {
        if (this.f28315f) {
            return;
        }
        Handler handler = new Handler();
        this.f28314e = handler;
        this.f28315f = true;
        handler.post(this.f28313d);
    }

    private void j() {
        if (this.f28315f) {
            this.f28315f = false;
            this.f28314e.removeCallbacksAndMessages(null);
            this.f28314e = null;
        }
    }

    private void l() {
        d dVar = this.f28310a;
        if (dVar.f28317a) {
            this.f28311b.unregisterReceiver(dVar);
            this.f28310a.f28317a = false;
        }
    }

    public void g() {
        if (f()) {
            h();
            i();
        }
    }

    public void k() {
        if (f()) {
            j();
            l();
        }
    }
}
