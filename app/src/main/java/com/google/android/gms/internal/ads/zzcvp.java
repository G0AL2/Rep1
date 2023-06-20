package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcvp extends zzbcf {
    private final zzcvo zza;
    private final com.google.android.gms.ads.internal.client.zzbs zzb;
    private final zzexh zzc;
    private boolean zzd = false;

    public zzcvp(zzcvo zzcvoVar, com.google.android.gms.ads.internal.client.zzbs zzbsVar, zzexh zzexhVar) {
        this.zza = zzcvoVar;
        this.zzb = zzbsVar;
        this.zzc = zzexhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final com.google.android.gms.ads.internal.client.zzbs zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final com.google.android.gms.ads.internal.client.zzdh zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfK)).booleanValue()) {
            return this.zza.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final void zzg(boolean z10) {
        this.zzd = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final void zzh(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        zzexh zzexhVar = this.zzc;
        if (zzexhVar != null) {
            zzexhVar.zzp(zzdeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final void zzi(IObjectWrapper iObjectWrapper, zzbcn zzbcnVar) {
        try {
            this.zzc.zzs(zzbcnVar);
            this.zza.zzd((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzbcnVar, this.zzd);
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final void zzj(zzbck zzbckVar) {
    }
}
