package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.2W  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2W {
    public static final int[] A00 = new int[0];
    public static final long[] A01 = new long[0];
    public static final Object[] A02 = new Object[0];

    public static int A00(int i10) {
        return A01(i10 * 8) / 8;
    }

    public static int A01(int i10) {
        for (int i11 = 4; i11 < 32; i11++) {
            if (i10 <= (1 << i11) - 12) {
                return (1 << i11) - 12;
            }
        }
        return i10;
    }

    public static int A02(int[] iArr, int i10, int mid) {
        int midVal = 0;
        int i11 = i10 - 1;
        while (midVal <= i11) {
            int i12 = (midVal + i11) >>> 1;
            int i13 = iArr[i12];
            if (i13 < mid) {
                midVal = i12 + 1;
            } else if (i13 > mid) {
                i11 = i12 - 1;
            } else {
                return i12;
            }
        }
        return midVal ^ (-1);
    }

    public static int A03(long[] jArr, int i10, long j10) {
        int i11 = 0;
        int i12 = i10 - 1;
        while (i11 <= i12) {
            int i13 = (i11 + i12) >>> 1;
            long j11 = jArr[i13];
            if (j11 < j10) {
                i11 = i13 + 1;
            } else if (j11 > j10) {
                i12 = i13 - 1;
            } else {
                return i13;
            }
        }
        return i11 ^ (-1);
    }

    public static boolean A04(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
