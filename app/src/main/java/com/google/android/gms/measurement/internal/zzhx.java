package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzhx implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzin zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhx(zzin zzinVar, Bundle bundle) {
        this.zzb = zzinVar;
        this.zza = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzin zzinVar = this.zzb;
        Bundle bundle = this.zza;
        zzinVar.zzg();
        zzinVar.zza();
        Preconditions.checkNotNull(bundle);
        String checkNotEmpty = Preconditions.checkNotEmpty(bundle.getString("name"));
        if (!zzinVar.zzs.zzJ()) {
            zzinVar.zzs.zzaz().zzj().zza("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            zzinVar.zzs.zzt().zzE(new zzab(bundle.getString("app_id"), "", new zzll(checkNotEmpty, 0L, null, ""), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean("active"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzinVar.zzs.zzv().zzz(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), "", bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
