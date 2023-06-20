package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbcs implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbcu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcs(zzbcu zzbcuVar) {
        this.zza = zzbcuVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        zzbcx zzbcxVar;
        zzbcx zzbcxVar2;
        obj = this.zza.zzb;
        synchronized (obj) {
            try {
                zzbcu zzbcuVar = this.zza;
                zzbcxVar = zzbcuVar.zzc;
                if (zzbcxVar != null) {
                    zzbcxVar2 = zzbcuVar.zzc;
                    zzbcuVar.zze = zzbcxVar2.zzq();
                }
            } catch (DeadObjectException e10) {
                zzcfi.zzh("Unable to obtain a cache service instance.", e10);
                zzbcu.zzh(this.zza);
            }
            obj2 = this.zza.zzb;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        Object obj;
        Object obj2;
        obj = this.zza.zzb;
        synchronized (obj) {
            this.zza.zze = null;
            obj2 = this.zza.zzb;
            obj2.notifyAll();
        }
    }
}
