package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgcz extends zzgkq implements zzgmb {
    private static final zzgcz zzb;
    private int zze;
    private int zzf;

    static {
        zzgcz zzgczVar = new zzgcz();
        zzb = zzgczVar;
        zzgkq.zzaP(zzgcz.class, zzgczVar);
    }

    private zzgcz() {
    }

    public static zzgcy zzc() {
        return (zzgcy) zzb.zzay();
    }

    public static zzgcz zze(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgcz) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
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
                    return new zzgcy(null);
                }
                return new zzgcz();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        }
        return (byte) 1;
    }
}
