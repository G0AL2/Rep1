package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.c2  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1579c2 implements InterfaceC06804o {
    public final /* synthetic */ C4T A00;

    public C1579c2(C4T c4t) {
        this.A00 = c4t;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06804o
    public final View A5z(int i10) {
        return this.A00.A0t(i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06804o
    public final int A61(View view) {
        return this.A00.A0j(view) + ((C4U) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06804o
    public final int A62(View view) {
        return this.A00.A0o(view) - ((C4U) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06804o
    public final int A77() {
        return this.A00.A0X() - this.A00.A0d();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06804o
    public final int A78() {
        return this.A00.A0g();
    }
}
