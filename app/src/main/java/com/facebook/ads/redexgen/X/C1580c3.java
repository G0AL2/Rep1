package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.c3  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1580c3 implements InterfaceC06804o {
    public final /* synthetic */ C4T A00;

    public C1580c3(C4T c4t) {
        this.A00 = c4t;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06804o
    public final View A5z(int i10) {
        return this.A00.A0t(i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06804o
    public final int A61(View view) {
        return this.A00.A0n(view) + ((C4U) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06804o
    public final int A62(View view) {
        return this.A00.A0k(view) - ((C4U) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06804o
    public final int A77() {
        return this.A00.A0h() - this.A00.A0f();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06804o
    public final int A78() {
        return this.A00.A0e();
    }
}
