package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfic extends zzgkq implements zzgmb {
    private static final zzfic zzb;
    private zzgkz zze = zzgkq.zzaJ();

    static {
        zzfic zzficVar = new zzfic();
        zzb = zzficVar;
        zzgkq.zzaP(zzfic.class, zzficVar);
    }

    private zzfic() {
    }

    public static zzfhz zzc() {
        return (zzfhz) zzb.zzay();
    }

    public static /* synthetic */ zzfic zzd() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzfic zzficVar) {
        zzficVar.zze = zzgkq.zzaJ();
    }

    public static /* synthetic */ void zzf(zzfic zzficVar, zzfib zzfibVar) {
        zzfibVar.getClass();
        zzgkz zzgkzVar = zzficVar.zze;
        if (!zzgkzVar.zzc()) {
            zzficVar.zze = zzgkq.zzaK(zzgkzVar);
        }
        zzficVar.zze.add(zzfibVar);
    }

    public final int zza() {
        return this.zze.size();
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
                    return new zzfhz(null);
                }
                return new zzfic();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzfib.class});
        }
        return (byte) 1;
    }
}
