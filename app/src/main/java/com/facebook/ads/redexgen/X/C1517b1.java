package com.facebook.ads.redexgen.X;

import android.content.pm.ConfigurationInfo;

/* renamed from: com.facebook.ads.redexgen.X.b1  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1517b1 implements InterfaceC07386v {
    public final /* synthetic */ C1509at A00;

    public C1517b1(C1509at c1509at) {
        this.A00 = c1509at;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        ConfigurationInfo configurationInfo;
        ConfigurationInfo configurationInfo2;
        configurationInfo = this.A00.A00;
        if (configurationInfo != null) {
            C1509at c1509at = this.A00;
            configurationInfo2 = c1509at.A00;
            return c1509at.A08(configurationInfo2.getGlEsVersion());
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
