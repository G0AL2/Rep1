package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bA  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1526bA implements C6M {
    public static byte[] A01;
    public static final String A02;
    public final C1399Xx A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 48);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{73, 116, 111, 105, 124, 120, 101, 99, 98, 44, 110, 121, 101, 96, 104, 101, 98, 107, 44, 74, 77, 66, 44, 96, 99, 107, 107, 101, 98, 107, 44, 70, 95, 67, 66, 69, 87, 77, 64, 71, 65, 122, 65, 68, 81, 68, 122, 73, 74, 66, 66, 76, 75, 66, 72, 67, 78, 121, 110, 65, 71, 32, 54, 39, 9, 16, 30};
    }

    static {
        A01();
        A02 = C1526bA.class.getSimpleName();
    }

    public C1526bA(C1399Xx c1399Xx) {
        this.A00 = c1399Xx;
    }

    @Override // com.facebook.ads.redexgen.X.C6M
    public final void A9K(String str, String str2, int i10, int i11, int i12, JSONObject jSONObject, AnonymousClass70 anonymousClass70) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(A00(35, 4, 20), str);
            jSONObject2.put(A00(54, 3, 26), str2);
            jSONObject2.put(A00(57, 2, 42), i10);
            jSONObject2.put(A00(59, 2, 3), i11);
            jSONObject2.put(A00(61, 3, 99), i12);
            jSONObject2.put(A00(64, 3, 74), C7H.A01(jSONObject.toString(), str2));
            AnonymousClass90 anonymousClass90 = new AnonymousClass90(jSONObject2.toString());
            anonymousClass90.A03(1);
            this.A00.A06().A8z(A00(39, 15, 21), IronSourceConstants.BN_RELOAD_FAILED, anonymousClass90);
        } catch (JSONException e10) {
            Log.e(A02, A00(0, 35, 60), e10);
        }
    }
}
