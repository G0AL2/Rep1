package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final List<com.applovin.impl.sdk.utils.a> f7985a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Activity> f7986b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<Activity> f7987c;

    public a(Context context) {
        this.f7986b = new WeakReference<>(null);
        this.f7987c = new WeakReference<>(null);
        if (v.a()) {
            v.f("AppLovinSdk", "Attaching Activity lifecycle manager...");
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f7986b = new WeakReference<>(activity);
            if (activity.hasWindowFocus()) {
                this.f7987c = this.f7986b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public Activity a() {
        return this.f7986b.get();
    }

    public void a(com.applovin.impl.sdk.utils.a aVar) {
        this.f7985a.add(aVar);
    }

    public Activity b() {
        return this.f7987c.get();
    }

    public void b(com.applovin.impl.sdk.utils.a aVar) {
        this.f7985a.remove(aVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        for (com.applovin.impl.sdk.utils.a aVar : new ArrayList(this.f7985a)) {
            aVar.onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        for (com.applovin.impl.sdk.utils.a aVar : new ArrayList(this.f7985a)) {
            aVar.onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f7987c = new WeakReference<>(null);
        for (com.applovin.impl.sdk.utils.a aVar : new ArrayList(this.f7985a)) {
            aVar.onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        this.f7986b = weakReference;
        this.f7987c = weakReference;
        for (com.applovin.impl.sdk.utils.a aVar : new ArrayList(this.f7985a)) {
            aVar.onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (com.applovin.impl.sdk.utils.a aVar : new ArrayList(this.f7985a)) {
            aVar.onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        for (com.applovin.impl.sdk.utils.a aVar : new ArrayList(this.f7985a)) {
            aVar.onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        for (com.applovin.impl.sdk.utils.a aVar : new ArrayList(this.f7985a)) {
            aVar.onActivityStopped(activity);
        }
    }
}
