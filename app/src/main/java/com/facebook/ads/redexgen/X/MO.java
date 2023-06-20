package com.facebook.ads.redexgen.X;

import com.facebook.ads.VideoStartReason;

/* loaded from: assets/audience_network.dex */
public final class MO {
    public static Q6 A00(VideoStartReason videoStartReason) {
        int i10 = MN.A00[videoStartReason.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return Q6.A03;
                }
                return Q6.A04;
            }
            return Q6.A03;
        }
        return Q6.A02;
    }
}
