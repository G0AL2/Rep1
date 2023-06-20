package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.7K  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7K {
    public Handler A00;

    public C7K(Looper looper) {
        this.A00 = new Handler(looper);
    }

    public final void A00(C7L c7l) {
        this.A00.post(c7l);
    }

    public final void A01(C7L c7l) {
        this.A00.removeCallbacks(c7l);
    }

    public final boolean A02(C7L c7l, long j10) {
        return this.A00.postDelayed(c7l, j10);
    }
}
