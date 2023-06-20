package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bE  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1530bE extends L8 {
    public static byte[] A03;
    public final /* synthetic */ C6D A00;
    public final /* synthetic */ C1399Xx A01;
    public final /* synthetic */ String A02;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 80);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{53, 55, 60, 55, 32, 59, 49};
    }

    public C1530bE(C6D c6d, String str, C1399Xx c1399Xx) {
        this.A00 = c6d;
        this.A02 = str;
        this.A01 = c1399Xx;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        try {
            this.A00.A06(this.A02);
        } catch (Throwable th) {
            this.A01.A06().A8y(A00(0, 7, 2), C07828z.A1F, new AnonymousClass90(th));
        }
    }
}
