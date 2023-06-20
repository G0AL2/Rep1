package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgef extends zzgkq implements zzgmb {
    private static final zzgef zzb;
    private int zze;
    private int zzf;
    private zzgji zzg = zzgji.zzb;

    static {
        zzgef zzgefVar = new zzgef();
        zzb = zzgefVar;
        zzgkq.zzaP(zzgef.class, zzgefVar);
    }

    private zzgef() {
    }

    public static zzgee zza() {
        return (zzgee) zzb.zzay();
    }

    public static zzgef zzd() {
        return zzb;
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
                    return new zzgee(null);
                }
                return new zzgef();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgji zze() {
        return this.zzg;
    }

    public final int zzg() {
        int i10 = this.zze;
        int i11 = 5;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 == 2) {
            i11 = 4;
        } else if (i10 != 3) {
            i11 = i10 != 4 ? i10 != 5 ? 0 : 7 : 6;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int zzh() {
        int zzb2 = zzgej.zzb(this.zzf);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
