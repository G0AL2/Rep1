package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Pe  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1176Pe {
    A03,
    A04;
    
    public static byte[] A00;
    public static String[] A01 = {"p5IIOLlp1B1ZcinDN0X6ynPo7iUU6KYH", "pR9Fkr1wWPG0d9ySETcIXHMYi8wcMlk0", "E7RgkNcVOxUPlMLAnYmg2qDI6nJpawyt", "j32M5Jmc2ihmMgTvSB0S3AGv8SFv23ML", "DP3a2sR6Ao5znMBkyRuDzqvSCPyaW43t", "aJygC0wABx4", "92sHBdTkJGpDSWYr6Ma8vgCUoSk9iZG6", "rW1xsMZdRBLA1hSdWjmrmwJE36RmnU9E"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[3].charAt(15) != 'v') {
                throw new RuntimeException();
            }
            A01[3] = "UISLjJpxihM79aLvihwYrwdsqCfo0Nro";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 25);
            i13++;
        }
    }

    public static void A01() {
        A00 = new byte[]{-66, -49, -49, -52, -44, -36, -55, -62, -61, -47, -86, -69, -69, -72, -64, -56, -69, -78, -80, -79, -67};
    }

    static {
        A01();
    }
}
