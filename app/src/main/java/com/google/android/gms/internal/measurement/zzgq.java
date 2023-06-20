package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzgq extends zzkc implements zzlk {
    private static final zzgq zza;
    private int zze;
    private String zzf = "";
    private zzkj zzg = zzkc.zzbG();

    static {
        zzgq zzgqVar = new zzgq();
        zza = zzgqVar;
        zzkc.zzbM(zzgq.class, zzgqVar);
    }

    private zzgq() {
    }

    public final String zzb() {
        return this.zzf;
    }

    public final List zzc() {
        return this.zzg;
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
                    return new zzgp(null);
                }
                return new zzgq();
            }
            return zzkc.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzgx.class});
        }
        return (byte) 1;
    }
}
