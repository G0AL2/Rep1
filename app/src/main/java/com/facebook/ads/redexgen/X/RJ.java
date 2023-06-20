package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: assets/audience_network.dex */
public final class RJ {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{4, 30, 0, 30, 3, 60, 39, 46, 66, 94, 11, 48, 63, 60, 50, 59, 126, 42, 49, 126, 56, 55, 48, 58, 126, 40, 63, 50, 55, 58, 126, 61, 59, 44, 42, 55, 56, 55, 61, 63, 42, 59, 126, 49, 44, 126, 46, 43, 60, 50, 55, 61, 126, 53, 59, 39, 112};
    }

    public static String A01(byte[] bArr, String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.reset();
        return Base64.encodeToString(messageDigest.digest(bArr), 0);
    }

    public static void A03(HttpsURLConnection httpsURLConnection, Set<String> set, Set<String> set2) throws Exception {
        Certificate[] serverCertificates;
        String certSha1 = A00(5, 5, 110);
        if (Build.VERSION.SDK_INT == 15) {
            if (A00(0, 5, 49).equals(Build.VERSION.RELEASE)) {
                return;
            }
        }
        try {
            for (Certificate cert : httpsURLConnection.getServerCertificates()) {
                X509Certificate x509Certificate = (X509Certificate) cert;
                String A01 = A01(x509Certificate.getEncoded(), certSha1);
                if (set == null || !set.contains(A01)) {
                    String A012 = A01(x509Certificate.getPublicKey().getEncoded(), certSha1);
                    if (set2 != null && set2.contains(A012)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            throw new CertificateException(A00(10, 47, 95));
        } catch (Exception e10) {
            throw e10;
        }
    }
}
