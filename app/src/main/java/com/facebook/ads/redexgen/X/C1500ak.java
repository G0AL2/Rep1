package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.io.File;

/* renamed from: com.facebook.ads.redexgen.X.ak  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1500ak implements InterfaceC07386v {
    public final /* synthetic */ C1488aY A00;

    public C1500ak(C1488aY c1488aY) {
        this.A00 = c1488aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        Context context;
        context = this.A00.A00;
        return this.A00.A06(new File(context.getApplicationInfo().publicSourceDir).length());
    }
}
