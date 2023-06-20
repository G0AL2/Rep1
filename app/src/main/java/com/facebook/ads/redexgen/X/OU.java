package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.RewardData;

/* loaded from: assets/audience_network.dex */
public final class OU extends FrameLayout {
    public static String[] A07 = {"Lu0oG19N", "JNY", "Ev6F9eDhg42RHlCeRuJfEtiFO07AluFn", "qSbaO4FE34QcNqD1YWxCxyT8wr5s9kWw", "hZddA1hSD7Y", "v9TnLSaOxYneacolptRVdRHaZQ0ab06L", "iyW9tyIIQvF7WQz3LOxNHXxa074IcWbN", "vzh"};
    @Nullable
    public AbstractC1109Mp A00;
    public final AnonymousClass18 A01;
    public final C1400Xy A02;
    public final InterfaceC1110Mq A03;
    public final OT A04;
    @Nullable
    public final QK A05;
    public final View[] A06;

    public OU(C1155Oj c1155Oj, AnonymousClass18 anonymousClass18, @Nullable QK qk, C1018Ix c1018Ix, OJ oj, InterfaceC1110Mq interfaceC1110Mq, OT ot) {
        this(c1155Oj, anonymousClass18, qk, interfaceC1110Mq, ot, c1018Ix, oj);
    }

    public OU(C1155Oj c1155Oj, AnonymousClass18 anonymousClass18, @Nullable QK qk, InterfaceC1110Mq interfaceC1110Mq, OT ot, View... viewArr) {
        this(c1155Oj.A05(), c1155Oj.A08(), anonymousClass18, qk, interfaceC1110Mq, ot, viewArr);
    }

    public OU(C1400Xy c1400Xy, @Nullable AbstractC1109Mp abstractC1109Mp, AnonymousClass18 anonymousClass18, @Nullable QK qk, InterfaceC1110Mq interfaceC1110Mq, OT ot, View... viewArr) {
        super(c1400Xy);
        this.A02 = c1400Xy;
        this.A00 = abstractC1109Mp;
        this.A01 = anonymousClass18;
        this.A06 = viewArr;
        this.A03 = interfaceC1110Mq;
        this.A05 = qk;
        this.A04 = ot;
        A03();
    }

    private void A03() {
        String title;
        RewardData A0M = this.A01.A0M();
        if (A0M == null) {
            title = this.A01.A0Q().A05();
        } else {
            title = this.A01.A0Q().A06(A0M.getCurrency(), A0M.getQuantity());
        }
        C1119Mz c1119Mz = new C1119Mz(this.A02, -1, -16777216, title, null, this.A01.A0Q().A04(), this.A01.A0Q().A03(), C1095Mb.A01(EnumC1094Ma.REWARD_ICON));
        c1119Mz.A02.setOnClickListener(new OR(this));
        c1119Mz.A01.setOnClickListener(new OS(this));
        addView(c1119Mz, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        QK qk = this.A05;
        if (qk != null) {
            qk.A0a(Q1.A07);
        }
        this.A04.A9x();
        if (!this.A01.A0O().A0O()) {
            this.A01.A0h(this.A03);
        }
    }

    public final void A07(ViewGroup viewGroup) {
        View[] viewArr;
        QK qk = this.A05;
        if (qk != null && !qk.A0j()) {
            this.A05.A0f(false, false, 11);
            MS.A0N(this.A05, 4);
        }
        AbstractC1109Mp abstractC1109Mp = this.A00;
        String[] strArr = A07;
        if (strArr[7].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A07[0] = "vGH3jzSu";
        if (abstractC1109Mp != null) {
            MS.A0H(abstractC1109Mp);
        }
        for (View view : this.A06) {
            view.clearAnimation();
            MS.A0N(view, 4);
        }
        viewGroup.addView(this, new RelativeLayout.LayoutParams(-1, -1));
        this.A04.ABQ();
    }
}
