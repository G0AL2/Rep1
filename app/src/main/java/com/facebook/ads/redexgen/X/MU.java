package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Build;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* loaded from: assets/audience_network.dex */
public final class MU {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-9, 4, -6, 8, 5, -1, -6, -60, 5, 9, -60, -41, 9, 15, 4, -7, -22, -9, 9, 1};
    }

    public static <P, PR, R> AsyncTask<P, PR, R> A00(Executor executor, AsyncTask<P, PR, R> asyncTask, P... pArr) {
        if (Build.VERSION.SDK_INT >= 11) {
            asyncTask.executeOnExecutor(executor, pArr);
        } else {
            asyncTask.execute(pArr);
        }
        return asyncTask;
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A02() {
        try {
            Class.forName(A01(0, 20, 32));
        } catch (Throwable unused) {
        }
    }
}
