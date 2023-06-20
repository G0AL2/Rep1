package com.facebook.ads.redexgen.X;

import android.os.SystemClock;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: assets/audience_network.dex */
public final class GP implements SA {
    @Override // com.facebook.ads.redexgen.X.SA
    public final long A9j() {
        return SystemClock.elapsedRealtime();
    }
}
