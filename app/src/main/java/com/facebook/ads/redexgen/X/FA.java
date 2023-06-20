package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;

/* loaded from: assets/audience_network.dex */
public final class FA extends AbstractC1573bv {
    public static String[] A02 = {"C44Ajl3kvJruV1G0pt7gVRuztfjSJyFq", "J5x5lFquh7whloqA7FngbvBzLsCb", "NWBvU5bW0Pue", "3", "BTAVkHunqM91yRRN2KcoYuZCergWfboL", "2NY5ANPTvwBPWrnTgdotgLNYCmp8", "bg7eF9CjngMlwdFplTojabi", "lLeEucKPPYu6Z0yxrpg2o1MG4v3W39r2"};
    @Nullable
    public C4D A00;
    @Nullable
    public C4D A01;

    private int A00(@NonNull C4T c4t, @NonNull View view, C4D c4d) {
        int A06;
        int A0F = c4d.A0F(view) + (c4d.A0D(view) / 2);
        if (c4t.A1X()) {
            A06 = c4d.A0A() + (c4d.A0B() / 2);
        } else {
            A06 = c4d.A06() / 2;
        }
        return A0F - A06;
    }

    @Nullable
    private View A01(C4T c4t, C4D c4d) {
        int A06;
        int absClosest = c4t.A0W();
        if (absClosest == 0) {
            return null;
        }
        View child = null;
        if (c4t.A1X()) {
            int A0A = c4d.A0A();
            int A0B = c4d.A0B();
            if (A02[3].length() != 1) {
                throw new RuntimeException();
            }
            A02[4] = "QSrTWOl4jyYASaYHeqwJw7nAVlZS9nVf";
            A06 = A0A + (A0B / 2);
        } else {
            A06 = c4d.A06() / 2;
        }
        int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i11 = 0; i11 < absClosest; i11++) {
            View A0t = c4t.A0t(i11);
            int A0F = c4d.A0F(A0t);
            int i12 = c4d.A0D(A0t);
            int childCenter = Math.abs((A0F + (i12 / 2)) - A06);
            if (childCenter < i10) {
                i10 = childCenter;
                child = A0t;
            }
        }
        return child;
    }

    @Nullable
    private View A02(C4T c4t, C4D c4d) {
        int i10 = c4t.A0W();
        if (i10 == 0) {
            return null;
        }
        View view = null;
        int i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i12 = 0; i12 < i10; i12++) {
            View A0t = c4t.A0t(i12);
            int A0F = c4d.A0F(A0t);
            if (A0F < i11) {
                i11 = A0F;
                int childStart = A02[3].length();
                if (childStart != 1) {
                    throw new RuntimeException();
                }
                A02[3] = "0";
                view = A0t;
            }
        }
        return view;
    }

    @NonNull
    private C4D A03(@NonNull C4T c4t) {
        C4D c4d = this.A00;
        if (c4d == null || c4d.A02 != c4t) {
            this.A00 = C4D.A00(c4t);
        }
        return this.A00;
    }

    @NonNull
    private C4D A04(@NonNull C4T c4t) {
        C4D c4d = this.A01;
        if (c4d == null || c4d.A02 != c4t) {
            this.A01 = C4D.A01(c4t);
        }
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (r4 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r4.x < 0.0f) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        if (r4.y >= 0.0f) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
        if (r4 != null) goto L23;
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC1573bv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A0C(com.facebook.ads.redexgen.X.C4T r10, int r11, int r12) {
        /*
            r9 = this;
            int r8 = r10.A0Z()
            r4 = -1
            if (r8 != 0) goto L8
            return r4
        L8:
            r1 = 0
            boolean r0 = r10.A25()
            if (r0 == 0) goto L1a
            com.facebook.ads.redexgen.X.4D r0 = r9.A04(r10)
            android.view.View r1 = r9.A02(r10, r0)
        L17:
            if (r1 != 0) goto L42
            return r4
        L1a:
            boolean r0 = r10.A24()
            if (r0 == 0) goto L17
            com.facebook.ads.redexgen.X.4D r3 = r9.A03(r10)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.FA.A02
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L36
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L36:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FA.A02
            java.lang.String r1 = "gb7KateBwDTMhlVKT6fWGE4qrSBelOuo"
            r0 = 4
            r2[r0] = r1
            android.view.View r1 = r9.A02(r10, r3)
            goto L17
        L42:
            int r3 = r10.A0p(r1)
            if (r3 != r4) goto L49
            return r4
        L49:
            boolean r0 = r10.A24()
            r7 = 0
            if (r0 == 0) goto La1
            if (r11 <= 0) goto L9f
            r6 = 1
        L53:
            r5 = 0
            boolean r0 = r10 instanceof com.facebook.ads.redexgen.X.InterfaceC06714f
            if (r0 == 0) goto L89
            com.facebook.ads.redexgen.X.4f r10 = (com.facebook.ads.redexgen.X.InterfaceC06714f) r10
            int r0 = r8 + (-1)
            android.graphics.PointF r4 = r10.A45(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.FA.A02
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L95
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FA.A02
            java.lang.String r1 = "yuw4mNpzW34AqVSRehlxNeo"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "wkUUhZpWZ02e"
            r0 = 2
            r2[r0] = r1
            if (r4 == 0) goto L89
        L7a:
            float r0 = r4.x
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L87
            float r0 = r4.y
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L88
        L87:
            r7 = 1
        L88:
            r5 = r7
        L89:
            if (r5 == 0) goto L90
            if (r6 == 0) goto L8f
            int r3 = r3 + (-1)
        L8f:
            return r3
        L90:
            if (r6 == 0) goto L8f
            int r3 = r3 + 1
            goto L8f
        L95:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FA.A02
            java.lang.String r1 = "mSLQWLSJnMsLfeZB8hd0gvJZQvTgwPgU"
            r0 = 0
            r2[r0] = r1
            if (r4 == 0) goto L89
            goto L7a
        L9f:
            r6 = 0
            goto L53
        La1:
            if (r12 <= 0) goto La5
            r6 = 1
            goto L53
        La5:
            r6 = 0
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.FA.A0C(com.facebook.ads.redexgen.X.4T, int, int):int");
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1573bv
    @Nullable
    public final View A0D(C4T c4t) {
        if (c4t.A25()) {
            return A01(c4t, A04(c4t));
        }
        if (c4t.A24()) {
            return A01(c4t, A03(c4t));
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1573bv
    public final C1587cA A0E(C4T c4t) {
        if (!(c4t instanceof InterfaceC06714f)) {
            return null;
        }
        return new FB(this, super.A00.getContext());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1573bv
    @Nullable
    public final int[] A0H(@NonNull C4T c4t, @NonNull View view) {
        int[] iArr = new int[2];
        if (c4t.A24()) {
            iArr[0] = A00(c4t, view, A03(c4t));
        } else {
            iArr[0] = 0;
        }
        boolean A25 = c4t.A25();
        String[] strArr = A02;
        if (strArr[1].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A02[0] = "E62MX6H1I4NpqQbgkpQnwXfK7jhgOp7C";
        if (A25) {
            iArr[1] = A00(c4t, view, A04(c4t));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
