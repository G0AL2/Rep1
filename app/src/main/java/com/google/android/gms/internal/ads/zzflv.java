package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzflv extends zzgkq implements zzgmb {
    private static final zzflv zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private zzflr zzi;

    static {
        zzflv zzflvVar = new zzflv();
        zzb = zzflvVar;
        zzgkq.zzaP(zzflv.class, zzflvVar);
    }

    private zzflv() {
    }

    public static zzflt zza() {
        return (zzflt) zzb.zzay();
    }

    public static /* synthetic */ zzflv zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzflv zzflvVar, String str) {
        str.getClass();
        zzflvVar.zze |= 2;
        zzflvVar.zzg = str;
    }

    public static /* synthetic */ void zze(zzflv zzflvVar, zzflr zzflrVar) {
        zzflrVar.getClass();
        zzflvVar.zzi = zzflrVar;
        zzflvVar.zze |= 8;
    }

    public static /* synthetic */ void zzf(zzflv zzflvVar, int i10) {
        zzflvVar.zzf = 1;
        zzflvVar.zze = 1 | zzflvVar.zze;
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
                    return new zzflt(null);
                }
                return new zzflv();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", zzflu.zza, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
