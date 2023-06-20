package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class ST implements InterfaceC1080Lk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ L8 A01;
    public final /* synthetic */ SQ A02;

    public ST(SQ sq, int i10, L8 l82) {
        this.A02 = sq;
        this.A00 = i10;
        this.A01 = l82;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1080Lk
    public final void AAN() {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1080Lk
    public final void ABy(float f10) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f10 / this.A00)));
    }
}
