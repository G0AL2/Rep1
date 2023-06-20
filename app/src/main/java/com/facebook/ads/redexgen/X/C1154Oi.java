package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Oi */
/* loaded from: assets/audience_network.dex */
public class C1154Oi {
    @Nullable
    public View A02;
    @Nullable
    public UB A03;
    @Nullable
    public AbstractC1109Mp A04;
    @Nullable
    public C1018Ix A05;
    @Nullable
    public final View A06;
    public final AnonymousClass18 A07;
    public final C1400Xy A08;
    public final InterfaceC1028Jh A09;
    public final MK A0A;
    public final InterfaceC1110Mq A0B;
    public final C1220Qw A0C;
    public int A01 = 0;
    public int A00 = 1;

    public C1154Oi(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, InterfaceC1110Mq interfaceC1110Mq, AnonymousClass18 anonymousClass18, @Nullable View view, C1220Qw c1220Qw, MK mk) {
        this.A08 = c1400Xy;
        this.A09 = interfaceC1028Jh;
        this.A0B = interfaceC1110Mq;
        this.A07 = anonymousClass18;
        this.A06 = view;
        this.A0C = c1220Qw;
        this.A0A = mk;
    }

    public final C1154Oi A0D(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C1154Oi A0E(int i10) {
        this.A01 = i10;
        return this;
    }

    public final C1154Oi A0F(View view) {
        this.A02 = view;
        return this;
    }

    public final C1154Oi A0G(UB ub2) {
        this.A03 = ub2;
        return this;
    }

    public final C1154Oi A0H(AbstractC1109Mp abstractC1109Mp) {
        this.A04 = abstractC1109Mp;
        return this;
    }

    public final C1154Oi A0I(C1018Ix c1018Ix) {
        this.A05 = c1018Ix;
        return this;
    }

    public final C1155Oj A0J() {
        return new C1155Oj(this);
    }
}
