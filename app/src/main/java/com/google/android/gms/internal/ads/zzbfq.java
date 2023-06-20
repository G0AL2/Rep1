package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbfq extends zzgkq implements zzgmb {
    private static final zzbfq zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbfq zzbfqVar = new zzbfq();
        zzb = zzbfqVar;
        zzgkq.zzaP(zzbfq.class, zzbfqVar);
    }

    private zzbfq() {
    }

    public static zzbfj zza() {
        return (zzbfj) zzb.zzay();
    }

    public static zzbfq zzd() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzbfq zzbfqVar, int i10) {
        zzbfqVar.zzf = i10 - 1;
        zzbfqVar.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzbfq zzbfqVar, int i10) {
        zzbfqVar.zzg = i10 - 1;
        zzbfqVar.zze |= 2;
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
                    return new zzbfj(null);
                }
                return new zzbfq();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", zzbfo.zza, "zzg", zzbfl.zza});
        }
        return (byte) 1;
    }

    public final boolean zze() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzf() {
        return (this.zze & 1) != 0;
    }

    public final int zzg() {
        int zza = zzbfm.zza(this.zzg);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzh() {
        int zza = zzbfp.zza(this.zzf);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
