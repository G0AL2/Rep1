package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aN  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1477aN implements InterfaceC07386v {
    public static byte[] A01;
    public static String[] A02 = {"dNr6PPQsY9l", "RH2U4Hh24YJB1CaC1uFo9RGIyJZKKzLP", "dQYGehnAuPol14EFpizMkTDsN0LYSx6h", "7Q5ZVjGu0JJTpQG9POYIlRIj1jnsmDo", "fVmoe7EJsPLcTdm", "gOyCjpHNXOG3DgRDYrCD", "Bt7utfgyfoKMrlpwfOIMwYj8ykKc", "iv3XcVN43HhJpxh2FG4KyUlJf74g4nGs"};
    public final /* synthetic */ C1467aD A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {32, 31, 50, 50, 35, 48, 55, 29, 42, 45, 53};
        String[] strArr = A02;
        if (strArr[5].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A02[7] = "zsr7uVrJNcFH7kX5XxLPdtK6eEcZRxEm";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C1477aN(C1467aD c1467aD) {
        this.A00 = c1467aD;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        return this.A00.A0B(A00(0, 11, 124), false);
    }
}
