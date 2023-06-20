package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import y3.k;

@y3.d
/* loaded from: classes.dex */
public class Bitmaps {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f14855a = 0;

    static {
        a.a();
    }

    @y3.d
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        k.b(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        k.b(Boolean.valueOf(bitmap.isMutable()));
        k.b(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        k.b(Boolean.valueOf(bitmap.getHeight() == bitmap2.getHeight()));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @y3.d
    private static native void nativeCopyBitmap(Bitmap bitmap, int i10, Bitmap bitmap2, int i11, int i12);
}
