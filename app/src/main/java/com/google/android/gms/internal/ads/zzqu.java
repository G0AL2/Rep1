package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzqu implements zzqs {
    private zzqu() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzqu(zzqt zzqtVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final MediaCodecInfo zzb(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final boolean zzc(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final boolean zze() {
        return false;
    }
}
