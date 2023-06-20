package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaop implements zzaor {
    final /* synthetic */ Activity zza;
    final /* synthetic */ Bundle zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaop(zzaos zzaosVar, Activity activity, Bundle bundle) {
        this.zza = activity;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.zza, this.zzb);
    }
}
