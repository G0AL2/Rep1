package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdic implements zzgqu {
    private final zzdhf zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;

    public zzdic(zzdhf zzdhfVar, zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3, zzgrh zzgrhVar4) {
        this.zza = zzdhfVar;
        this.zzb = zzgrhVar;
        this.zzc = zzgrhVar2;
        this.zzd = zzgrhVar3;
        this.zze = zzgrhVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzeiq zzb = this.zza.zzb((Clock) this.zzb.zzb(), ((zzeis) this.zzc).zzb(), (zzefi) this.zzd.zzb(), (zzfii) this.zze.zzb());
        zzgrc.zzb(zzb);
        return zzb;
    }
}
