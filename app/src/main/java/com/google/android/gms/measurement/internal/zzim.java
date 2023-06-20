package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
@TargetApi(14)
/* loaded from: classes2.dex */
public final class zzim implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzin zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzim(zzin zzinVar, zzil zzilVar) {
        this.zza = zzinVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzgi zzgiVar;
        try {
            try {
                this.zza.zzs.zzaz().zzj().zza("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    zzgiVar = this.zza.zzs;
                } else {
                    Uri data = intent.getData();
                    if (data != null && data.isHierarchical()) {
                        this.zza.zzs.zzv();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z10 = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z10 = false;
                        }
                        this.zza.zzs.zzaA().zzp(new zzik(this, z10, data, str, queryParameter));
                        zzgiVar = this.zza.zzs;
                    }
                    zzgiVar = this.zza.zzs;
                }
            } catch (RuntimeException e10) {
                this.zza.zzs.zzaz().zzd().zzb("Throwable caught in onActivityCreated", e10);
                zzgiVar = this.zza.zzs;
            }
            zzgiVar.zzs().zzr(activity, bundle);
        } catch (Throwable th) {
            this.zza.zzs.zzs().zzr(activity, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzs.zzs().zzs(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.zza.zzs.zzs().zzt(activity);
        zzkr zzu = this.zza.zzs.zzu();
        zzu.zzs.zzaA().zzp(new zzkk(zzu, zzu.zzs.zzaw().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzkr zzu = this.zza.zzs.zzu();
        zzu.zzs.zzaA().zzp(new zzkj(zzu, zzu.zzs.zzaw().elapsedRealtime()));
        this.zza.zzs.zzs().zzu(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzs.zzs().zzv(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
