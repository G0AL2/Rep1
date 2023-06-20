package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;

/* loaded from: assets/audience_network.dex */
public class IH extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C1313Um A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IH(C1313Um c1313Um, String str, ConditionVariable conditionVariable) {
        super(str);
        this.A01 = c1313Um;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (L0.A02(this)) {
            return;
        }
        try {
            synchronized (this.A01) {
                this.A00.open();
                this.A01.A04();
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
