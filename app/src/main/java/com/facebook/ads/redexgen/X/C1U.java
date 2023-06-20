package com.facebook.ads.redexgen.X;

import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.1U  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1U implements Serializable {
    public static final long serialVersionUID = 351643298236575728L;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C1U(C1T c1t) {
        String str;
        String str2;
        String str3;
        String str4;
        str = c1t.A02;
        this.A02 = str;
        str2 = c1t.A01;
        this.A01 = str2;
        str3 = c1t.A00;
        this.A00 = str3;
        str4 = c1t.A03;
        this.A03 = str4;
    }

    public final String A00() {
        return this.A00;
    }

    public final String A01() {
        return this.A01;
    }

    public final String A02() {
        return this.A02;
    }

    public final String A03() {
        return this.A03;
    }
}
