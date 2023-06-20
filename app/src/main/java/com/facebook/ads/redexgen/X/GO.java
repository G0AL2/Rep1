package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class GO implements InterfaceC1724eY {
    public final List<InterfaceC1725eZ> A00 = new ArrayList();

    @Override // com.facebook.ads.redexgen.X.InterfaceC1724eY
    public final InterfaceC1725eZ A5Y(int i10) {
        return this.A00.get(i10);
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC1725eZ> iterator() {
        return this.A00.iterator();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1724eY
    public final int size() {
        return this.A00.size();
    }
}
