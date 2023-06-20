package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6t  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC07366t {
    A03,
    A04;
    
    public static byte[] A00;
    public static String[] A01 = {"k9YgwMNoBobey2P3", "e6gY2KwdCyhxzyJg", "XekGxBcgkm9Piqw4gBfizkkV5P8", "1GcTjvefwXiEODDnEjfMRtb0cPUGlX75", "ZdzTHxr5JGj0Sa8aqJDa45W8xDvcUiPL", "P27kcHiKxsYV8bH7Xsbi006fslBpGCcl", "HgqSjgTeAT7xF2FFP9WgcaMTZUlmKzh3", "gTwzg4IRAV6UOuzo00Z4w5gIHW3"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 121);
            String[] strArr = A01;
            if (strArr[5].charAt(29) == strArr[6].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "FPFgBqqJeEkyPdeC";
            strArr2[0] = "lf6fPO1AOsDcBdk1";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{65, 70, 76, 61, 63, 61, 74, 22, 23, 21, 12, 17, 10};
    }

    static {
        A01();
    }
}
