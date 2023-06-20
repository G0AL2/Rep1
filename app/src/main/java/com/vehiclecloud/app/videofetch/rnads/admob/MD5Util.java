package com.vehiclecloud.app.videofetch.rnads.admob;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public class MD5Util {
    private static final char[] hexCode = "0123456789ABCDEF".toCharArray();

    public static String md5(String str) throws NoSuchAlgorithmException {
        return printHexBinary(MessageDigest.getInstance("MD5").digest(str.getBytes()));
    }

    public static String printHexBinary(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            char[] cArr = hexCode;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}
