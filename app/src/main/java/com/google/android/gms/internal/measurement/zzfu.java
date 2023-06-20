package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzfu extends zzkc implements zzlk {
    private static final zzfu zza;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        zzfu zzfuVar = new zzfu();
        zza = zzfuVar;
        zzkc.zzbM(zzfu.class, zzfuVar);
    }

    private zzfu() {
    }

    public static zzft zza() {
        return (zzft) zza.zzbA();
    }

    public static /* synthetic */ void zzc(zzfu zzfuVar, String str) {
        str.getClass();
        zzfuVar.zze |= 1;
        zzfuVar.zzf = str;
    }

    public static /* synthetic */ void zzd(zzfu zzfuVar, long j10) {
        zzfuVar.zze |= 2;
        zzfuVar.zzg = j10;
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
                    return new zzft(null);
                }
                return new zzfu();
            }
            return zzkc.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
