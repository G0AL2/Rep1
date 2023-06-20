package com.facebook.ads.redexgen.X;

import android.graphics.Rect;

/* renamed from: com.facebook.ads.redexgen.X.Ud  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1304Ud implements JW {
    public static String[] A02 = {"AMQNzlG2eGPOJo74lPpddO6twtMEce", "8uZuLGh3CZSzV4eSaK74M9a8aAW81o1g", "CYs8BZmCr6kO5jRRUq4laItl384RlovT", "PO4hUmmCpilEicL1R3sLdD9hI0Kiey5Z", "WmgRsP13YsLJamj9MMjVCco3tjnpIVCq", "0ErvOAeoLZJf3MJzf6jF5Cw5BrHPqp", "S0kgbIpbc64QMPj8XCJtTK8zDrzNpUnW", "MO6xPizLQkqntlkNHRrNVg7dZ2stU5UP"};
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eU != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public static boolean A00(C1720eU<JX, C1023Jc> c1720eU) {
        if (c1720eU.A01.A05()) {
            return c1720eU.A02.A07();
        }
        if (!c1720eU.A01.A06()) {
            return true;
        }
        C1023Jc c1023Jc = c1720eU.A02;
        String[] strArr = A02;
        if (strArr[3].charAt(7) != strArr[2].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "8O0EOVeCMdEJdeSbYPFIeNjJXhTUSITs";
        strArr2[2] = "Km62DwbCV8Ma1ecjtuIU72b1y8KakI9d";
        return c1023Jc.A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eU != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    private boolean A01(C1720eU<JX, C1023Jc> c1720eU, InterfaceC1709eJ interfaceC1709eJ) {
        float f10 = -1.0f;
        try {
            f10 = interfaceC1709eJ.A7r(c1720eU);
        } catch (IllegalStateException unused) {
        }
        if (f10 <= 0.0f || !A00(c1720eU)) {
            if (c1720eU.A01.A00().getGlobalVisibleRect(this.A01) && this.A01.bottom - this.A01.top > 0 && A00(c1720eU)) {
                return true;
            }
            interfaceC1709eJ.A7q(this.A00);
            interfaceC1709eJ.A6j(c1720eU, this.A01);
            return (this.A00.bottom - this.A00.top > 0 && this.A01.bottom - this.A00.top > 0) && A00(c1720eU);
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eU != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public final void A02(C1720eU<JX, C1023Jc> c1720eU, InterfaceC1709eJ interfaceC1709eJ) {
        if (c1720eU.A02.A04() && A01(c1720eU, interfaceC1709eJ)) {
            c1720eU.A02.A01();
            c1720eU.A01.A02().A9G(c1720eU.A01.A03(), c1720eU.A01.A04());
        }
        if (c1720eU.A02.A05() && JR.A16(c1720eU.A01.A01())) {
            c1720eU.A02.A02();
            c1720eU.A01.A02().A95(c1720eU.A01.A03(), c1720eU.A01.A04());
        }
    }
}
