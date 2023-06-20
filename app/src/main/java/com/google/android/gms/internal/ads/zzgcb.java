package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgcb extends zzgkq implements zzgmb {
    private static final zzgcb zzb;
    private zzgce zze;
    private int zzf;

    static {
        zzgcb zzgcbVar = new zzgcb();
        zzb = zzgcbVar;
        zzgkq.zzaP(zzgcb.class, zzgcbVar);
    }

    private zzgcb() {
    }

    public static zzgca zzc() {
        return (zzgca) zzb.zzay();
    }

    public static zzgcb zze() {
        return zzb;
    }

    public static zzgcb zzf(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgcb) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public static /* synthetic */ void zzh(zzgcb zzgcbVar, zzgce zzgceVar) {
        zzgceVar.getClass();
        zzgcbVar.zze = zzgceVar;
    }

    public final int zza() {
        return this.zzf;
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
                    return new zzgca(null);
                }
                return new zzgcb();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgce zzg() {
        zzgce zzgceVar = this.zze;
        return zzgceVar == null ? zzgce.zze() : zzgceVar;
    }
}
