package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgcq extends zzgkq implements zzgmb {
    private static final zzgcq zzb;
    private int zze;
    private zzgji zzf = zzgji.zzb;

    static {
        zzgcq zzgcqVar = new zzgcq();
        zzb = zzgcqVar;
        zzgkq.zzaP(zzgcq.class, zzgcqVar);
    }

    private zzgcq() {
    }

    public static zzgcp zzc() {
        return (zzgcp) zzb.zzay();
    }

    public static zzgcq zze(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgcq) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public final int zza() {
        return this.zze;
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
                    return new zzgcp(null);
                }
                return new zzgcq();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgji zzf() {
        return this.zzf;
    }
}
