package com.facebook.ads.redexgen.X;

import android.content.pm.ConfigurationInfo;

/* renamed from: com.facebook.ads.redexgen.X.az  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1515az implements InterfaceC07386v {
    public final /* synthetic */ C1509at A00;

    public C1515az(C1509at c1509at) {
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
            return c1509at.A04(configurationInfo2.reqKeyboardType);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
