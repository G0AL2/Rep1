package com.fyber.inneractive.sdk.player.controller;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class m implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f17940a;

    public m(k kVar) {
        this.f17940a = kVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (activity.equals(this.f17940a.f17917d.getContext())) {
            com.fyber.inneractive.sdk.player.ui.i iVar = this.f17940a.f17917d;
            iVar.f19771h = true;
            if (iVar.F != null) {
                IAlog.a("Autoclick paused", new Object[0]);
                iVar.F.a();
            }
            this.f17940a.f17917d.b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (activity.equals(this.f17940a.f17917d.getContext())) {
            com.fyber.inneractive.sdk.player.ui.i iVar = this.f17940a.f17917d;
            iVar.f19771h = false;
            if (iVar.F != null) {
                IAlog.a("Autoclick resumed", new Object[0]);
                iVar.F.b();
            }
            this.f17940a.f17917d.b();
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
