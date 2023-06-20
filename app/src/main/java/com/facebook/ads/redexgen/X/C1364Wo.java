package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1364Wo implements InterfaceC0860Cc {
    public static byte[] A07;
    public static String[] A08 = {"kwIa2qvFZnh4ugx7FyhwbqYesuLHzW8H", "4Dgc9JYMaZvt2hrxHtp57hAkJrlRZ5uW", "jO6V5", "R3", "Im86Iu6D0MRlrMkG5DQfIyJ6juGc2Tk5", "YTnYWq927V90IgLbpCGbNLebKXRpsTKS", "IVlYalVTOJIVyjwO93zz99ctNlNH9y3g", "4VmeTfaP7iXdbh5q2O9S939ewelN7CTt"};
    public static final InterfaceC0863Cf A09;
    public static final int A0A;
    public static final byte[] A0B;
    public static final byte[] A0C;
    public static final int[] A0D;
    public static final int[] A0E;
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0870Co A03;
    public boolean A04;
    public boolean A05;
    public final byte[] A06 = new byte[1];

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 86);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{68, 2, 22, 5, 9, 1, 68, 16, 29, 20, 1, 68, 110, 108, 12, 0, 31, 71, 71, 69, 37, 41, 54, 73, 51, 38, 110, 19, 63, 37, 60, 52, 112, 62, 63, 36, 112, 54, 57, 62, 52, 112, 17, 29, 2, 112, 56, 53, 49, 52, 53, 34, 126, 118, 83, 83, 90, 88, 94, 83, 31, 126, 114, 109, 31, 66, 101, 125, 106, 103, 98, 111, 43, 123, 106, 111, 111, 98, 101, 108, 43, 105, 98, Byte.MAX_VALUE, 120, 43, 109, 100, 121, 43, 109, 121, 106, 102, 110, 43, 99, 110, 106, 111, 110, 121, 43, 100, 104, 11, 30, 117, 97, 112, 125, 123, 59, 39, 115, 100, 100, 79, 91, 74, 71, 65, 1, 79, 67, 92, 3, 89, 76};
    }

    static {
        A05();
        A09 = new C1365Wp();
        A0D = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        A0E = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        A0B = C1020Iz.A0i(A03(12, 6, 27));
        A0C = C1020Iz.A0i(A03(18, 9, 50));
        A0A = A0E[8];
    }

    private int A00(int i10) throws C0813Af {
        if (!A07(i10)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(A03(53, 12, 105));
            sb2.append(this.A05 ? A03(105, 2, 10) : A03(103, 2, 124));
            sb2.append(A03(0, 12, 50));
            sb2.append(i10);
            throw new C0813Af(sb2.toString());
        } else if (this.A05) {
            int[] iArr = A0E;
            if (A08[1].charAt(23) != 'y') {
                A08[2] = "ixm0r";
                return iArr[i10];
            }
            throw new RuntimeException();
        } else {
            return A0D[i10];
        }
    }

    private int A01(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        interfaceC0861Cd.AEB();
        interfaceC0861Cd.AD7(this.A06, 0, 1);
        byte b10 = this.A06[0];
        if ((b10 & 131) <= 0) {
            return A00((b10 >> 3) & 15);
        }
        throw new C0813Af(A03(65, 38, 93) + ((int) b10));
    }

    private int A02(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            try {
                this.A01 = A01(interfaceC0861Cd);
                this.A00 = this.A01;
            } catch (EOFException unused) {
                return -1;
            }
        }
        int AEF = this.A03.AEF(interfaceC0861Cd, this.A00, true);
        if (AEF == -1) {
            return -1;
        }
        this.A00 -= AEF;
        if (this.A00 > 0) {
            return 0;
        }
        InterfaceC0870Co interfaceC0870Co = this.A03;
        long j10 = this.A02;
        String[] strArr = A08;
        if (strArr[4].charAt(15) != strArr[5].charAt(15)) {
            A08[2] = "25B6f";
            interfaceC0870Co.AEH(j10, 1, this.A01, 0, null);
            this.A02 += 20000;
            return 0;
        }
        throw new RuntimeException();
    }

    private void A04() {
        if (!this.A04) {
            this.A04 = true;
            this.A03.A5V(Format.A06(null, this.A05 ? A03(117, 12, 120) : A03(107, 10, 66), null, -1, A0A, 1, this.A05 ? 16000 : 8000, -1, null, null, 0, null));
        }
    }

    private boolean A06(int i10) {
        return !this.A05 && (i10 < 12 || i10 > 14);
    }

    private boolean A07(int i10) {
        return i10 >= 0 && i10 <= 15 && (A08(i10) || A06(i10));
    }

    private boolean A08(int i10) {
        return this.A05 && (i10 < 10 || i10 > 13);
    }

    private boolean A09(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        if (A0A(interfaceC0861Cd, A0B)) {
            this.A05 = false;
            interfaceC0861Cd.AEt(A0B.length);
            return true;
        } else if (A0A(interfaceC0861Cd, A0C)) {
            this.A05 = true;
            interfaceC0861Cd.AEt(A0C.length);
            return true;
        } else {
            return false;
        }
    }

    private boolean A0A(InterfaceC0861Cd interfaceC0861Cd, byte[] bArr) throws IOException, InterruptedException {
        interfaceC0861Cd.AEB();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC0861Cd.AD7(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final void A8I(InterfaceC0862Ce interfaceC0862Ce) {
        interfaceC0862Ce.AEM(new C1366Wq(-9223372036854775807L));
        this.A03 = interfaceC0862Ce.AFD(0, 1);
        interfaceC0862Ce.A5D();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final int ADX(InterfaceC0861Cd interfaceC0861Cd, C0865Cj c0865Cj) throws IOException, InterruptedException {
        if (interfaceC0861Cd.A7F() != 0 || A09(interfaceC0861Cd)) {
            A04();
            return A02(interfaceC0861Cd);
        }
        throw new C0813Af(A03(27, 26, 6));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final void AEL(long j10, long j11) {
        this.A02 = 0L;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final boolean AEv(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        return A09(interfaceC0861Cd);
    }
}
