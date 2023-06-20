package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.66  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass66 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{45, 59, 16, 42, 55, 59, 61, 46, 60, 43, 39, 37, 102, 46, 41, 43, 45, 42, 39, 39, 35, 102, 41, 44, 59, 102, 33, 38, 60, 45, 58, 38, 41, 36, 102, 42, 60, 45, 48, 60, 58, 41, 59};
    }

    public static SharedPreferences A00(C8U c8u) {
        return c8u.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(9, 34, 105), c8u), 0);
    }

    @Nullable
    public final String A03(C8U c8u) {
        return A00(c8u).getString(A01(0, 9, 110), null);
    }

    public final void A04(C8U c8u, String str) {
        A00(c8u).edit().putString(A01(0, 9, 110), str).apply();
    }
}
