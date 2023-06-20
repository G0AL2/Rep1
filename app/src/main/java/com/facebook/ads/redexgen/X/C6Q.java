package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6Q  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum C6Q {
    A03;
    
    public static byte[] A00;
    public static String[] A01 = {"dHmVS3H0BU3wKh61b1vafqfwBkkFzpTO", "wWoQGnRDm0PwXBgVQ4qITNDkBZzwoYVj", "2GfgdM1mYWTRpqof1U8ngJSUNb", "cI7FK6eaPGszRzvhlWq5SquyH1qR7BiB", "9EGarfWen", "DeDz6M2EkKturwySGch2142fcPf5gCwe", "8zTDz8DDtndYFcWIeFeWxJwrqgWlV5a6", "wowMLPXoqmqv7BaAvDUMKLpfZAdLjyqX"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] ^ i12) ^ 112;
            String[] strArr = A01;
            if (strArr[5].charAt(23) != strArr[7].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[2] = "TmWatSzP310RJQCSGktkHwyFxI";
            strArr2[4] = "1Mq3TnxtQ";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {122, 97, 123, 109, 102, 113, 107, 120, 107, 96, 122};
        String[] strArr = A01;
        if (strArr[1].charAt(11) == strArr[3].charAt(11)) {
            throw new RuntimeException();
        }
        A01[0] = "8W4A78DjBH0uG37RO8SO06IKWezFcTvo";
        A00 = bArr;
    }

    static {
        A01();
    }
}
