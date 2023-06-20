package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bR  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1543bR extends L8 {
    public static byte[] A01;
    public final /* synthetic */ C06985g A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{62, 44, 44, 58, 43, 44};
    }

    public C1543bR(C06985g c06985g) {
        this.A00 = c06985g;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0017 */
    @Override // com.facebook.ads.redexgen.X.L8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A06() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.5g r0 = r5.A00     // Catch: org.json.JSONException -> L4b
            org.json.JSONObject r3 = com.facebook.ads.redexgen.X.C06985g.A06(r0)     // Catch: org.json.JSONException -> L4b
            r2 = 0
            r1 = 6
            r0 = 77
            java.lang.String r0 = A00(r2, r1, r0)     // Catch: org.json.JSONException -> L4b
            org.json.JSONArray r4 = r3.getJSONArray(r0)     // Catch: org.json.JSONException -> L4b
            r3 = 0
        L13:
            int r0 = r4.length()     // Catch: org.json.JSONException -> L4b
            if (r3 >= r0) goto L2b
            org.json.JSONObject r0 = r4.getJSONObject(r3)     // Catch: org.json.JSONException -> L4b
            com.facebook.ads.redexgen.X.5e r2 = com.facebook.ads.redexgen.X.C06965e.A00(r0)     // Catch: org.json.JSONException -> L4b
            com.facebook.ads.redexgen.X.5g r1 = r5.A00     // Catch: org.json.JSONException -> L4b
            boolean r0 = r2.A04     // Catch: org.json.JSONException -> L4b
            com.facebook.ads.redexgen.X.C06985g.A08(r1, r0, r2)     // Catch: org.json.JSONException -> L4b
            int r3 = r3 + 1
            goto L13
        L2b:
            com.facebook.ads.redexgen.X.5g r0 = r5.A00     // Catch: org.json.JSONException -> L4b
            com.facebook.ads.redexgen.X.7U r4 = com.facebook.ads.redexgen.X.C06985g.A02(r0)     // Catch: org.json.JSONException -> L4b
            com.facebook.ads.redexgen.X.bT r3 = new com.facebook.ads.redexgen.X.bT     // Catch: org.json.JSONException -> L4b
            r3.<init>(r5)     // Catch: org.json.JSONException -> L4b
            com.facebook.ads.redexgen.X.5g r0 = r5.A00     // Catch: org.json.JSONException -> L4b
            java.lang.String r2 = com.facebook.ads.redexgen.X.C06985g.A04(r0)     // Catch: org.json.JSONException -> L4b
            com.facebook.ads.redexgen.X.5g r0 = r5.A00     // Catch: org.json.JSONException -> L4b
            java.lang.String r1 = com.facebook.ads.redexgen.X.C06985g.A05(r0)     // Catch: org.json.JSONException -> L4b
            com.facebook.ads.redexgen.X.7N r0 = new com.facebook.ads.redexgen.X.7N     // Catch: org.json.JSONException -> L4b
            r0.<init>(r2, r1)     // Catch: org.json.JSONException -> L4b
            r4.A0W(r3, r0)     // Catch: org.json.JSONException -> L4b
            goto L59
        L4b:
            com.facebook.ads.redexgen.X.5g r0 = r5.A00
            android.os.Handler r1 = com.facebook.ads.redexgen.X.C06985g.A00(r0)
            com.facebook.ads.redexgen.X.bS r0 = new com.facebook.ads.redexgen.X.bS
            r0.<init>(r5)
            r1.post(r0)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1543bR.A06():void");
    }
}
