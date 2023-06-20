package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ls  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1086Ls {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{108, 78, 65, 8, 91, 15, 75, 74, 91, 74, 93, 66, 70, 65, 74, 15, 70, 73, 15, 78, 95, 95, 15, 70, 92, 15, 122, 65, 70, 91, 86, 1, 24, 34, 113, 4, 63, 56, 37, 40, 113, 48, 33, 33, 107, 113, 118, 122, 120, 59, 115, 116, 118, 112, 119, 122, 122, 126, 59, 103, 112, 116, 118, 97, 59, 71, 112, 116, 118, 97, 84, 118, 97, 124, 99, 124, 97, 108, 4, 8, 10, 73, 18, 9, 14, 19, 30, 84, 3, 73, 23, 11, 6, 30, 2, 21, 73, 50, 9, 14, 19, 30, 55, 11, 6, 30, 2, 21, 38, 4, 19, 14, 17, 14, 19, 30};
    }

    static {
        A01();
        A01 = C1086Ls.class.getSimpleName();
    }

    @SuppressLint({"CatchGeneralException"})
    public static boolean A02() {
        try {
            Class.forName(A00(46, 32, 76));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A03() {
        try {
            Class.forName(A00(78, 38, 62));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A04(int i10, int i11) {
        return i10 >= 640 && i11 >= 640;
    }

    public static boolean A05(C8U c8u) {
        boolean z10 = false;
        try {
            PackageManager packageManager = c8u.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            boolean z11 = true;
            ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(c8u.getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                int length = activityInfoArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    if (!A00(78, 38, 62).equals(activityInfoArr[i10].name)) {
                        i10++;
                    } else {
                        z10 = true;
                        break;
                    }
                }
            }
            if (!z10 && !A03()) {
                z11 = false;
            }
            boolean isUnity = c8u.A03().A8P();
            if (isUnity) {
                String str = A00(32, 14, 8) + z11;
            }
            return z11;
        } catch (Throwable th) {
            if (c8u.A03().A8P()) {
                Log.e(A01, A00(0, 32, 118), th);
            }
            return false;
        }
    }
}
