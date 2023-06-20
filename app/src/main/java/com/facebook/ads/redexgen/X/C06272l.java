package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: com.facebook.ads.redexgen.X.2l  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C06272l {
    public View.AccessibilityDelegate A00(final C06282m c06282m) {
        return new View.AccessibilityDelegate() { // from class: com.facebook.ads.redexgen.X.2k
            @Override // android.view.View.AccessibilityDelegate
            public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                return c06282m.A05(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                c06282m.A07(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                c06282m.A08(view, C3X.A01(accessibilityNodeInfo));
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                c06282m.A03(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return c06282m.A06(viewGroup, view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void sendAccessibilityEvent(View view, int i10) {
                c06282m.A02(view, i10);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                c06282m.A04(view, accessibilityEvent);
            }
        };
    }

    public C3Z A01(View.AccessibilityDelegate accessibilityDelegate, View view) {
        return null;
    }

    public boolean A02(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
        return false;
    }
}
