package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.dJ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1653dJ extends AnonymousClass18 implements Serializable {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772011L;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{72, 79, 85, 68, 83, 82, 85, 72, 85, 72, 64, 77};
    }

    public C1653dJ(List<C1B> list) {
        super(list);
    }

    public static C1653dJ A01(JSONObject jSONObject, C1400Xy c1400Xy) {
        C1653dJ c1653dJ = new C1653dJ(AnonymousClass18.A02(jSONObject, c1400Xy, new C1654dK()));
        c1653dJ.A0l(jSONObject);
        c1653dJ.A0j(A03(0, 12, 67));
        return c1653dJ;
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
