package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzajv extends FilterInputStream {
    private final long zza;
    private long zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzajv(InputStream inputStream, long j10) {
        super(inputStream);
        this.zza = j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.zzb++;
        }
        return read;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zza() {
        return this.zza - this.zzb;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = super.read(bArr, i10, i11);
        if (read != -1) {
            this.zzb += read;
        }
        return read;
    }
}
