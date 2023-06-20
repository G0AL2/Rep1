package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBLogging;
import com.inmobi.media.fq;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class l0 {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        Locale locale = Locale.US;
        return String.format(locale, "%0" + (bArr.length << 1) + "x", bigInteger);
    }

    public static synchronized byte[] b(byte[] bArr) {
        synchronized (l0.class) {
            if (bArr != null) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(bArr);
                    return messageDigest.digest();
                } catch (NoSuchAlgorithmException e10) {
                    CBLogging.b("CBCrypto", "sha1: " + e10.toString());
                    return null;
                } catch (Exception e11) {
                    CBLogging.b("CBCrypto", "sha1: " + e11.toString());
                    return null;
                }
            }
            return null;
        }
    }

    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : digest) {
                sb2.append(Integer.toString((b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) + 256, 16).substring(1));
            }
            return sb2.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
