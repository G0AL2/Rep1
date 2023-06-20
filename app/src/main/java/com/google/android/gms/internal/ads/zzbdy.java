package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbdy extends zzgkq implements zzgmb {
    private static final zzbdy zzb;
    private int zze;
    private int zzf;
    private zzbeo zzh;
    private zzbeq zzi;
    private zzbes zzk;
    private zzbgc zzl;
    private zzbfs zzm;
    private zzbfg zzn;
    private zzbfi zzo;
    private int zzg = 1000;
    private zzgkz zzj = zzgkq.zzaJ();
    private zzgkz zzp = zzgkq.zzaJ();

    static {
        zzbdy zzbdyVar = new zzbdy();
        zzb = zzbdyVar;
        zzgkq.zzaP(zzbdy.class, zzbdyVar);
    }

    private zzbdy() {
    }

    public static zzbdy zzc() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzbdy zzbdyVar, zzbdw zzbdwVar) {
        zzbdyVar.zzf = zzbdwVar.zza();
        zzbdyVar.zze |= 1;
    }

    public static /* synthetic */ void zzf(zzbdy zzbdyVar, zzbeq zzbeqVar) {
        zzbeqVar.getClass();
        zzbdyVar.zzi = zzbeqVar;
        zzbdyVar.zze |= 8;
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
                    return new zzbdx(null);
                }
                return new zzbdy();
            }
            return zzgkq.zzaO(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zze", "zzf", zzbdw.zzc(), "zzg", zzbez.zza, "zzh", "zzi", "zzj", zzbem.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", zzbgo.class});
        }
        return (byte) 1;
    }

    public final zzbeq zzd() {
        zzbeq zzbeqVar = this.zzi;
        return zzbeqVar == null ? zzbeq.zzc() : zzbeqVar;
    }
}
