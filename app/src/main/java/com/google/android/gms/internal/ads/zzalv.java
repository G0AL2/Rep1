package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzalv extends zzgkq implements zzgmb {
    private static final zzalv zzb;
    private int zze;
    private long zzu;
    private long zzv;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private int zzp = 1000;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzt = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        zzalv zzalvVar = new zzalv();
        zzb = zzalvVar;
        zzgkq.zzaP(zzalv.class, zzalvVar);
    }

    private zzalv() {
    }

    public static zzalu zza() {
        return (zzalu) zzb.zzay();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzalv zzalvVar, long j10) {
        zzalvVar.zze |= 1;
        zzalvVar.zzf = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzalv zzalvVar, long j10) {
        zzalvVar.zze |= 2;
        zzalvVar.zzg = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzalv zzalvVar, long j10) {
        zzalvVar.zze |= 4;
        zzalvVar.zzh = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzalv zzalvVar, long j10) {
        zzalvVar.zze |= 8;
        zzalvVar.zzi = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzalv zzalvVar) {
        zzalvVar.zze &= -9;
        zzalvVar.zzi = -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzalv zzalvVar, long j10) {
        zzalvVar.zze |= 16;
        zzalvVar.zzj = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzalv zzalvVar, long j10) {
        zzalvVar.zze |= 32;
        zzalvVar.zzk = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzk(zzalv zzalvVar, long j10) {
        zzalvVar.zze |= 128;
        zzalvVar.zzm = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzl(zzalv zzalvVar, long j10) {
        zzalvVar.zze |= 256;
        zzalvVar.zzn = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzm(zzalv zzalvVar, long j10) {
        zzalvVar.zze |= AdRequest.MAX_CONTENT_URL_LENGTH;
        zzalvVar.zzo = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzn(zzalv zzalvVar, long j10) {
        zzalvVar.zze |= 2048;
        zzalvVar.zzq = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzo(zzalv zzalvVar, long j10) {
        zzalvVar.zze |= 4096;
        zzalvVar.zzr = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzp(zzalv zzalvVar, long j10) {
        zzalvVar.zze |= Constants.BUFFER_SIZE;
        zzalvVar.zzs = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzq(zzalv zzalvVar, long j10) {
        zzalvVar.zze |= 16384;
        zzalvVar.zzt = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzr(zzalv zzalvVar, long j10) {
        zzalvVar.zze |= 32768;
        zzalvVar.zzu = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzs(zzalv zzalvVar, long j10) {
        zzalvVar.zze |= Constants.MIN_PROGRESS_STEP;
        zzalvVar.zzv = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzt(zzalv zzalvVar, long j10) {
        zzalvVar.zze |= 131072;
        zzalvVar.zzw = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzu(zzalv zzalvVar, long j10) {
        zzalvVar.zze |= 262144;
        zzalvVar.zzx = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzv(zzalv zzalvVar, int i10) {
        zzalvVar.zzl = i10 - 1;
        zzalvVar.zze |= 64;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzw(zzalv zzalvVar, int i10) {
        zzalvVar.zzp = i10 - 1;
        zzalvVar.zze |= IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgkq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                zzgku zzgkuVar = zzame.zza;
                return zzgkq.zzaO(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzgkuVar, "zzm", "zzn", "zzo", "zzp", zzgkuVar, "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
            } else if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzalu(null);
            } else {
                return new zzalv();
            }
        }
        return (byte) 1;
    }
}
