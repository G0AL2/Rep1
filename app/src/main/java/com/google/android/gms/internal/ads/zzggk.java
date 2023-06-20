package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzggk extends zzgkq implements zzgmb {
    private static final zzggk zzb;
    private int zze;
    private zzggn zzf;

    static {
        zzggk zzggkVar = new zzggk();
        zzb = zzggkVar;
        zzgkq.zzaP(zzggk.class, zzggkVar);
    }

    private zzggk() {
    }

    public static zzggj zzc() {
        return (zzggj) zzb.zzay();
    }

    public static zzggk zze(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzggk) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzggk zzggkVar, zzggn zzggnVar) {
        zzggnVar.getClass();
        zzggkVar.zzf = zzggnVar;
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
                    return new zzggj(null);
                }
                return new zzggk();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzggn zzf() {
        zzggn zzggnVar = this.zzf;
        return zzggnVar == null ? zzggn.zzd() : zzggnVar;
    }
}
