package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzczj implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzczj(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
        this.zzc = zzgrhVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzcnx) this.zzb).zzb().zzb((Clock) this.zza.zzb(), ((zzdbk) this.zzc).zza().zzf);
    }
}
