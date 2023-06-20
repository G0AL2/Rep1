package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;

/* renamed from: com.facebook.ads.redexgen.X.au  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1510au implements InterfaceC07386v {
    public final /* synthetic */ C1509at A00;

    public C1510au(C1509at c1509at) {
        this.A00 = c1509at;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        ActivityManager activityManager;
        activityManager = this.A00.A02;
        if (activityManager != null) {
            return this.A00.A0F(ActivityManager.isRunningInTestHarness());
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
