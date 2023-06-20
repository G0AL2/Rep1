package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import z5.s;
import z5.t;

/* compiled from: BucketsBitmapPool.java */
@TargetApi(21)
/* loaded from: classes.dex */
public class d extends b<Bitmap> implements z5.c {
    public d(b4.c cVar, s sVar, t tVar, boolean z10) {
        super(cVar, sVar, tVar, z10);
        r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: A */
    public void j(Bitmap bitmap) {
        y3.k.g(bitmap);
        bitmap.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: B */
    public int n(Bitmap bitmap) {
        y3.k.g(bitmap);
        return bitmap.getAllocationByteCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: C */
    public Bitmap p(c<Bitmap> cVar) {
        Bitmap bitmap = (Bitmap) super.p(cVar);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: D */
    public boolean t(Bitmap bitmap) {
        y3.k.g(bitmap);
        return !bitmap.isRecycled() && bitmap.isMutable();
    }

    @Override // com.facebook.imagepipeline.memory.b
    protected int m(int i10) {
        return i10;
    }

    @Override // com.facebook.imagepipeline.memory.b
    protected int o(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: z */
    public Bitmap f(int i10) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i10 / 2.0d), Bitmap.Config.RGB_565);
    }
}
