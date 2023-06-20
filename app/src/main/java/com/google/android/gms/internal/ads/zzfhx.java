package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfhx extends zzgkq implements zzgmb {
    private static final zzfhx zzb;
    private int zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private int zzp;
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private String zzt = "";
    private String zzu = "";

    static {
        zzfhx zzfhxVar = new zzfhx();
        zzb = zzfhxVar;
        zzgkq.zzaP(zzfhx.class, zzfhxVar);
    }

    private zzfhx() {
    }

    public static zzfhw zza() {
        return (zzfhw) zzb.zzay();
    }

    public static /* synthetic */ void zzd(zzfhx zzfhxVar, String str) {
        str.getClass();
        zzfhxVar.zzi = str;
    }

    public static /* synthetic */ void zze(zzfhx zzfhxVar, String str) {
        str.getClass();
        zzfhxVar.zzj = str;
    }

    public static /* synthetic */ void zzf(zzfhx zzfhxVar, String str) {
        str.getClass();
        zzfhxVar.zzk = str;
    }

    public static /* synthetic */ void zzj(zzfhx zzfhxVar, String str) {
        str.getClass();
        zzfhxVar.zzq = str;
    }

    public static /* synthetic */ void zzk(zzfhx zzfhxVar, String str) {
        str.getClass();
        zzfhxVar.zzr = str;
    }

    public static /* synthetic */ void zzl(zzfhx zzfhxVar, String str) {
        str.getClass();
        zzfhxVar.zzs = str;
    }

    public static /* synthetic */ void zzo(zzfhx zzfhxVar, String str) {
        str.getClass();
        zzfhxVar.zzu = str;
    }

    public static /* synthetic */ void zzr(zzfhx zzfhxVar, int i10) {
        if (i10 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzfhxVar.zzm = i10 - 2;
    }

    public static /* synthetic */ void zzs(zzfhx zzfhxVar, int i10) {
        if (i10 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzfhxVar.zzp = i10 - 2;
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
                    return new zzfhw(null);
                }
                return new zzfhx();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        return (byte) 1;
    }
}
