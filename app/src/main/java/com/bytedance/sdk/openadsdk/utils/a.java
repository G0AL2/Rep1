package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ActivityLifecycleListener.java */
/* loaded from: classes.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f13539a = false;

    /* renamed from: b  reason: collision with root package name */
    public static long f13540b;

    /* renamed from: c  reason: collision with root package name */
    public static long f13541c;

    /* renamed from: d  reason: collision with root package name */
    private AtomicInteger f13542d = new AtomicInteger(0);

    /* renamed from: e  reason: collision with root package name */
    private AtomicBoolean f13543e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private HashSet<Integer> f13544f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final RunnableC0186a f13545g = new RunnableC0186a();

    /* renamed from: h  reason: collision with root package name */
    private volatile CopyOnWriteArrayList<com.bytedance.sdk.component.adexpress.a> f13546h = new CopyOnWriteArrayList<>();

    /* compiled from: ActivityLifecycleListener.java */
    /* renamed from: com.bytedance.sdk.openadsdk.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class RunnableC0186a implements Runnable {
        RunnableC0186a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.f.e.b().execute(new com.bytedance.sdk.component.f.g("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.a.a.1
                @Override // java.lang.Runnable
                public void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (activity != null) {
            this.f13544f.remove(Integer.valueOf(activity.hashCode()));
        }
        if (this.f13546h == null || this.f13546h.size() <= 0) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.a> it = this.f13546h.iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.a next = it.next();
            if (next != null) {
                next.a(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        com.bytedance.sdk.component.f.e.a(new com.bytedance.sdk.component.f.g("AppConfig_onActivityResume") { // from class: com.bytedance.sdk.openadsdk.utils.a.2
            @Override // java.lang.Runnable
            public void run() {
                Handler c10 = com.bytedance.sdk.openadsdk.core.k.c();
                Message obtain = Message.obtain(c10, a.this.f13545g);
                obtain.what = 1001;
                c10.sendMessageDelayed(obtain, 30000L);
            }
        }, 5);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(final Activity activity) {
        com.bytedance.sdk.component.f.e.a(new com.bytedance.sdk.component.f.g("AppConfig_onActivityResume") { // from class: com.bytedance.sdk.openadsdk.utils.a.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.k.c().removeMessages(1001);
                if (activity == null) {
                    return;
                }
                a.this.f13544f.add(Integer.valueOf(activity.hashCode()));
                com.bytedance.sdk.component.e.c.a.b(activity);
            }
        }, 5);
        if (f13539a) {
            return;
        }
        f13540b = System.currentTimeMillis();
        f13539a = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (this.f13542d.incrementAndGet() > 0) {
            this.f13543e.set(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.f13542d.decrementAndGet() == 0) {
            this.f13543e.set(true);
        }
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(com.bytedance.sdk.component.adexpress.a aVar) {
        this.f13546h.add(new WeakReference(aVar).get());
    }

    public boolean b(com.bytedance.sdk.component.adexpress.a aVar) {
        return this.f13546h.remove(new WeakReference(aVar).get());
    }

    private void b() {
        com.bytedance.sdk.component.f.e.b(new com.bytedance.sdk.component.f.g("reportSdkUseTime") { // from class: com.bytedance.sdk.openadsdk.utils.a.3
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.a()) {
                    a.f13539a = false;
                    a.f13541c = System.currentTimeMillis();
                    com.bytedance.sdk.openadsdk.h.b.a().a(a.f13540b / 1000, a.f13541c / 1000, !com.bytedance.sdk.openadsdk.core.k.f12489b.get());
                    com.bytedance.sdk.openadsdk.core.k.f12489b.set(false);
                }
            }
        });
    }

    public boolean a() {
        return this.f13543e.get();
    }
}
