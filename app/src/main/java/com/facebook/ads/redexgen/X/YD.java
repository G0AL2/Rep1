package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class YD extends C7A<AnonymousClass77> {
    public static byte[] A00;
    public static String[] A01 = {"eVrT2", "NU6zFG4u0rUdQg4rmHCYhyhimIYEqcVW", "w8lzJt7", "2MtxRlAdf", "ofvbevjNzGuCdnDr", "yiSP4Q9AL7pZMBsKWJvcqboDvH4W4ekH", "Y5GBNp4gGulMUvRVJRIen52bKNtw4QSM", "rwvebAAeAhhSfHBQ"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A01[1] = "j0mxEJ7PXI6EdILEdAOyominFOl70E0d";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 111);
            i13++;
        }
    }

    public static void A01() {
        A00 = new byte[]{103};
    }

    static {
        A01();
    }

    public YD(long j10, @Nullable AnonymousClass78 anonymousClass78, AnonymousClass77 anonymousClass77) {
        super(j10, anonymousClass78, anonymousClass77, AnonymousClass79.A04);
    }

    @Override // com.facebook.ads.redexgen.X.C7A
    public final int A06() {
        return A07().A03();
    }

    @Override // com.facebook.ads.redexgen.X.C7A
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        jSONObject.put(A00(0, 1, 126), A07().A08());
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
        if (r5.A07().equals(r4.A07()) != false) goto L26;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalErrorValueTypeDef> */
    @Override // com.facebook.ads.redexgen.X.C7A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0A(com.facebook.ads.redexgen.X.C7A<com.facebook.ads.redexgen.X.AnonymousClass77> r9) {
        /*
            r8 = this;
            java.lang.Object r5 = r8.A07()
            com.facebook.ads.redexgen.X.77 r5 = (com.facebook.ads.redexgen.X.AnonymousClass77) r5
            java.lang.Object r4 = r9.A07()
            com.facebook.ads.redexgen.X.77 r4 = (com.facebook.ads.redexgen.X.AnonymousClass77) r4
            com.facebook.ads.redexgen.X.76 r1 = r5.A04()
            java.lang.Object r0 = r9.A07()
            com.facebook.ads.redexgen.X.77 r0 = (com.facebook.ads.redexgen.X.AnonymousClass77) r0
            com.facebook.ads.redexgen.X.76 r0 = r0.A04()
            boolean r0 = r1.equals(r0)
            r7 = 1
            if (r0 == 0) goto L7e
            int r1 = r5.A02()
            int r0 = r4.A02()
            if (r1 != r0) goto L7e
            r6 = 1
        L2c:
            if (r6 == 0) goto L9d
            com.facebook.ads.redexgen.X.76 r1 = r5.A04()
            com.facebook.ads.redexgen.X.76 r0 = com.facebook.ads.redexgen.X.AnonymousClass76.A08
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9d
            java.lang.String r0 = r5.A06()
            if (r0 == 0) goto L9e
            java.lang.String r1 = r5.A06()
            java.lang.String r0 = r4.A06()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9e
            java.lang.String r0 = r5.A05()
            if (r0 == 0) goto L9e
            java.lang.String r1 = r5.A05()
            java.lang.String r0 = r4.A05()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9e
            java.lang.String r3 = r5.A07()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.YD.A01
            r0 = 7
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L80
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L7e:
            r6 = 0
            goto L2c
        L80:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.YD.A01
            java.lang.String r1 = "qacHDjQO5"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "DaFJoXz"
            r0 = 2
            r2[r0] = r1
            if (r3 == 0) goto L9e
            java.lang.String r1 = r5.A07()
            java.lang.String r0 = r4.A07()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9e
        L9c:
            r6 = r6 & r7
        L9d:
            return r6
        L9e:
            r7 = 0
            goto L9c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.YD.A0A(com.facebook.ads.redexgen.X.7A):boolean");
    }
}
