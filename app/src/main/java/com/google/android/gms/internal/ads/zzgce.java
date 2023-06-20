package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgce extends zzgkq implements zzgmb {
    private static final zzgce zzb;
    private int zze;

    static {
        zzgce zzgceVar = new zzgce();
        zzb = zzgceVar;
        zzgkq.zzaP(zzgce.class, zzgceVar);
    }

    private zzgce() {
    }

    public static zzgcd zzc() {
        return (zzgcd) zzb.zzay();
    }

    public static zzgce zze() {
        return zzb;
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
                    return new zzgcd(null);
                }
                return new zzgce();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
