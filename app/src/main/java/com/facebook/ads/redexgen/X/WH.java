package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class WH implements InterfaceC0860Cc {
    public static byte[] A04;
    public static String[] A05 = {"P5w0t5YmbfCx1ojda5KKDsEMO6jqUmnr", "UdOatSKcJailVD", "", "xAiF", "epl8GGi5jyNsT2QZHjLNLopZqyhNzplR", "TY8pRi4pa4JcG30Kuv61m", "fOMFGQDuqjq2usuY2YJ2oGF", "ObZwfJQfEiVxl"};
    public static final InterfaceC0863Cf A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final WG A02;
    public final C1004Ij A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 57);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{15, 2, 117};
    }

    static {
        A01();
        A06 = new WI();
        A07 = C1020Iz.A08(A00(0, 3, 127));
    }

    public WH() {
        this(0L);
    }

    public WH(long j10) {
        this.A01 = j10;
        this.A02 = new WG();
        this.A03 = new C1004Ij(2786);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final void A8I(InterfaceC0862Ce interfaceC0862Ce) {
        this.A02.A4V(interfaceC0862Ce, new C0893Dw(0, 1));
        interfaceC0862Ce.A5D();
        interfaceC0862Ce.AEM(new C1366Wq(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final int ADX(InterfaceC0861Cd interfaceC0861Cd, C0865Cj c0865Cj) throws IOException, InterruptedException {
        int read = interfaceC0861Cd.read(this.A03.A00, 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(read);
        if (!this.A00) {
            this.A02.AD4(this.A01, true);
            this.A00 = true;
        }
        this.A02.A48(this.A03);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final void AEL(long j10, long j11) {
        this.A00 = false;
        this.A02.AEK();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final boolean AEv(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        C1004Ij c1004Ij = new C1004Ij(10);
        int i10 = 0;
        while (true) {
            interfaceC0861Cd.AD7(c1004Ij.A00, 0, 10);
            if (A05[7].length() != 13) {
                throw new RuntimeException();
            }
            A05[5] = "IuOldmz1qGC5b";
            c1004Ij.A0Y(0);
            if (c1004Ij.A0G() != A07) {
                interfaceC0861Cd.AEB();
                interfaceC0861Cd.A3K(i10);
                int startPosition = i10;
                int i11 = 0;
                while (true) {
                    interfaceC0861Cd.AD7(c1004Ij.A00, 0, 5);
                    c1004Ij.A0Y(0);
                    if (c1004Ij.A0I() != 2935) {
                        i11 = 0;
                        interfaceC0861Cd.AEB();
                        startPosition++;
                        if (startPosition - i10 >= 8192) {
                            return false;
                        }
                        interfaceC0861Cd.A3K(startPosition);
                    } else {
                        i11++;
                        if (A05[5].length() != 29) {
                            String[] strArr = A05;
                            strArr[3] = "a4rI";
                            strArr[6] = "EnE3h5gngskpWhoTVRGnZEO";
                            if (i11 >= 4) {
                                return true;
                            }
                        } else if (i11 >= 4) {
                            return true;
                        }
                        int A052 = BA.A05(c1004Ij.A00);
                        if (A052 == -1) {
                            return false;
                        }
                        int syncBytes = A052 - 5;
                        interfaceC0861Cd.A3K(syncBytes);
                    }
                }
            } else {
                c1004Ij.A0Z(3);
                int A0D = c1004Ij.A0D();
                int syncBytes2 = A0D + 10;
                i10 += syncBytes2;
                interfaceC0861Cd.A3K(A0D);
            }
        }
    }
}
