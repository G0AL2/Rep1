package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.b5  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1521b5 extends AbstractC07256i {
    public final List<C07356s> A00;

    public C1521b5(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = new ArrayList();
    }

    public final void A02(C07356s c07356s) {
        if (!c07356s.A03().contains(EnumC07426z.A0B)) {
            this.A00.add(c07356s);
        }
    }

    public final void A03(EnumC07396w enumC07396w) {
        A01(enumC07396w, this.A00);
    }
}
