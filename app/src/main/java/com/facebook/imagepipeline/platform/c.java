package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import h0.f;

/* compiled from: OreoDecoder.java */
@TargetApi(26)
/* loaded from: classes.dex */
public class c extends b {
    public c(z5.c cVar, int i10, f fVar) {
        super(cVar, i10, fVar);
    }

    private static boolean g(BitmapFactory.Options options) {
        ColorSpace colorSpace = options.outColorSpace;
        return (colorSpace == null || !colorSpace.isWideGamut() || options.inPreferredConfig == Bitmap.Config.RGBA_F16) ? false : true;
    }

    @Override // com.facebook.imagepipeline.platform.b
    public int e(int i10, int i11, BitmapFactory.Options options) {
        if (g(options)) {
            return i10 * i11 * 8;
        }
        Bitmap.Config config = options.inPreferredConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return com.facebook.imageutils.a.d(i10, i11, config);
    }
}
