package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdxs implements zzdxg {
    private final long zza;
    private final zzemp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxs(long j10, Context context, zzdxl zzdxlVar, zzcnf zzcnfVar, String str) {
        this.zza = j10;
        zzezq zzt = zzcnfVar.zzt();
        zzt.zzc(context);
        zzt.zza(new com.google.android.gms.ads.internal.client.zzq());
        zzt.zzb(str);
        zzemp zza = zzt.zzd().zza();
        this.zzb = zza;
        zza.zzD(new zzdxr(this, zzdxlVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdxg
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdxg
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzaa(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdxg
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
