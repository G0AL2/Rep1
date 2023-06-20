package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class y {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f8964b = new AtomicBoolean();

    /* renamed from: a  reason: collision with root package name */
    final m f8965a;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f8966c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f8967d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    private final AtomicInteger f8968e = new AtomicInteger();

    /* renamed from: f  reason: collision with root package name */
    private Date f8969f;

    /* renamed from: g  reason: collision with root package name */
    private Date f8970g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(final m mVar) {
        this.f8965a = mVar;
        final Application application = (Application) mVar.L();
        application.registerActivityLifecycleCallbacks(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.y.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                super.onActivityResumed(activity);
                y.this.e();
            }
        });
        application.registerComponentCallbacks(new ComponentCallbacks2() { // from class: com.applovin.impl.sdk.y.2
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int i10) {
                y.this.f8968e.set(i10);
                if (i10 == 20) {
                    y.this.f();
                }
            }
        });
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new BroadcastReceiver() { // from class: com.applovin.impl.sdk.y.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.USER_PRESENT".equals(action)) {
                    if (Utils.isCurrentProcessInForeground()) {
                        y.this.e();
                    }
                } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    y.this.f();
                }
            }
        }, intentFilter);
        if (((Boolean) mVar.a(com.applovin.impl.sdk.c.b.cp)).booleanValue() && f8964b.compareAndSet(false, true)) {
            final Intent intent = new Intent(application, AppKilledService.class);
            application.startService(intent);
            mVar.aj().registerReceiver(new AppLovinBroadcastManager.Receiver() { // from class: com.applovin.impl.sdk.y.4
                @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
                public void onReceive(Context context, Intent intent2, Map<String, Object> map) {
                    application.stopService(intent);
                    mVar.aj().unregisterReceiver(this);
                }
            }, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f8967d.compareAndSet(true, false)) {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f8967d.compareAndSet(false, true)) {
            g();
        }
    }

    private void g() {
        if (v.a()) {
            this.f8965a.A().b("SessionTracker", "Application Paused");
        }
        this.f8965a.aj().sendBroadcastSync(new Intent("com.applovin.application_paused"), null);
        if (this.f8966c.get()) {
            return;
        }
        boolean booleanValue = ((Boolean) this.f8965a.a(com.applovin.impl.sdk.c.b.dl)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f8965a.a(com.applovin.impl.sdk.c.b.dn)).longValue());
        if (this.f8969f == null || System.currentTimeMillis() - this.f8969f.getTime() >= millis) {
            ((EventServiceImpl) this.f8965a.w()).trackEvent("paused");
            if (booleanValue) {
                this.f8969f = new Date();
            }
        }
        if (booleanValue) {
            return;
        }
        this.f8969f = new Date();
    }

    private void h() {
        if (v.a()) {
            this.f8965a.A().b("SessionTracker", "Application Resumed");
        }
        boolean booleanValue = ((Boolean) this.f8965a.a(com.applovin.impl.sdk.c.b.dl)).booleanValue();
        long longValue = ((Long) this.f8965a.a(com.applovin.impl.sdk.c.b.dm)).longValue();
        this.f8965a.aj().sendBroadcastSync(new Intent("com.applovin.application_resumed"), null);
        if (this.f8966c.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(longValue);
        if (this.f8970g == null || System.currentTimeMillis() - this.f8970g.getTime() >= millis) {
            ((EventServiceImpl) this.f8965a.w()).trackEvent("resumed");
            if (booleanValue) {
                this.f8970g = new Date();
            }
        }
        if (!booleanValue) {
            this.f8970g = new Date();
        }
        this.f8965a.T().a(com.applovin.impl.sdk.d.f.f8328k);
    }

    public boolean a() {
        return this.f8967d.get();
    }

    public int b() {
        return this.f8968e.get();
    }

    public void c() {
        this.f8966c.set(true);
    }

    public void d() {
        this.f8966c.set(false);
    }
}
