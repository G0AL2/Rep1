package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdkr implements zzgqu {
    private final zzdkd zza;
    private final zzgrh zzb;

    public zzdkr(zzdkd zzdkdVar, zzgrh zzgrhVar) {
        this.zza = zzdkdVar;
        this.zzb = zzgrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzd((Executor) this.zzb.zzb());
    }
}
