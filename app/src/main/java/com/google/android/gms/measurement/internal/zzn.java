package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzn implements zzhi {
    public final com.google.android.gms.internal.measurement.zzci zza;
    final /* synthetic */ AppMeasurementDynamiteService zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzci zzciVar) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzciVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhi
    public final void interceptEvent(String str, String str2, Bundle bundle, long j10) {
        try {
            this.zza.zze(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            zzgi zzgiVar = this.zzb.zza;
            if (zzgiVar != null) {
                zzgiVar.zzaz().zzk().zzb("Event interceptor threw exception", e10);
            }
        }
    }
}
