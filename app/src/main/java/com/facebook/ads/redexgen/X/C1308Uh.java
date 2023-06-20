package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Uh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1308Uh implements RT {
    public static byte[] A02;
    public final /* synthetic */ C1399Xx A00;
    public final /* synthetic */ RR A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-120, -121, -125, -106, -105, -108, -121, -127, -123, -111, -112, -120, -117, -119};
    }

    public C1308Uh(RR rr, C1399Xx c1399Xx) {
        this.A01 = rr;
        this.A00 = c1399Xx;
    }

    @Override // com.facebook.ads.redexgen.X.RT
    public final void A3u() {
        try {
            JR.A0O(this.A00).A2F(this.A01.A6J().optJSONObject(A00(0, 14, 2)));
        } catch (JSONException e10) {
            this.A00.A06().A3R(e10);
        }
    }
}
