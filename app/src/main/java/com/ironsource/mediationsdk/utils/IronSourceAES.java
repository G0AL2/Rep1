package com.ironsource.mediationsdk.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public class IronSourceAES {
    private static SecretKeySpec a(String str) {
        byte[] bArr = new byte[32];
        Arrays.fill(bArr, (byte) 0);
        byte[] bytes = str.getBytes("UTF-8");
        System.arraycopy(bytes, 0, bArr, 0, bytes.length < 32 ? bytes.length : 32);
        return new SecretKeySpec(bArr, "AES");
    }

    public static synchronized String compressAndEncrypt(String str) {
        String compressAndEncrypt;
        synchronized (IronSourceAES.class) {
            compressAndEncrypt = compressAndEncrypt(g.a().b(), str);
        }
        return compressAndEncrypt;
    }

    public static synchronized String compressAndEncrypt(String str, String str2) {
        synchronized (IronSourceAES.class) {
            if (TextUtils.isEmpty(str2)) {
                return "";
            }
            try {
                byte[] b10 = a.AnonymousClass1.b(str2);
                if (b10 != null) {
                    return encodeFromBytes(str, b10);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return "";
        }
    }

    public static synchronized String decode(String str, String str2) {
        synchronized (IronSourceAES.class) {
            byte[] decodeToBytes = decodeToBytes(str, str2);
            if (decodeToBytes != null) {
                return new String(decodeToBytes);
            }
            return "";
        }
    }

    public static synchronized byte[] decodeToBytes(String str, String str2) {
        synchronized (IronSourceAES.class) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            try {
                SecretKeySpec a10 = a(str);
                byte[] bArr = new byte[16];
                Arrays.fill(bArr, (byte) 0);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                byte[] decode = Base64.decode(str2, 0);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(2, a10, ivParameterSpec);
                return cipher.doFinal(decode);
            } catch (Exception e10) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception on decryption error: " + e10.getMessage());
                e10.printStackTrace();
                return null;
            }
        }
    }

    public static synchronized String decryptAndDecompress(String str) {
        String decryptAndDecompress;
        synchronized (IronSourceAES.class) {
            decryptAndDecompress = decryptAndDecompress(g.a().b(), str);
        }
        return decryptAndDecompress;
    }

    public static synchronized String decryptAndDecompress(String str, String str2) {
        synchronized (IronSourceAES.class) {
            if (TextUtils.isEmpty(str2)) {
                return "";
            }
            try {
                byte[] decodeToBytes = decodeToBytes(str, str2);
                if (decodeToBytes != null) {
                    return a.AnonymousClass1.a(decodeToBytes);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return "";
        }
    }

    public static synchronized String encode(String str, String str2) {
        synchronized (IronSourceAES.class) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (TextUtils.isEmpty(str2)) {
                return "";
            }
            try {
                return encodeFromBytes(str, str2.getBytes("UTF8"));
            } catch (Exception e10) {
                e10.printStackTrace();
                return "";
            }
        }
    }

    public static synchronized String encodeFromBytes(String str, byte[] bArr) {
        synchronized (IronSourceAES.class) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (bArr == null) {
                return "";
            }
            try {
                SecretKeySpec a10 = a(str);
                byte[] bArr2 = new byte[16];
                Arrays.fill(bArr2, (byte) 0);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(1, a10, ivParameterSpec);
                return Base64.encodeToString(cipher.doFinal(bArr), 0).replaceAll(System.getProperty("line.separator"), "");
            } catch (Exception e10) {
                e10.printStackTrace();
                return "";
            }
        }
    }

    public static synchronized String encrypt(String str) {
        String encode;
        synchronized (IronSourceAES.class) {
            encode = encode(g.a().b(), str);
        }
        return encode;
    }
}
