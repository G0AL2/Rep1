package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbeu extends zzgkq implements zzgmb {
    private static final zzbeu zzb;
    private int zze;
    private zzbgk zzg;
    private int zzh;
    private zzbgm zzi;
    private int zzj;
    private String zzf = "";
    private int zzk = 1000;
    private int zzl = 1000;
    private int zzm = 1000;

    static {
        zzbeu zzbeuVar = new zzbeu();
        zzb = zzbeuVar;
        zzgkq.zzaP(zzbeu.class, zzbeuVar);
    }

    private zzbeu() {
    }

    public static zzbeu zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzbeu zzbeuVar, String str) {
        zzbeuVar.zze |= 1;
        zzbeuVar.zzf = str;
    }

    public static /* synthetic */ void zze(zzbeu zzbeuVar, zzbgm zzbgmVar) {
        zzbgmVar.getClass();
        zzbeuVar.zzi = zzbgmVar;
        zzbeuVar.zze |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzgkq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                zzgku zzgkuVar = zzbez.zza;
                return zzgkq.zzaO(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzgkuVar, "zzl", zzgkuVar, "zzm", zzgkuVar});
            } else if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzbet(null);
            } else {
                return new zzbeu();
            }
        }
        return (byte) 1;
    }
}
