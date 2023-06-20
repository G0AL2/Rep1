package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import y3.k;

@y3.d
/* loaded from: classes.dex */
public class NativeBlurFilter {
    static {
        b.a();
    }

    public static void a(Bitmap bitmap, int i10, int i11) {
        k.g(bitmap);
        k.b(Boolean.valueOf(i10 > 0));
        k.b(Boolean.valueOf(i11 > 0));
        nativeIterativeBoxBlur(bitmap, i10, i11);
    }

    @y3.d
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i10, int i11);
}
