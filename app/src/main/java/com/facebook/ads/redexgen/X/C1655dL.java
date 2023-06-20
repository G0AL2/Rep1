package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.dL  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1655dL extends AnonymousClass18 {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-123, -124, -111, -111, -120, -107};
    }

    public C1655dL(List<C1B> list) {
        super(list);
    }

    public static C1655dL A01(JSONObject jSONObject, C1400Xy c1400Xy) {
        C1655dL c1655dL = new C1655dL(AnonymousClass18.A02(jSONObject, c1400Xy, new C1656dM()));
        c1655dL.A0l(jSONObject);
        c1655dL.A0j(A03(0, 6, 27));
        return c1655dL;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass18
    public final int A0J() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass18
    public final int A0K() {
        return 0;
    }
}
