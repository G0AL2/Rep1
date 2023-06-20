package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzggb extends zzgkq implements zzgmb {
    private static final zzggb zzb;
    private int zze;
    private zzgkz zzf = zzgkq.zzaJ();

    static {
        zzggb zzggbVar = new zzggb();
        zzb = zzggbVar;
        zzgkq.zzaP(zzggb.class, zzggbVar);
    }

    private zzggb() {
    }

    public static zzgfy zza() {
        return (zzgfy) zzb.zzay();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzggb zzggbVar, zzgga zzggaVar) {
        zzggaVar.getClass();
        zzgkz zzgkzVar = zzggbVar.zzf;
        if (!zzgkzVar.zzc()) {
            zzggbVar.zzf = zzgkq.zzaK(zzgkzVar);
        }
        zzggbVar.zzf.add(zzggaVar);
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
                    return new zzgfy(null);
                }
                return new zzggb();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzgga.class});
        }
        return (byte) 1;
    }
}
