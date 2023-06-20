package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzczu implements zzgqu {
    private final zzczt zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzczu(zzczt zzcztVar, zzgrh zzgrhVar, zzgrh zzgrhVar2) {
        this.zza = zzcztVar;
        this.zzb = zzgrhVar;
        this.zzc = zzgrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.zzb((Context) this.zzb.zzb(), (zzccj) this.zzc.zzb(), null);
    }
}
