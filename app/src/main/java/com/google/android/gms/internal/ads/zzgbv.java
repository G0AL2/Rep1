package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgbv extends zzgkq implements zzgmb {
    private static final zzgbv zzb;
    private zzgcb zze;
    private zzgep zzf;

    static {
        zzgbv zzgbvVar = new zzgbv();
        zzb = zzgbvVar;
        zzgkq.zzaP(zzgbv.class, zzgbvVar);
    }

    private zzgbv() {
    }

    public static zzgbu zza() {
        return (zzgbu) zzb.zzay();
    }

    public static zzgbv zzd(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgbv) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public static /* synthetic */ void zzg(zzgbv zzgbvVar, zzgcb zzgcbVar) {
        zzgcbVar.getClass();
        zzgbvVar.zze = zzgcbVar;
    }

    public static /* synthetic */ void zzh(zzgbv zzgbvVar, zzgep zzgepVar) {
        zzgepVar.getClass();
        zzgbvVar.zzf = zzgepVar;
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
                    return new zzgbu(null);
                }
                return new zzgbv();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgcb zze() {
        zzgcb zzgcbVar = this.zze;
        return zzgcbVar == null ? zzgcb.zze() : zzgcbVar;
    }

    public final zzgep zzf() {
        zzgep zzgepVar = this.zzf;
        return zzgepVar == null ? zzgep.zze() : zzgepVar;
    }
}
