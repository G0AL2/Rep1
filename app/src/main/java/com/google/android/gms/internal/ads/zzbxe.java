package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbxe extends zzbmh {
    final /* synthetic */ zzbxf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbxe(zzbxf zzbxfVar, zzbxd zzbxdVar) {
        this.zza = zzbxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zze(zzblv zzblvVar) {
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener;
        NativeCustomFormatAd zzf;
        zzbxf zzbxfVar = this.zza;
        onCustomFormatAdLoadedListener = zzbxfVar.zza;
        zzf = zzbxfVar.zzf(zzblvVar);
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(zzf);
    }
}
