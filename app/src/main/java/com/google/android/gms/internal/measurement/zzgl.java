package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzgl extends zzkc implements zzlk {
    private static final zzgl zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        zzgl zzglVar = new zzgl();
        zza = zzglVar;
        zzkc.zzbM(zzgl.class, zzglVar);
    }

    private zzgl() {
    }

    public static zzgk zzd() {
        return (zzgk) zza.zzbA();
    }

    public static /* synthetic */ void zzh(zzgl zzglVar, long j10) {
        zzglVar.zze |= 1;
        zzglVar.zzf = j10;
    }

    public static /* synthetic */ void zzi(zzgl zzglVar, String str) {
        str.getClass();
        zzglVar.zze |= 2;
        zzglVar.zzg = str;
    }

    public static /* synthetic */ void zzj(zzgl zzglVar, String str) {
        str.getClass();
        zzglVar.zze |= 4;
        zzglVar.zzh = str;
    }

    public static /* synthetic */ void zzk(zzgl zzglVar) {
        zzglVar.zze &= -5;
        zzglVar.zzh = zza.zzh;
    }

    public static /* synthetic */ void zzm(zzgl zzglVar, long j10) {
        zzglVar.zze |= 8;
        zzglVar.zzi = j10;
    }

    public static /* synthetic */ void zzn(zzgl zzglVar) {
        zzglVar.zze &= -9;
        zzglVar.zzi = 0L;
    }

    public static /* synthetic */ void zzo(zzgl zzglVar, double d10) {
        zzglVar.zze |= 32;
        zzglVar.zzk = d10;
    }

    public static /* synthetic */ void zzp(zzgl zzglVar) {
        zzglVar.zze &= -33;
        zzglVar.zzk = 0.0d;
    }

    public final double zza() {
        return this.zzk;
    }

    public final long zzb() {
        return this.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zzg;
    }

    public final String zzg() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzgk(null);
                }
                return new zzgl();
            }
            return zzkc.zzbL(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final boolean zzq() {
        return (this.zze & 32) != 0;
    }

    public final boolean zzr() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzs() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzt() {
        return (this.zze & 4) != 0;
    }
}
