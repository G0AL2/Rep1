package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.applovin.mediation.MaxErrorCode;

/* loaded from: assets/audience_network.dex */
public final class F5 {
    public final InterfaceC0972Hb A00;
    public final InterfaceC0974Hd A01;
    public final InterfaceC0974Hd A02;
    public final I4 A03;
    public final C1008In A04;

    public F5(I4 i42, InterfaceC0974Hd interfaceC0974Hd) {
        this(i42, interfaceC0974Hd, null, null, null);
    }

    public F5(I4 i42, InterfaceC0974Hd interfaceC0974Hd, @Nullable InterfaceC0974Hd interfaceC0974Hd2, @Nullable InterfaceC0972Hb interfaceC0972Hb, @Nullable C1008In c1008In) {
        IK.A01(interfaceC0974Hd);
        this.A03 = i42;
        this.A02 = interfaceC0974Hd;
        this.A01 = interfaceC0974Hd2;
        this.A00 = interfaceC0972Hb;
        this.A04 = c1008In;
    }

    public final I4 A00() {
        return this.A03;
    }

    public final C1317Uq A01(boolean z10) {
        InterfaceC0975He cacheReadDataSource;
        InterfaceC0973Hc c1318Ur;
        InterfaceC0974Hd interfaceC0974Hd = this.A01;
        if (interfaceC0974Hd != null) {
            cacheReadDataSource = interfaceC0974Hd.A4E();
        } else {
            cacheReadDataSource = new V3();
        }
        if (z10) {
            return new C1317Uq(this.A03, V4.A02, cacheReadDataSource, null, 1, null);
        }
        InterfaceC0972Hb interfaceC0972Hb = this.A00;
        if (interfaceC0972Hb != null) {
            c1318Ur = interfaceC0972Hb.createDataSink();
        } else {
            c1318Ur = new C1318Ur(this.A03, 2097152L);
        }
        InterfaceC0975He A4E = this.A02.A4E();
        C1008In c1008In = this.A04;
        if (c1008In != null) {
            A4E = new C1322Uv(A4E, c1008In, MaxErrorCode.NETWORK_ERROR);
        }
        return new C1317Uq(this.A03, A4E, cacheReadDataSource, c1318Ur, 1, null);
    }

    public final C1008In A02() {
        C1008In c1008In = this.A04;
        return c1008In != null ? c1008In : new C1008In();
    }
}
