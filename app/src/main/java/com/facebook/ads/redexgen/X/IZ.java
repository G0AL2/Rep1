package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class IZ {
    public static byte[] A02;
    public int A00;
    public long[] A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{61, 49, 98, 120, 107, 116, 49, 120, 98, 49, 89, 126, 102, 113, 124, 121, 116, 48, 121, 126, 116, 117, 104, 48};
    }

    public IZ() {
        this(32);
    }

    public IZ(int i10) {
        this.A01 = new long[i10];
    }

    public final int A02() {
        return this.A00;
    }

    public final long A03(int i10) {
        if (i10 >= 0 && i10 < this.A00) {
            return this.A01[i10];
        }
        throw new IndexOutOfBoundsException(A00(10, 14, 61) + i10 + A00(0, 10, 60) + this.A00);
    }

    public final void A04(long j10) {
        int i10 = this.A00;
        long[] jArr = this.A01;
        if (i10 == jArr.length) {
            this.A01 = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.A01;
        int i11 = this.A00;
        this.A00 = i11 + 1;
        jArr2[i11] = j10;
    }

    public final long[] A05() {
        return Arrays.copyOf(this.A01, this.A00);
    }
}
