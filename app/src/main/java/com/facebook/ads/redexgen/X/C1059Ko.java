package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Ko  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1059Ko {
    public static byte[] A00;
    public static String[] A01 = {"DRlsPwjpEwtNoZv5ySnxf", "lqEqsXUgP0JMZJfgrKxewN2wIWHzYKcc", "dBjDOWAGvP7mSKAaP52zl", "ype", "mP5mKraLiX8XnVkHST8LkS5AYOMnukgh", "WxiRHArz5NNbCsZRJT7jzOWIY3Iz", "jBZrwNF22PwjCa8Ii6ulb8rFZ5hC5AS6", "qRbUwr6kgq5VO8gbp3xyKAMHfEJZ"};
    public static final AtomicReference<String> A02;
    public static final AtomicReference<String> A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{118, 98, 123, 116, 126, 116, 120, 126, 116, 121, 125, 116, 116, 122, 116, 125, 124, 98, 47, 56, 42, 62, 72, 6, 3, 9, 16, 56, 11, 8, 0, 0, 14, 9, 0, 72, 12, 66, 71, 77, 84, 124, 80, 90, 77, 64, 17, 111, 46, 37, 52, 55, 47, 50, 43, 31, 33, 36, 51, 31, 35, 47, 45, 45, 47, 46, 88, 68, 68, 64, 67, 10, 31, 31, 87, 66, 81, 64, 88, 21, 67, 30, 86, 81, 83, 85, 82, 95, 95, 91, 30, 83, 95, 93, 4, 24, 24, 28, 31, 86, 67, 67, 27, 27, 27, 73, 31, 66, 10, 13, 15, 9, 14, 3, 3, 7, 66, 15, 3, 1, 83, 83, 83};
    }

    static {
        A09();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>();
    }

    public static String A01(C8U c8u) {
        return A05(c8u) + A00(47, 19, 24);
    }

    public static String A02(C8U c8u) {
        String A0Q = JR.A0Q(c8u);
        return A07(c8u, A0Q) + A00(22, 14, 63);
    }

    public static String A03(C8U c8u) {
        return A05(c8u) + A00(1, 21, 21);
    }

    public static String A04(C8U c8u) {
        String A0R = JR.A0R(c8u);
        return A07(c8u, A0R) + A00(36, 11, 123);
    }

    public static String A05(C8U c8u) {
        String str = A02.get();
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return A06(c8u, A00(66, 28, 104));
    }

    public static String A06(C8U c8u, String str) {
        String str2;
        String prefix = c8u.A03().A7l();
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        if (TextUtils.isEmpty(prefix)) {
            str2 = A00(0, 0, 29);
        } else {
            str2 = A00(0, 1, 0) + prefix;
        }
        objArr[0] = str2;
        if (A01[4].charAt(27) != 'a') {
            A01[1] = "Rtsd39h1DjNUt9rd7OM3RjcgvmtBKqBR";
            return String.format(locale, str, objArr);
        }
        throw new RuntimeException();
    }

    public static String A07(C8U c8u, String str) {
        String str2 = A03.get();
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return A08(A06(c8u, A00(94, 26, 52)), str);
    }

    public static String A08(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str.replace(A00(120, 3, 124), str2);
    }
}
