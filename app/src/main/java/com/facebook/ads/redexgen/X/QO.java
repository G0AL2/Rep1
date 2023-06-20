package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class QO implements View.OnClickListener {
    public final /* synthetic */ C07326p A00;

    public QO(C07326p c07326p) {
        this.A00 = c07326p;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View v10;
        C1036Jp c1036Jp;
        C1400Xy c1400Xy;
        QK videoView;
        QK videoView2;
        QK videoView3;
        C1036Jp c1036Jp2;
        if (L0.A02(this)) {
            return;
        }
        try {
            v10 = this.A00.getVideoView();
            if (v10 != null) {
                c1036Jp = this.A00.A02;
                if (c1036Jp != null) {
                    c1036Jp2 = this.A00.A02;
                    c1036Jp2.A02(EnumC1035Jo.A0p, null);
                }
                c1400Xy = this.A00.A01;
                c1400Xy.A0D().A2t();
                int[] iArr = QP.A00;
                videoView = this.A00.getVideoView();
                int i10 = iArr[videoView.getState().ordinal()];
                if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                    videoView2 = this.A00.getVideoView();
                    videoView2.A0b(Q6.A04, 12);
                } else if (i10 == 5) {
                    videoView3 = this.A00.getVideoView();
                    videoView3.A0e(true, 8);
                }
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
