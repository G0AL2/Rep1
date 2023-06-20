package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.0s  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05830s {
    public static InterfaceC05780n A00;

    @Nullable
    public final InterfaceC05780n A00(C1400Xy c1400Xy, AdPlacementType adPlacementType) {
        InterfaceC05780n interfaceC05780n = A00;
        if (interfaceC05780n != null) {
            return interfaceC05780n;
        }
        int i10 = C05820r.A00[adPlacementType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return null;
                        }
                        return new C0927Fi();
                    }
                    return new C0935Fq(c1400Xy);
                }
                return new C1670da(c1400Xy);
            }
            return new C1672dc();
        }
        return new C1673dd();
    }
}
