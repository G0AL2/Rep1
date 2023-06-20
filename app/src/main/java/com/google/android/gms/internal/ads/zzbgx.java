package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbgx extends zzgkq implements zzgmb {
    private static final zzbgx zzb;
    private int zze;
    private int zzf = 1000;
    private zzbgt zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        zzbgx zzbgxVar = new zzbgx();
        zzb = zzbgxVar;
        zzgkq.zzaP(zzbgx.class, zzbgxVar);
    }

    private zzbgx() {
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
                    return new zzbgw(null);
                }
                return new zzbgx();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zze", "zzf", zzbez.zza, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
