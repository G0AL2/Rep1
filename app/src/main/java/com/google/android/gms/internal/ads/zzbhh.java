package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbhh extends zzgkq implements zzgmb {
    private static final zzbhh zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbhh zzbhhVar = new zzbhh();
        zzb = zzbhhVar;
        zzgkq.zzaP(zzbhh.class, zzbhhVar);
    }

    private zzbhh() {
    }

    public static zzbhg zza() {
        return (zzbhg) zzb.zzay();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzbhh zzbhhVar, boolean z10) {
        zzbhhVar.zze |= 1;
        zzbhhVar.zzf = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzbhh zzbhhVar, int i10) {
        zzbhhVar.zze |= 2;
        zzbhhVar.zzg = i10;
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
                    return new zzbhg(null);
                }
                return new zzbhh();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final boolean zzf() {
        return this.zzf;
    }
}
