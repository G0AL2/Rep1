package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1349Vz implements InterfaceC0887Dq {
    public static byte[] A03;
    public static String[] A04 = {"9dIhF2X5qYPGZcPrMQjFeU2FMq4Icb5t", "C7lZKzl2OzNugbLE4QJixcZrlcSgCGI7", "v7kvgcbsYqtq4Ou8B7XlURjv8wkzUozH", "8BzUB2zJ4MAZsKVthH28T9QXZJlG29jD", "wOgdV6BnuyxARX3Rbc0CvFDDXWIKfgjM", "mpBmZ", "f47n1mRwiFyOsV4myeWB5UC2YKJiwKop", "3tKYH9iJUyIyPmbH9Trftcv4NWgUsp5b"};
    public InterfaceC0870Co A00;
    public C1016Iv A01;
    public boolean A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{11, 26, 26, 22, 19, 13, 11, 30, 19, 25, 24, -39, 34, -41, 29, 13, 30, 15, -35, -33};
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0887Dq
    public final void A48(C1004Ij c1004Ij) {
        if (!this.A02) {
            if (this.A01.A05() == -9223372036854775807L) {
                return;
            }
            this.A00.A5V(Format.A02(null, A00(0, 20, 74), this.A01.A05()));
            this.A02 = true;
        }
        int A042 = c1004Ij.A04();
        this.A00.AEG(c1004Ij, A042);
        InterfaceC0870Co interfaceC0870Co = this.A00;
        if (A04[0].charAt(13) != 'c') {
            throw new RuntimeException();
        }
        A04[0] = "M4wOXnroCREOIcf8T96EgrMDUu9ExHmM";
        interfaceC0870Co.AEH(this.A01.A04(), 1, A042, 0, null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0887Dq
    public final void A8K(C1016Iv c1016Iv, InterfaceC0862Ce interfaceC0862Ce, C0893Dw c0893Dw) {
        this.A01 = c1016Iv;
        c0893Dw.A05();
        this.A00 = interfaceC0862Ce.AFD(c0893Dw.A03(), 4);
        this.A00.A5V(Format.A0B(c0893Dw.A04(), A00(0, 20, 74), null, -1, null));
    }
}
