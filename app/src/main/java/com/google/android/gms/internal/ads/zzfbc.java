package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfbc extends zzcbd {
    private final zzfay zza;
    private final zzfao zzb;
    private final String zzc;
    private final zzfby zzd;
    private final Context zze;
    private final zzcfo zzf;
    private zzdst zzg;
    private boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaA)).booleanValue();

    public zzfbc(String str, zzfay zzfayVar, Context context, zzfao zzfaoVar, zzfby zzfbyVar, zzcfo zzcfoVar) {
        this.zzc = str;
        this.zza = zzfayVar;
        this.zzb = zzfaoVar;
        this.zzd = zzfbyVar;
        this.zze = context;
        this.zzf = zzcfoVar;
    }

    private final synchronized void zzt(com.google.android.gms.ads.internal.client.zzl zzlVar, zzcbl zzcblVar, int i10) throws RemoteException {
        boolean z10 = false;
        if (((Boolean) zzbjn.zzi.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
                z10 = true;
            }
        }
        if (this.zzf.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zziw)).intValue() || !z10) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        }
        this.zzb.zze(zzcblVar);
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zze) && zzlVar.zzs == null) {
            zzcfi.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zza(zzfdc.zzd(4, null, null));
            return;
        }
        if (this.zzg != null) {
            return;
        }
        zzfaq zzfaqVar = new zzfaq(null);
        this.zza.zzj(i10);
        this.zza.zzb(zzlVar, this.zzc, zzfaqVar, new zzfbb(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdst zzdstVar = this.zzg;
        return zzdstVar != null ? zzdstVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final com.google.android.gms.ads.internal.client.zzdh zzc() {
        zzdst zzdstVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfK)).booleanValue() && (zzdstVar = this.zzg) != null) {
            return zzdstVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final zzcbb zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdst zzdstVar = this.zzg;
        if (zzdstVar != null) {
            return zzdstVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final synchronized String zze() throws RemoteException {
        zzdst zzdstVar = this.zzg;
        if (zzdstVar == null || zzdstVar.zzl() == null) {
            return null;
        }
        return zzdstVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzcbl zzcblVar) throws RemoteException {
        zzt(zzlVar, zzcblVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzcbl zzcblVar) throws RemoteException {
        zzt(zzlVar, zzcblVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final synchronized void zzh(boolean z10) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzh = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzi(com.google.android.gms.ads.internal.client.zzdb zzdbVar) {
        if (zzdbVar == null) {
            this.zzb.zzb(null);
        } else {
            this.zzb.zzb(new zzfba(this, zzdbVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzj(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        this.zzb.zzc(zzdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzk(zzcbh zzcbhVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzd(zzcbhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final synchronized void zzl(zzcbs zzcbsVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfby zzfbyVar = this.zzd;
        zzfbyVar.zza = zzcbsVar.zza;
        zzfbyVar.zzb = zzcbsVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final synchronized void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzn(iObjectWrapper, this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final synchronized void zzn(IObjectWrapper iObjectWrapper, boolean z10) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzg == null) {
            zzcfi.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzk(zzfdc.zzd(9, null, null));
            return;
        }
        this.zzg.zzg(z10, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdst zzdstVar = this.zzg;
        return (zzdstVar == null || zzdstVar.zze()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzp(zzcbm zzcbmVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzcbmVar);
    }
}
