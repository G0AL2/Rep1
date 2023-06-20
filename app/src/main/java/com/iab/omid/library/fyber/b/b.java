package com.iab.omid.library.fyber.b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

/* loaded from: classes3.dex */
public class b implements Application.ActivityLifecycleCallbacks {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static b f24042a = new b();

    /* renamed from: b  reason: collision with root package name */
    private boolean f24043b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f24044c;

    /* renamed from: d  reason: collision with root package name */
    private a f24045d;

    /* loaded from: classes3.dex */
    public interface a {
        void a(boolean z10);
    }

    private b() {
    }

    public static b a() {
        return f24042a;
    }

    private void a(boolean z10) {
        if (this.f24044c != z10) {
            this.f24044c = z10;
            if (this.f24043b) {
                e();
                a aVar = this.f24045d;
                if (aVar != null) {
                    aVar.a(!z10);
                }
            }
        }
    }

    private void e() {
        boolean z10 = !this.f24044c;
        for (com.iab.omid.library.fyber.adsession.a aVar : com.iab.omid.library.fyber.b.a.a().b()) {
            aVar.getAdSessionStatePublisher().a(z10);
        }
    }

    public void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public void a(a aVar) {
        this.f24045d = aVar;
    }

    public void b() {
        this.f24043b = true;
        this.f24044c = false;
        e();
    }

    public void c() {
        this.f24043b = false;
        this.f24044c = false;
        this.f24045d = null;
    }

    ActivityManager.RunningAppProcessInfo d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        View e10;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z10 = true;
            boolean z11 = d().importance != 100;
            boolean z12 = true;
            for (com.iab.omid.library.fyber.adsession.a aVar : com.iab.omid.library.fyber.b.a.a().c()) {
                if (aVar.f() && (e10 = aVar.e()) != null && e10.hasWindowFocus()) {
                    z12 = false;
                }
            }
            a((z11 && z12) ? false : false);
        }
    }
}
