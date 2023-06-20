package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgow extends zzgkq implements zzgmb {
    private static final zzgow zzb;
    private int zze;
    private zzgji zzf;
    private zzgji zzg;
    private zzgji zzh;

    static {
        zzgow zzgowVar = new zzgow();
        zzb = zzgowVar;
        zzgkq.zzaP(zzgow.class, zzgowVar);
    }

    private zzgow() {
        zzgji zzgjiVar = zzgji.zzb;
        this.zzf = zzgjiVar;
        this.zzg = zzgjiVar;
        this.zzh = zzgjiVar;
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
                    return new zzgov(null);
                }
                return new zzgow();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
