package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzepw implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzepw(zzgrh zzgrhVar, zzgrh zzgrhVar2) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzepq(((zzeto) this.zza).zzb(), ((Long) zzbjf.zza.zze()).longValue(), (Clock) this.zzb.zzb());
    }
}
