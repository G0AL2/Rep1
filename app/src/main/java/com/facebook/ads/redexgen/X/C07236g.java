package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.6g  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07236g {
    public static byte[] A07;
    public static String[] A08 = {"Ri7kjkDT8eD7oXZRfiWmTVhv1RjvdWrO", "cxDqg6Vwj60LwY1YIKiyT4H3eIxAUSyl", "eaEWTtVE1fja", "mvH1Awv1nxYu8upPSugfMtSiNjBS99Ai", "3uMupHsAkG9zmQtrmqj", "34ahGknslOLL", "L7UqFynmPX3bSDpWCs3", "GT67L7E4GYLk"};
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final float[] A06;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 3);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{-42, -57, -61, -21, -32, -39, -47, 124, 119, -120, -124, -90, -91, -99, -99, -12, -124, -95};
    }

    static {
        A07();
    }

    public C07236g(int i10, int i11, int i12, float[] fArr, float f10, float f11, float f12) {
        this.A05 = i10;
        this.A03 = i11;
        this.A04 = i12;
        this.A06 = fArr;
        this.A02 = f10;
        this.A01 = f11;
        this.A00 = f12;
    }

    private final float A00() {
        return this.A00;
    }

    private final float A01() {
        return this.A01;
    }

    private final float A02() {
        return this.A02;
    }

    private final int A03() {
        return this.A03;
    }

    private final int A04() {
        return this.A04;
    }

    private final int A05() {
        return this.A05;
    }

    private final float[] A08() {
        return this.A06;
    }

    public final int A09() {
        return 32;
    }

    public final JSONObject A0A(JSONObject pointerLocObject) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(A06(0, 3, 95), this.A05);
        jSONObject.put(A06(3, 2, 116), this.A03);
        jSONObject.put(A06(13, 2, 38), this.A04);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A06(16, 1, 9), C7J.A00(this.A06[0]));
        jSONObject2.put(A06(17, 1, 37), C7J.A00(this.A06[1]));
        jSONObject.put(A06(5, 2, 98), jSONObject2);
        jSONObject.put(A06(11, 2, 47), C7J.A00(this.A02));
        jSONObject.put(A06(9, 2, 17), C7J.A00(this.A01));
        jSONObject.put(A06(7, 2, 5), C7J.A00(this.A00));
        pointerLocObject.put(A06(15, 1, 123), jSONObject);
        return pointerLocObject;
    }

    public final boolean A0B(C07236g c07236g) {
        if (A05() == c07236g.A05() && A03() == c07236g.A03() && A04() == c07236g.A04()) {
            float abs = Math.abs(A08()[0] - c07236g.A08()[0]);
            String[] strArr = A08;
            if (strArr[0].charAt(29) == strArr[3].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "Q56kdX7pfJkTmJKAWug";
            strArr2[4] = "SmNIYc6TXNif2amUYYL";
            if (abs < C6C.A01() && Math.abs(A08()[1] - c07236g.A08()[1]) < C6C.A01()) {
                int i10 = (Math.abs(A02() - c07236g.A02()) > C6C.A01() ? 1 : (Math.abs(A02() - c07236g.A02()) == C6C.A01() ? 0 : -1));
                String[] strArr3 = A08;
                if (strArr3[7].length() != strArr3[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A08;
                strArr4[6] = "PKTdm45ZSsz2a1wWaXr";
                strArr4[4] = "Kjnff0uul5Scqwkbf9l";
                if (i10 < 0 && Math.abs(A01() - c07236g.A01()) < C6C.A01() && Math.abs(A00() - c07236g.A00()) < C6C.A01()) {
                    return true;
                }
            }
        }
        return false;
    }
}
