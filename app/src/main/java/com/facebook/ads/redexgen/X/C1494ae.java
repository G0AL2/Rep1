package com.facebook.ads.redexgen.X;

import android.content.pm.ApplicationInfo;

/* renamed from: com.facebook.ads.redexgen.X.ae  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1494ae implements InterfaceC07386v {
    public final /* synthetic */ C1488aY A00;

    public C1494ae(C1488aY c1488aY) {
        this.A00 = c1488aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        applicationInfo = this.A00.A01;
        if (applicationInfo != null) {
            C1488aY c1488aY = this.A00;
            applicationInfo2 = c1488aY.A01;
            return c1488aY.A08(applicationInfo2.dataDir);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
