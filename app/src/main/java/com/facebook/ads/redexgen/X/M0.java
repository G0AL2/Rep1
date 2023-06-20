package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class M0 {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{38, 42, 40, 107, 35, 36, 38, 32, 39, 42, 42, 46, 107, 46, 36, 49, 36, 43, 36};
    }

    @Nullable
    public static PackageInfo A00(C8U c8u) {
        return A01(c8u, A02(0, 19, 59));
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static PackageInfo A01(C8U c8u, String str) {
        PackageManager packageManager;
        if (TextUtils.isEmpty(str) || (packageManager = c8u.getPackageManager()) == null) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(str, 1);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    public static boolean A04(C8U c8u, String str) {
        PackageInfo packageInfo = A01(c8u, str);
        return packageInfo != null;
    }
}
