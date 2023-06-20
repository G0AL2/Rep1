package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzyp {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, DownloadResource.STATUS_RUNNING, 224, 256, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 640, 768, 896, IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static zzad zza(byte[] bArr, String str, String str2, zzv zzvVar) {
        zzdx zzdxVar;
        if (bArr[0] == Byte.MAX_VALUE) {
            zzdxVar = new zzdx(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b10 = copyOf[0];
            if (b10 == -2 || b10 == -1) {
                for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                    byte b11 = copyOf[i10];
                    int i11 = i10 + 1;
                    copyOf[i10] = copyOf[i11];
                    copyOf[i11] = b11;
                }
            }
            int length = copyOf.length;
            zzdxVar = new zzdx(copyOf, length);
            if (copyOf[0] == 31) {
                zzdx zzdxVar2 = new zzdx(copyOf, length);
                while (zzdxVar2.zza() >= 16) {
                    zzdxVar2.zzj(2);
                    zzdxVar.zze(zzdxVar2.zzc(14), 14);
                }
            }
            zzdxVar.zzg(copyOf, copyOf.length);
        }
        zzdxVar.zzj(60);
        int i12 = zzb[zzdxVar.zzc(6)];
        int i13 = zzc[zzdxVar.zzc(4)];
        int zzc2 = zzdxVar.zzc(5);
        int i14 = zzc2 < 29 ? (zzd[zzc2] * 1000) / 2 : -1;
        zzdxVar.zzj(10);
        int i15 = zzdxVar.zzc(2) > 0 ? 1 : 0;
        zzab zzabVar = new zzab();
        zzabVar.zzH(str);
        zzabVar.zzS("audio/vnd.dts");
        zzabVar.zzv(i14);
        zzabVar.zzw(i12 + i15);
        zzabVar.zzT(i13);
        zzabVar.zzB(null);
        zzabVar.zzK(str2);
        return zzabVar.zzY();
    }
}
