package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1383Xh implements LE {
    public static byte[] A01;
    public final /* synthetic */ C1399Xx A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{68, 64, 67, 119, 102, 107, 103, 108, 97, 103, 76, 103, 118, 117, 109, 112, 105, 15, 52, 63, 34, 42, 63, 57, 46, 63, 62, 122, 63, 40, 40, 53, 40, 116, 121, 104, 123, 105, 114, 69, 105, 114, 115, Byte.MAX_VALUE, 118, 126};
    }

    public C1383Xh(C1399Xx c1399Xx) {
        this.A00 = c1399Xx;
    }

    @Override // com.facebook.ads.redexgen.X.LE
    public final void A8p(int i10, Throwable th) {
        Log.e(A00(0, 17, 13), A00(17, 17, 85), th);
        this.A00.A06().A8y(A00(34, 12, 21), i10, new AnonymousClass90(th));
    }
}
