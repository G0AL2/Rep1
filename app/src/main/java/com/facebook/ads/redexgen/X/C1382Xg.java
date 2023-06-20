package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Xg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1382Xg implements R0 {
    public static byte[] A01;
    public final C1399Xx A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 127);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-2, -45, -20, -24, -45, -10, 21, 21, 18, -45, -8, 21, 27, 26, 15, 20, 13, -45, -6, 21, 17, 11, 20, 102, 100, 86, 99, 30, 82, 88, 86, 95, 101};
    }

    public C1382Xg(C1399Xx c1399Xx) {
        this.A00 = c1399Xx;
    }

    @Override // com.facebook.ads.redexgen.X.R0
    public final Map<String, String> A5W(boolean z10) {
        HashMap hashMap = new HashMap();
        if (!C07105s.A00().A04()) {
            hashMap.put(A00(0, 23, 39), C9U.A00().A01(this.A00, true).A7Y());
        }
        hashMap.put(A00(23, 10, 114), C9Y.A06(new AnonymousClass99(this.A00), this.A00, z10));
        return hashMap;
    }
}
