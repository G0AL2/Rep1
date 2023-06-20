package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzghi implements zzfwf {
    private final zzfyx zza;

    public zzghi(byte[] bArr) throws GeneralSecurityException {
        this.zza = new zzfyx(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 28) {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            return this.zza.zzc(ByteBuffer.wrap(bArr, 12, length - 12), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] zza = zzgik.zza(12);
        allocate.put(zza);
        this.zza.zzb(allocate, zza, bArr, bArr2);
        return allocate.array();
    }
}
