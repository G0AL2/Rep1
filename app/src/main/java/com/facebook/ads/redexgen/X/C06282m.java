package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.2m  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C06282m {
    public static final View.AccessibilityDelegate A01;
    public static final C06272l A02;
    public final View.AccessibilityDelegate A00 = A02.A00(this);

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            A02 = new C1602cR();
        } else {
            A02 = new C06272l();
        }
        A01 = new View.AccessibilityDelegate();
    }

    public final View.AccessibilityDelegate A00() {
        return this.A00;
    }

    public final C3Z A01(View view) {
        return A02.A01(A01, view);
    }

    public final void A02(View view, int i10) {
        A01.sendAccessibilityEvent(view, i10);
    }

    public final void A03(View view, AccessibilityEvent accessibilityEvent) {
        A01.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final void A04(View view, AccessibilityEvent accessibilityEvent) {
        A01.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public final boolean A05(View view, AccessibilityEvent accessibilityEvent) {
        return A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean A06(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return A01.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void A07(View view, AccessibilityEvent accessibilityEvent) {
        A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void A08(View view, C3X c3x) {
        A01.onInitializeAccessibilityNodeInfo(view, c3x.A0M());
    }

    public boolean A09(View view, int i10, Bundle bundle) {
        return A02.A02(A01, view, i10, bundle);
    }
}
