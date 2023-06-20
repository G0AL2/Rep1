package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.c6  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1583c6 implements InterfaceC06573q {
    public static byte[] A01;
    public static String[] A02 = {"m0v39bkLL0n2S0xNgN89hz2dGOcTpwho", "Je1TSnUfgjz87J45b10M9zAxXIUpZahJ", "5NPz60Ycb2xlrnlJbjQuqitLPDDjbzHA", "GN4TkK3T6zCNiBjoupvxTPY", "uEyRXI1LEgEguUOEBvXDLSZ", "uM6injuc1j2LJ4wHPsuMaMxVec9yzmkB", "WB5Y9xOLXhFok7BjZ8qu5ygjzkxXvdjS", "QTx8NC78KyDJtqbkFzNokRxLjqTFyIiz"};
    public final /* synthetic */ F9 A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 37);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-39, -9, 2, 2, -5, -6, -74, -9, 10, 10, -9, -7, -2, -74, 5, 4, -74, -9, -74, -7, -2, -1, 2, -6, -74, 13, -2, -1, -7, -2, -74, -1, 9, -74, 4, 5, 10, -74, -6, -5, 10, -9, -7, -2, -5, -6, -48, -74, -75, -77, -66, -66, -73, -74, 114, -74, -73, -58, -77, -75, -70, 114, -63, -64, 114, -77, -64, 114, -77, -66, -60, -73, -77, -74, -53, 114, -74, -73, -58, -77, -75, -70, -73, -74, 114, -75, -70, -69, -66, -74, 114};
    }

    static {
        A01();
    }

    public C1583c6(F9 f92) {
        this.A00 = f92;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06573q
    public final void A3T(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        AbstractC06774l A0G = F9.A0G(view);
        if (A0G != null) {
            if (A0G.A0e() || A0G.A0h()) {
                A0G.A0P();
            } else {
                throw new IllegalArgumentException(A00(0, 48, 113) + A0G + this.A00.A1I());
            }
        }
        this.A00.attachViewToParent(view, i10, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06573q
    public final void A4m(int i10) {
        AbstractC06774l A0G;
        View A5z = A5z(i10);
        if (A5z != null && (A0G = F9.A0G(A5z)) != null) {
            if (!A0G.A0e() || A0G.A0h()) {
                A0G.A0T(256);
            } else {
                throw new IllegalArgumentException(A00(48, 43, 45) + A0G + this.A00.A1I());
            }
        }
        this.A00.detachViewFromParent(i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06573q
    public final View A5z(int i10) {
        return this.A00.getChildAt(i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06573q
    public final int A60() {
        return this.A00.getChildCount();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06573q
    public final AbstractC06774l A63(View view) {
        return F9.A0G(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06573q
    public final int A8H(View view) {
        return this.A00.indexOfChild(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06573q
    public final void AAh(View view) {
        AbstractC06774l A0G = F9.A0G(view);
        if (A0G != null) {
            A0G.A07(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06573q
    public final void ABD(View view) {
        AbstractC06774l A0G = F9.A0G(view);
        if (A0G != null) {
            A0G.A08(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06573q
    public final void ADu() {
        int i10 = A60();
        for (int i11 = 0; i11 < i10; i11++) {
            View A5z = A5z(i11);
            this.A00.A1i(A5z);
            A5z.clearAnimation();
        }
        this.A00.removeAllViews();
        String[] strArr = A02;
        if (strArr[3].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A02[2] = "YVtNrV2twtC96zFGqk3M5li58NeZhLji";
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06573q
    public final void ADy(int i10) {
        View childAt = this.A00.getChildAt(i10);
        if (childAt != null) {
            this.A00.A1i(childAt);
            childAt.clearAnimation();
        }
        F9 f92 = this.A00;
        if (A02[2].charAt(25) == 'R') {
            throw new RuntimeException();
        }
        A02[2] = "BurwQQkBxJzMJJK1acCycPqXpvrCcXzS";
        f92.removeViewAt(i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06573q
    public final void addView(View view, int i10) {
        this.A00.addView(view, i10);
        this.A00.A1h(view);
    }
}
