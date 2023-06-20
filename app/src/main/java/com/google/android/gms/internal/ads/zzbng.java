package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbng {
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zza;
    private final NativeCustomTemplateAd.OnCustomClickListener zzb;
    private NativeCustomTemplateAd zzc;

    public zzbng(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomTemplateAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    public final synchronized NativeCustomTemplateAd zzf(zzblv zzblvVar) {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.zzc;
        if (nativeCustomTemplateAd != null) {
            return nativeCustomTemplateAd;
        }
        zzblw zzblwVar = new zzblw(zzblvVar);
        this.zzc = zzblwVar;
        return zzblwVar;
    }

    public final zzbmf zzd() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbnd(this, null);
    }

    public final zzbmi zze() {
        return new zzbnf(this, null);
    }
}
