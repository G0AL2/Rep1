package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzqe extends zzfz {
    public final zzqf zza;
    public final String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzqe(Throwable th, zzqf zzqfVar) {
        super("Decoder failed: ".concat(String.valueOf(zzqfVar == null ? null : zzqfVar.zza)), th);
        String str = null;
        this.zza = zzqfVar;
        if (zzeg.zza >= 21 && (th instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zzb = str;
    }
}
