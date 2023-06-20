package com.facebook.ads.redexgen.X;

import android.icu.util.TimeZone;
import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class YQ implements InterfaceC07386v {
    public final /* synthetic */ YN A00;

    public YQ(YN yn) {
        this.A00 = yn;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT < 24) {
            return this.A00.A07(AnonymousClass76.A05);
        }
        return this.A00.A08(TimeZone.getDefault().getID());
    }
}
