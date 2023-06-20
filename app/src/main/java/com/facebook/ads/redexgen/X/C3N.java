package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewParent;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3N  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C3N {
    public static byte[] A00;
    public static String[] A01 = {"Xrw23x", "7zPMnydgs3TxzLPidxoXPZBjc3W6JcCM", "VSpvz3ms1TmmGNHPZhiUX8aR3VKIqH3F", "EaUoYVziD6tZiyhi6MmXXr0L0WyyrmGO", "9W1llKphA1b", "WQVWtmgxG", "pfsLxZCw3", "djLiMbltlOZxr4Y20a1py0MoB6XUOCsc"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[4].length() == 2) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[1] = "srEyXaBrGYJEdyGE0emXwaTG9JSL50Tx";
            strArr[3] = "2nDKISaqZLGgZgCCbZWXnJ7EV4EzVcvR";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 63);
            i13++;
        }
    }

    public static void A01() {
        A00 = new byte[]{-65, -66, -98, -75, -61, -60, -75, -76, -96, -62, -75, -93, -77, -62, -65, -68, -68, -59, -60, -92, -69, -55, -54, -69, -70, -87, -71, -56, -59, -62, -62, 26, 25, -7, 16, 30, 31, 16, 15, -2, 14, 29, 26, 23, 23, -20, 14, 14, 16, 27, 31, 16, 15, -26, -27, -54, -21, -26, -25, -59, -36, -22, -21, -36, -37, -54, -38, -23, -26, -29, -29};
    }

    static {
        A01();
    }

    public void A03(ViewParent viewParent, View view) {
        if (viewParent instanceof InterfaceC06332r) {
            throw new NullPointerException(A00(53, 18, 56));
        }
    }

    public void A04(ViewParent viewParent, View view, int i10, int i11, int i12, int i13) {
        if (viewParent instanceof InterfaceC06332r) {
            throw new NullPointerException(A00(17, 14, 23));
        }
    }

    public void A05(ViewParent viewParent, View view, int i10, int i11, int[] iArr) {
        if (viewParent instanceof InterfaceC06332r) {
            throw new NullPointerException(A00(0, 17, 17));
        }
    }

    public void A06(ViewParent viewParent, View view, View view2, int i10) {
        if (viewParent instanceof InterfaceC06332r) {
            throw new NullPointerException(A00(31, 22, 108));
        }
    }

    public boolean A07(ViewParent viewParent, View view, float f10, float f11) {
        if (viewParent instanceof InterfaceC06332r) {
            return ((InterfaceC06332r) viewParent).onNestedPreFling(view, f10, f11);
        }
        String[] strArr = A01;
        if (strArr[1].charAt(19) != strArr[3].charAt(19)) {
            throw new RuntimeException();
        }
        A01[2] = "2JlvdJxfzc676EJF51BR6DiplsSASM3N";
        return false;
    }

    public boolean A08(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
        if (viewParent instanceof InterfaceC06332r) {
            return ((InterfaceC06332r) viewParent).onNestedFling(view, f10, f11, z10);
        }
        return false;
    }

    public boolean A09(ViewParent viewParent, View view, View view2, int i10) {
        if (viewParent instanceof InterfaceC06332r) {
            return ((InterfaceC06332r) viewParent).onStartNestedScroll(view, view2, i10);
        }
        return false;
    }
}
