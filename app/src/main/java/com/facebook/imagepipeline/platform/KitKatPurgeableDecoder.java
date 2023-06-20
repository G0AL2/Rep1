package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import b4.g;
import com.facebook.imagepipeline.memory.f;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import y3.k;

@y3.d
@TargetApi(19)
/* loaded from: classes.dex */
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f14870d = 0;

    /* renamed from: c  reason: collision with root package name */
    private final f f14871c;

    @y3.d
    public KitKatPurgeableDecoder(f fVar) {
        this.f14871c = fVar;
    }

    private static void i(byte[] bArr, int i10) {
        bArr[i10] = -1;
        bArr[i10 + 1] = -39;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(c4.a<g> aVar, BitmapFactory.Options options) {
        g y10 = aVar.y();
        int size = y10.size();
        c4.a<byte[]> a10 = this.f14871c.a(size);
        try {
            byte[] y11 = a10.y();
            y10.c(0, y11, 0, size);
            return (Bitmap) k.h(BitmapFactory.decodeByteArray(y11, 0, size, options), "BitmapFactory returned null");
        } finally {
            c4.a.w(a10);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap e(c4.a<g> aVar, int i10, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.f(aVar, i10) ? null : DalvikPurgeableDecoder.f14856b;
        g y10 = aVar.y();
        k.b(Boolean.valueOf(i10 <= y10.size()));
        int i11 = i10 + 2;
        c4.a<byte[]> a10 = this.f14871c.a(i11);
        try {
            byte[] y11 = a10.y();
            y10.c(0, y11, 0, i10);
            if (bArr != null) {
                i(y11, i10);
                i10 = i11;
            }
            return (Bitmap) k.h(BitmapFactory.decodeByteArray(y11, 0, i10, options), "BitmapFactory returned null");
        } finally {
            c4.a.w(a10);
        }
    }
}
