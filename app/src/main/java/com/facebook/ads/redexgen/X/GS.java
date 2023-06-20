package com.facebook.ads.redexgen.X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public class GS implements R3 {
    public final /* synthetic */ C06503j A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public GS(C06503j c06503j, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        this.A00 = c06503j;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = countDownLatch;
    }

    @Override // com.facebook.ads.redexgen.X.R3
    public final void AAM(R1 r12) {
        C06503j.A06(r12.A5p(), this.A03, this.A02);
        this.A01.countDown();
    }

    @Override // com.facebook.ads.redexgen.X.R3
    public final void AAj(Exception exc) {
        this.A02.set(exc);
        this.A01.countDown();
    }
}
