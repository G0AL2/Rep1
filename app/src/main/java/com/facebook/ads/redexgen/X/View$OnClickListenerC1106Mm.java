package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC1106Mm implements View.OnClickListener {
    public final /* synthetic */ C1U A00;
    public final /* synthetic */ C1036Jp A01;
    public final /* synthetic */ C1107Mn A02;
    public final /* synthetic */ InterfaceC1110Mq A03;
    public final /* synthetic */ String A04;

    public View$OnClickListenerC1106Mm(C1107Mn c1107Mn, C1036Jp c1036Jp, InterfaceC1110Mq interfaceC1110Mq, String str, C1U c1u) {
        this.A02 = c1107Mn;
        this.A01 = c1036Jp;
        this.A03 = interfaceC1110Mq;
        this.A04 = str;
        this.A00 = c1u;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2D c2d;
        C1400Xy c1400Xy;
        C1400Xy c1400Xy2;
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A01.A02(EnumC1035Jo.A0A, null);
            c2d = this.A02.A02;
            c1400Xy = this.A02.A03;
            if (c2d.A0O(c1400Xy.A00(), true)) {
                this.A03.A8j(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                LZ lz = new LZ();
                c1400Xy2 = this.A02.A03;
                LZ.A0E(lz, c1400Xy2, C1070La.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
