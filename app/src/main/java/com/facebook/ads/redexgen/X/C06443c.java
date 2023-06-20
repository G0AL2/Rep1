package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(16)
/* renamed from: com.facebook.ads.redexgen.X.3c  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06443c {
    public static Object A00(final InterfaceC06433b interfaceC06433b) {
        return new AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.3a
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
                return (AccessibilityNodeInfo) InterfaceC06433b.this.A4D(i10);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
                return InterfaceC06433b.this.A5O(str, i10);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i10, int i11, Bundle bundle) {
                return InterfaceC06433b.this.AD9(i10, i11, bundle);
            }
        };
    }
}
