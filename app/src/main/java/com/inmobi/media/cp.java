package com.inmobi.media;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* compiled from: CustomView.java */
/* loaded from: classes3.dex */
public class cp extends View {

    /* renamed from: a  reason: collision with root package name */
    private static final String f24950a = cp.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private float f24951b;

    /* renamed from: c  reason: collision with root package name */
    private float f24952c;

    /* renamed from: d  reason: collision with root package name */
    private float f24953d;

    /* renamed from: e  reason: collision with root package name */
    private float f24954e;

    /* renamed from: f  reason: collision with root package name */
    private float f24955f;

    /* renamed from: g  reason: collision with root package name */
    private byte f24956g;

    /* renamed from: h  reason: collision with root package name */
    private int f24957h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f24958i;

    /* renamed from: j  reason: collision with root package name */
    private Path f24959j;

    /* renamed from: k  reason: collision with root package name */
    private RectF f24960k;

    private cp(Context context) {
        super(context);
    }

    private void a(Canvas canvas) {
        float f10 = this.f24951b;
        this.f24954e = ((30.0f * f10) / 2.0f) - (f10 * 5.0f);
        this.f24952c = f10 * 5.0f;
        this.f24953d = f10 * 5.0f;
        this.f24958i.setStyle(Paint.Style.FILL);
        this.f24958i.setColor(-1);
        this.f24958i.setStrokeWidth(4.0f);
        this.f24958i.setAntiAlias(true);
        Path path = this.f24959j;
        float f11 = this.f24954e;
        path.moveTo(f11 - this.f24952c, f11 - this.f24953d);
        Path path2 = this.f24959j;
        float f12 = this.f24954e;
        path2.lineTo(f12, f12 - this.f24953d);
        Path path3 = this.f24959j;
        float f13 = this.f24954e;
        float f14 = this.f24951b;
        path3.lineTo((f14 * 6.0f) + f13, (f13 - this.f24953d) - (f14 * 4.0f));
        Path path4 = this.f24959j;
        float f15 = this.f24954e;
        float f16 = this.f24951b;
        path4.lineTo((6.0f * f16) + f15, f15 + this.f24953d + (f16 * 4.0f));
        Path path5 = this.f24959j;
        float f17 = this.f24954e;
        path5.lineTo(f17, this.f24953d + f17);
        Path path6 = this.f24959j;
        float f18 = this.f24954e;
        path6.lineTo(f18 - this.f24952c, f18 + this.f24953d);
        Path path7 = this.f24959j;
        float f19 = this.f24954e;
        path7.lineTo(f19 - this.f24952c, f19 - this.f24953d);
        canvas.drawPath(this.f24959j, this.f24958i);
    }

    private void b(Canvas canvas) {
        float f10 = this.f24951b;
        this.f24955f = 25.0f * f10;
        this.f24954e = f10 * 30.0f;
        this.f24958i.setAntiAlias(true);
        this.f24958i.setColor(-1);
        this.f24958i.setStrokeWidth(7.0f);
        this.f24958i.setStyle(Paint.Style.STROKE);
        float f11 = this.f24954e;
        canvas.drawCircle(f11, f11, this.f24955f, this.f24958i);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f24958i.reset();
        switch (this.f24956g) {
            case 0:
                float f10 = this.f24951b;
                float f11 = (50.0f * f10) / 2.0f;
                float f12 = (f10 * 30.0f) / 2.0f;
                float f13 = f12 / 3.0f;
                float f14 = f11 - f13;
                float f15 = f11 + f13;
                this.f24958i.setAntiAlias(true);
                this.f24958i.setColor(-16777216);
                this.f24958i.setStrokeWidth(3.0f);
                this.f24958i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas.drawCircle(f11, f11, f12, this.f24958i);
                this.f24958i.setColor(-1);
                this.f24958i.setStyle(Paint.Style.STROKE);
                canvas.drawLine(f14, f14, f15, f15, this.f24958i);
                canvas.drawLine(f14, f15, f15, f14, this.f24958i);
                canvas.drawCircle(f11, f11, f12, this.f24958i);
                return;
            case 1:
                float f16 = (this.f24951b * 50.0f) / 2.0f;
                this.f24958i.setAntiAlias(true);
                this.f24958i.setColor(0);
                this.f24958i.setStrokeWidth(3.0f);
                this.f24958i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas.drawCircle(f16, f16, f16, this.f24958i);
                return;
            case 2:
                this.f24958i.setAntiAlias(true);
                this.f24958i.setColor(-1);
                this.f24958i.setStrokeWidth(5.0f);
                this.f24958i.setStyle(Paint.Style.STROKE);
                canvas.drawLine((getWidth() / 2) - ((this.f24957h * this.f24951b) / 2.0f), (getHeight() / 2) - ((this.f24957h * this.f24951b) / 2.0f), ((this.f24957h * this.f24951b) / 2.0f) + (getWidth() / 2), ((this.f24957h * this.f24951b) / 2.0f) + (getHeight() / 2), this.f24958i);
                canvas.drawLine((getWidth() / 2) - ((this.f24957h * this.f24951b) / 2.0f), ((this.f24957h * this.f24951b) / 2.0f) + (getHeight() / 2), ((this.f24957h * this.f24951b) / 2.0f) + (getWidth() / 2), (getHeight() / 2) - ((this.f24957h * this.f24951b) / 2.0f), this.f24958i);
                return;
            case 3:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f17 = (this.f24951b * 30.0f) / 2.0f;
                this.f24959j.reset();
                this.f24958i.setAntiAlias(true);
                this.f24958i.setColor(-16777216);
                this.f24958i.setStrokeWidth(3.0f);
                this.f24958i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas.drawCircle(width, height, f17, this.f24958i);
                this.f24958i.setColor(-1);
                this.f24958i.setStyle(Paint.Style.STROKE);
                canvas.drawCircle(width, height, f17, this.f24958i);
                this.f24960k.set((getWidth() / 2) - ((this.f24957h * this.f24951b) / 2.0f), (getHeight() / 2) - ((this.f24957h * this.f24951b) / 2.0f), (getWidth() / 2) + ((this.f24957h * this.f24951b) / 2.0f), (getHeight() / 2) + ((this.f24957h * this.f24951b) / 2.0f));
                canvas.drawArc(this.f24960k, 0.0f, 270.0f, false, this.f24958i);
                this.f24959j.setFillType(Path.FillType.EVEN_ODD);
                this.f24959j.moveTo((getWidth() / 2) + ((this.f24957h * this.f24951b) / 2.0f), (getHeight() / 2) - (this.f24951b * 2.0f));
                Path path = this.f24959j;
                float f18 = this.f24951b;
                path.lineTo(((getWidth() / 2) + ((this.f24957h * f18) / 2.0f)) - (f18 * 2.0f), getHeight() / 2);
                Path path2 = this.f24959j;
                float f19 = this.f24951b;
                path2.lineTo((getWidth() / 2) + ((this.f24957h * f19) / 2.0f) + (f19 * 2.0f), getHeight() / 2);
                this.f24959j.lineTo((getWidth() / 2) + ((this.f24957h * this.f24951b) / 2.0f), (getHeight() / 2) - (this.f24951b * 2.0f));
                this.f24959j.close();
                this.f24958i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas.drawPath(this.f24959j, this.f24958i);
                return;
            case 4:
                this.f24959j.reset();
                this.f24959j.setFillType(Path.FillType.EVEN_ODD);
                this.f24959j.moveTo((getWidth() / 2) - ((this.f24957h * this.f24951b) / 2.0f), getHeight() / 2);
                this.f24959j.lineTo((getWidth() / 2) + ((this.f24957h * this.f24951b) / 2.0f), (getHeight() / 2) - ((this.f24957h * this.f24951b) / 2.0f));
                this.f24959j.lineTo((getWidth() / 2) + ((this.f24957h * this.f24951b) / 2.0f), (getHeight() / 2) + ((this.f24957h * this.f24951b) / 2.0f));
                this.f24959j.lineTo((getWidth() / 2) - ((this.f24957h * this.f24951b) / 2.0f), getHeight() / 2);
                this.f24959j.close();
                this.f24958i.setAntiAlias(true);
                this.f24958i.setColor(-16777216);
                this.f24958i.setStrokeWidth(3.0f);
                this.f24958i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas.drawPath(this.f24959j, this.f24958i);
                return;
            case 5:
                this.f24959j.reset();
                this.f24959j.setFillType(Path.FillType.EVEN_ODD);
                this.f24959j.moveTo((getWidth() / 2) - ((this.f24957h * this.f24951b) / 2.0f), (getHeight() / 2) - ((this.f24957h * this.f24951b) / 2.0f));
                this.f24959j.lineTo((getWidth() / 2) + ((this.f24957h * this.f24951b) / 2.0f), getHeight() / 2);
                this.f24959j.lineTo((getWidth() / 2) - ((this.f24957h * this.f24951b) / 2.0f), (getHeight() / 2) + ((this.f24957h * this.f24951b) / 2.0f));
                this.f24959j.lineTo((getWidth() / 2) - ((this.f24957h * this.f24951b) / 2.0f), (getHeight() / 2) - ((this.f24957h * this.f24951b) / 2.0f));
                this.f24959j.close();
                this.f24958i.setAntiAlias(true);
                this.f24958i.setColor(-16777216);
                this.f24958i.setStrokeWidth(3.0f);
                this.f24958i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas.drawPath(this.f24959j, this.f24958i);
                return;
            case 6:
                this.f24959j.reset();
                this.f24959j.setFillType(Path.FillType.EVEN_ODD);
                this.f24959j.moveTo((getWidth() / 2) - ((this.f24957h * this.f24951b) / 2.0f), (getHeight() / 2) - ((this.f24957h * this.f24951b) / 2.0f));
                this.f24959j.lineTo((getWidth() / 2) + ((this.f24957h * this.f24951b) / 2.0f), getHeight() / 2);
                this.f24959j.lineTo((getWidth() / 2) - ((this.f24957h * this.f24951b) / 2.0f), (getHeight() / 2) + ((this.f24957h * this.f24951b) / 2.0f));
                this.f24959j.lineTo((getWidth() / 2) - ((this.f24957h * this.f24951b) / 2.0f), (getHeight() / 2) - ((this.f24957h * this.f24951b) / 2.0f));
                this.f24959j.close();
                this.f24958i.setAntiAlias(true);
                this.f24958i.setColor(-12303292);
                this.f24958i.setStrokeWidth(3.0f);
                this.f24958i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas.drawPath(this.f24959j, this.f24958i);
                return;
            case 7:
                b(canvas);
                float f20 = this.f24955f;
                this.f24952c = f20 / 3.0f;
                this.f24953d = f20 / 3.0f;
                this.f24958i.setStyle(Paint.Style.FILL);
                Path path3 = this.f24959j;
                float f21 = this.f24954e;
                path3.moveTo(this.f24952c + f21, f21);
                Path path4 = this.f24959j;
                float f22 = this.f24954e;
                path4.lineTo(f22 - this.f24952c, f22 - this.f24953d);
                Path path5 = this.f24959j;
                float f23 = this.f24954e;
                path5.lineTo(f23 - this.f24952c, f23 + this.f24953d);
                Path path6 = this.f24959j;
                float f24 = this.f24954e;
                path6.lineTo(this.f24952c + f24, f24);
                canvas.drawPath(this.f24959j, this.f24958i);
                return;
            case 8:
                b(canvas);
                float f25 = this.f24955f;
                float f26 = f25 / 4.0f;
                this.f24952c = f26;
                float f27 = f25 / 3.0f;
                this.f24953d = f27;
                float f28 = this.f24954e;
                canvas.drawLine(f28 - f26, f28 - f27, f28 - f26, f28 + f27, this.f24958i);
                float f29 = this.f24954e;
                float f30 = this.f24952c;
                float f31 = this.f24953d;
                canvas.drawLine(f29 + f30, f29 - f31, f29 + f30, f29 + f31, this.f24958i);
                return;
            case 9:
                a(canvas);
                float f32 = this.f24954e;
                float f33 = this.f24951b;
                float f34 = this.f24953d;
                RectF rectF = new RectF(f32 - (f33 * 10.0f), (f32 - f34) - (f33 * 2.0f), (14.0f * f33) + f32, f32 + f34 + (f33 * 2.0f));
                float f35 = this.f24954e;
                float f36 = this.f24951b;
                float f37 = this.f24953d;
                RectF rectF2 = new RectF(f35 - (10.0f * f36), (f35 - f37) - (f36 * 4.0f), (18.0f * f36) + f35, f35 + f37 + (f36 * 4.0f));
                this.f24958i.setColor(-1);
                this.f24958i.setStrokeWidth(4.0f);
                this.f24958i.setStyle(Paint.Style.STROKE);
                canvas.drawArc(rectF, -45.0f, 90.0f, false, this.f24958i);
                canvas.drawArc(rectF2, -45.0f, 90.0f, false, this.f24958i);
                canvas.drawPath(this.f24959j, this.f24958i);
                canvas.drawPath(this.f24959j, this.f24958i);
                return;
            case 10:
            default:
                return;
            case 11:
                a(canvas);
                this.f24958i.setColor(-1);
                this.f24958i.setStrokeWidth(4.0f);
                this.f24958i.setStyle(Paint.Style.STROKE);
                Path path7 = this.f24959j;
                float f38 = this.f24954e;
                path7.moveTo((this.f24951b * 10.0f) + f38, f38 - this.f24953d);
                Path path8 = this.f24959j;
                float f39 = this.f24954e;
                path8.lineTo((this.f24951b * 18.0f) + f39, f39 + this.f24953d);
                Path path9 = this.f24959j;
                float f40 = this.f24954e;
                path9.moveTo((this.f24951b * 18.0f) + f40, f40 - this.f24953d);
                Path path10 = this.f24959j;
                float f41 = this.f24954e;
                path10.lineTo((this.f24951b * 10.0f) + f41, f41 + this.f24953d);
                canvas.drawPath(this.f24959j, this.f24958i);
                return;
            case 12:
                float f42 = this.f24951b;
                this.f24954e = (50.0f * f42) / 2.0f;
                this.f24952c = f42 * 3.0f;
                this.f24953d = f42 * 3.0f;
                this.f24958i.setStyle(Paint.Style.STROKE);
                this.f24958i.setStrokeWidth(4.0f);
                this.f24958i.setColor(-1);
                Path path11 = this.f24959j;
                float f43 = this.f24954e;
                path11.moveTo(f43 - this.f24952c, (f43 - this.f24953d) - (this.f24951b * 5.0f));
                Path path12 = this.f24959j;
                float f44 = this.f24954e;
                path12.lineTo(f44 - this.f24952c, f44 - this.f24953d);
                Path path13 = this.f24959j;
                float f45 = this.f24954e;
                path13.lineTo((f45 - this.f24952c) - (this.f24951b * 5.0f), f45 - this.f24953d);
                Path path14 = this.f24959j;
                float f46 = this.f24954e;
                path14.moveTo(this.f24952c + f46, (f46 - this.f24953d) - (this.f24951b * 5.0f));
                Path path15 = this.f24959j;
                float f47 = this.f24954e;
                path15.lineTo(this.f24952c + f47, f47 - this.f24953d);
                Path path16 = this.f24959j;
                float f48 = this.f24954e;
                path16.lineTo(this.f24952c + f48 + (this.f24951b * 5.0f), f48 - this.f24953d);
                Path path17 = this.f24959j;
                float f49 = this.f24954e;
                path17.moveTo(f49 - this.f24952c, f49 + this.f24953d + (this.f24951b * 5.0f));
                Path path18 = this.f24959j;
                float f50 = this.f24954e;
                path18.lineTo(f50 - this.f24952c, f50 + this.f24953d);
                Path path19 = this.f24959j;
                float f51 = this.f24954e;
                path19.lineTo((f51 - this.f24952c) - (this.f24951b * 5.0f), f51 + this.f24953d);
                Path path20 = this.f24959j;
                float f52 = this.f24954e;
                path20.moveTo(this.f24952c + f52, f52 + this.f24953d + (this.f24951b * 5.0f));
                Path path21 = this.f24959j;
                float f53 = this.f24954e;
                path21.lineTo(this.f24952c + f53, f53 + this.f24953d);
                Path path22 = this.f24959j;
                float f54 = this.f24954e;
                path22.lineTo(this.f24952c + f54 + (this.f24951b * 5.0f), f54 + this.f24953d);
                canvas.drawPath(this.f24959j, this.f24958i);
                return;
        }
    }

    public cp(Context context, float f10, byte b10) {
        this(context);
        this.f24956g = b10;
        this.f24951b = f10;
        this.f24957h = 15;
        this.f24958i = new Paint(1);
        this.f24960k = new RectF();
        this.f24959j = new Path();
    }
}
