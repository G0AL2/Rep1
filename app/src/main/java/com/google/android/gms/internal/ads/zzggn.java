package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzggn extends zzgkq implements zzgmb {
    private static final zzggn zzb;
    private String zze = "";
    private zzgfo zzf;

    static {
        zzggn zzggnVar = new zzggn();
        zzb = zzggnVar;
        zzgkq.zzaP(zzggn.class, zzggnVar);
    }

    private zzggn() {
    }

    public static zzggn zzd() {
        return zzb;
    }

    public static zzggn zze(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzggn) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public final zzgfo zza() {
        zzgfo zzgfoVar = this.zzf;
        return zzgfoVar == null ? zzgfo.zzd() : zzgfoVar;
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
                    return new zzggm(null);
                }
                return new zzggn();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zzf != null;
    }
}
