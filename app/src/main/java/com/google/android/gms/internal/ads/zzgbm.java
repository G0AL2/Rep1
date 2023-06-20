package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgbm extends zzgkq implements zzgmb {
    private static final zzgbm zzb;
    private int zze;
    private zzgbp zzf;

    static {
        zzgbm zzgbmVar = new zzgbm();
        zzb = zzgbmVar;
        zzgkq.zzaP(zzgbm.class, zzgbmVar);
    }

    private zzgbm() {
    }

    public static zzgbl zzc() {
        return (zzgbl) zzb.zzay();
    }

    public static zzgbm zze(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgbm) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public static /* synthetic */ void zzh(zzgbm zzgbmVar, zzgbp zzgbpVar) {
        zzgbpVar.getClass();
        zzgbmVar.zzf = zzgbpVar;
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
                    return new zzgbl(null);
                }
                return new zzgbm();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgbp zzf() {
        zzgbp zzgbpVar = this.zzf;
        return zzgbpVar == null ? zzgbp.zze() : zzgbpVar;
    }
}
