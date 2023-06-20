package com.facebook.imageformat;

import java.io.UnsupportedEncodingException;
import y3.k;

/* compiled from: ImageFormatCheckerUtils.java */
/* loaded from: classes.dex */
public class e {
    public static byte[] a(String str) {
        k.g(str);
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("ASCII not found!", e10);
        }
    }

    public static boolean b(byte[] bArr, byte[] bArr2, int i10) {
        k.g(bArr);
        k.g(bArr2);
        if (bArr2.length + i10 > bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i10 + i11] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        return b(bArr, bArr2, 0);
    }
}
