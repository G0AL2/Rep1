package com.facebook.ads.redexgen.X;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public final class Q5 extends ContentObserver {
    public final OI A00;

    public Q5(Handler handler, OI oi) {
        super(handler);
        this.A00 = oi;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.A00.A0Z();
    }
}
