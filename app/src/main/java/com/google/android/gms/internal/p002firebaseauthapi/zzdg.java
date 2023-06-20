package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdg  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzdg extends zzdd {
    public zzdg(byte[] bArr, int i10) throws InvalidKeyException {
        super(bArr, i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzdd
    final int zza() {
        return 24;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzdd
    final int[] zzb(int[] iArr, int i10) {
        int length = iArr.length;
        if (length == 6) {
            int[] iArr2 = new int[16];
            zzcz.zzb(r0, this.zza);
            int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
            zzcz.zzc(iArr3);
            zzcz.zzb(iArr2, Arrays.copyOf(iArr3, 8));
            iArr2[12] = i10;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
