package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Mb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1095Mb {
    public static Bitmap A00(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.setScale(-1.0f, 1.0f);
        matrix.postTranslate(bitmap.getWidth(), 0.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap A01(EnumC1094Ma enumC1094Ma) {
        byte[] decode = Base64.decode(enumC1094Ma.A00(Lr.A00), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static Bitmap A02(EnumC1094Ma enumC1094Ma) {
        byte[] decode = Base64.decode(enumC1094Ma.A00(Lr.A00), 0);
        return A00(BitmapFactory.decodeByteArray(decode, 0, decode.length));
    }

    public static Drawable A03(C1400Xy c1400Xy, EnumC1094Ma enumC1094Ma) {
        return new BitmapDrawable(c1400Xy.getResources(), A01(enumC1094Ma));
    }
}
