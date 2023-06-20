package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Zd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1431Zd implements InterfaceC07386v {
    public final /* synthetic */ ZY A00;

    public C1431Zd(ZY zy) {
        this.A00 = zy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        return this.A00.A0C(new HashMap<String, Integer>() { // from class: com.facebook.ads.redexgen.X.6o
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                    copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 15);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{123, -13};
            }

            {
                put(A00(1, 1, 109), Integer.valueOf(C1431Zd.this.A00.A01.widthPixels));
                put(A00(0, 1, 4), Integer.valueOf(C1431Zd.this.A00.A01.heightPixels));
            }
        });
    }
}
