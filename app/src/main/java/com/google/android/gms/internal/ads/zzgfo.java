package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgfo extends zzgkq implements zzgmb {
    private static final zzgfo zzb;
    private String zze = "";
    private zzgji zzf = zzgji.zzb;
    private int zzg;

    static {
        zzgfo zzgfoVar = new zzgfo();
        zzb = zzgfoVar;
        zzgkq.zzaP(zzgfo.class, zzgfoVar);
    }

    private zzgfo() {
    }

    public static zzgfn zza() {
        return (zzgfn) zzb.zzay();
    }

    public static /* synthetic */ zzgfo zzc() {
        return zzb;
    }

    public static zzgfo zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzg(zzgfo zzgfoVar, String str) {
        str.getClass();
        zzgfoVar.zze = str;
    }

    public static /* synthetic */ void zzh(zzgfo zzgfoVar, zzgji zzgjiVar) {
        zzgfoVar.zzf = zzgjiVar;
    }

    public static /* synthetic */ void zzj(zzgfo zzgfoVar, int i10) {
        zzgfoVar.zzg = zzggp.zza(i10);
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
                    return new zzgfn(null);
                }
                return new zzgfo();
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
        int zzb2 = zzggp.zzb(this.zzg);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
