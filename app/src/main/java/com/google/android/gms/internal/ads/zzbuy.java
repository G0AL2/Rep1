package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbuy implements MediationAdLoadCallback {
    final /* synthetic */ zzbug zza;
    final /* synthetic */ zzbuz zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbuy(zzbuz zzbuzVar, zzbug zzbugVar) {
        this.zzb = zzbuzVar;
        this.zza = zzbugVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Object obj;
        try {
            obj = this.zzb.zza;
            String canonicalName = obj.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            zzcfi.zze(canonicalName + "failed to load mediation ad: ErrorCode = " + code + ". ErrorMessage = " + message + ". ErrorDomain = " + domain);
            this.zza.zzh(adError.zza());
            this.zza.zzi(adError.getCode(), adError.getMessage());
            this.zza.zzg(adError.getCode());
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzb.zzh = (MediationRewardedAd) obj;
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
        }
        return new zzcbu(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        Object obj;
        try {
            obj = this.zzb.zza;
            String canonicalName = obj.getClass().getCanonicalName();
            zzcfi.zze(canonicalName + "failed to loaded mediation ad: " + str);
            this.zza.zzi(0, str);
            this.zza.zzg(0);
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
        }
    }
}
