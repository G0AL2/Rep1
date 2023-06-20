package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgdz extends zzgkq implements zzgmb {
    private static final zzgdz zzb;
    private int zze;
    private zzgec zzf;
    private zzgji zzg = zzgji.zzb;

    static {
        zzgdz zzgdzVar = new zzgdz();
        zzb = zzgdzVar;
        zzgkq.zzaP(zzgdz.class, zzgdzVar);
    }

    private zzgdz() {
    }

    public static zzgdy zzc() {
        return (zzgdy) zzb.zzay();
    }

    public static zzgdz zze(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgdz) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public static /* synthetic */ void zzi(zzgdz zzgdzVar, zzgec zzgecVar) {
        zzgecVar.getClass();
        zzgdzVar.zzf = zzgecVar;
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
                    return new zzgdy(null);
                }
                return new zzgdz();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgec zzf() {
        zzgec zzgecVar = this.zzf;
        return zzgecVar == null ? zzgec.zzf() : zzgecVar;
    }

    public final zzgji zzg() {
        return this.zzg;
    }
}
