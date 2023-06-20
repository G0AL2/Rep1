package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbgi extends zzgkq implements zzgmb {
    private static final zzbgi zzb;
    private int zze;
    private String zzf = "";
    private int zzg;
    private zzbgk zzh;

    static {
        zzbgi zzbgiVar = new zzbgi();
        zzb = zzbgiVar;
        zzgkq.zzaP(zzbgi.class, zzbgiVar);
    }

    private zzbgi() {
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
                    return new zzbgh(null);
                }
                return new zzbgi();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", zzbez.zza, "zzh"});
        }
        return (byte) 1;
    }
}
