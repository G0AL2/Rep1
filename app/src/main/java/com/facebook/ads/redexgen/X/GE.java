package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class GE extends AbstractC1686dr<EnumC05680c> {
    public static byte[] A00;
    public static String[] A01 = {"nfOmdPRKy6dJXhDeozy3bec4eprLIoSQ", "SpNSu", "KnwtHm0RppTzgOMyhwsp1PpmZykcOlps", "rm2Q4", "VxhbZsLUCIIY3eK9iwu", "VDpaDUxovSHskE3K7Rzj9CiAPD6OjiUH", "VHZOT7bXdVoDaPP", "SrW2lLCi4fFkH4TY8LZz6iOiSZQwKo1F"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[1].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A01[5] = "VLAsB6FpgF6HHUeMgZV0uCFNDiYuOANh";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 46);
            i13++;
        }
    }

    public static void A01() {
        A00 = new byte[]{19, 26, 17, 17};
    }

    static {
        A01();
    }

    public GE(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1686dr
    /* renamed from: A05 */
    public final C0W A04(@Nullable EnumC05680c enumC05680c) {
        String A02;
        if (enumC05680c != null) {
            A02 = enumC05680c.A02();
        } else if (A01[0].charAt(24) == 'c') {
            throw new RuntimeException();
        } else {
            A01[2] = "FtIMifYPiEAUkOQozBm9Vw11LGuuRK56";
            A02 = A00(0, 4, 119);
        }
        return new C0W(this, A02);
    }
}
