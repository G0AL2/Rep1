package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.Map;

/* loaded from: classes.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private final m f8120a;

    /* renamed from: b  reason: collision with root package name */
    private final a f8121b;

    /* renamed from: c  reason: collision with root package name */
    private com.applovin.impl.sdk.utils.o f8122c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f8123d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private long f8124e;

    /* loaded from: classes.dex */
    public interface a {
        void onAdExpired();
    }

    public b(m mVar, a aVar) {
        this.f8120a = mVar;
        this.f8121b = aVar;
    }

    private void b() {
        com.applovin.impl.sdk.utils.o oVar = this.f8122c;
        if (oVar != null) {
            oVar.d();
            this.f8122c = null;
        }
    }

    private void c() {
        synchronized (this.f8123d) {
            b();
        }
    }

    private void d() {
        boolean z10;
        synchronized (this.f8123d) {
            long currentTimeMillis = this.f8124e - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                a();
                z10 = true;
            } else {
                a(currentTimeMillis);
                z10 = false;
            }
        }
        if (z10) {
            this.f8121b.onAdExpired();
        }
    }

    public void a() {
        synchronized (this.f8123d) {
            b();
            this.f8120a.aj().unregisterReceiver(this);
        }
    }

    public void a(long j10) {
        synchronized (this.f8123d) {
            a();
            this.f8124e = System.currentTimeMillis() + j10;
            this.f8120a.aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
            this.f8120a.aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
            if (((Boolean) this.f8120a.a(com.applovin.impl.sdk.c.a.E)).booleanValue() || !this.f8120a.ad().a()) {
                this.f8122c = com.applovin.impl.sdk.utils.o.a(j10, this.f8120a, new Runnable() { // from class: com.applovin.impl.sdk.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.a();
                        b.this.f8121b.onAdExpired();
                    }
                });
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            c();
        } else if ("com.applovin.application_resumed".equals(action)) {
            d();
        }
    }
}
