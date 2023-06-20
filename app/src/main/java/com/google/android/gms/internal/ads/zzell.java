package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzell extends com.google.android.gms.ads.internal.client.zzbn {
    @VisibleForTesting
    final zzfcb zza;
    @VisibleForTesting
    final zzdnq zzb;
    private final Context zzc;
    private final zzcnf zzd;
    private com.google.android.gms.ads.internal.client.zzbf zze;

    public zzell(zzcnf zzcnfVar, Context context, String str) {
        zzfcb zzfcbVar = new zzfcb();
        this.zza = zzfcbVar;
        this.zzb = new zzdnq();
        this.zzd = zzcnfVar;
        zzfcbVar.zzs(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final com.google.android.gms.ads.internal.client.zzbl zze() {
        zzdns zzg = this.zzb.zzg();
        this.zza.zzB(zzg.zzi());
        this.zza.zzC(zzg.zzh());
        zzfcb zzfcbVar = this.zza;
        if (zzfcbVar.zzg() == null) {
            zzfcbVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzc());
        }
        return new zzelm(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzf(zzblz zzblzVar) {
        this.zzb.zza(zzblzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzg(zzbmc zzbmcVar) {
        this.zzb.zzb(zzbmcVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzh(String str, zzbmi zzbmiVar, zzbmf zzbmfVar) {
        this.zzb.zzc(str, zzbmiVar, zzbmfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzi(zzbrb zzbrbVar) {
        this.zzb.zzd(zzbrbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzj(zzbmm zzbmmVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb.zze(zzbmmVar);
        this.zza.zzr(zzqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzk(zzbmp zzbmpVar) {
        this.zzb.zzf(zzbmpVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzl(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        this.zze = zzbfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzq(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzn(zzbqs zzbqsVar) {
        this.zza.zzv(zzbqsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzo(zzbkp zzbkpVar) {
        this.zza.zzA(zzbkpVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzD(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzq(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
        this.zza.zzQ(zzcdVar);
    }
}
