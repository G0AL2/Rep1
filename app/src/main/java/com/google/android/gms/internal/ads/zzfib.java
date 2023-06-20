package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfib extends zzgkq implements zzgmb {
    private static final zzfib zzb;
    private zzfhx zze;

    static {
        zzfib zzfibVar = new zzfib();
        zzb = zzfibVar;
        zzgkq.zzaP(zzfib.class, zzfibVar);
    }

    private zzfib() {
    }

    public static zzfia zza() {
        return (zzfia) zzb.zzay();
    }

    public static /* synthetic */ zzfib zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzfib zzfibVar, zzfhx zzfhxVar) {
        zzfhxVar.getClass();
        zzfibVar.zze = zzfhxVar;
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
                    return new zzfia(null);
                }
                return new zzfib();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
