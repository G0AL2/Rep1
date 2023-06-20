package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzbwi implements com.google.android.gms.ads.internal.overlay.zzo {
    final /* synthetic */ zzbwk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwi(zzbwk zzbwkVar) {
        this.zza = zzbwkVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        MediationInterstitialListener mediationInterstitialListener;
        zzcfi.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbwk zzbwkVar = this.zza;
        mediationInterstitialListener = zzbwkVar.zzb;
        mediationInterstitialListener.onAdOpened(zzbwkVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        zzcfi.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
        zzcfi.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
        zzcfi.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i10) {
        MediationInterstitialListener mediationInterstitialListener;
        zzcfi.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbwk zzbwkVar = this.zza;
        mediationInterstitialListener = zzbwkVar.zzb;
        mediationInterstitialListener.onAdClosed(zzbwkVar);
    }
}
