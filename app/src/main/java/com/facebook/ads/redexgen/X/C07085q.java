package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.5q  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07085q {
    public final long A00;
    public final EnumC07075p A01;
    public final String A02;
    public final boolean A03;

    public C07085q(String str, boolean z10, EnumC07075p enumC07075p) {
        this(str, z10, enumC07075p, System.currentTimeMillis());
    }

    public C07085q(String str, boolean z10, EnumC07075p enumC07075p, long j10) {
        this.A02 = str;
        this.A03 = z10;
        this.A01 = enumC07075p;
        this.A00 = j10;
    }

    public static C07085q A00() {
        return new C07085q("", true, EnumC07075p.A06, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC07075p A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
