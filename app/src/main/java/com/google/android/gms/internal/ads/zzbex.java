package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbex extends zzgkq implements zzgmb {
    private static final zzbex zzb;
    private int zze;
    private int zzf;
    private zzbgm zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        zzbex zzbexVar = new zzbex();
        zzb = zzbexVar;
        zzgkq.zzaP(zzbex.class, zzbexVar);
    }

    private zzbex() {
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
                    return new zzbev(null);
                }
                return new zzbex();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", zzbew.zza, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
