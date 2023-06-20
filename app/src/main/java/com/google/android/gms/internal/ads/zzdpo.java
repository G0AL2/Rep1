package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdpo implements zzgqu {
    private final zzdph zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzdpo(zzdph zzdphVar, zzgrh zzgrhVar, zzgrh zzgrhVar2) {
        this.zza = zzdphVar;
        this.zzb = zzgrhVar;
        this.zzc = zzgrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdiz(((zzdsp) this.zzb).zzb(), (Executor) this.zzc.zzb());
    }
}
