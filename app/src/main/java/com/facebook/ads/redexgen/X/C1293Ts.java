package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Ts  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1293Ts extends L8 {
    public final /* synthetic */ C1081Ll A00;

    public C1293Ts(C1081Ll c1081Ll) {
        this.A00 = c1081Ll;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        Handler handler;
        if (this.A00.A05()) {
            this.A00.A01();
            handler = this.A00.A03;
            handler.postDelayed(this, 250L);
        }
    }
}
