package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class TI extends NN {
    public static final int A03 = (int) (Lr.A00 * 8.0f);
    public final RelativeLayout A00;
    public final C2D A01;
    public final C1400Xy A02;

    public TI(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, String str, C1U c1u, InterfaceC1111Mr interfaceC1111Mr, InterfaceC1110Mq interfaceC1110Mq) {
        super(c1400Xy, interfaceC1028Jh, str, c1u, interfaceC1111Mr, interfaceC1110Mq);
        this.A02 = c1400Xy;
        this.A01 = C2E.A00(c1400Xy.A00());
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        MS.A0M(this.A00, -1728053248);
        this.A00.setOnClickListener(new NS(this));
    }

    public static RelativeLayout.LayoutParams A0B(boolean z10) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z10 ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A0C() {
        if (Build.VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
            MS.A0V(this, transitionSet);
            return;
        }
        MS.A0T(this);
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0L() {
        C2H reportingReason = this.A01.A0A();
        C1122Nc adChoicesView = new C1122Nc(this.A02);
        adChoicesView.setInfo(EnumC1094Ma.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        adChoicesView.setOnClickListener(new NT(this));
        C2H A0B = this.A01.A0B();
        C1122Nc c1122Nc = new C1122Nc(this.A02);
        c1122Nc.setInfo(EnumC1094Ma.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        c1122Nc.setOnClickListener(new NU(this));
        C1122Nc c1122Nc2 = new C1122Nc(this.A02);
        c1122Nc2.setInfo(EnumC1094Ma.AD_CHOICES_ICON, this.A01.A0M(), "");
        c1122Nc2.setOnClickListener(new NV(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        int i10 = A03;
        linearLayout.setPadding(i10 * 2, i10, i10 * 2, i10);
        MS.A0M(linearLayout, -1);
        if (!reportingReason.A05().isEmpty()) {
            linearLayout.addView(adChoicesView, layoutParams);
        }
        if (!A0B.A05().isEmpty()) {
            linearLayout.addView(c1122Nc, layoutParams);
        }
        linearLayout.addView(c1122Nc2, layoutParams);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0M() {
        MS.A0I(this);
        this.A00.removeAllViews();
        MS.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0N(C2H c2h, C2F c2f) {
        String A0E;
        int i10;
        if (c2f == C2F.A04) {
            return;
        }
        boolean z10 = c2f == C2F.A05;
        NL nl = new NL(this.A02, this.A0B);
        if (z10) {
            A0E = this.A01.A0F();
        } else {
            A0E = this.A01.A0E();
        }
        NL A0E2 = nl.A0I(A0E).A0H(this.A01.A0D()).A0F(c2h.A04()).A0E(z10 ? EnumC1094Ma.REPORT_AD : EnumC1094Ma.HIDE_AD);
        if (z10) {
            i10 = -552389;
        } else {
            i10 = -13272859;
        }
        NM A0M = A0E2.A0D(i10).A0G(this.A0A != null ? this.A0A.A01() : "").A0M();
        MS.A0M(A0M, -1);
        MS.A0T(this);
        this.A00.removeAllViews();
        this.A00.addView(A0M, A0B(true));
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0O(C2H c2h, C2F c2f) {
        String A0H;
        boolean z10 = c2f == C2F.A05;
        C1400Xy c1400Xy = this.A02;
        NP np = this.A0B;
        if (z10) {
            A0H = this.A01.A0L();
        } else {
            A0H = this.A01.A0H();
        }
        C1125Nf c1125Nf = new C1125Nf(c1400Xy, c2h, np, A0H, z10 ? EnumC1094Ma.REPORT_AD : EnumC1094Ma.HIDE_AD);
        c1125Nf.setClickable(true);
        MS.A0M(c1125Nf, -1);
        int i10 = A03;
        c1125Nf.setPadding(i10 * 2, i10, i10 * 2, i10);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(c1125Nf, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final boolean A0P() {
        return false;
    }
}
