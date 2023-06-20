package com.facebook.ads.redexgen.X;

import android.content.pm.ApplicationInfo;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.ad  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1493ad implements InterfaceC07386v {
    public final /* synthetic */ C1488aY A00;

    public C1493ad(C1488aY c1488aY) {
        this.A00 = c1488aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        if (Build.VERSION.SDK_INT >= 9) {
            applicationInfo = this.A00.A01;
            if (applicationInfo != null) {
                C1488aY c1488aY = this.A00;
                applicationInfo2 = c1488aY.A01;
                return c1488aY.A08(applicationInfo2.nativeLibraryDir);
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
