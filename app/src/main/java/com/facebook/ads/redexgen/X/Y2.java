package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class Y2 extends L8 {
    public final /* synthetic */ C7M A00;
    public final /* synthetic */ C7N A01;
    public final /* synthetic */ C7U A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public Y2(C7U c7u, ArrayList arrayList, C7M c7m, C7N c7n, ArrayList arrayList2) {
        this.A02 = c7u;
        this.A03 = arrayList;
        this.A00 = c7m;
        this.A01 = c7n;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        AtomicBoolean A0D;
        C8U c8u;
        Handler handler;
        C8U c8u2;
        long j10;
        long j11;
        A0D = C7U.A0D(this.A03);
        c8u = this.A02.A04;
        if (c8u instanceof C1400Xy) {
            c8u2 = this.A02.A04;
            C1400Xy c1400Xy = (C1400Xy) c8u2;
            if (A0D.get()) {
                C0R A0D2 = c1400Xy.A0D();
                j11 = this.A02.A00;
                A0D2.A3w(MJ.A01(j11));
            } else {
                C0R A0D3 = c1400Xy.A0D();
                j10 = this.A02.A00;
                A0D3.A3v(MJ.A01(j10));
            }
        }
        handler = this.A02.A02;
        handler.post(new Y3(this, A0D));
        C7U.A0D(this.A04);
    }
}
