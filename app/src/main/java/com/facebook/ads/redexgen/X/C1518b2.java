package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.b2  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1518b2 implements InterfaceC07386v {
    public final /* synthetic */ C1509at A00;

    public C1518b2(C1509at c1509at) {
        this.A00 = c1509at;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        ActivityManager activityManager;
        ActivityManager activityManager2;
        if (Build.VERSION.SDK_INT >= 16) {
            activityManager = this.A00.A02;
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager2 = this.A00.A02;
                activityManager2.getMemoryInfo(memoryInfo);
                return this.A00.A06(memoryInfo.totalMem / 1048576);
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
