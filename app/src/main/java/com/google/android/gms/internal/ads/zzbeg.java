package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbeg extends zzgkq implements zzgmb {
    private static final zzbeg zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzbeg zzbegVar = new zzbeg();
        zzb = zzbegVar;
        zzgkq.zzaP(zzbeg.class, zzbegVar);
    }

    private zzbeg() {
    }

    public static zzbef zza() {
        return (zzbef) zzb.zzay();
    }

    public static /* synthetic */ void zzd(zzbeg zzbegVar, boolean z10) {
        zzbegVar.zze |= 1;
        zzbegVar.zzf = z10;
    }

    public static /* synthetic */ void zze(zzbeg zzbegVar, boolean z10) {
        zzbegVar.zze |= 2;
        zzbegVar.zzg = z10;
    }

    public static /* synthetic */ void zzf(zzbeg zzbegVar, int i10) {
        zzbegVar.zze |= 4;
        zzbegVar.zzh = i10;
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
                    return new zzbef(null);
                }
                return new zzbeg();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
