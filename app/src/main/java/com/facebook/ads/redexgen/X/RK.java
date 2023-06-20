package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class RK {
    @Nullable
    public static R0 A00;
    public static byte[] A01;
    public static String[] A02 = {"b", "jWWIi2TrnHAAyoG5itvaKpzBpE6rwsKb", "4piz2zd6PBPCOA5LKuru6huyc0Gk9hmI", "ThWxRwfxtMClt6xxWNEGrvPqHoOGiBgN", "VC0ltrZe3ujZ5yBmE9F34w5pTHRf8GMT", "g0Z7XyqsbnnTrD4DkPgr08gcmreNHhpx", "VVYGWntGozQ2sTcwE1XxLnyTeGzWkyyX", "XVqTwdXEkxL4UUDwn3dakWK60VTsxJd5"};
    public static final Set<String> A03;
    public static final Set<String> A04;
    public static final AtomicBoolean A05;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{36, 121, 104, 23, 81, 81, 30, 99, 22, 103, Byte.MAX_VALUE, 85, 116, 20, 73, 126, 19, 74, 72, 66, 77, 20, 78, 81, 86, 20, 115, 73, 85, 77, 27, 44, 9, 86, 113, 76, 80, 116, 73, 92, 87, 72, 84, 17, 109, 87, 92, 126, 82, 76, 72, 8, 83, 108, 82, 21, 67, 104, 73, 7, 48, 14, 124, 116, 29, 56, 9, 120, 53, 0, 15, 40, 32, 37, 120, 62, 60, 56, 53, 61, 13, 9, 47, 54, 20, 3, 41, 13, 113, 70, 1, 42, 59, 56, 32, 61, 36, 38, 33, 40, 111, 45, 42, 41, 32, 61, 42, 111, 38, 33, 38, 59, 110, 125, Byte.MAX_VALUE, 125, 108, 19, 68, 75, Byte.MAX_VALUE, 71, 65, 110, 67, 14, 81, 68, 112, 119, 65, 75, 92, 112, 109, 16, 76, 85, 66, 104, 24, 47, 72, 64, 91, 89, 69, 72, 71, 76, 118, 68, 70, 77, 76, 118, 70, 71, 57, 50, 35, 32, 56, 37, 60, 29, 6, 51, 91, 46, 59, 7, 59, 3, 42, 80, 57, 92, 63, 63, 60, 13, 42, 25, 38, 27, 47, 33, 81, 5, 15, 56, 84, 99};
    }

    static {
        A07();
        A03 = new HashSet();
        A04 = new HashSet();
        A03.add(A05(3, 29, 30));
        A04.add(A05(165, 29, 81));
        A04.add(A05(32, 29, 2));
        A04.add(A05(61, 29, 116));
        A04.add(A05(113, 29, 29));
        A05 = new AtomicBoolean();
    }

    public static R2 A00(C8U c8u) {
        return A03(true, c8u);
    }

    public static R2 A01(C8U c8u) {
        return A02(true, c8u);
    }

    public static R2 A02(boolean z10, C8U c8u) {
        R6 r62 = new R6();
        R9 A042 = A04(c8u);
        if (!A0B(c8u)) {
            r62.A02(A04);
            r62.A01(A03);
        }
        if (C1072Lc.A04()) {
            Map<String, String> A022 = C1072Lc.A02();
            String[] strArr = A02;
            if (strArr[2].charAt(7) == strArr[1].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "6CjO7LbqJIONUadrRHmx0RuGBypxStir";
            strArr2[3] = "VKsjD9ddp6JrHwn0FL0Df9QGs7RhJ4JT";
            A042.A08(A022);
        }
        return R4.A00().A01(r62.A00(A042.A09()).A03(z10).A04(c8u.A03().A8P()).A05(), c8u.A06(), MX.A01());
    }

    public static R2 A03(boolean z10, C8U c8u) {
        return R4.A00().A01(new R6().A03(z10).A00(A04(c8u).A09()).A04(c8u.A03().A8P()).A05(), c8u.A06(), MX.A01());
    }

    public static R9 A04(C8U c8u) {
        A08(c8u);
        R9 r92 = new R9();
        if (A0B(c8u)) {
            r92.A02(360000).A04(120000);
        } else {
            r92.A02(JR.A07(c8u)).A04(JR.A09(c8u));
        }
        r92.A03(JR.A08(c8u)).A05(JR.A0A(c8u)).A06(JR.A0B(c8u));
        synchronized (RK.class) {
            if (A00 != null && (A00 instanceof R0)) {
                r92.A07(A00);
            }
        }
        return r92;
    }

    public static void A06() {
        A05.set(true);
    }

    public static void A08(C8U c8u) {
        if (!A05.get()) {
            c8u.A06().A8y(A05(158, 7, 111), C07828z.A20, new AnonymousClass90(A05(90, 23, 119)));
        }
    }

    public static synchronized void A09(R0 r02) {
        synchronized (RK.class) {
            A00 = r02;
        }
    }

    public static boolean A0A(C8U c8u) {
        int i10 = Build.VERSION.SDK_INT;
        String A052 = A05(142, 16, 17);
        if (i10 < 17) {
            return Settings.System.getInt(c8u.getContentResolver(), A052, 0) != 0;
        }
        int i11 = Settings.Global.getInt(c8u.getContentResolver(), A052, 0);
        if (A02[0].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "6SlcDzdssqL5L6jmaJN4q0YtRJ9ZiIN0";
        strArr[1] = "IhCDgNyX5tEXKuNPsF1SGphg5lyX1n5g";
        return i11 != 0;
    }

    public static boolean A0B(C8U c8u) {
        String urlPrefix = c8u.A03().A7l();
        return !TextUtils.isEmpty(urlPrefix) && urlPrefix.endsWith(A05(0, 3, 50));
    }
}
