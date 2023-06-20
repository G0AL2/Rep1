package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import h0.f;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import y3.k;

/* compiled from: DefaultDecoder.java */
@TargetApi(11)
/* loaded from: classes.dex */
public abstract class b implements d {

    /* renamed from: d  reason: collision with root package name */
    private static final Class<?> f14872d = b.class;

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f14873e = {-1, -39};

    /* renamed from: a  reason: collision with root package name */
    private final z5.c f14874a;

    /* renamed from: b  reason: collision with root package name */
    private final PreverificationHelper f14875b;

    /* renamed from: c  reason: collision with root package name */
    final f<ByteBuffer> f14876c;

    public b(z5.c cVar, int i10, f fVar) {
        this.f14875b = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.f14874a = cVar;
        this.f14876c = fVar;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f14876c.a(ByteBuffer.allocate(16384));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac A[Catch: all -> 0x00cf, RuntimeException -> 0x00d1, IllegalArgumentException -> 0x00da, TRY_LEAVE, TryCatch #8 {IllegalArgumentException -> 0x00da, RuntimeException -> 0x00d1, blocks: (B:29:0x006e, B:36:0x0089, B:51:0x00ac, B:43:0x009d, B:47:0x00a5, B:48:0x00a8), top: B:83:0x006e, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private c4.a<android.graphics.Bitmap> d(java.io.InputStream r10, android.graphics.BitmapFactory.Options r11, android.graphics.Rect r12, android.graphics.ColorSpace r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.b.d(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect, android.graphics.ColorSpace):c4.a");
    }

    private static BitmapFactory.Options f(w5.e eVar, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = eVar.T();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(eVar.C(), null, options);
        if (options.outWidth != -1 && options.outHeight != -1) {
            options.inJustDecodeBounds = false;
            options.inDither = true;
            options.inPreferredConfig = config;
            options.inMutable = true;
            return options;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.facebook.imagepipeline.platform.d
    public c4.a<Bitmap> a(w5.e eVar, Bitmap.Config config, Rect rect, int i10, ColorSpace colorSpace) {
        boolean h02 = eVar.h0(i10);
        BitmapFactory.Options f10 = f(eVar, config);
        e4.b C = eVar.C();
        k.g(C);
        if (eVar.U() > i10) {
            C = new e4.a(C, i10);
        }
        if (!h02) {
            C = new e4.b(C, f14873e);
        }
        boolean z10 = f10.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            try {
                c4.a<Bitmap> d10 = d(C, f10, rect, colorSpace);
                try {
                    C.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                return d10;
            } catch (Throwable th) {
                try {
                    C.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
                throw th;
            }
        } catch (RuntimeException e12) {
            if (z10) {
                c4.a<Bitmap> a10 = a(eVar, Bitmap.Config.ARGB_8888, rect, i10, colorSpace);
                try {
                    C.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
                return a10;
            }
            throw e12;
        }
    }

    @Override // com.facebook.imagepipeline.platform.d
    public c4.a<Bitmap> b(w5.e eVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options f10 = f(eVar, config);
        boolean z10 = f10.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return d((InputStream) k.g(eVar.C()), f10, rect, colorSpace);
        } catch (RuntimeException e10) {
            if (z10) {
                return b(eVar, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e10;
        }
    }

    @Override // com.facebook.imagepipeline.platform.d
    public c4.a<Bitmap> c(w5.e eVar, Bitmap.Config config, Rect rect, int i10) {
        return a(eVar, config, rect, i10, null);
    }

    public abstract int e(int i10, int i11, BitmapFactory.Options options);
}
