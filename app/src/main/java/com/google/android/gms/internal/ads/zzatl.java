package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@TargetApi(24)
/* loaded from: classes2.dex */
final class zzatl {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zza(zzatl zzatlVar, int i10, int i11) {
        zzatlVar.zzb.set(0, 0);
        zzatlVar.zza.setPattern(zzatlVar.zzb);
    }
}
