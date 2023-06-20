package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdsz implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzdsz(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
        this.zzc = zzgrhVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* synthetic */ Object zzb() {
        zzgrh zzgrhVar = this.zza;
        zzgrh zzgrhVar2 = this.zzb;
        int i10 = ((zzdbk) this.zzc).zza().zzo.zza;
        int i11 = i10 - 1;
        if (i10 != 0) {
            if (i11 != 0) {
                return ((zzeke) zzgrhVar2).zzb();
            }
            return ((zzeke) zzgrhVar).zzb();
        }
        throw null;
    }
}
