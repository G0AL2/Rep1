package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class WQ implements DV {
    public static byte[] A0C;
    public static String[] A0D = {"IwWJ1rAHfmexjsebXRXcDPjaU73iSJJD", "Pfa9O7smeRLr", "YVPVKTJSUnoy1mID8h1JiHhyOv", "4YIcZCc9D0v6GYbVW55qq4", "MQGq3Ss0TGTuZcZl9hZWKHAs", "ClxO0wOPMkXGPeTsbkyLqOefUDvePx9Y", "eY8aqVMBTreysgzhCT0m33TuEQRECFok", "4vNP3Dy1WFFR"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final DU A0A = new DU();
    public final DY A0B;

    public static String A09(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 110);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0C = new byte[]{38, 7, 72, 7, 15, 15, 72, 24, 9, 15, 13, 72, 11, 9, 6, 72, 10, 13, 72, 14, 7, 29, 6, 12, 70};
    }

    static {
        A0A();
    }

    public WQ(long j10, long j11, DY dy, int i10, long j12) {
        IK.A03(j10 >= 0 && j11 > j10);
        this.A0B = dy;
        this.A09 = j10;
        this.A08 = j11;
        if (i10 == j11 - j10) {
            this.A07 = j12;
            this.A00 = 3;
            return;
        }
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A00(long j10, long j11, long j12) {
        long j13 = this.A08;
        long j14 = this.A09;
        long j15 = j10 + ((((j13 - j14) * j11) / this.A07) - j12);
        if (j15 < j14) {
            j15 = this.A09;
        }
        long j16 = this.A08;
        if (j15 >= j16) {
            return j16 - 1;
        }
        return j15;
    }

    private final long A01(long j10, InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        if (this.A04 == this.A01) {
            return -(this.A05 + 2);
        }
        long A7F = interfaceC0861Cd.A7F();
        if (A0D(interfaceC0861Cd, this.A01)) {
            this.A0A.A03(interfaceC0861Cd, false);
            interfaceC0861Cd.AEB();
            long j11 = j10 - this.A0A.A05;
            int i10 = this.A0A.A01 + this.A0A.A00;
            if (j11 >= 0) {
                String[] strArr = A0D;
                if (strArr[5].charAt(24) != strArr[0].charAt(24)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[2] = "1HFKFqyQYawdfec4zhOWKwAEhw";
                strArr2[3] = "atngC4wrhlAL4xDnem6FNv";
                if (j11 <= 72000) {
                    interfaceC0861Cd.AEt(i10);
                    return -(this.A0A.A05 + 2);
                }
            }
            if (j11 < 0) {
                this.A01 = A7F;
                this.A02 = this.A0A.A05;
            } else {
                long initialPosition = interfaceC0861Cd.A7F();
                this.A04 = initialPosition + i10;
                this.A05 = this.A0A.A05;
                long initialPosition2 = this.A01;
                if ((initialPosition2 - this.A04) + i10 < 100000) {
                    interfaceC0861Cd.AEt(i10);
                    long initialPosition3 = this.A05;
                    return -(initialPosition3 + 2);
                }
            }
            long initialPosition4 = this.A01;
            long j12 = this.A04;
            if (initialPosition4 - j12 < 100000) {
                this.A01 = j12;
                return j12;
            }
            long A7F2 = interfaceC0861Cd.A7F() - (i10 * (j11 > 0 ? 1L : 2L));
            long j13 = this.A01;
            long j14 = this.A04;
            long j15 = (j13 - j14) * j11;
            String[] strArr3 = A0D;
            String str = strArr3[5];
            String str2 = strArr3[0];
            int pageSize = str.charAt(24);
            if (pageSize != str2.charAt(24)) {
                long initialPosition5 = this.A02;
                return Math.min(Math.max(A7F2 + (j15 / (initialPosition5 - this.A05)), j14), this.A01 - 1);
            }
            String[] strArr4 = A0D;
            strArr4[1] = "HnyCEdH4by64";
            strArr4[7] = "f67XG71IQfud";
            return Math.min(Math.max(A7F2 + (j15 / (this.A02 - this.A05)), j14), this.A01 - 1);
        }
        long j16 = this.A04;
        if (j16 != A7F) {
            return j16;
        }
        throw new IOException(A09(0, 25, 6));
    }

    private final long A02(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        A0C(interfaceC0861Cd);
        this.A0A.A02();
        while ((this.A0A.A04 & 4) != 4 && interfaceC0861Cd.A7F() < this.A08) {
            this.A0A.A03(interfaceC0861Cd, false);
            interfaceC0861Cd.AEt(this.A0A.A01 + this.A0A.A00);
        }
        return this.A0A.A05;
    }

    private final long A03(InterfaceC0861Cd interfaceC0861Cd, long j10, long j11) throws IOException, InterruptedException {
        this.A0A.A03(interfaceC0861Cd, false);
        while (this.A0A.A05 < j10) {
            interfaceC0861Cd.AEt(this.A0A.A01 + this.A0A.A00);
            j11 = this.A0A.A05;
            this.A0A.A03(interfaceC0861Cd, false);
        }
        interfaceC0861Cd.AEB();
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.DV
    /* renamed from: A07 */
    public final WR A4S() {
        if (this.A07 != 0) {
            return new WR(this);
        }
        return null;
    }

    private final void A0B() {
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0L;
        this.A02 = this.A07;
    }

    private final void A0C(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        if (A0D(interfaceC0861Cd, this.A08)) {
            return;
        }
        throw new EOFException();
    }

    private final boolean A0D(InterfaceC0861Cd interfaceC0861Cd, long j10) throws IOException, InterruptedException {
        long min = Math.min(3 + j10, this.A08);
        byte[] bArr = new byte[2048];
        int length = bArr.length;
        while (true) {
            if (interfaceC0861Cd.A7F() + length > min && (length = (int) (min - interfaceC0861Cd.A7F())) < 4) {
                return false;
            }
            interfaceC0861Cd.AD8(bArr, 0, length, false);
            for (int i10 = 0; i10 < length - 3; i10++) {
                if (bArr[i10] == 79 && bArr[i10 + 1] == 103 && bArr[i10 + 2] == 103 && bArr[i10 + 3] == 83) {
                    interfaceC0861Cd.AEt(i10);
                    return true;
                }
            }
            interfaceC0861Cd.AEt(length - 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DV
    public final long ADY(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        long A03;
        int i10 = this.A00;
        if (i10 == 0) {
            this.A03 = interfaceC0861Cd.A7F();
            this.A00 = 1;
            long j10 = this.A08 - 65307;
            if (j10 > this.A03) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            long j11 = this.A06;
            if (j11 == 0) {
                A03 = 0;
            } else {
                long A01 = A01(j11, interfaceC0861Cd);
                if (A01 >= 0) {
                    return A01;
                }
                A03 = A03(interfaceC0861Cd, this.A06, -(A01 + 2));
            }
            this.A00 = 3;
            return -(2 + A03);
        }
        this.A07 = A02(interfaceC0861Cd);
        this.A00 = 3;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.DV
    public final long AF1(long j10) {
        int i10 = this.A00;
        IK.A03(i10 == 3 || i10 == 2);
        long j11 = 0;
        if (j10 != 0) {
            j11 = this.A0B.A04(j10);
        }
        this.A06 = j11;
        this.A00 = 2;
        A0B();
        long j12 = this.A06;
        String[] strArr = A0D;
        if (strArr[5].charAt(24) != strArr[0].charAt(24)) {
            throw new RuntimeException();
        }
        A0D[6] = "l4iEtEKEuRK6wb9mepvhy";
        return j12;
    }
}
