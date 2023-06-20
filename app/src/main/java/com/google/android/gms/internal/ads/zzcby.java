package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcby extends RewardedInterstitialAd {
    private final String zza;
    private final zzcbe zzb;
    private final Context zzc;
    private final zzcbw zzd = new zzcbw();
    private FullScreenContentCallback zze;
    private OnAdMetadataChangedListener zzf;
    private OnPaidEventListener zzg;

    public zzcby(Context context, String str) {
        this.zza = str;
        this.zzc = context.getApplicationContext();
        this.zzb = com.google.android.gms.ads.internal.client.zzaw.zza().zzp(context, str, new zzbtx());
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final Bundle getAdMetadata() {
        try {
            zzcbe zzcbeVar = this.zzb;
            if (zzcbeVar != null) {
                return zzcbeVar.zzb();
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdh zzdhVar = null;
        try {
            zzcbe zzcbeVar = this.zzb;
            if (zzcbeVar != null) {
                zzdhVar = zzcbeVar.zzc();
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
        return ResponseInfo.zzb(zzdhVar);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final RewardItem getRewardItem() {
        try {
            zzcbe zzcbeVar = this.zzb;
            zzcbb zzd = zzcbeVar != null ? zzcbeVar.zzd() : null;
            if (zzd != null) {
                return new zzcbo(zzd);
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zze = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setImmersiveMode(boolean z10) {
        try {
            zzcbe zzcbeVar = this.zzb;
            if (zzcbeVar != null) {
                zzcbeVar.zzh(z10);
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzf = onAdMetadataChangedListener;
        try {
            zzcbe zzcbeVar = this.zzb;
            if (zzcbeVar != null) {
                zzcbeVar.zzi(new com.google.android.gms.ads.internal.client.zzex(onAdMetadataChangedListener));
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zzg = onPaidEventListener;
        try {
            zzcbe zzcbeVar = this.zzb;
            if (zzcbeVar != null) {
                zzcbeVar.zzj(new com.google.android.gms.ads.internal.client.zzey(onPaidEventListener));
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            zzcbe zzcbeVar = this.zzb;
            if (zzcbeVar != null) {
                zzcbeVar.zzl(new zzcbs(serverSideVerificationOptions));
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        try {
            zzcbe zzcbeVar = this.zzb;
            if (zzcbeVar != null) {
                zzcbeVar.zzk(this.zzd);
                this.zzb.zzm(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzdr zzdrVar, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            zzcbe zzcbeVar = this.zzb;
            if (zzcbeVar != null) {
                zzcbeVar.zzg(com.google.android.gms.ads.internal.client.zzp.zza.zza(this.zzc, zzdrVar), new zzcbx(rewardedInterstitialAdLoadCallback, this));
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }
}
