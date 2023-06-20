package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;

/* renamed from: com.facebook.ads.redexgen.X.av  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1511av implements InterfaceC07386v {
    public final /* synthetic */ C1509at A00;

    public C1511av(C1509at c1509at) {
        this.A00 = c1509at;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo2;
        runningAppProcessInfo = this.A00.A01;
        if (runningAppProcessInfo != null) {
            C1509at c1509at = this.A00;
            runningAppProcessInfo2 = c1509at.A01;
            return c1509at.A08(runningAppProcessInfo2.processName);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
