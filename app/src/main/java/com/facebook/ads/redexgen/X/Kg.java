package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: assets/audience_network.dex */
public final class Kg {
    public static Map<String, Long> A00;
    public static Map<String, Long> A01;
    public static Map<String, String> A02;
    @SuppressLint({"NotWrittenPrivateField"})
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05 = {"WcKxqk7L6BbuUQ1o7qmtmX6WSmYBceUW", "BgR1wHMut0LLHWxcn1vNnqjOmnDpA7yk", "nofrFHfyJT7pmG0QketyEOeNZ4PDBNqx", "tJ6rTzDc1vJYhzSuFM6hiX1fKi0tAXSV", "zeDIr51bIn8XcOdXOM6dVjfvh9EOKJZZ", "x4ZdmXYSSnH60B6WOaypztUTceO04NF4", "XXJyOaEVU", "eLFDRkAKNxNhqN4Dib4JBju5Hz9f2MYZ"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{-35, 43, -14, -35, 43, -14, -35, 28, -14, -35, 28, -14, -35, 28, 9, 39, 29, 34, 27, -44, 32, 21, 39, 40, -44, 21, 24, -44, 38, 25, 39, 36, 35, 34, 39, 25, -5, -52, -48, -8, -53, -52, -5, 5, 3, 18, -22, -1, 17, 18, -16, 3, 17, 14, 13, 12, 17, 3};
    }

    static {
        A04();
        A01 = new ConcurrentHashMap();
        A00 = new ConcurrentHashMap();
        A02 = new ConcurrentHashMap();
        A03 = false;
    }

    public static long A00(String str, KM km) {
        if (A01.containsKey(str)) {
            return A01.get(str).longValue();
        }
        int i10 = C1052Kf.A00[km.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return 15000L;
        }
        if (A05[3].charAt(17) != 'M') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[0] = "cMCvtLXy3JUCQlBDXi74HNVnq0if4CLO";
        strArr[1] = "Rwzrrq0i3HxLUmTnjjMGp9p8g57hQdnu";
        if (i10 != 4) {
            return -1000L;
        }
        return 15000L;
    }

    public static String A02(C1053Kh c1053Kh) {
        KV.A05(A01(43, 15, 94), A01(14, 22, 116), A01(36, 7, 87));
        return A02.get(A03(c1053Kh));
    }

    public static String A03(C1053Kh c1053Kh) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        objArr[0] = c1053Kh.A07();
        objArr[1] = c1053Kh.A05();
        objArr[2] = Integer.valueOf(c1053Kh.A06() == null ? 0 : c1053Kh.A06().A00());
        objArr[3] = Integer.valueOf(c1053Kh.A06() != null ? c1053Kh.A06().A01() : 0);
        objArr[4] = Integer.valueOf(c1053Kh.A04());
        return String.format(locale, A01(0, 14, 120), objArr);
    }

    public static void A05(long j10, C1053Kh c1053Kh) {
        A01.put(A03(c1053Kh), Long.valueOf(j10));
    }

    public static void A06(C1053Kh c1053Kh) {
        A00.put(A03(c1053Kh), Long.valueOf(System.currentTimeMillis()));
    }

    public static void A07(String str, C1053Kh c1053Kh) {
        A02.put(A03(c1053Kh), str);
    }

    public static boolean A08(C1053Kh c1053Kh) {
        if (A03) {
            return false;
        }
        String A032 = A03(c1053Kh);
        if (A00.containsKey(A032)) {
            Long l10 = A00.get(A032);
            if (A05[3].charAt(17) != 'M') {
                throw new RuntimeException();
            }
            A05[6] = "HNdF4hlEpt9Mz";
            return System.currentTimeMillis() - l10.longValue() < A00(A032, c1053Kh.A05());
        }
        return false;
    }
}
