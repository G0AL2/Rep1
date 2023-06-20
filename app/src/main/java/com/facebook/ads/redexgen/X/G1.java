package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class G1 extends AbstractC1684dp {
    public static byte[] A02;
    public static String[] A03 = {"OXbCEMjwdPN5xvU2NT0kKgep5UeL1Sqr", "SX0ygsPxRN6KiRybC8JMsMv996SDI", "L77PzfY5dGd9ppcaJeqEYdg5mL", "qaE4mxmFDXDzve4pMTR5s0xQhV", "rrEUCxltihDw1phZ7LTyezPpJ6vgfWBl", "FdpTQfSalwXKw6iuOYHl49ZbqEAaQDuv", "IFg4N7XoM6S2Rxr", "IzcF2xeWDVSzXIhxKqlgaOjlVHZ1W1Z3"};
    public Map<String, String> A00;
    public final Uri A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {104, 109, 106, 111};
        if (A03[5].charAt(30) != 'u') {
            throw new RuntimeException();
        }
        A03[5] = "82m81CO1d0OwjHPL38rD7xdABiLQ6kup";
        A02 = bArr;
    }

    static {
        A01();
    }

    public G1(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, String str, Uri uri, Map<String, String> map) {
        super(c1400Xy, interfaceC1028Jh, str, null, true, true);
        this.A01 = uri;
        this.A00 = map;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1684dp
    public final void A0D() {
        A0E(this.A00, null);
    }

    public final Uri A0G() {
        return C1070La.A00(this.A01.getQueryParameter(A00(0, 4, 20)));
    }
}
