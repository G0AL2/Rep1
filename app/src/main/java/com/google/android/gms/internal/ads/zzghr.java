package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzghr implements zzfwf {
    private final zzgie zza;
    private final zzfwx zzb;
    private final int zzc;

    public zzghr(zzgie zzgieVar, zzfwx zzfwxVar, int i10) {
        this.zza = zzgieVar;
        this.zzb = zzfwxVar;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.zzc;
        if (length >= i10) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i10);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length - this.zzc, length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.zzb.zza(copyOfRange2, zzghh.zzc(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
            return this.zza.zza(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzb = this.zza.zzb(bArr);
        return zzghh.zzc(zzb, this.zzb.zzb(zzghh.zzc(bArr2, zzb, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
