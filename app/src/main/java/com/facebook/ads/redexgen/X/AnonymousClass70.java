package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.70  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum AnonymousClass70 {
    A04(0),
    A05(100);
    
    public static byte[] A01;
    public static final Map<Integer, AnonymousClass70> A02;
    public int A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-98, -97, -96, -101, -81, -90, -82, -104, -103, -105, -104};
    }

    static {
        AnonymousClass70[] values;
        A02();
        A02 = new HashMap();
        for (AnonymousClass70 anonymousClass70 : values()) {
            A02.put(Integer.valueOf(anonymousClass70.A00), anonymousClass70);
        }
    }

    AnonymousClass70(int i10) {
        this.A00 = i10;
    }

    public static AnonymousClass70 A00(int i10) {
        AnonymousClass70 anonymousClass70 = A02.get(Integer.valueOf(i10));
        return anonymousClass70 == null ? A04 : anonymousClass70;
    }
}
