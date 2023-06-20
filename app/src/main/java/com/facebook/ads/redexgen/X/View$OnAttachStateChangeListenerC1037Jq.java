package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Jq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnAttachStateChangeListenerC1037Jq implements View.OnAttachStateChangeListener {
    public final /* synthetic */ EnumC1035Jo A00;
    public final /* synthetic */ C1036Jp A01;

    public View$OnAttachStateChangeListenerC1037Jq(C1036Jp c1036Jp, EnumC1035Jo enumC1035Jo) {
        this.A01 = c1036Jp;
        this.A00 = enumC1035Jo;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A02(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
