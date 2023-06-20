package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgfj extends zzgkq implements zzgmb {
    private static final zzgfj zzb;
    private String zze = "";
    private zzgji zzf = zzgji.zzb;
    private int zzg;

    static {
        zzgfj zzgfjVar = new zzgfj();
        zzb = zzgfjVar;
        zzgkq.zzaP(zzgfj.class, zzgfjVar);
    }

    private zzgfj() {
    }

    public static zzgfi zza() {
        return (zzgfi) zzb.zzay();
    }

    public static zzgfj zzd() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgkq
    protected final Object zzb(int i10, Object obj, Object obj2) {
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
                    return new zzgfi(null);
                }
                return new zzgfj();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgji zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public final int zzi() {
        int i10 = this.zzg;
        int i11 = 4;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 == 1) {
            i11 = 3;
        } else if (i10 != 2) {
            i11 = i10 != 3 ? i10 != 4 ? 0 : 6 : 5;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
