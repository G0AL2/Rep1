package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfyz extends zzfyw {
    public zzfyz(byte[] bArr, int i10) throws InvalidKeyException {
        super(bArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzfyw
    final int zza() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.zzfyw
    final int[] zzb(int[] iArr, int i10) {
        int length = iArr.length;
        if (length == 6) {
            int[] iArr2 = new int[16];
            zzfys.zzb(r0, this.zza);
            int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
            zzfys.zzc(iArr3);
            zzfys.zzb(iArr2, Arrays.copyOf(iArr3, 8));
            iArr2[12] = i10;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
