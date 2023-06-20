package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* loaded from: assets/audience_network.dex */
public class TP implements InterfaceC1181Pj {
    public final /* synthetic */ TO A00;

    public TP(TO to) {
        this.A00 = to;
    }

    public /* synthetic */ TP(TO to, TV tv) {
        this(to);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1181Pj
    public final void AAQ() {
        this.A00.A0X(true);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1181Pj
    public final void AAz() {
        AnonymousClass18 anonymousClass18;
        InterfaceC1110Mq interfaceC1110Mq;
        NI ni;
        InterfaceC1028Jh interfaceC1028Jh;
        AnonymousClass18 anonymousClass182;
        C1183Pl c1183Pl;
        C1183Pl c1183Pl2;
        AnonymousClass18 anonymousClass183;
        C1400Xy c1400Xy;
        anonymousClass18 = this.A00.A0D;
        if (!TextUtils.isEmpty(anonymousClass18.A0U())) {
            interfaceC1028Jh = this.A00.A0H;
            anonymousClass182 = this.A00.A0D;
            String A0U = anonymousClass182.A0U();
            OG og = new OG();
            c1183Pl = this.A00.A06;
            OG A03 = og.A03(c1183Pl.getViewabilityChecker());
            c1183Pl2 = this.A00.A06;
            interfaceC1028Jh.A93(A0U, A03.A02(c1183Pl2.getTouchDataRecorder()).A05());
            anonymousClass183 = this.A00.A0D;
            AnonymousClass29.A00(anonymousClass183.A0W());
            c1400Xy = this.A00.A0G;
            c1400Xy.A0D().A2Y();
        }
        interfaceC1110Mq = this.A00.A0L;
        ni = this.A00.A0M;
        interfaceC1110Mq.A3s(ni.A6m());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1181Pj
    public final void ABK() {
        InterfaceC1110Mq interfaceC1110Mq;
        NI ni;
        interfaceC1110Mq = this.A00.A0L;
        ni = this.A00.A0M;
        interfaceC1110Mq.A3s(ni.A6Z());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1181Pj
    public final void ACu() {
        InterfaceC1110Mq interfaceC1110Mq;
        interfaceC1110Mq = this.A00.A0L;
        interfaceC1110Mq.AAF(15);
    }
}
