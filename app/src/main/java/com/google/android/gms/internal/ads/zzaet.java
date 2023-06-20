package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaet {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final zzad zzf;
    public final int zzg;
    public final long[] zzh;
    public final long[] zzi;
    public final int zzj;
    private final zzaeu[] zzk;

    public zzaet(int i10, int i11, long j10, long j11, long j12, zzad zzadVar, int i12, zzaeu[] zzaeuVarArr, int i13, long[] jArr, long[] jArr2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = zzadVar;
        this.zzg = i12;
        this.zzk = zzaeuVarArr;
        this.zzj = i13;
        this.zzh = jArr;
        this.zzi = jArr2;
    }

    public final zzaeu zza(int i10) {
        zzaeu[] zzaeuVarArr = this.zzk;
        if (zzaeuVarArr == null) {
            return null;
        }
        return zzaeuVarArr[i10];
    }
}
