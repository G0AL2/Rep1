package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbqd implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzcga zza;
    final /* synthetic */ zzbqf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqd(zzbqf zzbqfVar, zzcga zzcgaVar) {
        this.zzb = zzbqfVar;
        this.zza = zzcgaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbps zzbpsVar;
        try {
            zzcga zzcgaVar = this.zza;
            zzbpsVar = this.zzb.zza;
            zzcgaVar.zzd(zzbpsVar.zzp());
        } catch (DeadObjectException e10) {
            this.zza.zze(e10);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        zzcga zzcgaVar = this.zza;
        zzcgaVar.zze(new RuntimeException("onConnectionSuspended: " + i10));
    }
}
