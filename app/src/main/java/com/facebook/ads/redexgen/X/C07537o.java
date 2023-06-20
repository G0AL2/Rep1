package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.7o  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C07537o extends AbstractC1051Ke {
    public final /* synthetic */ KT A00;

    public C07537o(KT kt) {
        this.A00 = kt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC07859c
    /* renamed from: A00 */
    public final void A03(C1060Kp c1060Kp) {
        QK qk;
        Handler handler;
        qk = this.A00.A01;
        if (qk == null || c1060Kp.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new QH(this));
    }
}
