package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Sg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1256Sg implements P1 {
    public static byte[] A01;
    public final /* synthetic */ A2 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-49, -53, -64, -40};
    }

    public C1256Sg(A2 a22) {
        this.A00 = a22;
    }

    @Override // com.facebook.ads.redexgen.X.P1
    public final void ACj(String str, JSONObject jSONObject) {
        PA pa2;
        C1400Xy c1400Xy;
        C1400Xy c1400Xy2;
        if (str.equals(A00(0, 4, 72))) {
            this.A00.AF2();
            c1400Xy = this.A00.A07;
            if (JR.A1I(c1400Xy)) {
                c1400Xy2 = this.A00.A07;
                c1400Xy2.A09().AAT();
            }
        }
        pa2 = this.A00.A0F;
        pa2.A0h(str, jSONObject);
    }
}
