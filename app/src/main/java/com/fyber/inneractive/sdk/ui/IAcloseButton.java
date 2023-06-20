package com.fyber.inneractive.sdk.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.fyber.inneractive.sdk.util.l;

/* loaded from: classes2.dex */
public class IAcloseButton extends View {

    /* renamed from: a  reason: collision with root package name */
    public Paint f20203a;

    /* renamed from: b  reason: collision with root package name */
    public Path f20204b;

    public IAcloseButton(Context context, int i10, boolean z10) {
        super(context);
        int b10 = l.b(10);
        int i11 = (z10 ? (i10 - (b10 * 2)) / 4 : 0) + b10;
        Point point = new Point(i11, i11);
        int i12 = i10 - i11;
        Point point2 = new Point(i11, i12);
        Point point3 = new Point(i12, i12);
        Point point4 = new Point(i12, i11);
        Path path = new Path();
        this.f20204b = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f20204b.moveTo(point.x, point.y);
        this.f20204b.lineTo(point3.x, point3.y);
        this.f20204b.moveTo(point2.x, point2.y);
        this.f20204b.lineTo(point4.x, point4.y);
        this.f20204b.close();
        Paint paint = new Paint(1);
        this.f20203a = paint;
        paint.setStrokeWidth(l.b(2));
        this.f20203a.setColor(-1);
        this.f20203a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f20203a.setAntiAlias(true);
        if (z10) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(-1436657061);
            gradientDrawable.setStroke(l.b(2), -1);
            l.a(this, gradientDrawable);
        }
        setPadding(b10, b10, b10, b10);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f20204b, this.f20203a);
    }
}
