package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Sb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1251Sb extends FrameLayout implements InterfaceC1111Mr {
    public final InterfaceC1110Mq A00;
    public final PA A01;

    public C1251Sb(C1400Xy c1400Xy, InterfaceC1110Mq interfaceC1110Mq, PA pa2) {
        super(c1400Xy);
        this.A01 = pa2;
        this.A00 = interfaceC1110Mq;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void A8n(Intent intent, @Nullable Bundle bundle, AnonymousClass59 anonymousClass59) {
        PA.A0B().incrementAndGet();
        this.A01.A0V();
        MS.A0J(this.A01.A0O());
        addView(this.A01.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A00.A3I(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void ABj(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void AC8(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void AEI(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void onDestroy() {
        this.A01.A0U();
        if (this.A01.A0N() != null) {
            this.A01.A0N().AAt();
        }
        PA.A0B().decrementAndGet();
    }

    public void setListener(InterfaceC1110Mq interfaceC1110Mq) {
    }
}
