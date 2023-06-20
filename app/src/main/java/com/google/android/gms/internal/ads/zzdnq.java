package com.google.android.gms.internal.ads;

import androidx.collection.g;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdnq {
    zzbmc zza;
    zzblz zzb;
    zzbmp zzc;
    zzbmm zzd;
    zzbrb zze;
    final g zzf = new g();
    final g zzg = new g();

    public final zzdnq zza(zzblz zzblzVar) {
        this.zzb = zzblzVar;
        return this;
    }

    public final zzdnq zzb(zzbmc zzbmcVar) {
        this.zza = zzbmcVar;
        return this;
    }

    public final zzdnq zzc(String str, zzbmi zzbmiVar, zzbmf zzbmfVar) {
        this.zzf.put(str, zzbmiVar);
        if (zzbmfVar != null) {
            this.zzg.put(str, zzbmfVar);
        }
        return this;
    }

    public final zzdnq zzd(zzbrb zzbrbVar) {
        this.zze = zzbrbVar;
        return this;
    }

    public final zzdnq zze(zzbmm zzbmmVar) {
        this.zzd = zzbmmVar;
        return this;
    }

    public final zzdnq zzf(zzbmp zzbmpVar) {
        this.zzc = zzbmpVar;
        return this;
    }

    public final zzdns zzg() {
        return new zzdns(this);
    }
}
