package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcf {
    public static final zzl zza = new zzl() { // from class: com.google.android.gms.internal.ads.zzce
    };
    public Object zzb;
    public Object zzc;
    public int zzd;
    public long zze;
    public long zzf;
    public boolean zzg;
    private zzd zzh = zzd.zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcf.class.equals(obj.getClass())) {
            zzcf zzcfVar = (zzcf) obj;
            if (zzeg.zzS(this.zzb, zzcfVar.zzb) && zzeg.zzS(this.zzc, zzcfVar.zzc) && this.zzd == zzcfVar.zzd && this.zze == zzcfVar.zze && this.zzg == zzcfVar.zzg && zzeg.zzS(this.zzh, zzcfVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zzb;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.zzc;
        int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
        int i10 = this.zzd;
        long j10 = this.zze;
        return ((((((((hashCode + hashCode2) * 31) + i10) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 961) + (this.zzg ? 1 : 0)) * 31) + this.zzh.hashCode();
    }

    public final int zza(int i10) {
        return this.zzh.zza(i10).zzc;
    }

    public final int zzb() {
        int i10 = this.zzh.zzc;
        return 0;
    }

    public final int zzc(long j10) {
        return -1;
    }

    public final int zzd(long j10) {
        return -1;
    }

    public final int zze(int i10) {
        return this.zzh.zza(i10).zza(-1);
    }

    public final int zzf(int i10, int i11) {
        return this.zzh.zza(i10).zza(i11);
    }

    public final long zzg(int i10, int i11) {
        zzc zza2 = this.zzh.zza(i10);
        if (zza2.zzc != -1) {
            return zza2.zzf[i11];
        }
        return -9223372036854775807L;
    }

    public final long zzh(int i10) {
        long j10 = this.zzh.zza(i10).zzb;
        return 0L;
    }

    public final long zzi() {
        long j10 = this.zzh.zzd;
        return 0L;
    }

    public final long zzj(int i10) {
        long j10 = this.zzh.zza(i10).zzg;
        return 0L;
    }

    public final zzcf zzk(Object obj, Object obj2, int i10, long j10, long j11, zzd zzdVar, boolean z10) {
        this.zzb = obj;
        this.zzc = obj2;
        this.zzd = 0;
        this.zze = j10;
        this.zzf = 0L;
        this.zzh = zzdVar;
        this.zzg = z10;
        return this;
    }

    public final boolean zzl(int i10) {
        boolean z10 = this.zzh.zza(i10).zzh;
        return false;
    }
}
