package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbgq extends zzgkq implements zzgmb {
    private static final zzbgq zzb;
    private int zze;
    private int zzf = 1000;
    private zzbgt zzg;
    private zzbgk zzh;

    static {
        zzbgq zzbgqVar = new zzbgq();
        zzb = zzbgqVar;
        zzgkq.zzaP(zzbgq.class, zzbgqVar);
    }

    private zzbgq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgkq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzbgp(null);
                }
                return new zzbgq();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", zzbez.zza, "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
