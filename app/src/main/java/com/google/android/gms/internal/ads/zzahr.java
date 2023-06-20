package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnection;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzahr implements zzahs {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, DownloadResource.STATUS_PENDING, 209, 230, 253, 279, DownloadConnection.HTTP_TEMP_REDIRECT, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, DownloadResource.STATUS_UNHANDLED_HTTP_CODE, 544, 598, 658, 724, 796, 876, 963, IronSourceError.ERROR_DO_RV_LOAD_MISSING_ACTIVITY, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzyu zzc;
    private final zzzy zzd;
    private final zzahv zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzdy zzh;
    private final int zzi;
    private final zzad zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzahr(zzyu zzyuVar, zzzy zzzyVar, zzahv zzahvVar) throws zzbp {
        this.zzc = zzyuVar;
        this.zzd = zzzyVar;
        this.zze = zzahvVar;
        int max = Math.max(1, zzahvVar.zzc / 10);
        this.zzi = max;
        zzdy zzdyVar = new zzdy(zzahvVar.zzf);
        zzdyVar.zzi();
        int zzi = zzdyVar.zzi();
        this.zzf = zzi;
        int i10 = zzahvVar.zzb;
        int i11 = (((zzahvVar.zzd - (i10 * 4)) * 8) / (zzahvVar.zze * i10)) + 1;
        if (zzi == i11) {
            int zze = zzeg.zze(max, zzi);
            this.zzg = new byte[zzahvVar.zzd * zze];
            this.zzh = new zzdy(zze * (zzi + zzi) * i10);
            int i12 = ((zzahvVar.zzc * zzahvVar.zzd) * 8) / zzi;
            zzab zzabVar = new zzab();
            zzabVar.zzS("audio/raw");
            zzabVar.zzv(i12);
            zzabVar.zzO(i12);
            zzabVar.zzL((max + max) * i10);
            zzabVar.zzw(zzahvVar.zzb);
            zzabVar.zzT(zzahvVar.zzc);
            zzabVar.zzN(2);
            this.zzj = zzabVar.zzY();
            return;
        }
        throw zzbp.zza("Expected frames per block: " + i11 + "; got: " + zzi, null);
    }

    private final int zzd(int i10) {
        int i11 = this.zze.zzb;
        return i10 / (i11 + i11);
    }

    private final int zze(int i10) {
        return (i10 + i10) * this.zze.zzb;
    }

    private final void zzf(int i10) {
        long j10 = this.zzl;
        long zzw = zzeg.zzw(this.zzn, 1000000L, this.zze.zzc);
        int zze = zze(i10);
        this.zzd.zzs(j10 + zzw, 1, zze, this.zzm - zze, null);
        this.zzn += i10;
        this.zzm -= zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final void zza(int i10, long j10) {
        this.zzc.zzL(new zzahy(this.zze, this.zzf, i10, j10));
        this.zzd.zzk(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final void zzb(long j10) {
        this.zzk = 0;
        this.zzl = j10;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x001f). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzahs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzys r20, long r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahr.zzc(com.google.android.gms.internal.ads.zzys, long):boolean");
    }
}
