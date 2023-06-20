package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1358Wi extends Cq {
    public static byte[] A05;
    public static String[] A06 = {"HrBrUDmtAiHhEIFi", "ovhYl7NWEd171z8PJdmzSHTS5BmNRwGh", "O04BUWOaHdfjopELTyPlWCM73tUUR1GH", "jF3DEBpuUmaMt5XqjGdbc3EKLhdJIOP", "6wGSczOuIh6bVbI0f7FgwzIt", "67fT6B3p0kUWiMxqOkjfZNmnVryLDGGV", "w97Hra0FQmNyyw573", "JpIXAL9FgQ2FQzjAVAZn2BwWekNoW7nE"};
    public int A00;
    public int A01;
    public boolean A02;
    public final C1004Ij A03;
    public final C1004Ij A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{1, 62, 51, 50, 56, 119, 49, 56, 37, 58, 54, 35, 119, 57, 56, 35, 119, 36, 34, 39, 39, 56, 37, 35, 50, 51, 109, 119, 91, 68, 73, 72, 66, 2, 76, 91, 78};
    }

    static {
        A01();
    }

    public C1358Wi(InterfaceC0870Co interfaceC0870Co) {
        super(interfaceC0870Co);
        this.A04 = new C1004Ij(C1000If.A03);
        this.A03 = new C1004Ij(4);
    }

    @Override // com.facebook.ads.redexgen.X.Cq
    public final void A0B(C1004Ij c1004Ij, long j10) throws C0813Af {
        int A0E = c1004Ij.A0E();
        long A09 = j10 + (c1004Ij.A09() * 1000);
        if (A0E == 0 && !this.A02) {
            C1004Ij videoSequence = new C1004Ij(new byte[c1004Ij.A04()]);
            c1004Ij.A0c(videoSequence.A00, 0, c1004Ij.A04());
            J1 A00 = J1.A00(videoSequence);
            this.A01 = A00.A02;
            super.A00.A5V(Format.A03(null, A00(28, 9, 114), null, -1, -1, A00.A03, A00.A01, -1.0f, A00.A04, -1, A00.A00, null));
            this.A02 = true;
        } else if (A0E != 1 || !this.A02) {
        } else {
            byte[] bArr = this.A03.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i10 = 4 - this.A01;
            int i11 = 0;
            while (c1004Ij.A04() > 0) {
                c1004Ij.A0c(this.A03.A00, i10, this.A01);
                this.A03.A0Y(0);
                int A0H = this.A03.A0H();
                this.A04.A0Y(0);
                super.A00.AEG(this.A04, 4);
                super.A00.AEG(c1004Ij, A0H);
                i11 = i11 + 4 + A0H;
            }
            InterfaceC0870Co interfaceC0870Co = super.A00;
            int i12 = this.A00 != 1 ? 0 : 1;
            if (A06[6].length() == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[1] = "SxoTsTEtYbkIpzmogJvkXCUruqqJ7knT";
            strArr[7] = "DX7TKSEUbLiNIzjv4P1HkLtMAUktYoJf";
            interfaceC0870Co.AEH(A09, i12, i11, 0, null);
        }
    }

    @Override // com.facebook.ads.redexgen.X.Cq
    public final boolean A0C(C1004Ij c1004Ij) throws C1359Wj {
        int A0E = c1004Ij.A0E();
        int i10 = (A0E >> 4) & 15;
        int i11 = A0E & 15;
        if (i11 == 7) {
            this.A00 = i10;
            return i10 != 5;
        }
        throw new C1359Wj(A00(0, 28, 8) + i11);
    }
}
