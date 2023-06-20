package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
final class zzbvz implements MediationAdLoadCallback {
    final /* synthetic */ zzbvh zza;
    final /* synthetic */ zzbug zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvz(zzbwe zzbweVar, zzbvh zzbvhVar, zzbug zzbugVar) {
        this.zza = zzbvhVar;
        this.zzb = zzbugVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzf(adError.zza());
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationInterscrollerAd mediationInterscrollerAd = (MediationInterscrollerAd) obj;
        if (mediationInterscrollerAd == null) {
            zzcfi.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zza.zze("Adapter returned null.");
                return null;
            } catch (RemoteException e10) {
                zzcfi.zzh("", e10);
                return null;
            }
        }
        try {
            this.zza.zzh(new zzbva(mediationInterscrollerAd));
        } catch (RemoteException e11) {
            zzcfi.zzh("", e11);
        }
        return new zzbwf(this.zzb);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, "undefined"));
    }
}
