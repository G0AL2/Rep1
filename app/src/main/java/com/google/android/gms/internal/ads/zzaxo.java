package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaxo extends zzase {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;

    public zzaxo(long j10, boolean z10) {
        this.zzc = j10;
        this.zzd = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final int zza(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final zzasc zzd(int i10, zzasc zzascVar, boolean z10) {
        zzayz.zza(i10, 0, 1);
        Object obj = z10 ? zzb : null;
        long j10 = this.zzc;
        zzascVar.zza = obj;
        zzascVar.zzb = obj;
        zzascVar.zzc = j10;
        return zzascVar;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final zzasd zze(int i10, zzasd zzasdVar, boolean z10, long j10) {
        zzayz.zza(i10, 0, 1);
        zzasdVar.zza = this.zzd;
        return zzasdVar;
    }
}
