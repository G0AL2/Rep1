package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.9D  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9D extends SQ {
    @Nullable
    public AbstractC1151Of A00;
    public final ImageView A01;
    public final AnonymousClass57 A02;
    public final AtomicBoolean A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;

    public C9D(C1400Xy c1400Xy, NI ni, InterfaceC1028Jh interfaceC1028Jh, AnonymousClass18 anonymousClass18, C7U c7u, InterfaceC1110Mq interfaceC1110Mq) {
        super(c1400Xy, ni, interfaceC1028Jh, anonymousClass18, c7u, interfaceC1110Mq);
        this.A02 = new SP(this);
        this.A04 = new AtomicBoolean(false);
        this.A03 = new AtomicBoolean(false);
        this.A05 = new AtomicBoolean(false);
        this.A01 = new ImageView(getContext());
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setAdjustViewBounds(true);
        new T3(this.A01, super.A03).A05(super.A01.A0O().A0D().A00(), super.A01.A0O().A0D().A01()).A06(new SO(this)).A07(super.A01.A0O().A0D().A07());
    }

    private AbstractC1151Of A01(int i10) {
        if (this.A01.getParent() != null) {
            MS.A0J(this.A01);
        }
        return C1152Og.A00(new C1154Oi(super.A03, super.A04, this.A08, super.A01, this.A01, this.A0A, this.A06).A0E(this.A07.getToolbarHeight()).A0H(this.A07).A0D(i10).A0J(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A04.get() && this.A03.get()) {
            A0P();
        }
    }

    private void A06(int i10) {
        MS.A0J(this.A00);
        this.A00 = A01(i10);
        C1K colors = this.A00.getColors();
        AbstractC1151Of abstractC1151Of = this.A00;
        boolean z10 = true;
        MS.A0M(this, colors.A07(abstractC1151Of != null && (abstractC1151Of.A0c() || (this.A00 instanceof AbstractC1272Sw))));
        this.A07.A04(colors, this.A00.A0c());
        addView(this.A00, 0, SQ.A0D);
        AbstractC1151Of abstractC1151Of2 = this.A00;
        setUpFullscreenMode((abstractC1151Of2 == null || !abstractC1151Of2.A0c()) ? false : false);
    }

    @Override // com.facebook.ads.redexgen.X.SQ
    public final void A0Q() {
        MS.A0L(this.A00);
        MS.A0L(this.A07);
        this.A03.set(true);
        A05();
        int A03 = super.A01.A0O().A0D().A03();
        if (A03 > 0) {
            AbstractC1151Of abstractC1151Of = this.A00;
            if (abstractC1151Of != null) {
                abstractC1151Of.A0a();
            }
            A0R(A03, new SN(this));
            return;
        }
        this.A05.set(true);
        this.A07.setToolbarActionMode(getCloseButtonStyle());
    }

    @Override // com.facebook.ads.redexgen.X.SQ
    public final void A0S(AnonymousClass59 anonymousClass59) {
        anonymousClass59.A0K(this.A02);
        A06(anonymousClass59.A0H().getResources().getConfiguration().orientation);
        addView(this.A07, new FrameLayout.LayoutParams(-1, this.A07.getToolbarHeight()));
        MS.A0H(this.A00);
        MS.A0H(this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.SQ
    public final boolean A0T() {
        AbstractC1151Of abstractC1151Of = this.A00;
        return abstractC1151Of != null && abstractC1151Of.A0d(false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void ABj(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void AC8(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        AbstractC1151Of abstractC1151Of = this.A00;
        if (abstractC1151Of != null) {
            return abstractC1151Of.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.SQ, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A01.A0O().A0N()) {
            A06(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SQ, com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void onDestroy() {
        if (JR.A1I(super.A03)) {
            super.A03.A09().AFF(this.A01);
        }
        AbstractC1151Of abstractC1151Of = this.A00;
        if (abstractC1151Of != null) {
            abstractC1151Of.A0W();
        }
        super.onDestroy();
    }
}
