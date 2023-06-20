package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgpe extends zzgkq implements zzgmb {
    private static final zzgpe zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private zzgji zzh;
    private zzgji zzi;

    static {
        zzgpe zzgpeVar = new zzgpe();
        zzb = zzgpeVar;
        zzgkq.zzaP(zzgpe.class, zzgpeVar);
    }

    private zzgpe() {
        zzgji zzgjiVar = zzgji.zzb;
        this.zzh = zzgjiVar;
        this.zzi = zzgjiVar;
    }

    public static zzgpc zza() {
        return (zzgpc) zzb.zzay();
    }

    public static /* synthetic */ void zzd(zzgpe zzgpeVar, String str) {
        zzgpeVar.zze |= 2;
        zzgpeVar.zzg = "image/png";
    }

    public static /* synthetic */ void zze(zzgpe zzgpeVar, zzgji zzgjiVar) {
        zzgjiVar.getClass();
        zzgpeVar.zze |= 4;
        zzgpeVar.zzh = zzgjiVar;
    }

    public static /* synthetic */ void zzf(zzgpe zzgpeVar, int i10) {
        zzgpeVar.zzf = 1;
        zzgpeVar.zze = 1 | zzgpeVar.zze;
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
                    return new zzgpc(null);
                }
                return new zzgpe();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", zzgpd.zza, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
