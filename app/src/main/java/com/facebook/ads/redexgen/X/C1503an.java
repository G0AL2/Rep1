package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.an  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1503an implements InterfaceC07386v {
    public static String[] A01 = {"hvm87xlnXDULJgpudJIAxjipYcLfVpPe", "aPn41y0iNcbQ3vA5A69njqeDstAsTpsV", "WXmwgMFdLW61FUxTxJC7XlBGpuRVL7Wu", "ePkGYIfh56SCQIxOGTOw2FZrMqM6oOvD", "H4G3VitdwZHOwCvFNAwNX1rKXwUNte3T", "QqBVensdyxYwCHnIBjshd9TsYmlVQcVc", "Npnx1Hqps9YG5SIKMksWN5UpsP86zlug", "K4PmfDIjqE3AfePNsovy4"};
    public final /* synthetic */ C1488aY A00;

    public C1503an(C1488aY c1488aY) {
        this.A00 = c1488aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() throws Exception {
        C7F c7f;
        c7f = this.A00.A03;
        String A06 = c7f.A06(10005);
        if (A06 != null) {
            C1488aY c1488aY = this.A00;
            if (A01[7].length() != 21) {
                throw new RuntimeException();
            }
            A01[7] = "XG8OcIRWX82QEKbSmFw2M";
            return c1488aY.A08(A06);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
