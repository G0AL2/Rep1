package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DP {
    public static byte[] A05;
    public static String[] A06 = {"C09qkhbo3vRSWUJSgSkEV0X", "WA1yWV5061NHQxIGBHZdG7C7pKjO5Y9H", "pYBemDtXYAadS99Nmeaz8GF", "NyHZMe4zCbCNgYs1LmeICE7hAZM3ASIf", "", "Aq1CtCEX8aJa", "3dQVxpobetg6gtuImvAOL3PNXFyzfQ27", "PtQ4b0lS5cBc"};
    public final int A00;
    public final C0869Cn A01;
    @Nullable
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A06;
            if (strArr[5].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[2] = "3n0Xyqau0qpDSx89MxSLBxd";
            strArr2[0] = "tz3h4DDpAPGNu8T48YqRwIi";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 103);
            i13++;
        }
    }

    public static void A02() {
        A05 = new byte[]{118, Byte.MAX_VALUE, 113, 16, 34, 34, 36, 60, 56, 63, 54, 113, 16, 20, 2, 124, 18, 5, 3, 113, 50, 35, 40, 33, 37, 62, 113, 60, 62, 53, 52, Byte.MAX_VALUE, 72, 110, 125, Byte.MAX_VALUE, 119, 89, 114, Byte.MAX_VALUE, 110, 101, 108, 104, 117, 115, 114, 94, 115, 100, 58, 1, 28, 26, 31, 31, 0, 29, 27, 10, 11, 79, 31, 29, 0, 27, 10, 12, 27, 6, 0, 1, 79, 28, 12, 7, 10, 2, 10, 79, 27, 22, 31, 10, 79, 72, 114, 115, 114, 32, 2, 3, 2, 18, 95, 89, 82, 95, 32, 38, 45, 48};
    }

    static {
        A02();
    }

    public DP(boolean z10, @Nullable String str, int i10, byte[] bArr, int i11, int i12, @Nullable byte[] bArr2) {
        IK.A03((bArr2 == null) ^ (i10 == 0));
        this.A03 = z10;
        this.A02 = str;
        this.A00 = i10;
        this.A04 = bArr2;
        this.A01 = new C0869Cn(A00(str), bArr, i11, i12);
    }

    public static int A00(@Nullable String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(A01(86, 4, 118))) {
                    c10 = 2;
                    break;
                }
                break;
            case 3046671:
                if (str.equals(A01(90, 4, 6))) {
                    c10 = 3;
                    break;
                }
                break;
            case 3049879:
                if (str.equals(A01(94, 4, 91))) {
                    c10 = 0;
                    break;
                }
                break;
            case 3049895:
                if (str.equals(A01(98, 4, 36))) {
                    c10 = 1;
                    break;
                }
                break;
        }
        if (c10 == 0 || c10 == 1) {
            return 1;
        }
        if (c10 == 2 || c10 == 3) {
            return 2;
        }
        Log.w(A01(32, 18, 123), A01(50, 36, 8) + str + A01(0, 32, 54));
        return 1;
    }
}
