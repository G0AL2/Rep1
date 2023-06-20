package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Ae  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0812Ae {
    public static String[] A0C = {"L0u3smBC6U6OaYtXppAd31iOC3v5Qhxz", "mD", "DMmTpdJrujAgbmCwwmXMokmpSOB8XVVu", "Fa0SCWKpXCwAFqaC3HE", "LFAAfAeIJjtENyizMXbJJCIXxkMYQ2BS", "EOXOixXcPNGoqbhwUMphXmxbz6TL9K", "ydRMenJrqCbsHYuDZ17G4nGASKkEf2si", "4zZeHgY0eMzISLpxtPc37pmrQXWGSxn"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C0810Ac A04;
    public C0810Ac A05;
    public C0810Ac A06;
    public B1 A07;
    public Object A08;
    public boolean A09;
    public final C0832Az A0A = new C0832Az();
    public final B0 A0B = new B0();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C0811Ad A02(int i10, long j10, long j11) {
        FY fy = new FY(i10, j11);
        this.A07.A09(fy.A02, this.A0A);
        int A04 = this.A0A.A04(j10);
        long A09 = A04 == -1 ? Long.MIN_VALUE : this.A0A.A09(A04);
        boolean A0A = A0A(fy, A09);
        return new C0811Ad(fy, j10, A09, -9223372036854775807L, A09 == Long.MIN_VALUE ? this.A0A.A07() : A09, A0A, A0B(fy, A0A));
    }

    private long A00(int i10) {
        int oldFrontPeriodIndex;
        Object obj = this.A07.A0A(i10, this.A0A, true).A03;
        int i11 = this.A0A.A00;
        Object obj2 = this.A08;
        if (obj2 != null && (oldFrontPeriodIndex = this.A07.A04(obj2)) != -1) {
            int oldFrontWindowIndex = this.A07.A09(oldFrontPeriodIndex, this.A0A).A00;
            if (oldFrontWindowIndex == i11) {
                return this.A03;
            }
        }
        for (C0810Ac A0E = A0E(); A0E != null; A0E = A0E.A01) {
            if (A0E.A09.equals(obj)) {
                return A0E.A02.A04.A03;
            }
        }
        for (C0810Ac A0E2 = A0E(); A0E2 != null; A0E2 = A0E2.A01) {
            int A04 = this.A07.A04(A0E2.A09);
            if (A04 != -1) {
                int holderWindowIndex = this.A07.A09(A04, this.A0A).A00;
                if (holderWindowIndex == i11) {
                    return A0E2.A02.A04.A03;
                }
            }
        }
        long j10 = this.A02;
        this.A02 = 1 + j10;
        return j10;
    }

    private C0811Ad A01(int i10, int i11, int i12, long durationUs, long j10) {
        long j11;
        FY fy = new FY(i10, i11, i12, j10);
        boolean A0A = A0A(fy, Long.MIN_VALUE);
        boolean A0B = A0B(fy, A0A);
        long A0A2 = this.A07.A09(fy.A02, this.A0A).A0A(fy.A00, fy.A01);
        if (i12 == this.A0A.A02(i11)) {
            j11 = this.A0A.A06();
        } else {
            j11 = 0;
        }
        return new C0811Ad(fy, j11, Long.MIN_VALUE, durationUs, A0A2, A0A, A0B);
    }

    @Nullable
    private C0811Ad A03(C0810Ac c0810Ac, long j10) {
        long j11;
        C0811Ad c0811Ad = c0810Ac.A02;
        if (c0811Ad.A06) {
            int A03 = this.A07.A03(c0811Ad.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            if (A03 == -1) {
                return null;
            }
            int i10 = this.A07.A0A(A03, this.A0A, true).A00;
            Object obj = this.A0A.A03;
            long j12 = c0811Ad.A04.A03;
            if (this.A07.A0B(i10, this.A0B).A00 == A03) {
                long windowSequenceNumber = c0810Ac.A07();
                Pair<Integer, Long> A08 = this.A07.A08(this.A0B, this.A0A, i10, -9223372036854775807L, Math.max(0L, (windowSequenceNumber + c0811Ad.A01) - j10));
                if (A08 == null) {
                    return null;
                }
                Object nextPeriodUid = A08.first;
                A03 = ((Integer) nextPeriodUid).intValue();
                Object nextPeriodUid2 = A08.second;
                j11 = ((Long) nextPeriodUid2).longValue();
                Object nextPeriodUid3 = c0810Ac.A01;
                if (nextPeriodUid3 != null && c0810Ac.A01.A09.equals(obj)) {
                    j12 = c0810Ac.A01.A02.A04.A03;
                } else {
                    j12 = this.A02;
                    long startPositionUs = j12 + 1;
                    this.A02 = startPositionUs;
                }
            } else {
                j11 = 0;
            }
            return A06(A07(A03, j11, j12), j11, j11);
        }
        FY currentPeriodId = c0811Ad.A04;
        this.A07.A09(currentPeriodId.A02, this.A0A);
        if (currentPeriodId.A01()) {
            int adGroupIndex = currentPeriodId.A00;
            int A01 = this.A0A.A01(adGroupIndex);
            if (A01 == -1) {
                return null;
            }
            int adCountInCurrentAdGroup = this.A0A.A03(adGroupIndex, currentPeriodId.A01);
            if (adCountInCurrentAdGroup < A01) {
                if (!this.A0A.A0E(adGroupIndex, adCountInCurrentAdGroup)) {
                    return null;
                }
                return A01(currentPeriodId.A02, adGroupIndex, adCountInCurrentAdGroup, c0811Ad.A00, currentPeriodId.A03);
            }
            return A02(currentPeriodId.A02, c0811Ad.A00, currentPeriodId.A03);
        }
        long j13 = c0811Ad.A02;
        if (A0C[6].charAt(23) != 'A') {
            throw new RuntimeException();
        }
        A0C[1] = "6G";
        if (j13 != Long.MIN_VALUE) {
            int A05 = this.A0A.A05(c0811Ad.A02);
            if (A05 == -1) {
                return A02(currentPeriodId.A02, c0811Ad.A02, currentPeriodId.A03);
            }
            int A02 = this.A0A.A02(A05);
            if (!this.A0A.A0E(A05, A02)) {
                return null;
            }
            return A01(currentPeriodId.A02, A05, A02, c0811Ad.A02, currentPeriodId.A03);
        }
        int A00 = this.A0A.A00();
        if (A00 == 0) {
            return null;
        }
        int i11 = A00 - 1;
        if (this.A0A.A09(i11) != Long.MIN_VALUE || this.A0A.A0D(i11)) {
            return null;
        }
        int adGroupCount = this.A0A.A02(i11);
        if (!this.A0A.A0E(i11, adGroupCount)) {
            return null;
        }
        long A07 = this.A0A.A07();
        int i12 = currentPeriodId.A02;
        long contentDurationUs = currentPeriodId.A03;
        return A01(i12, i11, adGroupCount, A07, contentDurationUs);
    }

    private C0811Ad A04(C0811Ad c0811Ad, FY fy) {
        long A07;
        long j10 = c0811Ad.A03;
        long endPositionUs = c0811Ad.A02;
        boolean A0A = A0A(fy, endPositionUs);
        boolean A0B = A0B(fy, A0A);
        this.A07.A09(fy.A02, this.A0A);
        boolean isLastInPeriod = fy.A01();
        if (isLastInPeriod) {
            A07 = this.A0A.A0A(fy.A00, fy.A01);
        } else if (A0C[2].charAt(30) != 'V') {
            throw new RuntimeException();
        } else {
            A0C[2] = "zTzAUiYM1BrQqeObFTyCKDEgqKKR2HVC";
            A07 = endPositionUs == Long.MIN_VALUE ? this.A0A.A07() : endPositionUs;
        }
        return new C0811Ad(fy, j10, endPositionUs, c0811Ad.A00, A07, A0A, A0B);
    }

    private C0811Ad A05(C0814Ag c0814Ag) {
        return A06(c0814Ag.A04, c0814Ag.A01, c0814Ag.A02);
    }

    private C0811Ad A06(FY fy, long j10, long j11) {
        this.A07.A09(fy.A02, this.A0A);
        if (fy.A01()) {
            if (!this.A0A.A0E(fy.A00, fy.A01)) {
                return null;
            }
            return A01(fy.A02, fy.A00, fy.A01, j10, fy.A03);
        }
        return A02(fy.A02, j11, fy.A03);
    }

    private FY A07(int i10, long j10, long j11) {
        this.A07.A09(i10, this.A0A);
        int A05 = this.A0A.A05(j10);
        if (A05 == -1) {
            return new FY(i10, j11);
        }
        return new FY(i10, A05, this.A0A.A02(A05), j11);
    }

    private boolean A08() {
        C0810Ac A0E = A0E();
        if (A0E == null) {
            return true;
        }
        while (true) {
            int A03 = this.A07.A03(A0E.A02.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            while (A0E.A01 != null && !A0E.A02.A06) {
                A0E = A0E.A01;
            }
            if (A03 == -1 || A0E.A01 == null || A0E.A01.A02.A04.A02 != A03) {
                break;
            }
            A0E = A0E.A01;
        }
        boolean A0S = A0S(A0E);
        A0E.A02 = A04(A0E.A02, A0E.A02.A04);
        if (A0S) {
            boolean A0P = A0P();
            if (A0C[7].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "GuDKwHudSgXHMcEdzJg";
            strArr[5] = "TrxgVcYEVqGsLQMDNrMk5TDxlvQhmk";
            return !A0P;
        }
        return true;
    }

    private boolean A09(C0810Ac c0810Ac, C0811Ad c0811Ad) {
        C0811Ad c0811Ad2 = c0810Ac.A02;
        return c0811Ad2.A03 == c0811Ad.A03 && c0811Ad2.A02 == c0811Ad.A02 && c0811Ad2.A04.equals(c0811Ad.A04);
    }

    private boolean A0A(FY fy, long j10) {
        int A00 = this.A07.A09(fy.A02, this.A0A).A00();
        if (A00 == 0) {
            return true;
        }
        int i10 = A00 - 1;
        boolean A01 = fy.A01();
        if (this.A0A.A09(i10) != Long.MIN_VALUE) {
            return !A01 && j10 == Long.MIN_VALUE;
        }
        int postrollAdCount = this.A0A.A01(i10);
        if (postrollAdCount == -1) {
            return false;
        }
        if (A01 && fy.A00 == i10 && fy.A01 == postrollAdCount + (-1)) {
            return true;
        }
        return !A01 && this.A0A.A02(i10) == postrollAdCount;
    }

    private boolean A0B(FY fy, boolean z10) {
        return !this.A07.A0B(this.A07.A09(fy.A02, this.A0A).A00, this.A0B).A08 && this.A07.A0F(fy.A02, this.A0A, this.A0B, this.A01, this.A09) && z10;
    }

    public final C0810Ac A0C() {
        C0810Ac c0810Ac = this.A05;
        if (c0810Ac != null) {
            if (c0810Ac == this.A06) {
                this.A06 = c0810Ac.A01;
            }
            this.A05.A0D();
            this.A00--;
            if (this.A00 == 0) {
                this.A04 = null;
                this.A08 = this.A05.A09;
                this.A03 = this.A05.A02.A04.A03;
            }
            this.A05 = this.A05.A01;
        } else {
            C0810Ac c0810Ac2 = this.A04;
            this.A05 = c0810Ac2;
            this.A06 = c0810Ac2;
        }
        return this.A05;
    }

    public final C0810Ac A0D() {
        C0810Ac c0810Ac = this.A06;
        IK.A04((c0810Ac == null || c0810Ac.A01 == null) ? false : true);
        if (A0C[7].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "7koWfuH1ta1EVLUWQFGgmnLKJoN2uwxl";
        strArr[0] = "1LlHzPavDhI1SmiN1gPMgWkfsuEkohyV";
        this.A06 = this.A06.A01;
        return this.A06;
    }

    public final C0810Ac A0E() {
        return A0P() ? this.A05 : this.A04;
    }

    public final C0810Ac A0F() {
        return this.A04;
    }

    public final C0810Ac A0G() {
        return this.A05;
    }

    public final C0810Ac A0H() {
        return this.A06;
    }

    @Nullable
    public final C0811Ad A0I(long j10, C0814Ag c0814Ag) {
        C0810Ac c0810Ac = this.A04;
        if (c0810Ac == null) {
            return A05(c0814Ag);
        }
        return A03(c0810Ac, j10);
    }

    public final C0811Ad A0J(C0811Ad c0811Ad, int i10) {
        return A04(c0811Ad, c0811Ad.A04.A00(i10));
    }

    public final VW A0K(InterfaceC0828Au[] interfaceC0828AuArr, HT ht, HW hw, InterfaceC0919Fa interfaceC0919Fa, Object obj, C0811Ad c0811Ad) {
        long A07;
        C0810Ac c0810Ac = this.A04;
        if (c0810Ac != null) {
            A07 = c0810Ac.A07() + this.A04.A02.A01;
        } else {
            A07 = c0811Ad.A03;
        }
        C0810Ac c0810Ac2 = new C0810Ac(interfaceC0828AuArr, A07, ht, hw, interfaceC0919Fa, obj, c0811Ad);
        if (this.A04 != null) {
            IK.A04(A0P());
            this.A04.A01 = c0810Ac2;
        }
        this.A08 = null;
        this.A04 = c0810Ac2;
        this.A00++;
        return c0810Ac2.A08;
    }

    public final FY A0L(int i10, long j10) {
        return A07(i10, j10, A00(i10));
    }

    public final void A0M(long j10) {
        C0810Ac c0810Ac = this.A04;
        if (c0810Ac != null) {
            c0810Ac.A0G(j10);
        }
    }

    public final void A0N(B1 b12) {
        this.A07 = b12;
    }

    public final void A0O(boolean z10) {
        C0810Ac A0E = A0E();
        if (A0E != null) {
            this.A08 = z10 ? A0E.A09 : null;
            this.A03 = A0E.A02.A04.A03;
            A0E.A0D();
            A0S(A0E);
        } else if (!z10) {
            this.A08 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A0P() {
        return this.A05 != null;
    }

    public final boolean A0Q() {
        C0810Ac c0810Ac = this.A04;
        return c0810Ac == null || (!c0810Ac.A02.A05 && this.A04.A0H() && this.A04.A02.A01 != -9223372036854775807L && this.A00 < 100);
    }

    public final boolean A0R(int i10) {
        this.A01 = i10;
        return A08();
    }

    public final boolean A0S(C0810Ac c0810Ac) {
        IK.A04(c0810Ac != null);
        boolean z10 = false;
        this.A04 = c0810Ac;
        while (c0810Ac.A01 != null) {
            c0810Ac = c0810Ac.A01;
            if (c0810Ac == this.A06) {
                this.A06 = this.A05;
                z10 = true;
            }
            c0810Ac.A0D();
            this.A00--;
        }
        this.A04.A01 = null;
        return z10;
    }

    public final boolean A0T(VW vw) {
        C0810Ac c0810Ac = this.A04;
        return c0810Ac != null && c0810Ac.A08 == vw;
    }

    public final boolean A0U(FY fy, long j10) {
        int i10 = fy.A02;
        C0810Ac c0810Ac = null;
        for (C0810Ac A0E = A0E(); A0E != null; A0E = A0E.A01) {
            if (c0810Ac == null) {
                A0E.A02 = A0J(A0E.A02, i10);
            } else {
                if (i10 != -1) {
                    Object obj = A0E.A09;
                    if (A0C[2].charAt(30) != 'V') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0C;
                    strArr[4] = "cRCq0i1JCmFgPvSHr0NI30IAvGtOkPUO";
                    strArr[0] = "aqPjT6JpLbsnsfh6iIpVbm4IivKwupA2";
                    if (obj.equals(this.A07.A0A(i10, this.A0A, true).A03)) {
                        C0811Ad A03 = A03(c0810Ac, j10);
                        if (A03 == null) {
                            return true ^ A0S(c0810Ac);
                        }
                        A0E.A02 = A0J(A0E.A02, i10);
                        if (!A09(A0E, A03)) {
                            return true ^ A0S(c0810Ac);
                        }
                    }
                }
                return true ^ A0S(c0810Ac);
            }
            if (A0E.A02.A06) {
                i10 = this.A07.A03(i10, this.A0A, this.A0B, this.A01, this.A09);
            }
            c0810Ac = A0E;
        }
        return true;
    }

    public final boolean A0V(boolean z10) {
        this.A09 = z10;
        return A08();
    }
}
