package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class S1 extends AbstractC1219Qv {
    public final /* synthetic */ C8K A00;

    public S1(C8K c8k) {
        this.A00 = c8k;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1219Qv
    public final void A02() {
        MK mk;
        MK mk2;
        String str;
        C1220Qw c1220Qw;
        MK mk3;
        C1653dJ c1653dJ;
        InterfaceC1028Jh interfaceC1028Jh;
        String str2;
        C1400Xy c1400Xy;
        C1653dJ c1653dJ2;
        mk = this.A00.A0D;
        if (!mk.A07()) {
            C8K c8k = this.A00;
            mk2 = c8k.A0D;
            c8k.setImpressionRecordingFlag(mk2);
            str = this.A00.A0A;
            if (!TextUtils.isEmpty(str)) {
                OG og = new OG();
                c1220Qw = this.A00.A09;
                OG A03 = og.A03(c1220Qw);
                mk3 = this.A00.A0D;
                OG A02 = A03.A02(mk3);
                c1653dJ = ((TW) this.A00).A08;
                Map<String, String> A05 = A02.A04(c1653dJ.A0X()).A05();
                interfaceC1028Jh = ((TW) this.A00).A0A;
                str2 = this.A00.A0A;
                interfaceC1028Jh.A93(str2, A05);
                c1400Xy = this.A00.A0C;
                c1400Xy.A0D().A2Y();
                c1653dJ2 = this.A00.A03;
                AnonymousClass29.A00(c1653dJ2.A0W());
            }
        }
    }
}
