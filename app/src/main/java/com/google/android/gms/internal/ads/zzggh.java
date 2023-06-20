package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzggh extends zzgkq implements zzgmb {
    private static final zzggh zzb;
    private String zze = "";

    static {
        zzggh zzgghVar = new zzggh();
        zzb = zzgghVar;
        zzgkq.zzaP(zzggh.class, zzgghVar);
    }

    private zzggh() {
    }

    public static zzggh zzc() {
        return zzb;
    }

    public static zzggh zzd(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzggh) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
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
                    return new zzggg(null);
                }
                return new zzggh();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    public final String zze() {
        return this.zze;
    }
}
