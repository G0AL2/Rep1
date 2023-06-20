package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzavz implements zzavx {
    private zzavz() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzavz(zzavy zzavyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzavx
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.zzavx
    public final MediaCodecInfo zzb(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzavx
    public final boolean zzc(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    @Override // com.google.android.gms.internal.ads.zzavx
    public final boolean zzd() {
        return false;
    }
}
