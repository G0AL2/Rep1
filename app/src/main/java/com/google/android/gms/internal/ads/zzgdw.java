package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgdw extends zzgkq implements zzgmb {
    private static final zzgdw zzb;
    private zzgef zze;
    private zzgdq zzf;
    private int zzg;

    static {
        zzgdw zzgdwVar = new zzgdw();
        zzb = zzgdwVar;
        zzgkq.zzaP(zzgdw.class, zzgdwVar);
    }

    private zzgdw() {
    }

    public static zzgdv zzc() {
        return (zzgdv) zzb.zzay();
    }

    public static zzgdw zze() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzgdw zzgdwVar, zzgef zzgefVar) {
        zzgefVar.getClass();
        zzgdwVar.zze = zzgefVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzgdw zzgdwVar, zzgdq zzgdqVar) {
        zzgdqVar.getClass();
        zzgdwVar.zzf = zzgdqVar;
    }

    public final zzgdq zza() {
        zzgdq zzgdqVar = this.zzf;
        return zzgdqVar == null ? zzgdq.zzd() : zzgdqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
                    return new zzgdv(null);
                }
                return new zzgdw();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgef zzf() {
        zzgef zzgefVar = this.zze;
        return zzgefVar == null ? zzgef.zzd() : zzgefVar;
    }

    public final int zzi() {
        int i10 = this.zzg;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            i11 = i10 != 2 ? i10 != 3 ? 0 : 5 : 4;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
