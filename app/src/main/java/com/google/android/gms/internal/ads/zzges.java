package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzges extends zzgkq implements zzgmb {
    private static final zzges zzb;
    private int zze;
    private int zzf;

    static {
        zzges zzgesVar = new zzges();
        zzb = zzgesVar;
        zzgkq.zzaP(zzges.class, zzgesVar);
    }

    private zzges() {
    }

    public static zzger zzc() {
        return (zzger) zzb.zzay();
    }

    public static zzges zze() {
        return zzb;
    }

    public final int zza() {
        return this.zzf;
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
                    return new zzger(null);
                }
                return new zzges();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int zzg() {
        int zzb2 = zzgej.zzb(this.zze);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
