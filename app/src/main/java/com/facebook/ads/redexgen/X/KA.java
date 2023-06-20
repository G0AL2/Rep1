package com.facebook.ads.redexgen.X;

import com.facebook.ads.VideoAutoplayBehavior;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum KA {
    A03,
    A05,
    A04;
    
    public static byte[] A00;
    public static String[] A01 = {"Gjwy6cOcQ9K2s9TECvKSb1UBI6p92tWs", "MkJKTqDYMAzsSL3ogCclj8aQMOEn3Zaf", "eTpSOjZOB", "ux", "6lFNHDDwy35cZQ5ctUwn46ZPa5FkYtAF", "2ZxEJa2ax0wS4G", "Utm", "f4eG1TG9uZ10lRPR3hza"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-57, -56, -55, -60, -40, -49, -41, -11, -20, -20, 22, 21};
    }

    static {
        A02();
    }

    public static VideoAutoplayBehavior A00(KA ka2) {
        if (ka2 == null) {
            return VideoAutoplayBehavior.DEFAULT;
        }
        int i10 = K9.A00[ka2.ordinal()];
        if (i10 != 1) {
            if (A01[1].charAt(9) != 'M') {
                A01[5] = "KWBYg9gUO";
                if (i10 != 2) {
                    if (i10 != 3) {
                        VideoAutoplayBehavior videoAutoplayBehavior = VideoAutoplayBehavior.DEFAULT;
                        String[] strArr = A01;
                        if (strArr[0].charAt(5) == strArr[4].charAt(5)) {
                            A01[2] = "D4DDJWMfk";
                            return videoAutoplayBehavior;
                        }
                        String[] strArr2 = A01;
                        strArr2[0] = "jNXTJSXFaHaCK7i5lqJo4GmnkgAhCocQ";
                        strArr2[4] = "apiAoBnIaWOp8nG5E1dZaMbzfZqR1u59";
                        return videoAutoplayBehavior;
                    }
                    return VideoAutoplayBehavior.OFF;
                }
                return VideoAutoplayBehavior.ON;
            }
            throw new RuntimeException();
        }
        return VideoAutoplayBehavior.DEFAULT;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static KA[] valuesCustom() {
        KA[] valuesCustom = values();
        if (A01[1].charAt(9) != 'M') {
            String[] strArr = A01;
            strArr[6] = "qrA";
            strArr[3] = "mB";
            return (KA[]) valuesCustom.clone();
        }
        throw new RuntimeException();
    }
}
