package com.facebook.ads.redexgen.X;

import android.util.Pair;

/* loaded from: assets/audience_network.dex */
public abstract class B1 {
    public static String[] A00 = {"jU13W9NSebta1ZmimveRwiImSwvynw8G", "bR9yhpeYgYLfxjGn405sIF1CLUaNKRNv", "y6GS60dgSiOKDJGhj3wt9T6pcdF3KRzS", "kAdv6lw0fV2hZ8Ef8nLl5eDcrpXJ", "gDoO0sRHxUPo6SrSL989dqr7yWBZykVP", "xoqdGlgoaRmw7wZuwViSR5WxyeJjGGpo", "tn8QhSSQsmhaZqBgPW05rXLjjsf9pF2E", "LT5aPkpwV7"};
    public static final B1 A01 = new XE();

    public abstract int A00();

    public abstract int A01();

    public abstract int A04(Object obj);

    public abstract C0832Az A0A(int i10, C0832Az c0832Az, boolean z10);

    public abstract B0 A0D(int i10, B0 b02, boolean z10, long j10);

    public int A02(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == A06(z10)) {
                return -1;
            }
            return i10 + 1;
        } else if (i11 != 1) {
            if (i11 == 2) {
                if (i10 == A06(z10)) {
                    return A05(z10);
                }
                return i10 + 1;
            }
            throw new IllegalStateException();
        } else {
            return i10;
        }
    }

    public final int A03(int nextWindowIndex, C0832Az c0832Az, B0 b02, int i10, boolean z10) {
        int i11 = A09(nextWindowIndex, c0832Az).A00;
        if (A0B(i11, b02).A01 == nextWindowIndex) {
            int A02 = A02(i11, i10, z10);
            if (A02 == -1) {
                return -1;
            }
            return A0B(A02, b02).A00;
        }
        return nextWindowIndex + 1;
    }

    public int A05(boolean z10) {
        return A0E() ? -1 : 0;
    }

    public int A06(boolean z10) {
        if (A0E()) {
            return -1;
        }
        return A01() - 1;
    }

    public final Pair<Integer, Long> A07(B0 b02, C0832Az c0832Az, int i10, long j10) {
        return A08(b02, c0832Az, i10, j10, 0L);
    }

    public final Pair<Integer, Long> A08(B0 b02, C0832Az c0832Az, int i10, long j10, long j11) {
        IK.A00(i10, 0, A01());
        A0D(i10, b02, false, j11);
        if (j10 == -9223372036854775807L) {
            j10 = b02.A01();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = b02.A00;
        long A03 = b02.A03() + j10;
        long A07 = A09(i11, c0832Az).A07();
        while (A07 != -9223372036854775807L) {
            int i12 = (A03 > A07 ? 1 : (A03 == A07 ? 0 : -1));
            if (A00[7].length() == 24) {
                throw new RuntimeException();
            }
            A00[7] = "t4u2YUU8OEdoMFYJ2jQWzxX4wha";
            if (i12 < 0 || i11 >= b02.A01) {
                break;
            }
            A03 -= A07;
            i11++;
            A07 = A09(i11, c0832Az).A07();
        }
        return Pair.create(Integer.valueOf(i11), Long.valueOf(A03));
    }

    public final C0832Az A09(int i10, C0832Az c0832Az) {
        return A0A(i10, c0832Az, false);
    }

    public final B0 A0B(int i10, B0 b02) {
        return A0C(i10, b02, false);
    }

    public final B0 A0C(int i10, B0 b02, boolean z10) {
        return A0D(i10, b02, z10, 0L);
    }

    public final boolean A0E() {
        return A01() == 0;
    }

    public final boolean A0F(int i10, C0832Az c0832Az, B0 b02, int i11, boolean z10) {
        return A03(i10, c0832Az, b02, i11, z10) == -1;
    }
}
