package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgct extends zzgkq implements zzgmb {
    private static final zzgct zzb;
    private int zze;
    private int zzf;

    static {
        zzgct zzgctVar = new zzgct();
        zzb = zzgctVar;
        zzgkq.zzaP(zzgct.class, zzgctVar);
    }

    private zzgct() {
    }

    public static zzgcs zzc() {
        return (zzgcs) zzb.zzay();
    }

    public static zzgct zze(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgct) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
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
                    return new zzgcs(null);
                }
                return new zzgct();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
