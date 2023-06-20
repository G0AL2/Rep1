package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgfa extends zzgkq implements zzgmb {
    private static final zzgfa zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgfa zzgfaVar = new zzgfa();
        zzb = zzgfaVar;
        zzgkq.zzaP(zzgfa.class, zzgfaVar);
    }

    private zzgfa() {
    }

    public static zzgez zza() {
        return (zzgez) zzb.zzay();
    }

    public static zzgfa zzd() {
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
                    return new zzgez(null);
                }
                return new zzgfa();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final int zze() {
        int i10 = this.zzg;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            i11 = i10 != 2 ? i10 != 3 ? 0 : 5 : 4;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int zzf() {
        int i10 = this.zzf;
        int i11 = i10 != 0 ? i10 != 1 ? 0 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int zzg() {
        int i10 = this.zze;
        int i11 = i10 != 0 ? i10 != 1 ? 0 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
