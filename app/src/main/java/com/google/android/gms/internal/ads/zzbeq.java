package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbeq extends zzgkq implements zzgmb {
    private static final zzbeq zzb;
    private int zze;
    private String zzf = "";
    private zzgkz zzg = zzgkq.zzaJ();
    private int zzh = 1000;
    private int zzi = 1000;
    private int zzj = 1000;

    static {
        zzbeq zzbeqVar = new zzbeq();
        zzb = zzbeqVar;
        zzgkq.zzaP(zzbeq.class, zzbeqVar);
    }

    private zzbeq() {
    }

    public static zzbeq zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzbeq zzbeqVar, String str) {
        str.getClass();
        zzbeqVar.zze |= 1;
        zzbeqVar.zzf = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgkq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                zzgku zzgkuVar = zzbez.zza;
                return zzgkq.zzaO(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zze", "zzf", "zzg", zzbem.class, "zzh", zzgkuVar, "zzi", zzgkuVar, "zzj", zzgkuVar});
            } else if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzbep(null);
            } else {
                return new zzbeq();
            }
        }
        return (byte) 1;
    }
}
