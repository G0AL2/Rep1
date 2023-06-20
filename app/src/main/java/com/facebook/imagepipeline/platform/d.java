package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Rect;

/* compiled from: PlatformDecoder.java */
/* loaded from: classes.dex */
public interface d {
    c4.a<Bitmap> a(w5.e eVar, Bitmap.Config config, Rect rect, int i10, ColorSpace colorSpace);

    c4.a<Bitmap> b(w5.e eVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace);

    c4.a<Bitmap> c(w5.e eVar, Bitmap.Config config, Rect rect, int i10);
}
