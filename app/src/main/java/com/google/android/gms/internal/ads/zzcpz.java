package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcpz implements zzdxi {
    private final Long zza;
    private final String zzb;
    private final zzcop zzc;
    private final zzcqd zzd;
    private final zzcpz zze = this;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcpz(zzcop zzcopVar, zzcqd zzcqdVar, Long l10, String str, zzcpy zzcpyVar) {
        this.zzc = zzcopVar;
        this.zzd = zzcqdVar;
        this.zza = l10;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdxi
    public final zzdxs zza() {
        Context context;
        zzdxl zzc;
        long longValue = this.zza.longValue();
        zzcqd zzcqdVar = this.zzd;
        context = zzcqdVar.zza;
        zzc = zzdxm.zzc(zzcqdVar.zzb);
        return zzdxt.zza(longValue, context, zzc, this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdxi
    public final zzdxw zzb() {
        Context context;
        zzdxl zzc;
        long longValue = this.zza.longValue();
        zzcqd zzcqdVar = this.zzd;
        context = zzcqdVar.zza;
        zzc = zzdxm.zzc(zzcqdVar.zzb);
        return zzdxx.zza(longValue, context, zzc, this.zzc, this.zzb);
    }
}
