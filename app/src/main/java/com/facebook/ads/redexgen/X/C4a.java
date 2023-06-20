package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.4a  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4a {
    public static String[] A02 = {"hO0SXlIn7n5HXEBLx", "jESNVpuYnHPlnh4DZ", "CDLwN7DwmtArlNd144q1QIOvLDqs4yZF", "JntNhgZ58kYFXbwiJ6hzeVdvPNGn00kF", "yTsWpbzmHeCmcQEDkb0QkT5J3TV6CkfD", "Lh9pded4Clz2", "gnDNjs3GBImfOnnM5uEQWokXBd1c", "C4tnEN178k9sL9bIxtVolUttiI5dEdE5"};
    public SparseArray<C4Z> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j10, long j11) {
        if (j10 == 0) {
            return j11;
        }
        long j12 = j10 / 4;
        String[] strArr = A02;
        if (strArr[3].charAt(9) != strArr[7].charAt(9)) {
            throw new RuntimeException();
        }
        A02[4] = "GTVZcsVJP0WVKaHbsMtSVk9gu6Gyk4Ss";
        return (j12 * 3) + (j11 / 4);
    }

    private C4Z A01(int i10) {
        C4Z c4z = this.A00.get(i10);
        if (c4z == null) {
            C4Z c4z2 = new C4Z();
            this.A00.put(i10, c4z2);
            return c4z2;
        }
        return c4z;
    }

    private final void A02() {
        for (int i10 = 0; i10 < this.A00.size(); i10++) {
            this.A00.valueAt(i10).A03.clear();
        }
    }

    public final AbstractC06774l A03(int i10) {
        C4Z c4z = this.A00.get(i10);
        if (c4z != null && !c4z.A03.isEmpty()) {
            ArrayList<AbstractC06774l> arrayList = c4z.A03;
            if (A02[4].charAt(1) != 'T') {
                throw new RuntimeException();
            }
            A02[6] = "6zOEmNGiTAHU1v9SGa3";
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i10, long j10) {
        C4Z A01 = A01(i10);
        A01.A01 = A00(A01.A01, j10);
    }

    public final void A06(int i10, long j10) {
        C4Z A01 = A01(i10);
        A01.A02 = A00(A01.A02, j10);
    }

    public final void A07(C4H c4h) {
        this.A01++;
    }

    public final void A08(C4H c4h, C4H c4h2, boolean z10) {
        if (c4h != null) {
            A04();
        }
        if (!z10 && this.A01 == 0) {
            A02();
        }
        if (c4h2 != null) {
            A07(c4h2);
        }
    }

    public final void A09(AbstractC06774l abstractC06774l) {
        int A0H = abstractC06774l.A0H();
        ArrayList<AbstractC06774l> arrayList = A01(A0H).A03;
        if (this.A00.get(A0H).A00 <= arrayList.size()) {
            return;
        }
        abstractC06774l.A0Q();
        String[] strArr = A02;
        if (strArr[3].charAt(9) != strArr[7].charAt(9)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "TnDeXYrDbfmyODeGX";
        strArr2[5] = "ziritv0xfrad";
        arrayList.add(abstractC06774l);
    }

    public final boolean A0A(int i10, long j10, long j11) {
        long j12 = A01(i10).A01;
        return j12 == 0 || j10 + j12 < j11;
    }

    public final boolean A0B(int i10, long j10, long j11) {
        long j12 = A01(i10).A02;
        return j12 == 0 || j10 + j12 < j11;
    }
}
