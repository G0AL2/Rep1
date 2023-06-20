package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
/* renamed from: com.facebook.ads.redexgen.X.cR  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1602cR extends C06272l {
    @Override // com.facebook.ads.redexgen.X.C06272l
    public final View.AccessibilityDelegate A00(final C06282m c06282m) {
        return new View.AccessibilityDelegate() { // from class: com.facebook.ads.redexgen.X.2j
            public static String[] A02 = {"5TXwkxGOky4JO26BdMoLZorZ75Qh7TJ1", "TGpCIVKfg9q9VkptB3w2PfFUtUXuMPxH", "XWnogg3sW", "LoblWG2nky8IldTW7marNA4rqywTihhk", "", "za5KD6H2U", "Ka0OyPk3mlOgfUpq6xId3QQILfS23GTN", "DN7QTk2L5QCC7wBdOwuQ1Nom6iZb"};

            @Override // android.view.View.AccessibilityDelegate
            public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                return c06282m.A05(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                C3Z A01 = c06282m.A01(view);
                if (A01 != null) {
                    Object A022 = A01.A02();
                    String[] strArr = A02;
                    if (strArr[0].charAt(14) != strArr[6].charAt(14)) {
                        A02[1] = "uCvPJ7NUfrK1Xmg35VTgFJzpSrozRbu2";
                        return (AccessibilityNodeProvider) A022;
                    }
                    throw new RuntimeException();
                }
                return null;
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
            public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
                return c06282m.A09(view, i10, bundle);
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

    @Override // com.facebook.ads.redexgen.X.C06272l
    public final C3Z A01(View.AccessibilityDelegate accessibilityDelegate, View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C3Z(accessibilityNodeProvider);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.C06272l
    public final boolean A02(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
    }
}
