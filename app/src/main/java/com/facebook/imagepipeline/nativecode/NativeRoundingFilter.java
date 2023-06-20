package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import y3.k;

@y3.d
/* loaded from: classes.dex */
public class NativeRoundingFilter {
    static {
        b.a();
    }

    @y3.d
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i10, int i11, int i12, int i13);

    @y3.d
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z10);

    @y3.d
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z10);

    @y3.d
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i10, int i11, boolean z10);

    @y3.d
    public static void toCircle(Bitmap bitmap, boolean z10) {
        k.g(bitmap);
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFilter(bitmap, z10);
    }

    @y3.d
    public static void toCircleFast(Bitmap bitmap, boolean z10) {
        k.g(bitmap);
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFastFilter(bitmap, z10);
    }
}
