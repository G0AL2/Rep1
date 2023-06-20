package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Wa  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1350Wa extends D3 {
    public static byte[] A03;
    public final long A00;
    public final List<C1350Wa> A01;
    public final List<WZ> A02;

    static {
        A05();
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{0, 67, 79, 78, 84, 65, 73, 78, 69, 82, 83, 26, 0, -110, -34, -41, -45, -24, -41, -27, -84, -110};
    }

    public C1350Wa(int i10, long j10) {
        super(i10);
        this.A00 = j10;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final C1350Wa A06(int i10) {
        int size = this.A01.size();
        for (int i11 = 0; i11 < size; i11++) {
            C1350Wa c1350Wa = this.A01.get(i11);
            if (((D3) c1350Wa).A00 == i10) {
                return c1350Wa;
            }
        }
        return null;
    }

    public final WZ A07(int i10) {
        int size = this.A02.size();
        for (int i11 = 0; i11 < size; i11++) {
            WZ wz = this.A02.get(i11);
            if (((D3) wz).A00 == i10) {
                return wz;
            }
        }
        return null;
    }

    public final void A08(C1350Wa c1350Wa) {
        this.A01.add(c1350Wa);
    }

    public final void A09(WZ wz) {
        this.A02.add(wz);
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final String toString() {
        return D3.A02(super.A00) + A04(13, 9, 15) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 125) + Arrays.toString(this.A01.toArray());
    }
}
