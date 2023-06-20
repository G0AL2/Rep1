package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgge extends zzgkq implements zzgmb {
    private static final zzgge zzb;
    private int zze;
    private zzggh zzf;

    static {
        zzgge zzggeVar = new zzgge();
        zzb = zzggeVar;
        zzgkq.zzaP(zzgge.class, zzggeVar);
    }

    private zzgge() {
    }

    public static zzggd zzc() {
        return (zzggd) zzb.zzay();
    }

    public static zzgge zze(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgge) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzgge zzggeVar, zzggh zzgghVar) {
        zzgghVar.getClass();
        zzggeVar.zzf = zzgghVar;
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
                    return new zzggd(null);
                }
                return new zzgge();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzggh zzf() {
        zzggh zzgghVar = this.zzf;
        return zzgghVar == null ? zzggh.zzc() : zzgghVar;
    }
}
