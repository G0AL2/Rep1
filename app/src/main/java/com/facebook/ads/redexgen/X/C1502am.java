package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.am  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1502am implements InterfaceC07386v {
    public final /* synthetic */ C1488aY A00;

    public C1502am(C1488aY c1488aY) {
        this.A00 = c1488aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() throws Throwable {
        C6C c6c;
        C7F c7f;
        c6c = this.A00.A02;
        if (c6c.A0a() != EnumC07426z.A0I) {
            c7f = this.A00.A03;
            String A06 = c7f.A06(10010);
            if (A06 != null) {
                return this.A00.A08(A06);
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A04);
    }
}
