package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.7z  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C07617z extends AbstractC1051Ke {
    public final /* synthetic */ KX A00;

    public C07617z(KX kx) {
        this.A00 = kx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC07859c
    /* renamed from: A00 */
    public final void A03(C1060Kp c1060Kp) {
        QK qk;
        boolean z10;
        Handler handler;
        boolean A0D;
        boolean z11;
        Handler handler2;
        int i10;
        qk = this.A00.A01;
        if (qk == null) {
            return;
        }
        z10 = this.A00.A03;
        if (z10 || c1060Kp.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A05;
        handler.removeCallbacksAndMessages(null);
        A0D = this.A00.A0D(QS.A05);
        if (A0D) {
            this.A00.A03();
            this.A00.A06(true, false);
        }
        z11 = this.A00.A02;
        if (!z11) {
            return;
        }
        handler2 = this.A00.A05;
        KY ky = new KY(this);
        i10 = this.A00.A00;
        handler2.postDelayed(ky, i10);
    }
}
