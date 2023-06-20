package com.facebook.ads.redexgen.X;

import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;

/* loaded from: assets/audience_network.dex */
public final class XW implements C8W {
    public static XW A06;
    public static byte[] A07;
    public static String[] A08 = {"kZNWMB05A80rolZkZr5gINRkemJedumA", "PGnlsDLswmZGHAGkHnqyou4j", "CQczeQcoxNMNqPeDO5UPH4delPie3CF6", "Ozs7AQnIuhnl4TF488yhCLnc3lqg3Tqv", "QUMQF15y8F49TOv2Mbtf3pi6YRJU7tsl", "iRM3Hx3PCEqf", "8yEJzjy1AvS4vnL", "zEXAgd0MZ6iopjt"};
    @Nullable
    public C0U A00;
    @Nullable
    public C8V A01;
    @Nullable
    public InterfaceC07708l A02;
    @Nullable
    public C9P A03;
    @Nullable
    public InterfaceC1040Jt A04;
    @Nullable
    public GU A05;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A06(int r4, int r5, int r6) {
        /*
            byte[] r1 = com.facebook.ads.redexgen.X.XW.A07
            int r0 = r4 + r5
            byte[] r3 = java.util.Arrays.copyOfRange(r1, r4, r0)
            r4 = 0
        L9:
            int r5 = r3.length
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.XW.A08
            r0 = 6
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L22
        L1c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L22:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.XW.A08
            java.lang.String r1 = "Hv2WK1fJh7GnXaP"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "jwUFRNkRPBL5IaL"
            r0 = 7
            r2[r0] = r1
            if (r4 >= r5) goto L5c
            r5 = r3[r4]
            int r5 = r5 - r6
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.XW.A08
            r0 = 4
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L48
            goto L1c
        L48:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.XW.A08
            java.lang.String r1 = "3jbuj6iR6sIerVLqEJ9xAsC0KuP7QrbG"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "qsuffxm3RCjhy50iWQEl04Txy4tWGAPw"
            r0 = 3
            r2[r0] = r1
            int r0 = r5 + (-98)
            byte r0 = (byte) r0
            r3[r4] = r0
            int r4 = r4 + 1
            goto L9
        L5c:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.XW.A06(int, int, int):java.lang.String");
    }

    public static void A07() {
        A07 = new byte[]{-57, -64, -10, -56, -56, -64, -59, -63, -16, 2, 16, 16, 6, 12, 11, -67, 1, -2, 17, -2, -67, 6, 11, 6, 17, 6, -2, 9, 6, 23, 2, 1, 33, 20, 31, 30, 33, 35, 2, 20, 34, 34, 24, 30, 29, -13, 16, 35, 16, -8, 29, 24, 35, 24, 16, 27, 24, 41, 20, 19};
        if (A08[1].length() == 32) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[2] = "XQj6tBQR93KUWcmqG7acynHpkyXbPHo4";
        strArr[3] = "0fPU7ngiro1m2vFzwgFa3cBnolZ3o5pA";
    }

    static {
        A07();
    }

    @Nullable
    public static InterfaceC07025k A00(C1399Xx c1399Xx, @Nullable GU gu) {
        if (!JR.A1B(c1399Xx) || gu == null) {
            return null;
        }
        return AbstractC07035l.A00().A01(gu);
    }

    public static InterfaceC07708l A01(C1399Xx c1399Xx) {
        return C8m.A00().A01(c1399Xx, new C1379Xd());
    }

    public static synchronized XW A02() {
        XW xw;
        synchronized (XW.class) {
            if (A06 == null) {
                A06 = new XW();
            }
            xw = A06;
        }
        return xw;
    }

    @Nullable
    public static R2 A03(C1399Xx c1399Xx) {
        if (!JR.A17(c1399Xx)) {
            return null;
        }
        return RK.A01(c1399Xx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8W
    @Nullable
    /* renamed from: A04 */
    public final synchronized GU A7d() {
        return this.A05;
    }

    @Nullable
    public static GU A05(C1399Xx c1399Xx, InterfaceC07708l interfaceC07708l, @Nullable R2 r22) {
        if (!JR.A1u(c1399Xx) || r22 == null) {
            return null;
        }
        return AbstractC1231Rh.A00().A01(c1399Xx, interfaceC07708l, r22, C1059Ko.A04(c1399Xx), new XX(new C1053Kh(c1399Xx, A06(0, 0, 122), null, KM.A07, AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT ? AdSettings.getTestAdType().getAdTypeString() : null, 0, AdSettings.isTestMode(c1399Xx), AdSettings.isMixedAudience(), new KR(), MA.A01(JR.A0H(c1399Xx)), null, null), c1399Xx), C1229Rf.A00().A00());
    }

    public static void A08() {
        String A062 = A06(32, 28, 77);
        if (A08[5].length() == 20) {
            throw new RuntimeException();
        }
        A08[5] = "4ii3kc4oT9MJsiDOLfNQb5ib2";
        KV.A05(A062, A06(8, 24, 59), A06(0, 8, 46));
    }

    public static void A09(C1399Xx c1399Xx, @Nullable InterfaceC07025k interfaceC07025k) {
        if (!JR.A1B(c1399Xx) || interfaceC07025k == null) {
            return;
        }
        AbstractC07005i.A00().A01(interfaceC07025k, c1399Xx);
    }

    public static void A0A(C1399Xx c1399Xx, @Nullable GU gu) {
        if (!JR.A0h(c1399Xx) || gu == null) {
            return;
        }
        new AnonymousClass65(c1399Xx, gu, new AnonymousClass66(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1399Xx c1399Xx, @Nullable GU gu) {
        if (gu == null) {
            return;
        }
        JU.A00(c1399Xx, gu);
    }

    public final synchronized void A0C(C1399Xx c1399Xx) {
        if (this.A05 != null) {
            return;
        }
        this.A02 = A01(c1399Xx);
        this.A05 = A05(c1399Xx, this.A02, A03(c1399Xx));
        A09(c1399Xx, A00(c1399Xx, this.A05));
        A0A(c1399Xx, this.A05);
        A0B(c1399Xx, this.A05);
        if (this.A05 != null) {
            this.A05.A5U();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final InterfaceC1028Jh A5c(C1399Xx c1399Xx) {
        return UX.A01(c1399Xx);
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized C8V A5q(C8U c8u) {
        if (this.A01 == null) {
            this.A01 = new XY(this);
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized InterfaceC07708l A6L(C8U c8u) {
        if (this.A02 == null) {
            this.A02 = A01(c8u.A00());
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized InterfaceC07818y A6M(C8U c8u) {
        return new C1388Xm(c8u);
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized C8X A6V(C8U c8u) {
        return new EL(this, c8u);
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    @Nullable
    public final synchronized C0U A6i(C8U c8u) {
        if (!JR.A0s(c8u)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = C0V.A00().A01(new C1377Xb(c8u));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized C8Z A7L(C8U c8u) {
        return new XZ(c8u);
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final C1399Xx A7M(Context context) {
        C1399Xx A00 = C8T.A00();
        if (A00 == null) {
            C1399Xx c1399Xx = new C1399Xx(context, this);
            C8T.A01(c1399Xx);
            return c1399Xx;
        }
        return A00;
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized InterfaceC1040Jt A7N(C1399Xx c1399Xx) {
        if (this.A04 == null) {
            this.A04 = new C1305Ue(c1399Xx);
        }
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized C9P A7T() {
        if (this.A03 == null) {
            this.A03 = new C9P();
            A08();
        }
        return this.A03;
    }
}
