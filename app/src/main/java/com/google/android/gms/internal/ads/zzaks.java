package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaks extends zzgqb {
    ByteBuffer zza;

    public zzaks(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzgqb
    public final void zzf(ByteBuffer byteBuffer) {
        this.zza = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
