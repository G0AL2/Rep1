package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.6F  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6F {
    public final List<C6E> A00 = new ArrayList();

    public final void A00(C6E c6e) {
        this.A00.add(c6e);
    }

    public final void A01(EnumC07396w enumC07396w) {
        for (C6E c6e : this.A00) {
            c6e.AFL(enumC07396w);
        }
    }
}
