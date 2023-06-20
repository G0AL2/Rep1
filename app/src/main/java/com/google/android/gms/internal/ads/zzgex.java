package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgex extends zzgkq implements zzgmb {
    private static final zzgex zzb;
    private zzgfa zze;

    static {
        zzgex zzgexVar = new zzgex();
        zzb = zzgexVar;
        zzgkq.zzaP(zzgex.class, zzgexVar);
    }

    private zzgex() {
    }

    public static zzgew zza() {
        return (zzgew) zzb.zzay();
    }

    public static zzgex zzd(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgex) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public static /* synthetic */ void zzf(zzgex zzgexVar, zzgfa zzgfaVar) {
        zzgfaVar.getClass();
        zzgexVar.zze = zzgfaVar;
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
                    return new zzgew(null);
                }
                return new zzgex();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    public final zzgfa zze() {
        zzgfa zzgfaVar = this.zze;
        return zzgfaVar == null ? zzgfa.zzd() : zzgfaVar;
    }
}
