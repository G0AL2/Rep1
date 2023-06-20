package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class AL extends N6 {
    public static byte[] A01;
    public static String[] A02 = {"OtZHHid0c6Ryk9CDDBq47ngXcNldIUWH", "JwrlVwQ54E2WwwQvkywQUOYHwL6g1bho", "WFiM5IPZvaQ4xMZm5xgvQ3FNROoMY2Kr", "al6ZIECO6LO12zMiuvYELaWNpYKDhozx", "wYAPbQwhGVteNN6MGdL8gA6824n9AnKf", "jTihIhEYsz4XSFMEjn7OlZEBUOzI3KNS", "mXaQIkSzTCVxPQuz9HLogqhmhIjgMyMR", "pEgzTi4rZbqmTwficQat67UuNHBZNbaD"};
    public final /* synthetic */ TM A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 86);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {17, 4, -1, 0, 10, -28, 9, 15, 0, 13, 14, 15, 4, 15, -4, 7, -32, 17, 0, 9, 15};
        String[] strArr = A02;
        if (strArr[6].charAt(4) != strArr[3].charAt(4)) {
            throw new RuntimeException();
        }
        A02[2] = "e0kN46odqljBIthjpUkTXG9hdDsWHsKW";
        A01 = bArr;
    }

    static {
        A01();
    }

    public AL(TM tm) {
        this.A00 = tm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC07859c
    /* renamed from: A02 */
    public final void A03(AnonymousClass88 anonymousClass88) {
        InterfaceC1110Mq interfaceC1110Mq;
        interfaceC1110Mq = this.A00.A05;
        interfaceC1110Mq.A3t(A00(0, 21, 69), anonymousClass88);
    }
}
