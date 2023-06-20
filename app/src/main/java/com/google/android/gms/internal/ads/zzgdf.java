package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgdf extends zzgkq implements zzgmb {
    private static final zzgdf zzb;
    private int zze;
    private int zzf;

    static {
        zzgdf zzgdfVar = new zzgdf();
        zzb = zzgdfVar;
        zzgkq.zzaP(zzgdf.class, zzgdfVar);
    }

    private zzgdf() {
    }

    public static zzgde zzc() {
        return (zzgde) zzb.zzay();
    }

    public static zzgdf zze(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgdf) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public final int zza() {
        return this.zze;
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
                    return new zzgde(null);
                }
                return new zzgdf();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
