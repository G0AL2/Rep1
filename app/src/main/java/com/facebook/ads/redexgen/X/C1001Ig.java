package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Ig  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1001Ig implements QT {
    public int A00;
    @Nullable
    public ValueAnimator A01;
    public QS A02 = QS.A05;
    public final int A03;
    public final int A04;
    public final View A05;

    public C1001Ig(View view, int i10, int i11, int i12) {
        this.A05 = view;
        this.A03 = i10;
        this.A00 = i11;
        this.A04 = i12;
    }

    private ValueAnimator A00(int i10, int i11, View view) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, i11);
        ofInt.setDuration(this.A03);
        ofInt.addUpdateListener(new QW(this, view));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z10) {
        if (z10) {
            this.A02 = QS.A06;
            this.A01 = A00(this.A00, this.A04, this.A05);
            this.A01.addListener(new QV(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        MS.A0H(this.A05);
        this.A02 = QS.A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z10) {
        MS.A0L(this.A05);
        if (z10) {
            this.A02 = QS.A04;
            this.A01 = A00(this.A04, this.A00, this.A05);
            this.A01.addListener(new QU(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = QS.A03;
    }

    @Override // com.facebook.ads.redexgen.X.QT
    public final void A3M(boolean z10, boolean z11) {
        if (z11) {
            A07(z10);
        } else {
            A08(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QT
    public final QS A7X() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.QT
    public final void cancel() {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
