package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import b4.g;
import java.util.Locale;
import y3.k;
import y3.p;

@y3.d
/* loaded from: classes.dex */
public abstract class DalvikPurgeableDecoder implements com.facebook.imagepipeline.platform.d {

    /* renamed from: b  reason: collision with root package name */
    protected static final byte[] f14856b;

    /* renamed from: a  reason: collision with root package name */
    private final z5.a f14857a = z5.b.a();

    /* JADX INFO: Access modifiers changed from: private */
    @com.facebook.soloader.e
    /* loaded from: classes.dex */
    public static class OreoUtils {
        private OreoUtils() {
        }

        @TargetApi(26)
        static void a(BitmapFactory.Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        a.a();
        f14856b = new byte[]{-1, -39};
    }

    public static boolean f(c4.a<g> aVar, int i10) {
        g y10 = aVar.y();
        return i10 >= 2 && y10.f(i10 + (-2)) == -1 && y10.f(i10 - 1) == -39;
    }

    public static BitmapFactory.Options g(int i10, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i10;
        if (Build.VERSION.SDK_INT >= 11) {
            options.inMutable = true;
        }
        return options;
    }

    @y3.d
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // com.facebook.imagepipeline.platform.d
    public c4.a<Bitmap> a(w5.e eVar, Bitmap.Config config, Rect rect, int i10, ColorSpace colorSpace) {
        BitmapFactory.Options g10 = g(eVar.T(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(g10, colorSpace);
        }
        c4.a<g> h10 = eVar.h();
        k.g(h10);
        try {
            return h(e(h10, i10, g10));
        } finally {
            c4.a.w(h10);
        }
    }

    @Override // com.facebook.imagepipeline.platform.d
    public c4.a<Bitmap> b(w5.e eVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options g10 = g(eVar.T(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(g10, colorSpace);
        }
        c4.a<g> h10 = eVar.h();
        k.g(h10);
        try {
            return h(d(h10, g10));
        } finally {
            c4.a.w(h10);
        }
    }

    @Override // com.facebook.imagepipeline.platform.d
    public c4.a<Bitmap> c(w5.e eVar, Bitmap.Config config, Rect rect, int i10) {
        return a(eVar, config, rect, i10, null);
    }

    protected abstract Bitmap d(c4.a<g> aVar, BitmapFactory.Options options);

    protected abstract Bitmap e(c4.a<g> aVar, int i10, BitmapFactory.Options options);

    public c4.a<Bitmap> h(Bitmap bitmap) {
        k.g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f14857a.g(bitmap)) {
                return c4.a.T(bitmap, this.f14857a.e());
            }
            int e10 = com.facebook.imageutils.a.e(bitmap);
            bitmap.recycle();
            throw new q5.g(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(e10), Integer.valueOf(this.f14857a.b()), Long.valueOf(this.f14857a.f()), Integer.valueOf(this.f14857a.c()), Integer.valueOf(this.f14857a.d())));
        } catch (Exception e11) {
            bitmap.recycle();
            throw p.a(e11);
        }
    }
}
