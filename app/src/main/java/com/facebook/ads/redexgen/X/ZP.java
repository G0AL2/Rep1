package com.facebook.ads.redexgen.X;

import android.app.KeyguardManager;
import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class ZP implements InterfaceC07386v {
    public static String[] A01 = {"wdcki9TayB0epgOAqgPZ60vGLzXQskFg", "eaUsA8pmkvwqM9uF8kH4nQuKK9Zu7ymc", "2dfJX", "k6tMd5tlxlmCEJMQTJf7pwLJqfV91j3Q", "YVwPmyUK2b9QSHLRAwsi84oHRZQXtzOF", "hpSXL0XJUd77PKoaf1", "iaFmBfogLFf9YiLH80pKK2KW3oFuZo4T", "28ANuaZ3OB7zLgtTtX"};
    public final /* synthetic */ ZN A00;

    public ZP(ZN zn) {
        this.A00 = zn;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        KeyguardManager keyguardManager;
        KeyguardManager keyguardManager2;
        if (Build.VERSION.SDK_INT >= 16) {
            keyguardManager = this.A00.A00;
            if (keyguardManager == null) {
                ZN zn = this.A00;
                String[] strArr = A01;
                if (strArr[7].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                A01[0] = "xEd7j65KlJaDHlrOXF5qOqVEOzAiF9i5";
                return zn.A07(AnonymousClass76.A07);
            }
            ZN zn2 = this.A00;
            keyguardManager2 = zn2.A00;
            return zn2.A0F(keyguardManager2.isKeyguardLocked());
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
