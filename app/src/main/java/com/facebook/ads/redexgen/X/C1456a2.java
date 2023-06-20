package com.facebook.ads.redexgen.X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.a2  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1456a2 implements InterfaceC07386v {
    public final /* synthetic */ C1435Zh A00;

    public C1456a2(C1435Zh c1435Zh) {
        this.A00 = c1435Zh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT < 26) {
            return this.A00.A08(Build.SERIAL);
        }
        return this.A00.A08(Build.getSerial());
    }
}
