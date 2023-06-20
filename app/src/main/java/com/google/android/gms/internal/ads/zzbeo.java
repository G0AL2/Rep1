package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbeo extends zzgkq implements zzgmb {
    private static final zzbeo zzb;
    private int zze;
    private String zzf = "";
    private zzgkz zzg = zzgkq.zzaJ();
    private int zzh;

    static {
        zzbeo zzbeoVar = new zzbeo();
        zzb = zzbeoVar;
        zzgkq.zzaP(zzbeo.class, zzbeoVar);
    }

    private zzbeo() {
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
                    return new zzben(null);
                }
                return new zzbeo();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zze", "zzf", "zzg", zzbem.class, "zzh", zzbez.zza});
        }
        return (byte) 1;
    }
}
