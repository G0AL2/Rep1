package com.facebook.ads.redexgen.X;

import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: assets/audience_network.dex */
public final class BI implements InterfaceC1315Uo, Comparator<I8> {
    public static String[] A03 = {"qrCZDebBZXOMsu5PI8FdamZv", "usPTrKdLrE7MLvxS6mJMRwkls4hZpcPz", "BDrpv9J1bckqz2zbQbGMwvdv", "cHdTuf55w1r5Lcr9n47avjSAGBdp9rLc", "v1mI", "NFtkBlX9Mz", "lz", "jBDMosIM65rjrOuIbY8WA7ZUxyDm84U3"};
    public long A00;
    public final long A01;
    public final TreeSet<I8> A02 = new TreeSet<>(this);

    public BI(long j10) {
        this.A01 = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00 */
    public final int compare(I8 i82, I8 i83) {
        if (i82.A00 - i83.A00 == 0) {
            return i82.compareTo(i83);
        }
        return i82.A00 < i83.A00 ? -1 : 1;
    }

    private void A01(I4 i42, long j10) {
        while (this.A00 + j10 > this.A01) {
            boolean isEmpty = this.A02.isEmpty();
            if (A03[4].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "3qXh8T5e4LOlD1IWJEc6SNWF";
            strArr[2] = "YJzC3pPkQPrTmiUzc4g95RWz";
            if (!isEmpty) {
                try {
                    i42.ADx(this.A02.first());
                } catch (I2 unused) {
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final void ACN(I4 i42, I8 i82) {
        this.A02.add(i82);
        this.A00 += i82.A01;
        A01(i42, 0L);
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final void ACO(I4 i42, I8 i82) {
        this.A02.remove(i82);
        this.A00 -= i82.A01;
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final void ACP(I4 i42, I8 i82, I8 i83) {
        ACO(i42, i82);
        ACN(i42, i83);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1315Uo
    public final void ACQ(I4 i42, String str, long j10, long j11) {
        A01(i42, j11);
    }
}
