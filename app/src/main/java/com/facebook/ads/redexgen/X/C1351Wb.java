package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1351Wb implements InterfaceC0860Cc {
    public static byte[] A0E;
    public static String[] A0F = {"ydp2W5xsf3wxxmCItZRtLRLpaCcQN61V", "ZzeQ67WJ6", "MfxT7BiZm", "QAZkmCdKFAHfN7ilsO4NsWCm7AIOdsAB", "uXA2W", "sq6CLgUZZ", "GhmTF3RrY3ydpwpSZCJZy8aIHeXkOr61", "710SvX7FP4z"};
    public static final InterfaceC0863Cf A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public InterfaceC0862Ce A04;
    public InterfaceC0870Co A05;
    public InterfaceC1352Wc A06;
    public Metadata A07;
    public final int A08;
    public final long A09;
    public final C0864Cg A0A;
    public final Ch A0B;
    public final Ci A0C;
    public final C1004Ij A0D;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{117, 82, 90, 83, 97, 87, 83, 64, 81, 90, 87, 86, 18, 70, 93, 93, 18, 95, 83, 92, 75, 18, 80, 75, 70, 87, 65, 28, 0, 20, 4, 31, 11, 58, 61, 52};
    }

    static {
        A05();
        A0G = new C1353Wd();
        A0J = C1020Iz.A08(A04(32, 4, 79));
        A0H = C1020Iz.A08(A04(0, 4, 32));
        A0I = C1020Iz.A08(A04(28, 4, 74));
    }

    public C1351Wb() {
        this(0);
    }

    public C1351Wb(int i10) {
        this(i10, -9223372036854775807L);
    }

    public C1351Wb(int i10, long j10) {
        this.A08 = i10;
        this.A09 = j10;
        this.A0D = new C1004Ij(10);
        this.A0C = new Ci();
        this.A0A = new C0864Cg();
        this.A02 = -9223372036854775807L;
        this.A0B = new Ch();
    }

    private int A00(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            interfaceC0861Cd.AEB();
            String[] strArr = A0F;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[0] = "k6Z5PTGWNQqxWVGEWp2g14fMjsllqw2H";
            strArr2[6] = "hJNgcdrxKvM79jF48EqDHnrsGOClnbxU";
            if (!interfaceC0861Cd.AD8(this.A0D.A00, 0, 4, true)) {
                return -1;
            }
            this.A0D.A0Y(0);
            int A08 = this.A0D.A08();
            if (!A06(A08, this.A01) || Ci.A00(A08) == -1) {
                interfaceC0861Cd.AEt(1);
                this.A01 = 0;
                return 0;
            }
            Ci.A04(A08, this.A0C);
            if (this.A02 == -9223372036854775807L) {
                this.A02 = this.A06.A7e(interfaceC0861Cd.A7F());
                if (this.A09 != -9223372036854775807L) {
                    this.A02 += this.A09 - this.A06.A7e(0L);
                }
            }
            this.A00 = this.A0C.A02;
        }
        int AEF = this.A05.AEF(interfaceC0861Cd, this.A00, true);
        if (AEF == -1) {
            return -1;
        }
        this.A00 -= AEF;
        if (this.A00 > 0) {
            return 0;
        }
        this.A05.AEH(this.A02 + ((this.A03 * 1000000) / this.A0C.A03), 1, this.A0C.A02, 0, null);
        this.A03 += this.A0C.A04;
        this.A00 = 0;
        return 0;
    }

    public static int A01(C1004Ij c1004Ij, int i10) {
        if (c1004Ij.A07() >= i10 + 4) {
            c1004Ij.A0Y(i10);
            int A08 = c1004Ij.A08();
            if (A08 == A0J || A08 == A0H) {
                return A08;
            }
        }
        if (c1004Ij.A07() >= 40) {
            c1004Ij.A0Y(36);
            int A082 = c1004Ij.A08();
            int i11 = A0I;
            if (A082 == i11) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    private InterfaceC1352Wc A02(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        interfaceC0861Cd.AD7(this.A0D.A00, 0, 4);
        this.A0D.A0Y(0);
        Ci.A04(this.A0D.A08(), this.A0C);
        return new Dh(interfaceC0861Cd.A6t(), interfaceC0861Cd.A7F(), this.A0C);
    }

    private InterfaceC1352Wc A03(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        C1004Ij c1004Ij = new C1004Ij(this.A0C.A02);
        interfaceC0861Cd.AD7(c1004Ij.A00, 0, this.A0C.A02);
        int i10 = 21;
        if ((this.A0C.A05 & 1) != 0) {
            if (this.A0C.A01 != 1) {
                i10 = 36;
            }
        } else {
            int seekHeader = this.A0C.A01;
            if (seekHeader == 1) {
                i10 = 13;
            }
        }
        int A01 = A01(c1004Ij, i10);
        int seekHeader2 = A0J;
        if (A01 != seekHeader2) {
            int seekHeader3 = A0H;
            if (A01 != seekHeader3) {
                int seekHeader4 = A0I;
                if (A01 == seekHeader4) {
                    C0878Dg A00 = C0878Dg.A00(interfaceC0861Cd.A6t(), interfaceC0861Cd.A7F(), this.A0C, c1004Ij);
                    interfaceC0861Cd.AEt(this.A0C.A02);
                    return A00;
                }
                interfaceC0861Cd.AEB();
                return null;
            }
        }
        DN A012 = DN.A01(interfaceC0861Cd.A6t(), interfaceC0861Cd.A7F(), this.A0C, c1004Ij);
        if (A012 != null && !this.A0A.A03()) {
            interfaceC0861Cd.AEB();
            int seekHeader5 = i10 + 141;
            interfaceC0861Cd.A3K(seekHeader5);
            interfaceC0861Cd.AD7(this.A0D.A00, 0, 3);
            this.A0D.A0Y(0);
            C0864Cg c0864Cg = this.A0A;
            int seekHeader6 = this.A0D.A0G();
            c0864Cg.A04(seekHeader6);
        }
        int seekHeader7 = this.A0C.A02;
        interfaceC0861Cd.AEt(seekHeader7);
        if (A012 == null || A012.A8g()) {
            return A012;
        }
        int seekHeader8 = A0H;
        if (A01 == seekHeader8) {
            return A02(interfaceC0861Cd);
        }
        return A012;
    }

    public static boolean A06(int i10, long j10) {
        return ((long) ((-128000) & i10)) == ((-128000) & j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r15 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        r14.AEt(r5 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
        r13.A01 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
        r14.AEB();
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A07(com.facebook.ads.redexgen.X.InterfaceC0861Cd r14, boolean r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1351Wb.A07(com.facebook.ads.redexgen.X.Cd, boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final void A8I(InterfaceC0862Ce interfaceC0862Ce) {
        this.A04 = interfaceC0862Ce;
        this.A05 = this.A04.AFD(0, 1);
        this.A04.A5D();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final int ADX(InterfaceC0861Cd interfaceC0861Cd, C0865Cj c0865Cj) throws IOException, InterruptedException {
        if (this.A01 == 0) {
            try {
                A07(interfaceC0861Cd, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A06 == null) {
            this.A06 = A03(interfaceC0861Cd);
            InterfaceC1352Wc interfaceC1352Wc = this.A06;
            if (interfaceC1352Wc == null || (!interfaceC1352Wc.A8g() && (this.A08 & 1) != 0)) {
                InterfaceC1352Wc A02 = A02(interfaceC0861Cd);
                String[] strArr = A0F;
                if (strArr[2].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                A0F[3] = "vRoDRHRtSRtNnEEJ64K4r5ogXxosELXw";
                this.A06 = A02;
            }
            this.A04.AEM(this.A06);
            this.A05.A5V(Format.A05(null, this.A0C.A06, null, -1, 4096, this.A0C.A01, this.A0C.A03, -1, this.A0A.A00, this.A0A.A01, null, null, 0, null, (this.A08 & 2) != 0 ? null : this.A07));
        }
        return A00(interfaceC0861Cd);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final void AEL(long j10, long j11) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A03 = 0L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final boolean AEv(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        return A07(interfaceC0861Cd, true);
    }
}
