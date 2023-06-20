package org.wonday.orientation;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: OrientationActivityLifecycle.java */
/* loaded from: classes3.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b  reason: collision with root package name */
    private static AtomicInteger f35288b = new AtomicInteger(0);

    /* renamed from: c  reason: collision with root package name */
    private static a f35289c;

    /* renamed from: a  reason: collision with root package name */
    private b f35290a;

    private a() {
    }

    public static a a() {
        if (f35289c == null) {
            f35289c = new a();
        }
        return f35289c;
    }

    public void b(b bVar) {
        this.f35290a = bVar;
        if (f35288b.get() == 1) {
            this.f35290a.start();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Log.d("OrientationModule", "onActivityCreated");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        b bVar;
        Log.d("OrientationModule", "onActivityDestroyed");
        if (f35288b.get() != 0 || (bVar = this.f35290a) == null) {
            return;
        }
        bVar.release();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Log.d("OrientationModule", "onActivityPaused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Log.d("OrientationModule", "onActivityResumed");
        if (f35288b.incrementAndGet() != 1 || this.f35290a == null) {
            return;
        }
        Log.d("OrientationModule", "Start orientation");
        this.f35290a.start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Log.d("OrientationModule", "onActivitySaveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Log.d("OrientationModule", "onActivityStarted");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        b bVar;
        Log.d("OrientationModule", "onActivityStopped");
        if (f35288b.decrementAndGet() != 0 || (bVar = this.f35290a) == null) {
            return;
        }
        bVar.stop();
    }
}
