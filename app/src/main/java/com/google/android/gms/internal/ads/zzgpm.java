package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgpm extends zzgkq implements zzgmb {
    private static final zzgpm zzb;
    private int zze;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private String zzf = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zzgpm zzgpmVar = new zzgpm();
        zzb = zzgpmVar;
        zzgkq.zzaP(zzgpm.class, zzgpmVar);
    }

    private zzgpm() {
    }

    public static zzgpl zza() {
        return (zzgpl) zzb.zzay();
    }

    public static /* synthetic */ void zzd(zzgpm zzgpmVar, String str) {
        zzgpmVar.zze |= 1;
        zzgpmVar.zzf = str;
    }

    public static /* synthetic */ void zze(zzgpm zzgpmVar, long j10) {
        zzgpmVar.zze |= 2;
        zzgpmVar.zzg = j10;
    }

    public static /* synthetic */ void zzf(zzgpm zzgpmVar, boolean z10) {
        zzgpmVar.zze |= 4;
        zzgpmVar.zzh = z10;
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
                    return new zzgpl(null);
                }
                return new zzgpm();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzgpn.zza, "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
