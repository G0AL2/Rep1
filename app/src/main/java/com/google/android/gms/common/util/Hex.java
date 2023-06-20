package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.inmobi.media.fq;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class Hex {
    private static final char[] zza = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] zzb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @KeepForSdk
    public static String bytesToStringLowercase(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
            int i12 = i10 + 1;
            char[] cArr2 = zzb;
            cArr[i10] = cArr2[i11 >>> 4];
            i10 = i12 + 1;
            cArr[i12] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    @KeepForSdk
    public static String bytesToStringUppercase(byte[] bArr) {
        return bytesToStringUppercase(bArr, false);
    }

    @KeepForSdk
    public static byte[] stringToBytes(String str) throws IllegalArgumentException {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[length / 2];
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 2;
                bArr[i10 / 2] = (byte) Integer.parseInt(str.substring(i10, i11), 16);
                i10 = i11;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Hex string has odd number of characters");
    }

    @KeepForSdk
    public static String bytesToStringUppercase(byte[] bArr, boolean z10) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i10 = 0; i10 < length && (!z10 || i10 != length - 1 || (bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) != 0); i10++) {
            char[] cArr = zza;
            sb2.append(cArr[(bArr[i10] & 240) >>> 4]);
            sb2.append(cArr[bArr[i10] & 15]);
        }
        return sb2.toString();
    }
}
