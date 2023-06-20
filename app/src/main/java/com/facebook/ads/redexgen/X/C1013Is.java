package com.facebook.ads.redexgen.X;

import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Is  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1013Is implements Comparator<C1014It> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00 */
    public final int compare(C1014It c1014It, C1014It c1014It2) {
        if (c1014It.A00 < c1014It2.A00) {
            return -1;
        }
        return c1014It2.A00 < c1014It.A00 ? 1 : 0;
    }
}
