package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class V9 implements HW {
    public static byte[] A08;
    public int A00;
    public int A01;
    public int A02;
    public HV[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;
    public final HV[] A07;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 123);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-69, -81, -2, 23, 14, 33, 25, 14, 12, 29, 14, 13, -55, 10, 21, 21, 24, 12, 10, 29, 18, 24, 23, -29, -55};
    }

    public V9(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public V9(boolean z10, int i10, int i11) {
        IK.A03(i10 > 0);
        IK.A03(i11 >= 0);
        this.A05 = z10;
        this.A04 = i10;
        this.A01 = i11;
        this.A03 = new HV[i11 + 100];
        if (i11 > 0) {
            this.A06 = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.A03[i12] = new HV(this.A06, i12 * i10);
            }
        } else {
            this.A06 = null;
        }
        this.A07 = new HV[1];
    }

    public final synchronized int A02() {
        return this.A00 * this.A04;
    }

    public final synchronized void A03() {
        if (this.A05) {
            A04(0);
        }
    }

    public final synchronized void A04(int i10) {
        boolean z10 = i10 < this.A02;
        this.A02 = i10;
        if (z10) {
            AFE();
        }
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final synchronized HV A3L() {
        HV hv;
        this.A00++;
        if (this.A01 > 0) {
            HV[] hvArr = this.A03;
            int i10 = this.A01 - 1;
            this.A01 = i10;
            hv = hvArr[i10];
            this.A03[this.A01] = null;
        } else {
            hv = new HV(new byte[this.A04], 0);
        }
        return hv;
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final int A6o() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final synchronized void ADn(HV hv) {
        this.A07[0] = hv;
        ADo(this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final synchronized void ADo(HV[] hvArr) {
        if (this.A01 + hvArr.length >= this.A03.length) {
            this.A03 = (HV[]) Arrays.copyOf(this.A03, Math.max(this.A03.length * 2, this.A01 + hvArr.length));
        }
        for (HV hv : hvArr) {
            if (hv.A01 != this.A06 && hv.A01.length != this.A04) {
                throw new IllegalArgumentException(A00(2, 23, 46) + System.identityHashCode(hv.A01) + A00(0, 2, 20) + System.identityHashCode(this.A06) + A00(0, 2, 20) + hv.A01.length + A00(0, 2, 20) + this.A04);
            }
            HV[] hvArr2 = this.A03;
            int i10 = this.A01;
            this.A01 = i10 + 1;
            hvArr2[i10] = hv;
        }
        this.A00 -= hvArr.length;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final synchronized void AFE() {
        int lowIndex = Math.max(0, C1020Iz.A04(this.A02, this.A04) - this.A00);
        if (lowIndex >= this.A01) {
            return;
        }
        if (this.A06 != null) {
            int i10 = 0;
            int i11 = this.A01 - 1;
            while (i10 <= i11) {
                HV hv = this.A03[i10];
                if (hv.A01 == this.A06) {
                    i10++;
                } else {
                    HV hv2 = this.A03[i11];
                    if (hv2.A01 != this.A06) {
                        i11--;
                    } else {
                        int highIndex = i10 + 1;
                        this.A03[i10] = hv2;
                        this.A03[i11] = hv;
                        i11--;
                        i10 = highIndex;
                    }
                }
            }
            lowIndex = Math.max(lowIndex, i10);
            if (lowIndex >= this.A01) {
                return;
            }
        }
        Arrays.fill(this.A03, lowIndex, this.A01, (Object) null);
        this.A01 = lowIndex;
    }
}
