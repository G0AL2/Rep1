package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcbx extends zzcbk {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzcby zzb;

    public zzcbx(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzcby zzcbyVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzcbyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zze(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzg() {
        zzcby zzcbyVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzcbyVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzcbyVar);
    }
}
