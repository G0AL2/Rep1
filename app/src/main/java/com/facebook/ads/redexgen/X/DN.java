package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DN implements InterfaceC1352Wc {
    public static byte[] A05;
    public static String[] A06 = {"BIb1Y700RDmcL7JF9Fn", "lk1IRtv8jtyAOasrQbC6YrAcVcFJ9", "71nm4ncPUlnpG5PegzVfukIlQIS7yUOP", "GCiVubWGa77lALd1Rb0", "chLweuz0mMl4FbXf4CPkrAmx2V", "NRv5J71Oqm94bOZTTnySoFkmq1d86Acc", "fJm6FHaelFV0WMwBghon3E9Gns2th", "ObA7Byd4NJEP2M9ay6ZCFLfldVonyLqe"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long[] A04;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A06;
            if (strArr[0].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A06[5] = "xDmrh2CysME7FGpg0OVAAWQWrb1b5rm7";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 106);
            i13++;
        }
    }

    public static void A03() {
        String[] strArr = A06;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A06[5] = "O7i6ampyP1fRYbe4QOmd9JyFrRUTDP0J";
        A05 = new byte[]{87, 91, 99, 114, 117, 124, 27, 95, 90, 79, 90, 27, 72, 82, 65, 94, 27, 86, 82, 72, 86, 90, 79, 88, 83, 1, 27, 82, 99, 100, 109, 89, 111, 111, 97, 111, 120};
    }

    static {
        A03();
    }

    public DN(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    public DN(long j10, int i10, long j11, long j12, long[] jArr) {
        this.A02 = j10;
        this.A00 = i10;
        this.A03 = j11;
        this.A01 = j12;
        this.A04 = jArr;
    }

    private long A00(int i10) {
        return (this.A03 * i10) / 100;
    }

    public static DN A01(long j10, long j11, Ci ci, C1004Ij c1004Ij) {
        int flags;
        int i10 = ci.A04;
        int i11 = ci.A03;
        int A08 = c1004Ij.A08();
        int samplesPerFrame = A08 & 1;
        if (samplesPerFrame != 1 || (flags = c1004Ij.A0H()) == 0) {
            return null;
        }
        long dataSize = C1020Iz.A0F(flags, i10 * 1000000, i11);
        int samplesPerFrame2 = A08 & 6;
        if (samplesPerFrame2 != 6) {
            return new DN(j11, ci.A02, dataSize);
        }
        long A0H = c1004Ij.A0H();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            long durationUs = c1004Ij.A0E();
            jArr[i12] = durationUs;
        }
        if (j10 != -1 && j10 != j11 + A0H) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(A02(2, 25, 81));
            sb2.append(j10);
            sb2.append(A02(0, 2, 17));
            long durationUs2 = j11 + A0H;
            sb2.append(durationUs2);
            Log.w(A02(27, 10, 96), sb2.toString());
        }
        return new DN(j11, ci.A02, dataSize, A0H, jArr);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final long A6S() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final C0866Ck A7O(long j10) {
        long[] jArr;
        double scaledPosition;
        if (!A8g()) {
            return new C0866Ck(new C0868Cm(0L, this.A02 + this.A00));
        }
        long positionOffset = C1020Iz.A0E(j10, 0L, this.A03);
        long timeUs = this.A03;
        double d10 = (positionOffset * 100.0d) / timeUs;
        if (d10 <= 0.0d) {
            scaledPosition = 0.0d;
        } else if (d10 >= 100.0d) {
            scaledPosition = 256.0d;
        } else {
            int i10 = (int) d10;
            double d11 = this.A04[i10];
            if (A06[4].length() == 1) {
                throw new RuntimeException();
            }
            A06[4] = "";
            scaledPosition = d11 + (((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d11) * (d10 - i10));
        }
        return new C0866Ck(new C0868Cm(positionOffset, this.A02 + C1020Iz.A0E(Math.round((scaledPosition / 256.0d) * this.A01), this.A00, this.A01 - 1)));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1352Wc
    public final long A7e(long j10) {
        long j11;
        double d10;
        long positionOffset = j10 - this.A02;
        if (A8g()) {
            long j12 = this.A00;
            if (A06[4].length() != 1) {
                A06[5] = "XBnVl7Vf2qRXlKywSNR3LOgq8shxQKKO";
                if (positionOffset > j12) {
                    double d11 = (positionOffset * 256.0d) / this.A01;
                    int A0B = C1020Iz.A0B(this.A04, (long) d11, true, true);
                    long A00 = A00(A0B);
                    long j13 = this.A04[A0B];
                    long A002 = A00(A0B + 1);
                    if (j13 == (A0B == 99 ? 256L : this.A04[A0B + 1])) {
                        d10 = 0.0d;
                    } else {
                        d10 = (d11 - j13) / (j11 - j13);
                    }
                    long nextScaledPosition = Math.round((A002 - A00) * d10);
                    return nextScaledPosition + A00;
                }
                return 0L;
            }
            throw new RuntimeException();
        }
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final boolean A8g() {
        return this.A04 != null;
    }
}
