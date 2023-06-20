package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ih  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1002Ih implements QT {
    public TransitionDrawable A00;
    public TransitionDrawable A01;
    public final int A03;
    public final Drawable A04;
    public final Drawable A05;
    public final View A07;
    public final Handler A06 = new Handler();
    public QS A02 = QS.A05;

    public C1002Ih(View view, int i10, Drawable drawable, Drawable drawable2) {
        this.A03 = i10;
        this.A07 = view;
        this.A05 = drawable;
        this.A04 = drawable2;
        this.A01 = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        this.A01.setCrossFadeEnabled(true);
        this.A00 = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        this.A00.setCrossFadeEnabled(true);
        MS.A0S(this.A07, this.A01);
    }

    private void A04(boolean z10) {
        this.A06.removeCallbacksAndMessages(null);
        if (z10) {
            this.A02 = QS.A06;
            MS.A0S(this.A07, this.A00);
            this.A00.startTransition(this.A03);
            this.A06.postDelayed(new C1009Io(this), this.A03);
            return;
        }
        MS.A0S(this.A07, this.A05);
        this.A02 = QS.A05;
    }

    private void A05(boolean z10) {
        this.A06.removeCallbacksAndMessages(null);
        if (z10) {
            this.A02 = QS.A04;
            MS.A0S(this.A07, this.A01);
            this.A01.startTransition(this.A03);
            this.A06.postDelayed(new C1010Ip(this), this.A03);
            return;
        }
        MS.A0S(this.A07, this.A04);
        this.A02 = QS.A03;
    }

    @Override // com.facebook.ads.redexgen.X.QT
    public final void A3M(boolean z10, boolean z11) {
        if (z11) {
            A04(z10);
        } else {
            A05(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QT
    public final QS A7X() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.QT
    public final void cancel() {
        QS qs;
        this.A06.removeCallbacksAndMessages(null);
        this.A01.resetTransition();
        this.A00.resetTransition();
        if (this.A02 == QS.A04) {
            qs = QS.A05;
        } else {
            qs = QS.A03;
        }
        this.A02 = qs;
    }
}
