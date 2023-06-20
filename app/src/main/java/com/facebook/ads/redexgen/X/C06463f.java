package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(19)
/* renamed from: com.facebook.ads.redexgen.X.3f  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06463f {
    public static Object A00(final InterfaceC06453e interfaceC06453e) {
        return new AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.3d
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
                return (AccessibilityNodeInfo) InterfaceC06453e.this.A4D(i10);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
                return InterfaceC06453e.this.A5O(str, i10);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo findFocus(int i10) {
                return (AccessibilityNodeInfo) InterfaceC06453e.this.A5P(i10);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i10, int i11, Bundle bundle) {
                return InterfaceC06453e.this.AD9(i10, i11, bundle);
            }
        };
    }
}
