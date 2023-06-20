package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.widget.ImageView;
import java.util.Arrays;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.facebook.ads.redexgen.X.Pg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1178Pg extends ImageView {
    public static byte[] A03;
    public static final int A04;
    public final Paint A00;
    public final EnumC1176Pe A01;
    public final InterfaceC1177Pf A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{11, 47, 33, 40, 29, -40, 36, 29, 30, 44, 14, 50, 36, 43, 32, -37, 45, 36, 34, 35, 47};
    }

    static {
        A03();
        A04 = (int) (Lr.A00 * 4.0f);
    }

    public C1178Pg(C1400Xy c1400Xy, EnumC1176Pe enumC1176Pe, InterfaceC1177Pf interfaceC1177Pf) {
        super(c1400Xy);
        this.A01 = enumC1176Pe;
        this.A02 = interfaceC1177Pf;
        this.A00 = new Paint();
        this.A00.setColor(-1728053248);
        setColorFilter(-1);
        int i10 = A04;
        setPadding(i10, i10, i10, i10);
        boolean z10 = this.A01 == EnumC1176Pe.A03;
        setContentDescription(z10 ? A02(0, 10, 106) : A02(10, 11, 109));
        Bitmap A01 = C1095Mb.A01(EnumC1094Ma.TO_RIGHT_ARROW);
        if (z10) {
            Matrix matrix = new Matrix();
            matrix.postRotate(180.0f);
            A01 = Bitmap.createBitmap(A01, 0, 0, A01.getWidth(), A01.getHeight(), matrix, true);
        }
        setImageBitmap(A01);
        setOnClickListener(new View$OnClickListenerC1175Pd(this));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        canvas.drawCircle(width, height, Math.min(width, height), this.A00);
        super.onDraw(canvas);
    }
}
