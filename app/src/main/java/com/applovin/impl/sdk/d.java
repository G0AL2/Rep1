package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class d implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private com.applovin.impl.sdk.utils.o f8261a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8262b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f8263c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private boolean f8264d;

    /* renamed from: e  reason: collision with root package name */
    private final m f8265e;

    /* renamed from: f  reason: collision with root package name */
    private final WeakReference<a> f8266f;

    /* renamed from: g  reason: collision with root package name */
    private long f8267g;

    /* loaded from: classes.dex */
    public interface a {
        void onAdRefresh();
    }

    public d(m mVar, a aVar) {
        this.f8266f = new WeakReference<>(aVar);
        this.f8265e = mVar;
    }

    private void i() {
        synchronized (this.f8262b) {
            com.applovin.impl.sdk.utils.o oVar = this.f8261a;
            if (oVar != null) {
                oVar.b();
            } else {
                if (v.a()) {
                    this.f8265e.A().b("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                }
                this.f8263c.set(true);
            }
        }
    }

    private void j() {
        synchronized (this.f8262b) {
            com.applovin.impl.sdk.utils.o oVar = this.f8261a;
            if (oVar != null) {
                oVar.c();
            } else {
                this.f8263c.set(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        synchronized (this.f8262b) {
            this.f8261a = null;
            if (!((Boolean) this.f8265e.a(com.applovin.impl.sdk.c.a.f8183s)).booleanValue()) {
                this.f8265e.aj().unregisterReceiver(this);
            }
        }
    }

    private void l() {
        if (((Boolean) this.f8265e.a(com.applovin.impl.sdk.c.a.f8182r)).booleanValue()) {
            i();
        }
    }

    private void m() {
        if (((Boolean) this.f8265e.a(com.applovin.impl.sdk.c.a.f8182r)).booleanValue()) {
            synchronized (this.f8262b) {
                if (this.f8264d) {
                    if (v.a()) {
                        this.f8265e.A().b("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                } else if (this.f8265e.ad().a()) {
                    if (v.a()) {
                        this.f8265e.A().b("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                    }
                } else {
                    com.applovin.impl.sdk.utils.o oVar = this.f8261a;
                    if (oVar != null) {
                        oVar.c();
                    }
                }
            }
        }
    }

    public void a(long j10) {
        synchronized (this.f8262b) {
            c();
            this.f8267g = j10;
            this.f8261a = com.applovin.impl.sdk.utils.o.a(j10, this.f8265e, new Runnable() { // from class: com.applovin.impl.sdk.d.1
                @Override // java.lang.Runnable
                public void run() {
                    d.this.k();
                    a aVar = (a) d.this.f8266f.get();
                    if (aVar != null) {
                        aVar.onAdRefresh();
                    }
                }
            });
            if (!((Boolean) this.f8265e.a(com.applovin.impl.sdk.c.a.f8183s)).booleanValue()) {
                this.f8265e.aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
                this.f8265e.aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
                this.f8265e.aj().registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                this.f8265e.aj().registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((Boolean) this.f8265e.a(com.applovin.impl.sdk.c.a.f8182r)).booleanValue() && (this.f8265e.ae().b() || this.f8265e.ad().a())) {
                this.f8261a.b();
            }
            if (this.f8263c.compareAndSet(true, false) && ((Boolean) this.f8265e.a(com.applovin.impl.sdk.c.a.f8184t)).booleanValue()) {
                if (v.a()) {
                    this.f8265e.A().b("AdRefreshManager", "Pausing refresh for a previous request.");
                }
                this.f8261a.b();
            }
        }
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f8262b) {
            z10 = this.f8261a != null;
        }
        return z10;
    }

    public long b() {
        long a10;
        synchronized (this.f8262b) {
            com.applovin.impl.sdk.utils.o oVar = this.f8261a;
            a10 = oVar != null ? oVar.a() : -1L;
        }
        return a10;
    }

    public void c() {
        synchronized (this.f8262b) {
            com.applovin.impl.sdk.utils.o oVar = this.f8261a;
            if (oVar != null) {
                oVar.d();
                k();
            }
        }
    }

    public void d() {
        synchronized (this.f8262b) {
            i();
            this.f8264d = true;
        }
    }

    public void e() {
        synchronized (this.f8262b) {
            j();
            this.f8264d = false;
        }
    }

    public boolean f() {
        return this.f8264d;
    }

    public void g() {
        if (((Boolean) this.f8265e.a(com.applovin.impl.sdk.c.a.f8181q)).booleanValue()) {
            i();
        }
    }

    public void h() {
        a aVar;
        if (((Boolean) this.f8265e.a(com.applovin.impl.sdk.c.a.f8181q)).booleanValue()) {
            synchronized (this.f8262b) {
                if (this.f8264d) {
                    if (v.a()) {
                        this.f8265e.A().b("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                } else if (this.f8265e.ae().b()) {
                    if (v.a()) {
                        this.f8265e.A().b("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                    }
                } else {
                    boolean z10 = false;
                    if (this.f8261a != null) {
                        long b10 = this.f8267g - b();
                        long longValue = ((Long) this.f8265e.a(com.applovin.impl.sdk.c.a.f8180p)).longValue();
                        if (longValue < 0 || b10 <= longValue) {
                            this.f8261a.c();
                        } else {
                            c();
                            z10 = true;
                        }
                    }
                    if (!z10 || (aVar = this.f8266f.get()) == null) {
                        return;
                    }
                    aVar.onAdRefresh();
                }
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            g();
        } else if ("com.applovin.application_resumed".equals(action)) {
            h();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            l();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            m();
        }
    }
}
