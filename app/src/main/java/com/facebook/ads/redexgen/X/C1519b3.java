package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.b3  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1519b3 implements InterfaceC07386v {
    public final /* synthetic */ C1509at A00;

    public C1519b3(C1509at c1509at) {
        this.A00 = c1509at;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        ActivityManager activityManager;
        ActivityManager activityManager2;
        if (Build.VERSION.SDK_INT >= 23) {
            activityManager = this.A00.A02;
            if (activityManager != null) {
                C1509at c1509at = this.A00;
                activityManager2 = c1509at.A02;
                return c1509at.A04(activityManager2.getLockTaskModeState());
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
