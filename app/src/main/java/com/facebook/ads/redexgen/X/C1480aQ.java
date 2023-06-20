package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.aQ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1480aQ implements InterfaceC07386v {
    public final /* synthetic */ C1467aD A00;
    public final /* synthetic */ HashMap A01;

    public C1480aQ(C1467aD c1467aD, HashMap hashMap) {
        this.A00 = c1467aD;
        this.A01 = hashMap;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        return this.A00.A05(RecyclerView.UNDEFINED_DURATION, this.A01);
    }
}
