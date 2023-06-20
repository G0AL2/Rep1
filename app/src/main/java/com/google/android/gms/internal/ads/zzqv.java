package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzqv implements zzqs {
    private final int zza;
    private MediaCodecInfo[] zzb;

    public zzqv(boolean z10, boolean z11) {
        int i10 = 1;
        if (!z10 && !z11) {
            i10 = 0;
        }
        this.zza = i10;
    }

    private final void zzf() {
        if (this.zzb == null) {
            this.zzb = new MediaCodecList(this.zza).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final int zza() {
        zzf();
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final MediaCodecInfo zzb(int i10) {
        zzf();
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final boolean zzc(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final boolean zze() {
        return true;
    }
}
