package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzczk implements zzddh, com.google.android.gms.ads.internal.client.zza, zzdeo, zzdcn, zzdbt, zzdgz {
    private final Clock zza;
    private final zzcek zzb;

    public zzczk(Clock clock, zzcek zzcekVar) {
        this.zza = clock;
        this.zzb = zzcekVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzb(zzfbx zzfbxVar) {
        this.zzb.zzk(this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzbE(zzbzv zzbzvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzbv() {
    }

    public final String zzc() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zze(zzbeh zzbehVar) {
        this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzf(zzbeh zzbehVar) {
    }

    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzj(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzh(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzi(zzbeh zzbehVar) {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzj() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzk(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        this.zzb.zzh(true);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzp(zzcal zzcalVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzr() {
    }
}
