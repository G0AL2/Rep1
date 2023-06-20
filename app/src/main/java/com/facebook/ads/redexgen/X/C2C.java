package com.facebook.ads.redexgen.X;

import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.2C  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2C implements Serializable {
    public C2B A00;
    public C2B A01;

    public C2C() {
        this(0.5d, 0.5d);
    }

    public C2C(double d10) {
        this(d10, 0.5d);
    }

    public C2C(double d10, double d11) {
        this.A00 = new C2B(d10);
        this.A01 = new C2B(d11);
        A02();
    }

    public final C2B A00() {
        return this.A00;
    }

    public final C2B A01() {
        return this.A01;
    }

    public final void A02() {
        this.A00.A06();
        this.A01.A06();
    }

    public final void A03() {
        this.A00.A07();
        this.A01.A07();
    }

    public final void A04(double d10, double d11) {
        this.A00.A08(d10, d11);
    }

    public final void A05(double d10, double d11) {
        this.A01.A08(d10, d11);
    }
}
