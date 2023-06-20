package com.facebook.ads.redexgen.X;

import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* loaded from: assets/audience_network.dex */
public class FG extends C1596cJ {
    @Override // com.facebook.ads.redexgen.X.C3Q
    public final int A00(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @Override // com.facebook.ads.redexgen.X.C3Q
    public final void A01(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentChangeTypes(i10);
    }
}
