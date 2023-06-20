package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@TargetApi(21)
/* loaded from: classes2.dex */
final class zzawa implements zzavx {
    private final int zza;
    private MediaCodecInfo[] zzb;

    public zzawa(boolean z10) {
        this.zza = z10 ? 1 : 0;
    }

    private final void zze() {
        if (this.zzb == null) {
            this.zzb = new MediaCodecList(this.zza).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavx
    public final int zza() {
        zze();
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzavx
    public final MediaCodecInfo zzb(int i10) {
        zze();
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzavx
    public final boolean zzc(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @Override // com.google.android.gms.internal.ads.zzavx
    public final boolean zzd() {
        return true;
    }
}
