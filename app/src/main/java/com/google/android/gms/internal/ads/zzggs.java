package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzggs extends zzgkq implements zzgmb {
    private static final zzggs zzb;
    private String zze = "";
    private zzgkz zzf = zzgkq.zzaJ();

    static {
        zzggs zzggsVar = new zzggs();
        zzb = zzggsVar;
        zzgkq.zzaP(zzggs.class, zzggsVar);
    }

    private zzggs() {
    }

    public static zzggs zzc() {
        return zzb;
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
                    return new zzggr(null);
                }
                return new zzggs();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzgfr.class});
        }
        return (byte) 1;
    }

    public final List zzd() {
        return this.zzf;
    }
}
