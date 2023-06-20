package com.bytedance.sdk.component.d.c.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* compiled from: DefaultDecoder.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ImageView.ScaleType f10173a = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: b  reason: collision with root package name */
    public static final Bitmap.Config f10174b = Bitmap.Config.ARGB_4444;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap.Config f10175c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10176d;

    /* renamed from: e  reason: collision with root package name */
    private final int f10177e;

    /* renamed from: f  reason: collision with root package name */
    private final ImageView.ScaleType f10178f;

    public a(int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config) {
        this.f10175c = config;
        this.f10176d = i10;
        this.f10177e = i11;
        this.f10178f = scaleType;
    }

    static int a(int i10, int i11, int i12, int i13) {
        double min = Math.min(i10 / i12, i11 / i13);
        float f10 = 1.0f;
        while (true) {
            float f11 = 2.0f * f10;
            if (f11 > min) {
                return (int) f10;
            }
            f10 = f11;
        }
    }

    private static int a(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        if (i10 == 0 && i11 == 0) {
            return i12;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i10 == 0 ? i12 : i10;
        } else if (i10 == 0) {
            return (int) ((i11 / i13) * i12);
        } else {
            if (i11 == 0) {
                return i10;
            }
            double d10 = i13 / i12;
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                double d11 = i11;
                return ((double) i10) * d10 < d11 ? (int) (d11 / d10) : i10;
            }
            double d12 = i11;
            return ((double) i10) * d10 > d12 ? (int) (d12 / d10) : i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a1657027613264dc(java.lang.String r2) {
        /*
        L0:
            r0 = 74
            r1 = 55
        L4:
            switch(r0) {
                case 72: goto L0;
                case 73: goto L8;
                case 74: goto Lb;
                default: goto L7;
            }
        L7:
            goto L2b
        L8:
            switch(r1) {
                case 94: goto L26;
                case 95: goto Lf;
                case 96: goto Lf;
                default: goto Lb;
            }
        Lb:
            switch(r1) {
                case 55: goto L26;
                case 56: goto L26;
                case 57: goto Lf;
                default: goto Le;
            }
        Le:
            goto L26
        Lf:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L14:
            int r1 = r2.length
            if (r0 >= r1) goto L20
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L14
        L20:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L26:
            r0 = 73
            r1 = 96
            goto L4
        L2b:
            r0 = 72
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(java.lang.String):java.lang.String");
    }

    public Bitmap a(byte[] bArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f10176d == 0 && this.f10177e == 0) {
            options.inPreferredConfig = this.f10175c;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        int a10 = a(this.f10176d, this.f10177e, i10, i11, this.f10178f);
        int a11 = a(this.f10177e, this.f10176d, i11, i10, this.f10178f);
        options.inJustDecodeBounds = false;
        options.inSampleSize = a(i10, i11, a10, a11);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (decodeByteArray != null) {
            if (decodeByteArray.getWidth() > a10 || decodeByteArray.getHeight() > a11) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, a10, a11, true);
                if (createScaledBitmap != decodeByteArray) {
                    decodeByteArray.recycle();
                }
                return createScaledBitmap;
            }
            return decodeByteArray;
        }
        return decodeByteArray;
    }
}
