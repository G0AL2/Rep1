package com.facebook.ads.redexgen.X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Si  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1258Si extends AbstractC1219Qv {
    public final /* synthetic */ A2 A00;

    public C1258Si(A2 a22) {
        this.A00 = a22;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1219Qv
    public final void A02() {
        MK mk;
        MK mk2;
        C1220Qw c1220Qw;
        MK mk3;
        InterfaceC1028Jh interfaceC1028Jh;
        AnonymousClass18 anonymousClass18;
        C1400Xy c1400Xy;
        AnonymousClass18 anonymousClass182;
        InterfaceC1110Mq interfaceC1110Mq;
        InterfaceC1110Mq interfaceC1110Mq2;
        NI ni;
        mk = this.A00.A0B;
        if (!mk.A07()) {
            mk2 = this.A00.A0B;
            mk2.A05();
            OG og = new OG();
            c1220Qw = this.A00.A0H;
            OG A03 = og.A03(c1220Qw);
            mk3 = this.A00.A0B;
            Map<String, String> A05 = A03.A02(mk3).A05();
            interfaceC1028Jh = this.A00.A08;
            anonymousClass18 = this.A00.A06;
            interfaceC1028Jh.A93(anonymousClass18.A0U(), A05);
            c1400Xy = this.A00.A07;
            c1400Xy.A0D().A2Y();
            anonymousClass182 = this.A00.A06;
            AnonymousClass29.A00(anonymousClass182.A0W());
            interfaceC1110Mq = this.A00.A0C;
            if (interfaceC1110Mq != null) {
                interfaceC1110Mq2 = this.A00.A0C;
                ni = this.A00.A0D;
                interfaceC1110Mq2.A3s(ni.A6m());
            }
        }
    }
}
