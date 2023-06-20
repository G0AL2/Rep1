package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.d;
import com.inmobi.media.g;

/* compiled from: ChromeTabManager.java */
/* loaded from: classes3.dex */
public final class co implements Application.ActivityLifecycleCallbacks, g.a {

    /* renamed from: a  reason: collision with root package name */
    private final g f24946a;

    /* renamed from: b  reason: collision with root package name */
    private String f24947b;

    /* renamed from: c  reason: collision with root package name */
    private Context f24948c;

    /* renamed from: d  reason: collision with root package name */
    private f f24949d;

    public co(String str, Context context, f fVar) {
        this.f24947b = str;
        g gVar = new g();
        this.f24946a = gVar;
        gVar.f25522c = this;
        this.f24948c = context.getApplicationContext();
        this.f24949d = fVar;
        ho.a(context, this);
    }

    @Override // com.inmobi.media.g.a
    public final void a() {
        Uri parse = Uri.parse(this.f24947b);
        final g gVar = this.f24946a;
        androidx.browser.customtabs.c cVar = gVar.f25520a;
        d.a aVar = new d.a(cVar == null ? null : cVar.c(new androidx.browser.customtabs.b() { // from class: com.inmobi.media.g.1
            @Override // androidx.browser.customtabs.b
            public final void onNavigationEvent(int i10, Bundle bundle) {
                super.onNavigationEvent(i10, bundle);
                String unused = g.f25519d;
                if (gVar.f25522c != null) {
                    gVar.f25522c.a(i10);
                }
            }
        }));
        aVar.b();
        g.a(this.f24948c, aVar.a(), parse, this.f24949d);
    }

    public final void b() {
        this.f24946a.a(this.f24948c);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        g gVar = this.f24946a;
        Context context = this.f24948c;
        androidx.browser.customtabs.e eVar = gVar.f25521b;
        if (eVar != null) {
            context.unbindService(eVar);
            gVar.f25520a = null;
            gVar.f25521b = null;
        }
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
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

    @Override // com.inmobi.media.g.a
    public final void a(int i10) {
        if (i10 == 5) {
            this.f24949d.a();
        } else if (i10 != 6) {
        } else {
            this.f24949d.b();
        }
    }
}
