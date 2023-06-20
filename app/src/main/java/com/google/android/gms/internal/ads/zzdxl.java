package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdxl {
    private final zzbph zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxl(zzbph zzbphVar) {
        this.zza = zzbphVar;
    }

    private final void zzs(zzdxk zzdxkVar) throws RemoteException {
        String zza = zzdxk.zza(zzdxkVar);
        zzcfi.zzi("Dispatching AFMA event on publisher webview: ".concat(zza));
        this.zza.zzb(zza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdxk("initialize", null));
    }

    public final void zzb(long j10) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("interstitial", null);
        zzdxkVar.zza = Long.valueOf(j10);
        zzdxkVar.zzc = "onAdClicked";
        this.zza.zzb(zzdxk.zza(zzdxkVar));
    }

    public final void zzc(long j10) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("interstitial", null);
        zzdxkVar.zza = Long.valueOf(j10);
        zzdxkVar.zzc = "onAdClosed";
        zzs(zzdxkVar);
    }

    public final void zzd(long j10, int i10) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("interstitial", null);
        zzdxkVar.zza = Long.valueOf(j10);
        zzdxkVar.zzc = "onAdFailedToLoad";
        zzdxkVar.zzd = Integer.valueOf(i10);
        zzs(zzdxkVar);
    }

    public final void zze(long j10) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("interstitial", null);
        zzdxkVar.zza = Long.valueOf(j10);
        zzdxkVar.zzc = "onAdLoaded";
        zzs(zzdxkVar);
    }

    public final void zzf(long j10) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("interstitial", null);
        zzdxkVar.zza = Long.valueOf(j10);
        zzdxkVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdxkVar);
    }

    public final void zzg(long j10) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("interstitial", null);
        zzdxkVar.zza = Long.valueOf(j10);
        zzdxkVar.zzc = "onAdOpened";
        zzs(zzdxkVar);
    }

    public final void zzh(long j10) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("creation", null);
        zzdxkVar.zza = Long.valueOf(j10);
        zzdxkVar.zzc = "nativeObjectCreated";
        zzs(zzdxkVar);
    }

    public final void zzi(long j10) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("creation", null);
        zzdxkVar.zza = Long.valueOf(j10);
        zzdxkVar.zzc = "nativeObjectNotCreated";
        zzs(zzdxkVar);
    }

    public final void zzj(long j10) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk(RNAdsEvents.EVENT_REWARDED, null);
        zzdxkVar.zza = Long.valueOf(j10);
        zzdxkVar.zzc = "onAdClicked";
        zzs(zzdxkVar);
    }

    public final void zzk(long j10) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk(RNAdsEvents.EVENT_REWARDED, null);
        zzdxkVar.zza = Long.valueOf(j10);
        zzdxkVar.zzc = "onRewardedAdClosed";
        zzs(zzdxkVar);
    }

    public final void zzl(long j10, zzcbb zzcbbVar) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk(RNAdsEvents.EVENT_REWARDED, null);
        zzdxkVar.zza = Long.valueOf(j10);
        zzdxkVar.zzc = "onUserEarnedReward";
        zzdxkVar.zze = zzcbbVar.zzf();
        zzdxkVar.zzf = Integer.valueOf(zzcbbVar.zze());
        zzs(zzdxkVar);
    }

    public final void zzm(long j10, int i10) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk(RNAdsEvents.EVENT_REWARDED, null);
        zzdxkVar.zza = Long.valueOf(j10);
        zzdxkVar.zzc = "onRewardedAdFailedToLoad";
        zzdxkVar.zzd = Integer.valueOf(i10);
        zzs(zzdxkVar);
    }

    public final void zzn(long j10, int i10) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk(RNAdsEvents.EVENT_REWARDED, null);
        zzdxkVar.zza = Long.valueOf(j10);
        zzdxkVar.zzc = "onRewardedAdFailedToShow";
        zzdxkVar.zzd = Integer.valueOf(i10);
        zzs(zzdxkVar);
    }

    public final void zzo(long j10) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk(RNAdsEvents.EVENT_REWARDED, null);
        zzdxkVar.zza = Long.valueOf(j10);
        zzdxkVar.zzc = "onAdImpression";
        zzs(zzdxkVar);
    }

    public final void zzp(long j10) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk(RNAdsEvents.EVENT_REWARDED, null);
        zzdxkVar.zza = Long.valueOf(j10);
        zzdxkVar.zzc = "onRewardedAdLoaded";
        zzs(zzdxkVar);
    }

    public final void zzq(long j10) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk(RNAdsEvents.EVENT_REWARDED, null);
        zzdxkVar.zza = Long.valueOf(j10);
        zzdxkVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdxkVar);
    }

    public final void zzr(long j10) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk(RNAdsEvents.EVENT_REWARDED, null);
        zzdxkVar.zza = Long.valueOf(j10);
        zzdxkVar.zzc = "onRewardedAdOpened";
        zzs(zzdxkVar);
    }
}
