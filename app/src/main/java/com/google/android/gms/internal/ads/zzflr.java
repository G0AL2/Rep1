package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzflr extends zzgkq implements zzgmb {
    private static final zzgkw zzb = new zzflo();
    private static final zzflr zze;
    private int zzf;
    private zzgkv zzg = zzgkq.zzaG();
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzflr zzflrVar = new zzflr();
        zze = zzflrVar;
        zzgkq.zzaP(zzflr.class, zzflrVar);
    }

    private zzflr() {
    }

    public static zzflq zza() {
        return (zzflq) zze.zzay();
    }

    public static /* synthetic */ void zzd(zzflr zzflrVar, String str) {
        str.getClass();
        zzflrVar.zzf |= 1;
        zzflrVar.zzh = str;
    }

    public static /* synthetic */ void zze(zzflr zzflrVar, int i10) {
        zzgkv zzgkvVar = zzflrVar.zzg;
        if (!zzgkvVar.zzc()) {
            zzflrVar.zzg = zzgkq.zzaH(zzgkvVar);
        }
        zzflrVar.zzg.zzh(2);
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
                        return zze;
                    }
                    return new zzflq(null);
                }
                return new zzflr();
            }
            return zzgkq.zzaO(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzf", "zzg", zzflp.zza, "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
