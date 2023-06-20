package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgot extends zzgkq implements zzgmb {
    private static final zzgot zzb;
    private int zze;
    private zzgji zzf;
    private zzgji zzg;
    private byte zzh = 2;

    static {
        zzgot zzgotVar = new zzgot();
        zzb = zzgotVar;
        zzgkq.zzaP(zzgot.class, zzgotVar);
    }

    private zzgot() {
        zzgji zzgjiVar = zzgji.zzb;
        this.zzf = zzgjiVar;
        this.zzg = zzgjiVar;
    }

    public static zzgos zza() {
        return (zzgos) zzb.zzay();
    }

    public static /* synthetic */ zzgot zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzgot zzgotVar, zzgji zzgjiVar) {
        zzgotVar.zze |= 1;
        zzgotVar.zzf = zzgjiVar;
    }

    public static /* synthetic */ void zze(zzgot zzgotVar, zzgji zzgjiVar) {
        zzgotVar.zze |= 2;
        zzgotVar.zzg = zzgjiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgkq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            this.zzh = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgos(null);
                }
                return new zzgot();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
