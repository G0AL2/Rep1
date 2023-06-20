package com.facebook.imageutils;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Pair;
import java.io.InputStream;
import java.nio.ByteBuffer;
import y3.k;

/* compiled from: BitmapUtil.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final h0.f<ByteBuffer> f15177a = new h0.f<>(12);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BitmapUtil.java */
    /* renamed from: com.facebook.imageutils.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0202a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15178a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f15178a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15178a[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15178a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15178a[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15178a[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15178a[Bitmap.Config.HARDWARE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static Pair<Integer, Integer> a(InputStream inputStream) {
        k.g(inputStream);
        h0.f<ByteBuffer> fVar = f15177a;
        ByteBuffer b10 = fVar.b();
        if (b10 == null) {
            b10 = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = b10.array();
            Pair<Integer, Integer> pair = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (options.outWidth != -1 && options.outHeight != -1) {
                pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            }
            fVar.a(b10);
            return pair;
        } catch (Throwable th) {
            f15177a.a(b10);
            throw th;
        }
    }

    public static b b(InputStream inputStream) {
        k.g(inputStream);
        h0.f<ByteBuffer> fVar = f15177a;
        ByteBuffer b10 = fVar.b();
        if (b10 == null) {
            b10 = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = b10.array();
            BitmapFactory.decodeStream(inputStream, null, options);
            b bVar = new b(options.outWidth, options.outHeight, Build.VERSION.SDK_INT >= 26 ? options.outColorSpace : null);
            fVar.a(b10);
            return bVar;
        } catch (Throwable th) {
            f15177a.a(b10);
            throw th;
        }
    }

    public static int c(Bitmap.Config config) {
        switch (C0202a.f15178a[config.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            case 6:
                return 4;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    public static int d(int i10, int i11, Bitmap.Config config) {
        return i10 * i11 * c(config);
    }

    @SuppressLint({"NewApi"})
    public static int e(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT > 19) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 12) {
            return bitmap.getByteCount();
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }
}
