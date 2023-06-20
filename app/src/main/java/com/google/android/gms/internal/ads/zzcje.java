package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcje implements zzgqg {
    private final ByteBuffer zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcje(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.duplicate();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final int zza(ByteBuffer byteBuffer) throws IOException {
        if (this.zza.remaining() != 0 || byteBuffer.remaining() <= 0) {
            int min = Math.min(byteBuffer.remaining(), this.zza.remaining());
            byte[] bArr = new byte[min];
            this.zza.get(bArr);
            byteBuffer.put(bArr);
            return min;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final long zzb() throws IOException {
        return this.zza.position();
    }

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final long zzc() throws IOException {
        return this.zza.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final ByteBuffer zzd(long j10, long j11) throws IOException {
        int position = this.zza.position();
        this.zza.position((int) j10);
        ByteBuffer slice = this.zza.slice();
        slice.limit((int) j11);
        this.zza.position(position);
        return slice;
    }

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final void zze(long j10) throws IOException {
        this.zza.position((int) j10);
    }
}
