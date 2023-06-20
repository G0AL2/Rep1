package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgep extends zzgkq implements zzgmb {
    private static final zzgep zzb;
    private zzges zze;
    private int zzf;
    private int zzg;

    static {
        zzgep zzgepVar = new zzgep();
        zzb = zzgepVar;
        zzgkq.zzaP(zzgep.class, zzgepVar);
    }

    private zzgep() {
    }

    public static zzgeo zzc() {
        return (zzgeo) zzb.zzay();
    }

    public static zzgep zze() {
        return zzb;
    }

    public static zzgep zzf(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgep) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public static /* synthetic */ void zzh(zzgep zzgepVar, zzges zzgesVar) {
        zzgesVar.getClass();
        zzgepVar.zze = zzgesVar;
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
                    return new zzgeo(null);
                }
                return new zzgep();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzges zzg() {
        zzges zzgesVar = this.zze;
        return zzgesVar == null ? zzges.zze() : zzgesVar;
    }
}
