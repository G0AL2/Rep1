package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgdl extends zzgkq implements zzgmb {
    private static final zzgdl zzb;

    static {
        zzgdl zzgdlVar = new zzgdl();
        zzb = zzgdlVar;
        zzgkq.zzaP(zzgdl.class, zzgdlVar);
    }

    private zzgdl() {
    }

    public static zzgdl zzc() {
        return zzb;
    }

    public static zzgdl zzd(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgdl) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
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
                    return new zzgdk(null);
                }
                return new zzgdl();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
