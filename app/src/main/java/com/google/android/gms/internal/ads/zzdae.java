package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdae implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzdae(zzgrh zzgrhVar, zzgrh zzgrhVar2) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdiz((zzdfz) this.zza.zzb(), (Executor) this.zzb.zzb());
    }
}
