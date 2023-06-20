package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.b7  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1523b7 extends AbstractC07256i implements InterfaceC07206d {
    public C6S A00;
    public final C6C A01;
    public final Map<Integer, C07356s> A02;

    @SuppressLint({"UseSparseArrays"})
    public C1523b7(Context context, C6C c6c) {
        super(context, c6c);
        this.A02 = new HashMap();
        this.A01 = c6c;
    }

    public final void A02(C07356s c07356s) {
        this.A02.put(Integer.valueOf(c07356s.A00()), c07356s);
    }

    public final void A03(EnumC07396w enumC07396w, Context context) {
        this.A00 = C6S.A00(context, this.A01);
        this.A00.A04(this.A02, enumC07396w);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07206d
    public final void AD6() {
        C6S c6s = this.A00;
        if (c6s != null) {
            c6s.A03();
        }
    }
}
