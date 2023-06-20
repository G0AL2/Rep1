package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Mt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1113Mt extends View {
    public int A00;
    public Paint A01;
    public Paint A02;
    public Paint A03;
    public boolean A04;

    public C1113Mt(C1400Xy c1400Xy) {
        this(c1400Xy, 60, true);
    }

    public C1113Mt(C1400Xy c1400Xy, int i10, boolean z10) {
        super(c1400Xy);
        this.A00 = i10;
        this.A04 = z10;
        if (z10) {
            this.A02 = new Paint();
            this.A02.setColor(-3355444);
            this.A02.setStyle(Paint.Style.STROKE);
            this.A02.setStrokeWidth(3.0f);
            this.A02.setAntiAlias(true);
            this.A01 = new Paint();
            this.A01.setColor(-1287371708);
            this.A01.setStyle(Paint.Style.FILL);
            this.A01.setAntiAlias(true);
            this.A03 = new Paint();
            this.A03.setColor(-1);
            this.A03.setStyle(Paint.Style.STROKE);
            this.A03.setStrokeWidth(6.0f);
            this.A03.setAntiAlias(true);
        }
    }

    public RelativeLayout.LayoutParams getDefaultLayoutParams() {
        float f10 = Lr.A00;
        int i10 = this.A00;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (i10 * f10), (int) (i10 * f10));
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        return layoutParams;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A04) {
            if (canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT < 17) {
                setLayerType(1, null);
            }
            int min = Math.min(canvas.getWidth(), canvas.getHeight());
            int i10 = min / 2;
            int i11 = min / 2;
            int centerY = i10 * 2;
            int i12 = centerY / 3;
            canvas.drawCircle(i10, i11, i12, this.A02);
            int outerRadius = i12 - 2;
            canvas.drawCircle(i10, i11, outerRadius, this.A01);
            int i13 = min / 3;
            int innerRadius = min / 3;
            int startX = i13 * 2;
            float f10 = startX;
            int startX2 = innerRadius * 2;
            canvas.drawLine(i13, innerRadius, f10, startX2, this.A03);
            int startX3 = i13 * 2;
            int startX4 = innerRadius * 2;
            canvas.drawLine(startX3, innerRadius, i13, startX4, this.A03);
        }
        super.onDraw(canvas);
    }
}
