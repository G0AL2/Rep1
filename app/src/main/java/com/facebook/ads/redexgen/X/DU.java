package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DU {
    public static byte[] A0B;
    public static String[] A0C = {"YzvHsTMmTYxxNxJ4BW4C6XDVYqyEhqwg", "DyykeCXSXWzexqWWFpwTB51jr5MdfDQh", "", "oCxSUOHtl", "W", "ErMglUai0WMQZxUcBU3ghNmJAn5UMHWP", "evjJZ0tguMh0jPrsPzma", "Y35IcPuc1nzeTRP5nOJ1bVO3GyCkNnWr"};
    public static final int A0D;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public final int[] A09 = new int[255];
    public final C1004Ij A0A = new C1004Ij(255);

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{-45, -21, -21, -41, -44, -25, -33, -44, -46, -29, -44, -45, -113, -66, -42, -42, -62, -113, -46, -48, -33, -29, -28, -31, -44, -113, -33, -48, -29, -29, -44, -31, -35, -113, -48, -29, -113, -47, -44, -42, -40, -35, -113, -34, -43, -113, -33, -48, -42, -44, -43, -50, -45, -43, -48, -48, -49, -46, -44, -59, -60, Byte.MIN_VALUE, -62, -55, -44, Byte.MIN_VALUE, -45, -44, -46, -59, -63, -51, Byte.MIN_VALUE, -46, -59, -42, -55, -45, -55, -49, -50};
    }

    static {
        A01();
        A0D = C1020Iz.A08(A00(0, 4, 115));
    }

    public final void A02() {
        this.A03 = 0;
        this.A04 = 0;
        this.A05 = 0L;
        this.A08 = 0L;
        this.A07 = 0L;
        this.A06 = 0L;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
    }

    public final boolean A03(InterfaceC0861Cd interfaceC0861Cd, boolean z10) throws IOException, InterruptedException {
        this.A0A.A0V();
        A02();
        if (!(interfaceC0861Cd.A6t() == -1 || interfaceC0861Cd.A6t() - interfaceC0861Cd.A7A() >= 27) || !interfaceC0861Cd.AD8(this.A0A.A00, 0, 27, true)) {
            if (z10) {
                return false;
            }
            throw new EOFException();
        }
        long A0M = this.A0A.A0M();
        long j10 = A0D;
        if (A0C[1].charAt(3) != 'Q') {
            String[] strArr = A0C;
            strArr[6] = "TY8Cxf5ha5PO6yS0Ln5J";
            strArr[4] = "Y";
            if (A0M != j10) {
                if (z10) {
                    return false;
                }
                throw new C0813Af(A00(4, 46, 94));
            }
            this.A03 = this.A0A.A0E();
            if (this.A03 != 0) {
                if (z10) {
                    return false;
                }
                throw new C0813Af(A00(50, 31, 79));
            }
            this.A04 = this.A0A.A0E();
            this.A05 = this.A0A.A0J();
            this.A08 = this.A0A.A0K();
            this.A07 = this.A0A.A0K();
            this.A06 = this.A0A.A0K();
            this.A02 = this.A0A.A0E();
            this.A01 = this.A02 + 27;
            this.A0A.A0V();
            interfaceC0861Cd.AD7(this.A0A.A00, 0, this.A02);
            int i10 = 0;
            while (true) {
                int i11 = this.A02;
                if (A0C[2].length() == 23) {
                    break;
                }
                String[] strArr2 = A0C;
                strArr2[6] = "f6Qtv0ouqQGkepRa7Y7s";
                strArr2[4] = "L";
                if (i10 >= i11) {
                    return true;
                }
                this.A09[i10] = this.A0A.A0E();
                this.A00 += this.A09[i10];
                i10++;
            }
        }
        throw new RuntimeException();
    }
}
