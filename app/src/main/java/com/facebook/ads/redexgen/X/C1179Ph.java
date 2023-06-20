package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ph  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1179Ph {
    public static boolean A00;
    public static byte[] A01;
    public static String[] A02 = {"Y0rICHp14ARSNu9MlXOQlrQKpJ7V2hwf", "9bmfgm9m8nITbmWk0ICcMAG3MrS", "cwEc0HiI6y8ZhWJ4MUGuUSsWKgKIPOUb", "CeguwAwwe", "1UN8Pz5pD", "KG5kSs2s3o8nfvSCZiVMOrQyfdZTA2DP", "BO8EwxINC4bfwl9QwPIiUjcYWt5Jq71N", "VnsxrIf3KddrD6MinhDJfsdqz9CBs5tu"};

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[2].charAt(4) == 'h') {
                throw new RuntimeException();
            }
            A02[5] = "V4DWKv2CalsHghC0GoFw5ZQ5aRA0odCa";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 71);
            i13++;
        }
    }

    public static void A03() {
        A01 = new byte[]{-1, 36, 46, 43, 39, 28, 52, 8, 32, 47, 45, 36, 30, 46, -37, 36, 46, -37, 41, 48, 39, 39, -23, 9, 28, 42, 38, 44, 41, 26, 28, 42, -41, 32, 42, -41, 37, 44, 35, 35, -27, -65, -54, -43, -46, -51, -54, -35, -46, -40, -41, -119, -49, -54, -46, -43, -50, -51, -105, -34, -32, -35};
    }

    static {
        A03();
        A00 = true;
    }

    @Nullable
    public static BitmapDrawable A00(C1400Xy c1400Xy, @Nullable String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] decode = Base64.decode(str, 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            if (decodeByteArray != null && (!A00 || A05(c1400Xy, decodeByteArray))) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(decodeByteArray);
                bitmapDrawable.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                Resources resources = c1400Xy.getResources();
                if (resources != null) {
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    if (displayMetrics != null) {
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    } else {
                        A04(c1400Xy, A02(0, 23, 116));
                    }
                } else {
                    A04(c1400Xy, A02(23, 18, 112));
                }
                return bitmapDrawable;
            }
            return null;
        } catch (Throwable th) {
            c1400Xy.A06().A8y(A02(59, 3, 42), C07828z.A1t, new AnonymousClass90(th));
            return null;
        }
    }

    @Nullable
    public static C1180Pi A01(C1400Xy c1400Xy, @Nullable String str) {
        BitmapDrawable A002;
        try {
            if (TextUtils.isEmpty(str) || (A002 = A00(c1400Xy, str)) == null) {
                return null;
            }
            C1180Pi c1180Pi = new C1180Pi(c1400Xy);
            if (Build.VERSION.SDK_INT >= 16) {
                c1180Pi.setBackground(A002);
            } else {
                c1180Pi.setBackgroundDrawable(A002);
            }
            c1180Pi.setClickable(false);
            c1180Pi.setFocusable(false);
            return c1180Pi;
        } catch (Throwable th) {
            c1400Xy.A06().A8y(A02(59, 3, 42), C07828z.A1t, new AnonymousClass90(th));
            return null;
        }
    }

    public static void A04(C1400Xy c1400Xy, String str) {
        c1400Xy.A06().A8y(A02(59, 3, 42), C07828z.A1t, new AnonymousClass90(str));
    }

    @VisibleForTesting
    public static boolean A05(C1400Xy c1400Xy, Bitmap bitmap) {
        int i10 = 0;
        while (true) {
            int width = bitmap.getWidth();
            if (A02[2].charAt(4) == 'h') {
                throw new RuntimeException();
            }
            A02[2] = "44dBdHmZhYYzc5DiIB6SXSnn6xfqMO61";
            if (i10 < width) {
                for (int i11 = 0; i11 < bitmap.getHeight(); i11++) {
                    if (Color.alpha(bitmap.getPixel(i10, i11)) / 255.0f > 0.03f) {
                        A04(c1400Xy, A02(41, 18, 34));
                        return false;
                    }
                }
                i10++;
            } else {
                return true;
            }
        }
    }
}
