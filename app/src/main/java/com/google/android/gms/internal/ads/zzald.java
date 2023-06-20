package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzald extends zzgkq implements zzgmb {
    private static final zzald zzb;
    private int zze;
    private int zzf = 2;

    static {
        zzald zzaldVar = new zzald();
        zzb = zzaldVar;
        zzgkq.zzaP(zzald.class, zzaldVar);
    }

    private zzald() {
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
                    return new zzalc(null);
                }
                return new zzald();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zze", "zzf", zzale.zza});
        }
        return (byte) 1;
    }
}
