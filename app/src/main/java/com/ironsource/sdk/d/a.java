package com.ironsource.sdk.d;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ironsource.sdk.utils.SDKUtils;

/* loaded from: classes3.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private c f28042a;

    public a(c cVar) {
        this.f28042a = cVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (SDKUtils.isIronSourceActivity(activity)) {
            return;
        }
        this.f28042a.d(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (SDKUtils.isIronSourceActivity(activity)) {
            return;
        }
        this.f28042a.e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
