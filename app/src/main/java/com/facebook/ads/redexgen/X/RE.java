package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class RE {
    public static byte[] A05;
    public RA A00;
    public RD A01;
    public String A02;
    public String A03;
    public byte[] A04;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 21);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{119};
    }

    public RE(String str, @Nullable RG rg, RA ra2) {
        this.A03 = A00(0, 0, 77);
        if (str != null) {
            this.A03 = str;
        }
        if (rg != null && !rg.A06().isEmpty()) {
            this.A03 += A00(0, 1, 35) + rg.A06();
        }
        this.A00 = ra2;
    }

    public final RA A02() {
        return this.A00;
    }

    public final RD A03() {
        return this.A01;
    }

    public final String A04() {
        return this.A02;
    }

    public final String A05() {
        return this.A03;
    }

    public final byte[] A06() {
        return this.A04;
    }
}
