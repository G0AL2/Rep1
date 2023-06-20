package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.dF  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1649dF extends AnonymousClass18 implements Serializable {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 2751287062553772011L;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{123, 108, 126, 104, 123, 109, 108, 109, 86, Byte.MAX_VALUE, 96, 109, 108, 102};
    }

    public C1649dF(List<C1B> list) {
        super(list);
    }

    public static C1649dF A01(JSONObject jSONObject, C1400Xy c1400Xy) {
        C1649dF c1649dF = new C1649dF(AnonymousClass18.A02(jSONObject, c1400Xy, new C1650dG()));
        c1649dF.A0l(jSONObject);
        c1649dF.A0j(A03(0, 14, 8));
        return c1649dF;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass18
    public final int A0J() {
        if (A0O().A0D().A06() != null) {
            return 1;
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass18
    public final int A0K() {
        return A0O().A0D().A04();
    }
}
