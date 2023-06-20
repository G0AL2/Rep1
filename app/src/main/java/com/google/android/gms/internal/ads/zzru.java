package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzru extends zzci {
    private final zzbb zzc;

    public zzru(zzbb zzbbVar) {
        this.zzc = zzbbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zza(Object obj) {
        return obj == zzrt.zzd ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final zzcf zzd(int i10, zzcf zzcfVar, boolean z10) {
        zzcfVar.zzk(z10 ? 0 : null, z10 ? zzrt.zzd : null, 0, -9223372036854775807L, 0L, zzd.zza, true);
        return zzcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final zzch zze(int i10, zzch zzchVar, long j10) {
        zzchVar.zza(zzch.zza, this.zzc, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzchVar.zzl = true;
        return zzchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final Object zzf(int i10) {
        return zzrt.zzd;
    }
}
