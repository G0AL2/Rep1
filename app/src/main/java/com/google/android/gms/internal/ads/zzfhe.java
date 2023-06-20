package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfhe implements zzdiq, zzdcj, zzdiu {
    private final zzfhs zza;
    private final zzfhh zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfhe(Context context, zzfhs zzfhsVar) {
        this.zza = zzfhsVar;
        this.zzb = zzfhg.zza(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzb() {
        if (((Boolean) zzbji.zzd.zze()).booleanValue()) {
            zzfhs zzfhsVar = this.zza;
            zzfhh zzfhhVar = this.zzb;
            zzfhhVar.zze(true);
            zzfhsVar.zza(zzfhhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzf() {
        if (((Boolean) zzbji.zzd.zze()).booleanValue()) {
            this.zzb.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbji.zzd.zze()).booleanValue()) {
            zzfhs zzfhsVar = this.zza;
            zzfhh zzfhhVar = this.zzb;
            zzfhhVar.zze(false);
            zzfhsVar.zza(zzfhhVar);
        }
    }
}
