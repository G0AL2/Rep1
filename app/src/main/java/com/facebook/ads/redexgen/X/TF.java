package com.facebook.ads.redexgen.X;

import android.widget.ImageView;

/* loaded from: assets/audience_network.dex */
public class TF implements O1 {
    public final /* synthetic */ C1138Ns A00;

    public TF(C1138Ns c1138Ns) {
        this.A00 = c1138Ns;
    }

    @Override // com.facebook.ads.redexgen.X.O1
    public final void AAA(boolean z10) {
        boolean z11;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z11 = this.A00.A07;
        if (z11) {
            imageView = this.A00.A00;
            if (imageView != null) {
                imageView2 = this.A00.A00;
                imageView2.setEnabled(z10);
                imageView3 = this.A00.A00;
                imageView3.setAlpha(z10 ? 1.0f : 0.3f);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.O1
    public final void AAp(boolean z10) {
        boolean z11;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z11 = this.A00.A07;
        if (z11) {
            imageView = this.A00.A02;
            if (imageView != null) {
                imageView2 = this.A00.A02;
                imageView2.setEnabled(z10);
                imageView3 = this.A00.A02;
                imageView3.setAlpha(z10 ? 1.0f : 0.3f);
            }
        }
    }
}
