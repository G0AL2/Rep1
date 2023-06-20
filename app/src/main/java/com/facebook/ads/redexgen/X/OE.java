package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class OE extends Drawable {
    public static byte[] A0G;
    public static String[] A0H = {"Mp", "s1okci9AACeOEsTaqEhejkWwVhqIiyNU", "empHZDdin7c86b5ED3ajK85vhcLRVQYd", "QRrQz6m9v7aBhecCWxUXgpf0lUmjJya0", "Hctlswo9ad12sYru2lKVThOw6NzJy2jW", "0MQcFv6TsH62DS4QTRzsSvzajYizZeJ9", "0Y", "3fR7fZsYHtoPr7aoRN1kO3di1PlcoJD4"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public String A04;
    public String A05;
    @Nullable
    public String A06;
    @Nullable
    public WeakReference<C1220Qw> A07;
    public boolean A08;
    public final Paint A09 = new Paint();
    public final Paint A0A = new Paint();
    public final Path A0C = new Path();
    public final TextPaint A0E = new TextPaint();
    public final Paint A0B = new Paint();
    public final Handler A0D = new Handler();
    public final Runnable A0F = new T4(this);

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 62);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0G = new byte[]{65, 73, 21, 42, 38, 52, 121, 99, 24, 87, 94, 24, 81, 93, 49, 18, 28, 25, 24, 25, 93, 117, 109, 114, 114, 109, 115, 55, 21, 6, 16, 84, 86, 113, 118, 107, 118, 126, 115, 118, 101, 118, 113, 120, 49, 49, 49, 60, 11, 4, 79, 68, Byte.MAX_VALUE, 122, Byte.MAX_VALUE, 126, 102, Byte.MAX_VALUE, 108, 83, 95, 77, 91, 88, 83, 86, 83, 78, 67, 26, 121, 82, 95, 89, 81, 95, 72, 26, 84, 85, 78, 26, 73, 95, 78, 32, 104, 48, 125, 51, 96, 33, 39, 47};
    }

    static {
        A04();
    }

    public OE() {
        this.A09.setColor(Color.argb(127, 36, 36, 36));
        this.A09.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A0A.setAntiAlias(true);
        this.A0A.setColor(Color.argb(191, 0, 255, 0));
        this.A0A.setStrokeWidth(20.0f);
        this.A0A.setStyle(Paint.Style.STROKE);
        this.A0E.setAntiAlias(true);
        this.A0E.setColor(-1);
        this.A0E.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A0E.setTextSize(30.0f);
        this.A0B.setColor(Color.argb(212, 0, 0, 0));
        this.A0B.setStyle(Paint.Style.FILL_AND_STROKE);
        A07();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.A00;
        String A02 = A02(0, 1, 117);
        if (i10 <= 0) {
            if (!TextUtils.isEmpty(this.A06)) {
                sb2.append(this.A06);
                sb2.append(A02);
            }
            if (!TextUtils.isEmpty(this.A04)) {
                sb2.append(this.A04);
                sb2.append(A02);
            }
            sb2.append(A02(47, 4, 81));
            sb2.append(A02(21, 6, 125));
            sb2.append(A02(12, 9, 67));
            if (this.A03 > 0) {
                long max = Math.max(0L, System.currentTimeMillis() - this.A03);
                int i11 = (int) (max / 3600000);
                long j10 = max % 3600000;
                int i12 = (int) (j10 / 60000);
                int i13 = (int) ((j10 % 60000) / 1000);
                if (i11 > 0) {
                    sb2.append(i11);
                    sb2.append(A02(85, 2, 118));
                }
                if (i11 > 0 || i12 > 0) {
                    sb2.append(i12);
                    sb2.append(A02(87, 2, 99));
                }
                sb2.append(i13);
                sb2.append(A02(89, 5, 126));
            } else {
                String[] strArr = A0H;
                if (strArr[3].charAt(18) == strArr[1].charAt(18)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0H;
                strArr2[4] = "KaVl90AUCQiyYrscuVoIg37eW2R2JvQo";
                strArr2[2] = "0pxfQADbA4sIF5gDourAGVlubWCldmoZ";
                sb2.append(A02(51, 7, 47));
            }
        } else {
            sb2.append(A02(27, 5, 74));
            sb2.append(this.A01 + 1);
            sb2.append(A02(8, 4, 6));
            sb2.append(this.A00);
        }
        sb2.append(A02(1, 7, 125));
        WeakReference<C1220Qw> weakReference = this.A07;
        if (weakReference == null || weakReference.get() == null) {
            sb2.append(A02(58, 27, 4));
        } else {
            sb2.append(this.A07.get().A0R());
        }
        this.A05 = sb2.toString();
        float f10 = -2.1474836E9f;
        String[] split = this.A05.split(A02);
        for (String str : split) {
            float maxWidth = this.A0E.measureText(str, 0, str.length());
            f10 = Math.max(f10, maxWidth);
        }
        float maxWidth2 = 0.5f + f10;
        this.A02 = (int) maxWidth2;
        invalidateSelf();
    }

    public final void A07() {
        this.A00 = 0;
        this.A01 = -1;
        this.A05 = A02(32, 15, 33);
        this.A02 = 100;
        this.A06 = null;
        this.A03 = -1L;
        this.A07 = null;
        A0D(false);
    }

    public final void A08(int i10, int i11) {
        this.A00 = i10;
        this.A01 = i11;
        A03();
    }

    public final void A09(long j10) {
        this.A03 = j10;
        A03();
    }

    public final void A0A(C1220Qw c1220Qw) {
        this.A07 = new WeakReference<>(c1220Qw);
        A03();
    }

    public final void A0B(String str) {
        this.A04 = str;
        A03();
    }

    public final void A0C(String str) {
        this.A06 = str;
        A03();
    }

    public final void A0D(boolean z10) {
        this.A08 = z10;
        if (this.A08) {
            this.A0D.post(this.A0F);
        } else {
            this.A0D.removeCallbacks(this.A0F);
        }
        invalidateSelf();
    }

    public final boolean A0E() {
        return this.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!this.A08) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        canvas.drawRect(0.0f, 0.0f, width, height, this.A09);
        StaticLayout staticLayout = new StaticLayout(this.A05, this.A0E, this.A02, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        float canvasMiddleX = width / 2.0f;
        float f10 = height / 2.0f;
        float width2 = staticLayout.getWidth() / 2.0f;
        float height2 = staticLayout.getHeight() / 2.0f;
        canvas.drawRect((canvasMiddleX - width2) - 40.0f, (f10 - height2) - 40.0f, canvasMiddleX + width2 + 40.0f, f10 + height2 + 40.0f, this.A0B);
        canvas.save();
        canvas.translate(canvasMiddleX - width2, f10 - height2);
        staticLayout.draw(canvas);
        canvas.restore();
        this.A0C.reset();
        this.A0C.moveTo(0.0f, 0.0f);
        this.A0C.lineTo(width, 0.0f);
        this.A0C.lineTo(width, height);
        this.A0C.lineTo(0.0f, height);
        this.A0C.lineTo(0.0f, 0.0f);
        canvas.drawPath(this.A0C, this.A0A);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(@IntRange(from = 0, to = 255) int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
