package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.utils.v;

/* loaded from: classes.dex */
public class TTCornersWebView extends WebView {

    /* renamed from: a  reason: collision with root package name */
    private int f13030a;

    /* renamed from: b  reason: collision with root package name */
    private int f13031b;

    /* renamed from: c  reason: collision with root package name */
    private int f13032c;

    /* renamed from: d  reason: collision with root package name */
    private int f13033d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f13034e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f13035f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f13036g;

    public TTCornersWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13036g = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Paint paint = new Paint();
        this.f13034e = paint;
        paint.setColor(-1);
        this.f13034e.setAntiAlias(true);
        this.f13034e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Paint paint2 = new Paint();
        this.f13035f = paint2;
        paint2.setXfermode(null);
        this.f13035f.setAntiAlias(true);
        float b10 = v.b(context, 14.0f);
        a(b10, b10, 0.0f, 0.0f);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        this.f13032c = getScrollX();
        this.f13033d = getScrollY();
        Path path = new Path();
        int i10 = this.f13033d;
        path.addRoundRect(new RectF(0.0f, i10, this.f13032c + this.f13030a, i10 + this.f13031b), this.f13036g, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f13030a = getMeasuredWidth();
        this.f13031b = getMeasuredHeight();
    }

    public TTCornersWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13036g = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        a(context, attributeSet);
    }

    public void a(float f10, float f11, float f12, float f13) {
        float[] fArr = this.f13036g;
        fArr[0] = f10;
        fArr[1] = f10;
        fArr[2] = f11;
        fArr[3] = f11;
        fArr[4] = f12;
        fArr[5] = f12;
        fArr[6] = f13;
        fArr[7] = f13;
    }
}
