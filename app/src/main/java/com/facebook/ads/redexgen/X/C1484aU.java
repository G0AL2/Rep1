package com.facebook.ads.redexgen.X;

import android.media.AudioManager;

/* renamed from: com.facebook.ads.redexgen.X.aU  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1484aU implements InterfaceC07386v {
    public final /* synthetic */ C1481aR A00;

    public C1484aU(C1481aR c1481aR) {
        this.A00 = c1481aR;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        AudioManager audioManager;
        C1481aR c1481aR = this.A00;
        audioManager = c1481aR.A00;
        return c1481aR.A04(audioManager.getRingerMode());
    }
}
