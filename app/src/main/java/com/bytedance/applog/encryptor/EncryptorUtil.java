package com.bytedance.applog.encryptor;

/* loaded from: classes.dex */
public class EncryptorUtil {
    static {
        try {
            System.loadLibrary("EncryptorP");
        } catch (UnsatisfiedLinkError e10) {
            e10.printStackTrace();
        }
    }

    public static byte[] encrypt(byte[] bArr, int i10) {
        if (bArr != null && i10 > 0) {
            try {
                if (bArr.length == i10) {
                    return ttEncrypt(bArr, i10);
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static native byte[] ttEncrypt(byte[] bArr, int i10);
}
