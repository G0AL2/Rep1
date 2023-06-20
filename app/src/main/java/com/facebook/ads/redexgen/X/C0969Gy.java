package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Gy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0969Gy implements RR {
    public static byte[] A05;
    public static String[] A06 = {"yJwczGSbba5UrkwzZOW60Je1LUoZxQIl", "oZp", "SLRT1bjVboXCxkvYGWPu27FVIHxKKecJ", "WHpvXVjPup", "", "gRWAa43vtpEz38T6Kt4HiTmitjJp6SmI", "", "QpBNbg2dQWhW"};
    @Nullable
    public JSONObject A00;
    @Nullable
    public JSONObject A01;
    public final RS A03;
    public final List<RT> A04 = new ArrayList();
    public boolean A02 = false;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 27);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        if (A06[7].length() != 12) {
            throw new RuntimeException();
        }
        A06[3] = "GbTE4j9vTw";
        A05 = new byte[]{58, 13, 22, 28, 20, 29, 88, 93, 11, 88, 28, 25, 12, 25, 88, 13, 8, 28, 25, 12, 29, 66, 114, 82, 82, 88, 28, 25, 12, 25, 88, 82, 82, 114, 93, 11, 114, 82, 82, 88, 30, 17, 22, 31, 29, 10, 8, 10, 17, 22, 12, 88, 82, 82, 114, 93, 11, 89, 110, 117, Byte.MAX_VALUE, 119, 126, 59, 115, 122, 104, 59, 117, 116, 59, 125, 114, 117, 124, 126, 105, 107, 105, 114, 117, 111, 32, 23, 12, 6, 14, 7, 66, 11, 17, 66, 12, 13, 22, 66, 16, 7, 3, 6, 27, 43, 46, 59, 46, 111, 114, 114, 111, 33, 58, 35, 35, 107, 100, 99, 106, 104, Byte.MAX_VALUE, 125, Byte.MAX_VALUE, 100, 99, 121, 45, 44, 48, 45, 99, 120, 97, 97, 125, 114, 117, 124, 126, 105, 107, 105, 114, 117, 111, 59, 38, 38, 59, 117, 110, 119, 119, 77, 86, 79, 79};
    }

    static {
        A03();
    }

    public C0969Gy(RS rs) {
        this.A03 = rs;
    }

    private boolean A04(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return false;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return true;
        }
        boolean A02 = RQ.A02(jSONObject, jSONObject2);
        String[] strArr = A06;
        if (strArr[0].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[4] = "";
        strArr2[6] = "";
        return true ^ A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r8.A03.A04() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
        throw new java.lang.IllegalArgumentException(A02(113, 19, 22));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean A05(org.json.JSONObject r9, @androidx.annotation.Nullable org.json.JSONObject r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r9 == 0) goto Lac
            if (r10 != 0) goto L1d
            com.facebook.ads.redexgen.X.RS r0 = r8.A03     // Catch: java.lang.Throwable -> Lbc
            boolean r0 = r0.A04()     // Catch: java.lang.Throwable -> Lbc
            if (r0 != 0) goto Le
            goto L1d
        Le:
            r2 = 132(0x84, float:1.85E-43)
            r1 = 19
            r0 = 0
            java.lang.String r1 = A02(r2, r1, r0)     // Catch: java.lang.Throwable -> Lbc
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lbc
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lbc
            throw r0     // Catch: java.lang.Throwable -> Lbc
        L1d:
            if (r10 == 0) goto L27
            com.facebook.ads.redexgen.X.RS r0 = r8.A03     // Catch: java.lang.Throwable -> Lbc
            boolean r0 = r0.A04()     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L9c
        L27:
            org.json.JSONObject r0 = r8.A01     // Catch: java.lang.Throwable -> Lbc
            boolean r0 = r8.A04(r0, r10)     // Catch: java.lang.Throwable -> Lbc
            r3 = 0
            if (r0 != 0) goto L38
            org.json.JSONObject r0 = r8.A00     // Catch: java.lang.Throwable -> Lbc
            boolean r0 = r8.A04(r0, r9)     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L9a
        L38:
            r8.A00 = r9     // Catch: java.lang.Throwable -> Lbc
            r8.A01 = r10     // Catch: java.lang.Throwable -> Lbc
            r7 = 1
            r8.A02 = r7     // Catch: java.lang.Throwable -> Lbc
            java.util.List<com.facebook.ads.redexgen.X.RT> r0 = r8.A04     // Catch: java.lang.Throwable -> Lbc
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> Lbc
        L45:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L55
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Lbc
            com.facebook.ads.redexgen.X.RT r0 = (com.facebook.ads.redexgen.X.RT) r0     // Catch: java.lang.Throwable -> Lbc
            r0.A3u()     // Catch: java.lang.Throwable -> Lbc
            goto L45
        L55:
            java.util.Locale r6 = java.util.Locale.US     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            r2 = 0
            r1 = 57
            r0 = 99
            java.lang.String r5 = A02(r2, r1, r0)     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            r0 = 3
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            com.facebook.ads.redexgen.X.RS r0 = r8.A03     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            r4[r3] = r0     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            org.json.JSONObject r0 = r8.A00     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            r3 = 2
            if (r0 != 0) goto L91
            r2 = 151(0x97, float:2.12E-43)
            r1 = 4
            r0 = 56
            java.lang.String r0 = A02(r2, r1, r0)     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
        L75:
            r4[r7] = r0     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            org.json.JSONObject r0 = r8.A01     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            if (r0 != 0) goto L8a
            r2 = 151(0x97, float:2.12E-43)
            r1 = 4
            r0 = 56
            java.lang.String r0 = A02(r2, r1, r0)     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
        L84:
            r4[r3] = r0     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            java.lang.String.format(r6, r5, r4)     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            goto L98
        L8a:
            org.json.JSONObject r0 = r8.A01     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            java.lang.String r0 = r0.toString(r3)     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            goto L84
        L91:
            org.json.JSONObject r0 = r8.A00     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            java.lang.String r0 = r0.toString(r3)     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            goto L75
        L98:
            monitor-exit(r8)
            return r7
        L9a:
            monitor-exit(r8)
            return r3
        L9c:
            r2 = 113(0x71, float:1.58E-43)
            r1 = 19
            r0 = 22
            java.lang.String r1 = A02(r2, r1, r0)     // Catch: java.lang.Throwable -> Lbc
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lbc
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lbc
            throw r0     // Catch: java.lang.Throwable -> Lbc
        Lac:
            r2 = 101(0x65, float:1.42E-43)
            r1 = 12
            r0 = 84
            java.lang.String r1 = A02(r2, r1, r0)     // Catch: java.lang.Throwable -> Lbc
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lbc
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lbc
            throw r0     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0969Gy.A05(org.json.JSONObject, org.json.JSONObject):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.RR
    public final synchronized void A3F(RT rt) {
        this.A04.add(rt);
    }

    @Override // com.facebook.ads.redexgen.X.RR
    public final synchronized JSONObject A6J() {
        if (this.A00 != null) {
        } else {
            throw new IllegalStateException(A02(82, 19, 121));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.RR
    public final synchronized JSONObject A6g() {
        if (this.A03.A04()) {
            if (this.A01 != null) {
            } else {
                throw new IllegalStateException(A02(82, 19, 121));
            }
        } else {
            throw new IllegalStateException(A02(57, 25, 0));
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.RR
    public final RS A6l() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.RR
    public final synchronized boolean A8c() {
        return this.A02;
    }
}
