package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaia implements zzaib {
    private final ByteBuffer zza;

    public zzaia(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.zzaib
    public final long zza() {
        return this.zza.capacity();
    }

    @Override // com.google.android.gms.internal.ads.zzaib
    public final void zzb(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        ByteBuffer slice;
        synchronized (this.zza) {
            int i11 = (int) j10;
            this.zza.position(i11);
            this.zza.limit(i11 + i10);
            slice = this.zza.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
