package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Cm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0868Cm {
    public static byte[] A02;
    public static String[] A03 = {"cQLvPfcjFfYJvX4XY3", "uIOH2wHfxCa8KV3", "FH84zRbfI70JKMZ4FU0vq663g5qgVVhf", "rAS8R46BE4hr4L2BuvPBBTIYPMpqY", "3BFkdmsCGoZH4fXk29OjuKfr1IH2YrFg", "mQzkGmJwq71pGAE", "g0LYTBuRUFd8u9nYrg", "Ct1y1JOzLdrho3HlQk4TLP9PG3jGo5Mx"};
    public static final C0868Cm A04;
    public final long A00;
    public final long A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{108, 96, 48, 47, 51, 41, 52, 41, 47, 46, 125, 77, 98, Byte.MAX_VALUE, 123, 115, 67, 101, 43, 45};
    }

    static {
        A01();
        A04 = new C0868Cm(0L, 0L);
    }

    public C0868Cm(long j10, long j11) {
        this.A01 = j10;
        this.A00 = j11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        String[] strArr = A03;
        if (strArr[0].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[5] = "kVmnPrTsp7Csw7b";
        strArr2[1] = "Hha8DC9juDwuQlk";
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0868Cm c0868Cm = (C0868Cm) obj;
        return this.A01 == c0868Cm.A01 && this.A00 == c0868Cm.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public final String toString() {
        return A00(11, 8, 34) + this.A01 + A00(0, 11, 116) + this.A00 + A00(19, 1, 68);
    }
}
