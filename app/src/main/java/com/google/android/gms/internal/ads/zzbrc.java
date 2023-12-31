package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbrc extends AdManagerInterstitialAd {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzp zzb;
    private final com.google.android.gms.ads.internal.client.zzbs zzc;
    private final String zzd;
    private final zzbtx zze;
    private AppEventListener zzf;
    private FullScreenContentCallback zzg;
    private OnPaidEventListener zzh;

    public zzbrc(Context context, String str) {
        zzbtx zzbtxVar = new zzbtx();
        this.zze = zzbtxVar;
        this.zza = context;
        this.zzd = str;
        this.zzb = com.google.android.gms.ads.internal.client.zzp.zza;
        this.zzc = com.google.android.gms.ads.internal.client.zzaw.zza().zze(context, new com.google.android.gms.ads.internal.client.zzq(), str, zzbtxVar);
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final String getAdUnitId() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final AppEventListener getAppEventListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzh;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdh zzdhVar = null;
        try {
            com.google.android.gms.ads.internal.client.zzbs zzbsVar = this.zzc;
            if (zzbsVar != null) {
                zzdhVar = zzbsVar.zzk();
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
        return ResponseInfo.zzb(zzdhVar);
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzf = appEventListener;
            com.google.android.gms.ads.internal.client.zzbs zzbsVar = this.zzc;
            if (zzbsVar != null) {
                zzbsVar.zzG(appEventListener != null ? new zzbbb(appEventListener) : null);
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.zzg = fullScreenContentCallback;
            com.google.android.gms.ads.internal.client.zzbs zzbsVar = this.zzc;
            if (zzbsVar != null) {
                zzbsVar.zzJ(new com.google.android.gms.ads.internal.client.zzaz(fullScreenContentCallback));
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean z10) {
        try {
            com.google.android.gms.ads.internal.client.zzbs zzbsVar = this.zzc;
            if (zzbsVar != null) {
                zzbsVar.zzL(z10);
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzh = onPaidEventListener;
            com.google.android.gms.ads.internal.client.zzbs zzbsVar = this.zzc;
            if (zzbsVar != null) {
                zzbsVar.zzP(new com.google.android.gms.ads.internal.client.zzey(onPaidEventListener));
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(Activity activity) {
        if (activity == null) {
            zzcfi.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            com.google.android.gms.ads.internal.client.zzbs zzbsVar = this.zzc;
            if (zzbsVar != null) {
                zzbsVar.zzW(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzdr zzdrVar, AdLoadCallback adLoadCallback) {
        try {
            com.google.android.gms.ads.internal.client.zzbs zzbsVar = this.zzc;
            if (zzbsVar != null) {
                zzbsVar.zzy(this.zzb.zza(this.zza, zzdrVar), new com.google.android.gms.ads.internal.client.zzh(adLoadCallback, this));
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
            adLoadCallback.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", MobileAds.ERROR_DOMAIN, null, null));
        }
    }
}
