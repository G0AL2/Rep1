package com.facebook.ads.redexgen.X;

import androidx.annotation.VisibleForTesting;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Xb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1377Xb implements C0S {
    public static byte[] A01;
    public static String[] A02 = {"EcOoOPxvgIM5VM8gU5MNIX90mja3CaI7", "nhJ", "HCYDUCxXnFbS3htlRPDiG7BoiyzyMxIV", "Fv3YAwH75PiBj9X6AN971g", "yIx", "", "9xkhFmOksAfwag3lVFNPfz", "xjMRz"};
    public final C8U A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 90);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        String[] strArr = A02;
        if (strArr[1].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "mKsg4hxQhHaV0fiKABuoeRg1A6SJU8YP";
        strArr2[2] = "TgUrCFxQKf96ICwhyLjRHk1rYV6JKdAm";
        A01 = new byte[]{-91, -111, -94, -120, -18, 29, 22, 22, 13, 20, -12, 35, 28, 28, 19, 26, -24, -50, -3, 12, 34, -16, 33, 16, 25, 31, 10, -37, -22, -29, -29, -38, -31, 57, 72, 65, 65, 56, 63, 50, 63, 66, 58, 58, 56, 55};
    }

    static {
        A01();
    }

    public C1377Xb(C8U c8u) {
        this.A00 = c8u;
    }

    private void A02(int i10, String str, JSONObject jSONObject, boolean z10) {
        AnonymousClass90 anonymousClass90 = new AnonymousClass90(A00(4, 6, 78));
        anonymousClass90.A05(jSONObject);
        anonymousClass90.A03(1);
        anonymousClass90.A07(z10);
        try {
            jSONObject.put(A00(33, 13, 121), C07768t.A0H(this.A00));
        } catch (JSONException unused) {
        }
        this.A00.A06().A8z(A00(27, 6, 27), i10 + TTAdSdk.INIT_LOCAL_FAIL_CODE, anonymousClass90);
        if (this.A00.A03().A8P()) {
            String str2 = A00(10, 8, 84) + str + A00(0, 1, 35) + i10 + A00(1, 3, 14) + jSONObject.toString();
        }
    }

    @VisibleForTesting
    public static boolean A03(C0T c0t) {
        for (C0T c0t2 : XT.A09) {
            if (c0t2.equals(c0t)) {
                String[] strArr = A02;
                if (strArr[5].length() != strArr[7].length()) {
                    String[] strArr2 = A02;
                    strArr2[0] = "Wnbl1SxbPUMoFXuq6aB18pNeXqZWWzDi";
                    strArr2[2] = "Lc0ARXxjXBXBpMD71LOao0gY4EKFysHu";
                    return true;
                }
                throw new RuntimeException();
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A90(C0T c0t, JSONObject jSONObject) {
        A02(c0t.A02(), c0t.toString(), jSONObject, A03(c0t));
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A9D(int i10, JSONObject jSONObject) {
        A02(i10, A00(18, 9, 81) + i10, jSONObject, false);
    }
}
