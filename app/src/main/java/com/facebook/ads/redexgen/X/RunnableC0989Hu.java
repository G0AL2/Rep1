package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Hu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class RunnableC0989Hu implements Runnable {
    public final InterfaceC0988Ht A00;

    public RunnableC0989Hu(InterfaceC0988Ht interfaceC0988Ht) {
        this.A00 = interfaceC0988Ht;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.ABM();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
