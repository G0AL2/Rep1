package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Iu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1015Iu {
    public static String[] A07 = {"v8bLZp59B3s5kjImuBjcCmNW", "l5XLQfXbQh6R34DBcL2a2gRDiWiOWq7j", "cKC0Gfnr6KNVk9zoAEVguSpqajRxhGsy", "4MzGZFDG0CqgMdioIrH5vwyzFGAbThRu", "MvXRt7wPeDxEfDCDFesb3zWoJZhNCkxf", "mCnVL7G0HMRU3KziMebPW175T1XCPvkW", "oyPZ3wFE5cpoHVmJFEQQrP2WxUjSMaR1", "eOuchRPwSpgwlWmZThUBhEapR1FbTYXS"};
    public static final Comparator<C1014It> A08 = new C1012Ir();
    public static final Comparator<C1014It> A09 = new C1013Is();
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final C1014It[] A06 = new C1014It[5];
    public final ArrayList<C1014It> A05 = new ArrayList<>();
    public int A00 = -1;

    public C1015Iu(int i10) {
        this.A04 = i10;
    }

    private void A00() {
        if (this.A00 != 1) {
            Collections.sort(this.A05, A08);
            this.A00 = 1;
        }
    }

    private void A01() {
        if (this.A00 != 0) {
            Collections.sort(this.A05, A09);
            this.A00 = 0;
        }
    }

    public final float A02(float f10) {
        A01();
        float f11 = this.A03 * f10;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList<C1014It> arrayList = this.A05;
            if (A07[7].charAt(12) != 'l') {
                throw new RuntimeException();
            }
            A07[1] = "MYxxtSQw2w0IEM5GsYZTgS2IPhbXFMQD";
            int i12 = arrayList.size();
            if (i11 < i12) {
                C1014It c1014It = this.A05.get(i11);
                int i13 = c1014It.A02;
                i10 += i13;
                int i14 = (i10 > f11 ? 1 : (i10 == f11 ? 0 : -1));
                if (i14 >= 0) {
                    return c1014It.A00;
                }
                i11++;
            } else if (this.A05.isEmpty()) {
                return Float.NaN;
            } else {
                ArrayList<C1014It> arrayList2 = this.A05;
                return arrayList2.get(arrayList2.size() - 1).A00;
            }
        }
    }

    public final void A03(int i10, float f10) {
        C1014It c1014It;
        A00();
        int i11 = this.A02;
        if (i11 > 0) {
            C1014It[] c1014ItArr = this.A06;
            int i12 = i11 - 1;
            this.A02 = i12;
            c1014It = c1014ItArr[i12];
        } else {
            c1014It = new C1014It(null);
        }
        int i13 = this.A01;
        this.A01 = i13 + 1;
        c1014It.A01 = i13;
        if (A07[6].charAt(29) != 'a') {
            throw new RuntimeException();
        }
        A07[0] = "5E26ZSMWQoSDuNI0YD8YDk9y";
        c1014It.A02 = i10;
        c1014It.A00 = f10;
        this.A05.add(c1014It);
        this.A03 += i10;
        while (true) {
            int i14 = this.A03;
            int i15 = this.A04;
            if (i14 > i15) {
                int i16 = i14 - i15;
                C1014It c1014It2 = this.A05.get(0);
                if (c1014It2.A02 <= i16) {
                    this.A03 -= c1014It2.A02;
                    this.A05.remove(0);
                    int i17 = this.A02;
                    if (i17 < 5) {
                        C1014It[] c1014ItArr2 = this.A06;
                        if (A07[6].charAt(29) != 'a') {
                            this.A02 = i17 + 1;
                            c1014ItArr2[i17] = c1014It2;
                        } else {
                            A07[0] = "NjEm8Wq6Ir4EIF9DQvkt7JHV";
                            this.A02 = i17 + 1;
                            c1014ItArr2[i17] = c1014It2;
                        }
                    }
                } else {
                    c1014It2.A02 -= i16;
                    this.A03 -= i16;
                }
            } else {
                return;
            }
        }
    }
}
