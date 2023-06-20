package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbhf extends zzgkq implements zzgmb {
    private static final zzbhf zzb;
    private int zze;
    private int zzf = 1000;
    private zzbgt zzg;

    static {
        zzbhf zzbhfVar = new zzbhf();
        zzb = zzbhfVar;
        zzgkq.zzaP(zzbhf.class, zzbhfVar);
    }

    private zzbhf() {
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
                    return new zzbhe(null);
                }
                return new zzbhf();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzbez.zza, "zzg"});
        }
        return (byte) 1;
    }
}
