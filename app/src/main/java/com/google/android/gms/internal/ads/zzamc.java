package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzamc extends zzgkq implements zzgmb {
    private static final zzamc zzb;
    private int zze;
    private zzgji zzf;
    private zzgji zzg;
    private zzgji zzh;
    private zzgji zzi;

    static {
        zzamc zzamcVar = new zzamc();
        zzb = zzamcVar;
        zzgkq.zzaP(zzamc.class, zzamcVar);
    }

    private zzamc() {
        zzgji zzgjiVar = zzgji.zzb;
        this.zzf = zzgjiVar;
        this.zzg = zzgjiVar;
        this.zzh = zzgjiVar;
        this.zzi = zzgjiVar;
    }

    public static zzamb zza() {
        return (zzamb) zzb.zzay();
    }

    public static zzamc zzd(byte[] bArr, zzgkc zzgkcVar) throws zzglc {
        return (zzamc) zzgkq.zzaF(zzb, bArr, zzgkcVar);
    }

    public static /* synthetic */ void zzi(zzamc zzamcVar, zzgji zzgjiVar) {
        zzamcVar.zze |= 1;
        zzamcVar.zzf = zzgjiVar;
    }

    public static /* synthetic */ void zzj(zzamc zzamcVar, zzgji zzgjiVar) {
        zzamcVar.zze |= 2;
        zzamcVar.zzg = zzgjiVar;
    }

    public static /* synthetic */ void zzk(zzamc zzamcVar, zzgji zzgjiVar) {
        zzamcVar.zze |= 4;
        zzamcVar.zzh = zzgjiVar;
    }

    public static /* synthetic */ void zzl(zzamc zzamcVar, zzgji zzgjiVar) {
        zzamcVar.zze |= 8;
        zzamcVar.zzi = zzgjiVar;
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
                    return new zzamb(null);
                }
                return new zzamc();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final zzgji zze() {
        return this.zzf;
    }

    public final zzgji zzf() {
        return this.zzg;
    }

    public final zzgji zzg() {
        return this.zzi;
    }

    public final zzgji zzh() {
        return this.zzh;
    }
}
