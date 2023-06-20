package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaqs extends zzgkq implements zzgmb {
    private static final zzaqs zzb;
    private int zze;
    private zzaqv zzf;
    private zzgji zzg;
    private zzgji zzh;

    static {
        zzaqs zzaqsVar = new zzaqs();
        zzb = zzaqsVar;
        zzgkq.zzaP(zzaqs.class, zzaqsVar);
    }

    private zzaqs() {
        zzgji zzgjiVar = zzgji.zzb;
        this.zzg = zzgjiVar;
        this.zzh = zzgjiVar;
    }

    public static zzaqs zzc(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzaqs) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
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
                    return new zzaqr(null);
                }
                return new zzaqs();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final zzaqv zzd() {
        zzaqv zzaqvVar = this.zzf;
        return zzaqvVar == null ? zzaqv.zzg() : zzaqvVar;
    }

    public final zzgji zze() {
        return this.zzh;
    }

    public final zzgji zzf() {
        return this.zzg;
    }
}
