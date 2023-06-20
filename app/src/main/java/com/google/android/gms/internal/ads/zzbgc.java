package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbgc extends zzgkq implements zzgmb {
    private static final zzbgc zzb;
    private int zze;
    private int zzf = 1000;
    private int zzg = 1000;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private zzbge zzp;

    static {
        zzbgc zzbgcVar = new zzbgc();
        zzb = zzbgcVar;
        zzgkq.zzaP(zzbgc.class, zzbgcVar);
    }

    private zzbgc() {
    }

    @Override // com.google.android.gms.internal.ads.zzgkq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                zzgku zzgkuVar = zzbez.zza;
                return zzgkq.zzaO(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zze", "zzf", zzgkuVar, "zzg", zzgkuVar, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
            } else if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzbgb(null);
            } else {
                return new zzbgc();
            }
        }
        return (byte) 1;
    }
}
