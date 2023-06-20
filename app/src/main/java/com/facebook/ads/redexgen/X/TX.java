package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class TX implements InterfaceC1080Lk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ TW A01;

    public TX(TW tw, int i10) {
        this.A01 = tw;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1080Lk
    public final void AAN() {
        this.A01.A03 = false;
        this.A01.A0S();
        this.A01.A0C.setToolbarActionMode(this.A01.getCloseButtonStyle());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1080Lk
    public final void ABy(float f10) {
        this.A01.A0C.setProgress(100.0f * (1.0f - (f10 / this.A00)));
    }
}
