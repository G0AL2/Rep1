package com.facebook.ads.redexgen.X;

import android.content.pm.ApplicationInfo;

/* renamed from: com.facebook.ads.redexgen.X.af  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1495af implements InterfaceC07386v {
    public static String[] A01 = {"CyYconlRA", "Z99FvxWAH", "r", "I6nMbGSwO", "f1HEaIkkO6UN2Wyn2K6t6YhOL5YQHMub", "q7TOnFp8MDH9pVcAi7q7X5O", "kHDnEbJrZHu3VwOwnck16fHaeHzzt8", "W41og5bN"};
    public final /* synthetic */ C1488aY A00;

    public C1495af(C1488aY c1488aY) {
        this.A00 = c1488aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        applicationInfo = this.A00.A01;
        if (applicationInfo != null) {
            C1488aY c1488aY = this.A00;
            String[] strArr = A01;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A01[2] = "ZWV";
            applicationInfo2 = c1488aY.A01;
            return c1488aY.A08(applicationInfo2.sourceDir);
        }
        C1488aY c1488aY2 = this.A00;
        if (A01[6].length() != 14) {
            A01[6] = "1VAENbmq7tYIb9ZQI0D0jEbiw3q";
            return c1488aY2.A07(AnonymousClass76.A07);
        }
        return c1488aY2.A07(AnonymousClass76.A07);
    }
}
