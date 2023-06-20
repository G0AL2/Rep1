package com.facebook.ads.redexgen.X;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2U  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2U {
    public static byte[] A00;
    public static String[] A01 = {"5xFyhJyAmXwpndJ9EoKqTFqqLI0O0t2g", "XKBE22ujheeLcTYagdBtfv4d5l35c1GL", "dLXeMiu6Rni", "1iBW7", "i8dAz", "3kaHypJVzQjnFbgNDhrnWnyYOdOCg92b", "E8vO87QQkuay4qK7aMyGFQLc0ZjeOzJS", "6MpCOYCclTS"};
    public static final ThreadLocal<double[]> A02;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-104, -93, -89, -97, -104, 87, -92, -84, -86, -85, 87, -103, -100, 87, -103, -100, -85, -82, -100, -100, -91, 87, 103, 87, -104, -91, -101, 87, 105, 108, 108, 101, -59, -53, -54, -82, -49, -48, 118, -61, -53, -55, -54, 118, -66, -73, -52, -69, 118, -73, 118, -62, -69, -60, -67, -54, -66, 118, -59, -68, 118, -119, -124};
    }

    static {
        A04();
        A02 = new ThreadLocal<>();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public static double A00(@ColorInt int i10) {
        double[] A07 = A07();
        A06(i10, A07);
        return A07[1] / 100.0d;
    }

    @ColorInt
    public static int A01(@ColorInt int i10, @IntRange(from = 0, to = 255) int i11) {
        if (i11 >= 0) {
            String[] strArr = A01;
            if (strArr[7].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "QbRpT";
            strArr2[3] = "VTwjf";
            if (i11 <= 255) {
                return (16777215 & i10) | (i11 << 24);
            }
        }
        throw new IllegalArgumentException(A03(0, 32, 3));
    }

    @ColorInt
    public static int A02(@ColorInt int i10, @ColorInt int i11, @FloatRange(from = 0.0d, to = 1.0d) float r10) {
        float g10 = 1.0f - r10;
        return Color.argb((int) ((Color.alpha(i10) * g10) + (Color.alpha(i11) * r10)), (int) ((Color.red(i10) * g10) + (Color.red(i11) * r10)), (int) ((Color.green(i10) * g10) + (Color.green(i11) * r10)), (int) ((Color.blue(i10) * g10) + (Color.blue(i11) * r10)));
    }

    public static void A05(@IntRange(from = 0, to = 255) int i10, @IntRange(from = 0, to = 255) int i11, @IntRange(from = 0, to = 255) int i12, @NonNull double[] dArr) {
        double pow;
        double pow2;
        if (dArr.length == 3) {
            double d10 = i10 / 255.0d;
            if (d10 < 0.04045d) {
                pow = d10 / 12.92d;
            } else {
                pow = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
            }
            double d11 = i11 / 255.0d;
            if (d11 < 0.04045d) {
                pow2 = d11 / 12.92d;
            } else {
                pow2 = Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
            }
            double sb2 = i12 / 255.0d;
            double sb3 = sb2 < 0.04045d ? sb2 / 12.92d : Math.pow((0.055d + sb2) / 1.055d, 2.4d);
            double sg = 0.3576d * pow2;
            double d12 = (0.4124d * pow) + sg;
            double sg2 = 0.1805d * sb3;
            dArr[0] = (d12 + sg2) * 100.0d;
            double sg3 = 0.7152d * pow2;
            double d13 = (0.2126d * pow) + sg3;
            double sg4 = 0.0722d * sb3;
            dArr[1] = (d13 + sg4) * 100.0d;
            double sg5 = 0.1192d * pow2;
            double d14 = (0.0193d * pow) + sg5;
            double sg6 = 0.9505d * sb3;
            dArr[2] = (d14 + sg6) * 100.0d;
            return;
        }
        throw new IllegalArgumentException(A03(32, 31, 34));
    }

    public static void A06(@ColorInt int i10, @NonNull double[] dArr) {
        A05(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    public static double[] A07() {
        double[] dArr = A02.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            A02.set(dArr2);
            return dArr2;
        }
        return dArr;
    }
}
