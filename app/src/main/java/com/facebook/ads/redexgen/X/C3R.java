package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.3R  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3R {
    public static final C3Q A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A00 = new FG();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A00 = new C1596cJ();
        } else {
            A00 = new C3Q();
        }
    }

    public static int A00(AccessibilityEvent accessibilityEvent) {
        return A00.A00(accessibilityEvent);
    }

    public static void A01(AccessibilityEvent accessibilityEvent, int i10) {
        A00.A01(accessibilityEvent, i10);
    }
}
