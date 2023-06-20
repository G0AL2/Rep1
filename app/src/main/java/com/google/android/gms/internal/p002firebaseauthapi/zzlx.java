package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlx  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzlx {
    public static final void zza(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        if (i10 < 0 || byteBuffer2.remaining() < i10 || byteBuffer3.remaining() < i10 || byteBuffer.remaining() < i10) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final boolean zzb(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null && bArr.length == bArr2.length) {
            int i10 = 0;
            for (int i11 = 0; i11 < bArr.length; i11++) {
                i10 |= bArr[i11] ^ bArr2[i11];
            }
            if (i10 == 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] zzc(byte[]... bArr) throws GeneralSecurityException {
        int i10 = 0;
        for (byte[] bArr2 : bArr) {
            int length = bArr2.length;
            if (i10 > Api.BaseClientBuilder.API_PRIORITY_OTHER - length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i10 += length;
        }
        byte[] bArr3 = new byte[i10];
        int i11 = 0;
        for (byte[] bArr4 : bArr) {
            int length2 = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i11, length2);
            i11 += length2;
        }
        return bArr3;
    }

    public static final byte[] zzd(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return zze(bArr, 0, bArr2, 0, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] zze(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        if (bArr.length - i12 >= i10 && bArr2.length - i12 >= i11) {
            byte[] bArr3 = new byte[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                bArr3[i13] = (byte) (bArr[i13 + i10] ^ bArr2[i13 + i11]);
            }
            return bArr3;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }
}
