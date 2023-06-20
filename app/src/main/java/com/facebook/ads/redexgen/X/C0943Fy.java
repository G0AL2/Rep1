package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0943Fy extends T8 {
    public static byte[] A02;
    public final /* synthetic */ C1673dd A00;
    public final /* synthetic */ C1664dU A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-113, -68, -68, -71, -68, 106, -81, -62, -81, -83, -65, -66, -77, -72, -79, 106, -85, -83, -66, -77, -71, -72, 2, -2, -3, 0};
    }

    public C0943Fy(C1673dd c1673dd, C1664dU c1664dU) {
        this.A00 = c1673dd;
        this.A01 = c1664dU;
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final void AA3() {
        boolean z10;
        this.A00.A0E = true;
        z10 = this.A00.A0F;
        if (!z10) {
            return;
        }
        this.A00.A09();
    }

    @Override // com.facebook.ads.redexgen.X.T8, com.facebook.ads.redexgen.X.O9
    public final void AAJ(String str, Map<String, String> map) {
        C0904El c0904El;
        C0904El c0904El2;
        InterfaceC1028Jh interfaceC1028Jh;
        String str2;
        C0904El c0904El3;
        InterfaceC05860v interfaceC05860v;
        InterfaceC05860v interfaceC05860v2;
        c0904El = this.A00.A03;
        c0904El.A0D().A3Y();
        Uri A00 = C1070La.A00(str);
        if (A00(22, 4, 82).equals(A00.getScheme()) && C05720g.A04(A00.getAuthority())) {
            interfaceC05860v = this.A00.A00;
            if (interfaceC05860v != null) {
                interfaceC05860v2 = this.A00.A00;
                interfaceC05860v2.AAC(this.A00);
            }
        }
        c0904El2 = this.A00.A03;
        interfaceC1028Jh = this.A00.A04;
        AbstractC05710f A002 = C05720g.A00(c0904El2, interfaceC1028Jh, this.A01.A65(), A00, map);
        if (A002 == null) {
            return;
        }
        try {
            c0904El3 = this.A00.A03;
            c0904El3.A0D().A3V();
            A002.A0C();
        } catch (Exception e10) {
            str2 = C1673dd.A0I;
            Log.e(str2, A00(0, 22, 0), e10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.T8, com.facebook.ads.redexgen.X.O9
    public final void AAz() {
        C0904El c0904El;
        C1662dS c1662dS;
        C1662dS c1662dS2;
        C1662dS c1662dS3;
        c0904El = this.A00.A03;
        InterfaceC1690dv A0D = c0904El.A0D();
        c1662dS = this.A00.A01;
        A0D.A3Z(c1662dS != null);
        c1662dS2 = this.A00.A01;
        if (c1662dS2 == null) {
            return;
        }
        c1662dS3 = this.A00.A01;
        c1662dS3.A02();
    }

    @Override // com.facebook.ads.redexgen.X.T8, com.facebook.ads.redexgen.X.O9
    public final void ABh() {
        C0904El c0904El;
        C1662dS c1662dS;
        c0904El = this.A00.A03;
        c0904El.A0D().A3b();
        c1662dS = this.A00.A01;
        c1662dS.A07();
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final void ACu() {
    }
}
