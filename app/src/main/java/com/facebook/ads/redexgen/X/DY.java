package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public abstract class DY {
    public static String[] A0D = {"vdpx440NSg8M4CnGdydtu5qQkftaFl81", "8FBVTf92WyxNz1PbVx8WfEYVHOwD1jYA", "DKJKTeADHw9YeVFClTVADEpoqL7THNTT", "QMHe7Xu97ps4f3hWTDxnFcitcXlvMrzA", "cT681YGQWd9DutiYQJBSPFEBPfK5r2m4", "EyU4ukvYlXQau4YgIYVQwMEfY7bgqA6h", "DftqlnKuE3jyyUo0DxEITdlkAR2KkpEx", "3J2n16rNLfrexVGozCu5PKnUXiDeYKol"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public InterfaceC0862Ce A06;
    public InterfaceC0870Co A07;
    public DV A08;
    public DX A09;
    public boolean A0A;
    public boolean A0B;
    public final DT A0C = new DT();

    public abstract long A07(C1004Ij c1004Ij);

    public abstract boolean A0A(C1004Ij c1004Ij, long j10, DX dx) throws IOException, InterruptedException;

    private int A00(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        boolean z10 = true;
        while (z10) {
            if (!this.A0C.A05(interfaceC0861Cd)) {
                this.A01 = 3;
                return -1;
            }
            this.A03 = interfaceC0861Cd.A7F() - this.A04;
            z10 = A0A(this.A0C.A02(), this.A04, this.A09);
            if (z10) {
                this.A04 = interfaceC0861Cd.A7F();
            }
        }
        this.A00 = this.A09.A00.A0C;
        if (!this.A0A) {
            this.A07.A5V(this.A09.A00);
            this.A0A = true;
        }
        if (this.A09.A01 != null) {
            DX dx = this.A09;
            String[] strArr = A0D;
            if (strArr[3].charAt(31) == strArr[7].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[2] = "bh7MBcJSzFDWGWL7bYV4RFdmzZ5DJPtg";
            strArr2[4] = "jbTTtcEVTbmVVWffnqyGAcPkGPEAibSD";
            this.A08 = dx.A01;
        } else if (interfaceC0861Cd.A6t() == -1) {
            this.A08 = new WK();
        } else {
            DU A01 = this.A0C.A01();
            this.A08 = new WQ(this.A04, interfaceC0861Cd.A6t(), this, A01.A01 + A01.A00, A01.A05);
        }
        this.A09 = null;
        this.A01 = 2;
        this.A0C.A04();
        return 0;
    }

    private int A01(InterfaceC0861Cd interfaceC0861Cd, C0865Cj c0865Cj) throws IOException, InterruptedException {
        long ADY = this.A08.ADY(interfaceC0861Cd);
        if (ADY >= 0) {
            c0865Cj.A00 = ADY;
            return 1;
        }
        if (ADY < -1) {
            A08(-(2 + ADY));
        }
        boolean z10 = this.A0B;
        if (A0D[1].charAt(31) != 'Q') {
            A0D[6] = "YKdoYyhEaGRVIGwSTWAYioMwjJxRxWbM";
            if (!z10) {
                this.A06.AEM(this.A08.A4S());
                this.A0B = true;
            }
            if (this.A03 <= 0 && !this.A0C.A05(interfaceC0861Cd)) {
                this.A01 = 3;
                return -1;
            }
            this.A03 = 0L;
            C1004Ij A02 = this.A0C.A02();
            long A07 = A07(A02);
            if (A07 >= 0) {
                long j10 = this.A02;
                long granulesInPacket = j10 + A07;
                if (granulesInPacket >= this.A05) {
                    long A03 = A03(j10);
                    this.A07.AEG(A02, A02.A07());
                    this.A07.AEH(A03, 1, A02.A07(), 0, null);
                    this.A05 = -1L;
                }
            }
            long timeUs = this.A02;
            this.A02 = timeUs + A07;
            return 0;
        }
        throw new RuntimeException();
    }

    public final int A02(InterfaceC0861Cd interfaceC0861Cd, C0865Cj c0865Cj) throws IOException, InterruptedException {
        int i10 = this.A01;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC0861Cd.AEt((int) this.A04);
                this.A01 = 2;
                return 0;
            } else if (i10 == 2) {
                int A01 = A01(interfaceC0861Cd, c0865Cj);
                if (A0D[6].charAt(6) != 'm') {
                    A0D[1] = "ecnT7ItXVuTi5H8Gayt4a9jA0qUq5vI3";
                    return A01;
                }
                throw new RuntimeException();
            } else {
                throw new IllegalStateException();
            }
        }
        return A00(interfaceC0861Cd);
    }

    public final long A03(long j10) {
        return (1000000 * j10) / this.A00;
    }

    public final long A04(long j10) {
        return (this.A00 * j10) / 1000000;
    }

    public final void A05(long j10, long j11) {
        this.A0C.A03();
        if (j10 == 0) {
            A09(!this.A0B);
        } else if (this.A01 == 0) {
        } else {
            this.A05 = this.A08.AF1(j11);
            this.A01 = 2;
        }
    }

    public final void A06(InterfaceC0862Ce interfaceC0862Ce, InterfaceC0870Co interfaceC0870Co) {
        this.A06 = interfaceC0862Ce;
        this.A07 = interfaceC0870Co;
        A09(true);
    }

    public void A08(long j10) {
        this.A02 = j10;
    }

    public void A09(boolean z10) {
        if (z10) {
            this.A09 = new DX();
            this.A04 = 0L;
            this.A01 = 0;
        } else {
            this.A01 = 1;
        }
        this.A05 = -1L;
        this.A02 = 0L;
    }
}
