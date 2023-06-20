package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgdt extends zzgkq implements zzgmb {
    private static final zzgdt zzb;
    private zzgdw zze;

    static {
        zzgdt zzgdtVar = new zzgdt();
        zzb = zzgdtVar;
        zzgkq.zzaP(zzgdt.class, zzgdtVar);
    }

    private zzgdt() {
    }

    public static zzgds zza() {
        return (zzgds) zzb.zzay();
    }

    public static zzgdt zzd(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgdt) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public static /* synthetic */ void zzf(zzgdt zzgdtVar, zzgdw zzgdwVar) {
        zzgdwVar.getClass();
        zzgdtVar.zze = zzgdwVar;
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
                    return new zzgds(null);
                }
                return new zzgdt();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    public final zzgdw zze() {
        zzgdw zzgdwVar = this.zze;
        return zzgdwVar == null ? zzgdw.zze() : zzgdwVar;
    }
}
