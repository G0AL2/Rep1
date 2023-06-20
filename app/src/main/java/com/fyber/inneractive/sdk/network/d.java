package com.fyber.inneractive.sdk.network;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import com.fyber.inneractive.sdk.network.c;

/* loaded from: classes.dex */
public class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f17542a;

    public d(c cVar) {
        this.f17542a = cVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        c cVar = this.f17542a;
        Handler handler = cVar.f17528d;
        if (handler != null) {
            handler.post(new c.a(20150330, 3500L));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Handler handler = this.f17542a.f17528d;
        if (handler != null) {
            handler.removeMessages(20150330);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
