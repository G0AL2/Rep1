package com.facebook.ads.redexgen.X;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class Z9 implements InterfaceC07386v {
    public static byte[] A01;
    public final /* synthetic */ C1423Yv A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 84);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{123, -71, -72, -86, -111, -100};
    }

    public Z9(C1423Yv c1423Yv) {
        this.A00 = c1423Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        strArr = this.A00.A06;
        if (strArr != null) {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            while (true) {
                strArr2 = this.A00.A06;
                int i11 = strArr2.length;
                if (i10 < i11) {
                    strArr3 = this.A00.A06;
                    sb2.append(strArr3[i10]);
                    strArr4 = this.A00.A06;
                    int i12 = strArr4.length;
                    if (i10 != i12 - 1) {
                        sb2.append(A00(0, 1, 29));
                    }
                    i10++;
                } else {
                    C7A signalValueTypeDef = this.A00.A08(C7J.A08(sb2.toString().getBytes(A00(1, 5, 16)), C7I.A06));
                    return signalValueTypeDef;
                }
            }
        } else {
            return this.A00.A07(AnonymousClass76.A07);
        }
    }
}
