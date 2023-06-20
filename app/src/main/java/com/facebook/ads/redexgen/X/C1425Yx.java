package com.facebook.ads.redexgen.X;

import android.content.pm.ActivityInfo;

/* renamed from: com.facebook.ads.redexgen.X.Yx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1425Yx implements InterfaceC07386v {
    public static String[] A01 = {"BjEOBj6HSQS8i4DRK2qoJX27hoC0R4DA", "kauKwe7CVPrqe4cOgSIwGmxqelbhToEk", "XZC7QZo7Jtp8ceyvJGPCObnucv7Agiw", "JUan8YMmX5ogxlB6aq0dkHVlKOHTqFeF", "IuTolVrjy7qRtOK6QcTLTodgNQuY61bU", "4L2hIP4Kb6m", "Yg6y90VIZ7Ah3ybSxqXW6wOi2HMwnGfT", "hl8KcVIJUlPiTEXEjbalUYczznSZgz62"};
    public final /* synthetic */ C1423Yv A00;

    public C1425Yx(C1423Yv c1423Yv) {
        this.A00 = c1423Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        ActivityInfo[] activityInfoArr;
        ActivityInfo[] activityInfoArr2;
        activityInfoArr = this.A00.A04;
        if (activityInfoArr != null) {
            C1423Yv c1423Yv = this.A00;
            activityInfoArr2 = c1423Yv.A04;
            if (A01[3].charAt(20) != 'k') {
                throw new RuntimeException();
            }
            A01[4] = "ZFJR0DMAu8l3jjK6mMcKAcH3eLfgQnHb";
            return c1423Yv.A04(activityInfoArr2.length);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
