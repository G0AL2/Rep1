package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.renderscript.RSRuntimeException;
import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public class b {
    public static Bitmap a(Context context, Bitmap bitmap, c cVar) {
        boolean z10;
        Bitmap a10;
        int i10 = cVar.f20237a;
        int i11 = cVar.f20240d;
        int i12 = i10 / i11;
        int i13 = cVar.f20238b / i11;
        int[] iArr = {i12, i13};
        int i14 = 0;
        while (true) {
            if (i14 >= 2) {
                z10 = false;
                break;
            } else if (iArr[i14] == 0) {
                z10 = true;
                break;
            } else {
                i14++;
            }
        }
        if (z10) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f10 = 1.0f / cVar.f20240d;
        canvas.scale(f10, f10);
        Paint paint = new Paint();
        paint.setFlags(3);
        paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                a10 = a(context, createBitmap, cVar.f20239c);
            } catch (RSRuntimeException unused) {
                a10 = a(createBitmap, cVar.f20239c, true);
            }
        } else {
            a10 = a(createBitmap, cVar.f20239c, true);
        }
        if (cVar.f20240d == 1) {
            return a10;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a10, cVar.f20237a, cVar.f20238b, true);
        a10.recycle();
        return createScaledBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    @android.annotation.TargetApi(18)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap a(android.content.Context r5, android.graphics.Bitmap r6, int r7) throws android.renderscript.RSRuntimeException {
        /*
            r0 = 0
            android.renderscript.RenderScript r5 = android.renderscript.RenderScript.create(r5)     // Catch: java.lang.Throwable -> L4c
            android.renderscript.RenderScript$RSMessageHandler r1 = new android.renderscript.RenderScript$RSMessageHandler     // Catch: java.lang.Throwable -> L46
            r1.<init>()     // Catch: java.lang.Throwable -> L46
            r5.setMessageHandler(r1)     // Catch: java.lang.Throwable -> L46
            android.renderscript.Allocation$MipmapControl r1 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch: java.lang.Throwable -> L46
            r2 = 1
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r5, r6, r1, r2)     // Catch: java.lang.Throwable -> L46
            android.renderscript.Type r2 = r1.getType()     // Catch: java.lang.Throwable -> L43
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createTyped(r5, r2)     // Catch: java.lang.Throwable -> L43
            android.renderscript.Element r3 = android.renderscript.Element.U8_4(r5)     // Catch: java.lang.Throwable -> L3e
            android.renderscript.ScriptIntrinsicBlur r0 = android.renderscript.ScriptIntrinsicBlur.create(r5, r3)     // Catch: java.lang.Throwable -> L3e
            r0.setInput(r1)     // Catch: java.lang.Throwable -> L3e
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L3e
            r0.setRadius(r7)     // Catch: java.lang.Throwable -> L3e
            r0.forEach(r2)     // Catch: java.lang.Throwable -> L3e
            r2.copyTo(r6)     // Catch: java.lang.Throwable -> L3e
            r5.destroy()
            r1.destroy()
            r2.destroy()
            r0.destroy()
            return r6
        L3e:
            r6 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L50
        L43:
            r6 = move-exception
            r2 = r0
            goto L49
        L46:
            r6 = move-exception
            r1 = r0
            r2 = r1
        L49:
            r0 = r5
            r5 = r2
            goto L50
        L4c:
            r6 = move-exception
            r5 = r0
            r1 = r5
            r2 = r1
        L50:
            if (r0 == 0) goto L55
            r0.destroy()
        L55:
            if (r1 == 0) goto L5a
            r1.destroy()
        L5a:
            if (r2 == 0) goto L5f
            r2.destroy()
        L5f:
            if (r5 == 0) goto L64
            r5.destroy()
        L64:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.b.a(android.content.Context, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    public static Bitmap a(Bitmap bitmap, int i10, boolean z10) {
        int[] iArr;
        int i11 = i10;
        Bitmap copy = z10 ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        if (i11 < 1) {
            return null;
        }
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i12 = width * height;
        int[] iArr2 = new int[i12];
        copy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i13 = width - 1;
        int i14 = height - 1;
        int i15 = i11 + i11 + 1;
        int[] iArr3 = new int[i12];
        int[] iArr4 = new int[i12];
        int[] iArr5 = new int[i12];
        int[] iArr6 = new int[Math.max(width, height)];
        int i16 = (i15 + 1) >> 1;
        int i17 = i16 * i16;
        int i18 = i17 * 256;
        int[] iArr7 = new int[i18];
        for (int i19 = 0; i19 < i18; i19++) {
            iArr7[i19] = i19 / i17;
        }
        int[][] iArr8 = (int[][]) Array.newInstance(int.class, i15, 3);
        int i20 = i11 + 1;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (i21 < height) {
            Bitmap bitmap2 = copy;
            int i24 = height;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            int i32 = 0;
            int i33 = -i11;
            int i34 = 0;
            while (i33 <= i11) {
                int i35 = i14;
                int[] iArr9 = iArr6;
                int i36 = iArr2[i22 + Math.min(i13, Math.max(i33, 0))];
                int[] iArr10 = iArr8[i33 + i11];
                iArr10[0] = (i36 & 16711680) >> 16;
                iArr10[1] = (i36 & 65280) >> 8;
                iArr10[2] = i36 & 255;
                int abs = i20 - Math.abs(i33);
                i26 += iArr10[0] * abs;
                i25 += iArr10[1] * abs;
                i34 += iArr10[2] * abs;
                if (i33 > 0) {
                    i32 += iArr10[0];
                    i31 += iArr10[1];
                    i30 += iArr10[2];
                } else {
                    i29 += iArr10[0];
                    i28 += iArr10[1];
                    i27 += iArr10[2];
                }
                i33++;
                i14 = i35;
                iArr6 = iArr9;
            }
            int i37 = i14;
            int[] iArr11 = iArr6;
            int i38 = i11;
            int i39 = i34;
            int i40 = 0;
            while (i40 < width) {
                iArr3[i22] = iArr7[i26];
                iArr4[i22] = iArr7[i25];
                iArr5[i22] = iArr7[i39];
                int i41 = i26 - i29;
                int i42 = i25 - i28;
                int i43 = i39 - i27;
                int[] iArr12 = iArr8[((i38 - i11) + i15) % i15];
                int i44 = i29 - iArr12[0];
                int i45 = i28 - iArr12[1];
                int i46 = i27 - iArr12[2];
                if (i21 == 0) {
                    iArr = iArr7;
                    iArr11[i40] = Math.min(i40 + i11 + 1, i13);
                } else {
                    iArr = iArr7;
                }
                int i47 = iArr2[i23 + iArr11[i40]];
                iArr12[0] = (i47 & 16711680) >> 16;
                iArr12[1] = (i47 & 65280) >> 8;
                iArr12[2] = i47 & 255;
                int i48 = i32 + iArr12[0];
                int i49 = i31 + iArr12[1];
                int i50 = i30 + iArr12[2];
                i26 = i41 + i48;
                i25 = i42 + i49;
                i39 = i43 + i50;
                i38 = (i38 + 1) % i15;
                int[] iArr13 = iArr8[i38 % i15];
                i29 = i44 + iArr13[0];
                i28 = i45 + iArr13[1];
                i27 = i46 + iArr13[2];
                i32 = i48 - iArr13[0];
                i31 = i49 - iArr13[1];
                i30 = i50 - iArr13[2];
                i22++;
                i40++;
                iArr7 = iArr;
            }
            i23 += width;
            i21++;
            copy = bitmap2;
            height = i24;
            i14 = i37;
            iArr6 = iArr11;
        }
        Bitmap bitmap3 = copy;
        int i51 = i14;
        int[] iArr14 = iArr6;
        int i52 = height;
        int[] iArr15 = iArr7;
        int i53 = 0;
        while (i53 < width) {
            int i54 = -i11;
            int i55 = i15;
            int[] iArr16 = iArr2;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = i54;
            int i64 = i54 * width;
            int i65 = 0;
            int i66 = 0;
            while (i63 <= i11) {
                int i67 = width;
                int max = Math.max(0, i64) + i53;
                int[] iArr17 = iArr8[i63 + i11];
                iArr17[0] = iArr3[max];
                iArr17[1] = iArr4[max];
                iArr17[2] = iArr5[max];
                int abs2 = i20 - Math.abs(i63);
                i56 += iArr3[max] * abs2;
                i66 += iArr4[max] * abs2;
                i65 += iArr5[max] * abs2;
                if (i63 > 0) {
                    i60 += iArr17[0];
                    i61 += iArr17[1];
                    i62 += iArr17[2];
                } else {
                    i59 += iArr17[0];
                    i58 += iArr17[1];
                    i57 += iArr17[2];
                }
                int i68 = i51;
                if (i63 < i68) {
                    i64 += i67;
                }
                i63++;
                i51 = i68;
                width = i67;
            }
            int i69 = width;
            int i70 = i51;
            int i71 = i11;
            int i72 = i53;
            int i73 = i66;
            int i74 = i52;
            int i75 = i65;
            int i76 = 0;
            while (i76 < i74) {
                iArr16[i72] = (iArr16[i72] & (-16777216)) | (iArr15[i56] << 16) | (iArr15[i73] << 8) | iArr15[i75];
                int i77 = i56 - i59;
                int i78 = i73 - i58;
                int i79 = i75 - i57;
                int[] iArr18 = iArr8[((i71 - i11) + i55) % i55];
                int i80 = i59 - iArr18[0];
                int i81 = i58 - iArr18[1];
                int i82 = i57 - iArr18[2];
                if (i53 == 0) {
                    iArr14[i76] = Math.min(i76 + i20, i70) * i69;
                }
                int i83 = iArr14[i76] + i53;
                iArr18[0] = iArr3[i83];
                iArr18[1] = iArr4[i83];
                iArr18[2] = iArr5[i83];
                int i84 = i60 + iArr18[0];
                int i85 = i61 + iArr18[1];
                int i86 = i62 + iArr18[2];
                i56 = i77 + i84;
                i73 = i78 + i85;
                i75 = i79 + i86;
                i71 = (i71 + 1) % i55;
                int[] iArr19 = iArr8[i71];
                i59 = i80 + iArr19[0];
                i58 = i81 + iArr19[1];
                i57 = i82 + iArr19[2];
                i60 = i84 - iArr19[0];
                i61 = i85 - iArr19[1];
                i62 = i86 - iArr19[2];
                i72 += i69;
                i76++;
                i11 = i10;
            }
            i53++;
            i11 = i10;
            i51 = i70;
            i52 = i74;
            i15 = i55;
            iArr2 = iArr16;
            width = i69;
        }
        int i87 = width;
        bitmap3.setPixels(iArr2, 0, i87, 0, 0, i87, i52);
        return bitmap3;
    }
}
