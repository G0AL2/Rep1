package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import com.facebook.ads.redexgen.X.AbstractC06774l;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4H  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C4H<VH extends AbstractC06774l> {
    public static byte[] A02;
    public static String[] A03 = {"W324oDAhe3QD27ZyNAxx1dE4409WhTwA", "Ikg10MzvREcGgl38", "tAS262iMJzRr57vvpxPoG7SYxewns3xN", "rCt", "3uu7", "cbDGC8uMMSmc1mSYy17nilWnTwttZfvA", "2T", "U5f6pdP97"};
    public final C4I A01 = new C4I();
    public boolean A00 = false;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[2].charAt(21) != '7') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[1] = "WHsKZN6zyncpMK6d";
            strArr[4] = "wlW4";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 32);
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-48, -44, -98, -63, -16, -29, -33, -14, -29, -44, -25, -29, -11, -54, -50, -104, -57, -26, -70, -31, -26, -36, -50, -31, -35, -17};
    }

    public abstract VH A06(ViewGroup viewGroup, int i10);

    public abstract int A0D();

    public abstract void A0E(VH vh, int i10);

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4H != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4l> */
    private final void A02(VH holder, int i10, List<Object> payloads) {
        A0E(holder, i10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4H != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4l> */
    public final int A03(int i10) {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4H != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4l> */
    public final long A04(int i10) {
        return -1L;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4H != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4l> */
    public final VH A05(ViewGroup viewGroup, int i10) {
        C2V.A01(A00(0, 13, 94));
        VH A06 = A06(viewGroup, i10);
        A06.A00 = i10;
        C2V.A00();
        return A06;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4H != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4l> */
    public final void A07() {
        this.A01.A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4H != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4l> */
    public final void A08(C4J c4j) {
        this.A01.registerObserver(c4j);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4H != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4l> */
    public final void A09(C4J c4j) {
        this.A01.unregisterObserver(c4j);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4H != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4l> */
    public final void A0A(VH vh, int i10) {
        vh.A03 = i10;
        if (A0B()) {
            long A04 = A04(i10);
            String[] strArr = A03;
            if (strArr[7].length() != strArr[6].length()) {
                String[] strArr2 = A03;
                strArr2[7] = "OgtetI94x";
                strArr2[6] = "QU";
                vh.A05 = A04;
            }
            throw new RuntimeException();
        }
        vh.A0U(1, 519);
        C2V.A01(A00(13, 13, 88));
        A02(vh, i10, vh.A0L());
        vh.A0N();
        ViewGroup.LayoutParams layoutParams = vh.A0H.getLayoutParams();
        if (layoutParams instanceof C4U) {
            ((C4U) layoutParams).A01 = true;
        }
        C2V.A00();
        String[] strArr3 = A03;
        if (strArr3[5].charAt(31) == strArr3[0].charAt(31)) {
            String[] strArr4 = A03;
            strArr4[7] = "GQKIQ0ZEK";
            strArr4[6] = "Zf";
            return;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4H != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4l> */
    public final boolean A0B() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4H != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4l> */
    public final boolean A0C(VH vh) {
        return false;
    }
}
