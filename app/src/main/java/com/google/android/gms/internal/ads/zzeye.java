package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeye implements zzfei {
    private final zzeza zza;

    public zzeye(zzeza zzezaVar) {
        this.zza = zzezaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfei
    public final zzfvl zza(zzfej zzfejVar) {
        zzeyf zzeyfVar = (zzeyf) zzfejVar;
        return ((zzeyb) this.zza).zzb(zzeyfVar.zzb, zzeyfVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfei
    public final void zzb(zzfdx zzfdxVar) {
        zzfdxVar.zza = ((zzeyb) this.zza).zza();
    }
}
