package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ck  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0866Ck {
    public static byte[] A02;
    public final C0868Cm A00;
    public final C0868Cm A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-54, -66, 1, 22};
    }

    public C0866Ck(C0868Cm c0868Cm) {
        this(c0868Cm, c0868Cm);
    }

    public C0866Ck(C0868Cm c0868Cm, C0868Cm c0868Cm2) {
        this.A00 = (C0868Cm) IK.A01(c0868Cm);
        this.A01 = (C0868Cm) IK.A01(c0868Cm2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0866Ck c0866Ck = (C0866Ck) obj;
        return this.A00.equals(c0866Ck.A00) && this.A01.equals(c0866Ck.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A00(2, 1, 88));
        sb2.append(this.A00);
        if (this.A00.equals(this.A01)) {
            str = A00(0, 0, 98);
        } else {
            str = A00(0, 2, 80) + this.A01;
        }
        sb2.append(str);
        sb2.append(A00(3, 1, 107));
        return sb2.toString();
    }
}
