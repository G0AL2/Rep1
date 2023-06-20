package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Dg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0878Dg implements InterfaceC1352Wc {
    public static byte[] A03;
    public static String[] A04 = {"hwqziZW7AZPod2dXLouvGwTTrlxQftu5", "HWTvO3PtXP9N2f8hjjNBE5ELyu96O7C2", "XZiXxIUms072zxq0eptbFHl9id1xfsii", "R678H1T6QVa3UEsgGNCZuIT3k3f5TJMX", "R3CvDfTCre2oGIfhbqMtFAzPo9CSve3e", "yCxuKEdtUnEmK00296URo1FADbxWErUf", "IeIjE9tQRhU2QKWiPhSO822TtqgvRx0R", "yf6PTLZVRmp8JK3c15ye5co8mawgp7Wk"};
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        if (A04[1].charAt(18) != 'N') {
            throw new RuntimeException();
        }
        A04[1] = "IGRalwhGPANuEueVyyNisaHhdEkfW4kv";
        A03 = new byte[]{-117, Byte.MAX_VALUE, -52, -72, -56, -65, -106, -38, -41, -22, -41, -106, -23, -33, -16, -37, -106, -29, -33, -23, -29, -41, -22, -39, -34, -80, -106, -74, -62, -46, -55, -77, -59, -59, -53, -59, -46};
    }

    static {
        A02();
    }

    public C0878Dg(long[] jArr, long[] jArr2, long j10) {
        this.A02 = jArr;
        this.A01 = jArr2;
        this.A00 = j10;
    }

    public static C0878Dg A00(long durationUs, long j10, Ci ci, C1004Ij c1004Ij) {
        int A0E;
        long position = j10;
        c1004Ij.A0Z(10);
        int A08 = c1004Ij.A08();
        if (A08 <= 0) {
            return null;
        }
        int i10 = ci.A03;
        long A0F = C1020Iz.A0F(A08, 1000000 * (i10 >= 32000 ? 1152 : 576), i10);
        int A0I = c1004Ij.A0I();
        int A0I2 = c1004Ij.A0I();
        int A0I3 = c1004Ij.A0I();
        c1004Ij.A0Z(2);
        int scale = ci.A02;
        long j11 = position + scale;
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        for (int i11 = 0; i11 < A0I; i11++) {
            jArr[i11] = (i11 * A0F) / A0I;
            jArr2[i11] = Math.max(position, j11);
            if (A0I3 == 1) {
                A0E = c1004Ij.A0E();
            } else if (A0I3 == 2) {
                A0E = c1004Ij.A0I();
            } else if (A0I3 == 3) {
                A0E = c1004Ij.A0G();
            } else if (A0I3 != 4) {
                return null;
            } else {
                A0E = c1004Ij.A0H();
            }
            position += A0E * A0I2;
            int segmentSize = A04[7].charAt(10);
            if (segmentSize == 80) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[5] = "SApHUsB0TeciBaZ8FVEH7XQ0HhkRahgp";
            strArr[4] = "ro1Cj1bOUorcqHsrq9aZZzvMMKgEvTZf";
        }
        int entryCount = (durationUs > (-1L) ? 1 : (durationUs == (-1L) ? 0 : -1));
        if (entryCount != 0) {
            int entryCount2 = (durationUs > position ? 1 : (durationUs == position ? 0 : -1));
            if (entryCount2 != 0) {
                Log.w(A01(27, 10, 57), A01(2, 25, 79) + durationUs + A01(0, 2, 56) + position);
            }
        }
        return new C0878Dg(jArr, jArr2, A0F);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final long A6S() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final C0866Ck A7O(long j10) {
        int A0B = C1020Iz.A0B(this.A02, j10, true, true);
        C0868Cm c0868Cm = new C0868Cm(this.A02[A0B], this.A01[A0B]);
        if (c0868Cm.A01 < j10) {
            long[] jArr = this.A02;
            if (A0B != jArr.length - 1) {
                return new C0866Ck(c0868Cm, new C0868Cm(jArr[A0B + 1], this.A01[A0B + 1]));
            }
        }
        return new C0866Ck(c0868Cm);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1352Wc
    public final long A7e(long j10) {
        return this.A02[C1020Iz.A0B(this.A01, j10, true, true)];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final boolean A8g() {
        return true;
    }
}
