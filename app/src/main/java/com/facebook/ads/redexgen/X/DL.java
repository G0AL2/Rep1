package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class DL {
    public static byte[] A00;
    public static String[] A01 = {"kk3S4O13iVXJvtm5AjTeD8rK", "Zu4hi0TCs3bKXIhBk2aWCiDe3xK", "JowY5N4XtyrwAA9epoNCHGChZ5QJHmq", "OOxBqRpXIUSrAU80JlBeMYgVyXHV", "tCZgrksHUVK4eCN8oQ7yIu", "GrKlMP1w4PgYrm5YCKNZqmcWRop33Hln", "0sCqI3ucQZfe3Uil9qNltLDWT8T5PAU", "ug"};

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 3);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{76, 111, 111, 116, 93, 104, 115, 113, 73, 104, 117, 112, 109, 86, 75, 77, 72, 72, 87, 74, 76, 93, 92, 24, 72, 75, 75, 80, 24, 78, 93, 74, 75, 81, 87, 86, 2, 24};
    }

    static {
        A04();
    }

    public static int A00(byte[] bArr) {
        int i10;
        DK parsedAtom = A01(bArr);
        if (parsedAtom != null) {
            i10 = parsedAtom.A00;
            return i10;
        }
        return -1;
    }

    @Nullable
    public static DK A01(byte[] bArr) {
        C1004Ij c1004Ij = new C1004Ij(bArr);
        if (c1004Ij.A07() < 32) {
            return null;
        }
        c1004Ij.A0Y(0);
        if (c1004Ij.A08() != c1004Ij.A04() + 4) {
            return null;
        }
        int A08 = c1004Ij.A08();
        int i10 = D3.A0r;
        String[] strArr = A01;
        String str = strArr[0];
        String str2 = strArr[7];
        int length = str.length();
        int atomType = str2.length();
        if (length != atomType) {
            A01[6] = "KiHnRKSUZsnBoZKY996tMhDtZ8Gdi7J";
            if (A08 != i10) {
                return null;
            }
            int atomType2 = c1004Ij.A08();
            int A012 = D3.A01(atomType2);
            if (A012 > 1) {
                Log.w(A02(0, 12, 31), A02(12, 26, 59) + A012);
                return null;
            }
            UUID uuid = new UUID(c1004Ij.A0L(), c1004Ij.A0L());
            if (A012 == 1) {
                c1004Ij.A0Z(c1004Ij.A0H() * 16);
            }
            int A0H = c1004Ij.A0H();
            if (A0H != c1004Ij.A04()) {
                return null;
            }
            byte[] data = new byte[A0H];
            c1004Ij.A0c(data, 0, A0H);
            return new DK(uuid, A012, data);
        }
        throw new RuntimeException();
    }

    @Nullable
    public static UUID A03(byte[] bArr) {
        UUID uuid;
        DK A012 = A01(bArr);
        if (A012 != null) {
            uuid = A012.A01;
            return uuid;
        } else if (A01[6].length() != 31) {
            throw new RuntimeException();
        } else {
            String[] strArr = A01;
            strArr[2] = "A19aWphbBlm9ojDJQ1W47aeMdyevB22";
            strArr[1] = "rfVibYQBAeR1UXfUamieG6t7la8";
            return null;
        }
    }
}
