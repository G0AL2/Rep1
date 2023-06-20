package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgdq extends zzgkq implements zzgmb {
    private static final zzgdq zzb;
    private zzgfo zze;

    static {
        zzgdq zzgdqVar = new zzgdq();
        zzb = zzgdqVar;
        zzgkq.zzaP(zzgdq.class, zzgdqVar);
    }

    private zzgdq() {
    }

    public static zzgdp zza() {
        return (zzgdp) zzb.zzay();
    }

    public static zzgdq zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzf(zzgdq zzgdqVar, zzgfo zzgfoVar) {
        zzgfoVar.getClass();
        zzgdqVar.zze = zzgfoVar;
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
                    return new zzgdp(null);
                }
                return new zzgdq();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    public final zzgfo zze() {
        zzgfo zzgfoVar = this.zze;
        return zzgfoVar == null ? zzgfo.zzd() : zzgfoVar;
    }
}
