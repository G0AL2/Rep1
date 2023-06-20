package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6r  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC07346r {
    A03,
    A04,
    A05;
    
    public static byte[] A00;
    public static String[] A01 = {"E1ApzwVLRR4CngvpZefiRUryjBkpKTiq", "scgg", "yFPxOXyOw8D4Vn8yHxxP7hzHiUiy62qE", "zHv8FBXr9PQWuExvP5DWalTnfdKq2QcW", "f0mnZvHDMX6mp27yXSbkqAkDv8RwcHMP", "A3zMzGJFsDn7OOWVTfqUeQ5YoKMkxeai", "b0IJ32ceFZmK4I0w9QL4t2F3fPxSCHwz", "hN481n1w8mbA7LjoU4cE4SVESd3upNHM"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 13);
            if (A01[4].charAt(3) != 'n') {
                throw new RuntimeException();
            }
            A01[1] = "eAiU";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{85, 94, 93, 80, 83, 94, 89, 79, 73, 95, 88, 79, 125, 119, 125, 122, 107, 99};
        String[] strArr = A01;
        if (strArr[3].charAt(24) != strArr[6].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "gdySAFHvXHugDigOqluy5UsJCpylu2Xg";
        strArr2[2] = "eApQbCO9YI7UjFvYesQMhrhRMhaxXyrN";
    }

    static {
        A01();
    }
}
