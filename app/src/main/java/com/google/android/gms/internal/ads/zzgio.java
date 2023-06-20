package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgio implements zzfwf {
    private final zzfza zza;

    public zzgio(byte[] bArr) throws GeneralSecurityException {
        this.zza = new zzfza(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.zza.zzc(ByteBuffer.wrap(bArr, 24, length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] zza = zzgik.zza(24);
        allocate.put(zza);
        this.zza.zzb(allocate, zza, bArr, bArr2);
        return allocate.array();
    }
}
