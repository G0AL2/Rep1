package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.aS  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1482aS implements AnonymousClass72<Integer> {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final int A02;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{114, 100, 91, 87, 77, 73};
    }

    public C1482aS(int i10, int i11, int i12) {
        this.A02 = i10;
        this.A00 = i11;
        this.A01 = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    /* renamed from: A01 */
    public final JSONObject AFB(Integer num, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A00(4, 2, 42), this.A02);
        jSONObject2.put(A00(0, 2, 27), this.A00);
        jSONObject2.put(A00(2, 2, 60), this.A01);
        jSONObject.put(num.toString(), jSONObject2);
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    public final boolean A8S(Object obj) {
        C1482aS c1482aS = (C1482aS) obj;
        return this.A01 == c1482aS.A01 && this.A00 == c1482aS.A00 && this.A02 == c1482aS.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    public final int AEp() {
        return A00(4, 2, 42).getBytes().length + A00(0, 2, 27).getBytes().length + A00(2, 2, 60).getBytes().length + 12;
    }
}
