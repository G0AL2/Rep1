package com.facebook.ads.redexgen.X;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.aT  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1483aT implements InterfaceC07386v {
    public static String[] A02 = {"8IgbQbzIeG7tuzbPw4WpTReJHEXOOBaI", "uwr3gwrpCwnsdPI6tcqzo06z5LPFYArK", "KUvtzgiNenvKoXYdIGr4T", "ebtfEWeeh2etvFgGs478sf7cOArxhZcn", "MQ8ux5tmWncWP0t9wyLsU5JzQOIFN", "7dBSxWLu4PAR6eol7PDhhjCLapQyD", "DfYXUN1CCnyCs44nd3kIcNIJOWqVY6eS", "5gEsKmvQZ2K3SsZVO0OSc0798tOlDhoK"};
    public final /* synthetic */ C1481aR A00;
    public final /* synthetic */ List A01;

    public C1483aT(C1481aR c1481aR, List list) {
        this.A00 = c1481aR;
        this.A01 = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.C7A A5J() {
        /*
            r7 = this;
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4 = 0
        L6:
            java.util.List r5 = r7.A01
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1483aT.A02
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 9
            if (r1 == r0) goto Lb3
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1483aT.A02
            java.lang.String r1 = "wkxUGDPvutXhqdGlSbbbG0nh4qVsuIhH"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "9se0a2PCPvuNc9uYSGqMP0X6BOz38YUy"
            r0 = 1
            r2[r0] = r1
            int r0 = r5.size()
            if (r4 >= r0) goto Lac
            java.util.List r5 = r7.A01
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1483aT.A02
            r0 = 5
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L93
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1483aT.A02
            java.lang.String r1 = "w6bkI8mcFJbdIq2JUa0cw0U5M6INIj0g"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "5vzP4JEpPTq7RU19xyhl907HqVfLv1o1"
            r0 = 1
            r2[r0] = r1
            java.lang.Object r1 = r5.get(r4)
            com.facebook.ads.redexgen.X.6u r1 = (com.facebook.ads.redexgen.X.C07376u) r1
            boolean r0 = r1.A02()
            if (r0 == 0) goto L8d
        L53:
            java.lang.Object r0 = r1.A01()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r6 = r0.intValue()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L91
            com.facebook.ads.redexgen.X.aR r0 = r7.A00
            android.media.AudioManager r0 = com.facebook.ads.redexgen.X.C1481aR.A01(r0)
            int r5 = r0.getStreamMinVolume(r6)
        L6d:
            com.facebook.ads.redexgen.X.aR r0 = r7.A00
            android.media.AudioManager r0 = com.facebook.ads.redexgen.X.C1481aR.A01(r0)
            int r2 = r0.getStreamVolume(r6)
            com.facebook.ads.redexgen.X.aR r0 = r7.A00
            android.media.AudioManager r0 = com.facebook.ads.redexgen.X.C1481aR.A01(r0)
            int r0 = r0.getStreamMaxVolume(r6)
            com.facebook.ads.redexgen.X.aS r1 = new com.facebook.ads.redexgen.X.aS
            r1.<init>(r5, r2, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r3.put(r0, r1)
        L8d:
            int r4 = r4 + 1
            goto L6
        L91:
            r5 = -1
            goto L6d
        L93:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1483aT.A02
            java.lang.String r1 = "CIZgFD3PxrctzWhUemjZg0F42IFR8Khz"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "vl3ScUwT7Dxtepa46leMofObvUClFSdC"
            r0 = 3
            r2[r0] = r1
            java.lang.Object r1 = r5.get(r4)
            com.facebook.ads.redexgen.X.6u r1 = (com.facebook.ads.redexgen.X.C07376u) r1
            boolean r0 = r1.A02()
            if (r0 == 0) goto L8d
            goto L53
        Lac:
            com.facebook.ads.redexgen.X.aR r0 = r7.A00
            com.facebook.ads.redexgen.X.7A r0 = com.facebook.ads.redexgen.X.C1481aR.A02(r0, r3)
            return r0
        Lb3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1483aT.A5J():com.facebook.ads.redexgen.X.7A");
    }
}
