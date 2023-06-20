package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import h0.f;
import h0.g;

/* compiled from: ArtDecoder.java */
@TargetApi(21)
/* loaded from: classes.dex */
public class a extends b {
    public a(z5.c cVar, int i10, f fVar) {
        super(cVar, i10, fVar);
    }

    @Override // com.facebook.imagepipeline.platform.b
    public int e(int i10, int i11, BitmapFactory.Options options) {
        return com.facebook.imageutils.a.d(i10, i11, (Bitmap.Config) g.f(options.inPreferredConfig));
    }
}
