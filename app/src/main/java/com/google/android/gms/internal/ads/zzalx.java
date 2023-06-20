package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzalx extends zzgkq implements zzgmb {
    private static final zzalx zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;

    static {
        zzalx zzalxVar = new zzalx();
        zzb = zzalxVar;
        zzgkq.zzaP(zzalx.class, zzalxVar);
    }

    private zzalx() {
    }

    public static zzalw zza() {
        return (zzalw) zzb.zzay();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzalx zzalxVar, long j10) {
        zzalxVar.zze |= 1;
        zzalxVar.zzf = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzalx zzalxVar, long j10) {
        zzalxVar.zze |= 4;
        zzalxVar.zzh = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzalx zzalxVar, long j10) {
        zzalxVar.zze |= 8;
        zzalxVar.zzi = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzalx zzalxVar, long j10) {
        zzalxVar.zze |= 16;
        zzalxVar.zzj = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzalx zzalxVar, long j10) {
        zzalxVar.zze |= 32;
        zzalxVar.zzk = j10;
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
                    return new zzalw(null);
                }
                return new zzalx();
            }
            return zzgkq.zzaO(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
