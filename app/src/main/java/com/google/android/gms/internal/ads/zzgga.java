package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgga extends zzgkq implements zzgmb {
    private static final zzgga zzb;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzgga zzggaVar = new zzgga();
        zzb = zzggaVar;
        zzgkq.zzaP(zzgga.class, zzggaVar);
    }

    private zzgga() {
    }

    public static zzgfz zza() {
        return (zzgfz) zzb.zzay();
    }

    public static /* synthetic */ void zzd(zzgga zzggaVar, String str) {
        str.getClass();
        zzggaVar.zze = str;
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
                    return new zzgfz(null);
                }
                return new zzgga();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
