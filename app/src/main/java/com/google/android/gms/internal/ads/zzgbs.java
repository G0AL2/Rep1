package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgbs extends zzgkq implements zzgmb {
    private static final zzgbs zzb;
    private int zze;
    private zzgby zzf;
    private zzgem zzg;

    static {
        zzgbs zzgbsVar = new zzgbs();
        zzb = zzgbsVar;
        zzgkq.zzaP(zzgbs.class, zzgbsVar);
    }

    private zzgbs() {
    }

    public static zzgbr zzc() {
        return (zzgbr) zzb.zzay();
    }

    public static zzgbs zze(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgbs) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public static /* synthetic */ void zzi(zzgbs zzgbsVar, zzgby zzgbyVar) {
        zzgbyVar.getClass();
        zzgbsVar.zzf = zzgbyVar;
    }

    public static /* synthetic */ void zzj(zzgbs zzgbsVar, zzgem zzgemVar) {
        zzgemVar.getClass();
        zzgbsVar.zzg = zzgemVar;
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
                    return new zzgbr(null);
                }
                return new zzgbs();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgby zzf() {
        zzgby zzgbyVar = this.zzf;
        return zzgbyVar == null ? zzgby.zze() : zzgbyVar;
    }

    public final zzgem zzg() {
        zzgem zzgemVar = this.zzg;
        return zzgemVar == null ? zzgem.zze() : zzgemVar;
    }
}
