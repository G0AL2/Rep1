package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.b6  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1522b6 extends AbstractC07256i {
    public final List<C07356s> A00;

    public C1522b6(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = new ArrayList();
    }

    public final List<C07356s> A02() {
        return Collections.unmodifiableList(this.A00);
    }

    public final void A03(C07356s c07356s) {
        if (c07356s.A03().contains(EnumC07426z.A0B)) {
            this.A00.add(c07356s);
        }
    }

    public final void A04(EnumC07396w enumC07396w) {
        A01(enumC07396w, this.A00);
    }
}
