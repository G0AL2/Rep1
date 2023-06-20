package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzfq extends zzkc implements zzlk {
    private static final zzfq zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        zzfq zzfqVar = new zzfq();
        zza = zzfqVar;
        zzkc.zzbM(zzfq.class, zzfqVar);
    }

    private zzfq() {
    }

    public static zzfp zzc() {
        return (zzfp) zza.zzbA();
    }

    public static /* synthetic */ void zze(zzfq zzfqVar, int i10) {
        zzfqVar.zze |= 1;
        zzfqVar.zzf = i10;
    }

    public static /* synthetic */ void zzf(zzfq zzfqVar, long j10) {
        zzfqVar.zze |= 2;
        zzfqVar.zzg = j10;
    }

    public final int zza() {
        return this.zzf;
    }

    public final long zzb() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzh() {
        return (this.zze & 1) != 0;
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
                    return new zzfp(null);
                }
                return new zzfq();
            }
            return zzkc.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
