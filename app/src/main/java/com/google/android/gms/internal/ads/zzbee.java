package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbee extends zzgkq implements zzgmb {
    private static final zzbee zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbee zzbeeVar = new zzbee();
        zzb = zzbeeVar;
        zzgkq.zzaP(zzbee.class, zzbeeVar);
    }

    private zzbee() {
    }

    public static zzbed zza() {
        return (zzbed) zzb.zzay();
    }

    public static zzbee zzd() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzbee zzbeeVar, boolean z10) {
        zzbeeVar.zze |= 1;
        zzbeeVar.zzf = z10;
    }

    public static /* synthetic */ void zzf(zzbee zzbeeVar, int i10) {
        zzbeeVar.zze |= 2;
        zzbeeVar.zzg = i10;
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
                    return new zzbed(null);
                }
                return new zzbee();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
