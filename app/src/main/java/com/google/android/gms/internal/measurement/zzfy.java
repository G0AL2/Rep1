package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzfy extends zzkc implements zzlk {
    private static final zzfy zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzfm zzh;

    static {
        zzfy zzfyVar = new zzfy();
        zza = zzfyVar;
        zzkc.zzbM(zzfy.class, zzfyVar);
    }

    private zzfy() {
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
                    return new zzfx(null);
                }
                return new zzfy();
            }
            return zzkc.zzbL(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
