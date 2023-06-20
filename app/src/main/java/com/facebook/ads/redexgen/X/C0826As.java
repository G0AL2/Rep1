package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.As  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0826As {
    public int A00;
    public int A01;
    public Handler A03;
    public Object A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC0824Aq A0A;
    public final InterfaceC0825Ar A0B;
    public final B1 A0C;
    public long A02 = -9223372036854775807L;
    public boolean A05 = true;

    public C0826As(InterfaceC0824Aq interfaceC0824Aq, InterfaceC0825Ar interfaceC0825Ar, B1 b12, int i10, Handler handler) {
        this.A0A = interfaceC0824Aq;
        this.A0B = interfaceC0825Ar;
        this.A0C = b12;
        this.A03 = handler;
        this.A01 = i10;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final Handler A03() {
        return this.A03;
    }

    public final InterfaceC0825Ar A04() {
        return this.A0B;
    }

    public final C0826As A05() {
        IK.A04(!this.A09);
        if (this.A02 == -9223372036854775807L) {
            IK.A03(this.A05);
        }
        this.A09 = true;
        this.A0A.AET(this);
        return this;
    }

    public final C0826As A06(int i10) {
        IK.A04(!this.A09);
        this.A00 = i10;
        return this;
    }

    public final C0826As A07(@Nullable Object obj) {
        IK.A04(!this.A09);
        this.A04 = obj;
        return this;
    }

    public final B1 A08() {
        return this.A0C;
    }

    public final Object A09() {
        return this.A04;
    }

    public final synchronized void A0A(boolean z10) {
        this.A07 |= z10;
        this.A08 = true;
        notifyAll();
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final synchronized boolean A0C() throws InterruptedException {
        IK.A04(this.A09);
        IK.A04(this.A03.getLooper().getThread() != Thread.currentThread());
        while (!this.A08) {
            wait();
        }
        return this.A07;
    }

    public final synchronized boolean A0D() {
        return this.A06;
    }
}
