package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzfa extends zzkc implements zzlk {
    private static final zzfa zza;
    private int zze;
    private String zzf = "";
    private zzkj zzg = zzkc.zzbG();
    private boolean zzh;

    static {
        zzfa zzfaVar = new zzfa();
        zza = zzfaVar;
        zzkc.zzbM(zzfa.class, zzfaVar);
    }

    private zzfa() {
    }

    public final String zzb() {
        return this.zzf;
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
                    return new zzez(null);
                }
                return new zzfa();
            }
            return zzkc.zzbL(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", zzfg.class, "zzh"});
        }
        return (byte) 1;
    }
}
